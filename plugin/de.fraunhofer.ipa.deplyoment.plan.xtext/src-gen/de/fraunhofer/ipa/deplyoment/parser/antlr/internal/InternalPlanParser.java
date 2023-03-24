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
import de.fraunhofer.ipa.deplyoment.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExecutionConfiguration", "ProcessorArchitecture", "SoftwareComponent", "DeploymentPlan", "HumbleROSDistro", "NoeticROSDistro", "AttributeKind", "SelectionKind", "StartCommand", "Description", "MaximumKind", "MinimumKind", "Assignment", "ExecutedBy", "Middleware", "RangeKind", "DeployTo", "Ethernet", "X86_64", "Value", "Arm64", "Linux", "MacOS", "From", "Kind", "Name", "Wlan", "To", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=39;
    public static final int DeployTo=20;
    public static final int RULE_DATE_TIME=44;
    public static final int RULE_BOOLEAN=36;
    public static final int AttributeKind=10;
    public static final int RULE_YEAR=41;
    public static final int Name=29;
    public static final int RULE_MIN_SEC=43;
    public static final int Assignment=16;
    public static final int Kind=28;
    public static final int To=31;
    public static final int ExecutedBy=17;
    public static final int X86_64=22;
    public static final int RULE_DEDENT=47;
    public static final int RULE_ID=48;
    public static final int RULE_DIGIT=34;
    public static final int Middleware=18;
    public static final int SelectionKind=11;
    public static final int Arm64=24;
    public static final int Linux=25;
    public static final int RULE_INT=49;
    public static final int Ethernet=21;
    public static final int Value=23;
    public static final int RULE_ML_COMMENT=51;
    public static final int MacOS=26;
    public static final int SoftwareComponent=6;
    public static final int Description=13;
    public static final int StartCommand=12;
    public static final int ProcessorArchitecture=5;
    public static final int RULE_STRING=50;
    public static final int Wlan=30;
    public static final int RULE_SL_COMMENT=45;
    public static final int HyphenMinus=32;
    public static final int RULE_DOUBLE=38;
    public static final int Colon=33;
    public static final int RULE_DECINT=37;
    public static final int DeploymentPlan=7;
    public static final int MinimumKind=15;
    public static final int EOF=-1;
    public static final int RULE_INDENT=46;
    public static final int RULE_HOUR=42;
    public static final int RULE_WS=52;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=14;
    public static final int From=27;
    public static final int RULE_ANY_OTHER=53;
    public static final int RangeKind=19;
    public static final int NoeticROSDistro=9;
    public static final int HumbleROSDistro=8;
    public static final int RULE_MONTH=40;
    public static final int RULE_BINARY=35;

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
            return "Plan";
        }

        @Override
        protected PlanGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRulePlan"
    // InternalPlanParser.g:57:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // InternalPlanParser.g:57:45: (iv_rulePlan= rulePlan EOF )
            // InternalPlanParser.g:58:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule());
            pushFollow(FOLLOW_1);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan;
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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // InternalPlanParser.g:64:1: rulePlan returns [EObject current=null] : ( () ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) ) ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        EObject lv_plan_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:70:2: ( ( () ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) ) ) )
            // InternalPlanParser.g:71:2: ( () ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) ) )
            {
            // InternalPlanParser.g:71:2: ( () ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) ) )
            // InternalPlanParser.g:72:3: () ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) )
            {
            // InternalPlanParser.g:72:3: ()
            // InternalPlanParser.g:73:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getPlanAccess().getPlanAction_0(),
                                current);


            }

            // InternalPlanParser.g:79:3: ( (lv_plan_1_0= ruleAbstractDeploymentPlan ) )
            // InternalPlanParser.g:80:4: (lv_plan_1_0= ruleAbstractDeploymentPlan )
            {
            // InternalPlanParser.g:80:4: (lv_plan_1_0= ruleAbstractDeploymentPlan )
            // InternalPlanParser.g:81:5: lv_plan_1_0= ruleAbstractDeploymentPlan
            {

                                newCompositeNode(grammarAccess.getPlanAccess().getPlanAbstractDeploymentPlanParserRuleCall_1_0());

            pushFollow(FOLLOW_2);
            lv_plan_1_0=ruleAbstractDeploymentPlan();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPlanRule());
                                }
                                set(
                                    current,
                                    "plan",
                                    lv_plan_1_0,
                                    "de.fraunhofer.ipa.deplyoment.Plan.AbstractDeploymentPlan");
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
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleAbstractDeploymentPlan"
    // InternalPlanParser.g:102:1: entryRuleAbstractDeploymentPlan returns [EObject current=null] : iv_ruleAbstractDeploymentPlan= ruleAbstractDeploymentPlan EOF ;
    public final EObject entryRuleAbstractDeploymentPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeploymentPlan = null;


        try {
            // InternalPlanParser.g:102:63: (iv_ruleAbstractDeploymentPlan= ruleAbstractDeploymentPlan EOF )
            // InternalPlanParser.g:103:2: iv_ruleAbstractDeploymentPlan= ruleAbstractDeploymentPlan EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeploymentPlanRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDeploymentPlan=ruleAbstractDeploymentPlan();

            state._fsp--;

             current =iv_ruleAbstractDeploymentPlan;
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
    // $ANTLR end "entryRuleAbstractDeploymentPlan"


    // $ANTLR start "ruleAbstractDeploymentPlan"
    // InternalPlanParser.g:109:1: ruleAbstractDeploymentPlan returns [EObject current=null] : this_DeploymentPlan_0= ruleDeploymentPlan ;
    public final EObject ruleAbstractDeploymentPlan() throws RecognitionException {
        EObject current = null;

        EObject this_DeploymentPlan_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:115:2: (this_DeploymentPlan_0= ruleDeploymentPlan )
            // InternalPlanParser.g:116:2: this_DeploymentPlan_0= ruleDeploymentPlan
            {

                    newCompositeNode(grammarAccess.getAbstractDeploymentPlanAccess().getDeploymentPlanParserRuleCall());

            pushFollow(FOLLOW_2);
            this_DeploymentPlan_0=ruleDeploymentPlan();

            state._fsp--;


                    current = this_DeploymentPlan_0;
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
    // $ANTLR end "ruleAbstractDeploymentPlan"


    // $ANTLR start "entryRuleDeploymentPlan"
    // InternalPlanParser.g:127:1: entryRuleDeploymentPlan returns [EObject current=null] : iv_ruleDeploymentPlan= ruleDeploymentPlan EOF ;
    public final EObject entryRuleDeploymentPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentPlan = null;


        try {
            // InternalPlanParser.g:127:55: (iv_ruleDeploymentPlan= ruleDeploymentPlan EOF )
            // InternalPlanParser.g:128:2: iv_ruleDeploymentPlan= ruleDeploymentPlan EOF
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
    // InternalPlanParser.g:134:1: ruleDeploymentPlan returns [EObject current=null] : (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) ;
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
            // InternalPlanParser.g:140:2: ( (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) )
            // InternalPlanParser.g:141:2: (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            {
            // InternalPlanParser.g:141:2: (otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            // InternalPlanParser.g:142:3: otherlv_0= DeploymentPlan this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeploymentPlan,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeploymentPlanAccess().getDeploymentPlanKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeploymentPlanAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getDeploymentPlanAccess().getNameKeyword_2());

            // InternalPlanParser.g:154:3: ( (lv_name_3_0= ruleEString ) )
            // InternalPlanParser.g:155:4: (lv_name_3_0= ruleEString )
            {
            // InternalPlanParser.g:155:4: (lv_name_3_0= ruleEString )
            // InternalPlanParser.g:156:5: lv_name_3_0= ruleEString
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

            // InternalPlanParser.g:177:3: ( ( ruleEString ) )
            // InternalPlanParser.g:178:4: ( ruleEString )
            {
            // InternalPlanParser.g:178:4: ( ruleEString )
            // InternalPlanParser.g:179:5: ruleEString
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

            // InternalPlanParser.g:193:3: ( (lv_realize_6_0= ruleAbstractRealization ) )
            // InternalPlanParser.g:194:4: (lv_realize_6_0= ruleAbstractRealization )
            {
            // InternalPlanParser.g:194:4: (lv_realize_6_0= ruleAbstractRealization )
            // InternalPlanParser.g:195:5: lv_realize_6_0= ruleAbstractRealization
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
    // InternalPlanParser.g:220:1: entryRuleAbstractComputationAssignment returns [EObject current=null] : iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF ;
    public final EObject entryRuleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationAssignment = null;


        try {
            // InternalPlanParser.g:220:70: (iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF )
            // InternalPlanParser.g:221:2: iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF
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
    // InternalPlanParser.g:227:1: ruleAbstractComputationAssignment returns [EObject current=null] : this_ImplementationAssignment_0= ruleImplementationAssignment ;
    public final EObject ruleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_ImplementationAssignment_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:233:2: (this_ImplementationAssignment_0= ruleImplementationAssignment )
            // InternalPlanParser.g:234:2: this_ImplementationAssignment_0= ruleImplementationAssignment
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
    // InternalPlanParser.g:245:1: entryRuleAbstractRealization returns [EObject current=null] : iv_ruleAbstractRealization= ruleAbstractRealization EOF ;
    public final EObject entryRuleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRealization = null;


        try {
            // InternalPlanParser.g:245:60: (iv_ruleAbstractRealization= ruleAbstractRealization EOF )
            // InternalPlanParser.g:246:2: iv_ruleAbstractRealization= ruleAbstractRealization EOF
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
    // InternalPlanParser.g:252:1: ruleAbstractRealization returns [EObject current=null] : this_Realization_0= ruleRealization ;
    public final EObject ruleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject this_Realization_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:258:2: (this_Realization_0= ruleRealization )
            // InternalPlanParser.g:259:2: this_Realization_0= ruleRealization
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


    // $ANTLR start "entryRuleMiddleware"
    // InternalPlanParser.g:270:1: entryRuleMiddleware returns [EObject current=null] : iv_ruleMiddleware= ruleMiddleware EOF ;
    public final EObject entryRuleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleware = null;


        try {
            // InternalPlanParser.g:270:51: (iv_ruleMiddleware= ruleMiddleware EOF )
            // InternalPlanParser.g:271:2: iv_ruleMiddleware= ruleMiddleware EOF
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
    // InternalPlanParser.g:277:1: ruleMiddleware returns [EObject current=null] : (this_HumbleROSDistro_0= ruleHumbleROSDistro | this_NoeticROSDistro_1= ruleNoeticROSDistro ) ;
    public final EObject ruleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_HumbleROSDistro_0 = null;

        EObject this_NoeticROSDistro_1 = null;



            enterRule();

        try {
            // InternalPlanParser.g:283:2: ( (this_HumbleROSDistro_0= ruleHumbleROSDistro | this_NoeticROSDistro_1= ruleNoeticROSDistro ) )
            // InternalPlanParser.g:284:2: (this_HumbleROSDistro_0= ruleHumbleROSDistro | this_NoeticROSDistro_1= ruleNoeticROSDistro )
            {
            // InternalPlanParser.g:284:2: (this_HumbleROSDistro_0= ruleHumbleROSDistro | this_NoeticROSDistro_1= ruleNoeticROSDistro )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==HumbleROSDistro) ) {
                alt1=1;
            }
            else if ( (LA1_0==NoeticROSDistro) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlanParser.g:285:3: this_HumbleROSDistro_0= ruleHumbleROSDistro
                    {

                                newCompositeNode(grammarAccess.getMiddlewareAccess().getHumbleROSDistroParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_HumbleROSDistro_0=ruleHumbleROSDistro();

                    state._fsp--;


                                current = this_HumbleROSDistro_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:294:3: this_NoeticROSDistro_1= ruleNoeticROSDistro
                    {

                                newCompositeNode(grammarAccess.getMiddlewareAccess().getNoeticROSDistroParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_NoeticROSDistro_1=ruleNoeticROSDistro();

                    state._fsp--;


                                current = this_NoeticROSDistro_1;
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
    // $ANTLR end "ruleMiddleware"


    // $ANTLR start "entryRuleAbstractConfigExecutionParameter"
    // InternalPlanParser.g:306:1: entryRuleAbstractConfigExecutionParameter returns [EObject current=null] : iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF ;
    public final EObject entryRuleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConfigExecutionParameter = null;


        try {
            // InternalPlanParser.g:306:73: (iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF )
            // InternalPlanParser.g:307:2: iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF
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
    // InternalPlanParser.g:313:1: ruleAbstractConfigExecutionParameter returns [EObject current=null] : this_ConfigExecutionParameter_0= ruleConfigExecutionParameter ;
    public final EObject ruleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigExecutionParameter_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:319:2: (this_ConfigExecutionParameter_0= ruleConfigExecutionParameter )
            // InternalPlanParser.g:320:2: this_ConfigExecutionParameter_0= ruleConfigExecutionParameter
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
    // InternalPlanParser.g:331:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // InternalPlanParser.g:331:52: (iv_ruleRealization= ruleRealization EOF )
            // InternalPlanParser.g:332:2: iv_ruleRealization= ruleRealization EOF
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
    // InternalPlanParser.g:338:1: ruleRealization returns [EObject current=null] : ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_realization_3_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:344:2: ( ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) )
            // InternalPlanParser.g:345:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:345:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            // InternalPlanParser.g:346:3: () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            {
            // InternalPlanParser.g:346:3: ()
            // InternalPlanParser.g:347:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRealizationAccess().getRealizationAction_0(),
                                current);


            }

            // InternalPlanParser.g:353:3: (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Assignment) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlanParser.g:354:4: otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Assignment,FOLLOW_3);

                                    newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getAssignmentKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_2, grammarAccess.getRealizationAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanParser.g:362:4: ( (lv_realization_3_0= ruleAbstractComputationAssignment ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==HyphenMinus) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                        case 1 :
                            // InternalPlanParser.g:363:5: (lv_realization_3_0= ruleAbstractComputationAssignment )
                            {
                            // InternalPlanParser.g:363:5: (lv_realization_3_0= ruleAbstractComputationAssignment )
                            // InternalPlanParser.g:364:6: lv_realization_3_0= ruleAbstractComputationAssignment
                            {

                                                    newCompositeNode(grammarAccess.getRealizationAccess().getRealizationAbstractComputationAssignmentParserRuleCall_1_2_0());

                            pushFollow(FOLLOW_10);
                            lv_realization_3_0=ruleAbstractComputationAssignment();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getRealizationRule());
                                                    }
                                                    add(
                                                        current,
                                                        "realization",
                                                        lv_realization_3_0,
                                                        "de.fraunhofer.ipa.deplyoment.Plan.AbstractComputationAssignment");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
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
    // InternalPlanParser.g:390:1: entryRuleConfigSoftwareComponent returns [EObject current=null] : iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF ;
    public final EObject entryRuleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSoftwareComponent = null;


        try {
            // InternalPlanParser.g:390:64: (iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF )
            // InternalPlanParser.g:391:2: iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF
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
    // InternalPlanParser.g:397:1: ruleConfigSoftwareComponent returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:403:2: ( ( ( ( ruleEString ) ) (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) )
            // InternalPlanParser.g:404:2: ( ( ( ruleEString ) ) (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:404:2: ( ( ( ruleEString ) ) (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            // InternalPlanParser.g:405:3: ( ( ruleEString ) ) (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            {
            // InternalPlanParser.g:405:3: ( ( ruleEString ) )
            // InternalPlanParser.g:406:4: ( ruleEString )
            {
            // InternalPlanParser.g:406:4: ( ruleEString )
            // InternalPlanParser.g:407:5: ruleEString
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

            // InternalPlanParser.g:421:3: (otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Colon) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPlanParser.g:422:4: otherlv_1= Colon this_INDENT_2= RULE_INDENT (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_3);

                                    newLeafNode(otherlv_1, grammarAccess.getConfigSoftwareComponentAccess().getColonKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_12);

                                    newLeafNode(this_INDENT_2, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanParser.g:430:4: (otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ExecutionConfiguration) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPlanParser.g:431:5: otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT
                            {
                            otherlv_3=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                                newLeafNode(otherlv_3, grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationKeyword_1_2_0());

                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                                newLeafNode(this_INDENT_4, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_2_1());

                            // InternalPlanParser.g:439:5: ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==HyphenMinus) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                                case 1 :
                                    // InternalPlanParser.g:440:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    {
                                    // InternalPlanParser.g:440:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    // InternalPlanParser.g:441:7: lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter
                                    {

                                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationAbstractConfigExecutionParameterParserRuleCall_1_2_2_0());

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
                                    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);

                            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_13);

                                                newLeafNode(this_DEDENT_6, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_2_3());


                            }
                            break;

                    }

                    // InternalPlanParser.g:463:4: (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==StartCommand) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPlanParser.g:464:5: otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT
                            {
                            otherlv_7=(Token)match(input,StartCommand,FOLLOW_3);

                                                newLeafNode(otherlv_7, grammarAccess.getConfigSoftwareComponentAccess().getStartCommandKeyword_1_3_0());

                            this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                                newLeafNode(this_INDENT_8, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_3_1());


                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_3_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:479:5: ( (lv_startCommand_10_0= ruleEString ) )
                            // InternalPlanParser.g:480:6: (lv_startCommand_10_0= ruleEString )
                            {
                            // InternalPlanParser.g:480:6: (lv_startCommand_10_0= ruleEString )
                            // InternalPlanParser.g:481:7: lv_startCommand_10_0= ruleEString
                            {

                                                        newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_3_3_0());

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

                            // InternalPlanParser.g:498:5: ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==HyphenMinus) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalPlanParser.g:499:6: rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )*
                                    {

                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_3_4_0());

                                    pushFollow(FOLLOW_14);
                                    rulePreListElement();

                                    state._fsp--;


                                                            afterParserOrEnumRuleCall();

                                    // InternalPlanParser.g:506:6: ( (lv_startCommand_12_0= ruleEString ) )*
                                    loop6:
                                    do {
                                        int alt6=2;
                                        int LA6_0 = input.LA(1);

                                        if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING) ) {
                                            alt6=1;
                                        }


                                        switch (alt6) {
                                        case 1 :
                                            // InternalPlanParser.g:507:7: (lv_startCommand_12_0= ruleEString )
                                            {
                                            // InternalPlanParser.g:507:7: (lv_startCommand_12_0= ruleEString )
                                            // InternalPlanParser.g:508:8: lv_startCommand_12_0= ruleEString
                                            {

                                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_3_4_1_0());

                                            pushFollow(FOLLOW_14);
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
                                            break loop6;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                                newLeafNode(this_DEDENT_13, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_3_5());


                            }
                            break;

                    }

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_4());


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
    // InternalPlanParser.g:540:1: entryRuleImplementationAssignment returns [EObject current=null] : iv_ruleImplementationAssignment= ruleImplementationAssignment EOF ;
    public final EObject entryRuleImplementationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationAssignment = null;


        try {
            // InternalPlanParser.g:540:65: (iv_ruleImplementationAssignment= ruleImplementationAssignment EOF )
            // InternalPlanParser.g:541:2: iv_ruleImplementationAssignment= ruleImplementationAssignment EOF
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
    // InternalPlanParser.g:547:1: ruleImplementationAssignment returns [EObject current=null] : ( rulePreListElement otherlv_1= ExecutedBy ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= SoftwareComponent this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_10= RULE_DEDENT (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )? this_DEDENT_18= RULE_DEDENT ) ;
    public final EObject ruleImplementationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_10=null;
        Token otherlv_11=null;
        Token this_INDENT_12=null;
        Token this_DEDENT_17=null;
        Token this_DEDENT_18=null;
        EObject lv_softwareComponent_7_0 = null;

        EObject lv_softwareComponent_9_0 = null;

        EObject lv_middleware_14_0 = null;

        EObject lv_middleware_16_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:553:2: ( ( rulePreListElement otherlv_1= ExecutedBy ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= SoftwareComponent this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_10= RULE_DEDENT (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )? this_DEDENT_18= RULE_DEDENT ) )
            // InternalPlanParser.g:554:2: ( rulePreListElement otherlv_1= ExecutedBy ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= SoftwareComponent this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_10= RULE_DEDENT (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )? this_DEDENT_18= RULE_DEDENT )
            {
            // InternalPlanParser.g:554:2: ( rulePreListElement otherlv_1= ExecutedBy ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= SoftwareComponent this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_10= RULE_DEDENT (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )? this_DEDENT_18= RULE_DEDENT )
            // InternalPlanParser.g:555:3: rulePreListElement otherlv_1= ExecutedBy ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= SoftwareComponent this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )* this_DEDENT_10= RULE_DEDENT (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )? this_DEDENT_18= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_15);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,ExecutedBy,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getImplementationAssignmentAccess().getExecutedByKeyword_1());

            // InternalPlanParser.g:566:3: ( ( ruleEString ) )
            // InternalPlanParser.g:567:4: ( ruleEString )
            {
            // InternalPlanParser.g:567:4: ( ruleEString )
            // InternalPlanParser.g:568:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getImplementationAssignmentRule());
                                }


                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getExecutedByComputationDeviceInstanceCrossReference_2_0());

            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_16);

                        newLeafNode(this_INDENT_3, grammarAccess.getImplementationAssignmentAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,SoftwareComponent,FOLLOW_3);

                        newLeafNode(otherlv_4, grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentKeyword_4());

            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_9);

                        newLeafNode(this_INDENT_5, grammarAccess.getImplementationAssignmentAccess().getINDENTTerminalRuleCall_5());


                        newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_6());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            // InternalPlanParser.g:601:3: ( (lv_softwareComponent_7_0= ruleConfigSoftwareComponent ) )
            // InternalPlanParser.g:602:4: (lv_softwareComponent_7_0= ruleConfigSoftwareComponent )
            {
            // InternalPlanParser.g:602:4: (lv_softwareComponent_7_0= ruleConfigSoftwareComponent )
            // InternalPlanParser.g:603:5: lv_softwareComponent_7_0= ruleConfigSoftwareComponent
            {

                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentConfigSoftwareComponentParserRuleCall_7_0());

            pushFollow(FOLLOW_10);
            lv_softwareComponent_7_0=ruleConfigSoftwareComponent();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                }
                                add(
                                    current,
                                    "softwareComponent",
                                    lv_softwareComponent_7_0,
                                    "de.fraunhofer.ipa.deplyoment.Plan.ConfigSoftwareComponent");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanParser.g:620:3: ( rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==HyphenMinus) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // InternalPlanParser.g:621:4: rulePreListElement ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) )
                    {

                                    newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_8_0());

                    pushFollow(FOLLOW_5);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:628:4: ( (lv_softwareComponent_9_0= ruleConfigSoftwareComponent ) )
                    // InternalPlanParser.g:629:5: (lv_softwareComponent_9_0= ruleConfigSoftwareComponent )
                    {
                    // InternalPlanParser.g:629:5: (lv_softwareComponent_9_0= ruleConfigSoftwareComponent )
                    // InternalPlanParser.g:630:6: lv_softwareComponent_9_0= ruleConfigSoftwareComponent
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getSoftwareComponentConfigSoftwareComponentParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_10);
                    lv_softwareComponent_9_0=ruleConfigSoftwareComponent();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            add(
                                                current,
                                                "softwareComponent",
                                                lv_softwareComponent_9_0,
                                                "de.fraunhofer.ipa.deplyoment.Plan.ConfigSoftwareComponent");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

                default :
                    break loop10;
                }
            } while (true);

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_17);

                        newLeafNode(this_DEDENT_10, grammarAccess.getImplementationAssignmentAccess().getDEDENTTerminalRuleCall_9());

            // InternalPlanParser.g:652:3: (otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Middleware) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPlanParser.g:653:4: otherlv_11= Middleware this_INDENT_12= RULE_INDENT rulePreListElement ( (lv_middleware_14_0= ruleMiddleware ) ) ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )* this_DEDENT_17= RULE_DEDENT
                    {
                    otherlv_11=(Token)match(input,Middleware,FOLLOW_3);

                                    newLeafNode(otherlv_11, grammarAccess.getImplementationAssignmentAccess().getMiddlewareKeyword_10_0());

                    this_INDENT_12=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_12, grammarAccess.getImplementationAssignmentAccess().getINDENTTerminalRuleCall_10_1());


                                    newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_10_2());

                    pushFollow(FOLLOW_18);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:668:4: ( (lv_middleware_14_0= ruleMiddleware ) )
                    // InternalPlanParser.g:669:5: (lv_middleware_14_0= ruleMiddleware )
                    {
                    // InternalPlanParser.g:669:5: (lv_middleware_14_0= ruleMiddleware )
                    // InternalPlanParser.g:670:6: lv_middleware_14_0= ruleMiddleware
                    {

                                            newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getMiddlewareMiddlewareParserRuleCall_10_3_0());

                    pushFollow(FOLLOW_10);
                    lv_middleware_14_0=ruleMiddleware();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                            }
                                            add(
                                                current,
                                                "middleware",
                                                lv_middleware_14_0,
                                                "de.fraunhofer.ipa.deplyoment.Plan.Middleware");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalPlanParser.g:687:4: ( rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==HyphenMinus) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalPlanParser.g:688:5: rulePreListElement ( (lv_middleware_16_0= ruleMiddleware ) )
                            {

                                                newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getPreListElementParserRuleCall_10_4_0());

                            pushFollow(FOLLOW_18);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:695:5: ( (lv_middleware_16_0= ruleMiddleware ) )
                            // InternalPlanParser.g:696:6: (lv_middleware_16_0= ruleMiddleware )
                            {
                            // InternalPlanParser.g:696:6: (lv_middleware_16_0= ruleMiddleware )
                            // InternalPlanParser.g:697:7: lv_middleware_16_0= ruleMiddleware
                            {

                                                        newCompositeNode(grammarAccess.getImplementationAssignmentAccess().getMiddlewareMiddlewareParserRuleCall_10_4_1_0());

                            pushFollow(FOLLOW_10);
                            lv_middleware_16_0=ruleMiddleware();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getImplementationAssignmentRule());
                                                        }
                                                        add(
                                                            current,
                                                            "middleware",
                                                            lv_middleware_16_0,
                                                            "de.fraunhofer.ipa.deplyoment.Plan.Middleware");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop11;
                        }
                    } while (true);

                    this_DEDENT_17=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                    newLeafNode(this_DEDENT_17, grammarAccess.getImplementationAssignmentAccess().getDEDENTTerminalRuleCall_10_5());


                    }
                    break;

            }

            this_DEDENT_18=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_18, grammarAccess.getImplementationAssignmentAccess().getDEDENTTerminalRuleCall_11());


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


    // $ANTLR start "entryRuleHumbleROSDistro"
    // InternalPlanParser.g:728:1: entryRuleHumbleROSDistro returns [EObject current=null] : iv_ruleHumbleROSDistro= ruleHumbleROSDistro EOF ;
    public final EObject entryRuleHumbleROSDistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumbleROSDistro = null;


        try {
            // InternalPlanParser.g:728:56: (iv_ruleHumbleROSDistro= ruleHumbleROSDistro EOF )
            // InternalPlanParser.g:729:2: iv_ruleHumbleROSDistro= ruleHumbleROSDistro EOF
            {
             newCompositeNode(grammarAccess.getHumbleROSDistroRule());
            pushFollow(FOLLOW_1);
            iv_ruleHumbleROSDistro=ruleHumbleROSDistro();

            state._fsp--;

             current =iv_ruleHumbleROSDistro;
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
    // $ANTLR end "entryRuleHumbleROSDistro"


    // $ANTLR start "ruleHumbleROSDistro"
    // InternalPlanParser.g:735:1: ruleHumbleROSDistro returns [EObject current=null] : ( () otherlv_1= HumbleROSDistro ) ;
    public final EObject ruleHumbleROSDistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:741:2: ( ( () otherlv_1= HumbleROSDistro ) )
            // InternalPlanParser.g:742:2: ( () otherlv_1= HumbleROSDistro )
            {
            // InternalPlanParser.g:742:2: ( () otherlv_1= HumbleROSDistro )
            // InternalPlanParser.g:743:3: () otherlv_1= HumbleROSDistro
            {
            // InternalPlanParser.g:743:3: ()
            // InternalPlanParser.g:744:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getHumbleROSDistroAccess().getHumbleROSDistroAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,HumbleROSDistro,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getHumbleROSDistroAccess().getHumbleROSDistroKeyword_1());


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
    // $ANTLR end "ruleHumbleROSDistro"


    // $ANTLR start "entryRuleNoeticROSDistro"
    // InternalPlanParser.g:758:1: entryRuleNoeticROSDistro returns [EObject current=null] : iv_ruleNoeticROSDistro= ruleNoeticROSDistro EOF ;
    public final EObject entryRuleNoeticROSDistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoeticROSDistro = null;


        try {
            // InternalPlanParser.g:758:56: (iv_ruleNoeticROSDistro= ruleNoeticROSDistro EOF )
            // InternalPlanParser.g:759:2: iv_ruleNoeticROSDistro= ruleNoeticROSDistro EOF
            {
             newCompositeNode(grammarAccess.getNoeticROSDistroRule());
            pushFollow(FOLLOW_1);
            iv_ruleNoeticROSDistro=ruleNoeticROSDistro();

            state._fsp--;

             current =iv_ruleNoeticROSDistro;
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
    // $ANTLR end "entryRuleNoeticROSDistro"


    // $ANTLR start "ruleNoeticROSDistro"
    // InternalPlanParser.g:765:1: ruleNoeticROSDistro returns [EObject current=null] : ( () otherlv_1= NoeticROSDistro ) ;
    public final EObject ruleNoeticROSDistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:771:2: ( ( () otherlv_1= NoeticROSDistro ) )
            // InternalPlanParser.g:772:2: ( () otherlv_1= NoeticROSDistro )
            {
            // InternalPlanParser.g:772:2: ( () otherlv_1= NoeticROSDistro )
            // InternalPlanParser.g:773:3: () otherlv_1= NoeticROSDistro
            {
            // InternalPlanParser.g:773:3: ()
            // InternalPlanParser.g:774:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNoeticROSDistroAccess().getNoeticROSDistroAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,NoeticROSDistro,FOLLOW_2);

                        newLeafNode(otherlv_1, grammarAccess.getNoeticROSDistroAccess().getNoeticROSDistroKeyword_1());


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
    // $ANTLR end "ruleNoeticROSDistro"


    // $ANTLR start "entryRuleConfigExecutionParameter"
    // InternalPlanParser.g:788:1: entryRuleConfigExecutionParameter returns [EObject current=null] : iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF ;
    public final EObject entryRuleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigExecutionParameter = null;


        try {
            // InternalPlanParser.g:788:65: (iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF )
            // InternalPlanParser.g:789:2: iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF
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
    // InternalPlanParser.g:795:1: ruleConfigExecutionParameter returns [EObject current=null] : ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) ;
    public final EObject ruleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_DEDENT_8=null;
        EObject lv_value_7_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:801:2: ( ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) )
            // InternalPlanParser.g:802:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:802:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            // InternalPlanParser.g:803:3: rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_19);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigExecutionParameterAccess().getFromKeyword_1());

            // InternalPlanParser.g:814:3: ( ( ruleEString ) )
            // InternalPlanParser.g:815:4: ( ruleEString )
            {
            // InternalPlanParser.g:815:4: ( ruleEString )
            // InternalPlanParser.g:816:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getFromExecutionPropertyCrossReference_2_0());

            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanParser.g:830:3: (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPlanParser.g:831:4: this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT
                    {
                    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_21);

                                    newLeafNode(this_INDENT_3, grammarAccess.getConfigExecutionParameterAccess().getINDENTTerminalRuleCall_3_0());

                    // InternalPlanParser.g:835:4: (otherlv_4= To ( ( ruleEString ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==To) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPlanParser.g:836:5: otherlv_4= To ( ( ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,To,FOLLOW_5);

                                                newLeafNode(otherlv_4, grammarAccess.getConfigExecutionParameterAccess().getToKeyword_3_1_0());

                            // InternalPlanParser.g:840:5: ( ( ruleEString ) )
                            // InternalPlanParser.g:841:6: ( ruleEString )
                            {
                            // InternalPlanParser.g:841:6: ( ruleEString )
                            // InternalPlanParser.g:842:7: ruleEString
                            {

                                                        if (current==null) {
                                                            current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                                        }


                                                        newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getToAbstractConfigPropertyCrossReference_3_1_1_0());

                            pushFollow(FOLLOW_22);
                            ruleEString();

                            state._fsp--;


                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                    }

                    // InternalPlanParser.g:857:4: (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Value) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPlanParser.g:858:5: otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) )
                            {
                            otherlv_6=(Token)match(input,Value,FOLLOW_23);

                                                newLeafNode(otherlv_6, grammarAccess.getConfigExecutionParameterAccess().getValueKeyword_3_2_0());

                            // InternalPlanParser.g:862:5: ( (lv_value_7_0= rulePropertyValue ) )
                            // InternalPlanParser.g:863:6: (lv_value_7_0= rulePropertyValue )
                            {
                            // InternalPlanParser.g:863:6: (lv_value_7_0= rulePropertyValue )
                            // InternalPlanParser.g:864:7: lv_value_7_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getValuePropertyValueParserRuleCall_3_2_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_7_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getConfigExecutionParameterRule());
                                                        }
                                                        set(
                                                            current,
                                                            "value",
                                                            lv_value_7_0,
                                                            "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                    }

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_8, grammarAccess.getConfigExecutionParameterAccess().getDEDENTTerminalRuleCall_3_3());


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
    // $ANTLR end "ruleConfigExecutionParameter"


    // $ANTLR start "entryRulePropertyKind"
    // InternalPlanParser.g:891:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalPlanParser.g:891:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalPlanParser.g:892:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalPlanParser.g:898:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalPlanParser.g:904:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalPlanParser.g:905:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalPlanParser.g:905:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
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
                    // InternalPlanParser.g:906:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalPlanParser.g:915:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalPlanParser.g:924:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalPlanParser.g:933:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalPlanParser.g:942:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalPlanParser.g:954:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalPlanParser.g:954:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalPlanParser.g:955:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalPlanParser.g:961:1: ruleProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:967:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanParser.g:968:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:968:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanParser.g:969:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= rulePropertyKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getNameKeyword_1());

            // InternalPlanParser.g:980:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:981:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:981:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:982:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_25);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getKindKeyword_4());

            // InternalPlanParser.g:1007:3: ( (lv_kind_5_0= rulePropertyKind ) )
            // InternalPlanParser.g:1008:4: (lv_kind_5_0= rulePropertyKind )
            {
            // InternalPlanParser.g:1008:4: (lv_kind_5_0= rulePropertyKind )
            // InternalPlanParser.g:1009:5: lv_kind_5_0= rulePropertyKind
            {

                                newCompositeNode(grammarAccess.getPropertyAccess().getKindPropertyKindParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
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

            // InternalPlanParser.g:1026:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Description) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPlanParser.g:1027:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1031:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1032:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1032:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1033:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalPlanParser.g:1051:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPlanParser.g:1052:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_23);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1067:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1068:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1068:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanParser.g:1069:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_10);
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

                    // InternalPlanParser.g:1086:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==HyphenMinus) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                        case 1 :
                            // InternalPlanParser.g:1087:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertyAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_23);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:1094:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalPlanParser.g:1095:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalPlanParser.g:1095:6: (lv_value_13_0= rulePropertyValue )
                            // InternalPlanParser.g:1096:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_10);
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_28);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanParser.g:1119:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DEDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPlanParser.g:1120:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanParser.g:1129:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalPlanParser.g:1129:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalPlanParser.g:1130:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalPlanParser.g:1136:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1142:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1143:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1143:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:1144:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalPlanParser.g:1155:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1156:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1156:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1157:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalPlanParser.g:1182:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalPlanParser.g:1183:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalPlanParser.g:1183:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalPlanParser.g:1184:5: lv_kind_5_0= ruleAttributeKind
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

            // InternalPlanParser.g:1201:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Description) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPlanParser.g:1202:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1206:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1207:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1207:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1208:6: lv_description_7_0= ruleEString
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

            // InternalPlanParser.g:1226:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPlanParser.g:1227:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_23);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1231:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1232:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1232:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1233:6: lv_value_9_0= rulePropertyValue
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

            // InternalPlanParser.g:1251:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DEDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPlanParser.g:1252:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1261:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalPlanParser.g:1261:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalPlanParser.g:1262:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalPlanParser.g:1268:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1274:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1275:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1275:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:1276:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalPlanParser.g:1287:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1288:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1288:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1289:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_30);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalPlanParser.g:1314:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalPlanParser.g:1315:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalPlanParser.g:1315:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalPlanParser.g:1316:5: lv_kind_5_0= ruleMaximumKind
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

            // InternalPlanParser.g:1333:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Description) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPlanParser.g:1334:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1338:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1339:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1339:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1340:6: lv_description_7_0= ruleEString
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

            // InternalPlanParser.g:1358:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlanParser.g:1359:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_23);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1363:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1364:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1364:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1365:6: lv_value_9_0= rulePropertyValue
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

            // InternalPlanParser.g:1383:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DEDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPlanParser.g:1384:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1393:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalPlanParser.g:1393:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalPlanParser.g:1394:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalPlanParser.g:1400:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1406:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1407:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1407:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanParser.g:1408:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalPlanParser.g:1419:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1420:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1420:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1421:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_31);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalPlanParser.g:1446:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalPlanParser.g:1447:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalPlanParser.g:1447:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalPlanParser.g:1448:5: lv_kind_5_0= ruleMinimumKind
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

            // InternalPlanParser.g:1465:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Description) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPlanParser.g:1466:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1470:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1471:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1471:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1472:6: lv_description_7_0= ruleEString
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

            // InternalPlanParser.g:1490:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Value) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPlanParser.g:1491:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_23);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalPlanParser.g:1495:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1496:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1496:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanParser.g:1497:6: lv_value_9_0= rulePropertyValue
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

            // InternalPlanParser.g:1515:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DEDENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlanParser.g:1516:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanParser.g:1525:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalPlanParser.g:1525:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalPlanParser.g:1526:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalPlanParser.g:1532:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1538:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1539:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1539:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanParser.g:1540:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalPlanParser.g:1551:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1552:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1552:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1553:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_25);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalPlanParser.g:1578:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalPlanParser.g:1579:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalPlanParser.g:1579:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalPlanParser.g:1580:5: lv_kind_5_0= ruleSelectionKind
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

            // InternalPlanParser.g:1597:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Description) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlanParser.g:1598:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1602:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1603:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1603:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1604:6: lv_description_7_0= ruleEString
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

            // InternalPlanParser.g:1622:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPlanParser.g:1623:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_23);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1638:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1639:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1639:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanParser.g:1640:6: lv_value_11_0= rulePropertyValue
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

                    // InternalPlanParser.g:1657:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==HyphenMinus) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                        case 1 :
                            // InternalPlanParser.g:1658:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_23);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanParser.g:1665:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalPlanParser.g:1666:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalPlanParser.g:1666:6: (lv_value_13_0= rulePropertyValue )
                            // InternalPlanParser.g:1667:7: lv_value_13_0= rulePropertyValue
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
                            break loop31;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_28);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanParser.g:1690:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPlanParser.g:1691:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanParser.g:1700:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalPlanParser.g:1700:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalPlanParser.g:1701:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalPlanParser.g:1707:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanParser.g:1713:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanParser.g:1714:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanParser.g:1714:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanParser.g:1715:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalPlanParser.g:1726:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanParser.g:1727:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanParser.g:1727:4: (lv_name_2_0= ruleEString )
            // InternalPlanParser.g:1728:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_24);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_32);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalPlanParser.g:1753:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalPlanParser.g:1754:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalPlanParser.g:1754:4: (lv_kind_5_0= ruleRangeKind )
            // InternalPlanParser.g:1755:5: lv_kind_5_0= ruleRangeKind
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

            // InternalPlanParser.g:1772:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Description) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPlanParser.g:1773:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanParser.g:1777:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanParser.g:1778:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanParser.g:1778:5: (lv_description_7_0= ruleEString )
                    // InternalPlanParser.g:1779:6: lv_description_7_0= ruleEString
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

            // InternalPlanParser.g:1797:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPlanParser.g:1798:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_23);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1813:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1814:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1814:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanParser.g:1815:6: lv_value_11_0= rulePropertyValue
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

                    pushFollow(FOLLOW_23);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanParser.g:1839:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalPlanParser.g:1840:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalPlanParser.g:1840:5: (lv_value_13_0= rulePropertyValue )
                    // InternalPlanParser.g:1841:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_28);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalPlanParser.g:1863:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DEDENT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPlanParser.g:1864:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanParser.g:1873:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPlanParser.g:1873:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPlanParser.g:1874:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalPlanParser.g:1880:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1886:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalPlanParser.g:1887:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalPlanParser.g:1887:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
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
                    // InternalPlanParser.g:1888:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalPlanParser.g:1897:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalPlanParser.g:1906:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalPlanParser.g:1915:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
    // InternalPlanParser.g:1927:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalPlanParser.g:1927:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalPlanParser.g:1928:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalPlanParser.g:1934:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1940:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalPlanParser.g:1941:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalPlanParser.g:1941:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalPlanParser.g:1942:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalPlanParser.g:1942:3: (lv_value_0_0= ruleInteger0 )
            // InternalPlanParser.g:1943:4: lv_value_0_0= ruleInteger0
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
    // InternalPlanParser.g:1963:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalPlanParser.g:1963:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalPlanParser.g:1964:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalPlanParser.g:1970:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:1976:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalPlanParser.g:1977:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalPlanParser.g:1977:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalPlanParser.g:1978:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalPlanParser.g:1978:3: (lv_value_0_0= ruleDouble0 )
            // InternalPlanParser.g:1979:4: lv_value_0_0= ruleDouble0
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
    // InternalPlanParser.g:1999:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalPlanParser.g:1999:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalPlanParser.g:2000:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalPlanParser.g:2006:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2012:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPlanParser.g:2013:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPlanParser.g:2013:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPlanParser.g:2014:3: (lv_value_0_0= ruleEString )
            {
            // InternalPlanParser.g:2014:3: (lv_value_0_0= ruleEString )
            // InternalPlanParser.g:2015:4: lv_value_0_0= ruleEString
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
    // InternalPlanParser.g:2035:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalPlanParser.g:2035:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalPlanParser.g:2036:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalPlanParser.g:2042:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2048:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalPlanParser.g:2049:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalPlanParser.g:2049:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
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
                    // InternalPlanParser.g:2050:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
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
                    // InternalPlanParser.g:2059:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
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
    // InternalPlanParser.g:2071:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalPlanParser.g:2071:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalPlanParser.g:2072:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
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
    // InternalPlanParser.g:2078:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2084:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalPlanParser.g:2085:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalPlanParser.g:2085:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
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
                    // InternalPlanParser.g:2086:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
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
                    // InternalPlanParser.g:2095:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
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
    // InternalPlanParser.g:2107:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalPlanParser.g:2107:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalPlanParser.g:2108:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalPlanParser.g:2114:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2120:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanParser.g:2121:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanParser.g:2121:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanParser.g:2122:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanParser.g:2122:3: ()
            // InternalPlanParser.g:2123:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalPlanParser.g:2129:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanParser.g:2130:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanParser.g:2130:4: (lv_name_1_0= ruleEString )
            // InternalPlanParser.g:2131:5: lv_name_1_0= ruleEString
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
    // InternalPlanParser.g:2152:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalPlanParser.g:2152:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalPlanParser.g:2153:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
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
    // InternalPlanParser.g:2159:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2165:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalPlanParser.g:2166:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalPlanParser.g:2166:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalPlanParser.g:2167:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalPlanParser.g:2167:3: ()
            // InternalPlanParser.g:2168:4:
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
    // InternalPlanParser.g:2182:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalPlanParser.g:2182:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalPlanParser.g:2183:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
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
    // InternalPlanParser.g:2189:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2195:2: ( ( () otherlv_1= Linux ) )
            // InternalPlanParser.g:2196:2: ( () otherlv_1= Linux )
            {
            // InternalPlanParser.g:2196:2: ( () otherlv_1= Linux )
            // InternalPlanParser.g:2197:3: () otherlv_1= Linux
            {
            // InternalPlanParser.g:2197:3: ()
            // InternalPlanParser.g:2198:4:
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
    // InternalPlanParser.g:2212:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalPlanParser.g:2212:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalPlanParser.g:2213:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
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
    // InternalPlanParser.g:2219:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2225:2: ( ( () otherlv_1= MacOS ) )
            // InternalPlanParser.g:2226:2: ( () otherlv_1= MacOS )
            {
            // InternalPlanParser.g:2226:2: ( () otherlv_1= MacOS )
            // InternalPlanParser.g:2227:3: () otherlv_1= MacOS
            {
            // InternalPlanParser.g:2227:3: ()
            // InternalPlanParser.g:2228:4:
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
    // InternalPlanParser.g:2242:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalPlanParser.g:2242:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalPlanParser.g:2243:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalPlanParser.g:2249:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86_64 ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2255:2: ( ( () otherlv_1= X86_64 ) )
            // InternalPlanParser.g:2256:2: ( () otherlv_1= X86_64 )
            {
            // InternalPlanParser.g:2256:2: ( () otherlv_1= X86_64 )
            // InternalPlanParser.g:2257:3: () otherlv_1= X86_64
            {
            // InternalPlanParser.g:2257:3: ()
            // InternalPlanParser.g:2258:4:
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
    // InternalPlanParser.g:2272:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalPlanParser.g:2272:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalPlanParser.g:2273:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalPlanParser.g:2279:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64 ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2285:2: ( ( () otherlv_1= Arm64 ) )
            // InternalPlanParser.g:2286:2: ( () otherlv_1= Arm64 )
            {
            // InternalPlanParser.g:2286:2: ( () otherlv_1= Arm64 )
            // InternalPlanParser.g:2287:3: () otherlv_1= Arm64
            {
            // InternalPlanParser.g:2287:3: ()
            // InternalPlanParser.g:2288:4:
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
    // InternalPlanParser.g:2302:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPlanParser.g:2302:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPlanParser.g:2303:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalPlanParser.g:2309:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2315:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanParser.g:2316:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanParser.g:2316:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanParser.g:2317:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanParser.g:2317:3: ()
            // InternalPlanParser.g:2318:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalPlanParser.g:2324:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanParser.g:2325:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanParser.g:2325:4: (lv_name_1_0= ruleEString )
            // InternalPlanParser.g:2326:5: lv_name_1_0= ruleEString
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
    // InternalPlanParser.g:2347:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalPlanParser.g:2347:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalPlanParser.g:2348:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalPlanParser.g:2354:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalPlanParser.g:2360:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalPlanParser.g:2361:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalPlanParser.g:2361:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
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
                    // InternalPlanParser.g:2362:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalPlanParser.g:2371:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalPlanParser.g:2383:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalPlanParser.g:2383:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalPlanParser.g:2384:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalPlanParser.g:2390:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2396:2: ( ( () otherlv_1= Ethernet ) )
            // InternalPlanParser.g:2397:2: ( () otherlv_1= Ethernet )
            {
            // InternalPlanParser.g:2397:2: ( () otherlv_1= Ethernet )
            // InternalPlanParser.g:2398:3: () otherlv_1= Ethernet
            {
            // InternalPlanParser.g:2398:3: ()
            // InternalPlanParser.g:2399:4:
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
    // InternalPlanParser.g:2413:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalPlanParser.g:2413:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalPlanParser.g:2414:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalPlanParser.g:2420:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2426:2: ( ( () otherlv_1= Wlan ) )
            // InternalPlanParser.g:2427:2: ( () otherlv_1= Wlan )
            {
            // InternalPlanParser.g:2427:2: ( () otherlv_1= Wlan )
            // InternalPlanParser.g:2428:3: () otherlv_1= Wlan
            {
            // InternalPlanParser.g:2428:3: ()
            // InternalPlanParser.g:2429:4:
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
    // InternalPlanParser.g:2443:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalPlanParser.g:2443:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalPlanParser.g:2444:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalPlanParser.g:2450:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2456:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalPlanParser.g:2457:2: ( () otherlv_1= AttributeKind )
            {
            // InternalPlanParser.g:2457:2: ( () otherlv_1= AttributeKind )
            // InternalPlanParser.g:2458:3: () otherlv_1= AttributeKind
            {
            // InternalPlanParser.g:2458:3: ()
            // InternalPlanParser.g:2459:4:
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
    // InternalPlanParser.g:2473:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalPlanParser.g:2473:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalPlanParser.g:2474:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalPlanParser.g:2480:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2486:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalPlanParser.g:2487:2: ( () otherlv_1= MaximumKind )
            {
            // InternalPlanParser.g:2487:2: ( () otherlv_1= MaximumKind )
            // InternalPlanParser.g:2488:3: () otherlv_1= MaximumKind
            {
            // InternalPlanParser.g:2488:3: ()
            // InternalPlanParser.g:2489:4:
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
    // InternalPlanParser.g:2503:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalPlanParser.g:2503:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalPlanParser.g:2504:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalPlanParser.g:2510:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2516:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalPlanParser.g:2517:2: ( () otherlv_1= MinimumKind )
            {
            // InternalPlanParser.g:2517:2: ( () otherlv_1= MinimumKind )
            // InternalPlanParser.g:2518:3: () otherlv_1= MinimumKind
            {
            // InternalPlanParser.g:2518:3: ()
            // InternalPlanParser.g:2519:4:
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
    // InternalPlanParser.g:2533:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalPlanParser.g:2533:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalPlanParser.g:2534:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalPlanParser.g:2540:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2546:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalPlanParser.g:2547:2: ( () otherlv_1= SelectionKind )
            {
            // InternalPlanParser.g:2547:2: ( () otherlv_1= SelectionKind )
            // InternalPlanParser.g:2548:3: () otherlv_1= SelectionKind
            {
            // InternalPlanParser.g:2548:3: ()
            // InternalPlanParser.g:2549:4:
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
    // InternalPlanParser.g:2563:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalPlanParser.g:2563:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalPlanParser.g:2564:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalPlanParser.g:2570:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2576:2: ( ( () otherlv_1= RangeKind ) )
            // InternalPlanParser.g:2577:2: ( () otherlv_1= RangeKind )
            {
            // InternalPlanParser.g:2577:2: ( () otherlv_1= RangeKind )
            // InternalPlanParser.g:2578:3: () otherlv_1= RangeKind
            {
            // InternalPlanParser.g:2578:3: ()
            // InternalPlanParser.g:2579:4:
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
    // InternalPlanParser.g:2593:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalPlanParser.g:2593:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalPlanParser.g:2594:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalPlanParser.g:2600:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalPlanParser.g:2606:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalPlanParser.g:2607:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalPlanParser.g:2617:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalPlanParser.g:2617:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalPlanParser.g:2618:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalPlanParser.g:2624:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalPlanParser.g:2630:2: (this_DECINT_0= RULE_DECINT )
            // InternalPlanParser.g:2631:2: this_DECINT_0= RULE_DECINT
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
    // InternalPlanParser.g:2641:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlanParser.g:2641:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlanParser.g:2642:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlanParser.g:2648:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalPlanParser.g:2654:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlanParser.g:2655:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlanParser.g:2655:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPlanParser.g:2656:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalPlanParser.g:2664:3: this_ID_1= RULE_ID
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
    // InternalPlanParser.g:2675:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanParser.g:2677:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalPlanParser.g:2678:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalPlanParser.g:2687:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanParser.g:2694:2: (kw= HyphenMinus )
            // InternalPlanParser.g:2695:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000001010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0005800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800080800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0005006001400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000008CC00L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000802002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000800002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L});

}
