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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExecutionConfiguration", "DeploymentPlanWithRos", "LinuxOpertingSystem", "MacOSOpertingSystem", "SoftwareComponents", "TargetRossystem", "DeploymentPlan", "AttributeKind", "SelectionKind", "RefNodeParam", "StartCommand", "Description", "RefSysParam", "RuntimeType", "MaximumKind", "MinimumKind", "Assignment", "ExecutedBy", "Middleware", "Properties", "Os_version", "Processor", "RangeKind", "Container", "DeployTo", "Resource", "Ethernet", "Version", "Os_name", "Rolling", "Debian", "Humble", "Noetic", "Ubuntu", "Value", "Arm64", "Focal", "From", "Jammy", "Kind", "Name", "Type", "Wlan", "Usb", "To", "X86", "HyphenMinus", "Colon", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SoftwareComponents=8;
    public static final int DeployTo=28;
    public static final int AttributeKind=11;
    public static final int Noetic=36;
    public static final int Name=44;
    public static final int Assignment=20;
    public static final int Container=27;
    public static final int Debian=34;
    public static final int Version=31;
    public static final int Kind=43;
    public static final int To=48;
    public static final int ExecutedBy=21;
    public static final int Ubuntu=37;
    public static final int RULE_DEDENT=57;
    public static final int DeploymentPlanWithRos=5;
    public static final int LinuxOpertingSystem=6;
    public static final int RULE_ID=58;
    public static final int TargetRossystem=9;
    public static final int Resource=29;
    public static final int RULE_DIGIT=52;
    public static final int Middleware=22;
    public static final int SelectionKind=12;
    public static final int Arm64=39;
    public static final int RULE_INT=59;
    public static final int Ethernet=30;
    public static final int Value=38;
    public static final int RULE_ML_COMMENT=61;
    public static final int Description=15;
    public static final int Processor=25;
    public static final int StartCommand=14;
    public static final int RefNodeParam=13;
    public static final int RULE_STRING=60;
    public static final int Focal=40;
    public static final int Wlan=46;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=55;
    public static final int Os_name=32;
    public static final int HyphenMinus=50;
    public static final int RULE_DOUBLE=54;
    public static final int X86=49;
    public static final int Colon=51;
    public static final int RULE_DECINT=53;
    public static final int DeploymentPlan=10;
    public static final int MinimumKind=19;
    public static final int EOF=-1;
    public static final int RULE_INDENT=56;
    public static final int Jammy=42;
    public static final int Usb=47;
    public static final int RULE_WS=62;
    public static final int Rolling=33;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=18;
    public static final int From=41;
    public static final int RULE_ANY_OTHER=63;
    public static final int RangeKind=26;
    public static final int Os_version=24;
    public static final int Type=45;
    public static final int MacOSOpertingSystem=7;
    public static final int RuntimeType=17;
    public static final int RefSysParam=16;
    public static final int Humble=35;

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
    // InternalPlanWithRosmodelParser.g:65:1: ruleDeploymentPlanWithRosModel returns [EObject current=null] : (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= TargetRossystem ( ( ruleEString ) ) )? otherlv_6= DeployTo ( ( ruleEString ) ) ( (lv_realize_8_0= ruleAbstractRealization ) ) this_DEDENT_9= RULE_DEDENT ) ;
    public final EObject ruleDeploymentPlanWithRosModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_DEDENT_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_realize_8_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:71:2: ( (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= TargetRossystem ( ( ruleEString ) ) )? otherlv_6= DeployTo ( ( ruleEString ) ) ( (lv_realize_8_0= ruleAbstractRealization ) ) this_DEDENT_9= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:72:2: (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= TargetRossystem ( ( ruleEString ) ) )? otherlv_6= DeployTo ( ( ruleEString ) ) ( (lv_realize_8_0= ruleAbstractRealization ) ) this_DEDENT_9= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:72:2: (otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= TargetRossystem ( ( ruleEString ) ) )? otherlv_6= DeployTo ( ( ruleEString ) ) ( (lv_realize_8_0= ruleAbstractRealization ) ) this_DEDENT_9= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:73:3: otherlv_0= DeploymentPlanWithRos this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= TargetRossystem ( ( ruleEString ) ) )? otherlv_6= DeployTo ( ( ruleEString ) ) ( (lv_realize_8_0= ruleAbstractRealization ) ) this_DEDENT_9= RULE_DEDENT
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

            // InternalPlanWithRosmodelParser.g:104:3: (otherlv_4= TargetRossystem ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TargetRossystem) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:105:4: otherlv_4= TargetRossystem ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,TargetRossystem,FOLLOW_5);

                            newLeafNode(otherlv_4, grammarAccess.getDeploymentPlanWithRosModelAccess().getTargetRossystemKeyword_4_0());

                    // InternalPlanWithRosmodelParser.g:109:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:110:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:110:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:111:6: ruleEString
                    {

                                if (current==null) {
                                  current = createModelElement(grammarAccess.getDeploymentPlanWithRosModelRule());
                                }


                                newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getTargetRossystemSystemCrossReference_4_1_0());

                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                                afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,DeployTo,FOLLOW_5);

                  newLeafNode(otherlv_6, grammarAccess.getDeploymentPlanWithRosModelAccess().getDeployToKeyword_5());

            // InternalPlanWithRosmodelParser.g:130:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:131:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:131:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:132:5: ruleEString
            {

                      if (current==null) {
                        current = createModelElement(grammarAccess.getDeploymentPlanWithRosModelRule());
                      }


                      newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getDeployToTargetDeployEnviromentCrossReference_6_0());

            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


                      afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:146:3: ( (lv_realize_8_0= ruleAbstractRealization ) )
            // InternalPlanWithRosmodelParser.g:147:4: (lv_realize_8_0= ruleAbstractRealization )
            {
            // InternalPlanWithRosmodelParser.g:147:4: (lv_realize_8_0= ruleAbstractRealization )
            // InternalPlanWithRosmodelParser.g:148:5: lv_realize_8_0= ruleAbstractRealization
            {

                      newCompositeNode(grammarAccess.getDeploymentPlanWithRosModelAccess().getRealizeAbstractRealizationParserRuleCall_7_0());

            pushFollow(FOLLOW_9);
            lv_realize_8_0=ruleAbstractRealization();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getDeploymentPlanWithRosModelRule());
                      }
                      set(
                        current,
                        "realize",
                        lv_realize_8_0,
                        "de.fraunhofer.ipa.deployment.Plan.AbstractRealization");
                      afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                  newLeafNode(this_DEDENT_9, grammarAccess.getDeploymentPlanWithRosModelAccess().getDEDENTTerminalRuleCall_8());


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
    // InternalPlanWithRosmodelParser.g:173:1: entryRuleConfigRosSoftwareComponent returns [EObject current=null] : iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF ;
    public final EObject entryRuleConfigRosSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigRosSoftwareComponent = null;


        try {
            // InternalPlanWithRosmodelParser.g:173:67: (iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF )
            // InternalPlanWithRosmodelParser.g:174:2: iv_ruleConfigRosSoftwareComponent= ruleConfigRosSoftwareComponent EOF
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
    // InternalPlanWithRosmodelParser.g:180:1: ruleConfigRosSoftwareComponent returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:186:2: ( ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:187:2: ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:187:2: ( () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:188:3: () ( ( ruleEString ) ) (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:188:3: ()
            // InternalPlanWithRosmodelParser.g:189:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getConfigRosSoftwareComponentAccess().getConfigRosSoftwareComponentAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:195:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:196:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:196:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:197:5: ruleEString
            {

                      if (current==null) {
                        current = createModelElement(grammarAccess.getConfigRosSoftwareComponentRule());
                      }


                      newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getComponentSystemCrossReference_1_0());

            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


                      afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:211:3: (otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Colon) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:212:4: otherlv_2= Colon this_INDENT_3= RULE_INDENT (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )? this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_3);

                            newLeafNode(otherlv_2, grammarAccess.getConfigRosSoftwareComponentAccess().getColonKeyword_2_0());

                    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_11);

                            newLeafNode(this_INDENT_3, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_1());

                    // InternalPlanWithRosmodelParser.g:220:4: (otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==ExecutionConfiguration) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:221:5: otherlv_4= ExecutionConfiguration this_INDENT_5= RULE_INDENT ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+ this_DEDENT_7= RULE_DEDENT
                            {
                            otherlv_4=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                      newLeafNode(otherlv_4, grammarAccess.getConfigRosSoftwareComponentAccess().getExecutionConfigurationKeyword_2_2_0());

                            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_12);

                                      newLeafNode(this_INDENT_5, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_2_1());

                            // InternalPlanWithRosmodelParser.g:229:5: ( (lv_executionConfiguration_6_0= ruleConfigRosParameter ) )+
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
                                  // InternalPlanWithRosmodelParser.g:230:6: (lv_executionConfiguration_6_0= ruleConfigRosParameter )
                                  {
                                  // InternalPlanWithRosmodelParser.g:230:6: (lv_executionConfiguration_6_0= ruleConfigRosParameter )
                                  // InternalPlanWithRosmodelParser.g:231:7: lv_executionConfiguration_6_0= ruleConfigRosParameter
                                  {

                                                newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getExecutionConfigurationConfigRosParameterParserRuleCall_2_2_2_0());

                                  pushFollow(FOLLOW_13);
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
                                  if ( cnt2 >= 1 ) break loop2;
                                        EarlyExitException eee =
                                            new EarlyExitException(2, input);
                                        throw eee;
                                }
                                cnt2++;
                            } while (true);

                            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                                      newLeafNode(this_DEDENT_7, grammarAccess.getConfigRosSoftwareComponentAccess().getDEDENTTerminalRuleCall_2_2_3());


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:253:4: (otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==StartCommand) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:254:5: otherlv_8= StartCommand this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_startCommand_11_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )? this_DEDENT_14= RULE_DEDENT
                            {
                            otherlv_8=(Token)match(input,StartCommand,FOLLOW_3);

                                      newLeafNode(otherlv_8, grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandKeyword_2_3_0());

                            this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_12);

                                      newLeafNode(this_INDENT_9, grammarAccess.getConfigRosSoftwareComponentAccess().getINDENTTerminalRuleCall_2_3_1());


                                      newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getPreListElementParserRuleCall_2_3_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                      afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:269:5: ( (lv_startCommand_11_0= ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:270:6: (lv_startCommand_11_0= ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:270:6: (lv_startCommand_11_0= ruleEString )
                            // InternalPlanWithRosmodelParser.g:271:7: lv_startCommand_11_0= ruleEString
                            {

                                          newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandEStringParserRuleCall_2_3_3_0());

                            pushFollow(FOLLOW_13);
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

                            // InternalPlanWithRosmodelParser.g:288:5: ( rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )* )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==HyphenMinus) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:289:6: rulePreListElement ( (lv_startCommand_13_0= ruleEString ) )*
                                    {

                                                newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getPreListElementParserRuleCall_2_3_4_0());

                                    pushFollow(FOLLOW_15);
                                    rulePreListElement();

                                    state._fsp--;


                                                afterParserOrEnumRuleCall();

                                    // InternalPlanWithRosmodelParser.g:296:6: ( (lv_startCommand_13_0= ruleEString ) )*
                                    loop4:
                                    do {
                                        int alt4=2;
                                        int LA4_0 = input.LA(1);

                                        if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                                            alt4=1;
                                        }


                                        switch (alt4) {
                                      case 1 :
                                          // InternalPlanWithRosmodelParser.g:297:7: (lv_startCommand_13_0= ruleEString )
                                          {
                                          // InternalPlanWithRosmodelParser.g:297:7: (lv_startCommand_13_0= ruleEString )
                                          // InternalPlanWithRosmodelParser.g:298:8: lv_startCommand_13_0= ruleEString
                                          {

                                                          newCompositeNode(grammarAccess.getConfigRosSoftwareComponentAccess().getStartCommandEStringParserRuleCall_2_3_4_1_0());

                                          pushFollow(FOLLOW_15);
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
                                          break loop4;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalPlanWithRosmodelParser.g:330:1: entryRuleAbstractComputationAssignment returns [EObject current=null] : iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF ;
    public final EObject entryRuleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComputationAssignment = null;


        try {
            // InternalPlanWithRosmodelParser.g:330:70: (iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF )
            // InternalPlanWithRosmodelParser.g:331:2: iv_ruleAbstractComputationAssignment= ruleAbstractComputationAssignment EOF
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
    // InternalPlanWithRosmodelParser.g:337:1: ruleAbstractComputationAssignment returns [EObject current=null] : this_RossystemImplementationAssignment_0= ruleRossystemImplementationAssignment ;
    public final EObject ruleAbstractComputationAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_RossystemImplementationAssignment_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:343:2: (this_RossystemImplementationAssignment_0= ruleRossystemImplementationAssignment )
            // InternalPlanWithRosmodelParser.g:344:2: this_RossystemImplementationAssignment_0= ruleRossystemImplementationAssignment
            {

                newCompositeNode(grammarAccess.getAbstractComputationAssignmentAccess().getRossystemImplementationAssignmentParserRuleCall());

            pushFollow(FOLLOW_2);
            this_RossystemImplementationAssignment_0=ruleRossystemImplementationAssignment();

            state._fsp--;


                current = this_RossystemImplementationAssignment_0;
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


    // $ANTLR start "entryRuleRossystemImplementationAssignment"
    // InternalPlanWithRosmodelParser.g:355:1: entryRuleRossystemImplementationAssignment returns [EObject current=null] : iv_ruleRossystemImplementationAssignment= ruleRossystemImplementationAssignment EOF ;
    public final EObject entryRuleRossystemImplementationAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRossystemImplementationAssignment = null;


        try {
            // InternalPlanWithRosmodelParser.g:355:74: (iv_ruleRossystemImplementationAssignment= ruleRossystemImplementationAssignment EOF )
            // InternalPlanWithRosmodelParser.g:356:2: iv_ruleRossystemImplementationAssignment= ruleRossystemImplementationAssignment EOF
            {
             newCompositeNode(grammarAccess.getRossystemImplementationAssignmentRule());
            pushFollow(FOLLOW_1);
            iv_ruleRossystemImplementationAssignment=ruleRossystemImplementationAssignment();

            state._fsp--;

             current =iv_ruleRossystemImplementationAssignment;
            match(input,EOF,FOLLOW_2);

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRossystemImplementationAssignment"


    // $ANTLR start "ruleRossystemImplementationAssignment"
    // InternalPlanWithRosmodelParser.g:362:1: ruleRossystemImplementationAssignment returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= Middleware ( (lv_middleware_9_0= ruleMiddleware ) ) otherlv_10= SoftwareComponents this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_16= RULE_DEDENT (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT ) ;
    public final EObject ruleRossystemImplementationAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_INDENT_11=null;
        Token this_DEDENT_16=null;
        Token otherlv_17=null;
        Token this_DEDENT_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_middleware_9_0 = null;

        EObject lv_softwareComponents_13_0 = null;

        EObject lv_softwareComponents_15_0 = null;

        EObject lv_runtimeType_18_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:368:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= Middleware ( (lv_middleware_9_0= ruleMiddleware ) ) otherlv_10= SoftwareComponents this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_16= RULE_DEDENT (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:369:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= Middleware ( (lv_middleware_9_0= ruleMiddleware ) ) otherlv_10= SoftwareComponents this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_16= RULE_DEDENT (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:369:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= Middleware ( (lv_middleware_9_0= ruleMiddleware ) ) otherlv_10= SoftwareComponents this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_16= RULE_DEDENT (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:370:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ExecutedBy ( ( ruleEString ) ) otherlv_6= Version ( (lv_version_7_0= ruleEString ) ) otherlv_8= Middleware ( (lv_middleware_9_0= ruleMiddleware ) ) otherlv_10= SoftwareComponents this_INDENT_11= RULE_INDENT rulePreListElement ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) ) ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )* this_DEDENT_16= RULE_DEDENT (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )? this_DEDENT_19= RULE_DEDENT
            {

                  newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getRossystemImplementationAssignmentAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:381:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:382:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:382:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:383:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
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

                  newLeafNode(this_INDENT_3, grammarAccess.getRossystemImplementationAssignmentAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,ExecutedBy,FOLLOW_5);

                  newLeafNode(otherlv_4, grammarAccess.getRossystemImplementationAssignmentAccess().getExecutedByKeyword_4());

            // InternalPlanWithRosmodelParser.g:408:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:409:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:409:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:410:5: ruleEString
            {

                      if (current==null) {
                        current = createModelElement(grammarAccess.getRossystemImplementationAssignmentRule());
                      }


                      newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getExecutedByComputationDeviceInstanceCrossReference_5_0());

            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


                      afterParserOrEnumRuleCall();


            }


            }

            otherlv_6=(Token)match(input,Version,FOLLOW_5);

                  newLeafNode(otherlv_6, grammarAccess.getRossystemImplementationAssignmentAccess().getVersionKeyword_6());

            // InternalPlanWithRosmodelParser.g:428:3: ( (lv_version_7_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:429:4: (lv_version_7_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:429:4: (lv_version_7_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:430:5: lv_version_7_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getVersionEStringParserRuleCall_7_0());

            pushFollow(FOLLOW_18);
            lv_version_7_0=ruleEString();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
                      }
                      set(
                        current,
                        "version",
                        lv_version_7_0,
                        "de.fraunhofer.ipa.deployment.Util.EString");
                      afterParserOrEnumRuleCall();


            }


            }

            otherlv_8=(Token)match(input,Middleware,FOLLOW_19);

                  newLeafNode(otherlv_8, grammarAccess.getRossystemImplementationAssignmentAccess().getMiddlewareKeyword_8());

            // InternalPlanWithRosmodelParser.g:451:3: ( (lv_middleware_9_0= ruleMiddleware ) )
            // InternalPlanWithRosmodelParser.g:452:4: (lv_middleware_9_0= ruleMiddleware )
            {
            // InternalPlanWithRosmodelParser.g:452:4: (lv_middleware_9_0= ruleMiddleware )
            // InternalPlanWithRosmodelParser.g:453:5: lv_middleware_9_0= ruleMiddleware
            {

                      newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getMiddlewareMiddlewareParserRuleCall_9_0());

            pushFollow(FOLLOW_20);
            lv_middleware_9_0=ruleMiddleware();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
                      }
                      set(
                        current,
                        "middleware",
                        lv_middleware_9_0,
                        "de.fraunhofer.ipa.deployment.Plan.Middleware");
                      afterParserOrEnumRuleCall();


            }


            }

            otherlv_10=(Token)match(input,SoftwareComponents,FOLLOW_3);

                  newLeafNode(otherlv_10, grammarAccess.getRossystemImplementationAssignmentAccess().getSoftwareComponentsKeyword_10());

            this_INDENT_11=(Token)match(input,RULE_INDENT,FOLLOW_12);

                  newLeafNode(this_INDENT_11, grammarAccess.getRossystemImplementationAssignmentAccess().getINDENTTerminalRuleCall_11());


                  newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getPreListElementParserRuleCall_12());

            pushFollow(FOLLOW_5);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:485:3: ( (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent ) )
            // InternalPlanWithRosmodelParser.g:486:4: (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent )
            {
            // InternalPlanWithRosmodelParser.g:486:4: (lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent )
            // InternalPlanWithRosmodelParser.g:487:5: lv_softwareComponents_13_0= ruleConfigRosSoftwareComponent
            {

                      newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getSoftwareComponentsConfigRosSoftwareComponentParserRuleCall_13_0());

            pushFollow(FOLLOW_13);
            lv_softwareComponents_13_0=ruleConfigRosSoftwareComponent();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
                      }
                      add(
                        current,
                        "softwareComponents",
                        lv_softwareComponents_13_0,
                        "de.fraunhofer.ipa.deployment.PlanWithRosmodel.ConfigRosSoftwareComponent");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:504:3: ( rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinus) ) {
                    alt8=1;
                }


                switch (alt8) {
              case 1 :
                  // InternalPlanWithRosmodelParser.g:505:4: rulePreListElement ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) )
                  {

                          newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getPreListElementParserRuleCall_14_0());

                  pushFollow(FOLLOW_5);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalPlanWithRosmodelParser.g:512:4: ( (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent ) )
                  // InternalPlanWithRosmodelParser.g:513:5: (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent )
                  {
                  // InternalPlanWithRosmodelParser.g:513:5: (lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent )
                  // InternalPlanWithRosmodelParser.g:514:6: lv_softwareComponents_15_0= ruleConfigRosSoftwareComponent
                  {

                              newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getSoftwareComponentsConfigRosSoftwareComponentParserRuleCall_14_1_0());

                  pushFollow(FOLLOW_13);
                  lv_softwareComponents_15_0=ruleConfigRosSoftwareComponent();

                  state._fsp--;


                              if (current==null) {
                                current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
                              }
                              add(
                                current,
                                "softwareComponents",
                                lv_softwareComponents_15_0,
                                "de.fraunhofer.ipa.deployment.PlanWithRosmodel.ConfigRosSoftwareComponent");
                              afterParserOrEnumRuleCall();


                  }


                  }


                  }
                  break;

              default :
                  break loop8;
                }
            } while (true);

            this_DEDENT_16=(Token)match(input,RULE_DEDENT,FOLLOW_21);

                  newLeafNode(this_DEDENT_16, grammarAccess.getRossystemImplementationAssignmentAccess().getDEDENTTerminalRuleCall_15());

            // InternalPlanWithRosmodelParser.g:536:3: (otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RuntimeType) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:537:4: otherlv_17= RuntimeType ( (lv_runtimeType_18_0= ruleAbstractRuntime ) )
                    {
                    otherlv_17=(Token)match(input,RuntimeType,FOLLOW_3);

                            newLeafNode(otherlv_17, grammarAccess.getRossystemImplementationAssignmentAccess().getRuntimeTypeKeyword_16_0());

                    // InternalPlanWithRosmodelParser.g:541:4: ( (lv_runtimeType_18_0= ruleAbstractRuntime ) )
                    // InternalPlanWithRosmodelParser.g:542:5: (lv_runtimeType_18_0= ruleAbstractRuntime )
                    {
                    // InternalPlanWithRosmodelParser.g:542:5: (lv_runtimeType_18_0= ruleAbstractRuntime )
                    // InternalPlanWithRosmodelParser.g:543:6: lv_runtimeType_18_0= ruleAbstractRuntime
                    {

                                newCompositeNode(grammarAccess.getRossystemImplementationAssignmentAccess().getRuntimeTypeAbstractRuntimeParserRuleCall_16_1_0());

                    pushFollow(FOLLOW_9);
                    lv_runtimeType_18_0=ruleAbstractRuntime();

                    state._fsp--;


                                if (current==null) {
                                  current = createModelElementForParent(grammarAccess.getRossystemImplementationAssignmentRule());
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

                  newLeafNode(this_DEDENT_19, grammarAccess.getRossystemImplementationAssignmentAccess().getDEDENTTerminalRuleCall_17());


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
    // $ANTLR end "ruleRossystemImplementationAssignment"


    // $ANTLR start "entryRuleConfigRosParameter"
    // InternalPlanWithRosmodelParser.g:569:1: entryRuleConfigRosParameter returns [EObject current=null] : iv_ruleConfigRosParameter= ruleConfigRosParameter EOF ;
    public final EObject entryRuleConfigRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigRosParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:569:59: (iv_ruleConfigRosParameter= ruleConfigRosParameter EOF )
            // InternalPlanWithRosmodelParser.g:570:2: iv_ruleConfigRosParameter= ruleConfigRosParameter EOF
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
    // InternalPlanWithRosmodelParser.g:576:1: ruleConfigRosParameter returns [EObject current=null] : ( () rulePreListElement (otherlv_2= RefSysParam ( ( ruleEString ) ) )? (otherlv_4= RefNodeParam ( ( ruleEString ) ) )? (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )? ) ;
    public final EObject ruleConfigRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_DEDENT_11=null;
        EObject lv_value_10_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:582:2: ( ( () rulePreListElement (otherlv_2= RefSysParam ( ( ruleEString ) ) )? (otherlv_4= RefNodeParam ( ( ruleEString ) ) )? (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:583:2: ( () rulePreListElement (otherlv_2= RefSysParam ( ( ruleEString ) ) )? (otherlv_4= RefNodeParam ( ( ruleEString ) ) )? (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:583:2: ( () rulePreListElement (otherlv_2= RefSysParam ( ( ruleEString ) ) )? (otherlv_4= RefNodeParam ( ( ruleEString ) ) )? (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:584:3: () rulePreListElement (otherlv_2= RefSysParam ( ( ruleEString ) ) )? (otherlv_4= RefNodeParam ( ( ruleEString ) ) )? (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:584:3: ()
            // InternalPlanWithRosmodelParser.g:585:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getConfigRosParameterAccess().getConfigRosParameterAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getConfigRosParameterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_22);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:598:3: (otherlv_2= RefSysParam ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RefSysParam) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:599:4: otherlv_2= RefSysParam ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,RefSysParam,FOLLOW_5);

                            newLeafNode(otherlv_2, grammarAccess.getConfigRosParameterAccess().getRefSysParamKeyword_2_0());

                    // InternalPlanWithRosmodelParser.g:603:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:604:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:604:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:605:6: ruleEString
                    {

                                if (current==null) {
                                  current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigRosParameterAccess().getRefSysParamParameterCrossReference_2_1_0());

                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                                afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:620:3: (otherlv_4= RefNodeParam ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RefNodeParam) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:621:4: otherlv_4= RefNodeParam ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,RefNodeParam,FOLLOW_5);

                            newLeafNode(otherlv_4, grammarAccess.getConfigRosParameterAccess().getRefNodeParamKeyword_3_0());

                    // InternalPlanWithRosmodelParser.g:625:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:626:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:626:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:627:6: ruleEString
                    {

                                if (current==null) {
                                  current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                }


                                newCompositeNode(grammarAccess.getConfigRosParameterAccess().getRefNodeParamRosParameterCrossReference_3_1_0());

                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                                afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:642:3: (this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INDENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:643:4: this_INDENT_6= RULE_INDENT (otherlv_7= To ( ( ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
                    {
                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_25);

                            newLeafNode(this_INDENT_6, grammarAccess.getConfigRosParameterAccess().getINDENTTerminalRuleCall_4_0());

                    // InternalPlanWithRosmodelParser.g:647:4: (otherlv_7= To ( ( ruleEString ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==To) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:648:5: otherlv_7= To ( ( ruleEString ) )
                            {
                            otherlv_7=(Token)match(input,To,FOLLOW_5);

                                      newLeafNode(otherlv_7, grammarAccess.getConfigRosParameterAccess().getToKeyword_4_1_0());

                            // InternalPlanWithRosmodelParser.g:652:5: ( ( ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:653:6: ( ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:653:6: ( ruleEString )
                            // InternalPlanWithRosmodelParser.g:654:7: ruleEString
                            {

                                          if (current==null) {
                                            current = createModelElement(grammarAccess.getConfigRosParameterRule());
                                          }


                                          newCompositeNode(grammarAccess.getConfigRosParameterAccess().getToAbstractConfigPropertyCrossReference_4_1_1_0());

                            pushFollow(FOLLOW_26);
                            ruleEString();

                            state._fsp--;


                                          afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:669:4: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Value) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:670:5: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                            {
                            otherlv_9=(Token)match(input,Value,FOLLOW_27);

                                      newLeafNode(otherlv_9, grammarAccess.getConfigRosParameterAccess().getValueKeyword_4_2_0());

                            // InternalPlanWithRosmodelParser.g:674:5: ( (lv_value_10_0= rulePropertyValue ) )
                            // InternalPlanWithRosmodelParser.g:675:6: (lv_value_10_0= rulePropertyValue )
                            {
                            // InternalPlanWithRosmodelParser.g:675:6: (lv_value_10_0= rulePropertyValue )
                            // InternalPlanWithRosmodelParser.g:676:7: lv_value_10_0= rulePropertyValue
                            {

                                          newCompositeNode(grammarAccess.getConfigRosParameterAccess().getValuePropertyValueParserRuleCall_4_2_1_0());

                            pushFollow(FOLLOW_9);
                            lv_value_10_0=rulePropertyValue();

                            state._fsp--;


                                          if (current==null) {
                                            current = createModelElementForParent(grammarAccess.getConfigRosParameterRule());
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

                            newLeafNode(this_DEDENT_11, grammarAccess.getConfigRosParameterAccess().getDEDENTTerminalRuleCall_4_3());


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
    // InternalPlanWithRosmodelParser.g:703:1: entryRuleAbstractRealization returns [EObject current=null] : iv_ruleAbstractRealization= ruleAbstractRealization EOF ;
    public final EObject entryRuleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:703:60: (iv_ruleAbstractRealization= ruleAbstractRealization EOF )
            // InternalPlanWithRosmodelParser.g:704:2: iv_ruleAbstractRealization= ruleAbstractRealization EOF
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
    // InternalPlanWithRosmodelParser.g:710:1: ruleAbstractRealization returns [EObject current=null] : this_Realization_0= ruleRealization ;
    public final EObject ruleAbstractRealization() throws RecognitionException {
        EObject current = null;

        EObject this_Realization_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:716:2: (this_Realization_0= ruleRealization )
            // InternalPlanWithRosmodelParser.g:717:2: this_Realization_0= ruleRealization
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
    // InternalPlanWithRosmodelParser.g:728:1: entryRuleAbstractConfigExecutionParameter returns [EObject current=null] : iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF ;
    public final EObject entryRuleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:728:73: (iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:729:2: iv_ruleAbstractConfigExecutionParameter= ruleAbstractConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:735:1: ruleAbstractConfigExecutionParameter returns [EObject current=null] : this_ConfigExecutionParameter_0= ruleConfigExecutionParameter ;
    public final EObject ruleAbstractConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigExecutionParameter_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:741:2: (this_ConfigExecutionParameter_0= ruleConfigExecutionParameter )
            // InternalPlanWithRosmodelParser.g:742:2: this_ConfigExecutionParameter_0= ruleConfigExecutionParameter
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
    // InternalPlanWithRosmodelParser.g:753:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // InternalPlanWithRosmodelParser.g:753:52: (iv_ruleRealization= ruleRealization EOF )
            // InternalPlanWithRosmodelParser.g:754:2: iv_ruleRealization= ruleRealization EOF
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
    // InternalPlanWithRosmodelParser.g:760:1: ruleRealization returns [EObject current=null] : ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token this_DEDENT_4=null;
        EObject lv_realizations_3_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:766:2: ( ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:767:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:767:2: ( () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:768:3: () (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:768:3: ()
            // InternalPlanWithRosmodelParser.g:769:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getRealizationAccess().getRealizationAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:775:3: (otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Assignment) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:776:4: otherlv_1= Assignment this_INDENT_2= RULE_INDENT ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+ this_DEDENT_4= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Assignment,FOLLOW_3);

                            newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getAssignmentKeyword_1_0());

                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_12);

                            newLeafNode(this_INDENT_2, grammarAccess.getRealizationAccess().getINDENTTerminalRuleCall_1_1());

                    // InternalPlanWithRosmodelParser.g:784:4: ( (lv_realizations_3_0= ruleAbstractComputationAssignment ) )+
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
                          // InternalPlanWithRosmodelParser.g:785:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                          {
                          // InternalPlanWithRosmodelParser.g:785:5: (lv_realizations_3_0= ruleAbstractComputationAssignment )
                          // InternalPlanWithRosmodelParser.g:786:6: lv_realizations_3_0= ruleAbstractComputationAssignment
                          {

                                      newCompositeNode(grammarAccess.getRealizationAccess().getRealizationsAbstractComputationAssignmentParserRuleCall_1_2_0());

                          pushFollow(FOLLOW_13);
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
                          if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // InternalPlanWithRosmodelParser.g:812:1: entryRuleConfigSoftwareComponent returns [EObject current=null] : iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF ;
    public final EObject entryRuleConfigSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigSoftwareComponent = null;


        try {
            // InternalPlanWithRosmodelParser.g:812:64: (iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF )
            // InternalPlanWithRosmodelParser.g:813:2: iv_ruleConfigSoftwareComponent= ruleConfigSoftwareComponent EOF
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
    // InternalPlanWithRosmodelParser.g:819:1: ruleConfigSoftwareComponent returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:825:2: ( ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:826:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:826:2: ( ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:827:3: ( ( ruleEString ) ) (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            {
            // InternalPlanWithRosmodelParser.g:827:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:828:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:828:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:829:5: ruleEString
            {

                      if (current==null) {
                        current = createModelElement(grammarAccess.getConfigSoftwareComponentRule());
                      }


                      newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getComponentAbstractComputationAssignmentTargetCrossReference_0_0());

            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


                      afterParserOrEnumRuleCall();


            }


            }

            // InternalPlanWithRosmodelParser.g:843:3: (otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Colon) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:844:4: otherlv_1= Colon (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )? (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )? this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_28);

                            newLeafNode(otherlv_1, grammarAccess.getConfigSoftwareComponentAccess().getColonKeyword_1_0());

                    // InternalPlanWithRosmodelParser.g:848:4: (this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_INDENT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:849:5: this_INDENT_2= RULE_INDENT otherlv_3= ExecutionConfiguration this_INDENT_4= RULE_INDENT ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+ this_DEDENT_6= RULE_DEDENT
                            {
                            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_29);

                                      newLeafNode(this_INDENT_2, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_0());

                            otherlv_3=(Token)match(input,ExecutionConfiguration,FOLLOW_3);

                                      newLeafNode(otherlv_3, grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationKeyword_1_1_1());

                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_12);

                                      newLeafNode(this_INDENT_4, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_1_2());

                            // InternalPlanWithRosmodelParser.g:861:5: ( (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter ) )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==HyphenMinus) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                              case 1 :
                                  // InternalPlanWithRosmodelParser.g:862:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                  {
                                  // InternalPlanWithRosmodelParser.g:862:6: (lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter )
                                  // InternalPlanWithRosmodelParser.g:863:7: lv_executionConfiguration_5_0= ruleAbstractConfigExecutionParameter
                                  {

                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getExecutionConfigurationAbstractConfigExecutionParameterParserRuleCall_1_1_3_0());

                                  pushFollow(FOLLOW_13);
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
                                  if ( cnt17 >= 1 ) break loop17;
                                        EarlyExitException eee =
                                            new EarlyExitException(17, input);
                                        throw eee;
                                }
                                cnt17++;
                            } while (true);

                            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                                      newLeafNode(this_DEDENT_6, grammarAccess.getConfigSoftwareComponentAccess().getDEDENTTerminalRuleCall_1_1_4());


                            }
                            break;

                    }

                    // InternalPlanWithRosmodelParser.g:885:4: (otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==StartCommand) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:886:5: otherlv_7= StartCommand this_INDENT_8= RULE_INDENT rulePreListElement ( (lv_startCommand_10_0= ruleEString ) ) ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )? this_DEDENT_13= RULE_DEDENT
                            {
                            otherlv_7=(Token)match(input,StartCommand,FOLLOW_3);

                                      newLeafNode(otherlv_7, grammarAccess.getConfigSoftwareComponentAccess().getStartCommandKeyword_1_2_0());

                            this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_12);

                                      newLeafNode(this_INDENT_8, grammarAccess.getConfigSoftwareComponentAccess().getINDENTTerminalRuleCall_1_2_1());


                                      newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_2());

                            pushFollow(FOLLOW_5);
                            rulePreListElement();

                            state._fsp--;


                                      afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:901:5: ( (lv_startCommand_10_0= ruleEString ) )
                            // InternalPlanWithRosmodelParser.g:902:6: (lv_startCommand_10_0= ruleEString )
                            {
                            // InternalPlanWithRosmodelParser.g:902:6: (lv_startCommand_10_0= ruleEString )
                            // InternalPlanWithRosmodelParser.g:903:7: lv_startCommand_10_0= ruleEString
                            {

                                          newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getStartCommandEStringParserRuleCall_1_2_3_0());

                            pushFollow(FOLLOW_13);
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

                            // InternalPlanWithRosmodelParser.g:920:5: ( rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )* )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==HyphenMinus) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalPlanWithRosmodelParser.g:921:6: rulePreListElement ( (lv_startCommand_12_0= ruleEString ) )*
                                    {

                                                newCompositeNode(grammarAccess.getConfigSoftwareComponentAccess().getPreListElementParserRuleCall_1_2_4_0());

                                    pushFollow(FOLLOW_15);
                                    rulePreListElement();

                                    state._fsp--;


                                                afterParserOrEnumRuleCall();

                                    // InternalPlanWithRosmodelParser.g:928:6: ( (lv_startCommand_12_0= ruleEString ) )*
                                    loop19:
                                    do {
                                        int alt19=2;
                                        int LA19_0 = input.LA(1);

                                        if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                                            alt19=1;
                                        }


                                        switch (alt19) {
                                      case 1 :
                                          // InternalPlanWithRosmodelParser.g:929:7: (lv_startCommand_12_0= ruleEString )
                                          {
                                          // InternalPlanWithRosmodelParser.g:929:7: (lv_startCommand_12_0= ruleEString )
                                          // InternalPlanWithRosmodelParser.g:930:8: lv_startCommand_12_0= ruleEString
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
                                          break loop19;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalPlanWithRosmodelParser.g:962:1: entryRuleMiddleware returns [EObject current=null] : iv_ruleMiddleware= ruleMiddleware EOF ;
    public final EObject entryRuleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:962:51: (iv_ruleMiddleware= ruleMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:963:2: iv_ruleMiddleware= ruleMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:969:1: ruleMiddleware returns [EObject current=null] : this_RosMiddleware_0= ruleRosMiddleware ;
    public final EObject ruleMiddleware() throws RecognitionException {
        EObject current = null;

        EObject this_RosMiddleware_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:975:2: (this_RosMiddleware_0= ruleRosMiddleware )
            // InternalPlanWithRosmodelParser.g:976:2: this_RosMiddleware_0= ruleRosMiddleware
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
    // InternalPlanWithRosmodelParser.g:987:1: entryRuleRosMiddleware returns [EObject current=null] : iv_ruleRosMiddleware= ruleRosMiddleware EOF ;
    public final EObject entryRuleRosMiddleware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosMiddleware = null;


        try {
            // InternalPlanWithRosmodelParser.g:987:54: (iv_ruleRosMiddleware= ruleRosMiddleware EOF )
            // InternalPlanWithRosmodelParser.g:988:2: iv_ruleRosMiddleware= ruleRosMiddleware EOF
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
    // InternalPlanWithRosmodelParser.g:994:1: ruleRosMiddleware returns [EObject current=null] : ( (lv_value_0_0= ruleROSDistro ) ) ;
    public final EObject ruleRosMiddleware() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1000:2: ( ( (lv_value_0_0= ruleROSDistro ) ) )
            // InternalPlanWithRosmodelParser.g:1001:2: ( (lv_value_0_0= ruleROSDistro ) )
            {
            // InternalPlanWithRosmodelParser.g:1001:2: ( (lv_value_0_0= ruleROSDistro ) )
            // InternalPlanWithRosmodelParser.g:1002:3: (lv_value_0_0= ruleROSDistro )
            {
            // InternalPlanWithRosmodelParser.g:1002:3: (lv_value_0_0= ruleROSDistro )
            // InternalPlanWithRosmodelParser.g:1003:4: lv_value_0_0= ruleROSDistro
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
    // InternalPlanWithRosmodelParser.g:1023:1: entryRuleAbstractRuntime returns [EObject current=null] : iv_ruleAbstractRuntime= ruleAbstractRuntime EOF ;
    public final EObject entryRuleAbstractRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRuntime = null;


        try {
            // InternalPlanWithRosmodelParser.g:1023:56: (iv_ruleAbstractRuntime= ruleAbstractRuntime EOF )
            // InternalPlanWithRosmodelParser.g:1024:2: iv_ruleAbstractRuntime= ruleAbstractRuntime EOF
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
    // InternalPlanWithRosmodelParser.g:1030:1: ruleAbstractRuntime returns [EObject current=null] : this_ContainerRuntime_0= ruleContainerRuntime ;
    public final EObject ruleAbstractRuntime() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerRuntime_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1036:2: (this_ContainerRuntime_0= ruleContainerRuntime )
            // InternalPlanWithRosmodelParser.g:1037:2: this_ContainerRuntime_0= ruleContainerRuntime
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
    // InternalPlanWithRosmodelParser.g:1048:1: entryRuleContainerRuntime returns [EObject current=null] : iv_ruleContainerRuntime= ruleContainerRuntime EOF ;
    public final EObject entryRuleContainerRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerRuntime = null;


        try {
            // InternalPlanWithRosmodelParser.g:1048:57: (iv_ruleContainerRuntime= ruleContainerRuntime EOF )
            // InternalPlanWithRosmodelParser.g:1049:2: iv_ruleContainerRuntime= ruleContainerRuntime EOF
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
    // InternalPlanWithRosmodelParser.g:1055:1: ruleContainerRuntime returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1061:2: ( ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1062:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1062:2: ( () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1063:3: () this_INDENT_1= RULE_INDENT otherlv_2= Type ( (lv_type_3_0= ruleRunTimeType ) ) (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1063:3: ()
            // InternalPlanWithRosmodelParser.g:1064:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getContainerRuntimeAccess().getContainerRuntimeAction_0(),
                      current);


            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_1, grammarAccess.getContainerRuntimeAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Type,FOLLOW_31);

                  newLeafNode(otherlv_2, grammarAccess.getContainerRuntimeAccess().getTypeKeyword_2());

            // InternalPlanWithRosmodelParser.g:1078:3: ( (lv_type_3_0= ruleRunTimeType ) )
            // InternalPlanWithRosmodelParser.g:1079:4: (lv_type_3_0= ruleRunTimeType )
            {
            // InternalPlanWithRosmodelParser.g:1079:4: (lv_type_3_0= ruleRunTimeType )
            // InternalPlanWithRosmodelParser.g:1080:5: lv_type_3_0= ruleRunTimeType
            {

                      newCompositeNode(grammarAccess.getContainerRuntimeAccess().getTypeRunTimeTypeEnumRuleCall_3_0());

            pushFollow(FOLLOW_32);
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

            // InternalPlanWithRosmodelParser.g:1097:3: (otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Resource) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1098:4: otherlv_4= Resource this_INDENT_5= RULE_INDENT rulePreListElement ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) ) ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )? this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,Resource,FOLLOW_3);

                            newLeafNode(otherlv_4, grammarAccess.getContainerRuntimeAccess().getResourceKeyword_4_0());

                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_12);

                            newLeafNode(this_INDENT_5, grammarAccess.getContainerRuntimeAccess().getINDENTTerminalRuleCall_4_1());


                            newCompositeNode(grammarAccess.getContainerRuntimeAccess().getPreListElementParserRuleCall_4_2());

                    pushFollow(FOLLOW_4);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:1113:4: ( (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce ) )
                    // InternalPlanWithRosmodelParser.g:1114:5: (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce )
                    {
                    // InternalPlanWithRosmodelParser.g:1114:5: (lv_opertingSystemResource_7_0= ruleOperatingSystemResouce )
                    // InternalPlanWithRosmodelParser.g:1115:6: lv_opertingSystemResource_7_0= ruleOperatingSystemResouce
                    {

                                newCompositeNode(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceOperatingSystemResouceParserRuleCall_4_3_0());

                    pushFollow(FOLLOW_13);
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

                    // InternalPlanWithRosmodelParser.g:1132:4: ( rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+ )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==HyphenMinus) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPlanWithRosmodelParser.g:1133:5: rulePreListElement ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+
                            {

                                      newCompositeNode(grammarAccess.getContainerRuntimeAccess().getPreListElementParserRuleCall_4_4_0());

                            pushFollow(FOLLOW_4);
                            rulePreListElement();

                            state._fsp--;


                                      afterParserOrEnumRuleCall();

                            // InternalPlanWithRosmodelParser.g:1140:5: ( (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce ) )+
                            int cnt23=0;
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==Name) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                              case 1 :
                                  // InternalPlanWithRosmodelParser.g:1141:6: (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce )
                                  {
                                  // InternalPlanWithRosmodelParser.g:1141:6: (lv_opertingSystemResource_9_0= ruleOperatingSystemResouce )
                                  // InternalPlanWithRosmodelParser.g:1142:7: lv_opertingSystemResource_9_0= ruleOperatingSystemResouce
                                  {

                                                newCompositeNode(grammarAccess.getContainerRuntimeAccess().getOpertingSystemResourceOperatingSystemResouceParserRuleCall_4_4_1_0());

                                  pushFollow(FOLLOW_33);
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
                                  if ( cnt23 >= 1 ) break loop23;
                                        EarlyExitException eee =
                                            new EarlyExitException(23, input);
                                        throw eee;
                                }
                                cnt23++;
                            } while (true);


                            }
                            break;

                    }

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalPlanWithRosmodelParser.g:1173:1: entryRuleConfigExecutionParameter returns [EObject current=null] : iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF ;
    public final EObject entryRuleConfigExecutionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigExecutionParameter = null;


        try {
            // InternalPlanWithRosmodelParser.g:1173:65: (iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF )
            // InternalPlanWithRosmodelParser.g:1174:2: iv_ruleConfigExecutionParameter= ruleConfigExecutionParameter EOF
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
    // InternalPlanWithRosmodelParser.g:1180:1: ruleConfigExecutionParameter returns [EObject current=null] : ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1186:2: ( ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1187:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1187:2: ( () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1188:3: () rulePreListElement otherlv_2= From ( ( ruleEString ) ) this_INDENT_4= RULE_INDENT (otherlv_5= To ( ( ruleEString ) ) )? (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )? this_DEDENT_9= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1188:3: ()
            // InternalPlanWithRosmodelParser.g:1189:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getConfigExecutionParameterAccess().getConfigExecutionParameterAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_34);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,From,FOLLOW_5);

                  newLeafNode(otherlv_2, grammarAccess.getConfigExecutionParameterAccess().getFromKeyword_2());

            // InternalPlanWithRosmodelParser.g:1206:3: ( ( ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1207:4: ( ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1207:4: ( ruleEString )
            // InternalPlanWithRosmodelParser.g:1208:5: ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_25);

                  newLeafNode(this_INDENT_4, grammarAccess.getConfigExecutionParameterAccess().getINDENTTerminalRuleCall_4());

            // InternalPlanWithRosmodelParser.g:1226:3: (otherlv_5= To ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==To) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1227:4: otherlv_5= To ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,To,FOLLOW_5);

                            newLeafNode(otherlv_5, grammarAccess.getConfigExecutionParameterAccess().getToKeyword_5_0());

                    // InternalPlanWithRosmodelParser.g:1231:4: ( ( ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1232:5: ( ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1232:5: ( ruleEString )
                    // InternalPlanWithRosmodelParser.g:1233:6: ruleEString
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

            // InternalPlanWithRosmodelParser.g:1248:3: (otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Value) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1249:4: otherlv_7= Value ( (lv_value_8_0= rulePropertyValue ) )
                    {
                    otherlv_7=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_7, grammarAccess.getConfigExecutionParameterAccess().getValueKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1253:4: ( (lv_value_8_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1254:5: (lv_value_8_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1254:5: (lv_value_8_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1255:6: lv_value_8_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getConfigExecutionParameterAccess().getValuePropertyValueParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_9);
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
    // InternalPlanWithRosmodelParser.g:1281:1: entryRuleOperatingSystemResouce returns [EObject current=null] : iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF ;
    public final EObject entryRuleOperatingSystemResouce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatingSystemResouce = null;


        try {
            // InternalPlanWithRosmodelParser.g:1281:63: (iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF )
            // InternalPlanWithRosmodelParser.g:1282:2: iv_ruleOperatingSystemResouce= ruleOperatingSystemResouce EOF
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
    // InternalPlanWithRosmodelParser.g:1288:1: ruleOperatingSystemResouce returns [EObject current=null] : ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1294:2: ( ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1295:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1295:2: ( () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1296:3: () otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Type ( (lv_type_5_0= ruleOpertingSystemResouceType ) ) (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1296:3: ()
            // InternalPlanWithRosmodelParser.g:1297:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getOperatingSystemResouceAccess().getOperatingSystemResouceAction_0(),
                      current);


            }

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getOperatingSystemResouceAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1307:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1308:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1308:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1309:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_30);

                  newLeafNode(this_INDENT_3, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type,FOLLOW_35);

                  newLeafNode(otherlv_4, grammarAccess.getOperatingSystemResouceAccess().getTypeKeyword_4());

            // InternalPlanWithRosmodelParser.g:1334:3: ( (lv_type_5_0= ruleOpertingSystemResouceType ) )
            // InternalPlanWithRosmodelParser.g:1335:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            {
            // InternalPlanWithRosmodelParser.g:1335:4: (lv_type_5_0= ruleOpertingSystemResouceType )
            // InternalPlanWithRosmodelParser.g:1336:5: lv_type_5_0= ruleOpertingSystemResouceType
            {

                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getTypeOpertingSystemResouceTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_36);
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

            // InternalPlanWithRosmodelParser.g:1353:3: (otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Properties) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1354:4: otherlv_6= Properties this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Properties,FOLLOW_3);

                            newLeafNode(otherlv_6, grammarAccess.getOperatingSystemResouceAccess().getPropertiesKeyword_6_0());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_12);

                            newLeafNode(this_INDENT_7, grammarAccess.getOperatingSystemResouceAccess().getINDENTTerminalRuleCall_6_1());

                    // InternalPlanWithRosmodelParser.g:1362:4: ( (lv_properties_8_0= ruleAbstractOperatingSystemProperty ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==HyphenMinus) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                      case 1 :
                          // InternalPlanWithRosmodelParser.g:1363:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          {
                          // InternalPlanWithRosmodelParser.g:1363:5: (lv_properties_8_0= ruleAbstractOperatingSystemProperty )
                          // InternalPlanWithRosmodelParser.g:1364:6: lv_properties_8_0= ruleAbstractOperatingSystemProperty
                          {

                                      newCompositeNode(grammarAccess.getOperatingSystemResouceAccess().getPropertiesAbstractOperatingSystemPropertyParserRuleCall_6_2_0());

                          pushFollow(FOLLOW_13);
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
                          if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalPlanWithRosmodelParser.g:1394:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1394:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1395:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1401:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1407:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalPlanWithRosmodelParser.g:1408:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalPlanWithRosmodelParser.g:1408:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==HyphenMinus) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==Name) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==Os_version) ) {
                        alt30=2;
                    }
                    else if ( (LA30_2==Os_name) ) {
                        alt30=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1409:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalPlanWithRosmodelParser.g:1418:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalPlanWithRosmodelParser.g:1430:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1430:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1431:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1437:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1443:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1444:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1444:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1445:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1445:3: ()
            // InternalPlanWithRosmodelParser.g:1446:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_37);

                  newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalPlanWithRosmodelParser.g:1463:3: ( (lv_name_3_0= Os_name ) )
            // InternalPlanWithRosmodelParser.g:1464:4: (lv_name_3_0= Os_name )
            {
            // InternalPlanWithRosmodelParser.g:1464:4: (lv_name_3_0= Os_name )
            // InternalPlanWithRosmodelParser.g:1465:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalPlanWithRosmodelParser.g:1485:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1486:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1486:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1487:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:1504:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1505:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1509:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1510:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1510:5: (lv_description_8_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1511:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalPlanWithRosmodelParser.g:1529:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Value) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1530:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalPlanWithRosmodelParser.g:1534:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1535:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1535:5: (lv_value_10_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1536:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_9);
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
    // InternalPlanWithRosmodelParser.g:1562:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1562:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalPlanWithRosmodelParser.g:1563:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1569:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalPlanWithRosmodelParser.g:1575:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:1576:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:1576:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:1577:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalPlanWithRosmodelParser.g:1577:3: ()
            // InternalPlanWithRosmodelParser.g:1578:4:
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

            otherlv_2=(Token)match(input,Name,FOLLOW_41);

                  newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalPlanWithRosmodelParser.g:1595:3: ( (lv_name_3_0= Os_version ) )
            // InternalPlanWithRosmodelParser.g:1596:4: (lv_name_3_0= Os_version )
            {
            // InternalPlanWithRosmodelParser.g:1596:4: (lv_name_3_0= Os_version )
            // InternalPlanWithRosmodelParser.g:1597:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_3);

                      newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalPlanWithRosmodelParser.g:1617:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1618:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1618:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1619:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_40);
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

            // InternalPlanWithRosmodelParser.g:1636:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Description) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1637:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1641:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1642:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1642:5: (lv_description_8_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1643:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalPlanWithRosmodelParser.g:1661:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Value) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1662:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalPlanWithRosmodelParser.g:1666:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1667:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1667:5: (lv_value_10_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1668:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_9);
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
    // InternalPlanWithRosmodelParser.g:1694:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalPlanWithRosmodelParser.g:1694:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalPlanWithRosmodelParser.g:1695:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalPlanWithRosmodelParser.g:1701:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1707:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalPlanWithRosmodelParser.g:1708:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalPlanWithRosmodelParser.g:1708:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt35=5;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1709:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalPlanWithRosmodelParser.g:1718:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalPlanWithRosmodelParser.g:1727:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalPlanWithRosmodelParser.g:1736:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalPlanWithRosmodelParser.g:1745:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalPlanWithRosmodelParser.g:1757:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:1757:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalPlanWithRosmodelParser.g:1758:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalPlanWithRosmodelParser.g:1764:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:1770:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:1771:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:1771:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt36=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt36=1;
                }
                break;
            case MaximumKind:
                {
                alt36=2;
                }
                break;
            case MinimumKind:
                {
                alt36=3;
                }
                break;
            case RangeKind:
                {
                alt36=4;
                }
                break;
            case SelectionKind:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1772:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalPlanWithRosmodelParser.g:1781:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalPlanWithRosmodelParser.g:1790:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalPlanWithRosmodelParser.g:1799:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalPlanWithRosmodelParser.g:1808:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalPlanWithRosmodelParser.g:1820:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalPlanWithRosmodelParser.g:1820:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalPlanWithRosmodelParser.g:1821:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalPlanWithRosmodelParser.g:1827:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1833:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1834:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1834:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1835:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1846:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1847:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1847:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1848:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_39);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:1873:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalPlanWithRosmodelParser.g:1874:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:1874:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalPlanWithRosmodelParser.g:1875:5: lv_kind_5_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_42);
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

            // InternalPlanWithRosmodelParser.g:1892:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Description) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1893:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:1897:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:1898:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:1898:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:1899:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_43);
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

            // InternalPlanWithRosmodelParser.g:1917:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Value) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1918:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:1922:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:1923:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:1923:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:1924:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalPlanWithRosmodelParser.g:1942:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DEDENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:1943:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:1952:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalPlanWithRosmodelParser.g:1952:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalPlanWithRosmodelParser.g:1953:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalPlanWithRosmodelParser.g:1959:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:1965:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:1966:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:1966:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:1967:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:1978:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:1979:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:1979:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:1980:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_45);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2005:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalPlanWithRosmodelParser.g:2006:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:2006:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalPlanWithRosmodelParser.g:2007:5: lv_kind_5_0= ruleMaximumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_42);
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

            // InternalPlanWithRosmodelParser.g:2024:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Description) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2025:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2029:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2030:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2030:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2031:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_43);
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

            // InternalPlanWithRosmodelParser.g:2049:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Value) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2050:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:2054:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2055:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2055:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2056:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalPlanWithRosmodelParser.g:2074:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DEDENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2075:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2084:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalPlanWithRosmodelParser.g:2084:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalPlanWithRosmodelParser.g:2085:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalPlanWithRosmodelParser.g:2091:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2097:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2098:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2098:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2099:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2110:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2111:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2111:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2112:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_46);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2137:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalPlanWithRosmodelParser.g:2138:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:2138:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalPlanWithRosmodelParser.g:2139:5: lv_kind_5_0= ruleMinimumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_42);
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

            // InternalPlanWithRosmodelParser.g:2156:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Description) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2157:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2161:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2162:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2162:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2163:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_43);
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

            // InternalPlanWithRosmodelParser.g:2181:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Value) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2182:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_27);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalPlanWithRosmodelParser.g:2186:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2187:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2187:5: (lv_value_9_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2188:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_44);
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

            // InternalPlanWithRosmodelParser.g:2206:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DEDENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2207:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2216:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalPlanWithRosmodelParser.g:2216:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalPlanWithRosmodelParser.g:2217:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalPlanWithRosmodelParser.g:2223:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2229:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2230:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2230:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2231:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2242:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2243:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2243:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2244:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_47);

                  newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2269:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalPlanWithRosmodelParser.g:2270:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:2270:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalPlanWithRosmodelParser.g:2271:5: lv_kind_5_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_42);
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

            // InternalPlanWithRosmodelParser.g:2288:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Description) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2289:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2293:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2294:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2294:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2295:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_43);
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

            // InternalPlanWithRosmodelParser.g:2313:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Value) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2314:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                            newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_12);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_27);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2329:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2330:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2330:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2331:6: lv_value_11_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_13);
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

                    // InternalPlanWithRosmodelParser.g:2348:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==HyphenMinus) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                      case 1 :
                          // InternalPlanWithRosmodelParser.g:2349:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                          pushFollow(FOLLOW_27);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalPlanWithRosmodelParser.g:2356:5: ( (lv_value_13_0= rulePropertyValue ) )
                          // InternalPlanWithRosmodelParser.g:2357:6: (lv_value_13_0= rulePropertyValue )
                          {
                          // InternalPlanWithRosmodelParser.g:2357:6: (lv_value_13_0= rulePropertyValue )
                          // InternalPlanWithRosmodelParser.g:2358:7: lv_value_13_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getValuePropertyValueParserRuleCall_7_4_1_0());

                          pushFollow(FOLLOW_13);
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
                          break loop47;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_44);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:2381:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DEDENT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2382:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2391:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalPlanWithRosmodelParser.g:2391:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalPlanWithRosmodelParser.g:2392:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalPlanWithRosmodelParser.g:2398:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalPlanWithRosmodelParser.g:2404:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalPlanWithRosmodelParser.g:2405:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalPlanWithRosmodelParser.g:2405:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalPlanWithRosmodelParser.g:2406:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalPlanWithRosmodelParser.g:2417:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2418:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2418:4: (lv_name_2_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2419:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_38);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_48);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalPlanWithRosmodelParser.g:2444:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalPlanWithRosmodelParser.g:2445:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalPlanWithRosmodelParser.g:2445:4: (lv_kind_5_0= ruleRangeKind )
            // InternalPlanWithRosmodelParser.g:2446:5: lv_kind_5_0= ruleRangeKind
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_42);
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

            // InternalPlanWithRosmodelParser.g:2463:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2464:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalPlanWithRosmodelParser.g:2468:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalPlanWithRosmodelParser.g:2469:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalPlanWithRosmodelParser.g:2469:5: (lv_description_7_0= ruleEString )
                    // InternalPlanWithRosmodelParser.g:2470:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_43);
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

            // InternalPlanWithRosmodelParser.g:2488:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Value) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2489:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_12);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_27);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalPlanWithRosmodelParser.g:2504:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2505:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2505:5: (lv_value_11_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2506:6: lv_value_11_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_3_0());

                    pushFollow(FOLLOW_12);
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

                    // InternalPlanWithRosmodelParser.g:2530:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalPlanWithRosmodelParser.g:2531:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalPlanWithRosmodelParser.g:2531:5: (lv_value_13_0= rulePropertyValue )
                    // InternalPlanWithRosmodelParser.g:2532:6: lv_value_13_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_9);
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_44);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalPlanWithRosmodelParser.g:2554:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DEDENT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2555:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalPlanWithRosmodelParser.g:2564:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2564:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalPlanWithRosmodelParser.g:2565:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalPlanWithRosmodelParser.g:2571:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
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
            // InternalPlanWithRosmodelParser.g:2577:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalPlanWithRosmodelParser.g:2578:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalPlanWithRosmodelParser.g:2578:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt53=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt53=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt53=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt53=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt53=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt53=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt53=6;
                }
                break;
            case RULE_INDENT:
                {
                alt53=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2579:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalPlanWithRosmodelParser.g:2588:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalPlanWithRosmodelParser.g:2597:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalPlanWithRosmodelParser.g:2606:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalPlanWithRosmodelParser.g:2615:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalPlanWithRosmodelParser.g:2624:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
                    // InternalPlanWithRosmodelParser.g:2633:3: this_PropertyValueList_6= rulePropertyValueList
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
    // InternalPlanWithRosmodelParser.g:2645:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalPlanWithRosmodelParser.g:2645:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalPlanWithRosmodelParser.g:2646:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalPlanWithRosmodelParser.g:2652:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2658:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalPlanWithRosmodelParser.g:2659:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2659:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalPlanWithRosmodelParser.g:2660:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalPlanWithRosmodelParser.g:2660:3: (lv_value_0_0= ruleInteger0 )
            // InternalPlanWithRosmodelParser.g:2661:4: lv_value_0_0= ruleInteger0
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
    // InternalPlanWithRosmodelParser.g:2681:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalPlanWithRosmodelParser.g:2681:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalPlanWithRosmodelParser.g:2682:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalPlanWithRosmodelParser.g:2688:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2694:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalPlanWithRosmodelParser.g:2695:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalPlanWithRosmodelParser.g:2695:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalPlanWithRosmodelParser.g:2696:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalPlanWithRosmodelParser.g:2696:3: (lv_value_0_0= ruleDouble0 )
            // InternalPlanWithRosmodelParser.g:2697:4: lv_value_0_0= ruleDouble0
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
    // InternalPlanWithRosmodelParser.g:2717:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalPlanWithRosmodelParser.g:2717:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalPlanWithRosmodelParser.g:2718:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalPlanWithRosmodelParser.g:2724:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2730:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2731:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2731:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2732:3: (lv_value_0_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2732:3: (lv_value_0_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2733:4: lv_value_0_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2753:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalPlanWithRosmodelParser.g:2753:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalPlanWithRosmodelParser.g:2754:2: iv_rulePropertyValueList= rulePropertyValueList EOF
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
    // InternalPlanWithRosmodelParser.g:2760:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2766:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalPlanWithRosmodelParser.g:2767:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalPlanWithRosmodelParser.g:2767:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalPlanWithRosmodelParser.g:2768:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_12);

                  newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                  newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_27);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalPlanWithRosmodelParser.g:2779:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalPlanWithRosmodelParser.g:2780:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalPlanWithRosmodelParser.g:2780:4: (lv_value_2_0= rulePropertyValue )
            // InternalPlanWithRosmodelParser.g:2781:5: lv_value_2_0= rulePropertyValue
            {

                      newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            pushFollow(FOLLOW_13);
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

            // InternalPlanWithRosmodelParser.g:2798:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==HyphenMinus) ) {
                    alt54=1;
                }


                switch (alt54) {
              case 1 :
                  // InternalPlanWithRosmodelParser.g:2799:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                  {

                          newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                  pushFollow(FOLLOW_27);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalPlanWithRosmodelParser.g:2806:4: ( (lv_value_4_0= rulePropertyValue ) )
                  // InternalPlanWithRosmodelParser.g:2807:5: (lv_value_4_0= rulePropertyValue )
                  {
                  // InternalPlanWithRosmodelParser.g:2807:5: (lv_value_4_0= rulePropertyValue )
                  // InternalPlanWithRosmodelParser.g:2808:6: lv_value_4_0= rulePropertyValue
                  {

                              newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

                  pushFollow(FOLLOW_13);
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
                  break loop54;
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
    // InternalPlanWithRosmodelParser.g:2834:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:2834:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalPlanWithRosmodelParser.g:2835:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalPlanWithRosmodelParser.g:2841:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2847:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalPlanWithRosmodelParser.g:2848:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalPlanWithRosmodelParser.g:2848:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalPlanWithRosmodelParser.g:2849:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalPlanWithRosmodelParser.g:2849:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalPlanWithRosmodelParser.g:2850:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalPlanWithRosmodelParser.g:2870:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2870:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalPlanWithRosmodelParser.g:2871:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalPlanWithRosmodelParser.g:2877:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2883:2: (this_ResourceType_0= ruleResourceType )
            // InternalPlanWithRosmodelParser.g:2884:2: this_ResourceType_0= ruleResourceType
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
    // InternalPlanWithRosmodelParser.g:2895:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2895:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalPlanWithRosmodelParser.g:2896:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalPlanWithRosmodelParser.g:2902:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2908:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2909:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2909:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LinuxOpertingSystem) ) {
                alt55=1;
            }
            else if ( (LA55_0==MacOSOpertingSystem) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:2910:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalPlanWithRosmodelParser.g:2919:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalPlanWithRosmodelParser.g:2931:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalPlanWithRosmodelParser.g:2931:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalPlanWithRosmodelParser.g:2932:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalPlanWithRosmodelParser.g:2938:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2944:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:2945:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:2945:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:2946:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:2946:3: ()
            // InternalPlanWithRosmodelParser.g:2947:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:2953:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:2954:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:2954:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:2955:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:2976:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:2976:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:2977:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:2983:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:2989:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:2990:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:2990:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalPlanWithRosmodelParser.g:2991:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:2991:3: ()
            // InternalPlanWithRosmodelParser.g:2992:4:
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
    // InternalPlanWithRosmodelParser.g:3006:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalPlanWithRosmodelParser.g:3006:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalPlanWithRosmodelParser.g:3007:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalPlanWithRosmodelParser.g:3013:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3019:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalPlanWithRosmodelParser.g:3020:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalPlanWithRosmodelParser.g:3020:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalPlanWithRosmodelParser.g:3021:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalPlanWithRosmodelParser.g:3021:3: ()
            // InternalPlanWithRosmodelParser.g:3022:4:
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
    // InternalPlanWithRosmodelParser.g:3036:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3036:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3037:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3043:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3049:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPlanWithRosmodelParser.g:3050:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPlanWithRosmodelParser.g:3050:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPlanWithRosmodelParser.g:3051:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPlanWithRosmodelParser.g:3051:3: ()
            // InternalPlanWithRosmodelParser.g:3052:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:3058:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPlanWithRosmodelParser.g:3059:4: (lv_name_1_0= ruleEString )
            {
            // InternalPlanWithRosmodelParser.g:3059:4: (lv_name_1_0= ruleEString )
            // InternalPlanWithRosmodelParser.g:3060:5: lv_name_1_0= ruleEString
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
    // InternalPlanWithRosmodelParser.g:3081:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3081:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3082:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3088:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3094:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalPlanWithRosmodelParser.g:3095:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalPlanWithRosmodelParser.g:3095:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Ethernet) ) {
                alt56=1;
            }
            else if ( (LA56_0==Wlan) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3096:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalPlanWithRosmodelParser.g:3105:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalPlanWithRosmodelParser.g:3117:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3117:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3118:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3124:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3130:2: ( ( () otherlv_1= Ethernet ) )
            // InternalPlanWithRosmodelParser.g:3131:2: ( () otherlv_1= Ethernet )
            {
            // InternalPlanWithRosmodelParser.g:3131:2: ( () otherlv_1= Ethernet )
            // InternalPlanWithRosmodelParser.g:3132:3: () otherlv_1= Ethernet
            {
            // InternalPlanWithRosmodelParser.g:3132:3: ()
            // InternalPlanWithRosmodelParser.g:3133:4:
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
    // InternalPlanWithRosmodelParser.g:3147:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalPlanWithRosmodelParser.g:3147:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalPlanWithRosmodelParser.g:3148:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalPlanWithRosmodelParser.g:3154:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3160:2: ( ( () otherlv_1= Wlan ) )
            // InternalPlanWithRosmodelParser.g:3161:2: ( () otherlv_1= Wlan )
            {
            // InternalPlanWithRosmodelParser.g:3161:2: ( () otherlv_1= Wlan )
            // InternalPlanWithRosmodelParser.g:3162:3: () otherlv_1= Wlan
            {
            // InternalPlanWithRosmodelParser.g:3162:3: ()
            // InternalPlanWithRosmodelParser.g:3163:4:
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
    // InternalPlanWithRosmodelParser.g:3177:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3177:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalPlanWithRosmodelParser.g:3178:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalPlanWithRosmodelParser.g:3184:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3190:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalPlanWithRosmodelParser.g:3191:2: ( () otherlv_1= AttributeKind )
            {
            // InternalPlanWithRosmodelParser.g:3191:2: ( () otherlv_1= AttributeKind )
            // InternalPlanWithRosmodelParser.g:3192:3: () otherlv_1= AttributeKind
            {
            // InternalPlanWithRosmodelParser.g:3192:3: ()
            // InternalPlanWithRosmodelParser.g:3193:4:
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
    // InternalPlanWithRosmodelParser.g:3207:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3207:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalPlanWithRosmodelParser.g:3208:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalPlanWithRosmodelParser.g:3214:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3220:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalPlanWithRosmodelParser.g:3221:2: ( () otherlv_1= MaximumKind )
            {
            // InternalPlanWithRosmodelParser.g:3221:2: ( () otherlv_1= MaximumKind )
            // InternalPlanWithRosmodelParser.g:3222:3: () otherlv_1= MaximumKind
            {
            // InternalPlanWithRosmodelParser.g:3222:3: ()
            // InternalPlanWithRosmodelParser.g:3223:4:
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
    // InternalPlanWithRosmodelParser.g:3237:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3237:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalPlanWithRosmodelParser.g:3238:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalPlanWithRosmodelParser.g:3244:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3250:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalPlanWithRosmodelParser.g:3251:2: ( () otherlv_1= MinimumKind )
            {
            // InternalPlanWithRosmodelParser.g:3251:2: ( () otherlv_1= MinimumKind )
            // InternalPlanWithRosmodelParser.g:3252:3: () otherlv_1= MinimumKind
            {
            // InternalPlanWithRosmodelParser.g:3252:3: ()
            // InternalPlanWithRosmodelParser.g:3253:4:
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
    // InternalPlanWithRosmodelParser.g:3267:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3267:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalPlanWithRosmodelParser.g:3268:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalPlanWithRosmodelParser.g:3274:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3280:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalPlanWithRosmodelParser.g:3281:2: ( () otherlv_1= SelectionKind )
            {
            // InternalPlanWithRosmodelParser.g:3281:2: ( () otherlv_1= SelectionKind )
            // InternalPlanWithRosmodelParser.g:3282:3: () otherlv_1= SelectionKind
            {
            // InternalPlanWithRosmodelParser.g:3282:3: ()
            // InternalPlanWithRosmodelParser.g:3283:4:
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
    // InternalPlanWithRosmodelParser.g:3297:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalPlanWithRosmodelParser.g:3297:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalPlanWithRosmodelParser.g:3298:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalPlanWithRosmodelParser.g:3304:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3310:2: ( ( () otherlv_1= RangeKind ) )
            // InternalPlanWithRosmodelParser.g:3311:2: ( () otherlv_1= RangeKind )
            {
            // InternalPlanWithRosmodelParser.g:3311:2: ( () otherlv_1= RangeKind )
            // InternalPlanWithRosmodelParser.g:3312:3: () otherlv_1= RangeKind
            {
            // InternalPlanWithRosmodelParser.g:3312:3: ()
            // InternalPlanWithRosmodelParser.g:3313:4:
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
    // InternalPlanWithRosmodelParser.g:3327:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:3327:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalPlanWithRosmodelParser.g:3328:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalPlanWithRosmodelParser.g:3334:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3340:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalPlanWithRosmodelParser.g:3341:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalPlanWithRosmodelParser.g:3341:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalPlanWithRosmodelParser.g:3342:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalPlanWithRosmodelParser.g:3342:3: ()
            // InternalPlanWithRosmodelParser.g:3343:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:3349:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalPlanWithRosmodelParser.g:3350:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalPlanWithRosmodelParser.g:3350:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalPlanWithRosmodelParser.g:3351:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalPlanWithRosmodelParser.g:3372:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalPlanWithRosmodelParser.g:3372:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalPlanWithRosmodelParser.g:3373:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalPlanWithRosmodelParser.g:3379:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3385:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalPlanWithRosmodelParser.g:3386:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalPlanWithRosmodelParser.g:3386:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalPlanWithRosmodelParser.g:3387:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalPlanWithRosmodelParser.g:3387:3: ()
            // InternalPlanWithRosmodelParser.g:3388:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                      current);


            }

            // InternalPlanWithRosmodelParser.g:3394:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalPlanWithRosmodelParser.g:3395:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalPlanWithRosmodelParser.g:3395:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalPlanWithRosmodelParser.g:3396:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalPlanWithRosmodelParser.g:3417:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:3417:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalPlanWithRosmodelParser.g:3418:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalPlanWithRosmodelParser.g:3424:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3430:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalPlanWithRosmodelParser.g:3431:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalPlanWithRosmodelParser.g:3441:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalPlanWithRosmodelParser.g:3441:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalPlanWithRosmodelParser.g:3442:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalPlanWithRosmodelParser.g:3448:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3454:2: (this_DECINT_0= RULE_DECINT )
            // InternalPlanWithRosmodelParser.g:3455:2: this_DECINT_0= RULE_DECINT
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
    // InternalPlanWithRosmodelParser.g:3465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlanWithRosmodelParser.g:3465:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlanWithRosmodelParser.g:3466:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlanWithRosmodelParser.g:3472:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3478:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlanWithRosmodelParser.g:3479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlanWithRosmodelParser.g:3479:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3480:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                          current.merge(this_STRING_0);


                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3488:3: this_ID_1= RULE_ID
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
    // InternalPlanWithRosmodelParser.g:3499:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:3501:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalPlanWithRosmodelParser.g:3502:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalPlanWithRosmodelParser.g:3511:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


          enterRule();
          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalPlanWithRosmodelParser.g:3518:2: (kw= HyphenMinus )
            // InternalPlanWithRosmodelParser.g:3519:2: kw= HyphenMinus
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
    // InternalPlanWithRosmodelParser.g:3530:1: ruleROSDistro returns [Enumerator current=null] : ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) ;
    public final Enumerator ruleROSDistro() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3536:2: ( ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) ) )
            // InternalPlanWithRosmodelParser.g:3537:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            {
            // InternalPlanWithRosmodelParser.g:3537:2: ( (enumLiteral_0= Noetic ) | (enumLiteral_1= Humble ) | (enumLiteral_2= Rolling ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case Noetic:
                {
                alt58=1;
                }
                break;
            case Humble:
                {
                alt58=2;
                }
                break;
            case Rolling:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3538:3: (enumLiteral_0= Noetic )
                    {
                    // InternalPlanWithRosmodelParser.g:3538:3: (enumLiteral_0= Noetic )
                    // InternalPlanWithRosmodelParser.g:3539:4: enumLiteral_0= Noetic
                    {
                    enumLiteral_0=(Token)match(input,Noetic,FOLLOW_2);

                            current = grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getROSDistroAccess().getNoeticEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3546:3: (enumLiteral_1= Humble )
                    {
                    // InternalPlanWithRosmodelParser.g:3546:3: (enumLiteral_1= Humble )
                    // InternalPlanWithRosmodelParser.g:3547:4: enumLiteral_1= Humble
                    {
                    enumLiteral_1=(Token)match(input,Humble,FOLLOW_2);

                            current = grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getROSDistroAccess().getHumbleEnumLiteralDeclaration_1());


                    }


                    }
                    break;
                case 3 :
                    // InternalPlanWithRosmodelParser.g:3554:3: (enumLiteral_2= Rolling )
                    {
                    // InternalPlanWithRosmodelParser.g:3554:3: (enumLiteral_2= Rolling )
                    // InternalPlanWithRosmodelParser.g:3555:4: enumLiteral_2= Rolling
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
    // InternalPlanWithRosmodelParser.g:3565:1: ruleRunTimeType returns [Enumerator current=null] : (enumLiteral_0= Container ) ;
    public final Enumerator ruleRunTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3571:2: ( (enumLiteral_0= Container ) )
            // InternalPlanWithRosmodelParser.g:3572:2: (enumLiteral_0= Container )
            {
            // InternalPlanWithRosmodelParser.g:3572:2: (enumLiteral_0= Container )
            // InternalPlanWithRosmodelParser.g:3573:3: enumLiteral_0= Container
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
    // InternalPlanWithRosmodelParser.g:3582:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3588:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalPlanWithRosmodelParser.g:3589:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalPlanWithRosmodelParser.g:3589:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==X86) ) {
                alt59=1;
            }
            else if ( (LA59_0==Arm64) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3590:3: (enumLiteral_0= X86 )
                    {
                    // InternalPlanWithRosmodelParser.g:3590:3: (enumLiteral_0= X86 )
                    // InternalPlanWithRosmodelParser.g:3591:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                            current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3598:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalPlanWithRosmodelParser.g:3598:3: (enumLiteral_1= Arm64 )
                    // InternalPlanWithRosmodelParser.g:3599:4: enumLiteral_1= Arm64
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
    // InternalPlanWithRosmodelParser.g:3609:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3615:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalPlanWithRosmodelParser.g:3616:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalPlanWithRosmodelParser.g:3616:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Ubuntu) ) {
                alt60=1;
            }
            else if ( (LA60_0==Debian) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3617:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalPlanWithRosmodelParser.g:3617:3: (enumLiteral_0= Ubuntu )
                    // InternalPlanWithRosmodelParser.g:3618:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                            current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3625:3: (enumLiteral_1= Debian )
                    {
                    // InternalPlanWithRosmodelParser.g:3625:3: (enumLiteral_1= Debian )
                    // InternalPlanWithRosmodelParser.g:3626:4: enumLiteral_1= Debian
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
    // InternalPlanWithRosmodelParser.g:3636:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalPlanWithRosmodelParser.g:3642:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalPlanWithRosmodelParser.g:3643:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalPlanWithRosmodelParser.g:3643:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Focal) ) {
                alt61=1;
            }
            else if ( (LA61_0==Jammy) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalPlanWithRosmodelParser.g:3644:3: (enumLiteral_0= Focal )
                    {
                    // InternalPlanWithRosmodelParser.g:3644:3: (enumLiteral_0= Focal )
                    // InternalPlanWithRosmodelParser.g:3645:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                            current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelParser.g:3652:3: (enumLiteral_1= Jammy )
                    {
                    // InternalPlanWithRosmodelParser.g:3652:3: (enumLiteral_1= Jammy )
                    // InternalPlanWithRosmodelParser.g:3653:4: enumLiteral_1= Jammy
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


    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\62\1\54\1\72\2\70\1\53\1\13\5\uffff";
    static final String dfa_3s = "\1\62\1\54\1\74\2\70\1\53\1\32\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\5\uffff\1\11\1\10\6\uffff\1\12",
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

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1708:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000004010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0204000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1600000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001A00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000000012002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0201004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x156205A400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0300000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0200000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200004000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200004000008002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000004000000L});

}
