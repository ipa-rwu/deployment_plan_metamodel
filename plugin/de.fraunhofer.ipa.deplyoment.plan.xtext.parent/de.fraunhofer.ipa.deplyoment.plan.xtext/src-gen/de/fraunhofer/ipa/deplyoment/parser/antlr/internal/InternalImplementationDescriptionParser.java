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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SoftwareConfigurationParameter", "ImplementationDescription", "IncludeSoftwareComponent", "ExecutionRequirement", "LinuxOpertingSystem", "MacOSOpertingSystem", "DeviceRequirement", "HWSWParemeter", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "Properties", "Repository", "Processor", "RangeKind", "Container", "Ethernet", "Version", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "Url", "Git", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int AttributeKind=12;
    public static final int SoftwareConfigurationParameter=4;
    public static final int Name=31;
    public static final int Container=21;
    public static final int Debian=24;
    public static final int Version=23;
    public static final int Kind=30;
    public static final int Ubuntu=25;
    public static final int RULE_DEDENT=43;
    public static final int LinuxOpertingSystem=8;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=38;
    public static final int ExecutionRequirement=7;
    public static final int HWSWParemeter=11;
    public static final int SelectionKind=13;
    public static final int Arm64=27;
    public static final int Git=35;
    public static final int IncludeSoftwareComponent=6;
    public static final int RULE_INT=45;
    public static final int Ethernet=22;
    public static final int Value=26;
    public static final int RULE_ML_COMMENT=47;
    public static final int Description=14;
    public static final int Processor=19;
    public static final int RULE_STRING=46;
    public static final int Focal=28;
    public static final int Wlan=33;
    public static final int Properties=17;
    public static final int Url=34;
    public static final int RULE_SL_COMMENT=41;
    public static final int ImplementationDescription=5;
    public static final int HyphenMinus=37;
    public static final int RULE_DOUBLE=40;
    public static final int X86=36;
    public static final int RULE_DECINT=39;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int Jammy=29;
    public static final int RULE_WS=48;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=49;
    public static final int RangeKind=20;
    public static final int Repository=18;
    public static final int Type=32;
    public static final int MacOSOpertingSystem=9;
    public static final int DeviceRequirement=10;

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
    // InternalImplementationDescriptionParser.g:65:1: ruleImplementationDescription returns [EObject current=null] : (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleImplementationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token this_DEDENT_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_includeSoftwareComponents_6_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:71:2: ( (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:72:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:72:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:73:3: otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
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

            otherlv_4=(Token)match(input,IncludeSoftwareComponent,FOLLOW_3);

                        newLeafNode(otherlv_4, grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentKeyword_4());

            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_5, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_5());

            // InternalImplementationDescriptionParser.g:112:3: ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+
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
                    // InternalImplementationDescriptionParser.g:113:4: (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent )
                    {
                    // InternalImplementationDescriptionParser.g:113:4: (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent )
                    // InternalImplementationDescriptionParser.g:114:5: lv_includeSoftwareComponents_6_0= ruleSoftwareComponent
                    {

                                        newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentsSoftwareComponentParserRuleCall_6_0());

                    pushFollow(FOLLOW_8);
                    lv_includeSoftwareComponents_6_0=ruleSoftwareComponent();

                    state._fsp--;


                                        if (current==null) {
                                            current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                                        }
                                        add(
                                            current,
                                            "includeSoftwareComponents",
                                            lv_includeSoftwareComponents_6_0,
                                            "de.fraunhofer.ipa.deplyoment.ImplementationDescription.SoftwareComponent");
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

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_9);

                        newLeafNode(this_DEDENT_7, grammarAccess.getImplementationDescriptionAccess().getDEDENTTerminalRuleCall_7());

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2);

                        newLeafNode(this_DEDENT_8, grammarAccess.getImplementationDescriptionAccess().getDEDENTTerminalRuleCall_8());


            }


            }


                leaveRule();

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
    // InternalImplementationDescriptionParser.g:143:1: entryRuleExecutionRequirement returns [EObject current=null] : iv_ruleExecutionRequirement= ruleExecutionRequirement EOF ;
    public final EObject entryRuleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:143:61: (iv_ruleExecutionRequirement= ruleExecutionRequirement EOF )
            // InternalImplementationDescriptionParser.g:144:2: iv_ruleExecutionRequirement= ruleExecutionRequirement EOF
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
    // InternalImplementationDescriptionParser.g:150:1: ruleExecutionRequirement returns [EObject current=null] : (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) ;
    public final EObject ruleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceRequirement_0 = null;

        EObject this_SoftwareConfigurationRequirement_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:156:2: ( (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) )
            // InternalImplementationDescriptionParser.g:157:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            {
            // InternalImplementationDescriptionParser.g:157:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DeviceRequirement) ) {
                alt2=1;
            }
            else if ( (LA2_0==SoftwareConfigurationParameter) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:158:3: this_DeviceRequirement_0= ruleDeviceRequirement
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
                    // InternalImplementationDescriptionParser.g:167:3: this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement
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
    // InternalImplementationDescriptionParser.g:179:1: entryRuleSoftwareComponent returns [EObject current=null] : iv_ruleSoftwareComponent= ruleSoftwareComponent EOF ;
    public final EObject entryRuleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareComponent = null;


        try {
            // InternalImplementationDescriptionParser.g:179:58: (iv_ruleSoftwareComponent= ruleSoftwareComponent EOF )
            // InternalImplementationDescriptionParser.g:180:2: iv_ruleSoftwareComponent= ruleSoftwareComponent EOF
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
    // InternalImplementationDescriptionParser.g:186:1: ruleSoftwareComponent returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:192:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:193:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:193:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:194:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:194:3: ()
            // InternalImplementationDescriptionParser.g:195:4:
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

            // InternalImplementationDescriptionParser.g:212:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:213:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:213:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:214:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_10);

                        newLeafNode(this_INDENT_4, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Repository,FOLLOW_3);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareComponentAccess().getRepositoryKeyword_5());

            this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_11);

                        newLeafNode(this_INDENT_6, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_6());

            // InternalImplementationDescriptionParser.g:243:3: ( (lv_repository_7_0= ruleRepository ) )
            // InternalImplementationDescriptionParser.g:244:4: (lv_repository_7_0= ruleRepository )
            {
            // InternalImplementationDescriptionParser.g:244:4: (lv_repository_7_0= ruleRepository )
            // InternalImplementationDescriptionParser.g:245:5: lv_repository_7_0= ruleRepository
            {

                                newCompositeNode(grammarAccess.getSoftwareComponentAccess().getRepositoryRepositoryParserRuleCall_7_0());

            pushFollow(FOLLOW_9);
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

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_12);

                        newLeafNode(this_DEDENT_8, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_8());

            // InternalImplementationDescriptionParser.g:266:3: (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ExecutionRequirement) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:267:4: otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,ExecutionRequirement,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getSoftwareComponentAccess().getExecutionRequirementKeyword_9_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_13);

                                    newLeafNode(this_INDENT_10, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_9_1());

                    // InternalImplementationDescriptionParser.g:275:4: ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==SoftwareConfigurationParameter||LA3_0==DeviceRequirement) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:276:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                            {
                            // InternalImplementationDescriptionParser.g:276:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                            // InternalImplementationDescriptionParser.g:277:6: lv_executionRequirement_11_0= ruleExecutionRequirement
                            {

                                                    newCompositeNode(grammarAccess.getSoftwareComponentAccess().getExecutionRequirementExecutionRequirementParserRuleCall_9_2_0());

                            pushFollow(FOLLOW_14);
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
                            if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalImplementationDescriptionParser.g:307:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalImplementationDescriptionParser.g:307:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalImplementationDescriptionParser.g:308:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalImplementationDescriptionParser.g:314:1: ruleRepository returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) ;
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
            // InternalImplementationDescriptionParser.g:320:2: ( (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:321:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:321:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:322:3: otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_15);

                        newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getTypeKeyword_0());

            // InternalImplementationDescriptionParser.g:326:3: ( (lv_type_1_0= ruleRepositoryType ) )
            // InternalImplementationDescriptionParser.g:327:4: (lv_type_1_0= ruleRepositoryType )
            {
            // InternalImplementationDescriptionParser.g:327:4: (lv_type_1_0= ruleRepositoryType )
            // InternalImplementationDescriptionParser.g:328:5: lv_type_1_0= ruleRepositoryType
            {

                                newCompositeNode(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeParserRuleCall_1_0());

            pushFollow(FOLLOW_16);
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

            // InternalImplementationDescriptionParser.g:349:3: ( (lv_url_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:350:4: (lv_url_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:350:4: (lv_url_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:351:5: lv_url_3_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getRepositoryAccess().getUrlEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_17);
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

            // InternalImplementationDescriptionParser.g:372:3: ( (lv_version_5_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:373:4: (lv_version_5_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:373:4: (lv_version_5_0= ruleEString )
            // InternalImplementationDescriptionParser.g:374:5: lv_version_5_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:395:1: entryRuleRepositoryType returns [EObject current=null] : iv_ruleRepositoryType= ruleRepositoryType EOF ;
    public final EObject entryRuleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:395:55: (iv_ruleRepositoryType= ruleRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:396:2: iv_ruleRepositoryType= ruleRepositoryType EOF
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
    // InternalImplementationDescriptionParser.g:402:1: ruleRepositoryType returns [EObject current=null] : this_GitRepositoryType_0= ruleGitRepositoryType ;
    public final EObject ruleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject this_GitRepositoryType_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:408:2: (this_GitRepositoryType_0= ruleGitRepositoryType )
            // InternalImplementationDescriptionParser.g:409:2: this_GitRepositoryType_0= ruleGitRepositoryType
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
    // InternalImplementationDescriptionParser.g:420:1: entryRuleGitRepositoryType returns [EObject current=null] : iv_ruleGitRepositoryType= ruleGitRepositoryType EOF ;
    public final EObject entryRuleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:420:58: (iv_ruleGitRepositoryType= ruleGitRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:421:2: iv_ruleGitRepositoryType= ruleGitRepositoryType EOF
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
    // InternalImplementationDescriptionParser.g:427:1: ruleGitRepositoryType returns [EObject current=null] : ( () otherlv_1= Git ) ;
    public final EObject ruleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:433:2: ( ( () otherlv_1= Git ) )
            // InternalImplementationDescriptionParser.g:434:2: ( () otherlv_1= Git )
            {
            // InternalImplementationDescriptionParser.g:434:2: ( () otherlv_1= Git )
            // InternalImplementationDescriptionParser.g:435:3: () otherlv_1= Git
            {
            // InternalImplementationDescriptionParser.g:435:3: ()
            // InternalImplementationDescriptionParser.g:436:4:
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
    // InternalImplementationDescriptionParser.g:450:1: entryRuleDeviceRequirement returns [EObject current=null] : iv_ruleDeviceRequirement= ruleDeviceRequirement EOF ;
    public final EObject entryRuleDeviceRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:450:58: (iv_ruleDeviceRequirement= ruleDeviceRequirement EOF )
            // InternalImplementationDescriptionParser.g:451:2: iv_ruleDeviceRequirement= ruleDeviceRequirement EOF
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
    // InternalImplementationDescriptionParser.g:457:1: ruleDeviceRequirement returns [EObject current=null] : (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:463:2: ( (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:464:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:464:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:465:3: otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeviceRequirement,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getDeviceRequirementAccess().getDeviceRequirementKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_1());


                        newCompositeNode(grammarAccess.getDeviceRequirementAccess().getPreListElementParserRuleCall_2());

            pushFollow(FOLLOW_11);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_3=(Token)match(input,Type,FOLLOW_5);

                        newLeafNode(otherlv_3, grammarAccess.getDeviceRequirementAccess().getTypeKeyword_3());

            // InternalImplementationDescriptionParser.g:484:3: ( (lv_type_4_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:485:4: (lv_type_4_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:485:4: (lv_type_4_0= ruleEString )
            // InternalImplementationDescriptionParser.g:486:5: lv_type_4_0= ruleEString
            {

                                newCompositeNode(grammarAccess.getDeviceRequirementAccess().getTypeEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_18);
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

            // InternalImplementationDescriptionParser.g:503:3: (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:504:4: this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT
                    {
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_19);

                                    newLeafNode(this_INDENT_5, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_0());

                    otherlv_6=(Token)match(input,HWSWParemeter,FOLLOW_3);

                                    newLeafNode(otherlv_6, grammarAccess.getDeviceRequirementAccess().getHWSWParemeterKeyword_5_1());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_7, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_2());

                    // InternalImplementationDescriptionParser.g:516:4: ( (lv_parameter_8_0= ruleHWSWParemeter ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==HyphenMinus) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:517:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            {
                            // InternalImplementationDescriptionParser.g:517:5: (lv_parameter_8_0= ruleHWSWParemeter )
                            // InternalImplementationDescriptionParser.g:518:6: lv_parameter_8_0= ruleHWSWParemeter
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
                            if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_9);

                                    newLeafNode(this_DEDENT_9, grammarAccess.getDeviceRequirementAccess().getDEDENTTerminalRuleCall_5_4());

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalImplementationDescriptionParser.g:552:1: entryRuleSoftwareConfigurationRequirement returns [EObject current=null] : iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF ;
    public final EObject entryRuleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareConfigurationRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:552:73: (iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF )
            // InternalImplementationDescriptionParser.g:553:2: iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF
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
    // InternalImplementationDescriptionParser.g:559:1: ruleSoftwareConfigurationRequirement returns [EObject current=null] : (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_parameter_2_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:565:2: ( (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:566:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:566:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:567:3: otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,SoftwareConfigurationParameter,FOLLOW_3);

                        newLeafNode(otherlv_0, grammarAccess.getSoftwareConfigurationRequirementAccess().getSoftwareConfigurationParameterKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_7);

                        newLeafNode(this_INDENT_1, grammarAccess.getSoftwareConfigurationRequirementAccess().getINDENTTerminalRuleCall_1());

            // InternalImplementationDescriptionParser.g:575:3: ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+
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
                    // InternalImplementationDescriptionParser.g:576:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    {
                    // InternalImplementationDescriptionParser.g:576:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                    // InternalImplementationDescriptionParser.g:577:5: lv_parameter_2_0= ruleSoftwareExecutionParemeter
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
                    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // InternalImplementationDescriptionParser.g:602:1: entryRuleHWSWParemeter returns [EObject current=null] : iv_ruleHWSWParemeter= ruleHWSWParemeter EOF ;
    public final EObject entryRuleHWSWParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHWSWParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:602:54: (iv_ruleHWSWParemeter= ruleHWSWParemeter EOF )
            // InternalImplementationDescriptionParser.g:603:2: iv_ruleHWSWParemeter= ruleHWSWParemeter EOF
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
    // InternalImplementationDescriptionParser.g:609:1: ruleHWSWParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:615:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:616:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:616:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:617:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:617:3: ()
            // InternalImplementationDescriptionParser.g:618:4:
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

            // InternalImplementationDescriptionParser.g:635:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:636:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:636:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:637:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_21);

                        newLeafNode(otherlv_5, grammarAccess.getHWSWParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:662:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:663:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:663:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:664:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_22);
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

            // InternalImplementationDescriptionParser.g:681:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Description) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:682:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getHWSWParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:686:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:687:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:687:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:688:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getHWSWParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalImplementationDescriptionParser.g:706:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Value) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:707:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getHWSWParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_24);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:722:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:723:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:723:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:724:6: lv_value_12_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:741:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==HyphenMinus) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:742:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_24);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:749:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:750:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:750:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:751:7: lv_value_14_0= rulePropertyValue
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
                            break loop9;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalImplementationDescriptionParser.g:782:1: entryRuleSoftwareExecutionParemeter returns [EObject current=null] : iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF ;
    public final EObject entryRuleSoftwareExecutionParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareExecutionParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:782:67: (iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF )
            // InternalImplementationDescriptionParser.g:783:2: iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF
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
    // InternalImplementationDescriptionParser.g:789:1: ruleSoftwareExecutionParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:795:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:796:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:796:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:797:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:797:3: ()
            // InternalImplementationDescriptionParser.g:798:4:
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

            // InternalImplementationDescriptionParser.g:815:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:816:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:816:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:817:5: lv_name_3_0= ruleEString
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_4, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_21);

                        newLeafNode(otherlv_5, grammarAccess.getSoftwareExecutionParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:842:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:843:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:843:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:844:5: lv_kind_6_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_22);
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

            // InternalImplementationDescriptionParser.g:861:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Description) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:862:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_7, grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:866:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:867:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:867:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:868:6: lv_description_8_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalImplementationDescriptionParser.g:886:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Value) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:887:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_9, grammarAccess.getSoftwareExecutionParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_10, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_8_1());


                                    newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_24);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:902:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:903:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:903:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:904:6: lv_value_12_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:921:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==HyphenMinus) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:922:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                            pushFollow(FOLLOW_24);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:929:5: ( (lv_value_14_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:930:6: (lv_value_14_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:930:6: (lv_value_14_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:931:7: lv_value_14_0= rulePropertyValue
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
                            break loop12;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_9);

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
    // InternalImplementationDescriptionParser.g:962:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:962:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalImplementationDescriptionParser.g:963:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalImplementationDescriptionParser.g:969:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:975:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalImplementationDescriptionParser.g:976:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalImplementationDescriptionParser.g:976:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:977:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalImplementationDescriptionParser.g:986:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalImplementationDescriptionParser.g:995:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalImplementationDescriptionParser.g:1004:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalImplementationDescriptionParser.g:1013:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalImplementationDescriptionParser.g:1025:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalImplementationDescriptionParser.g:1025:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalImplementationDescriptionParser.g:1026:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalImplementationDescriptionParser.g:1032:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1038:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1039:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1039:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt15=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt15=1;
                }
                break;
            case MaximumKind:
                {
                alt15=2;
                }
                break;
            case MinimumKind:
                {
                alt15=3;
                }
                break;
            case RangeKind:
                {
                alt15=4;
                }
                break;
            case SelectionKind:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1040:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalImplementationDescriptionParser.g:1049:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalImplementationDescriptionParser.g:1058:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalImplementationDescriptionParser.g:1067:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalImplementationDescriptionParser.g:1076:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalImplementationDescriptionParser.g:1088:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalImplementationDescriptionParser.g:1088:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalImplementationDescriptionParser.g:1089:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalImplementationDescriptionParser.g:1095:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1101:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1102:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1102:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1103:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1114:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1115:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1115:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1116:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_21);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1141:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1142:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1142:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1143:5: lv_kind_5_0= ruleAttributeKind
            {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1160:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Description) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1161:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1165:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1166:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1166:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1167:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1185:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Value) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1186:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1190:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1191:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1191:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1192:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalImplementationDescriptionParser.g:1210:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DEDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1211:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1220:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalImplementationDescriptionParser.g:1220:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalImplementationDescriptionParser.g:1221:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalImplementationDescriptionParser.g:1227:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1233:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1234:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1234:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1235:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1246:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1247:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1247:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1248:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_28);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1273:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalImplementationDescriptionParser.g:1274:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalImplementationDescriptionParser.g:1274:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalImplementationDescriptionParser.g:1275:5: lv_kind_5_0= ruleMaximumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1292:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Description) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1293:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1297:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1298:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1298:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1299:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1317:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Value) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1318:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1322:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1323:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1323:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1324:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalImplementationDescriptionParser.g:1342:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DEDENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1343:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1352:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalImplementationDescriptionParser.g:1352:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalImplementationDescriptionParser.g:1353:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalImplementationDescriptionParser.g:1359:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1365:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1366:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1366:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1367:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1378:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1379:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1379:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1380:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_29);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1405:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalImplementationDescriptionParser.g:1406:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalImplementationDescriptionParser.g:1406:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalImplementationDescriptionParser.g:1407:5: lv_kind_5_0= ruleMinimumKind
            {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1424:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Description) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1425:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1429:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1430:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1430:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1431:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1449:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Value) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1450:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1454:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1455:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1455:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1456:6: lv_value_9_0= rulePropertyValue
                    {

                                            newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalImplementationDescriptionParser.g:1474:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DEDENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1475:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1484:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalImplementationDescriptionParser.g:1484:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalImplementationDescriptionParser.g:1485:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalImplementationDescriptionParser.g:1491:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1497:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1498:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1498:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1499:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1510:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1511:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1511:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1512:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_30);

                        newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1537:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1538:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1538:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalImplementationDescriptionParser.g:1539:5: lv_kind_5_0= ruleSelectionKind
            {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1556:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Description) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1557:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1561:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1562:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1562:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1563:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1581:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Value) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1582:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_24);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1597:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1598:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1598:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1599:6: lv_value_11_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:1616:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==HyphenMinus) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                        case 1 :
                            // InternalImplementationDescriptionParser.g:1617:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                            {

                                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                            pushFollow(FOLLOW_24);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalImplementationDescriptionParser.g:1624:5: ( (lv_value_13_0= rulePropertyValue ) )
                            // InternalImplementationDescriptionParser.g:1625:6: (lv_value_13_0= rulePropertyValue )
                            {
                            // InternalImplementationDescriptionParser.g:1625:6: (lv_value_13_0= rulePropertyValue )
                            // InternalImplementationDescriptionParser.g:1626:7: lv_value_13_0= rulePropertyValue
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
                            break loop26;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_27);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1649:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DEDENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1650:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1659:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalImplementationDescriptionParser.g:1659:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalImplementationDescriptionParser.g:1660:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalImplementationDescriptionParser.g:1666:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1672:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1673:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1673:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1674:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                        newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


                        afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_5);

                        newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1685:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1686:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1686:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1687:5: lv_name_2_0= ruleEString
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_20);

                        newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_31);

                        newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1712:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalImplementationDescriptionParser.g:1713:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalImplementationDescriptionParser.g:1713:4: (lv_kind_5_0= ruleRangeKind )
            // InternalImplementationDescriptionParser.g:1714:5: lv_kind_5_0= ruleRangeKind
            {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1731:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Description) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1732:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_5);

                                    newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1736:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1737:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1737:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1738:6: lv_description_7_0= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_26);
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

            // InternalImplementationDescriptionParser.g:1756:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Value) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1757:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_3);

                                    newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7);

                                    newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                                    newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_24);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1772:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1773:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1773:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1774:6: lv_value_11_0= rulePropertyValue
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

                    pushFollow(FOLLOW_24);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1798:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1799:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1799:5: (lv_value_13_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1800:6: lv_value_13_0= rulePropertyValue
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_27);

                                    newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:1822:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_DEDENT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1823:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1832:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalImplementationDescriptionParser.g:1832:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalImplementationDescriptionParser.g:1833:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalImplementationDescriptionParser.g:1839:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) ;
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
            // InternalImplementationDescriptionParser.g:1845:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue ) )
            // InternalImplementationDescriptionParser.g:1846:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            {
            // InternalImplementationDescriptionParser.g:1846:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue )
            int alt32=6;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt32=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt32=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt32=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt32=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1847:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalImplementationDescriptionParser.g:1856:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalImplementationDescriptionParser.g:1865:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalImplementationDescriptionParser.g:1874:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalImplementationDescriptionParser.g:1883:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalImplementationDescriptionParser.g:1892:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
    // InternalImplementationDescriptionParser.g:1904:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalImplementationDescriptionParser.g:1904:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalImplementationDescriptionParser.g:1905:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalImplementationDescriptionParser.g:1911:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1917:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalImplementationDescriptionParser.g:1918:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalImplementationDescriptionParser.g:1918:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalImplementationDescriptionParser.g:1919:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalImplementationDescriptionParser.g:1919:3: (lv_value_0_0= ruleInteger0 )
            // InternalImplementationDescriptionParser.g:1920:4: lv_value_0_0= ruleInteger0
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
    // InternalImplementationDescriptionParser.g:1940:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalImplementationDescriptionParser.g:1940:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalImplementationDescriptionParser.g:1941:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalImplementationDescriptionParser.g:1947:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1953:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalImplementationDescriptionParser.g:1954:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalImplementationDescriptionParser.g:1954:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalImplementationDescriptionParser.g:1955:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalImplementationDescriptionParser.g:1955:3: (lv_value_0_0= ruleDouble0 )
            // InternalImplementationDescriptionParser.g:1956:4: lv_value_0_0= ruleDouble0
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
    // InternalImplementationDescriptionParser.g:1976:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalImplementationDescriptionParser.g:1976:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalImplementationDescriptionParser.g:1977:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalImplementationDescriptionParser.g:1983:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1989:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:1990:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:1990:2: ( (lv_value_0_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1991:3: (lv_value_0_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1991:3: (lv_value_0_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1992:4: lv_value_0_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2012:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2012:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalImplementationDescriptionParser.g:2013:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalImplementationDescriptionParser.g:2019:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2025:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalImplementationDescriptionParser.g:2026:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalImplementationDescriptionParser.g:2026:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalImplementationDescriptionParser.g:2027:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalImplementationDescriptionParser.g:2027:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalImplementationDescriptionParser.g:2028:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalImplementationDescriptionParser.g:2048:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2048:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalImplementationDescriptionParser.g:2049:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalImplementationDescriptionParser.g:2055:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2061:2: (this_ResourceType_0= ruleResourceType )
            // InternalImplementationDescriptionParser.g:2062:2: this_ResourceType_0= ruleResourceType
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
    // InternalImplementationDescriptionParser.g:2073:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2073:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalImplementationDescriptionParser.g:2074:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalImplementationDescriptionParser.g:2080:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2086:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2087:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2087:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2088:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2088:3: ()
            // InternalImplementationDescriptionParser.g:2089:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2095:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2096:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2096:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2097:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2118:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2118:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2119:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalImplementationDescriptionParser.g:2125:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2131:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2132:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2132:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalImplementationDescriptionParser.g:2133:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2133:3: ()
            // InternalImplementationDescriptionParser.g:2134:4:
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
    // InternalImplementationDescriptionParser.g:2148:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2148:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2149:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalImplementationDescriptionParser.g:2155:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2161:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2162:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2162:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalImplementationDescriptionParser.g:2163:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2163:3: ()
            // InternalImplementationDescriptionParser.g:2164:4:
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
    // InternalImplementationDescriptionParser.g:2178:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2178:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2179:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2185:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2191:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2192:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2192:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2193:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2193:3: ()
            // InternalImplementationDescriptionParser.g:2194:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2200:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2201:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2201:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2202:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2223:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2223:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2224:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2230:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2236:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalImplementationDescriptionParser.g:2237:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalImplementationDescriptionParser.g:2237:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Ethernet) ) {
                alt33=1;
            }
            else if ( (LA33_0==Wlan) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2238:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalImplementationDescriptionParser.g:2247:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalImplementationDescriptionParser.g:2259:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2259:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2260:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2266:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2272:2: ( ( () otherlv_1= Ethernet ) )
            // InternalImplementationDescriptionParser.g:2273:2: ( () otherlv_1= Ethernet )
            {
            // InternalImplementationDescriptionParser.g:2273:2: ( () otherlv_1= Ethernet )
            // InternalImplementationDescriptionParser.g:2274:3: () otherlv_1= Ethernet
            {
            // InternalImplementationDescriptionParser.g:2274:3: ()
            // InternalImplementationDescriptionParser.g:2275:4:
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
    // InternalImplementationDescriptionParser.g:2289:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2289:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2290:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2296:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2302:2: ( ( () otherlv_1= Wlan ) )
            // InternalImplementationDescriptionParser.g:2303:2: ( () otherlv_1= Wlan )
            {
            // InternalImplementationDescriptionParser.g:2303:2: ( () otherlv_1= Wlan )
            // InternalImplementationDescriptionParser.g:2304:3: () otherlv_1= Wlan
            {
            // InternalImplementationDescriptionParser.g:2304:3: ()
            // InternalImplementationDescriptionParser.g:2305:4:
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
    // InternalImplementationDescriptionParser.g:2319:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2319:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalImplementationDescriptionParser.g:2320:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalImplementationDescriptionParser.g:2326:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2332:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalImplementationDescriptionParser.g:2333:2: ( () otherlv_1= AttributeKind )
            {
            // InternalImplementationDescriptionParser.g:2333:2: ( () otherlv_1= AttributeKind )
            // InternalImplementationDescriptionParser.g:2334:3: () otherlv_1= AttributeKind
            {
            // InternalImplementationDescriptionParser.g:2334:3: ()
            // InternalImplementationDescriptionParser.g:2335:4:
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
    // InternalImplementationDescriptionParser.g:2349:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2349:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalImplementationDescriptionParser.g:2350:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalImplementationDescriptionParser.g:2356:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2362:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalImplementationDescriptionParser.g:2363:2: ( () otherlv_1= MaximumKind )
            {
            // InternalImplementationDescriptionParser.g:2363:2: ( () otherlv_1= MaximumKind )
            // InternalImplementationDescriptionParser.g:2364:3: () otherlv_1= MaximumKind
            {
            // InternalImplementationDescriptionParser.g:2364:3: ()
            // InternalImplementationDescriptionParser.g:2365:4:
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
    // InternalImplementationDescriptionParser.g:2379:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2379:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalImplementationDescriptionParser.g:2380:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalImplementationDescriptionParser.g:2386:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2392:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalImplementationDescriptionParser.g:2393:2: ( () otherlv_1= MinimumKind )
            {
            // InternalImplementationDescriptionParser.g:2393:2: ( () otherlv_1= MinimumKind )
            // InternalImplementationDescriptionParser.g:2394:3: () otherlv_1= MinimumKind
            {
            // InternalImplementationDescriptionParser.g:2394:3: ()
            // InternalImplementationDescriptionParser.g:2395:4:
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
    // InternalImplementationDescriptionParser.g:2409:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2409:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalImplementationDescriptionParser.g:2410:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalImplementationDescriptionParser.g:2416:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2422:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalImplementationDescriptionParser.g:2423:2: ( () otherlv_1= SelectionKind )
            {
            // InternalImplementationDescriptionParser.g:2423:2: ( () otherlv_1= SelectionKind )
            // InternalImplementationDescriptionParser.g:2424:3: () otherlv_1= SelectionKind
            {
            // InternalImplementationDescriptionParser.g:2424:3: ()
            // InternalImplementationDescriptionParser.g:2425:4:
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
    // InternalImplementationDescriptionParser.g:2439:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2439:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalImplementationDescriptionParser.g:2440:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalImplementationDescriptionParser.g:2446:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2452:2: ( ( () otherlv_1= RangeKind ) )
            // InternalImplementationDescriptionParser.g:2453:2: ( () otherlv_1= RangeKind )
            {
            // InternalImplementationDescriptionParser.g:2453:2: ( () otherlv_1= RangeKind )
            // InternalImplementationDescriptionParser.g:2454:3: () otherlv_1= RangeKind
            {
            // InternalImplementationDescriptionParser.g:2454:3: ()
            // InternalImplementationDescriptionParser.g:2455:4:
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
    // InternalImplementationDescriptionParser.g:2469:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2469:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalImplementationDescriptionParser.g:2470:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalImplementationDescriptionParser.g:2476:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2482:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalImplementationDescriptionParser.g:2483:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalImplementationDescriptionParser.g:2483:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalImplementationDescriptionParser.g:2484:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalImplementationDescriptionParser.g:2484:3: ()
            // InternalImplementationDescriptionParser.g:2485:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2491:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalImplementationDescriptionParser.g:2492:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalImplementationDescriptionParser.g:2492:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalImplementationDescriptionParser.g:2493:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalImplementationDescriptionParser.g:2514:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2514:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalImplementationDescriptionParser.g:2515:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalImplementationDescriptionParser.g:2521:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2527:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalImplementationDescriptionParser.g:2528:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalImplementationDescriptionParser.g:2528:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalImplementationDescriptionParser.g:2529:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalImplementationDescriptionParser.g:2529:3: ()
            // InternalImplementationDescriptionParser.g:2530:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                                current);


            }

            // InternalImplementationDescriptionParser.g:2536:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalImplementationDescriptionParser.g:2537:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalImplementationDescriptionParser.g:2537:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalImplementationDescriptionParser.g:2538:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalImplementationDescriptionParser.g:2559:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2559:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalImplementationDescriptionParser.g:2560:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalImplementationDescriptionParser.g:2566:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2572:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalImplementationDescriptionParser.g:2573:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalImplementationDescriptionParser.g:2583:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalImplementationDescriptionParser.g:2583:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalImplementationDescriptionParser.g:2584:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalImplementationDescriptionParser.g:2590:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2596:2: (this_DECINT_0= RULE_DECINT )
            // InternalImplementationDescriptionParser.g:2597:2: this_DECINT_0= RULE_DECINT
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
    // InternalImplementationDescriptionParser.g:2607:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalImplementationDescriptionParser.g:2607:47: (iv_ruleEString= ruleEString EOF )
            // InternalImplementationDescriptionParser.g:2608:2: iv_ruleEString= ruleEString EOF
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
    // InternalImplementationDescriptionParser.g:2614:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2620:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalImplementationDescriptionParser.g:2621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalImplementationDescriptionParser.g:2621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2622:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2630:3: this_ID_1= RULE_ID
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
    // InternalImplementationDescriptionParser.g:2641:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2643:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalImplementationDescriptionParser.g:2644:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalImplementationDescriptionParser.g:2653:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:2660:2: (kw= HyphenMinus )
            // InternalImplementationDescriptionParser.g:2661:2: kw= HyphenMinus
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
    // InternalImplementationDescriptionParser.g:2672:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2678:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalImplementationDescriptionParser.g:2679:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalImplementationDescriptionParser.g:2679:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==X86) ) {
                alt35=1;
            }
            else if ( (LA35_0==Arm64) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2680:3: (enumLiteral_0= X86 )
                    {
                    // InternalImplementationDescriptionParser.g:2680:3: (enumLiteral_0= X86 )
                    // InternalImplementationDescriptionParser.g:2681:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                                    current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2688:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalImplementationDescriptionParser.g:2688:3: (enumLiteral_1= Arm64 )
                    // InternalImplementationDescriptionParser.g:2689:4: enumLiteral_1= Arm64
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
    // InternalImplementationDescriptionParser.g:2699:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2705:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalImplementationDescriptionParser.g:2706:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalImplementationDescriptionParser.g:2706:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Ubuntu) ) {
                alt36=1;
            }
            else if ( (LA36_0==Debian) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2707:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalImplementationDescriptionParser.g:2707:3: (enumLiteral_0= Ubuntu )
                    // InternalImplementationDescriptionParser.g:2708:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                                    current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2715:3: (enumLiteral_1= Debian )
                    {
                    // InternalImplementationDescriptionParser.g:2715:3: (enumLiteral_1= Debian )
                    // InternalImplementationDescriptionParser.g:2716:4: enumLiteral_1= Debian
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
    // InternalImplementationDescriptionParser.g:2726:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


            enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2732:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalImplementationDescriptionParser.g:2733:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalImplementationDescriptionParser.g:2733:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Focal) ) {
                alt37=1;
            }
            else if ( (LA37_0==Jammy) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2734:3: (enumLiteral_0= Focal )
                    {
                    // InternalImplementationDescriptionParser.g:2734:3: (enumLiteral_0= Focal )
                    // InternalImplementationDescriptionParser.g:2735:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                                    current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                                    newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:2742:3: (enumLiteral_1= Jammy )
                    {
                    // InternalImplementationDescriptionParser.g:2742:3: (enumLiteral_1= Jammy )
                    // InternalImplementationDescriptionParser.g:2743:4: enumLiteral_1= Jammy
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\45\1\37\1\54\2\52\1\36\1\14\5\uffff";
    static final String dfa_3s = "\1\45\1\37\1\56\2\52\1\36\1\24\5\uffff";
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "976:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000410L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080004004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000051903B000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080004004002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});

}
