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
import de.fraunhofer.ipa.deployment.services.ImplementationDescriptionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalImplementationDescriptionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SoftwareConfigurationParameter", "ImplementationDescription", "IncludeSoftwareComponent", "ExecutionRequirement", "LinuxOpertingSystem", "MacOSOpertingSystem", "DeviceRequirement", "HWSWParemeter", "AttributeKind", "SelectionKind", "Description", "MaximumKind", "MinimumKind", "Properties", "Repository", "Os_version", "Processor", "RangeKind", "Container", "Ethernet", "Version", "Os_name", "Debian", "Ubuntu", "Value", "Arm64", "Focal", "Jammy", "Kind", "Name", "Type", "Wlan", "Url", "HyphenMinusHyphenMinusHyphenMinus", "Usb", "Git", "X86", "HyphenMinus", "RULE_DIGIT", "RULE_DECINT", "RULE_DOUBLE", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int AttributeKind=12;
    public static final int SoftwareConfigurationParameter=4;
    public static final int Name=33;
    public static final int Container=22;
    public static final int Debian=26;
    public static final int Version=24;
    public static final int Kind=32;
    public static final int Ubuntu=27;
    public static final int RULE_DEDENT=47;
    public static final int LinuxOpertingSystem=8;
    public static final int RULE_ID=48;
    public static final int RULE_DIGIT=42;
    public static final int ExecutionRequirement=7;
    public static final int HWSWParemeter=11;
    public static final int HyphenMinusHyphenMinusHyphenMinus=37;
    public static final int SelectionKind=13;
    public static final int Arm64=29;
    public static final int Git=39;
    public static final int IncludeSoftwareComponent=6;
    public static final int RULE_INT=49;
    public static final int Ethernet=23;
    public static final int Value=28;
    public static final int RULE_ML_COMMENT=51;
    public static final int Description=14;
    public static final int Processor=20;
    public static final int RULE_STRING=50;
    public static final int Focal=30;
    public static final int Wlan=35;
    public static final int Properties=17;
    public static final int Url=36;
    public static final int RULE_SL_COMMENT=45;
    public static final int ImplementationDescription=5;
    public static final int Os_name=25;
    public static final int HyphenMinus=41;
    public static final int RULE_DOUBLE=44;
    public static final int X86=40;
    public static final int RULE_DECINT=43;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=46;
    public static final int Jammy=31;
    public static final int Usb=38;
    public static final int RULE_WS=52;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=53;
    public static final int RangeKind=21;
    public static final int Os_version=19;
    public static final int Repository=18;
    public static final int Type=34;
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
          return "ImplementationDescriptionSet";
        }

        @Override
        protected ImplementationDescriptionGrammarAccess getGrammarAccess() {
          return grammarAccess;
        }




    // $ANTLR start "entryRuleImplementationDescriptionSet"
    // InternalImplementationDescriptionParser.g:58:1: entryRuleImplementationDescriptionSet returns [EObject current=null] : iv_ruleImplementationDescriptionSet= ruleImplementationDescriptionSet EOF ;
    public final EObject entryRuleImplementationDescriptionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDescriptionSet = null;


        try {
            // InternalImplementationDescriptionParser.g:58:69: (iv_ruleImplementationDescriptionSet= ruleImplementationDescriptionSet EOF )
            // InternalImplementationDescriptionParser.g:59:2: iv_ruleImplementationDescriptionSet= ruleImplementationDescriptionSet EOF
            {
             newCompositeNode(grammarAccess.getImplementationDescriptionSetRule());
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDescriptionSet=ruleImplementationDescriptionSet();

            state._fsp--;

             current =iv_ruleImplementationDescriptionSet;
            match(input,EOF,FOLLOW_2);

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDescriptionSet"


    // $ANTLR start "ruleImplementationDescriptionSet"
    // InternalImplementationDescriptionParser.g:65:1: ruleImplementationDescriptionSet returns [EObject current=null] : ( ( (lv_implementations_0_0= ruleImplementationDescription ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )* ) ;
    public final EObject ruleImplementationDescriptionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_implementations_0_0 = null;

        EObject lv_implementations_2_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:71:2: ( ( ( (lv_implementations_0_0= ruleImplementationDescription ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )* ) )
            // InternalImplementationDescriptionParser.g:72:2: ( ( (lv_implementations_0_0= ruleImplementationDescription ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )* )
            {
            // InternalImplementationDescriptionParser.g:72:2: ( ( (lv_implementations_0_0= ruleImplementationDescription ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )* )
            // InternalImplementationDescriptionParser.g:73:3: ( (lv_implementations_0_0= ruleImplementationDescription ) ) (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )*
            {
            // InternalImplementationDescriptionParser.g:73:3: ( (lv_implementations_0_0= ruleImplementationDescription ) )
            // InternalImplementationDescriptionParser.g:74:4: (lv_implementations_0_0= ruleImplementationDescription )
            {
            // InternalImplementationDescriptionParser.g:74:4: (lv_implementations_0_0= ruleImplementationDescription )
            // InternalImplementationDescriptionParser.g:75:5: lv_implementations_0_0= ruleImplementationDescription
            {

                      newCompositeNode(grammarAccess.getImplementationDescriptionSetAccess().getImplementationsImplementationDescriptionParserRuleCall_0_0());

            pushFollow(FOLLOW_3);
            lv_implementations_0_0=ruleImplementationDescription();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getImplementationDescriptionSetRule());
                      }
                      add(
                        current,
                        "implementations",
                        lv_implementations_0_0,
                        "de.fraunhofer.ipa.deployment.ImplementationDescription.ImplementationDescription");
                      afterParserOrEnumRuleCall();


            }


            }

            // InternalImplementationDescriptionParser.g:92:3: (otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==HyphenMinusHyphenMinusHyphenMinus) ) {
                    alt1=1;
                }


                switch (alt1) {
              case 1 :
                  // InternalImplementationDescriptionParser.g:93:4: otherlv_1= HyphenMinusHyphenMinusHyphenMinus ( (lv_implementations_2_0= ruleImplementationDescription ) )
                  {
                  otherlv_1=(Token)match(input,HyphenMinusHyphenMinusHyphenMinus,FOLLOW_4);

                          newLeafNode(otherlv_1, grammarAccess.getImplementationDescriptionSetAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_1_0());

                  // InternalImplementationDescriptionParser.g:97:4: ( (lv_implementations_2_0= ruleImplementationDescription ) )
                  // InternalImplementationDescriptionParser.g:98:5: (lv_implementations_2_0= ruleImplementationDescription )
                  {
                  // InternalImplementationDescriptionParser.g:98:5: (lv_implementations_2_0= ruleImplementationDescription )
                  // InternalImplementationDescriptionParser.g:99:6: lv_implementations_2_0= ruleImplementationDescription
                  {

                              newCompositeNode(grammarAccess.getImplementationDescriptionSetAccess().getImplementationsImplementationDescriptionParserRuleCall_1_1_0());

                  pushFollow(FOLLOW_3);
                  lv_implementations_2_0=ruleImplementationDescription();

                  state._fsp--;


                              if (current==null) {
                                current = createModelElementForParent(grammarAccess.getImplementationDescriptionSetRule());
                              }
                              add(
                                current,
                                "implementations",
                                lv_implementations_2_0,
                                "de.fraunhofer.ipa.deployment.ImplementationDescription.ImplementationDescription");
                              afterParserOrEnumRuleCall();


                  }


                  }


                  }
                  break;

              default :
                  break loop1;
                }
            } while (true);


            }


            }


              leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDescriptionSet"


    // $ANTLR start "entryRuleImplementationDescription"
    // InternalImplementationDescriptionParser.g:121:1: entryRuleImplementationDescription returns [EObject current=null] : iv_ruleImplementationDescription= ruleImplementationDescription EOF ;
    public final EObject entryRuleImplementationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDescription = null;


        try {
            // InternalImplementationDescriptionParser.g:121:66: (iv_ruleImplementationDescription= ruleImplementationDescription EOF )
            // InternalImplementationDescriptionParser.g:122:2: iv_ruleImplementationDescription= ruleImplementationDescription EOF
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
    // InternalImplementationDescriptionParser.g:128:1: ruleImplementationDescription returns [EObject current=null] : (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:134:2: ( (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:135:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:135:2: (otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:136:3: otherlv_0= ImplementationDescription this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) otherlv_4= IncludeSoftwareComponent this_INDENT_5= RULE_INDENT ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ImplementationDescription,FOLLOW_5);

                  newLeafNode(otherlv_0, grammarAccess.getImplementationDescriptionAccess().getImplementationDescriptionKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_6);

                  newLeafNode(this_INDENT_1, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_1());

            otherlv_2=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_2, grammarAccess.getImplementationDescriptionAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:148:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:149:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:149:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:150:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,IncludeSoftwareComponent,FOLLOW_5);

                  newLeafNode(otherlv_4, grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentKeyword_4());

            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_9);

                  newLeafNode(this_INDENT_5, grammarAccess.getImplementationDescriptionAccess().getINDENTTerminalRuleCall_5());

            // InternalImplementationDescriptionParser.g:175:3: ( (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent ) )+
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
                  // InternalImplementationDescriptionParser.g:176:4: (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent )
                  {
                  // InternalImplementationDescriptionParser.g:176:4: (lv_includeSoftwareComponents_6_0= ruleSoftwareComponent )
                  // InternalImplementationDescriptionParser.g:177:5: lv_includeSoftwareComponents_6_0= ruleSoftwareComponent
                  {

                            newCompositeNode(grammarAccess.getImplementationDescriptionAccess().getIncludeSoftwareComponentsSoftwareComponentParserRuleCall_6_0());

                  pushFollow(FOLLOW_10);
                  lv_includeSoftwareComponents_6_0=ruleSoftwareComponent();

                  state._fsp--;


                            if (current==null) {
                              current = createModelElementForParent(grammarAccess.getImplementationDescriptionRule());
                            }
                            add(
                              current,
                              "includeSoftwareComponents",
                              lv_includeSoftwareComponents_6_0,
                              "de.fraunhofer.ipa.deployment.ImplementationDescription.SoftwareComponent");
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

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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
    // InternalImplementationDescriptionParser.g:206:1: entryRuleExecutionRequirement returns [EObject current=null] : iv_ruleExecutionRequirement= ruleExecutionRequirement EOF ;
    public final EObject entryRuleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:206:61: (iv_ruleExecutionRequirement= ruleExecutionRequirement EOF )
            // InternalImplementationDescriptionParser.g:207:2: iv_ruleExecutionRequirement= ruleExecutionRequirement EOF
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
    // InternalImplementationDescriptionParser.g:213:1: ruleExecutionRequirement returns [EObject current=null] : (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) ;
    public final EObject ruleExecutionRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceRequirement_0 = null;

        EObject this_SoftwareConfigurationRequirement_1 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:219:2: ( (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement ) )
            // InternalImplementationDescriptionParser.g:220:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            {
            // InternalImplementationDescriptionParser.g:220:2: (this_DeviceRequirement_0= ruleDeviceRequirement | this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DeviceRequirement) ) {
                alt3=1;
            }
            else if ( (LA3_0==SoftwareConfigurationParameter) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:221:3: this_DeviceRequirement_0= ruleDeviceRequirement
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
                    // InternalImplementationDescriptionParser.g:230:3: this_SoftwareConfigurationRequirement_1= ruleSoftwareConfigurationRequirement
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
    // InternalImplementationDescriptionParser.g:242:1: entryRuleSoftwareComponent returns [EObject current=null] : iv_ruleSoftwareComponent= ruleSoftwareComponent EOF ;
    public final EObject entryRuleSoftwareComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareComponent = null;


        try {
            // InternalImplementationDescriptionParser.g:242:58: (iv_ruleSoftwareComponent= ruleSoftwareComponent EOF )
            // InternalImplementationDescriptionParser.g:243:2: iv_ruleSoftwareComponent= ruleSoftwareComponent EOF
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
    // InternalImplementationDescriptionParser.g:249:1: ruleSoftwareComponent returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:255:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:256:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:256:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:257:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Repository this_INDENT_6= RULE_INDENT ( (lv_repository_7_0= ruleRepository ) ) this_DEDENT_8= RULE_DEDENT (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:257:3: ()
            // InternalImplementationDescriptionParser.g:258:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getSoftwareComponentAccess().getSoftwareComponentAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getSoftwareComponentAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_2, grammarAccess.getSoftwareComponentAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:275:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:276:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:276:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:277:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getSoftwareComponentAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_12);

                  newLeafNode(this_INDENT_4, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Repository,FOLLOW_5);

                  newLeafNode(otherlv_5, grammarAccess.getSoftwareComponentAccess().getRepositoryKeyword_5());

            this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_13);

                  newLeafNode(this_INDENT_6, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_6());

            // InternalImplementationDescriptionParser.g:306:3: ( (lv_repository_7_0= ruleRepository ) )
            // InternalImplementationDescriptionParser.g:307:4: (lv_repository_7_0= ruleRepository )
            {
            // InternalImplementationDescriptionParser.g:307:4: (lv_repository_7_0= ruleRepository )
            // InternalImplementationDescriptionParser.g:308:5: lv_repository_7_0= ruleRepository
            {

                      newCompositeNode(grammarAccess.getSoftwareComponentAccess().getRepositoryRepositoryParserRuleCall_7_0());

            pushFollow(FOLLOW_11);
            lv_repository_7_0=ruleRepository();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                      }
                      set(
                        current,
                        "repository",
                        lv_repository_7_0,
                        "de.fraunhofer.ipa.deployment.ImplementationDescription.Repository");
                      afterParserOrEnumRuleCall();


            }


            }

            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_14);

                  newLeafNode(this_DEDENT_8, grammarAccess.getSoftwareComponentAccess().getDEDENTTerminalRuleCall_8());

            // InternalImplementationDescriptionParser.g:329:3: (otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ExecutionRequirement) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:330:4: otherlv_9= ExecutionRequirement this_INDENT_10= RULE_INDENT ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,ExecutionRequirement,FOLLOW_5);

                            newLeafNode(otherlv_9, grammarAccess.getSoftwareComponentAccess().getExecutionRequirementKeyword_9_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_15);

                            newLeafNode(this_INDENT_10, grammarAccess.getSoftwareComponentAccess().getINDENTTerminalRuleCall_9_1());

                    // InternalImplementationDescriptionParser.g:338:4: ( (lv_executionRequirement_11_0= ruleExecutionRequirement ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==SoftwareConfigurationParameter||LA4_0==DeviceRequirement) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                      case 1 :
                          // InternalImplementationDescriptionParser.g:339:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                          {
                          // InternalImplementationDescriptionParser.g:339:5: (lv_executionRequirement_11_0= ruleExecutionRequirement )
                          // InternalImplementationDescriptionParser.g:340:6: lv_executionRequirement_11_0= ruleExecutionRequirement
                          {

                                      newCompositeNode(grammarAccess.getSoftwareComponentAccess().getExecutionRequirementExecutionRequirementParserRuleCall_9_2_0());

                          pushFollow(FOLLOW_16);
                          lv_executionRequirement_11_0=ruleExecutionRequirement();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getSoftwareComponentRule());
                                      }
                                      add(
                                        current,
                                        "executionRequirement",
                                        lv_executionRequirement_11_0,
                                        "de.fraunhofer.ipa.deployment.ImplementationDescription.ExecutionRequirement");
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

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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
    // InternalImplementationDescriptionParser.g:370:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalImplementationDescriptionParser.g:370:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalImplementationDescriptionParser.g:371:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalImplementationDescriptionParser.g:377:1: ruleRepository returns [EObject current=null] : (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) ;
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
            // InternalImplementationDescriptionParser.g:383:2: ( (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:384:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:384:2: (otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:385:3: otherlv_0= Type ( (lv_type_1_0= ruleRepositoryType ) ) otherlv_2= Url ( (lv_url_3_0= ruleEString ) ) otherlv_4= Version ( (lv_version_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_17);

                  newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getTypeKeyword_0());

            // InternalImplementationDescriptionParser.g:389:3: ( (lv_type_1_0= ruleRepositoryType ) )
            // InternalImplementationDescriptionParser.g:390:4: (lv_type_1_0= ruleRepositoryType )
            {
            // InternalImplementationDescriptionParser.g:390:4: (lv_type_1_0= ruleRepositoryType )
            // InternalImplementationDescriptionParser.g:391:5: lv_type_1_0= ruleRepositoryType
            {

                      newCompositeNode(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeParserRuleCall_1_0());

            pushFollow(FOLLOW_18);
            lv_type_1_0=ruleRepositoryType();

            state._fsp--;


                      if (current==null) {
                        current = createModelElementForParent(grammarAccess.getRepositoryRule());
                      }
                      set(
                        current,
                        "type",
                        lv_type_1_0,
                        "de.fraunhofer.ipa.deployment.ImplementationDescription.RepositoryType");
                      afterParserOrEnumRuleCall();


            }


            }

            otherlv_2=(Token)match(input,Url,FOLLOW_7);

                  newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getUrlKeyword_2());

            // InternalImplementationDescriptionParser.g:412:3: ( (lv_url_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:413:4: (lv_url_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:413:4: (lv_url_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:414:5: lv_url_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getRepositoryAccess().getUrlEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,Version,FOLLOW_7);

                  newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getVersionKeyword_4());

            // InternalImplementationDescriptionParser.g:435:3: ( (lv_version_5_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:436:4: (lv_version_5_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:436:4: (lv_version_5_0= ruleEString )
            // InternalImplementationDescriptionParser.g:437:5: lv_version_5_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:458:1: entryRuleRepositoryType returns [EObject current=null] : iv_ruleRepositoryType= ruleRepositoryType EOF ;
    public final EObject entryRuleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:458:55: (iv_ruleRepositoryType= ruleRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:459:2: iv_ruleRepositoryType= ruleRepositoryType EOF
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
    // InternalImplementationDescriptionParser.g:465:1: ruleRepositoryType returns [EObject current=null] : this_GitRepositoryType_0= ruleGitRepositoryType ;
    public final EObject ruleRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject this_GitRepositoryType_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:471:2: (this_GitRepositoryType_0= ruleGitRepositoryType )
            // InternalImplementationDescriptionParser.g:472:2: this_GitRepositoryType_0= ruleGitRepositoryType
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
    // InternalImplementationDescriptionParser.g:483:1: entryRuleGitRepositoryType returns [EObject current=null] : iv_ruleGitRepositoryType= ruleGitRepositoryType EOF ;
    public final EObject entryRuleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGitRepositoryType = null;


        try {
            // InternalImplementationDescriptionParser.g:483:58: (iv_ruleGitRepositoryType= ruleGitRepositoryType EOF )
            // InternalImplementationDescriptionParser.g:484:2: iv_ruleGitRepositoryType= ruleGitRepositoryType EOF
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
    // InternalImplementationDescriptionParser.g:490:1: ruleGitRepositoryType returns [EObject current=null] : ( () otherlv_1= Git ) ;
    public final EObject ruleGitRepositoryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:496:2: ( ( () otherlv_1= Git ) )
            // InternalImplementationDescriptionParser.g:497:2: ( () otherlv_1= Git )
            {
            // InternalImplementationDescriptionParser.g:497:2: ( () otherlv_1= Git )
            // InternalImplementationDescriptionParser.g:498:3: () otherlv_1= Git
            {
            // InternalImplementationDescriptionParser.g:498:3: ()
            // InternalImplementationDescriptionParser.g:499:4:
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
    // InternalImplementationDescriptionParser.g:513:1: entryRuleDeviceRequirement returns [EObject current=null] : iv_ruleDeviceRequirement= ruleDeviceRequirement EOF ;
    public final EObject entryRuleDeviceRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:513:58: (iv_ruleDeviceRequirement= ruleDeviceRequirement EOF )
            // InternalImplementationDescriptionParser.g:514:2: iv_ruleDeviceRequirement= ruleDeviceRequirement EOF
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
    // InternalImplementationDescriptionParser.g:520:1: ruleDeviceRequirement returns [EObject current=null] : (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:526:2: ( (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:527:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:527:2: (otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:528:3: otherlv_0= DeviceRequirement this_INDENT_1= RULE_INDENT rulePreListElement otherlv_3= Type ( (lv_type_4_0= ruleEString ) ) (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,DeviceRequirement,FOLLOW_5);

                  newLeafNode(otherlv_0, grammarAccess.getDeviceRequirementAccess().getDeviceRequirementKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_9);

                  newLeafNode(this_INDENT_1, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_1());


                  newCompositeNode(grammarAccess.getDeviceRequirementAccess().getPreListElementParserRuleCall_2());

            pushFollow(FOLLOW_13);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_3=(Token)match(input,Type,FOLLOW_7);

                  newLeafNode(otherlv_3, grammarAccess.getDeviceRequirementAccess().getTypeKeyword_3());

            // InternalImplementationDescriptionParser.g:547:3: ( (lv_type_4_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:548:4: (lv_type_4_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:548:4: (lv_type_4_0= ruleEString )
            // InternalImplementationDescriptionParser.g:549:5: lv_type_4_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getDeviceRequirementAccess().getTypeEStringParserRuleCall_4_0());

            pushFollow(FOLLOW_20);
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

            // InternalImplementationDescriptionParser.g:566:3: (this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:567:4: this_INDENT_5= RULE_INDENT otherlv_6= HWSWParemeter this_INDENT_7= RULE_INDENT ( (lv_parameter_8_0= ruleHWSWParemeter ) )+ this_DEDENT_9= RULE_DEDENT this_DEDENT_10= RULE_DEDENT
                    {
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_21);

                            newLeafNode(this_INDENT_5, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_0());

                    otherlv_6=(Token)match(input,HWSWParemeter,FOLLOW_5);

                            newLeafNode(otherlv_6, grammarAccess.getDeviceRequirementAccess().getHWSWParemeterKeyword_5_1());

                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_9);

                            newLeafNode(this_INDENT_7, grammarAccess.getDeviceRequirementAccess().getINDENTTerminalRuleCall_5_2());

                    // InternalImplementationDescriptionParser.g:579:4: ( (lv_parameter_8_0= ruleHWSWParemeter ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==HyphenMinus) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                      case 1 :
                          // InternalImplementationDescriptionParser.g:580:5: (lv_parameter_8_0= ruleHWSWParemeter )
                          {
                          // InternalImplementationDescriptionParser.g:580:5: (lv_parameter_8_0= ruleHWSWParemeter )
                          // InternalImplementationDescriptionParser.g:581:6: lv_parameter_8_0= ruleHWSWParemeter
                          {

                                      newCompositeNode(grammarAccess.getDeviceRequirementAccess().getParameterHWSWParemeterParserRuleCall_5_3_0());

                          pushFollow(FOLLOW_10);
                          lv_parameter_8_0=ruleHWSWParemeter();

                          state._fsp--;


                                      if (current==null) {
                                        current = createModelElementForParent(grammarAccess.getDeviceRequirementRule());
                                      }
                                      add(
                                        current,
                                        "parameter",
                                        lv_parameter_8_0,
                                        "de.fraunhofer.ipa.deployment.ImplementationDescription.HWSWParemeter");
                                      afterParserOrEnumRuleCall();


                          }


                          }
                          break;

                      default :
                          if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    this_DEDENT_9=(Token)match(input,RULE_DEDENT,FOLLOW_11);

                            newLeafNode(this_DEDENT_9, grammarAccess.getDeviceRequirementAccess().getDEDENTTerminalRuleCall_5_4());

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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
    // InternalImplementationDescriptionParser.g:615:1: entryRuleSoftwareConfigurationRequirement returns [EObject current=null] : iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF ;
    public final EObject entryRuleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareConfigurationRequirement = null;


        try {
            // InternalImplementationDescriptionParser.g:615:73: (iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF )
            // InternalImplementationDescriptionParser.g:616:2: iv_ruleSoftwareConfigurationRequirement= ruleSoftwareConfigurationRequirement EOF
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
    // InternalImplementationDescriptionParser.g:622:1: ruleSoftwareConfigurationRequirement returns [EObject current=null] : (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) ;
    public final EObject ruleSoftwareConfigurationRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token this_DEDENT_3=null;
        EObject lv_parameter_2_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:628:2: ( (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:629:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:629:2: (otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:630:3: otherlv_0= SoftwareConfigurationParameter this_INDENT_1= RULE_INDENT ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+ this_DEDENT_3= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,SoftwareConfigurationParameter,FOLLOW_5);

                  newLeafNode(otherlv_0, grammarAccess.getSoftwareConfigurationRequirementAccess().getSoftwareConfigurationParameterKeyword_0());

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_9);

                  newLeafNode(this_INDENT_1, grammarAccess.getSoftwareConfigurationRequirementAccess().getINDENTTerminalRuleCall_1());

            // InternalImplementationDescriptionParser.g:638:3: ( (lv_parameter_2_0= ruleSoftwareExecutionParemeter ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==HyphenMinus) ) {
                    alt8=1;
                }


                switch (alt8) {
              case 1 :
                  // InternalImplementationDescriptionParser.g:639:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                  {
                  // InternalImplementationDescriptionParser.g:639:4: (lv_parameter_2_0= ruleSoftwareExecutionParemeter )
                  // InternalImplementationDescriptionParser.g:640:5: lv_parameter_2_0= ruleSoftwareExecutionParemeter
                  {

                            newCompositeNode(grammarAccess.getSoftwareConfigurationRequirementAccess().getParameterSoftwareExecutionParemeterParserRuleCall_2_0());

                  pushFollow(FOLLOW_10);
                  lv_parameter_2_0=ruleSoftwareExecutionParemeter();

                  state._fsp--;


                            if (current==null) {
                              current = createModelElementForParent(grammarAccess.getSoftwareConfigurationRequirementRule());
                            }
                            add(
                              current,
                              "parameter",
                              lv_parameter_2_0,
                              "de.fraunhofer.ipa.deployment.ImplementationDescription.SoftwareExecutionParemeter");
                            afterParserOrEnumRuleCall();


                  }


                  }
                  break;

              default :
                  if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalImplementationDescriptionParser.g:665:1: entryRuleHWSWParemeter returns [EObject current=null] : iv_ruleHWSWParemeter= ruleHWSWParemeter EOF ;
    public final EObject entryRuleHWSWParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHWSWParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:665:54: (iv_ruleHWSWParemeter= ruleHWSWParemeter EOF )
            // InternalImplementationDescriptionParser.g:666:2: iv_ruleHWSWParemeter= ruleHWSWParemeter EOF
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
    // InternalImplementationDescriptionParser.g:672:1: ruleHWSWParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:678:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:679:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:679:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:680:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:680:3: ()
            // InternalImplementationDescriptionParser.g:681:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getHWSWParemeterAccess().getHWSWParemeterAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_2, grammarAccess.getHWSWParemeterAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:698:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:699:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:699:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:700:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getHWSWParemeterAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_4, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_23);

                  newLeafNode(otherlv_5, grammarAccess.getHWSWParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:725:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:726:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:726:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:727:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getHWSWParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:744:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Description) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:745:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getHWSWParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:749:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:750:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:750:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:751:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:769:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Value) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:770:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_5);

                            newLeafNode(otherlv_9, grammarAccess.getHWSWParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_9);

                            newLeafNode(this_INDENT_10, grammarAccess.getHWSWParemeterAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_26);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:785:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:786:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:786:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:787:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getHWSWParemeterAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_10);
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

                    // InternalImplementationDescriptionParser.g:804:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==HyphenMinus) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                      case 1 :
                          // InternalImplementationDescriptionParser.g:805:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getHWSWParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_26);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalImplementationDescriptionParser.g:812:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalImplementationDescriptionParser.g:813:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalImplementationDescriptionParser.g:813:6: (lv_value_14_0= rulePropertyValue )
                          // InternalImplementationDescriptionParser.g:814:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getHWSWParemeterAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_10);
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
                          break loop10;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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
    // InternalImplementationDescriptionParser.g:845:1: entryRuleSoftwareExecutionParemeter returns [EObject current=null] : iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF ;
    public final EObject entryRuleSoftwareExecutionParemeter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftwareExecutionParemeter = null;


        try {
            // InternalImplementationDescriptionParser.g:845:67: (iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF )
            // InternalImplementationDescriptionParser.g:846:2: iv_ruleSoftwareExecutionParemeter= ruleSoftwareExecutionParemeter EOF
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
    // InternalImplementationDescriptionParser.g:852:1: ruleSoftwareExecutionParemeter returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:858:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:859:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:859:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:860:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )? this_DEDENT_16= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:860:3: ()
            // InternalImplementationDescriptionParser.g:861:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getSoftwareExecutionParemeterAccess().getSoftwareExecutionParemeterAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_2, grammarAccess.getSoftwareExecutionParemeterAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:878:3: ( (lv_name_3_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:879:4: (lv_name_3_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:879:4: (lv_name_3_0= ruleEString )
            // InternalImplementationDescriptionParser.g:880:5: lv_name_3_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getNameEStringParserRuleCall_3_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_4, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_23);

                  newLeafNode(otherlv_5, grammarAccess.getSoftwareExecutionParemeterAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:905:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:906:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:906:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:907:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:924:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Description) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:925:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:929:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:930:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:930:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:931:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:949:3: (otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:950:4: otherlv_9= Value this_INDENT_10= RULE_INDENT rulePreListElement ( (lv_value_12_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )* this_DEDENT_15= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_5);

                            newLeafNode(otherlv_9, grammarAccess.getSoftwareExecutionParemeterAccess().getValueKeyword_8_0());

                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_9);

                            newLeafNode(this_INDENT_10, grammarAccess.getSoftwareExecutionParemeterAccess().getINDENTTerminalRuleCall_8_1());


                            newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_2());

                    pushFollow(FOLLOW_26);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:965:4: ( (lv_value_12_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:966:5: (lv_value_12_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:966:5: (lv_value_12_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:967:6: lv_value_12_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getValuePropertyValueParserRuleCall_8_3_0());

                    pushFollow(FOLLOW_10);
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

                    // InternalImplementationDescriptionParser.g:984:4: ( rulePreListElement ( (lv_value_14_0= rulePropertyValue ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==HyphenMinus) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                      case 1 :
                          // InternalImplementationDescriptionParser.g:985:5: rulePreListElement ( (lv_value_14_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getPreListElementParserRuleCall_8_4_0());

                          pushFollow(FOLLOW_26);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalImplementationDescriptionParser.g:992:5: ( (lv_value_14_0= rulePropertyValue ) )
                          // InternalImplementationDescriptionParser.g:993:6: (lv_value_14_0= rulePropertyValue )
                          {
                          // InternalImplementationDescriptionParser.g:993:6: (lv_value_14_0= rulePropertyValue )
                          // InternalImplementationDescriptionParser.g:994:7: lv_value_14_0= rulePropertyValue
                          {

                                        newCompositeNode(grammarAccess.getSoftwareExecutionParemeterAccess().getValuePropertyValueParserRuleCall_8_4_1_0());

                          pushFollow(FOLLOW_10);
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
                          break loop13;
                        }
                    } while (true);

                    this_DEDENT_15=(Token)match(input,RULE_DEDENT,FOLLOW_11);

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


    // $ANTLR start "entryRuleAbstractOperatingSystemProperty"
    // InternalImplementationDescriptionParser.g:1025:1: entryRuleAbstractOperatingSystemProperty returns [EObject current=null] : iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF ;
    public final EObject entryRuleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperatingSystemProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:1025:72: (iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF )
            // InternalImplementationDescriptionParser.g:1026:2: iv_ruleAbstractOperatingSystemProperty= ruleAbstractOperatingSystemProperty EOF
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
    // InternalImplementationDescriptionParser.g:1032:1: ruleAbstractOperatingSystemProperty returns [EObject current=null] : (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) ;
    public final EObject ruleAbstractOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NameOperatingSystemProperty_0 = null;

        EObject this_VersionOperatingSystemProperty_1 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1038:2: ( (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty ) )
            // InternalImplementationDescriptionParser.g:1039:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            {
            // InternalImplementationDescriptionParser.g:1039:2: (this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty | this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==HyphenMinus) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==Name) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==Os_version) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==Os_name) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1040:3: this_NameOperatingSystemProperty_0= ruleNameOperatingSystemProperty
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
                    // InternalImplementationDescriptionParser.g:1049:3: this_VersionOperatingSystemProperty_1= ruleVersionOperatingSystemProperty
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
    // InternalImplementationDescriptionParser.g:1061:1: entryRuleNameOperatingSystemProperty returns [EObject current=null] : iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF ;
    public final EObject entryRuleNameOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperatingSystemProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:1061:68: (iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF )
            // InternalImplementationDescriptionParser.g:1062:2: iv_ruleNameOperatingSystemProperty= ruleNameOperatingSystemProperty EOF
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
    // InternalImplementationDescriptionParser.g:1068:1: ruleNameOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:1074:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:1075:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:1075:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:1076:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_name ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:1076:3: ()
            // InternalImplementationDescriptionParser.g:1077:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getNameOperatingSystemPropertyAccess().getNameOperatingSystemPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_27);

                  newLeafNode(otherlv_2, grammarAccess.getNameOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:1094:3: ( (lv_name_3_0= Os_name ) )
            // InternalImplementationDescriptionParser.g:1095:4: (lv_name_3_0= Os_name )
            {
            // InternalImplementationDescriptionParser.g:1095:4: (lv_name_3_0= Os_name )
            // InternalImplementationDescriptionParser.g:1096:5: lv_name_3_0= Os_name
            {
            lv_name_3_0=(Token)match(input,Os_name,FOLLOW_5);

                      newLeafNode(lv_name_3_0, grammarAccess.getNameOperatingSystemPropertyAccess().getNameOs_nameKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getNameOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_name");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_4, grammarAccess.getNameOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_23);

                  newLeafNode(otherlv_5, grammarAccess.getNameOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:1116:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1117:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1117:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1118:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1135:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Description) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1136:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1140:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1141:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1141:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1142:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1160:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Value) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1161:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_26);

                            newLeafNode(otherlv_9, grammarAccess.getNameOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalImplementationDescriptionParser.g:1165:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1166:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1166:5: (lv_value_10_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1167:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getNameOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
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
    // InternalImplementationDescriptionParser.g:1193:1: entryRuleVersionOperatingSystemProperty returns [EObject current=null] : iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF ;
    public final EObject entryRuleVersionOperatingSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionOperatingSystemProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:1193:71: (iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF )
            // InternalImplementationDescriptionParser.g:1194:2: iv_ruleVersionOperatingSystemProperty= ruleVersionOperatingSystemProperty EOF
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
    // InternalImplementationDescriptionParser.g:1200:1: ruleVersionOperatingSystemProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) ;
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
            // InternalImplementationDescriptionParser.g:1206:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:1207:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:1207:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:1208:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= Os_version ) ) this_INDENT_4= RULE_INDENT otherlv_5= Kind ( (lv_kind_6_0= ruleAttributeKind ) ) (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalImplementationDescriptionParser.g:1208:3: ()
            // InternalImplementationDescriptionParser.g:1209:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getVersionOperatingSystemPropertyAccess().getVersionOperatingSystemPropertyAction_0(),
                      current);


            }


                  newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_2=(Token)match(input,Name,FOLLOW_28);

                  newLeafNode(otherlv_2, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameKeyword_2());

            // InternalImplementationDescriptionParser.g:1226:3: ( (lv_name_3_0= Os_version ) )
            // InternalImplementationDescriptionParser.g:1227:4: (lv_name_3_0= Os_version )
            {
            // InternalImplementationDescriptionParser.g:1227:4: (lv_name_3_0= Os_version )
            // InternalImplementationDescriptionParser.g:1228:5: lv_name_3_0= Os_version
            {
            lv_name_3_0=(Token)match(input,Os_version,FOLLOW_5);

                      newLeafNode(lv_name_3_0, grammarAccess.getVersionOperatingSystemPropertyAccess().getNameOs_versionKeyword_3_0());


                      if (current==null) {
                        current = createModelElement(grammarAccess.getVersionOperatingSystemPropertyRule());
                      }
                      setWithLastConsumed(current, "name", lv_name_3_0, "os_version");


            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_4, grammarAccess.getVersionOperatingSystemPropertyAccess().getINDENTTerminalRuleCall_4());

            otherlv_5=(Token)match(input,Kind,FOLLOW_23);

                  newLeafNode(otherlv_5, grammarAccess.getVersionOperatingSystemPropertyAccess().getKindKeyword_5());

            // InternalImplementationDescriptionParser.g:1248:3: ( (lv_kind_6_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1249:4: (lv_kind_6_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1249:4: (lv_kind_6_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1250:5: lv_kind_6_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getKindAttributeKindParserRuleCall_6_0());

            pushFollow(FOLLOW_24);
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

            // InternalImplementationDescriptionParser.g:1267:3: (otherlv_7= Description ( (lv_description_8_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Description) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1268:4: otherlv_7= Description ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_7, grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1272:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1273:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1273:5: (lv_description_8_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1274:6: lv_description_8_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getDescriptionEStringParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_25);
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

            // InternalImplementationDescriptionParser.g:1292:3: (otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Value) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1293:4: otherlv_9= Value ( (lv_value_10_0= rulePropertyValue ) )
                    {
                    otherlv_9=(Token)match(input,Value,FOLLOW_26);

                            newLeafNode(otherlv_9, grammarAccess.getVersionOperatingSystemPropertyAccess().getValueKeyword_8_0());

                    // InternalImplementationDescriptionParser.g:1297:4: ( (lv_value_10_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1298:5: (lv_value_10_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1298:5: (lv_value_10_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1299:6: lv_value_10_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getVersionOperatingSystemPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_11);
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
    // InternalImplementationDescriptionParser.g:1325:1: entryRuleAbstractProperty returns [EObject current=null] : iv_ruleAbstractProperty= ruleAbstractProperty EOF ;
    public final EObject entryRuleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractProperty = null;


        try {
            // InternalImplementationDescriptionParser.g:1325:57: (iv_ruleAbstractProperty= ruleAbstractProperty EOF )
            // InternalImplementationDescriptionParser.g:1326:2: iv_ruleAbstractProperty= ruleAbstractProperty EOF
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
    // InternalImplementationDescriptionParser.g:1332:1: ruleAbstractProperty returns [EObject current=null] : (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) ;
    public final EObject ruleAbstractProperty() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyAttribute_0 = null;

        EObject this_PropertyMaximun_1 = null;

        EObject this_PropertyMinimum_2 = null;

        EObject this_PropertySelection_3 = null;

        EObject this_PropertyRange_4 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1338:2: ( (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange ) )
            // InternalImplementationDescriptionParser.g:1339:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            {
            // InternalImplementationDescriptionParser.g:1339:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1340:3: this_PropertyAttribute_0= rulePropertyAttribute
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
                    // InternalImplementationDescriptionParser.g:1349:3: this_PropertyMaximun_1= rulePropertyMaximun
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
                    // InternalImplementationDescriptionParser.g:1358:3: this_PropertyMinimum_2= rulePropertyMinimum
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
                    // InternalImplementationDescriptionParser.g:1367:3: this_PropertySelection_3= rulePropertySelection
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
                    // InternalImplementationDescriptionParser.g:1376:3: this_PropertyRange_4= rulePropertyRange
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
    // InternalImplementationDescriptionParser.g:1388:1: entryRulePropertyKind returns [EObject current=null] : iv_rulePropertyKind= rulePropertyKind EOF ;
    public final EObject entryRulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyKind = null;


        try {
            // InternalImplementationDescriptionParser.g:1388:53: (iv_rulePropertyKind= rulePropertyKind EOF )
            // InternalImplementationDescriptionParser.g:1389:2: iv_rulePropertyKind= rulePropertyKind EOF
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
    // InternalImplementationDescriptionParser.g:1395:1: rulePropertyKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) ;
    public final EObject rulePropertyKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_RangeKind_3 = null;

        EObject this_SelectionKind_4 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:1401:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1402:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1402:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_RangeKind_3= ruleRangeKind | this_SelectionKind_4= ruleSelectionKind )
            int alt21=5;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt21=1;
                }
                break;
            case MaximumKind:
                {
                alt21=2;
                }
                break;
            case MinimumKind:
                {
                alt21=3;
                }
                break;
            case RangeKind:
                {
                alt21=4;
                }
                break;
            case SelectionKind:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1403:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalImplementationDescriptionParser.g:1412:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalImplementationDescriptionParser.g:1421:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalImplementationDescriptionParser.g:1430:3: this_RangeKind_3= ruleRangeKind
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
                    // InternalImplementationDescriptionParser.g:1439:3: this_SelectionKind_4= ruleSelectionKind
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
    // InternalImplementationDescriptionParser.g:1451:1: entryRulePropertyAttribute returns [EObject current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final EObject entryRulePropertyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttribute = null;


        try {
            // InternalImplementationDescriptionParser.g:1451:58: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // InternalImplementationDescriptionParser.g:1452:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
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
    // InternalImplementationDescriptionParser.g:1458:1: rulePropertyAttribute returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1464:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1465:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1465:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1466:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleAttributeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1477:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1478:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1478:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1479:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyAttributeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_23);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyAttributeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1504:3: ( (lv_kind_5_0= ruleAttributeKind ) )
            // InternalImplementationDescriptionParser.g:1505:4: (lv_kind_5_0= ruleAttributeKind )
            {
            // InternalImplementationDescriptionParser.g:1505:4: (lv_kind_5_0= ruleAttributeKind )
            // InternalImplementationDescriptionParser.g:1506:5: lv_kind_5_0= ruleAttributeKind
            {

                      newCompositeNode(grammarAccess.getPropertyAttributeAccess().getKindAttributeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalImplementationDescriptionParser.g:1523:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Description) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1524:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyAttributeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1528:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1529:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1529:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1530:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalImplementationDescriptionParser.g:1548:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Value) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1549:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_26);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyAttributeAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1553:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1554:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1554:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1555:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyAttributeAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalImplementationDescriptionParser.g:1573:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DEDENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1574:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1583:1: entryRulePropertyMaximun returns [EObject current=null] : iv_rulePropertyMaximun= rulePropertyMaximun EOF ;
    public final EObject entryRulePropertyMaximun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMaximun = null;


        try {
            // InternalImplementationDescriptionParser.g:1583:56: (iv_rulePropertyMaximun= rulePropertyMaximun EOF )
            // InternalImplementationDescriptionParser.g:1584:2: iv_rulePropertyMaximun= rulePropertyMaximun EOF
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
    // InternalImplementationDescriptionParser.g:1590:1: rulePropertyMaximun returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1596:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1597:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1597:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1598:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMaximumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMaximunAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMaximunAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1610:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1610:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1611:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMaximunAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_32);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMaximunAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1636:3: ( (lv_kind_5_0= ruleMaximumKind ) )
            // InternalImplementationDescriptionParser.g:1637:4: (lv_kind_5_0= ruleMaximumKind )
            {
            // InternalImplementationDescriptionParser.g:1637:4: (lv_kind_5_0= ruleMaximumKind )
            // InternalImplementationDescriptionParser.g:1638:5: lv_kind_5_0= ruleMaximumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMaximunAccess().getKindMaximumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalImplementationDescriptionParser.g:1655:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Description) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1656:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMaximunAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1660:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1661:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1661:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1662:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalImplementationDescriptionParser.g:1680:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Value) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1681:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_26);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMaximunAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1685:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1686:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1686:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1687:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMaximunAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalImplementationDescriptionParser.g:1705:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DEDENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1706:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1715:1: entryRulePropertyMinimum returns [EObject current=null] : iv_rulePropertyMinimum= rulePropertyMinimum EOF ;
    public final EObject entryRulePropertyMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMinimum = null;


        try {
            // InternalImplementationDescriptionParser.g:1715:56: (iv_rulePropertyMinimum= rulePropertyMinimum EOF )
            // InternalImplementationDescriptionParser.g:1716:2: iv_rulePropertyMinimum= rulePropertyMinimum EOF
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
    // InternalImplementationDescriptionParser.g:1722:1: rulePropertyMinimum returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1728:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1729:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1729:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1730:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleMinimumKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? (this_DEDENT_10= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyMinimumAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyMinimumAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1741:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1742:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1742:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1743:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyMinimumAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_33);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyMinimumAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1768:3: ( (lv_kind_5_0= ruleMinimumKind ) )
            // InternalImplementationDescriptionParser.g:1769:4: (lv_kind_5_0= ruleMinimumKind )
            {
            // InternalImplementationDescriptionParser.g:1769:4: (lv_kind_5_0= ruleMinimumKind )
            // InternalImplementationDescriptionParser.g:1770:5: lv_kind_5_0= ruleMinimumKind
            {

                      newCompositeNode(grammarAccess.getPropertyMinimumAccess().getKindMinimumKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalImplementationDescriptionParser.g:1787:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Description) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1788:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyMinimumAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1792:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1793:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1793:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1794:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalImplementationDescriptionParser.g:1812:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1813:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_26);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyMinimumAccess().getValueKeyword_7_0());

                    // InternalImplementationDescriptionParser.g:1817:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1818:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1818:5: (lv_value_9_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1819:6: lv_value_9_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyMinimumAccess().getValuePropertyValueParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_31);
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

            // InternalImplementationDescriptionParser.g:1837:3: (this_DEDENT_10= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DEDENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1838:4: this_DEDENT_10= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:1847:1: entryRulePropertySelection returns [EObject current=null] : iv_rulePropertySelection= rulePropertySelection EOF ;
    public final EObject entryRulePropertySelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySelection = null;


        try {
            // InternalImplementationDescriptionParser.g:1847:58: (iv_rulePropertySelection= rulePropertySelection EOF )
            // InternalImplementationDescriptionParser.g:1848:2: iv_rulePropertySelection= rulePropertySelection EOF
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
    // InternalImplementationDescriptionParser.g:1854:1: rulePropertySelection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:1860:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:1861:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:1861:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:1862:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleSelectionKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_1, grammarAccess.getPropertySelectionAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:1873:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:1874:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:1874:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:1875:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_34);

                  newLeafNode(otherlv_4, grammarAccess.getPropertySelectionAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:1900:3: ( (lv_kind_5_0= ruleSelectionKind ) )
            // InternalImplementationDescriptionParser.g:1901:4: (lv_kind_5_0= ruleSelectionKind )
            {
            // InternalImplementationDescriptionParser.g:1901:4: (lv_kind_5_0= ruleSelectionKind )
            // InternalImplementationDescriptionParser.g:1902:5: lv_kind_5_0= ruleSelectionKind
            {

                      newCompositeNode(grammarAccess.getPropertySelectionAccess().getKindSelectionKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalImplementationDescriptionParser.g:1919:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Description) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1920:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getPropertySelectionAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:1924:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:1925:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:1925:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:1926:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertySelectionAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalImplementationDescriptionParser.g:1944:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Value) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:1945:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )* this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_5);

                            newLeafNode(otherlv_8, grammarAccess.getPropertySelectionAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertySelectionAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_26);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:1960:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:1961:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:1961:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:1962:6: lv_value_11_0= rulePropertyValue
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

                    // InternalImplementationDescriptionParser.g:1979:4: ( rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==HyphenMinus) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                      case 1 :
                          // InternalImplementationDescriptionParser.g:1980:5: rulePreListElement ( (lv_value_13_0= rulePropertyValue ) )
                          {

                                    newCompositeNode(grammarAccess.getPropertySelectionAccess().getPreListElementParserRuleCall_7_4_0());

                          pushFollow(FOLLOW_26);
                          rulePreListElement();

                          state._fsp--;


                                    afterParserOrEnumRuleCall();

                          // InternalImplementationDescriptionParser.g:1987:5: ( (lv_value_13_0= rulePropertyValue ) )
                          // InternalImplementationDescriptionParser.g:1988:6: (lv_value_13_0= rulePropertyValue )
                          {
                          // InternalImplementationDescriptionParser.g:1988:6: (lv_value_13_0= rulePropertyValue )
                          // InternalImplementationDescriptionParser.g:1989:7: lv_value_13_0= rulePropertyValue
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
                          break loop32;
                        }
                    } while (true);

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_31);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertySelectionAccess().getDEDENTTerminalRuleCall_7_5());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:2012:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DEDENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2013:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:2022:1: entryRulePropertyRange returns [EObject current=null] : iv_rulePropertyRange= rulePropertyRange EOF ;
    public final EObject entryRulePropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRange = null;


        try {
            // InternalImplementationDescriptionParser.g:2022:54: (iv_rulePropertyRange= rulePropertyRange EOF )
            // InternalImplementationDescriptionParser.g:2023:2: iv_rulePropertyRange= rulePropertyRange EOF
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
    // InternalImplementationDescriptionParser.g:2029:1: rulePropertyRange returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) ;
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
            // InternalImplementationDescriptionParser.g:2035:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? ) )
            // InternalImplementationDescriptionParser.g:2036:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            {
            // InternalImplementationDescriptionParser.g:2036:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )? )
            // InternalImplementationDescriptionParser.g:2037:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleRangeKind ) ) (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )? (this_DEDENT_15= RULE_DEDENT )?
            {

                  newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_0());

            pushFollow(FOLLOW_6);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            otherlv_1=(Token)match(input,Name,FOLLOW_7);

                  newLeafNode(otherlv_1, grammarAccess.getPropertyRangeAccess().getNameKeyword_1());

            // InternalImplementationDescriptionParser.g:2048:3: ( (lv_name_2_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2049:4: (lv_name_2_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2049:4: (lv_name_2_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2050:5: lv_name_2_0= ruleEString
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getNameEStringParserRuleCall_2_0());

            pushFollow(FOLLOW_5);
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

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_22);

                  newLeafNode(this_INDENT_3, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Kind,FOLLOW_35);

                  newLeafNode(otherlv_4, grammarAccess.getPropertyRangeAccess().getKindKeyword_4());

            // InternalImplementationDescriptionParser.g:2075:3: ( (lv_kind_5_0= ruleRangeKind ) )
            // InternalImplementationDescriptionParser.g:2076:4: (lv_kind_5_0= ruleRangeKind )
            {
            // InternalImplementationDescriptionParser.g:2076:4: (lv_kind_5_0= ruleRangeKind )
            // InternalImplementationDescriptionParser.g:2077:5: lv_kind_5_0= ruleRangeKind
            {

                      newCompositeNode(grammarAccess.getPropertyRangeAccess().getKindRangeKindParserRuleCall_5_0());

            pushFollow(FOLLOW_29);
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

            // InternalImplementationDescriptionParser.g:2094:3: (otherlv_6= Description ( (lv_description_7_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Description) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2095:4: otherlv_6= Description ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Description,FOLLOW_7);

                            newLeafNode(otherlv_6, grammarAccess.getPropertyRangeAccess().getDescriptionKeyword_6_0());

                    // InternalImplementationDescriptionParser.g:2099:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalImplementationDescriptionParser.g:2100:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalImplementationDescriptionParser.g:2100:5: (lv_description_7_0= ruleEString )
                    // InternalImplementationDescriptionParser.g:2101:6: lv_description_7_0= ruleEString
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getDescriptionEStringParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_30);
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

            // InternalImplementationDescriptionParser.g:2119:3: (otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Value) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2120:4: otherlv_8= Value this_INDENT_9= RULE_INDENT rulePreListElement ( (lv_value_11_0= rulePropertyValue ) ) rulePreListElement ( (lv_value_13_0= rulePropertyValue ) ) this_DEDENT_14= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_5);

                            newLeafNode(otherlv_8, grammarAccess.getPropertyRangeAccess().getValueKeyword_7_0());

                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_9);

                            newLeafNode(this_INDENT_9, grammarAccess.getPropertyRangeAccess().getINDENTTerminalRuleCall_7_1());


                            newCompositeNode(grammarAccess.getPropertyRangeAccess().getPreListElementParserRuleCall_7_2());

                    pushFollow(FOLLOW_26);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:2135:4: ( (lv_value_11_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:2136:5: (lv_value_11_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:2136:5: (lv_value_11_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:2137:6: lv_value_11_0= rulePropertyValue
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

                    pushFollow(FOLLOW_26);
                    rulePreListElement();

                    state._fsp--;


                            afterParserOrEnumRuleCall();

                    // InternalImplementationDescriptionParser.g:2161:4: ( (lv_value_13_0= rulePropertyValue ) )
                    // InternalImplementationDescriptionParser.g:2162:5: (lv_value_13_0= rulePropertyValue )
                    {
                    // InternalImplementationDescriptionParser.g:2162:5: (lv_value_13_0= rulePropertyValue )
                    // InternalImplementationDescriptionParser.g:2163:6: lv_value_13_0= rulePropertyValue
                    {

                                newCompositeNode(grammarAccess.getPropertyRangeAccess().getValuePropertyValueParserRuleCall_7_5_0());

                    pushFollow(FOLLOW_11);
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

                    this_DEDENT_14=(Token)match(input,RULE_DEDENT,FOLLOW_31);

                            newLeafNode(this_DEDENT_14, grammarAccess.getPropertyRangeAccess().getDEDENTTerminalRuleCall_7_6());


                    }
                    break;

            }

            // InternalImplementationDescriptionParser.g:2185:3: (this_DEDENT_15= RULE_DEDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DEDENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2186:4: this_DEDENT_15= RULE_DEDENT
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
    // InternalImplementationDescriptionParser.g:2195:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2195:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalImplementationDescriptionParser.g:2196:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalImplementationDescriptionParser.g:2202:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) ;
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
            // InternalImplementationDescriptionParser.g:2208:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList ) )
            // InternalImplementationDescriptionParser.g:2209:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            {
            // InternalImplementationDescriptionParser.g:2209:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue | this_LinuxDistributionValue_4= ruleLinuxDistributionValue | this_UbuntuVersionValue_5= ruleUbuntuVersionValue | this_PropertyValueList_6= rulePropertyValueList )
            int alt38=7;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt38=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            case Arm64:
            case X86:
                {
                alt38=4;
                }
                break;
            case Debian:
            case Ubuntu:
                {
                alt38=5;
                }
                break;
            case Focal:
            case Jammy:
                {
                alt38=6;
                }
                break;
            case RULE_INDENT:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2210:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalImplementationDescriptionParser.g:2219:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalImplementationDescriptionParser.g:2228:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalImplementationDescriptionParser.g:2237:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
                    // InternalImplementationDescriptionParser.g:2246:3: this_LinuxDistributionValue_4= ruleLinuxDistributionValue
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
                    // InternalImplementationDescriptionParser.g:2255:3: this_UbuntuVersionValue_5= ruleUbuntuVersionValue
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
                    // InternalImplementationDescriptionParser.g:2264:3: this_PropertyValueList_6= rulePropertyValueList
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
    // InternalImplementationDescriptionParser.g:2276:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalImplementationDescriptionParser.g:2276:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalImplementationDescriptionParser.g:2277:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalImplementationDescriptionParser.g:2283:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2289:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalImplementationDescriptionParser.g:2290:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalImplementationDescriptionParser.g:2290:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalImplementationDescriptionParser.g:2291:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalImplementationDescriptionParser.g:2291:3: (lv_value_0_0= ruleInteger0 )
            // InternalImplementationDescriptionParser.g:2292:4: lv_value_0_0= ruleInteger0
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
    // InternalImplementationDescriptionParser.g:2312:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalImplementationDescriptionParser.g:2312:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalImplementationDescriptionParser.g:2313:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalImplementationDescriptionParser.g:2319:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2325:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalImplementationDescriptionParser.g:2326:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalImplementationDescriptionParser.g:2326:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalImplementationDescriptionParser.g:2327:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalImplementationDescriptionParser.g:2327:3: (lv_value_0_0= ruleDouble0 )
            // InternalImplementationDescriptionParser.g:2328:4: lv_value_0_0= ruleDouble0
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
    // InternalImplementationDescriptionParser.g:2348:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalImplementationDescriptionParser.g:2348:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalImplementationDescriptionParser.g:2349:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalImplementationDescriptionParser.g:2355:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2361:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2362:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2362:2: ( (lv_value_0_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2363:3: (lv_value_0_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2363:3: (lv_value_0_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2364:4: lv_value_0_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2384:1: entryRulePropertyValueList returns [EObject current=null] : iv_rulePropertyValueList= rulePropertyValueList EOF ;
    public final EObject entryRulePropertyValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueList = null;


        try {
            // InternalImplementationDescriptionParser.g:2384:58: (iv_rulePropertyValueList= rulePropertyValueList EOF )
            // InternalImplementationDescriptionParser.g:2385:2: iv_rulePropertyValueList= rulePropertyValueList EOF
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
    // InternalImplementationDescriptionParser.g:2391:1: rulePropertyValueList returns [EObject current=null] : (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) ;
    public final EObject rulePropertyValueList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_0=null;
        Token this_DEDENT_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2397:2: ( (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT ) )
            // InternalImplementationDescriptionParser.g:2398:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            {
            // InternalImplementationDescriptionParser.g:2398:2: (this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT )
            // InternalImplementationDescriptionParser.g:2399:3: this_INDENT_0= RULE_INDENT rulePreListElement ( (lv_value_2_0= rulePropertyValue ) ) ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )* this_DEDENT_5= RULE_DEDENT
            {
            this_INDENT_0=(Token)match(input,RULE_INDENT,FOLLOW_9);

                  newLeafNode(this_INDENT_0, grammarAccess.getPropertyValueListAccess().getINDENTTerminalRuleCall_0());


                  newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_1());

            pushFollow(FOLLOW_26);
            rulePreListElement();

            state._fsp--;


                  afterParserOrEnumRuleCall();

            // InternalImplementationDescriptionParser.g:2410:3: ( (lv_value_2_0= rulePropertyValue ) )
            // InternalImplementationDescriptionParser.g:2411:4: (lv_value_2_0= rulePropertyValue )
            {
            // InternalImplementationDescriptionParser.g:2411:4: (lv_value_2_0= rulePropertyValue )
            // InternalImplementationDescriptionParser.g:2412:5: lv_value_2_0= rulePropertyValue
            {

                      newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_2_0());

            pushFollow(FOLLOW_10);
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

            // InternalImplementationDescriptionParser.g:2429:3: ( rulePreListElement ( (lv_value_4_0= rulePropertyValue ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==HyphenMinus) ) {
                    alt39=1;
                }


                switch (alt39) {
              case 1 :
                  // InternalImplementationDescriptionParser.g:2430:4: rulePreListElement ( (lv_value_4_0= rulePropertyValue ) )
                  {

                          newCompositeNode(grammarAccess.getPropertyValueListAccess().getPreListElementParserRuleCall_3_0());

                  pushFollow(FOLLOW_26);
                  rulePreListElement();

                  state._fsp--;


                          afterParserOrEnumRuleCall();

                  // InternalImplementationDescriptionParser.g:2437:4: ( (lv_value_4_0= rulePropertyValue ) )
                  // InternalImplementationDescriptionParser.g:2438:5: (lv_value_4_0= rulePropertyValue )
                  {
                  // InternalImplementationDescriptionParser.g:2438:5: (lv_value_4_0= rulePropertyValue )
                  // InternalImplementationDescriptionParser.g:2439:6: lv_value_4_0= rulePropertyValue
                  {

                              newCompositeNode(grammarAccess.getPropertyValueListAccess().getValuePropertyValueParserRuleCall_3_1_0());

                  pushFollow(FOLLOW_10);
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
                  break loop39;
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
    // InternalImplementationDescriptionParser.g:2465:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2465:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalImplementationDescriptionParser.g:2466:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalImplementationDescriptionParser.g:2472:1: ruleProcessorArchitectureValue returns [EObject current=null] : ( (lv_value_0_0= ruleProcessorArchitectureType ) ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2478:2: ( ( (lv_value_0_0= ruleProcessorArchitectureType ) ) )
            // InternalImplementationDescriptionParser.g:2479:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            {
            // InternalImplementationDescriptionParser.g:2479:2: ( (lv_value_0_0= ruleProcessorArchitectureType ) )
            // InternalImplementationDescriptionParser.g:2480:3: (lv_value_0_0= ruleProcessorArchitectureType )
            {
            // InternalImplementationDescriptionParser.g:2480:3: (lv_value_0_0= ruleProcessorArchitectureType )
            // InternalImplementationDescriptionParser.g:2481:4: lv_value_0_0= ruleProcessorArchitectureType
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
    // InternalImplementationDescriptionParser.g:2501:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2501:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalImplementationDescriptionParser.g:2502:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalImplementationDescriptionParser.g:2508:1: ruleAbstractResouceType returns [EObject current=null] : this_ResourceType_0= ruleResourceType ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceType_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2514:2: (this_ResourceType_0= ruleResourceType )
            // InternalImplementationDescriptionParser.g:2515:2: this_ResourceType_0= ruleResourceType
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
    // InternalImplementationDescriptionParser.g:2526:1: entryRuleOpertingSystemResouceType returns [EObject current=null] : iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF ;
    public final EObject entryRuleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemResouceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2526:66: (iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF )
            // InternalImplementationDescriptionParser.g:2527:2: iv_ruleOpertingSystemResouceType= ruleOpertingSystemResouceType EOF
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
    // InternalImplementationDescriptionParser.g:2533:1: ruleOpertingSystemResouceType returns [EObject current=null] : (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) ;
    public final EObject ruleOpertingSystemResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystem_0 = null;

        EObject this_MacOSOpertingSystem_1 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2539:2: ( (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2540:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2540:2: (this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem | this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LinuxOpertingSystem) ) {
                alt40=1;
            }
            else if ( (LA40_0==MacOSOpertingSystem) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2541:3: this_LinuxOpertingSystem_0= ruleLinuxOpertingSystem
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
                    // InternalImplementationDescriptionParser.g:2550:3: this_MacOSOpertingSystem_1= ruleMacOSOpertingSystem
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
    // InternalImplementationDescriptionParser.g:2562:1: entryRuleResourceType returns [EObject current=null] : iv_ruleResourceType= ruleResourceType EOF ;
    public final EObject entryRuleResourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceType = null;


        try {
            // InternalImplementationDescriptionParser.g:2562:53: (iv_ruleResourceType= ruleResourceType EOF )
            // InternalImplementationDescriptionParser.g:2563:2: iv_ruleResourceType= ruleResourceType EOF
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
    // InternalImplementationDescriptionParser.g:2569:1: ruleResourceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResourceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2575:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2576:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2576:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2577:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2577:3: ()
            // InternalImplementationDescriptionParser.g:2578:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getResourceTypeAccess().getResourceTypeAction_0(),
                      current);


            }

            // InternalImplementationDescriptionParser.g:2584:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2585:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2585:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2586:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2607:1: entryRuleLinuxOpertingSystem returns [EObject current=null] : iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF ;
    public final EObject entryRuleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2607:60: (iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2608:2: iv_ruleLinuxOpertingSystem= ruleLinuxOpertingSystem EOF
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
    // InternalImplementationDescriptionParser.g:2614:1: ruleLinuxOpertingSystem returns [EObject current=null] : ( () otherlv_1= LinuxOpertingSystem ) ;
    public final EObject ruleLinuxOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2620:2: ( ( () otherlv_1= LinuxOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2621:2: ( () otherlv_1= LinuxOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2621:2: ( () otherlv_1= LinuxOpertingSystem )
            // InternalImplementationDescriptionParser.g:2622:3: () otherlv_1= LinuxOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2622:3: ()
            // InternalImplementationDescriptionParser.g:2623:4:
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
    // InternalImplementationDescriptionParser.g:2637:1: entryRuleMacOSOpertingSystem returns [EObject current=null] : iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF ;
    public final EObject entryRuleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystem = null;


        try {
            // InternalImplementationDescriptionParser.g:2637:60: (iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF )
            // InternalImplementationDescriptionParser.g:2638:2: iv_ruleMacOSOpertingSystem= ruleMacOSOpertingSystem EOF
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
    // InternalImplementationDescriptionParser.g:2644:1: ruleMacOSOpertingSystem returns [EObject current=null] : ( () otherlv_1= MacOSOpertingSystem ) ;
    public final EObject ruleMacOSOpertingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2650:2: ( ( () otherlv_1= MacOSOpertingSystem ) )
            // InternalImplementationDescriptionParser.g:2651:2: ( () otherlv_1= MacOSOpertingSystem )
            {
            // InternalImplementationDescriptionParser.g:2651:2: ( () otherlv_1= MacOSOpertingSystem )
            // InternalImplementationDescriptionParser.g:2652:3: () otherlv_1= MacOSOpertingSystem
            {
            // InternalImplementationDescriptionParser.g:2652:3: ()
            // InternalImplementationDescriptionParser.g:2653:4:
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
    // InternalImplementationDescriptionParser.g:2667:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2667:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2668:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2674:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2680:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalImplementationDescriptionParser.g:2681:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalImplementationDescriptionParser.g:2681:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalImplementationDescriptionParser.g:2682:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalImplementationDescriptionParser.g:2682:3: ()
            // InternalImplementationDescriptionParser.g:2683:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
                      current);


            }

            // InternalImplementationDescriptionParser.g:2689:3: ( (lv_name_1_0= ruleEString ) )
            // InternalImplementationDescriptionParser.g:2690:4: (lv_name_1_0= ruleEString )
            {
            // InternalImplementationDescriptionParser.g:2690:4: (lv_name_1_0= ruleEString )
            // InternalImplementationDescriptionParser.g:2691:5: lv_name_1_0= ruleEString
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
    // InternalImplementationDescriptionParser.g:2712:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2712:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2713:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2719:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2725:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalImplementationDescriptionParser.g:2726:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalImplementationDescriptionParser.g:2726:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Ethernet) ) {
                alt41=1;
            }
            else if ( (LA41_0==Wlan) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:2727:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalImplementationDescriptionParser.g:2736:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalImplementationDescriptionParser.g:2748:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2748:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2749:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2755:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2761:2: ( ( () otherlv_1= Ethernet ) )
            // InternalImplementationDescriptionParser.g:2762:2: ( () otherlv_1= Ethernet )
            {
            // InternalImplementationDescriptionParser.g:2762:2: ( () otherlv_1= Ethernet )
            // InternalImplementationDescriptionParser.g:2763:3: () otherlv_1= Ethernet
            {
            // InternalImplementationDescriptionParser.g:2763:3: ()
            // InternalImplementationDescriptionParser.g:2764:4:
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
    // InternalImplementationDescriptionParser.g:2778:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalImplementationDescriptionParser.g:2778:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalImplementationDescriptionParser.g:2779:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalImplementationDescriptionParser.g:2785:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2791:2: ( ( () otherlv_1= Wlan ) )
            // InternalImplementationDescriptionParser.g:2792:2: ( () otherlv_1= Wlan )
            {
            // InternalImplementationDescriptionParser.g:2792:2: ( () otherlv_1= Wlan )
            // InternalImplementationDescriptionParser.g:2793:3: () otherlv_1= Wlan
            {
            // InternalImplementationDescriptionParser.g:2793:3: ()
            // InternalImplementationDescriptionParser.g:2794:4:
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
    // InternalImplementationDescriptionParser.g:2808:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2808:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalImplementationDescriptionParser.g:2809:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalImplementationDescriptionParser.g:2815:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2821:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalImplementationDescriptionParser.g:2822:2: ( () otherlv_1= AttributeKind )
            {
            // InternalImplementationDescriptionParser.g:2822:2: ( () otherlv_1= AttributeKind )
            // InternalImplementationDescriptionParser.g:2823:3: () otherlv_1= AttributeKind
            {
            // InternalImplementationDescriptionParser.g:2823:3: ()
            // InternalImplementationDescriptionParser.g:2824:4:
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
    // InternalImplementationDescriptionParser.g:2838:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2838:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalImplementationDescriptionParser.g:2839:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalImplementationDescriptionParser.g:2845:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2851:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalImplementationDescriptionParser.g:2852:2: ( () otherlv_1= MaximumKind )
            {
            // InternalImplementationDescriptionParser.g:2852:2: ( () otherlv_1= MaximumKind )
            // InternalImplementationDescriptionParser.g:2853:3: () otherlv_1= MaximumKind
            {
            // InternalImplementationDescriptionParser.g:2853:3: ()
            // InternalImplementationDescriptionParser.g:2854:4:
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
    // InternalImplementationDescriptionParser.g:2868:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2868:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalImplementationDescriptionParser.g:2869:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalImplementationDescriptionParser.g:2875:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2881:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalImplementationDescriptionParser.g:2882:2: ( () otherlv_1= MinimumKind )
            {
            // InternalImplementationDescriptionParser.g:2882:2: ( () otherlv_1= MinimumKind )
            // InternalImplementationDescriptionParser.g:2883:3: () otherlv_1= MinimumKind
            {
            // InternalImplementationDescriptionParser.g:2883:3: ()
            // InternalImplementationDescriptionParser.g:2884:4:
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
    // InternalImplementationDescriptionParser.g:2898:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2898:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalImplementationDescriptionParser.g:2899:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalImplementationDescriptionParser.g:2905:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2911:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalImplementationDescriptionParser.g:2912:2: ( () otherlv_1= SelectionKind )
            {
            // InternalImplementationDescriptionParser.g:2912:2: ( () otherlv_1= SelectionKind )
            // InternalImplementationDescriptionParser.g:2913:3: () otherlv_1= SelectionKind
            {
            // InternalImplementationDescriptionParser.g:2913:3: ()
            // InternalImplementationDescriptionParser.g:2914:4:
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
    // InternalImplementationDescriptionParser.g:2928:1: entryRuleRangeKind returns [EObject current=null] : iv_ruleRangeKind= ruleRangeKind EOF ;
    public final EObject entryRuleRangeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeKind = null;


        try {
            // InternalImplementationDescriptionParser.g:2928:50: (iv_ruleRangeKind= ruleRangeKind EOF )
            // InternalImplementationDescriptionParser.g:2929:2: iv_ruleRangeKind= ruleRangeKind EOF
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
    // InternalImplementationDescriptionParser.g:2935:1: ruleRangeKind returns [EObject current=null] : ( () otherlv_1= RangeKind ) ;
    public final EObject ruleRangeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2941:2: ( ( () otherlv_1= RangeKind ) )
            // InternalImplementationDescriptionParser.g:2942:2: ( () otherlv_1= RangeKind )
            {
            // InternalImplementationDescriptionParser.g:2942:2: ( () otherlv_1= RangeKind )
            // InternalImplementationDescriptionParser.g:2943:3: () otherlv_1= RangeKind
            {
            // InternalImplementationDescriptionParser.g:2943:3: ()
            // InternalImplementationDescriptionParser.g:2944:4:
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
    // InternalImplementationDescriptionParser.g:2958:1: entryRuleLinuxDistributionValue returns [EObject current=null] : iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF ;
    public final EObject entryRuleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxDistributionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:2958:63: (iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF )
            // InternalImplementationDescriptionParser.g:2959:2: iv_ruleLinuxDistributionValue= ruleLinuxDistributionValue EOF
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
    // InternalImplementationDescriptionParser.g:2965:1: ruleLinuxDistributionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) ;
    public final EObject ruleLinuxDistributionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:2971:2: ( ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) ) )
            // InternalImplementationDescriptionParser.g:2972:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            {
            // InternalImplementationDescriptionParser.g:2972:2: ( () ( (lv_value_1_0= ruleLinuxDistribution ) ) )
            // InternalImplementationDescriptionParser.g:2973:3: () ( (lv_value_1_0= ruleLinuxDistribution ) )
            {
            // InternalImplementationDescriptionParser.g:2973:3: ()
            // InternalImplementationDescriptionParser.g:2974:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getLinuxDistributionValueAccess().getLinuxDistributionValueAction_0(),
                      current);


            }

            // InternalImplementationDescriptionParser.g:2980:3: ( (lv_value_1_0= ruleLinuxDistribution ) )
            // InternalImplementationDescriptionParser.g:2981:4: (lv_value_1_0= ruleLinuxDistribution )
            {
            // InternalImplementationDescriptionParser.g:2981:4: (lv_value_1_0= ruleLinuxDistribution )
            // InternalImplementationDescriptionParser.g:2982:5: lv_value_1_0= ruleLinuxDistribution
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
    // InternalImplementationDescriptionParser.g:3003:1: entryRuleUbuntuVersionValue returns [EObject current=null] : iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF ;
    public final EObject entryRuleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUbuntuVersionValue = null;


        try {
            // InternalImplementationDescriptionParser.g:3003:59: (iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF )
            // InternalImplementationDescriptionParser.g:3004:2: iv_ruleUbuntuVersionValue= ruleUbuntuVersionValue EOF
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
    // InternalImplementationDescriptionParser.g:3010:1: ruleUbuntuVersionValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) ;
    public final EObject ruleUbuntuVersionValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_1_0 = null;



          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3016:2: ( ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) ) )
            // InternalImplementationDescriptionParser.g:3017:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            {
            // InternalImplementationDescriptionParser.g:3017:2: ( () ( (lv_value_1_0= ruleUbuntuVersion ) ) )
            // InternalImplementationDescriptionParser.g:3018:3: () ( (lv_value_1_0= ruleUbuntuVersion ) )
            {
            // InternalImplementationDescriptionParser.g:3018:3: ()
            // InternalImplementationDescriptionParser.g:3019:4:
            {

                    current = forceCreateModelElement(
                      grammarAccess.getUbuntuVersionValueAccess().getUbuntuVersionValueAction_0(),
                      current);


            }

            // InternalImplementationDescriptionParser.g:3025:3: ( (lv_value_1_0= ruleUbuntuVersion ) )
            // InternalImplementationDescriptionParser.g:3026:4: (lv_value_1_0= ruleUbuntuVersion )
            {
            // InternalImplementationDescriptionParser.g:3026:4: (lv_value_1_0= ruleUbuntuVersion )
            // InternalImplementationDescriptionParser.g:3027:5: lv_value_1_0= ruleUbuntuVersion
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
    // InternalImplementationDescriptionParser.g:3048:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalImplementationDescriptionParser.g:3048:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalImplementationDescriptionParser.g:3049:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalImplementationDescriptionParser.g:3055:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3061:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalImplementationDescriptionParser.g:3062:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalImplementationDescriptionParser.g:3072:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalImplementationDescriptionParser.g:3072:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalImplementationDescriptionParser.g:3073:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalImplementationDescriptionParser.g:3079:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3085:2: (this_DECINT_0= RULE_DECINT )
            // InternalImplementationDescriptionParser.g:3086:2: this_DECINT_0= RULE_DECINT
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
    // InternalImplementationDescriptionParser.g:3096:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalImplementationDescriptionParser.g:3096:47: (iv_ruleEString= ruleEString EOF )
            // InternalImplementationDescriptionParser.g:3097:2: iv_ruleEString= ruleEString EOF
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
    // InternalImplementationDescriptionParser.g:3103:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3109:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalImplementationDescriptionParser.g:3110:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalImplementationDescriptionParser.g:3110:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:3111:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                          current.merge(this_STRING_0);


                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:3119:3: this_ID_1= RULE_ID
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
    // InternalImplementationDescriptionParser.g:3130:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:3132:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalImplementationDescriptionParser.g:3133:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalImplementationDescriptionParser.g:3142:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


          enterRule();
          HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalImplementationDescriptionParser.g:3149:2: (kw= HyphenMinus )
            // InternalImplementationDescriptionParser.g:3150:2: kw= HyphenMinus
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
    // InternalImplementationDescriptionParser.g:3161:1: ruleProcessorArchitectureType returns [Enumerator current=null] : ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) ;
    public final Enumerator ruleProcessorArchitectureType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3167:2: ( ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) ) )
            // InternalImplementationDescriptionParser.g:3168:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            {
            // InternalImplementationDescriptionParser.g:3168:2: ( (enumLiteral_0= X86 ) | (enumLiteral_1= Arm64 ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==X86) ) {
                alt43=1;
            }
            else if ( (LA43_0==Arm64) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:3169:3: (enumLiteral_0= X86 )
                    {
                    // InternalImplementationDescriptionParser.g:3169:3: (enumLiteral_0= X86 )
                    // InternalImplementationDescriptionParser.g:3170:4: enumLiteral_0= X86
                    {
                    enumLiteral_0=(Token)match(input,X86,FOLLOW_2);

                            current = grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProcessorArchitectureTypeAccess().getX86EnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:3177:3: (enumLiteral_1= Arm64 )
                    {
                    // InternalImplementationDescriptionParser.g:3177:3: (enumLiteral_1= Arm64 )
                    // InternalImplementationDescriptionParser.g:3178:4: enumLiteral_1= Arm64
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
    // InternalImplementationDescriptionParser.g:3188:1: ruleLinuxDistribution returns [Enumerator current=null] : ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) ;
    public final Enumerator ruleLinuxDistribution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3194:2: ( ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) ) )
            // InternalImplementationDescriptionParser.g:3195:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            {
            // InternalImplementationDescriptionParser.g:3195:2: ( (enumLiteral_0= Ubuntu ) | (enumLiteral_1= Debian ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Ubuntu) ) {
                alt44=1;
            }
            else if ( (LA44_0==Debian) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:3196:3: (enumLiteral_0= Ubuntu )
                    {
                    // InternalImplementationDescriptionParser.g:3196:3: (enumLiteral_0= Ubuntu )
                    // InternalImplementationDescriptionParser.g:3197:4: enumLiteral_0= Ubuntu
                    {
                    enumLiteral_0=(Token)match(input,Ubuntu,FOLLOW_2);

                            current = grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinuxDistributionAccess().getUbuntuEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:3204:3: (enumLiteral_1= Debian )
                    {
                    // InternalImplementationDescriptionParser.g:3204:3: (enumLiteral_1= Debian )
                    // InternalImplementationDescriptionParser.g:3205:4: enumLiteral_1= Debian
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
    // InternalImplementationDescriptionParser.g:3215:1: ruleUbuntuVersion returns [Enumerator current=null] : ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) ;
    public final Enumerator ruleUbuntuVersion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


          enterRule();

        try {
            // InternalImplementationDescriptionParser.g:3221:2: ( ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) ) )
            // InternalImplementationDescriptionParser.g:3222:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            {
            // InternalImplementationDescriptionParser.g:3222:2: ( (enumLiteral_0= Focal ) | (enumLiteral_1= Jammy ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Focal) ) {
                alt45=1;
            }
            else if ( (LA45_0==Jammy) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalImplementationDescriptionParser.g:3223:3: (enumLiteral_0= Focal )
                    {
                    // InternalImplementationDescriptionParser.g:3223:3: (enumLiteral_0= Focal )
                    // InternalImplementationDescriptionParser.g:3224:4: enumLiteral_0= Focal
                    {
                    enumLiteral_0=(Token)match(input,Focal,FOLLOW_2);

                            current = grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUbuntuVersionAccess().getFocalEnumLiteralDeclaration_0());


                    }


                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionParser.g:3231:3: (enumLiteral_1= Jammy )
                    {
                    // InternalImplementationDescriptionParser.g:3231:3: (enumLiteral_1= Jammy )
                    // InternalImplementationDescriptionParser.g:3232:4: enumLiteral_1= Jammy
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


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\51\1\41\1\60\2\56\1\40\1\14\5\uffff";
    static final String dfa_3s = "\1\51\1\41\1\62\2\56\1\40\1\25\5\uffff";
    static final String dfa_4s = "\7\uffff\1\4\1\3\1\2\1\5\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\13\1\7\1\uffff\1\11\1\10\4\uffff\1\12",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1339:2: (this_PropertyAttribute_0= rulePropertyAttribute | this_PropertyMaximun_1= rulePropertyMaximun | this_PropertyMinimum_2= rulePropertyMinimum | this_PropertySelection_3= rulePropertySelection | this_PropertyRange_4= rulePropertyRange )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000410L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800010004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00055900EC000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800010004002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});

}
