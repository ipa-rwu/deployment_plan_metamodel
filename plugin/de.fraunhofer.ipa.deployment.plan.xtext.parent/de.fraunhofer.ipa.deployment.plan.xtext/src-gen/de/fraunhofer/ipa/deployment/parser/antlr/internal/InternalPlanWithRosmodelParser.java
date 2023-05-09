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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExecutionConfiguration", "DeploymentPlanWithRos", "LinuxOpertingSystem", "MacOSOpertingSystem", "OpertingSystemType", "SoftwareComponents", "DeploymentPlan", "AttributeKind", "SelectionKind", "StartCommand", "Description", "RuntimeType", "MaximumKind", "MinimumKind", "Assignment", "ExecutedBy", "Middleware", "Properties", "Processor", "RangeKind", "Container", "DeployTo", "Ethernet", "Version", "Rolling", "Debian", "Humble", "Noetic", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "Usb", "To", "X86", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SoftwareComponents=9;
    public static final int DeployTo=25;
    public static final int AttributeKind=11;
    public static final int Noetic=31;
    public static final int Name=39;
    public static final int Assignment=18;
    public static final int Container=24;
    public static final int Debian=29;
    public static final int Version=27;
    public static final int Kind=38;
    public static final int To=43;
    public static final int ExecutedBy=19;
    public static final int Ubuntu=32;
    public static final int RULE_DEDENT=52;
    public static final int DeploymentPlanWithRos=5;
    public static final int LinuxOpertingSystem=6;
    public static final int RULE_ID=53;
    public static final int RULE_DIGIT=47;
    public static final int Middleware=20;
    public static final int SelectionKind=12;
    public static final int Arm64=34;
    public static final int RULE_INT=54;
    public static final int Ethernet=26;
    public static final int Value=33;
    public static final int RULE_ML_COMMENT=56;
    public static final int Description=14;
    public static final int Processor=22;
    public static final int StartCommand=13;
    public static final int RULE_STRING=55;
    public static final int Focal=35;
    public static final int Wlan=41;
    public static final int Properties=21;
    public static final int RULE_SL_COMMENT=50;
    public static final int HyphenMinus=45;
    public static final int OpertingSystemType=8;
    public static final int RULE_DOUBLE=49;
    public static final int X86=44;
    public static final int Colon=46;
    public static final int RULE_DECINT=48;
    public static final int DeploymentPlan=10;
    public static final int MinimumKind=17;
    public static final int EOF=-1;
    public static final int RULE_INDENT=51;
    public static final int Jammy=37;
    public static final int Usb=42;
    public static final int RULE_WS=57;
    public static final int Rolling=28;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=16;
    public static final int From=36;
    public static final int RULE_ANY_OTHER=58;
    public static final int RangeKind=23;
    public static final int Type=40;
    public static final int MacOSOpertingSystem=7;
    public static final int RuntimeType=15;
    public static final int Humble=30;

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
    // InternalPlanWithRosmodelParser.g:340:1: ruleRossystemAssignment returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )? (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )? this_DEDENT_21= RULE_DEDENT ) ;
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
        Token otherlv_19=null;
        Token this_DEDENT_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_softwareComponents_11_0 = null;

        EObject lv_softwareComponents_13_0 = null;

        EObject lv_middleware_16_0 = null;

        Enumerator lv_runtimeType_18_0 = null;

        EObject lv_opertingSystemType_20_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:346:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )? (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )? this_DEDENT_21= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:347:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )? (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )? this_DEDENT_21= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:347:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )? (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )? this_DEDENT_21= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:348:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= SoftwareComponents this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_softwareComponents_11_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_14= RULE_DEDENT (otherlv_15= Middleware ( (lv_middleware_16_0= ruleMiddleware ) ) )? (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )? (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )? this_DEDENT_21= RULE_DEDENT
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

            // InternalPlanWithRosmodelParser.g:516:3: (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RuntimeType) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:517:4: otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleRunTimeType ) )
                    {
                    otherlv_17=(Token)match(input,RuntimeType,FOLLOW_21);

                                    newLeafNode(otherlv_17, grammarAccess.getRossystemAssignmentAccess().getRuntimeTypeKeyword_15_0());

                    // InternalPlanWithRosmodelParser.g:521:4: ( (lv_runtimeType_18_0= ruleRunTimeType ) )
                    // InternalPlanWithRosmodelParser.g:522:5: (lv_runtimeType_18_0= ruleRunTimeType )
                    {
                    // InternalPlanWithRosmodelParser.g:522:5: (lv_runtimeType_18_0= ruleRunTimeType )
                    // InternalPlanWithRosmodelParser.g:523:6: lv_runtimeType_18_0= ruleRunTimeType
                    {

                                            newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getRuntimeTypeRunTimeTypeEnumRuleCall_15_1_0());

                    pushFollow(FOLLOW_22);
                    lv_runtimeType_18_0=ruleRunTimeType();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "runtimeType",
                                                lv_runtimeType_18_0,
                                                "de.fraunhofer.ipa.deployment.Util.RunTimeType");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:541:3: (otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==OpertingSystemType) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:542:4: otherlv_19= OpertingSystemType ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) )
                    {
                    otherlv_19=(Token)match(input,OpertingSystemType,FOLLOW_23);

                                    newLeafNode(otherlv_19, grammarAccess.getRossystemAssignmentAccess().getOpertingSystemTypeKeyword_16_0());

                    // InternalPlanWithRosmodelParser.g:546:4: ( (lv_opertingSystemType_20_0= ruleOpertingSystemName ) )
                    // InternalPlanWithRosmodelParser.g:547:5: (lv_opertingSystemType_20_0= ruleOpertingSystemName )
                    {
                    // InternalPlanWithRosmodelParser.g:547:5: (lv_opertingSystemType_20_0= ruleOpertingSystemName )
                    // InternalPlanWithRosmodelParser.g:548:6: lv_opertingSystemType_20_0= ruleOpertingSystemName
                    {

                                            newCompositeNode(grammarAccess.getRossystemAssignmentAccess().getOpertingSystemTypeOpertingSystemNameParserRuleCall_16_1_0());

                    pushFollow(FOLLOW_8);
                    lv_opertingSystemType_20_0=ruleOpertingSystemName();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getRossystemAssignmentRule());
                                            }
                                            set(
                                                current,
                                                "opertingSystemType",
                                                lv_opertingSystemType_20_0,
                                                "de.fraunhofer.ipa.deployment.Util.OpertingSystemName");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            this_DEDENT_21=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_21, grammarAccess.getRossystemAssignmentAccess().getDEDENTTerminalRuleCall_17());


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
    // InternalPlanWithRosmodelParser.g:574:1: entryRuleConfigRosParameter returns [EObject current=null] : iv_ruleConfigRosParameter= ruleConfigRosParameter EOF ;
    public final EObject entryRuleConfigRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigRosParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:574:59: (iv_ruleConfigRosParameter= ruleConfigRosParameter EOF )
            // InternalPlanWithRosmodelParser.g:575:2: iv_ruleConfigRosParameter= ruleConfigRosParameter EOF
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
    // InternalPlanWithRosmodelParser.g:581:1: ruleConfigRosParameter returns [EObject current=null] : ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:587:2: ( ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:588:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:588:2: ( rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:589:3: rulePreListElement otherlv_1= From ( ( ruleEString ) ) (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getConfigRosParameterAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_24);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,From,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getConfigRosParameterAccess().getFromKeyword_1());

            // InternalPlanWithRosmodelParser.g:600:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:601:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:601:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:602:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigRosParameterAccess().getFromRosParameterCrossReference_2_0());

            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:616:3: (this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INDENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:617:4: this_INDENT_3= RULE_INDENT otherlv_4= To ( ( ruleEString ) ) (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )? this_DEDENT_8= RULE_DEDENT
                    {
                    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_26);

                                    newLeafNode(this_INDENT_3, grammarAccess.getConfigRosParameterAccess().getINDENTTerminalRuleCall_3_0());

                    otherlv_4=(Token)match(input,To,FOLLOW_5);

                                    newLeafNode(otherlv_4, grammarAccess.getConfigRosParameterAccess().getToKeyword_3_1());

                    // InternalPlanWithRosmodelParser.g:625:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:626:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:626:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:627:6: ruleEString
                    {

                                            if (current==null) {
                                                current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                            }


                                            newCompositeNode(grammarAccess.getConfigRosParameterAccess().getToAbstractConfigPropertyCrossReference_3_2_0());

                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalPlanWithRosmodelParser.g:641:4: (otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Value) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:642:5: otherlv_6= Value ( (lv_value_7_0= rulePropertyValue ) )
                            {
                            otherlv_6=(Token)match(input,Value,FOLLOW_28);

                                                newLeafNode(otherlv_6, grammarAccess.getConfigRosParameterAccess().getValueKeyword_3_3_0());

                            // InternalPlanWithRosmodelParser.g:646:5: ( (lv_value_7_0= rulePropertyValue ) )
                            // InternalPlanWithRosmodelParser.g:647:6: (lv_value_7_0= rulePropertyValue )
                            {
                            // InternalPlanWithRosmodelParser.g:647:6: (lv_value_7_0= rulePropertyValue )
                            // InternalPlanWithRosmodelParser.g:648:7: lv_value_7_0= rulePropertyValue
                            {

                                                        newCompositeNode(grammarAccess.getConfigRosParameterAccess().getValuePropertyValueParserRuleCall_3_3_1_0());

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

                                    newLeafNode(this_DEDENT_8, grammarAccess.getConfigRosParameterAccess().getDEDENTTerminalRuleCall_3_4());


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
    // InternalPlanWithRosmodelParser.g:675:1: entryRuleAbstractRealization returns [EObject current=null] : iv_ruleAbstractRealization= ruleAbstractRealization EOF ;
    public final EObject entryRuleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:675:60: (iv_ruleAbstractRealization= ruleAbstractRealization EOF )
            // InternalPlanWithRosmodelParser.g:676:2: iv_ruleAbstractRealization= ruleAbstractRealization EOF
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
    // InternalPlanWithRosmodelParser.g:682:1: ruleAbstractRealization returns [EObject current=null] : this_Realization_0= ruleRealization ;
    public final EObject ruleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject this_Realization_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:688:2: (this_Realization_0= ruleRealization )
            // InternalPlanWithRosmodelParser.g:689:2: this_Realization_0= ruleRealization
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
    // InternalPlanWithRosmodelParser.g:700:1: entryRuleAbstractConfigExecutionParameter returns [EObject current=null] : iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF ;
    public final EObject entryRuleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:700:73: (iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:701:2: iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:707:1: ruleAbstractConfigExecutionParameter returns [EObject current=null] : this_ConfigExecutionParameter_0= ruleConfigExecutionParameter ;
    public final EObject ruleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigExecutionParameter_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:713:2: (this_ConfigExecutionParameter_0= ruleConfigExecutionParameter )
            // InternalPlanWithRosmodelParser.g:714:2: this_ConfigExecutionParameter_0= ruleConfigExecutionParameter
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
    // InternalPlanWithRosmodelParser.g:725:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:725:52: (iv_ruleRealization= ruleRealization EOF )
            // InternalPlanWithRosmodelParser.g:726:2: iv_ruleRealization= ruleRealization EOF
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
    // InternalPlanWithRosmodelParser.g:732:1: ruleRealization returns [EObject current=null] : ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_realizations_3_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:738:2: ( ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:739:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:739:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:740:3: () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:740:3: ()
            // InternalPlanWithRosmodelParser.g:741:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRealizationAccess().getRealizationAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:747:3: (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Assignment) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:748:4: otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Assignment,FOLLOW_3);

                                    newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getAssignmentKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_2, grammarAccess.getRealizationAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanWithRosmodelParser.g:756:4: ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+
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
                            // InternalPlanWithRosmodelParser.g:757:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            {
                            // InternalPlanWithRosmodelParser.g:757:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                            // InternalPlanWithRosmodelParser.g:758:6: lv_realizations_3_0= ruleAbstractComputationAssignment
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
    // InternalPlanWithRosmodelParser.g:784:1: entryRuleConfigSoftwareComponent returns [EObject current=null] : iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF ;
    public final EObject entryRuleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSoftwareComponent = null;


        try {
            // InternalPlanWithRosmodelParser.g:784:64: (iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF )
            // InternalPlanWithRosmodelParser.g:785:2: iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF
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
    // InternalPlanWithRosmodelParser.g:791:1: ruleConfigSoftwareComponent returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:797:2: ( ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:798:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:798:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:799:3: ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:799:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:800:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:800:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:801:5: ruleEString
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

            // InternalPlanWithRosmodelParser.g:815:3: (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:816:4: otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_29);

                                    newLeafNode(otherlv_1, grammarAccess.getConfigSoftwareComponentAccess().getColonKeyword_1_0());

                    // InternalPlanWithRosmodelParser.g:820:4: (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_INDENT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:821:5: this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT
                            {
                            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_30);

                                                newLeafNode(this_INDENT_2, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_0());

                            otherlv_3=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                                newLeafNode(otherlv_3, grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationKeyword_1_1_1());

                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                                newLeafNode(this_INDENT_4, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_2());

                            // InternalPlanWithRosmodelParser.g:833:5: ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+
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
                                    // InternalPlanWithRosmodelParser.g:834:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    {
                                    // InternalPlanWithRosmodelParser.g:834:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                    // InternalPlanWithRosmodelParser.g:835:7: lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter
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

                    // InternalPlanWithRosmodelParser.g:857:4: (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==StartCommand) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:858:5: otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT
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

                            // InternalPlanWithRosmodelParser.g:873:5: ( (lv_startCommand_10_0= ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:874:6: (lv_startCommand_10_0= ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:874:6: (lv_startCommand_10_0= ruleEString )
                            // InternalPlanWithRosmodelParser.g:875:7: lv_startCommand_10_0= ruleEString
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

                            // InternalPlanWithRosmodelParser.g:892:5: ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==HyphenMinus) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:893:6: rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )*
                                    {

                                                            newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_4_0());

                                    pushFollow(FOLLOW_14);
                                    rulePreListElement();

                                    state._fsp--;


                                                            afterParserOrEnumRuleCall();

                                    // InternalPlanWithRosmodelParser.g:900:6: ( (lv_startCommand_12_0= ruleEString ) )*
                                    loop17:
                                    do {
                                        int alt17=2;
                                        int LA17_0 = input.LA(1);

                                        if ( (LA17_0==RULE_ID||LA17_0==RULE_STRING) ) {
                                            alt17=1;
                                        }


                                        switch (alt17) {
                                        case 1 :
                                            // InternalPlanWithRosmodelParser.g:901:7: (lv_startCommand_12_0= ruleEString )
                                            {
                                            // InternalPlanWithRosmodelParser.g:901:7: (lv_startCommand_12_0= ruleEString )
                                            // InternalPlanWithRosmodelParser.g:902:8: lv_startCommand_12_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:934:1: entryRuleMiddleware returns [EObject current=null] : iv_ruleMiddleware= ruleMiddleware EOF ;
    public final EObject entryRuleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:934:51: (iv_ruleMiddleware= ruleMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:935:2: iv_ruleMiddleware= ruleMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:941:1: ruleMiddleware returns [EObject current=null] : this_RosMiddleware_0= ruleRosMiddleware ;
    public final EObject ruleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_RosMiddleware_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:947:2: (this_RosMiddleware_0= ruleRosMiddleware )
            // InternalPlanWithRosmodelParser.g:948:2: this_RosMiddleware_0= ruleRosMiddleware
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
    // InternalPlanWithRosmodelParser.g:959:1: entryRuleRosMiddleware returns [EObject current=null] : iv_ruleRosMiddleware= ruleRosMiddleware EOF ;
    public final EObject entryRuleRosMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:959:54: (iv_ruleRosMiddleware= ruleRosMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:960:2: iv_ruleRosMiddleware= ruleRosMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:966:1: ruleRosMiddleware returns [EObject current=null] : ( (lv_value_0_0= ruleROSDistro ) ) ;
    public final EObject ruleRosMiddleware() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:972:2: ( ( (lv_value_0_0= ruleROSDistro ) ) )
            // InternalPlanWithRosmodelParser.g:973:2: ( (lv_value_0_0= ruleROSDistro ) )
            {
            // InternalPlanWithRosmodelParser.g:973:2: ( (lv_value_0_0= ruleROSDistro ) )
            // InternalPlanWithRosmodelParser.g:974:3: (lv_value_0_0= ruleROSDistro )
            {
            // InternalPlanWithRosmodelParser.g:974:3: (lv_value_0_0= ruleROSDistro )
            // InternalPlanWithRosmodelParser.g:975:4: lv_value_0_0= ruleROSDistro
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


    // $ANTLR start "entryRuleConfigExecutionParameter"
    // InternalPlanWithRosmodelParser.g:995:1: entryRuleConfigExecutionParameter returns [EObject current=null] : iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF ;
    public final EObject entryRuleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:995:65: (iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:996:2: iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:1002:1: ruleConfigExecutionParameter returns [EObject current=null] : ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1008:2: ( ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1009:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1009:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1010:3: () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1010:3: ()
            // InternalPlanWithRosmodelParser.g:1011:4:
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

            // InternalPlanWithRosmodelParser.g:1028:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1029:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1029:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:1030:5: ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_31);

                        newLeafNode(this_INDENT_4, grammarAccess.getConfigExecutionParameterAccess().getINDENTTerminalRuleCall_4());

            // InternalPlanWithRosmodelParser.g:1048:3: (otherlv_5= To ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==To) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1049:4: otherlv_5= To ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,To,FOLLOW_5);

                                    newLeafNode(otherlv_5, grammarAccess.getConfigExecutionParameterAccess().getToKeyword_5_0());

                    // InternalPlanWithRosmodelParser.g:1053:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1054:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1054:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:1055:6: ruleEString
                    {

                                            if (current==null) {
                                                current = createModelElement(grammarAccess.getConfigExecutionParameterRule());
                                            }


                                            newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getToAbstractConfigPropertyCrossReference_5_1_0());

                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:1070:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1071:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_28);

                                    newLeafNode(otherlv_7, grammarAccess.getConfigExecutionParameterAccess().getValueKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1075:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1076:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1076:5: (lv_value_8_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1077:6: lv_value_8_0= rulePropertyValue
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
    // InternalPlanWithRosmodelParser.g:1103:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1103:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalPlanWithRosmodelParser.g:1104:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1110:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1116:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalPlanWithRosmodelParser.g:1117:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalPlanWithRosmodelParser.g:1117:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt23=5;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1118:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalPlanWithRosmodelParser.g:1127:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalPlanWithRosmodelParser.g:1136:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalPlanWithRosmodelParser.g:1145:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalPlanWithRosmodelParser.g:1154:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalPlanWithRosmodelParser.g:1166:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:1166:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalPlanWithRosmodelParser.g:1167:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalPlanWithRosmodelParser.g:1173:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1179:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:1180:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:1180:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt24=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt24=1;
                }
                break;
            case MaximumKind:
                {
                alt24=2;
                }
                break;
            case MinimumKind:
                {
                alt24=3;
                }
                break;
            case RangeKind:
                {
                alt24=4;
                }
                break;
            case SelectionKind:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1181:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalPlanWithRosmodelParser.g:1190:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalPlanWithRosmodelParser.g:1199:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalPlanWithRosmodelParser.g:1208:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalPlanWithRosmodelParser.g:1217:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalPlanWithRosmodelParser.g:1229:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalPlanWithRosmodelParser.g:1229:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalPlanWithRosmodelParser.g:1230:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalPlanWithRosmodelParser.g:1236:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1242:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1243:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1243:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1244:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1255:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1256:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1256:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1257:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_32);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1282:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1283:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1283:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1284:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
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

            // InternalPlanWithRosmodelParser.g:1301:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Description) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1302:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1306:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1307:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1307:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1308:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_35);
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

            // InternalPlanWithRosmodelParser.g:1326:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Value) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1327:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_28);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1331:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1332:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1332:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1333:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_36);
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

            // InternalPlanWithRosmodelParser.g:1351:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DEDENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1352:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1361:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalPlanWithRosmodelParser.g:1361:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalPlanWithRosmodelParser.g:1362:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalPlanWithRosmodelParser.g:1368:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1374:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1375:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1375:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1376:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1387:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1388:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1388:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1389:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_32);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_37);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1414:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalPlanWithRosmodelParser.g:1415:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:1415:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalPlanWithRosmodelParser.g:1416:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
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

            // InternalPlanWithRosmodelParser.g:1433:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Description) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1434:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1438:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1439:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1439:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1440:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_35);
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

            // InternalPlanWithRosmodelParser.g:1458:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1459:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_28);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1463:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1464:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1464:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1465:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_36);
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

            // InternalPlanWithRosmodelParser.g:1483:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DEDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1484:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1493:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalPlanWithRosmodelParser.g:1493:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalPlanWithRosmodelParser.g:1494:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalPlanWithRosmodelParser.g:1500:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1506:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1507:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1507:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1508:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1519:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1520:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1520:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1521:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_32);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_38);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1546:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalPlanWithRosmodelParser.g:1547:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:1547:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalPlanWithRosmodelParser.g:1548:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
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

            // InternalPlanWithRosmodelParser.g:1565:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1566:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1570:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1571:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1571:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1572:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_35);
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

            // InternalPlanWithRosmodelParser.g:1590:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1591:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_28);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1595:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1596:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1596:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1597:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_36);
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

            // InternalPlanWithRosmodelParser.g:1615:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DEDENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1616:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1625:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalPlanWithRosmodelParser.g:1625:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalPlanWithRosmodelParser.g:1626:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalPlanWithRosmodelParser.g:1632:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1638:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1639:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1639:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1640:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1651:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1652:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1652:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1653:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_32);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_39);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1678:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:1679:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:1679:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalPlanWithRosmodelParser.g:1680:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
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

            // InternalPlanWithRosmodelParser.g:1697:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Description) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1698:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1702:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1703:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1703:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1704:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_35);
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

            // InternalPlanWithRosmodelParser.g:1722:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Value) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1723:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_28);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:1738:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1739:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1739:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1740:6: lv_value_11_0= rulePropertyValue
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

                    // InternalPlanWithRosmodelParser.g:1757:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==HyphenMinus) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:1758:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_28);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:1765:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalPlanWithRosmodelParser.g:1766:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalPlanWithRosmodelParser.g:1766:6: (lv_value_13_0= rulePropertyValue )
                            // InternalPlanWithRosmodelParser.g:1767:7: lv_value_13_0= rulePropertyValue
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
                            break loop35;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_36);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:1790:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DEDENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1791:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1800:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalPlanWithRosmodelParser.g:1800:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalPlanWithRosmodelParser.g:1801:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalPlanWithRosmodelParser.g:1807:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1813:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1814:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1814:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1815:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1826:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1827:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1827:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1828:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_32);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_40);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1853:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalPlanWithRosmodelParser.g:1854:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalPlanWithRosmodelParser.g:1854:4: (lv_kind_5_0= ruleRangeKind )
            // InternalPlanWithRosmodelParser.g:1855:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_34);
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

            // InternalPlanWithRosmodelParser.g:1872:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Description) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1873:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1877:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1878:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1878:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1879:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_35);
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

            // InternalPlanWithRosmodelParser.g:1897:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Value) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1898:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_11);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_28);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:1913:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1914:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1914:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1915:6: lv_value_11_0= rulePropertyValue
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

                    pushFollow(FOLLOW_28);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:1939:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1940:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1940:5: (lv_value_13_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1941:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_36);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:1963:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_DEDENT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1964:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1973:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:1973:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPlanWithRosmodelParser.g:1974:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalPlanWithRosmodelParser.g:1980:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
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
            // InternalPlanWithRosmodelParser.g:1986:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalPlanWithRosmodelParser.g:1987:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalPlanWithRosmodelParser.g:1987:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt41=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt41=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt41=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt41=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt41=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt41=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt41=6;
                }
                break;
            case RULE_INDENT:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1988:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalPlanWithRosmodelParser.g:1997:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalPlanWithRosmodelParser.g:2006:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalPlanWithRosmodelParser.g:2015:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalPlanWithRosmodelParser.g:2024:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalPlanWithRosmodelParser.g:2033:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
                    // InternalPlanWithRosmodelParser.g:2042:3: this_PropertyValueList_6= rulePropertyValueList
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
    // InternalPlanWithRosmodelParser.g:2054:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalPlanWithRosmodelParser.g:2054:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalPlanWithRosmodelParser.g:2055:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalPlanWithRosmodelParser.g:2061:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2067:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalPlanWithRosmodelParser.g:2068:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2068:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalPlanWithRosmodelParser.g:2069:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalPlanWithRosmodelParser.g:2069:3: (lv_value_0_0= ruleInteger0 )
            // InternalPlanWithRosmodelParser.g:2070:4: lv_value_0_0= ruleInteger0
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
    // InternalPlanWithRosmodelParser.g:2090:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalPlanWithRosmodelParser.g:2090:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalPlanWithRosmodelParser.g:2091:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalPlanWithRosmodelParser.g:2097:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2103:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalPlanWithRosmodelParser.g:2104:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2104:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalPlanWithRosmodelParser.g:2105:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalPlanWithRosmodelParser.g:2105:3: (lv_value_0_0= ruleDouble0 )
            // InternalPlanWithRosmodelParser.g:2106:4: lv_value_0_0= ruleDouble0
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
    // InternalPlanWithRosmodelParser.g:2126:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalPlanWithRosmodelParser.g:2126:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalPlanWithRosmodelParser.g:2127:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalPlanWithRosmodelParser.g:2133:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2139:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2140:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2140:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2141:3: (lv_value_0_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2141:3: (lv_value_0_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2142:4: lv_value_0_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2162:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalPlanWithRosmodelParser.g:2162:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalPlanWithRosmodelParser.g:2163:2: iv_rulePropertyValueList= rulePropertyValueList EOF
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
    // InternalPlanWithRosmodelParser.g:2169:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2175:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:2176:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:2176:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:2177:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                        newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_28);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:2188:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalPlanWithRosmodelParser.g:2189:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalPlanWithRosmodelParser.g:2189:4: (lv_value_2_0= rulePropertyValue )
            // InternalPlanWithRosmodelParser.g:2190:5: lv_value_2_0= rulePropertyValue
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

            // InternalPlanWithRosmodelParser.g:2207:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==HyphenMinus) ) {
                    alt42=1;
                }


                switch (alt42) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2208:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                    {

                                    newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                    pushFollow(FOLLOW_28);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2215:4: ( (lv_value_4_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2216:5: (lv_value_4_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2216:5: (lv_value_4_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2217:6: lv_value_4_0= rulePropertyValue
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
                    break loop42;
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
    // InternalPlanWithRosmodelParser.g:2243:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2243:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalPlanWithRosmodelParser.g:2244:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalPlanWithRosmodelParser.g:2250:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2256:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalPlanWithRosmodelParser.g:2257:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalPlanWithRosmodelParser.g:2257:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalPlanWithRosmodelParser.g:2258:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalPlanWithRosmodelParser.g:2258:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalPlanWithRosmodelParser.g:2259:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalPlanWithRosmodelParser.g:2279:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2279:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalPlanWithRosmodelParser.g:2280:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalPlanWithRosmodelParser.g:2286:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2292:2: (this_ResourceType_0= ruleResourceType )
            // InternalPlanWithRosmodelParser.g:2293:2: this_ResourceType_0= ruleResourceType
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
    // InternalPlanWithRosmodelParser.g:2304:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2304:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalPlanWithRosmodelParser.g:2305:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalPlanWithRosmodelParser.g:2311:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2317:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:2318:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2318:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2319:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2319:3: ()
            // InternalPlanWithRosmodelParser.g:2320:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:2326:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2327:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2327:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2328:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2349:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:2349:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:2350:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:2356:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2362:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2363:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2363:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalPlanWithRosmodelParser.g:2364:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:2364:3: ()
            // InternalPlanWithRosmodelParser.g:2365:4:
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
    // InternalPlanWithRosmodelParser.g:2379:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:2379:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:2380:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:2386:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2392:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2393:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2393:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalPlanWithRosmodelParser.g:2394:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:2394:3: ()
            // InternalPlanWithRosmodelParser.g:2395:4:
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
    // InternalPlanWithRosmodelParser.g:2409:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2409:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:2410:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:2416:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2422:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:2423:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2423:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2424:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2424:3: ()
            // InternalPlanWithRosmodelParser.g:2425:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:2431:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2432:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2432:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2433:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2454:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2454:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:2455:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:2461:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2467:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalPlanWithRosmodelParser.g:2468:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalPlanWithRosmodelParser.g:2468:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Ethernet) ) {
                alt43=1;
            }
            else if ( (LA43_0==Wlan) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2469:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalPlanWithRosmodelParser.g:2478:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalPlanWithRosmodelParser.g:2490:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2490:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:2491:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:2497:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2503:2: ( ( () otherlv_1= Ethernet ) )
            // InternalPlanWithRosmodelParser.g:2504:2: ( () otherlv_1= Ethernet )
            {
            // InternalPlanWithRosmodelParser.g:2504:2: ( () otherlv_1= Ethernet )
            // InternalPlanWithRosmodelParser.g:2505:3: () otherlv_1= Ethernet
            {
            // InternalPlanWithRosmodelParser.g:2505:3: ()
            // InternalPlanWithRosmodelParser.g:2506:4:
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
    // InternalPlanWithRosmodelParser.g:2520:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2520:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:2521:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:2527:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2533:2: ( ( () otherlv_1= Wlan ) )
            // InternalPlanWithRosmodelParser.g:2534:2: ( () otherlv_1= Wlan )
            {
            // InternalPlanWithRosmodelParser.g:2534:2: ( () otherlv_1= Wlan )
            // InternalPlanWithRosmodelParser.g:2535:3: () otherlv_1= Wlan
            {
            // InternalPlanWithRosmodelParser.g:2535:3: ()
            // InternalPlanWithRosmodelParser.g:2536:4:
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
    // InternalPlanWithRosmodelParser.g:2550:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:2550:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalPlanWithRosmodelParser.g:2551:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalPlanWithRosmodelParser.g:2557:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2563:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalPlanWithRosmodelParser.g:2564:2: ( () otherlv_1= AttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:2564:2: ( () otherlv_1= AttributeKind )
            // InternalPlanWithRosmodelParser.g:2565:3: () otherlv_1= AttributeKind
            {
            // InternalPlanWithRosmodelParser.g:2565:3: ()
            // InternalPlanWithRosmodelParser.g:2566:4:
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
    // InternalPlanWithRosmodelParser.g:2580:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:2580:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalPlanWithRosmodelParser.g:2581:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalPlanWithRosmodelParser.g:2587:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2593:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalPlanWithRosmodelParser.g:2594:2: ( () otherlv_1= MaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:2594:2: ( () otherlv_1= MaximumKind )
            // InternalPlanWithRosmodelParser.g:2595:3: () otherlv_1= MaximumKind
            {
            // InternalPlanWithRosmodelParser.g:2595:3: ()
            // InternalPlanWithRosmodelParser.g:2596:4:
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
    // InternalPlanWithRosmodelParser.g:2610:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:2610:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalPlanWithRosmodelParser.g:2611:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalPlanWithRosmodelParser.g:2617:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2623:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalPlanWithRosmodelParser.g:2624:2: ( () otherlv_1= MinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:2624:2: ( () otherlv_1= MinimumKind )
            // InternalPlanWithRosmodelParser.g:2625:3: () otherlv_1= MinimumKind
            {
            // InternalPlanWithRosmodelParser.g:2625:3: ()
            // InternalPlanWithRosmodelParser.g:2626:4:
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
    // InternalPlanWithRosmodelParser.g:2640:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:2640:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalPlanWithRosmodelParser.g:2641:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalPlanWithRosmodelParser.g:2647:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2653:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalPlanWithRosmodelParser.g:2654:2: ( () otherlv_1= SelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:2654:2: ( () otherlv_1= SelectionKind )
            // InternalPlanWithRosmodelParser.g:2655:3: () otherlv_1= SelectionKind
            {
            // InternalPlanWithRosmodelParser.g:2655:3: ()
            // InternalPlanWithRosmodelParser.g:2656:4:
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
    // InternalPlanWithRosmodelParser.g:2670:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:2670:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalPlanWithRosmodelParser.g:2671:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalPlanWithRosmodelParser.g:2677:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2683:2: ( ( () otherlv_1= RangeKind ) )
            // InternalPlanWithRosmodelParser.g:2684:2: ( () otherlv_1= RangeKind )
            {
            // InternalPlanWithRosmodelParser.g:2684:2: ( () otherlv_1= RangeKind )
            // InternalPlanWithRosmodelParser.g:2685:3: () otherlv_1= RangeKind
            {
            // InternalPlanWithRosmodelParser.g:2685:3: ()
            // InternalPlanWithRosmodelParser.g:2686:4:
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
    // InternalPlanWithRosmodelParser.g:2700:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2700:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalPlanWithRosmodelParser.g:2701:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalPlanWithRosmodelParser.g:2707:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2713:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalPlanWithRosmodelParser.g:2714:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2714:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalPlanWithRosmodelParser.g:2715:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalPlanWithRosmodelParser.g:2715:3: ()
            // InternalPlanWithRosmodelParser.g:2716:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:2722:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalPlanWithRosmodelParser.g:2723:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalPlanWithRosmodelParser.g:2723:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalPlanWithRosmodelParser.g:2724:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalPlanWithRosmodelParser.g:2745:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2745:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalPlanWithRosmodelParser.g:2746:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalPlanWithRosmodelParser.g:2752:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2758:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalPlanWithRosmodelParser.g:2759:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2759:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalPlanWithRosmodelParser.g:2760:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalPlanWithRosmodelParser.g:2760:3: ()
            // InternalPlanWithRosmodelParser.g:2761:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalPlanWithRosmodelParser.g:2767:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalPlanWithRosmodelParser.g:2768:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalPlanWithRosmodelParser.g:2768:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalPlanWithRosmodelParser.g:2769:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalPlanWithRosmodelParser.g:2790:1: entryRuleOpertingSystemName returns [EObject current=null] : iv_ruleOpertingSystemName= ruleOpertingSystemName EOF ;
    public final EObject entryRuleOpertingSystemName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemName = null;


        try {
            // InternalPlanWithRosmodelParser.g:2790:59: (iv_ruleOpertingSystemName= ruleOpertingSystemName EOF )
            // InternalPlanWithRosmodelParser.g:2791:2: iv_ruleOpertingSystemName= ruleOpertingSystemName EOF
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
    // InternalPlanWithRosmodelParser.g:2797:1: ruleOpertingSystemName returns [EObject current=null] : this_LinuxDistributionValue_0= ruleLinuxDistributionValue ;
    public final EObject ruleOpertingSystemName() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxDistributionValue_0 = null;



            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2803:2: (this_LinuxDistributionValue_0= ruleLinuxDistributionValue )
            // InternalPlanWithRosmodelParser.g:2804:2: this_LinuxDistributionValue_0= ruleLinuxDistributionValue
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
    // InternalPlanWithRosmodelParser.g:2815:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:2815:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalPlanWithRosmodelParser.g:2816:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalPlanWithRosmodelParser.g:2822:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2828:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalPlanWithRosmodelParser.g:2829:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalPlanWithRosmodelParser.g:2839:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:2839:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalPlanWithRosmodelParser.g:2840:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalPlanWithRosmodelParser.g:2846:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2852:2: (this_DECINT_0= RULE_DECINT )
            // InternalPlanWithRosmodelParser.g:2853:2: this_DECINT_0= RULE_DECINT
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
    // InternalPlanWithRosmodelParser.g:2863:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlanWithRosmodelParser.g:2863:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlanWithRosmodelParser.g:2864:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlanWithRosmodelParser.g:2870:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2876:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlanWithRosmodelParser.g:2877:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlanWithRosmodelParser.g:2877:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2878:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:2886:3: this_ID_1= RULE_ID
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
    // InternalPlanWithRosmodelParser.g:2897:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:2899:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalPlanWithRosmodelParser.g:2900:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalPlanWithRosmodelParser.g:2909:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:2916:2: (kw= HyphenMinus )
            // InternalPlanWithRosmodelParser.g:2917:2: kw= HyphenMinus
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
    // InternalPlanWithRosmodelParser.g:2928:1: ruleROSDistro returns [Enumerator current=null] : ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) ;
    public final Enumerator ruleROSDistro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2934:2: ( ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) )
            // InternalPlanWithRosmodelParser.g:2935:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            {
            // InternalPlanWithRosmodelParser.g:2935:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case Noetic:
                {
                alt45=1;
                }
                break;
            case Humble:
                {
                alt45=2;
                }
                break;
            case Rolling:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2936:3: (enumLiteral_0= Noetic )
                    {
                    // InternalPlanWithRosmodelParser.g:2936:3: (enumLiteral_0= Noetic )
                    // InternalPlanWithRosmodelParser.g:2937:4: enumLiteral_0= Noetic
                    {
                    enumLiteral_0=(Token)match(input,Noetic,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:2944:3: (enumLiteral_1= Humble )
                    {
                    // InternalPlanWithRosmodelParser.g:2944:3: (enumLiteral_1= Humble )
                    // InternalPlanWithRosmodelParser.g:2945:4: enumLiteral_1= Humble
                    {
                    enumLiteral_1=(Token)match(input,Humble,FOLLOW_2);

                                    current = grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_1, grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1());


                    }


                    }
                    break;
                case 3 :
                    // InternalPlanWithRosmodelParser.g:2952:3: (enumLiteral_2= Rolling )
                    {
                    // InternalPlanWithRosmodelParser.g:2952:3: (enumLiteral_2= Rolling )
                    // InternalPlanWithRosmodelParser.g:2953:4: enumLiteral_2= Rolling
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
    // InternalPlanWithRosmodelParser.g:2963:1: ruleRunTimeType returns [Enumerator current=null] : (enumLiteral_0= Container ) ;
    public final Enumerator ruleRunTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2969:2: ( (enumLiteral_0= Container ) )
            // InternalPlanWithRosmodelParser.g:2970:2: (enumLiteral_0= Container )
            {
            // InternalPlanWithRosmodelParser.g:2970:2: (enumLiteral_0= Container )
            // InternalPlanWithRosmodelParser.g:2971:3: enumLiteral_0= Container
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
    // InternalPlanWithRosmodelParser.g:2980:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2986:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalPlanWithRosmodelParser.g:2987:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalPlanWithRosmodelParser.g:2987:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==X86) ) {
                alt46=1;
            }
            else if ( (LA46_0==Arm64) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2988:3: (enumLiteral_0= X86 )
                    {
                    // InternalPlanWithRosmodelParser.g:2988:3: (enumLiteral_0= X86 )
                    // InternalPlanWithRosmodelParser.g:2989:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:2996:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalPlanWithRosmodelParser.g:2996:3: (enumLiteral_1= Arm64 )
                    // InternalPlanWithRosmodelParser.g:2997:4: enumLiteral_1= Arm64
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
    // InternalPlanWithRosmodelParser.g:3007:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3013:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalPlanWithRosmodelParser.g:3014:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalPlanWithRosmodelParser.g:3014:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Ubuntu) ) {
                alt47=1;
            }
            else if ( (LA47_0==Debian) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3015:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalPlanWithRosmodelParser.g:3015:3: (enumLiteral_0= Ubuntu )
                    // InternalPlanWithRosmodelParser.g:3016:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3023:3: (enumLiteral_1= Debian )
                    {
                    // InternalPlanWithRosmodelParser.g:3023:3: (enumLiteral_1= Debian )
                    // InternalPlanWithRosmodelParser.g:3024:4: enumLiteral_1= Debian
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
    // InternalPlanWithRosmodelParser.g:3034:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3040:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalPlanWithRosmodelParser.g:3041:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalPlanWithRosmodelParser.g:3041:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Focal) ) {
                alt48=1;
            }
            else if ( (LA48_0==Jammy) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3042:3: (enumLiteral_0= Focal )
                    {
                    // InternalPlanWithRosmodelParser.g:3042:3: (enumLiteral_0= Focal )
                    // InternalPlanWithRosmodelParser.g:3043:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3050:3: (enumLiteral_1= Jammy )
                    {
                    // InternalPlanWithRosmodelParser.g:3050:3: (enumLiteral_1= Jammy )
                    // InternalPlanWithRosmodelParser.g:3051:4: enumLiteral_1= Jammy
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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\55\1\47\1\65\2\63\1\46\1\13\5\uffff";
    static final String dfa_3s = "\1\55\1\47\1\67\2\63\1\46\1\27\5\uffff";
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1117:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010200000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00B0000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000108100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000008100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00AB102D20000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0018000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010080200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000200004002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000800000L});

}
