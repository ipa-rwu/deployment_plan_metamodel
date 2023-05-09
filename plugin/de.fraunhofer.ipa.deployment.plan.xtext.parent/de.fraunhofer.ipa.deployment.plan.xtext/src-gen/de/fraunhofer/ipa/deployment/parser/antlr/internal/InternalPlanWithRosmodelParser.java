package de.fraunhofer.ipa.deployment.parser.antlr.internal;

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
import de.fraunhofer.ipa.deployment.services.PlanWithRosmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanWithRosmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExecutionConfiguration", "DeploymentPlanWithRos", "LinuxOpertingSystem", "MacOSOpertingSystem", "SoftwareComponents", "DeploymentPlan", "AttributeKind", "SelectionKind", "StartCommand", "Description", "RuntimeType", "MaximumKind", "MinimumKind", "Assignment", "ExecutedBy", "Middleware", "Properties", "Os_version", "Processor", "RangeKind", "Container", "DeployTo", "Resource", "Ethernet", "Version", "Os_name", "Rolling", "Debian", "Humble", "Noetic", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "Usb", "To", "X86", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SoftwareComponents=8;
    public static final int DeployTo=25;
    public static final int AttributeKind=10;
    public static final int Noetic=33;
    public static final int Name=41;
    public static final int Assignment=17;
    public static final int Container=24;
    public static final int Debian=31;
    public static final int Version=28;
    public static final int Kind=40;
    public static final int To=45;
    public static final int ExecutedBy=18;
    public static final int Ubuntu=34;
    public static final int RULE_DEDENT=54;
    public static final int DeploymentPlanWithRos=5;
    public static final int LinuxOpertingSystem=6;
    public static final int RULE_ID=55;
    public static final int Resource=26;
    public static final int RULE_DIGIT=49;
    public static final int Middleware=19;
    public static final int SelectionKind=11;
    public static final int Arm64=36;
    public static final int RULE_INT=56;
    public static final int Ethernet=27;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=58;
    public static final int Description=13;
    public static final int Processor=22;
    public static final int StartCommand=12;
    public static final int RULE_STRING=57;
    public static final int Focal=37;
    public static final int Wlan=43;
    public static final int Properties=20;
    public static final int RULE_SL_COMMENT=52;
    public static final int Os_name=29;
    public static final int HyphenMinus=47;
    public static final int RULE_DOUBLE=51;
    public static final int X86=46;
    public static final int Colon=48;
    public static final int RULE_DECINT=50;
    public static final int DeploymentPlan=9;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=53;
    public static final int Jammy=39;
    public static final int Usb=44;
    public static final int RULE_WS=59;
    public static final int Rolling=30;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=15;
    public static final int From=38;
    public static final int RULE_ANY_OTHER=60;
    public static final int RangeKind=23;
    public static final int Os_version=21;
    public static final int Type=42;
    public static final int MacOSOpertingSystem=7;
    public static final int RuntimeType=14;
    public static final int Humble=32;

    // delegates
    // delegators


        public InternalPlanWithRosmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanWithRosmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }


    public String[] getTokenNames() { return InternalPlanWithRosmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlanWithRosmodelParser.g"; }



        private PlanWithRosmodelGrammarAccess grammarAccess;

        public InternalPlanWithRosmodelParser(TokenStream input, PlanWithRosmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
            return "DeploymentPlanWithRosModel";
        }

        @Override
        protected PlanWithRosmodelGrammarAccess getGrammarAccess() {
            return grammarAccess;
        }




    // $ANTLR start "entryRuleDeploymentPlanWithRosModel"
    // InternalPlanWithRosmodelParser.g:58:1: entryRuleDeploymentPlanWithRosModel returns [EObject current=null] : iv_ruleDeploymentPlanWithRosModel= ruleDeploymentPlanWithRosModel EOF ;
    public final EObject entryRuleDeploymentPlanWithRosModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentPlanWithRosModel = null;


        try {
            // InternalPlanWithRosmodelParser.g:58:67: (iv_ruleDeploymentPlanWithRosModel= ruleDeploymentPlanWithRosModel EOF )
            // InternalPlanWithRosmodelParser.g:59:2: iv_ruleDeploymentPlanWithRosModel= ruleDeploymentPlanWithRosModel EOF
            {
             newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelRule());
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentPlanWithRosModel=ruleDeploymentPlanWithRosModel();

            state._fsp--;

             current =iv_ruleDeploymentPlanWithRosModel;
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
    // $ANTLR end "entryRuleDeploymentPlanWithRosModel"


    // $ANTLR start "ruleDeploymentPlanWithRosModel"
    // InternalPlanWithRosmodelParser.g:65:1: ruleDeploymentPlanWithRosModel returns [EObject current=null] : (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) ;
    public final EObject ruleDeploymentPlanWithRosModel() throws RecognitionException {
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
            // InternalPlanWithRosmodelParser.g:71:2: ( (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:72:2: (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:72:2: (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:73:3: otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= DeployTo ( ( ruleEString ) ) ( (lv_realize_6_0= ruleAbstractRealization ) ) this_DEDENT_7= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeploymentPlanWithRos,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeploymentPlanWithRosModelAccess().getDeploymentPlanWithRosKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeploymentPlanWithRosModelAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getDeploymentPlanWithRosModelAccess().getNameKeyword_2());

            // InternalPlanWithRosmodelParser.g:85:3: ( (lv_name_3_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:86:4: (lv_name_3_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:86:4: (lv_name_3_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:87:5: lv_name_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeploymentPlanWithRosModelRule());
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

                        newLeafNode(otherlv_4, grammarAccess.getDeploymentPlanWithRosModelAccess().getDeployToKeyword_4());

            // InternalPlanWithRosmodelParser.g:108:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:109:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:109:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:110:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getDeploymentPlanWithRosModelRule());
                                }


                                newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getDeployToTargetDeployEnviromentCrossReference_5_0());

            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:124:3: ( (lv_realize_6_0= ruleAbstractRealization ) )
            // InternalPlanWithRosmodelParser.g:125:4: (lv_realize_6_0= ruleAbstractRealization )
            {
            // InternalPlanWithRosmodelParser.g:125:4: (lv_realize_6_0= ruleAbstractRealization )
            // InternalPlanWithRosmodelParser.g:126:5: lv_realize_6_0= ruleAbstractRealization
            {

                                newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getRealizeAbstractRealizationParserRuleCall_6_0());

            pushFollow(FOLLOW_8);
            lv_realize_6_0=ruleAbstractRealization();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getDeploymentPlanWithRosModelRule());
                                }
                                set(
                                    current,
                                    "realize",
                                    lv_realize_6_0,
                                    "de.fraunhofer.ipa.deployment.Plan.AbstractRealization");
                                afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_7, grammarAccess.getDeploymentPlanWithRosModelAccess().getDEDENTTerminalRuleCall_7());


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
    // $ANTLR end "ruleDeploymentPlanWithRosModel"


    // $ANTLR start "entryRuleConfigRosSoftwareComponent"
    // InternalPlanWithRosmodelParser.g:151:1: entryRuleConfigRosSoftwareComponent returns [EObject current=null] : iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF ;
    public final EObject entryRuleConfigRosSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigRosSoftwareComponent = null;


        try {
            // InternalPlanWithRosmodelParser.g:151:67: (iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF )
            // InternalPlanWithRosmodelParser.g:152:2: iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF
            {
             newCompositeNode(grammarAccess.getConfigRosSoftwareComponentRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigRosSoftwareComponent=ruleConfigRosSoftwareComponent();

            state._fsp--;

             current =iv_ruleConfigRosSoftwareComponent;
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
    // $ANTLR end "entryRuleConfigRosSoftwareComponent"


    // $ANTLR start "ruleConfigRosSoftwareComponent"
    // InternalPlanWithRosmodelParser.g:158:1: ruleConfigRosSoftwareComponent returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? ) ;
    public final EObject ruleConfigRosSoftwareComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token this_DEDENT_15=null;
        EObject lv_executionConfiguration_6_0 = null;

        AntlrDatatypeRuleToken lv_startCommand_11_0 = null;

        AntlrDatatypeRuleToken lv_startCommand_13_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:164:2: ( ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:165:2: ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:165:2: ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:166:3: () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:166:3: ()
            // InternalPlanWithRosmodelParser.g:167:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigRosSoftwareComponentAccess().getConfigRosSoftwareComponentAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:173:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:174:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:174:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:175:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigRosSoftwareComponentRule());
                                }


                                newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getComponentSystemCrossReference_1_0());

            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:189:3: (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Colon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:190:4: otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_3);

                                    newLeafNode(otherlv_2, grammarAccess.getConfigRosSoftwareComponentAccess().getColonKeyword_2_0());

                    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_10);

                                    newLeafNode(this_INDENT_3, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_1());

                    // InternalPlanWithRosmodelParser.g:198:4: (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ExecutionConfiguration) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:199:5: otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT
                            {
                            otherlv_4=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                                newLeafNode(otherlv_4, grammarAccess.getConfigRosSoftwareComponentAccess().getExecutionConfigurationKeyword_2_2_0());

                            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                                newLeafNode(this_INDENT_5, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_2_1());

                            // InternalPlanWithRosmodelParser.g:207:5: ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+
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
                                    // InternalPlanWithRosmodelParser.g:208:6: (lv_executionConfiguration_6_0= ruleConfigRosParameter )
                                    {
                                    // InternalPlanWithRosmodelParser.g:208:6: (lv_executionConfiguration_6_0= ruleConfigRosParameter )
                                    // InternalPlanWithRosmodelParser.g:209:7: lv_executionConfiguration_6_0= ruleConfigRosParameter
                                    {

                                                                newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getExecutionConfigurationConfigRosParameterParserRuleCall_2_2_2_0());

                                    pushFollow(FOLLOW_12);
                                    lv_executionConfiguration_6_0=ruleConfigRosParameter();

                                    state._fsp--;


                                                                if (current==null) {
                                                                    current = createModelElementForParent(grammarAccess.getConfigRosSoftwareComponentRule());
                                                                }
                                                                add(
                                                                    current,
                                                                    "executionConfiguration",
                                                                    lv_executionConfiguration_6_0,
                                                                    "de.fraunhofer.ipa.deployment.PlanWithRosmodel.ConfigRosParameter");
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

                            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_13);

                                                newLeafNode(this_DEDENT_7, grammarAccess.getConfigRosSoftwareComponentAccess().getDEDENTTerminalRuleCall_2_2_3());


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:231:4: (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==StartCommand) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:232:5: otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT
                            {
                            otherlv_8=(Token)match(input,StartCommand,FOLLOW_3);

                                                newLeafNode(otherlv_8, grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandKeyword_2_3_0());

                            this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                                newLeafNode(this_INDENT_9, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_3_1());


                                                newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getPreListElementParserRuleCall_2_3_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:247:5: ( (lv_startCommand_11_0= ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:248:6: (lv_startCommand_11_0= ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:248:6: (lv_startCommand_11_0= ruleEString )
                            // InternalPlanWithRosmodelParser.g:249:7: lv_startCommand_11_0= ruleEString
                            {

                                                        newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandEStringParserRuleCall_2_3_3_0());

                            pushFollow(FOLLOW_12);
                            lv_startCommand_11_0=ruleEString();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getConfigRosSoftwareComponentRule());
                                                        }
                                                        add(
                                                            current,
                                                            "startCommand",
                                                            lv_startCommand_11_0,
                                                            "de.fraunhofer.ipa.deployment.Util.EString");
                                                        afterParserOrEnumRuleCall();


                            }


                            }

                            // InternalPlanWithRosmodelParser.g:266:5: ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==HyphenMinus) ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:267:6: rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )*
                                    {

                                                            newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getPreListElementParserRuleCall_2_3_4_0());

                                    pushFollow(FOLLOW_14);
                                    rulePreListElement();

                                    state._fsp--;


                                                            afterParserOrEnumRuleCall();

                                    // InternalPlanWithRosmodelParser.g:274:6: ( (lv_startCommand_13_0= ruleEString ) )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                        case 1 :
                                            // InternalPlanWithRosmodelParser.g:275:7: (lv_startCommand_13_0= ruleEString )
                                            {
                                            // InternalPlanWithRosmodelParser.g:275:7: (lv_startCommand_13_0= ruleEString )
                                            // InternalPlanWithRosmodelParser.g:276:8: lv_startCommand_13_0= ruleEString
                                            {

                                                                            newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandEStringParserRuleCall_2_3_4_1_0());

                                            pushFollow(FOLLOW_14);
                                            lv_startCommand_13_0=ruleEString();

                                            state._fsp--;


                                                                            if (current==null) {
                                                                                current = createModelElementForParent(grammarAccess.getConfigRosSoftwareComponentRule());
                                                                            }
                                                                            add(
                                                                                current,
                                                                                "startCommand",
                                                                                lv_startCommand_13_0,
                                                                                "de.fraunhofer.ipa.deployment.Util.EString");
                                                                            afterParserOrEnumRuleCall();


                                            }


                                            }
                                            break;

                                        default :
                                            break loop3;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                                newLeafNode(this_DEDENT_14, grammarAccess.getConfigRosSoftwareComponentAccess().getDEDENTTerminalRuleCall_2_3_5());


                            }
                            break;

                    }

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                                    newLeafNode(this_DEDENT_15, grammarAccess.getConfigRosSoftwareComponentAccess().getDEDENTTerminalRuleCall_2_4());


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
    // $ANTLR end "ruleConfigRosSoftwareComponent"


    // $ANTLR start "entryRuleAbstractComputationAssignment"
    // InternalPlanWithRosmodelParser.g:308:1: entryRuleAbstractComputationAssignment returns [EObject current=null] : iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF ;
    public final EObject entryRuleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationAssignment = null;


        try {
            // InternalPlanWithRosmodelParser.g:308:70: (iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF )
            // InternalPlanWithRosmodelParser.g:309:2: iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF
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
    // InternalPlanWithRosmodelParser.g:315:1: ruleAbstractComputationAssignment returns [EObject current=null] : this_RossystemAssignment_0= ruleRossystemAssignment ;
    public final EObject ruleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_RossystemAssignment_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:321:2: (this_RossystemAssignment_0= ruleRossystemAssignment )
            // InternalPlanWithRosmodelParser.g:322:2: this_RossystemAssignment_0= ruleRossystemAssignment
            {

                    newCompositeNode(grammarAccess.getAbstractComputationAssignmentAccess().getRossystemAssignmentParserRuleCall());

            pushFollow(FOLLOW_2);
            this_RossystemAssignment_0=ruleRossystemAssignment();

            state._fsp--;


                    current = this_RossystemAssignment_0;
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


    // $ANTLR start "entryRuleRossystemAssignment"
    // InternalPlanWithRosmodelParser.g:333:1: entryRuleRossystemAssignment returns [EObject current=null] : iv_ruleRossystemAssignment= ruleRossystemAssignment EOF ;
    public final EObject entryRuleRossystemAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRossystemAssignment = null;


        try {
            // InternalPlanWithRosmodelParser.g:333:60: (iv_ruleRossystemAssignment= ruleRossystemAssignment EOF )
            // InternalPlanWithRosmodelParser.g:334:2: iv_ruleRossystemAssignment= ruleRossystemAssignment EOF
            {
             newCompositeNode(grammarAccess.getRossystemAssignmentRule());
            pushFollow(FOLLOW_1);
            iv_ruleRossystemAssignment=ruleRossystemAssignment();

            state._fsp--;

             current =iv_ruleRossystemAssignment;
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
    // $ANTLR end "entryRuleRossystemAssignment"


    // $ANTLR start "ruleRossystemAssignment"
    // InternalPlanWithRosmodelParser.g:340:1: ruleRossystemAssignment returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT ) ;
    public final EObject ruleRossystemAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_DEDENT_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_softwareComponents_11_0 = null;

        EObject lv_softwareComponents_13_0 = null;

        EObject lv_middleware_16_0 = null;

        EObject lv_runtimeType_18_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:346:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:347:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:347:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:348:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT
            {

                        newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getRossystemAssignmentAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:359:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:360:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:360:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:361:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                }
                                set(
                                    current,
                                    "name",
                                    lv_name_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_15);

                        newLeafNode(this_INDENT_3, grammarAccess.getRossystemAssignmentAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,ExecutedBy,FOLLOW_5);

                        newLeafNode(otherlv_4, grammarAccess.getRossystemAssignmentAccess().getExecutedByKeyword_4());

            // InternalPlanWithRosmodelParser.g:386:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:387:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:387:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:388:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getRossystemAssignmentRule());
                                }


                                newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getExecutedByComputationDeviceInstanceCrossReference_5_0());

            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Version,FOLLOW_5);

                        newLeafNode(otherlv_6, grammarAccess.getRossystemAssignmentAccess().getVersionKeyword_6());

            // InternalPlanWithRosmodelParser.g:406:3: ( (lv_version_7_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:407:4: (lv_version_7_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:407:4: (lv_version_7_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:408:5: lv_version_7_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getVersionEStringParserRuleCall_7_0());

            pushFollow(FOLLOW_17);
            lv_version_7_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                }
                                set(
                                    current,
                                    "version",
                                    lv_version_7_0,
                                    "de.fraunhofer.ipa.deployment.Util.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_8=(Token)match(input,SoftwareComponents,FOLLOW_3);

                        newLeafNode(otherlv_8, grammarAccess.getRossystemAssignmentAccess().getSoftwareComponentsKeyword_8());

            this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_9, grammarAccess.getRossystemAssignmentAccess().getINDENTTerminalRuleCall_9());


                        newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getPreListElementParserRuleCall_10());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:440:3: ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) )
            // InternalPlanWithRosmodelParser.g:441:4: (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent )
            {
            // InternalPlanWithRosmodelParser.g:441:4: (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent )
            // InternalPlanWithRosmodelParser.g:442:5: lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent
            {

                                newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getSoftwareComponentsConfigRosSoftwareComponentParserRuleCall_11_0());

            pushFollow(FOLLOW_12);
            lv_softwareComponents_11_0=ruleConfigRosSoftwareComponent();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                }
                                add(
                                    current,
                                    "softwareComponents",
                                    lv_softwareComponents_11_0,
                                    "de.fraunhofer.ipa.deployment.PlanWithRosmodel.ConfigRosSoftwareComponent");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:459:3: ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==HyphenMinus) ) {
                    alt7=1;
                }


                switch (alt7) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:460:4: rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) )
                    {

                                    newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getPreListElementParserRuleCall_12_0());

                    pushFollow(FOLLOW_5);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:467:4: ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) )
                    // InternalPlanWithRosmodelParser.g:468:5: (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent )
                    {
                    // InternalPlanWithRosmodelParser.g:468:5: (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent )
                    // InternalPlanWithRosmodelParser.g:469:6: lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent
                    {

                                            newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getSoftwareComponentsConfigRosSoftwareComponentParserRuleCall_12_1_0());

                    pushFollow(FOLLOW_12);
                    lv_softwareComponents_13_0=ruleConfigRosSoftwareComponent();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                            }
                                            add(
                                                current,
                                                "softwareComponents",
                                                lv_softwareComponents_13_0,
                                                "de.fraunhofer.ipa.deployment.PlanWithRosmodel.ConfigRosSoftwareComponent");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

                default :
                    break loop7;
                }
            } while (true);

            this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_18);

                        newLeafNode(this_DEDENT_14, grammarAccess.getRossystemAssignmentAccess().getDEDENTTerminalRuleCall_13());

            // InternalPlanWithRosmodelParser.g:491:3: (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Middleware) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:492:4: otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) )
                    {
                    otherlv_15=(Token)match(input,Middleware,FOLLOW_19);

                                    newLeafNode(otherlv_15, grammarAccess.getRossystemAssignmentAccess().getMiddlewareKeyword_14_0());

                    // InternalPlanWithRosmodelParser.g:496:4: ( (lv_middleware_16_0= ruleMiddleware ) )
                    // InternalPlanWithRosmodelParser.g:497:5: (lv_middleware_16_0= ruleMiddleware )
                    {
                    // InternalPlanWithRosmodelParser.g:497:5: (lv_middleware_16_0= ruleMiddleware )
                    // InternalPlanWithRosmodelParser.g:498:6: lv_middleware_16_0= ruleMiddleware
                    {

                                            newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getMiddlewareMiddlewareParserRuleCall_14_1_0());

                    pushFollow(FOLLOW_20);
                    lv_middleware_16_0=ruleMiddleware();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "middleware",
                                                lv_middleware_16_0,
                                                "de.fraunhofer.ipa.deployment.Plan.Middleware");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:516:3: (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RuntimeType) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:517:4: otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) )
                    {
                    otherlv_17=(Token)match(input,RuntimeType,FOLLOW_3);

                                    newLeafNode(otherlv_17, grammarAccess.getRossystemAssignmentAccess().getRuntimeTypeKeyword_15_0());

                    // InternalPlanWithRosmodelParser.g:521:4: ( (lv_runtimeType_18_0= ruleAbstractRuntime ) )
                    // InternalPlanWithRosmodelParser.g:522:5: (lv_runtimeType_18_0= ruleAbstractRuntime )
                    {
                    // InternalPlanWithRosmodelParser.g:522:5: (lv_runtimeType_18_0= ruleAbstractRuntime )
                    // InternalPlanWithRosmodelParser.g:523:6: lv_runtimeType_18_0= ruleAbstractRuntime
                    {

                                            newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getRuntimeTypeAbstractRuntimeParserRuleCall_15_1_0());

                    pushFollow(FOLLOW_8);
                    lv_runtimeType_18_0=ruleAbstractRuntime();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "runtimeType",
                                                lv_runtimeType_18_0,
                                                "de.fraunhofer.ipa.deployment.Plan.AbstractRuntime");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_19=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_19, grammarAccess.getRossystemAssignmentAccess().getDEDENTTerminalRuleCall_16());


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
    // $ANTLR end "ruleRossystemAssignment"


    // $ANTLR start "entryRuleConfigRosParameter"
    // InternalPlanWithRosmodelParser.g:549:1: entryRuleConfigRosParameter returns [EObject current=null] : iv_ruleConfigRosParameter= ruleConfigRosParameter EOF ;
    public final EObject entryRuleConfigRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigRosParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:549:59: (iv_ruleConfigRosParameter= ruleConfigRosParameter EOF )
            // InternalPlanWithRosmodelParser.g:550:2: iv_ruleConfigRosParameter= ruleConfigRosParameter EOF
            {
             newCompositeNode(grammarAccess.getConfigRosParameterRule());
            pushFollow(FOLLOW_1);
            iv_ruleConfigRosParameter=ruleConfigRosParameter();

            state._fsp--;

             current =iv_ruleConfigRosParameter;
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
    // $ANTLR end "entryRuleConfigRosParameter"


    // $ANTLR start "ruleConfigRosParameter"
    // InternalPlanWithRosmodelParser.g:556:1: ruleConfigRosParameter returns [EObject current=null] : ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) ;
    public final EObject ruleConfigRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_DEDENT_8=null;
        EObject lv_value_7_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:562:2: ( ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:563:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:563:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:564:3: rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getConfigRosParameterAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_21);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigRosParameterAccess().getFromKeyword_1());

            // InternalPlanWithRosmodelParser.g:575:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:576:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:576:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:577:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigRosParameterAccess().getFromRosParameterCrossReference_2_0());

            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:591:3: (this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INDENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:592:4: this_INDENT_3= RULE_INDENT (otherlv_4= To ( ( ruleEString ) ) )? (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT
                    {
                    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_23);

                                    newLeafNode(this_INDENT_3, grammarAccess.getConfigRosParameterAccess().getINDENTTerminalRuleCall_3_0());

                    // InternalPlanWithRosmodelParser.g:596:4: (otherlv_4= To ( ( ruleEString ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==To) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:597:5: otherlv_4= To ( ( ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,To,FOLLOW_5);

                                                newLeafNode(otherlv_4, grammarAccess.getConfigRosParameterAccess().getToKeyword_3_1_0());

                            // InternalPlanWithRosmodelParser.g:601:5: ( ( ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:602:6: ( ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:602:6: ( ruleEString )
                            // InternalPlanWithRosmodelParser.g:603:7: ruleEString
                            {

                                                        if (current==null) {
                                                            current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                                        }


                                                        newCompositeNode(grammarAccess.getConfigRosParameterAccess().getToAbstractConfigPropertyCrossReference_3_1_1_0());

                            pushFollow(FOLLOW_24);
                            ruleEString();

                            state._fsp--;


                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:618:4: (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Value) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:619:5: otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) )
                            {
                            otherlv_6=(Token)match(input,Value,FOLLOW_25);

                                                newLeafNode(otherlv_6, grammarAccess.getConfigRosParameterAccess().getValueKeyword_3_2_0());

                            // InternalPlanWithRosmodelParser.g:623:5: ( (lv_value_7_0= rulePropertyValue ) )
                            // InternalPlanWithRosmodelParser.g:624:6: (lv_value_7_0= rulePropertyValue )
                            {
                            // InternalPlanWithRosmodelParser.g:624:6: (lv_value_7_0= rulePropertyValue )
                            // InternalPlanWithRosmodelParser.g:625:7: lv_value_7_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getConfigRosParameterAccess().getValuePropertyValueParserRuleCall_3_2_1_0());

                            pushFollow(FOLLOW_8);
                            lv_value_7_0=rulePropertyValue();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getConfigRosParameterRule());
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

                                    newLeafNode(this_DEDENT_8, grammarAccess.getConfigRosParameterAccess().getDEDENTTerminalRuleCall_3_3());


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
    // $ANTLR end "ruleConfigRosParameter"


    // $ANTLR start "entryRuleAbstractRealization"
    // InternalPlanWithRosmodelParser.g:652:1: entryRuleAbstractRealization returns [EObject current=null] : iv_ruleAbstractRealization= ruleAbstractRealization EOF ;
    public final EObject entryRuleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:652:60: (iv_ruleAbstractRealization= ruleAbstractRealization EOF )
            // InternalPlanWithRosmodelParser.g:653:2: iv_ruleAbstractRealization= ruleAbstractRealization EOF
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
    // InternalPlanWithRosmodelParser.g:659:1: ruleAbstractRealization returns [EObject current=null] : this_Realization_0= ruleRealization ;
    public final EObject ruleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject this_Realization_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:665:2: (this_Realization_0= ruleRealization )
            // InternalPlanWithRosmodelParser.g:666:2: this_Realization_0= ruleRealization
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
    // InternalPlanWithRosmodelParser.g:677:1: entryRuleAbstractConfigExecutionParameter returns [EObject current=null] : iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF ;
    public final EObject entryRuleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:677:73: (iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:678:2: iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:684:1: ruleAbstractConfigExecutionParameter returns [EObject current=null] : this_ConfigExecutionParameter_0= ruleConfigExecutionParameter ;
    public final EObject ruleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigExecutionParameter_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:690:2: (this_ConfigExecutionParameter_0= ruleConfigExecutionParameter )
            // InternalPlanWithRosmodelParser.g:691:2: this_ConfigExecutionParameter_0= ruleConfigExecutionParameter
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
    // InternalPlanWithRosmodelParser.g:702:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:702:52: (iv_ruleRealization= ruleRealization EOF )
            // InternalPlanWithRosmodelParser.g:703:2: iv_ruleRealization= ruleRealization EOF
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
    // InternalPlanWithRosmodelParser.g:709:1: ruleRealization returns [EObject current=null] : ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_realizations_3_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:715:2: ( ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:716:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:716:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:717:3: () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:717:3: ()
            // InternalPlanWithRosmodelParser.g:718:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRealizationAccess().getRealizationAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:724:3: (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Assignment) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:725:4: otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Assignment,FOLLOW_3);

                                    newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getAssignmentKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_2, grammarAccess.getRealizationAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanWithRosmodelParser.g:733:4: ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==HyphenMinus) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:734:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            {
                            // InternalPlanWithRosmodelParser.g:734:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            // InternalPlanWithRosmodelParser.g:735:6: lv_realizations_3_0= ruleAbstractComputationAssignment
                            {

                                                    newCompositeNode(grammarAccess.getRealizationAccess().getRealizationsAbstractComputationAssignmentParserRuleCall_1_2_0());

                            pushFollow(FOLLOW_12);
                            lv_realizations_3_0=ruleAbstractComputationAssignment();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getRealizationRule());
                                                    }
                                                    add(
                                                        current,
                                                        "realizations",
                                                        lv_realizations_3_0,
                                                        "de.fraunhofer.ipa.deployment.PlanWithRosmodel.AbstractComputationAssignment");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
    // InternalPlanWithRosmodelParser.g:761:1: entryRuleConfigSoftwareComponent returns [EObject current=null] : iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF ;
    public final EObject entryRuleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSoftwareComponent = null;


        try {
            // InternalPlanWithRosmodelParser.g:761:64: (iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF )
            // InternalPlanWithRosmodelParser.g:762:2: iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF
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
    // InternalPlanWithRosmodelParser.g:768:1: ruleConfigSoftwareComponent returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:774:2: ( ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:775:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:775:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:776:3: ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:776:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:777:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:777:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:778:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigSoftwareComponentRule());
                                }


                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getComponentAbstractComputationAssignmentTargetCrossReference_0_0());

            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:792:3: (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:793:4: otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_26);

                                    newLeafNode(otherlv_1, grammarAccess.getConfigSoftwareComponentAccess().getColonKeyword_1_0());

                    // InternalPlanWithRosmodelParser.g:797:4: (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_INDENT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:798:5: this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT
                            {
                            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_27);

                                                newLeafNode(this_INDENT_2, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_0());

                            otherlv_3=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                                newLeafNode(otherlv_3, grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationKeyword_1_1_1());

                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                                newLeafNode(this_INDENT_4, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_2());

                            // InternalPlanWithRosmodelParser.g:810:5: ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==HyphenMinus) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:811:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    {
                                    // InternalPlanWithRosmodelParser.g:811:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    // InternalPlanWithRosmodelParser.g:812:7: lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter
                                    {

                                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationAbstractConfigExecutionParameterParserRuleCall_1_1_3_0());

                                    pushFollow(FOLLOW_12);
                                    lv_executionConfiguration_5_0=ruleAbstractConfigExecutionParameter();

                                    state._fsp--;


                                                                if (current==null) {
                                                                    current = createModelElementForParent(grammarAccess.getConfigSoftwareComponentRule());
                                                                }
                                                                add(
                                                                    current,
                                                                    "executionConfiguration",
                                                                    lv_executionConfiguration_5_0,
                                                                    "de.fraunhofer.ipa.deployment.Plan.AbstractConfigExecutionParameter");
                                                                afterParserOrEnumRuleCall();


                                    }


                                    }
                                    break;

                                default :
                                    if ( cnt15 >= 1 ) break loop15;
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);

                            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_13);

                                                newLeafNode(this_DEDENT_6, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_1_4());


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:834:4: (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==StartCommand) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:835:5: otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT
                            {
                            otherlv_7=(Token)match(input,StartCommand,FOLLOW_3);

                                                newLeafNode(otherlv_7, grammarAccess.getConfigSoftwareComponentAccess().getStartCommandKeyword_1_2_0());

                            this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                                newLeafNode(this_INDENT_8, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_2_1());


                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:850:5: ( (lv_startCommand_10_0= ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:851:6: (lv_startCommand_10_0= ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:851:6: (lv_startCommand_10_0= ruleEString )
                            // InternalPlanWithRosmodelParser.g:852:7: lv_startCommand_10_0= ruleEString
                            {

                                                        newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_2_3_0());

                            pushFollow(FOLLOW_12);
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

                            // InternalPlanWithRosmodelParser.g:869:5: ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==HyphenMinus) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:870:6: rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )*
                                    {

                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_4_0());

                                    pushFollow(FOLLOW_14);
                                    rulePreListElement();

                                    state._fsp--;


                                                            afterParserOrEnumRuleCall();

                                    // InternalPlanWithRosmodelParser.g:877:6: ( (lv_startCommand_12_0= ruleEString ) )*
                                    loop17:
                                    do {
                                        int alt17=2;
                                        int LA17_0 = input.LA(1);

                                        if ( (LA17_0==RULE_ID||LA17_0==RULE_STRING) ) {
                                            alt17=1;
                                        }


                                        switch (alt17) {
                                        case 1 :
                                            // InternalPlanWithRosmodelParser.g:878:7: (lv_startCommand_12_0= ruleEString )
                                            {
                                            // InternalPlanWithRosmodelParser.g:878:7: (lv_startCommand_12_0= ruleEString )
                                            // InternalPlanWithRosmodelParser.g:879:8: lv_startCommand_12_0= ruleEString
                                            {

                                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_2_4_1_0());

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
                                            break loop17;
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


    // $ANTLR start "entryRuleMiddleware"
    // InternalPlanWithRosmodelParser.g:911:1: entryRuleMiddleware returns [EObject current=null] : iv_ruleMiddleware= ruleMiddleware EOF ;
    public final EObject entryRuleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:911:51: (iv_ruleMiddleware= ruleMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:912:2: iv_ruleMiddleware= ruleMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:918:1: ruleMiddleware returns [EObject current=null] : this_RosMiddleware_0= ruleRosMiddleware ;
    public final EObject ruleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_RosMiddleware_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:924:2: (this_RosMiddleware_0= ruleRosMiddleware )
            // InternalPlanWithRosmodelParser.g:925:2: this_RosMiddleware_0= ruleRosMiddleware
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
    // InternalPlanWithRosmodelParser.g:936:1: entryRuleRosMiddleware returns [EObject current=null] : iv_ruleRosMiddleware= ruleRosMiddleware EOF ;
    public final EObject entryRuleRosMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:936:54: (iv_ruleRosMiddleware= ruleRosMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:937:2: iv_ruleRosMiddleware= ruleRosMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:943:1: ruleRosMiddleware returns [EObject current=null] : ( (lv_value_0_0= ruleROSDistro ) ) ;
    public final EObject ruleRosMiddleware() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:949:2: ( ( (lv_value_0_0= ruleROSDistro ) ) )
            // InternalPlanWithRosmodelParser.g:950:2: ( (lv_value_0_0= ruleROSDistro ) )
            {
            // InternalPlanWithRosmodelParser.g:950:2: ( (lv_value_0_0= ruleROSDistro ) )
            // InternalPlanWithRosmodelParser.g:951:3: (lv_value_0_0= ruleROSDistro )
            {
            // InternalPlanWithRosmodelParser.g:951:3: (lv_value_0_0= ruleROSDistro )
            // InternalPlanWithRosmodelParser.g:952:4: lv_value_0_0= ruleROSDistro
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
                                "de.fraunhofer.ipa.deployment.Plan.ROSDistro");
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


    // $ANTLR start "entryRuleAbstractRuntime"
    // InternalPlanWithRosmodelParser.g:972:1: entryRuleAbstractRuntime returns [EObject current=null] : iv_ruleAbstractRuntime= ruleAbstractRuntime EOF ;
    public final EObject entryRuleAbstractRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRuntime = null;


        try {
            // InternalPlanWithRosmodelParser.g:972:56: (iv_ruleAbstractRuntime= ruleAbstractRuntime EOF )
            // InternalPlanWithRosmodelParser.g:973:2: iv_ruleAbstractRuntime= ruleAbstractRuntime EOF
            {
             newCompositeNode(grammarAccess.getAbstractRuntimeRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRuntime=ruleAbstractRuntime();

            state._fsp--;

             current =iv_ruleAbstractRuntime;
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
    // $ANTLR end "entryRuleAbstractRuntime"


    // $ANTLR start "ruleAbstractRuntime"
    // InternalPlanWithRosmodelParser.g:979:1: ruleAbstractRuntime returns [EObject current=null] : this_ContainerRuntime_0= ruleContainerRuntime ;
    public final EObject ruleAbstractRuntime() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerRuntime_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:985:2: (this_ContainerRuntime_0= ruleContainerRuntime )
            // InternalPlanWithRosmodelParser.g:986:2: this_ContainerRuntime_0= ruleContainerRuntime
            {

                    newCompositeNode(grammarAccess.getAbstractRuntimeAccess().getContainerRuntimeParserRuleCall());

            pushFollow(FOLLOW_2);
            this_ContainerRuntime_0=ruleContainerRuntime();

            state._fsp--;


                    current = this_ContainerRuntime_0;
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
    // $ANTLR end "ruleAbstractRuntime"


    // $ANTLR start "entryRuleContainerRuntime"
    // InternalPlanWithRosmodelParser.g:997:1: entryRuleContainerRuntime returns [EObject current=null] : iv_ruleContainerRuntime= ruleContainerRuntime EOF ;
    public final EObject entryRuleContainerRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerRuntime = null;


        try {
            // InternalPlanWithRosmodelParser.g:997:57: (iv_ruleContainerRuntime= ruleContainerRuntime EOF )
            // InternalPlanWithRosmodelParser.g:998:2: iv_ruleContainerRuntime= ruleContainerRuntime EOF
            {
             newCompositeNode(grammarAccess.getContainerRuntimeRule());
            pushFollow(FOLLOW_1);
            iv_ruleContainerRuntime=ruleContainerRuntime();

            state._fsp--;

             current =iv_ruleContainerRuntime;
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
    // $ANTLR end "entryRuleContainerRuntime"


    // $ANTLR start "ruleContainerRuntime"
    // InternalPlanWithRosmodelParser.g:1004:1: ruleContainerRuntime returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleContainerRuntime() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_opertingSystemResource_7_0 = null;

        EObject lv_opertingSystemResource_9_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1010:2: ( ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1011:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1011:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1012:3: () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1012:3: ()
            // InternalPlanWithRosmodelParser.g:1013:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getContainerRuntimeAccess().getContainerRuntimeAction_0(),
                                current);


            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_28);

                        newLeafNode(this_INDENT_1, grammarAccess.getContainerRuntimeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Type,FOLLOW_29);

                        newLeafNode(otherlv_2, grammarAccess.getContainerRuntimeAccess().getTypeKeyword_2());

            // InternalPlanWithRosmodelParser.g:1027:3: ( (lv_type_3_0= ruleRunTimeType ) )
            // InternalPlanWithRosmodelParser.g:1028:4: (lv_type_3_0= ruleRunTimeType )
            {
            // InternalPlanWithRosmodelParser.g:1028:4: (lv_type_3_0= ruleRunTimeType )
            // InternalPlanWithRosmodelParser.g:1029:5: lv_type_3_0= ruleRunTimeType
            {

                                newCompositeNode(grammarAccess.getContainerRuntimeAccess().getTypeRunTimeTypeEnumRuleCall_3_0());

            pushFollow(FOLLOW_30);
            lv_type_3_0=ruleRunTimeType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getContainerRuntimeRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_3_0,
                                    "de.fraunhofer.ipa.deployment.Util.RunTimeType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:1046:3: (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Resource) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1047:4: otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,Resource,FOLLOW_3);

                                    newLeafNode(otherlv_4, grammarAccess.getContainerRuntimeAccess().getResourceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_5, grammarAccess.getContainerRuntimeAccess().getINDENTTerminalRuleCall_4_1());


                                    newCompositeNode(grammarAccess.getContainerRuntimeAccess().getPreListElementParserRuleCall_4_2());

                    pushFollow(FOLLOW_4);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:1062:4: ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) )
                    // InternalPlanWithRosmodelParser.g:1063:5: (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce )
                    {
                    // InternalPlanWithRosmodelParser.g:1063:5: (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce )
                    // InternalPlanWithRosmodelParser.g:1064:6: lv_opertingSystemResource_7_0= ruleOperatingSystemResouce
                    {

                                            newCompositeNode(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceOperatingSystemResouceParserRuleCall_4_3_0());

                    pushFollow(FOLLOW_12);
                    lv_opertingSystemResource_7_0=ruleOperatingSystemResouce();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getContainerRuntimeRule());
                                            }
                                            add(
                                                current,
                                                "opertingSystemResource",
                                                lv_opertingSystemResource_7_0,
                                                "de.fraunhofer.ipa.deployment.Util.OperatingSystemResouce");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalPlanWithRosmodelParser.g:1081:4: ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==HyphenMinus) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:1082:5: rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+
                            {

                                                newCompositeNode(grammarAccess.getContainerRuntimeAccess().getPreListElementParserRuleCall_4_4_0());

                            pushFollow(FOLLOW_4);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:1089:5: ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==Name) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:1090:6: (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce )
                                    {
                                    // InternalPlanWithRosmodelParser.g:1090:6: (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce )
                                    // InternalPlanWithRosmodelParser.g:1091:7: lv_opertingSystemResource_9_0= ruleOperatingSystemResouce
                                    {

                                                                newCompositeNode(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceOperatingSystemResouceParserRuleCall_4_4_1_0());

                                    pushFollow(FOLLOW_31);
                                    lv_opertingSystemResource_9_0=ruleOperatingSystemResouce();

                                    state._fsp--;


                                                                if (current==null) {
                                                                    current = createModelElementForParent(grammarAccess.getContainerRuntimeRule());
                                                                }
                                                                add(
                                                                    current,
                                                                    "opertingSystemResource",
                                                                    lv_opertingSystemResource_9_0,
                                                                    "de.fraunhofer.ipa.deployment.Util.OperatingSystemResouce");
                                                                afterParserOrEnumRuleCall();


                                    }


                                    }
                                    break;

                                default :
                                    if ( cnt21 >= 1 ) break loop21;
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);


                            }
                            break;

                    }

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                    newLeafNode(this_DEDENT_10, grammarAccess.getContainerRuntimeAccess().getDEDENTTerminalRuleCall_4_5());


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getContainerRuntimeAccess().getDEDENTTerminalRuleCall_5());


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
    // $ANTLR end "ruleContainerRuntime"


    // $ANTLR start "entryRuleConfigExecutionParameter"
    // InternalPlanWithRosmodelParser.g:1122:1: entryRuleConfigExecutionParameter returns [EObject current=null] : iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF ;
    public final EObject entryRuleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:1122:65: (iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:1123:2: iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:1129:1: ruleConfigExecutionParameter returns [EObject current=null] : ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1135:2: ( ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1136:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1136:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1137:3: () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1137:3: ()
            // InternalPlanWithRosmodelParser.g:1138:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigExecutionParameterAccess().getConfigExecutionParameterAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_21);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_2, grammarAccess.getConfigExecutionParameterAccess().getFromKeyword_2());

            // InternalPlanWithRosmodelParser.g:1155:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1156:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1156:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:1157:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getFromExecutionParameterCrossReference_3_0());

            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_23);

                        newLeafNode(this_INDENT_4, grammarAccess.getConfigExecutionParameterAccess().getINDENTTerminalRuleCall_4());

            // InternalPlanWithRosmodelParser.g:1175:3: (otherlv_5= To ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==To) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1176:4: otherlv_5= To ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,To,FOLLOW_5);

                                    newLeafNode(otherlv_5, grammarAccess.getConfigExecutionParameterAccess().getToKeyword_5_0());

                    // InternalPlanWithRosmodelParser.g:1180:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1181:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1181:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:1182:6: ruleEString
                    {

                                            if (current==null) {
                                                current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                            }


                                            newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getToAbstractConfigPropertyCrossReference_5_1_0());

                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:1197:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1198:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_7, grammarAccess.getConfigExecutionParameterAccess().getValueKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1202:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1203:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1203:5: (lv_value_8_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1204:6: lv_value_8_0= rulePropertyValue
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


    // $ANTLR start "entryRuleOperatingSystemResouce"
    // InternalPlanWithRosmodelParser.g:1230:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalPlanWithRosmodelParser.g:1230:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalPlanWithRosmodelParser.g:1231:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
            {
             newCompositeNode(grammarAccess.getOperatingSystemResouceRule());
            pushFollow(FOLLOW_1);
            iv_ruleOperatingSystemResouce=ruleOperatingSystemResouce();

            state._fsp--;

             current =iv_ruleOperatingSystemResouce;
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
    // $ANTLR end "entryRuleOperatingSystemResouce"


    // $ANTLR start "ruleOperatingSystemResouce"
    // InternalPlanWithRosmodelParser.g:1237:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_properties_8_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1243:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1244:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1244:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1245:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1245:3: ()
            // InternalPlanWithRosmodelParser.g:1246:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1256:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1257:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1257:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1258:5: lv_name_2_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
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

                        newLeafNode(this_INDENT_3, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_32);

                        newLeafNode(otherlv_4, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_4());

            // InternalPlanWithRosmodelParser.g:1283:3: ( (lv_type_5_0= ruleOpertingSystemResouceType ) )
            // InternalPlanWithRosmodelParser.g:1284:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            {
            // InternalPlanWithRosmodelParser.g:1284:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            // InternalPlanWithRosmodelParser.g:1285:5: lv_type_5_0= ruleOpertingSystemResouceType
            {

                                newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_33);
            lv_type_5_0=ruleOpertingSystemResouceType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                }
                                set(
                                    current,
                                    "type",
                                    lv_type_5_0,
                                    "de.fraunhofer.ipa.deployment.Util.OpertingSystemResouceType");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:1302:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Properties) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1303:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_7, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalPlanWithRosmodelParser.g:1311:4: ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==HyphenMinus) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:1312:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                            {
                            // InternalPlanWithRosmodelParser.g:1312:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                            // InternalPlanWithRosmodelParser.g:1313:6: lv_properties_8_0= ruleAbstractOperatingSystemProperty
                            {

                                                    newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_6_2_0());

                            pushFollow(FOLLOW_12);
                            lv_properties_8_0=ruleAbstractOperatingSystemProperty();

                            state._fsp--;


                                                    if (current==null) {
                                                        current = createModelElementForParent(grammarAccess.getOperatingSystemResouceRule());
                                                    }
                                                    add(
                                                        current,
                                                        "properties",
                                                        lv_properties_8_0,
                                                        "de.fraunhofer.ipa.deployment.Util.AbstractOperatingSystemProperty");
                                                    afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_8);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_6_3());


                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_10, grammarAccess.getOperatingSystemResouceAccess().getDEDENTTerminalRuleCall_7());


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
    // $ANTLR end "ruleOperatingSystemResouce"


    // $ANTLR start "entryRuleAbstractOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1343:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1343:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1344:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleAbstractOperatingSystemProperty=ruleAbstractOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleAbstractOperatingSystemProperty;
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
    // $ANTLR end "entryRuleAbstractOperatingSystemProperty"


    // $ANTLR start "ruleAbstractOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1350:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1356:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalPlanWithRosmodelParser.g:1357:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalPlanWithRosmodelParser.g:1357:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==HyphenMinus) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==Name) ) {
                    int LA28_2 = input.LA(3);

                    if ( (LA28_2==Os_version) ) {
                        alt28=2;
                    }
                    else if ( (LA28_2==Os_name) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1358:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyAccess().getNameOperatingSystemPropertyParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_NameOperatingSystemProperty_0=ruleNameOperatingSystemProperty();

                    state._fsp--;


                                current = this_NameOperatingSystemProperty_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:1367:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
                    {

                                newCompositeNode(grammarAccess.getAbstractOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_VersionOperatingSystemProperty_1=ruleVersionOperatingSystemProperty();

                    state._fsp--;


                                current = this_VersionOperatingSystemProperty_1;
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
    // $ANTLR end "ruleAbstractOperatingSystemProperty"


    // $ANTLR start "entryRuleNameOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1379:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1379:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1380:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getNameOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleNameOperatingSystemProperty=ruleNameOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleNameOperatingSystemProperty;
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
    // $ANTLR end "entryRuleNameOperatingSystemProperty"


    // $ANTLR start "ruleNameOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1386:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_10_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1392:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1393:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1393:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1394:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1394:3: ()
            // InternalPlanWithRosmodelParser.g:1395:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_34);

                        newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalPlanWithRosmodelParser.g:1412:3: ( (lv_name_3_0= Os_name ) )
            // InternalPlanWithRosmodelParser.g:1413:4: (lv_name_3_0= Os_name )
            {
            // InternalPlanWithRosmodelParser.g:1413:4: (lv_name_3_0= Os_name )
            // InternalPlanWithRosmodelParser.g:1414:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_36);

                        newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalPlanWithRosmodelParser.g:1434:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1435:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1435:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1436:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_37);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:1453:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Description) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1454:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1458:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1459:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1459:5: (lv_description_8_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1460:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_24);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
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

            // InternalPlanWithRosmodelParser.g:1478:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Value) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1479:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalPlanWithRosmodelParser.g:1483:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1484:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1484:5: (lv_value_10_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1485:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_8);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getNameOperatingSystemPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_10_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getNameOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleNameOperatingSystemProperty"


    // $ANTLR start "entryRuleVersionOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1511:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1511:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1512:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyRule());
            pushFollow(FOLLOW_1);
            iv_ruleVersionOperatingSystemProperty=ruleVersionOperatingSystemProperty();

            state._fsp--;

             current =iv_ruleVersionOperatingSystemProperty;
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
    // $ANTLR end "entryRuleVersionOperatingSystemProperty"


    // $ANTLR start "ruleVersionOperatingSystemProperty"
    // InternalPlanWithRosmodelParser.g:1518:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_kind_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_10_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1524:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1525:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1525:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1526:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1526:3: ()
            // InternalPlanWithRosmodelParser.g:1527:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0(),
                                current);


            }


                        newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_38);

                        newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalPlanWithRosmodelParser.g:1544:3: ( (lv_name_3_0= Os_version ) )
            // InternalPlanWithRosmodelParser.g:1545:4: (lv_name_3_0= Os_version )
            {
            // InternalPlanWithRosmodelParser.g:1545:4: (lv_name_3_0= Os_version )
            // InternalPlanWithRosmodelParser.g:1546:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_3);

                                newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                                if (current==null) {
                                    current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                                }
                                setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_36);

                        newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalPlanWithRosmodelParser.g:1566:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1567:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1567:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1568:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_37);
            lv_kind_6_0=ruleAttributeKind();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
                                }
                                set(
                                    current,
                                    "kind",
                                    lv_kind_6_0,
                                    "de.fraunhofer.ipa.deployment.Util.AttributeKind");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:1585:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1586:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1590:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1591:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1591:5: (lv_description_8_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1592:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_24);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
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

            // InternalPlanWithRosmodelParser.g:1610:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1611:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalPlanWithRosmodelParser.g:1615:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1616:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1616:5: (lv_value_10_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1617:6: lv_value_10_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_8);
                    lv_value_10_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getVersionOperatingSystemPropertyRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_10_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_11, grammarAccess.getVersionOperatingSystemPropertyAccess().getDEDENTTerminalRuleCall_9());


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
    // $ANTLR end "ruleVersionOperatingSystemProperty"


    // $ANTLR start "entryRuleAbstractProperty"
    // InternalPlanWithRosmodelParser.g:1643:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1643:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalPlanWithRosmodelParser.g:1644:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1650:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1656:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalPlanWithRosmodelParser.g:1657:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalPlanWithRosmodelParser.g:1657:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt33=5;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1658:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalPlanWithRosmodelParser.g:1667:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalPlanWithRosmodelParser.g:1676:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalPlanWithRosmodelParser.g:1685:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalPlanWithRosmodelParser.g:1694:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalPlanWithRosmodelParser.g:1706:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:1706:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalPlanWithRosmodelParser.g:1707:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalPlanWithRosmodelParser.g:1713:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1719:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:1720:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:1720:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt34=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt34=1;
                }
                break;
            case MaximumKind:
                {
                alt34=2;
                }
                break;
            case MinimumKind:
                {
                alt34=3;
                }
                break;
            case RangeKind:
                {
                alt34=4;
                }
                break;
            case SelectionKind:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1721:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalPlanWithRosmodelParser.g:1730:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalPlanWithRosmodelParser.g:1739:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalPlanWithRosmodelParser.g:1748:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalPlanWithRosmodelParser.g:1757:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalPlanWithRosmodelParser.g:1769:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalPlanWithRosmodelParser.g:1769:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalPlanWithRosmodelParser.g:1770:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalPlanWithRosmodelParser.g:1776:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1782:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1783:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1783:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1784:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1795:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1796:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1796:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1797:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_36);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1822:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1823:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1823:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1824:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_39);
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

            // InternalPlanWithRosmodelParser.g:1841:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Description) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1842:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1846:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1847:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1847:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1848:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:1866:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Value) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1867:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1871:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1872:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1872:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1873:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_41);
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

            // InternalPlanWithRosmodelParser.g:1891:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DEDENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1892:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1901:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalPlanWithRosmodelParser.g:1901:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalPlanWithRosmodelParser.g:1902:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalPlanWithRosmodelParser.g:1908:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1914:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1915:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1915:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1916:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1927:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1928:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1928:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1929:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_42);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1954:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalPlanWithRosmodelParser.g:1955:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:1955:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalPlanWithRosmodelParser.g:1956:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_39);
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

            // InternalPlanWithRosmodelParser.g:1973:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Description) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1974:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1978:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1979:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1979:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1980:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:1998:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Value) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1999:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:2003:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2004:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2004:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2005:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_41);
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

            // InternalPlanWithRosmodelParser.g:2023:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DEDENT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2024:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2033:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalPlanWithRosmodelParser.g:2033:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalPlanWithRosmodelParser.g:2034:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalPlanWithRosmodelParser.g:2040:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2046:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2047:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2047:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2048:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2059:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2060:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2060:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2061:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_43);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2086:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalPlanWithRosmodelParser.g:2087:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:2087:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalPlanWithRosmodelParser.g:2088:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_39);
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

            // InternalPlanWithRosmodelParser.g:2105:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Description) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2106:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2110:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2111:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2111:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2112:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:2130:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Value) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2131:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_25);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:2135:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2136:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2136:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2137:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_41);
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

            // InternalPlanWithRosmodelParser.g:2155:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DEDENT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2156:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2165:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalPlanWithRosmodelParser.g:2165:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalPlanWithRosmodelParser.g:2166:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalPlanWithRosmodelParser.g:2172:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2178:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2179:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2179:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2180:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2191:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2192:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2192:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2193:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_44);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2218:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:2219:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:2219:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalPlanWithRosmodelParser.g:2220:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_39);
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

            // InternalPlanWithRosmodelParser.g:2237:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Description) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2238:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2242:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2243:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2243:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2244:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:2262:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Value) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2263:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2278:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2279:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2279:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2280:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_12);
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

                    // InternalPlanWithRosmodelParser.g:2297:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==HyphenMinus) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:2298:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_25);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:2305:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalPlanWithRosmodelParser.g:2306:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalPlanWithRosmodelParser.g:2306:6: (lv_value_13_0= rulePropertyValue )
                            // InternalPlanWithRosmodelParser.g:2307:7: lv_value_13_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                            pushFollow(FOLLOW_12);
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
                            break loop45;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_41);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:2330:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DEDENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2331:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2340:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalPlanWithRosmodelParser.g:2340:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalPlanWithRosmodelParser.g:2341:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalPlanWithRosmodelParser.g:2347:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2353:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2354:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2354:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2355:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2366:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2367:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2367:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2368:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_35);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_45);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2393:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalPlanWithRosmodelParser.g:2394:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalPlanWithRosmodelParser.g:2394:4: (lv_kind_5_0= ruleRangeKind )
            // InternalPlanWithRosmodelParser.g:2395:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_39);
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

            // InternalPlanWithRosmodelParser.g:2412:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Description) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2413:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2417:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2418:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2418:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2419:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:2437:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Value) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2438:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2453:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2454:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2454:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2455:6: lv_value_11_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_11);
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

                    // InternalPlanWithRosmodelParser.g:2479:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2480:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2480:5: (lv_value_13_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2481:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_41);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:2503:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DEDENT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2504:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2513:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2513:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPlanWithRosmodelParser.g:2514:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalPlanWithRosmodelParser.g:2520:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;

        EObject this_LinuxDistributionValue_4 = null;

        EObject this_UbuntuVersionValue_5 = null;

        EObject this_PropertyValueList_6 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2526:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalPlanWithRosmodelParser.g:2527:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalPlanWithRosmodelParser.g:2527:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt51=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt51=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt51=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt51=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt51=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt51=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt51=6;
                }
                break;
            case RULE_INDENT:
                {
                alt51=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2528:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalPlanWithRosmodelParser.g:2537:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalPlanWithRosmodelParser.g:2546:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalPlanWithRosmodelParser.g:2555:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalPlanWithRosmodelParser.g:2564:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalPlanWithRosmodelParser.g:2573:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getUbuntuVersionValueParserRuleCall_5());

                    pushFollow(FOLLOW_2);
                    this_UbuntuVersionValue_5=ruleUbuntuVersionValue();

                    state._fsp--;


                                current = this_UbuntuVersionValue_5;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 7 :
                    // InternalPlanWithRosmodelParser.g:2582:3: this_PropertyValueList_6= rulePropertyValueList
                    {

                                newCompositeNode(grammarAccess.getPropertyValueAccess().getPropertyValueListParserRuleCall_6());

                    pushFollow(FOLLOW_2);
                    this_PropertyValueList_6=rulePropertyValueList();

                    state._fsp--;


                                current = this_PropertyValueList_6;
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
    // InternalPlanWithRosmodelParser.g:2594:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalPlanWithRosmodelParser.g:2594:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalPlanWithRosmodelParser.g:2595:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalPlanWithRosmodelParser.g:2601:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2607:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalPlanWithRosmodelParser.g:2608:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2608:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalPlanWithRosmodelParser.g:2609:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalPlanWithRosmodelParser.g:2609:3: (lv_value_0_0= ruleInteger0 )
            // InternalPlanWithRosmodelParser.g:2610:4: lv_value_0_0= ruleInteger0
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
    // InternalPlanWithRosmodelParser.g:2630:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalPlanWithRosmodelParser.g:2630:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalPlanWithRosmodelParser.g:2631:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalPlanWithRosmodelParser.g:2637:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2643:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalPlanWithRosmodelParser.g:2644:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2644:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalPlanWithRosmodelParser.g:2645:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalPlanWithRosmodelParser.g:2645:3: (lv_value_0_0= ruleDouble0 )
            // InternalPlanWithRosmodelParser.g:2646:4: lv_value_0_0= ruleDouble0
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
    // InternalPlanWithRosmodelParser.g:2666:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalPlanWithRosmodelParser.g:2666:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalPlanWithRosmodelParser.g:2667:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalPlanWithRosmodelParser.g:2673:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2679:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2680:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2680:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2681:3: (lv_value_0_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2681:3: (lv_value_0_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2682:4: lv_value_0_0= ruleEString
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


    // $ANTLR start "entryRulePropertyValueList"
    // InternalPlanWithRosmodelParser.g:2702:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalPlanWithRosmodelParser.g:2702:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalPlanWithRosmodelParser.g:2703:2: iv_rulePropertyValueList= rulePropertyValueList EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueListRule());
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueList=rulePropertyValueList();

            state._fsp--;

             current =iv_rulePropertyValueList;
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
    // $ANTLR end "entryRulePropertyValueList"


    // $ANTLR start "rulePropertyValueList"
    // InternalPlanWithRosmodelParser.g:2709:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2715:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:2716:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:2716:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:2717:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                        newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_25);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:2728:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalPlanWithRosmodelParser.g:2729:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalPlanWithRosmodelParser.g:2729:4: (lv_value_2_0= rulePropertyValue )
            // InternalPlanWithRosmodelParser.g:2730:5: lv_value_2_0= rulePropertyValue
            {

                                newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            pushFollow(FOLLOW_12);
            lv_value_2_0=rulePropertyValue();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getPropertyValueListRule());
                                }
                                add(
                                    current,
                                    "value",
                                    lv_value_2_0,
                                    "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:2747:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==HyphenMinus) ) {
                    alt52=1;
                }


                switch (alt52) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2748:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                    {

                                    newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                    pushFollow(FOLLOW_25);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2755:4: ( (lv_value_4_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2756:5: (lv_value_4_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2756:5: (lv_value_4_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2757:6: lv_value_4_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

                    pushFollow(FOLLOW_12);
                    lv_value_4_0=rulePropertyValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPropertyValueListRule());
                                            }
                                            add(
                                                current,
                                                "value",
                                                lv_value_4_0,
                                                "de.fraunhofer.ipa.deployment.Util.PropertyValue");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

                default :
                    break loop52;
                }
            } while (true);

            this_DEDENT_5=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_5, grammarAccess.getPropertyValueListAccess().getDEDENTTerminalRuleCall_4());


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
    // $ANTLR end "rulePropertyValueList"


    // $ANTLR start "entryRuleProcessorArchitectureValue"
    // InternalPlanWithRosmodelParser.g:2783:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2783:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalPlanWithRosmodelParser.g:2784:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalPlanWithRosmodelParser.g:2790:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2796:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalPlanWithRosmodelParser.g:2797:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalPlanWithRosmodelParser.g:2797:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalPlanWithRosmodelParser.g:2798:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalPlanWithRosmodelParser.g:2798:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalPlanWithRosmodelParser.g:2799:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalPlanWithRosmodelParser.g:2819:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2819:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalPlanWithRosmodelParser.g:2820:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalPlanWithRosmodelParser.g:2826:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2832:2: (this_ResourceType_0= ruleResourceType )
            // InternalPlanWithRosmodelParser.g:2833:2: this_ResourceType_0= ruleResourceType
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


    // $ANTLR start "entryRuleOpertingSystemResouceType"
    // InternalPlanWithRosmodelParser.g:2844:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2844:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalPlanWithRosmodelParser.g:2845:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
            {
             newCompositeNode(grammarAccess.getOpertingSystemResouceTypeRule());
            pushFollow(FOLLOW_1);
            iv_ruleOpertingSystemResouceType=ruleOpertingSystemResouceType();

            state._fsp--;

             current =iv_ruleOpertingSystemResouceType;
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
    // $ANTLR end "entryRuleOpertingSystemResouceType"


    // $ANTLR start "ruleOpertingSystemResouceType"
    // InternalPlanWithRosmodelParser.g:2851:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2857:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2858:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2858:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==LinuxOpertingSystem) ) {
                alt53=1;
            }
            else if ( (LA53_0==MacOSOpertingSystem) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2859:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemResouceTypeAccess().getLinuxOpertingSystemParserRuleCall_0());

                    pushFollow(FOLLOW_2);
                    this_LinuxOpertingSystem_0=ruleLinuxOpertingSystem();

                    state._fsp--;


                                current = this_LinuxOpertingSystem_0;
                                afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:2868:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
                    {

                                newCompositeNode(grammarAccess.getOpertingSystemResouceTypeAccess().getMacOSOpertingSystemParserRuleCall_1());

                    pushFollow(FOLLOW_2);
                    this_MacOSOpertingSystem_1=ruleMacOSOpertingSystem();

                    state._fsp--;


                                current = this_MacOSOpertingSystem_1;
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
    // $ANTLR end "ruleOpertingSystemResouceType"


    // $ANTLR start "entryRuleResourceType"
    // InternalPlanWithRosmodelParser.g:2880:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2880:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalPlanWithRosmodelParser.g:2881:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalPlanWithRosmodelParser.g:2887:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2893:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:2894:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2894:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2895:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2895:3: ()
            // InternalPlanWithRosmodelParser.g:2896:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:2902:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2903:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2903:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2904:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2925:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:2925:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:2926:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:2932:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2938:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2939:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2939:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalPlanWithRosmodelParser.g:2940:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:2940:3: ()
            // InternalPlanWithRosmodelParser.g:2941:4:
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
    // InternalPlanWithRosmodelParser.g:2955:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:2955:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:2956:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:2962:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2968:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2969:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2969:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalPlanWithRosmodelParser.g:2970:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:2970:3: ()
            // InternalPlanWithRosmodelParser.g:2971:4:
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
    // InternalPlanWithRosmodelParser.g:2985:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2985:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:2986:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:2992:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2998:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:2999:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2999:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:3000:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:3000:3: ()
            // InternalPlanWithRosmodelParser.g:3001:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:3007:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:3008:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:3008:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:3009:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:3030:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3030:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3031:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3037:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3043:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalPlanWithRosmodelParser.g:3044:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalPlanWithRosmodelParser.g:3044:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Ethernet) ) {
                alt54=1;
            }
            else if ( (LA54_0==Wlan) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3045:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalPlanWithRosmodelParser.g:3054:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalPlanWithRosmodelParser.g:3066:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3066:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3067:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3073:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3079:2: ( ( () otherlv_1= Ethernet ) )
            // InternalPlanWithRosmodelParser.g:3080:2: ( () otherlv_1= Ethernet )
            {
            // InternalPlanWithRosmodelParser.g:3080:2: ( () otherlv_1= Ethernet )
            // InternalPlanWithRosmodelParser.g:3081:3: () otherlv_1= Ethernet
            {
            // InternalPlanWithRosmodelParser.g:3081:3: ()
            // InternalPlanWithRosmodelParser.g:3082:4:
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
    // InternalPlanWithRosmodelParser.g:3096:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3096:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3097:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3103:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3109:2: ( ( () otherlv_1= Wlan ) )
            // InternalPlanWithRosmodelParser.g:3110:2: ( () otherlv_1= Wlan )
            {
            // InternalPlanWithRosmodelParser.g:3110:2: ( () otherlv_1= Wlan )
            // InternalPlanWithRosmodelParser.g:3111:3: () otherlv_1= Wlan
            {
            // InternalPlanWithRosmodelParser.g:3111:3: ()
            // InternalPlanWithRosmodelParser.g:3112:4:
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
    // InternalPlanWithRosmodelParser.g:3126:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3126:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalPlanWithRosmodelParser.g:3127:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalPlanWithRosmodelParser.g:3133:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3139:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalPlanWithRosmodelParser.g:3140:2: ( () otherlv_1= AttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:3140:2: ( () otherlv_1= AttributeKind )
            // InternalPlanWithRosmodelParser.g:3141:3: () otherlv_1= AttributeKind
            {
            // InternalPlanWithRosmodelParser.g:3141:3: ()
            // InternalPlanWithRosmodelParser.g:3142:4:
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
    // InternalPlanWithRosmodelParser.g:3156:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3156:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalPlanWithRosmodelParser.g:3157:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalPlanWithRosmodelParser.g:3163:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3169:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalPlanWithRosmodelParser.g:3170:2: ( () otherlv_1= MaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:3170:2: ( () otherlv_1= MaximumKind )
            // InternalPlanWithRosmodelParser.g:3171:3: () otherlv_1= MaximumKind
            {
            // InternalPlanWithRosmodelParser.g:3171:3: ()
            // InternalPlanWithRosmodelParser.g:3172:4:
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
    // InternalPlanWithRosmodelParser.g:3186:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3186:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalPlanWithRosmodelParser.g:3187:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalPlanWithRosmodelParser.g:3193:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3199:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalPlanWithRosmodelParser.g:3200:2: ( () otherlv_1= MinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:3200:2: ( () otherlv_1= MinimumKind )
            // InternalPlanWithRosmodelParser.g:3201:3: () otherlv_1= MinimumKind
            {
            // InternalPlanWithRosmodelParser.g:3201:3: ()
            // InternalPlanWithRosmodelParser.g:3202:4:
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
    // InternalPlanWithRosmodelParser.g:3216:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3216:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalPlanWithRosmodelParser.g:3217:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalPlanWithRosmodelParser.g:3223:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3229:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalPlanWithRosmodelParser.g:3230:2: ( () otherlv_1= SelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:3230:2: ( () otherlv_1= SelectionKind )
            // InternalPlanWithRosmodelParser.g:3231:3: () otherlv_1= SelectionKind
            {
            // InternalPlanWithRosmodelParser.g:3231:3: ()
            // InternalPlanWithRosmodelParser.g:3232:4:
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
    // InternalPlanWithRosmodelParser.g:3246:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3246:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalPlanWithRosmodelParser.g:3247:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalPlanWithRosmodelParser.g:3253:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3259:2: ( ( () otherlv_1= RangeKind ) )
            // InternalPlanWithRosmodelParser.g:3260:2: ( () otherlv_1= RangeKind )
            {
            // InternalPlanWithRosmodelParser.g:3260:2: ( () otherlv_1= RangeKind )
            // InternalPlanWithRosmodelParser.g:3261:3: () otherlv_1= RangeKind
            {
            // InternalPlanWithRosmodelParser.g:3261:3: ()
            // InternalPlanWithRosmodelParser.g:3262:4:
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
    // InternalPlanWithRosmodelParser.g:3276:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:3276:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalPlanWithRosmodelParser.g:3277:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalPlanWithRosmodelParser.g:3283:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3289:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalPlanWithRosmodelParser.g:3290:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalPlanWithRosmodelParser.g:3290:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalPlanWithRosmodelParser.g:3291:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalPlanWithRosmodelParser.g:3291:3: ()
            // InternalPlanWithRosmodelParser.g:3292:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:3298:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalPlanWithRosmodelParser.g:3299:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalPlanWithRosmodelParser.g:3299:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalPlanWithRosmodelParser.g:3300:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalPlanWithRosmodelParser.g:3321:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:3321:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalPlanWithRosmodelParser.g:3322:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalPlanWithRosmodelParser.g:3328:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3334:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalPlanWithRosmodelParser.g:3335:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalPlanWithRosmodelParser.g:3335:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalPlanWithRosmodelParser.g:3336:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalPlanWithRosmodelParser.g:3336:3: ()
            // InternalPlanWithRosmodelParser.g:3337:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:3343:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalPlanWithRosmodelParser.g:3344:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalPlanWithRosmodelParser.g:3344:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalPlanWithRosmodelParser.g:3345:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalPlanWithRosmodelParser.g:3366:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:3366:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalPlanWithRosmodelParser.g:3367:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalPlanWithRosmodelParser.g:3373:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3379:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalPlanWithRosmodelParser.g:3380:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalPlanWithRosmodelParser.g:3390:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:3390:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalPlanWithRosmodelParser.g:3391:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalPlanWithRosmodelParser.g:3397:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3403:2: (this_DECINT_0= RULE_DECINT )
            // InternalPlanWithRosmodelParser.g:3404:2: this_DECINT_0= RULE_DECINT
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
    // InternalPlanWithRosmodelParser.g:3414:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlanWithRosmodelParser.g:3414:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlanWithRosmodelParser.g:3415:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlanWithRosmodelParser.g:3421:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3427:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlanWithRosmodelParser.g:3428:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlanWithRosmodelParser.g:3428:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3429:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3437:3: this_ID_1= RULE_ID
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
    // InternalPlanWithRosmodelParser.g:3448:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:3450:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalPlanWithRosmodelParser.g:3451:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalPlanWithRosmodelParser.g:3460:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:3467:2: (kw= HyphenMinus )
            // InternalPlanWithRosmodelParser.g:3468:2: kw= HyphenMinus
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
    // InternalPlanWithRosmodelParser.g:3479:1: ruleROSDistro returns [Enumerator current=null] : ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) ;
    public final Enumerator ruleROSDistro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3485:2: ( ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) )
            // InternalPlanWithRosmodelParser.g:3486:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            {
            // InternalPlanWithRosmodelParser.g:3486:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case Noetic:
                {
                alt56=1;
                }
                break;
            case Humble:
                {
                alt56=2;
                }
                break;
            case Rolling:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3487:3: (enumLiteral_0= Noetic )
                    {
                    // InternalPlanWithRosmodelParser.g:3487:3: (enumLiteral_0= Noetic )
                    // InternalPlanWithRosmodelParser.g:3488:4: enumLiteral_0= Noetic
                    {
                    enumLiteral_0=(Token)match(input,Noetic,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3495:3: (enumLiteral_1= Humble )
                    {
                    // InternalPlanWithRosmodelParser.g:3495:3: (enumLiteral_1= Humble )
                    // InternalPlanWithRosmodelParser.g:3496:4: enumLiteral_1= Humble
                    {
                    enumLiteral_1=(Token)match(input,Humble,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1());


                    }


                    }
                    break;
                case 3 :
                    // InternalPlanWithRosmodelParser.g:3503:3: (enumLiteral_2= Rolling )
                    {
                    // InternalPlanWithRosmodelParser.g:3503:3: (enumLiteral_2= Rolling )
                    // InternalPlanWithRosmodelParser.g:3504:4: enumLiteral_2= Rolling
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
    // InternalPlanWithRosmodelParser.g:3514:1: ruleRunTimeType returns [Enumerator current=null] : (enumLiteral_0= Container ) ;
    public final Enumerator ruleRunTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3520:2: ( (enumLiteral_0= Container ) )
            // InternalPlanWithRosmodelParser.g:3521:2: (enumLiteral_0= Container )
            {
            // InternalPlanWithRosmodelParser.g:3521:2: (enumLiteral_0= Container )
            // InternalPlanWithRosmodelParser.g:3522:3: enumLiteral_0= Container
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
    // InternalPlanWithRosmodelParser.g:3531:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3537:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalPlanWithRosmodelParser.g:3538:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalPlanWithRosmodelParser.g:3538:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==X86) ) {
                alt57=1;
            }
            else if ( (LA57_0==Arm64) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3539:3: (enumLiteral_0= X86 )
                    {
                    // InternalPlanWithRosmodelParser.g:3539:3: (enumLiteral_0= X86 )
                    // InternalPlanWithRosmodelParser.g:3540:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3547:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalPlanWithRosmodelParser.g:3547:3: (enumLiteral_1= Arm64 )
                    // InternalPlanWithRosmodelParser.g:3548:4: enumLiteral_1= Arm64
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
    // InternalPlanWithRosmodelParser.g:3558:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3564:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalPlanWithRosmodelParser.g:3565:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalPlanWithRosmodelParser.g:3565:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Ubuntu) ) {
                alt58=1;
            }
            else if ( (LA58_0==Debian) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3566:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalPlanWithRosmodelParser.g:3566:3: (enumLiteral_0= Ubuntu )
                    // InternalPlanWithRosmodelParser.g:3567:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3574:3: (enumLiteral_1= Debian )
                    {
                    // InternalPlanWithRosmodelParser.g:3574:3: (enumLiteral_1= Debian )
                    // InternalPlanWithRosmodelParser.g:3575:4: enumLiteral_1= Debian
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
    // InternalPlanWithRosmodelParser.g:3585:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3591:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalPlanWithRosmodelParser.g:3592:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalPlanWithRosmodelParser.g:3592:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Focal) ) {
                alt59=1;
            }
            else if ( (LA59_0==Jammy) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3593:3: (enumLiteral_0= Focal )
                    {
                    // InternalPlanWithRosmodelParser.g:3593:3: (enumLiteral_0= Focal )
                    // InternalPlanWithRosmodelParser.g:3594:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3601:3: (enumLiteral_1= Jammy )
                    {
                    // InternalPlanWithRosmodelParser.g:3601:3: (enumLiteral_1= Jammy )
                    // InternalPlanWithRosmodelParser.g:3602:4: enumLiteral_1= Jammy
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


    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\57\1\51\1\67\2\65\1\50\1\12\5\uffff";
    static final String dfa_3s = "\1\57\1\51\1\71\2\65\1\50\1\27\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\3\uffff\1\11\1\10\6\uffff\1\12",
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1657:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0040000000001010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x02C0000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000000084000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000340000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040200800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x02AC40B480000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0060000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000800002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000800002002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000800000L});

}
