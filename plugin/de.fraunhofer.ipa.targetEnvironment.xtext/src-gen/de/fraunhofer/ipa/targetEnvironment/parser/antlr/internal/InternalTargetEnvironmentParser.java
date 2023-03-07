package de.fraunhofer.ipa.targetEnvironment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetEnvironmentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arm64ProcessorArchitecture", "X86ProcessorArchitecture", "CommunicationConnection", "TargetDeployEnviroment", "ComputationDeviceType", "RefConnectionProperty", "ProcessorArchitecture", "ConfigConnection", "Configuration", "ConnectDevice", "IncludeDevice", "RefConnection", "RefDeviceType", "AttributeKind", "SelectionKind", "DeviceType", "MaximumKind", "MinimumKind", "Capability", "Properties", "RefDevice", "Interface", "Ethernet", "Address", "Value", "Linux", "MacOS", "Kind", "Name", "Type", "Wlan", "HyphenMinus", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_SL_COMMENT", "RULE_INDENT", "RULE_DEDENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_DAY=41;
    public static final int Configuration=12;
    public static final int Address=27;
    public static final int RULE_DATE_TIME=46;
    public static final int RULE_BOOLEAN=38;
    public static final int AttributeKind=17;
    public static final int RULE_YEAR=43;
    public static final int RefDeviceType=16;
    public static final int Name=32;
    public static final int RULE_MIN_SEC=45;
    public static final int Kind=31;
    public static final int ConnectDevice=13;
    public static final int RULE_DEDENT=49;
    public static final int Capability=22;
    public static final int RULE_ID=50;
    public static final int ConfigConnection=11;
    public static final int RULE_DIGIT=36;
    public static final int SelectionKind=18;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=19;
    public static final int TargetDeployEnviroment=7;
    public static final int Linux=29;
    public static final int RULE_INT=51;
    public static final int Ethernet=26;
    public static final int Value=28;
    public static final int RULE_ML_COMMENT=53;
    public static final int MacOS=30;
    public static final int RefConnectionProperty=9;
    public static final int ProcessorArchitecture=10;
    public static final int RULE_STRING=52;
    public static final int Wlan=34;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=47;
    public static final int CommunicationConnection=6;
    public static final int HyphenMinus=35;
    public static final int RULE_DOUBLE=40;
    public static final int RULE_DECINT=39;
    public static final int MinimumKind=21;
    public static final int EOF=-1;
    public static final int RULE_INDENT=48;
    public static final int RULE_HOUR=44;
    public static final int RefDevice=24;
    public static final int RULE_WS=54;
    public static final int MaximumKind=20;
    public static final int RULE_ANY_OTHER=55;
    public static final int ComputationDeviceType=8;
    public static final int RefConnection=15;
    public static final int Type=33;
    public static final int X86ProcessorArchitecture=5;
    public static final int RULE_MONTH=42;
    public static final int RULE_BINARY=37;
    public static final int IncludeDevice=14;
    public static final int Interface=25;

    // delegates
    // delegators


        public InternalTargetEnvironmentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetEnvironmentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTargetEnvironmentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTargetEnvironmentParser.g"; }



     	private TargetEnvironmentGrammarAccess grammarAccess;

        public InternalTargetEnvironmentParser(TokenStream input, TargetEnvironmentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TargetEnvironment";
       	}

       	@Override
       	protected TargetEnvironmentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:57:1: entryRuleTargetEnvironment returns [EObject current=null] : iv_ruleTargetEnvironment= ruleTargetEnvironment EOF ;
    public final EObject entryRuleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetEnvironment = null;


        try {
            // InternalTargetEnvironmentParser.g:57:58: (iv_ruleTargetEnvironment= ruleTargetEnvironment EOF )
            // InternalTargetEnvironmentParser.g:58:2: iv_ruleTargetEnvironment= ruleTargetEnvironment EOF
            {
             newCompositeNode(grammarAccess.getTargetEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetEnvironment=ruleTargetEnvironment();

            state._fsp--;

             current =iv_ruleTargetEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetEnvironment"


    // $ANTLR start "ruleTargetEnvironment"
    // InternalTargetEnvironmentParser.g:64:1: ruleTargetEnvironment returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDescription ) ) ) ;
    public final EObject ruleTargetEnvironment() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:70:2: ( ( () ( (lv_type_1_0= ruleDescription ) ) ) )
            // InternalTargetEnvironmentParser.g:71:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            {
            // InternalTargetEnvironmentParser.g:71:2: ( () ( (lv_type_1_0= ruleDescription ) ) )
            // InternalTargetEnvironmentParser.g:72:3: () ( (lv_type_1_0= ruleDescription ) )
            {
            // InternalTargetEnvironmentParser.g:72:3: ()
            // InternalTargetEnvironmentParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetEnvironmentAccess().getTargetEnvironmentAction_0(),
            					current);
            			

            }

            // InternalTargetEnvironmentParser.g:79:3: ( (lv_type_1_0= ruleDescription ) )
            // InternalTargetEnvironmentParser.g:80:4: (lv_type_1_0= ruleDescription )
            {
            // InternalTargetEnvironmentParser.g:80:4: (lv_type_1_0= ruleDescription )
            // InternalTargetEnvironmentParser.g:81:5: lv_type_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getTargetEnvironmentAccess().getTypeDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetEnvironmentRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Description");
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
    // $ANTLR end "ruleTargetEnvironment"


    // $ANTLR start "entryRuleDescription"
    // InternalTargetEnvironmentParser.g:102:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalTargetEnvironmentParser.g:102:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalTargetEnvironmentParser.g:103:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalTargetEnvironmentParser.g:109:1: ruleDescription returns [EObject current=null] : (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceSet_0 = null;

        EObject this_TargetDeployEnviroment_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:115:2: ( (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment ) )
            // InternalTargetEnvironmentParser.g:116:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
            {
            // InternalTargetEnvironmentParser.g:116:2: (this_DeviceSet_0= ruleDeviceSet | this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||LA1_0==ComputationDeviceType||LA1_0==DeviceType) ) {
                alt1=1;
            }
            else if ( (LA1_0==TargetDeployEnviroment) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:117:3: this_DeviceSet_0= ruleDeviceSet
                    {

                    			newCompositeNode(grammarAccess.getDescriptionAccess().getDeviceSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeviceSet_0=ruleDeviceSet();

                    state._fsp--;


                    			current = this_DeviceSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:126:3: this_TargetDeployEnviroment_1= ruleTargetDeployEnviroment
                    {

                    			newCompositeNode(grammarAccess.getDescriptionAccess().getTargetDeployEnviromentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TargetDeployEnviroment_1=ruleTargetDeployEnviroment();

                    state._fsp--;


                    			current = this_TargetDeployEnviroment_1;
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:138:1: entryRuleTargetDeployEnviroment returns [EObject current=null] : iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF ;
    public final EObject entryRuleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDeployEnviroment = null;


        try {
            // InternalTargetEnvironmentParser.g:138:63: (iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironmentParser.g:139:2: iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF
            {
             newCompositeNode(grammarAccess.getTargetDeployEnviromentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetDeployEnviroment=ruleTargetDeployEnviroment();

            state._fsp--;

             current =iv_ruleTargetDeployEnviroment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetDeployEnviroment"


    // $ANTLR start "ruleTargetDeployEnviroment"
    // InternalTargetEnvironmentParser.g:145:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_INDENT_6=null;
        Token this_DEDENT_8=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_12=null;
        Token this_DEDENT_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_includeDevice_7_0 = null;

        EObject lv_configConnection_11_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:151:2: ( ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:152:2: ( () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:153:3: () otherlv_1= TargetDeployEnviroment this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:153:3: ()
            // InternalTargetEnvironmentParser.g:154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,TargetDeployEnviroment,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_2, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTargetDeployEnviromentAccess().getNameKeyword_3());
            		
            // InternalTargetEnvironmentParser.g:172:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:173:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:173:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:174:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:191:3: (otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IncludeDevice) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:192:4: otherlv_5= IncludeDevice this_INDENT_6= RULE_INDENT ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,IncludeDevice,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_5_0());
                    			
                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_6, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalTargetEnvironmentParser.g:200:4: ( (lv_includeDevice_7_0= ruleDeviceInstance ) )+
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
                    	    // InternalTargetEnvironmentParser.g:201:5: (lv_includeDevice_7_0= ruleDeviceInstance )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:201:5: (lv_includeDevice_7_0= ruleDeviceInstance )
                    	    // InternalTargetEnvironmentParser.g:202:6: lv_includeDevice_7_0= ruleDeviceInstance
                    	    {

                    	    						newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_includeDevice_7_0=ruleDeviceInstance();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"includeDevice",
                    	    							lv_includeDevice_7_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_9); 

                    				newLeafNode(this_DEDENT_8, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:224:3: (otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ConfigConnection) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:225:4: otherlv_9= ConfigConnection this_INDENT_10= RULE_INDENT ( (lv_configConnection_11_0= ruleConfigConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,ConfigConnection,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_6_0());
                    			
                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_10, grammarAccess.getTargetDeployEnviromentAccess().getINDENTTerminalRuleCall_6_1());
                    			
                    // InternalTargetEnvironmentParser.g:233:4: ( (lv_configConnection_11_0= ruleConfigConnection ) )+
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
                    	    // InternalTargetEnvironmentParser.g:234:5: (lv_configConnection_11_0= ruleConfigConnection )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:234:5: (lv_configConnection_11_0= ruleConfigConnection )
                    	    // InternalTargetEnvironmentParser.g:235:6: lv_configConnection_11_0= ruleConfigConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_configConnection_11_0=ruleConfigConnection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"configConnection",
                    	    							lv_configConnection_11_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
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

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

                    				newLeafNode(this_DEDENT_12, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_13, grammarAccess.getTargetDeployEnviromentAccess().getDEDENTTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetDeployEnviroment"


    // $ANTLR start "entryRuleDeviceInstance"
    // InternalTargetEnvironmentParser.g:265:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironmentParser.g:265:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironmentParser.g:266:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
            {
             newCompositeNode(grammarAccess.getDeviceInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceInstance=ruleDeviceInstance();

            state._fsp--;

             current =iv_ruleDeviceInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceInstance"


    // $ANTLR start "ruleDeviceInstance"
    // InternalTargetEnvironmentParser.g:272:1: ruleDeviceInstance returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) ;
    public final EObject ruleDeviceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_DEDENT_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:278:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:279:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:279:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:280:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefDeviceType ( ( ruleEString ) ) this_DEDENT_6= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getDeviceInstanceAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceInstanceAccess().getNameKeyword_1());
            		
            // InternalTargetEnvironmentParser.g:291:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:292:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:292:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:293:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_11); 

            			newLeafNode(this_INDENT_3, grammarAccess.getDeviceInstanceAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,RefDeviceType,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_4());
            		
            // InternalTargetEnvironmentParser.g:318:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:319:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:319:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:320:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_DEDENT_6=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_6, grammarAccess.getDeviceInstanceAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceInstance"


    // $ANTLR start "entryRuleConfigConnection"
    // InternalTargetEnvironmentParser.g:342:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:342:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironmentParser.g:343:2: iv_ruleConfigConnection= ruleConfigConnection EOF
            {
             newCompositeNode(grammarAccess.getConfigConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnection=ruleConfigConnection();

            state._fsp--;

             current =iv_ruleConfigConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigConnection"


    // $ANTLR start "ruleConfigConnection"
    // InternalTargetEnvironmentParser.g:349:1: ruleConfigConnection returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) ;
    public final EObject ruleConfigConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token this_DEDENT_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_connectDevice_6_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:355:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:356:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:356:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:357:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= ConnectDevice this_INDENT_5= RULE_INDENT ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+ this_DEDENT_7= RULE_DEDENT this_DEDENT_8= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getConfigConnectionAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigConnectionAccess().getNameKeyword_1());
            		
            // InternalTargetEnvironmentParser.g:368:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:369:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:369:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:370:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_12); 

            			newLeafNode(this_INDENT_3, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,ConnectDevice,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_4());
            		
            this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_7); 

            			newLeafNode(this_INDENT_5, grammarAccess.getConfigConnectionAccess().getINDENTTerminalRuleCall_5());
            		
            // InternalTargetEnvironmentParser.g:399:3: ( (lv_connectDevice_6_0= ruleConnectedDevice ) )+
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
            	    // InternalTargetEnvironmentParser.g:400:4: (lv_connectDevice_6_0= ruleConnectedDevice )
            	    {
            	    // InternalTargetEnvironmentParser.g:400:4: (lv_connectDevice_6_0= ruleConnectedDevice )
            	    // InternalTargetEnvironmentParser.g:401:5: lv_connectDevice_6_0= ruleConnectedDevice
            	    {

            	    					newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_connectDevice_6_0=ruleConnectedDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectDevice",
            	    						lv_connectDevice_6_0,
            	    						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
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

            this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

            			newLeafNode(this_DEDENT_7, grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_7());
            		
            this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_8, grammarAccess.getConfigConnectionAccess().getDEDENTTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigConnection"


    // $ANTLR start "entryRuleConnectedDevice"
    // InternalTargetEnvironmentParser.g:430:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironmentParser.g:430:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironmentParser.g:431:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
            {
             newCompositeNode(grammarAccess.getConnectedDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectedDevice=ruleConnectedDevice();

            state._fsp--;

             current =iv_ruleConnectedDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectedDevice"


    // $ANTLR start "ruleConnectedDevice"
    // InternalTargetEnvironmentParser.g:437:1: ruleConnectedDevice returns [EObject current=null] : ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleConnectedDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INDENT_7=null;
        Token this_DEDENT_9=null;
        Token this_DEDENT_10=null;
        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:443:2: ( ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:444:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:444:2: ( rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:445:3: rulePreListElement otherlv_1= RefDevice ( ( ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= RefConnection ( ( ruleEString ) ) (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,RefDevice,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_1());
            		
            // InternalTargetEnvironmentParser.g:456:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:457:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:457:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:458:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectedDeviceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_2_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_14); 

            			newLeafNode(this_INDENT_3, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,RefConnection,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4());
            		
            // InternalTargetEnvironmentParser.g:480:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:481:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:481:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectedDeviceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefConnectionCommunicationConnectionCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:496:3: (otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Configuration) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:497:4: otherlv_6= Configuration this_INDENT_7= RULE_INDENT ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+ this_DEDENT_9= RULE_DEDENT
                    {
                    otherlv_6=(Token)match(input,Configuration,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getConfigurationKeyword_6_0());
                    			
                    this_INDENT_7=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_7, grammarAccess.getConnectedDeviceAccess().getINDENTTerminalRuleCall_6_1());
                    			
                    // InternalTargetEnvironmentParser.g:505:4: ( (lv_properties_8_0= ruleConfigConnectionProperty ) )+
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
                    	    // InternalTargetEnvironmentParser.g:506:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:506:5: (lv_properties_8_0= ruleConfigConnectionProperty )
                    	    // InternalTargetEnvironmentParser.g:507:6: lv_properties_8_0= ruleConfigConnectionProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesConfigConnectionPropertyParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_properties_8_0=ruleConfigConnectionProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_8_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnectionProperty");
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

                    				newLeafNode(this_DEDENT_9, grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_10, grammarAccess.getConnectedDeviceAccess().getDEDENTTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectedDevice"


    // $ANTLR start "entryRuleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:537:1: entryRuleConfigConnectionProperty returns [EObject current=null] : iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF ;
    public final EObject entryRuleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:537:65: (iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:538:2: iv_ruleConfigConnectionProperty= ruleConfigConnectionProperty EOF
            {
             newCompositeNode(grammarAccess.getConfigConnectionPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigConnectionProperty=ruleConfigConnectionProperty();

            state._fsp--;

             current =iv_ruleConfigConnectionProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigConnectionProperty"


    // $ANTLR start "ruleConfigConnectionProperty"
    // InternalTargetEnvironmentParser.g:544:1: ruleConfigConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleConfigConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:550:2: ( ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:551:2: ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:551:2: ( () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:552:3: () rulePreListElement otherlv_2= RefConnectionProperty ( ( ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:552:3: ()
            // InternalTargetEnvironmentParser.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigConnectionPropertyAccess().getConfigConnectionPropertyAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_16);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,RefConnectionProperty,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyKeyword_2());
            		
            // InternalTargetEnvironmentParser.g:570:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:571:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:571:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:572:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigConnectionPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getRefConnectionPropertyConnectionPropertyCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:586:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INDENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:587:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getConfigConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConfigConnectionPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalTargetEnvironmentParser.g:595:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:596:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:596:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:597:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getConfigConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigConnectionPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.deployment.Util.PropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getConfigConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleConfigConnectionProperty"


    // $ANTLR start "entryRuleDeviceSet"
    // InternalTargetEnvironmentParser.g:623:1: entryRuleDeviceSet returns [EObject current=null] : iv_ruleDeviceSet= ruleDeviceSet EOF ;
    public final EObject entryRuleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceSet = null;


        try {
            // InternalTargetEnvironmentParser.g:623:50: (iv_ruleDeviceSet= ruleDeviceSet EOF )
            // InternalTargetEnvironmentParser.g:624:2: iv_ruleDeviceSet= ruleDeviceSet EOF
            {
             newCompositeNode(grammarAccess.getDeviceSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceSet=ruleDeviceSet();

            state._fsp--;

             current =iv_ruleDeviceSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceSet"


    // $ANTLR start "ruleDeviceSet"
    // InternalTargetEnvironmentParser.g:630:1: ruleDeviceSet returns [EObject current=null] : ( (lv_device_0_0= ruleDeviceType ) )* ;
    public final EObject ruleDeviceSet() throws RecognitionException {
        EObject current = null;

        EObject lv_device_0_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:636:2: ( ( (lv_device_0_0= ruleDeviceType ) )* )
            // InternalTargetEnvironmentParser.g:637:2: ( (lv_device_0_0= ruleDeviceType ) )*
            {
            // InternalTargetEnvironmentParser.g:637:2: ( (lv_device_0_0= ruleDeviceType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ComputationDeviceType||LA10_0==DeviceType) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTargetEnvironmentParser.g:638:3: (lv_device_0_0= ruleDeviceType )
            	    {
            	    // InternalTargetEnvironmentParser.g:638:3: (lv_device_0_0= ruleDeviceType )
            	    // InternalTargetEnvironmentParser.g:639:4: lv_device_0_0= ruleDeviceType
            	    {

            	    				newCompositeNode(grammarAccess.getDeviceSetAccess().getDeviceDeviceTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    lv_device_0_0=ruleDeviceType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDeviceSetRule());
            	    				}
            	    				add(
            	    					current,
            	    					"device",
            	    					lv_device_0_0,
            	    					"de.fraunhofer.ipa.targetEnvironment.Device.DeviceType");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceSet"


    // $ANTLR start "entryRuleCapabilityKind"
    // InternalTargetEnvironmentParser.g:659:1: entryRuleCapabilityKind returns [EObject current=null] : iv_ruleCapabilityKind= ruleCapabilityKind EOF ;
    public final EObject entryRuleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityKind = null;


        try {
            // InternalTargetEnvironmentParser.g:659:55: (iv_ruleCapabilityKind= ruleCapabilityKind EOF )
            // InternalTargetEnvironmentParser.g:660:2: iv_ruleCapabilityKind= ruleCapabilityKind EOF
            {
             newCompositeNode(grammarAccess.getCapabilityKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityKind=ruleCapabilityKind();

            state._fsp--;

             current =iv_ruleCapabilityKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapabilityKind"


    // $ANTLR start "ruleCapabilityKind"
    // InternalTargetEnvironmentParser.g:666:1: ruleCapabilityKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) ;
    public final EObject ruleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_SelectionKind_3 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:672:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) )
            // InternalTargetEnvironmentParser.g:673:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            {
            // InternalTargetEnvironmentParser.g:673:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            int alt11=4;
            switch ( input.LA(1) ) {
            case AttributeKind:
                {
                alt11=1;
                }
                break;
            case MaximumKind:
                {
                alt11=2;
                }
                break;
            case MinimumKind:
                {
                alt11=3;
                }
                break;
            case SelectionKind:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:674:3: this_AttributeKind_0= ruleAttributeKind
                    {

                    			newCompositeNode(grammarAccess.getCapabilityKindAccess().getAttributeKindParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeKind_0=ruleAttributeKind();

                    state._fsp--;


                    			current = this_AttributeKind_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:683:3: this_MaximumKind_1= ruleMaximumKind
                    {

                    			newCompositeNode(grammarAccess.getCapabilityKindAccess().getMaximumKindParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaximumKind_1=ruleMaximumKind();

                    state._fsp--;


                    			current = this_MaximumKind_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTargetEnvironmentParser.g:692:3: this_MinimumKind_2= ruleMinimumKind
                    {

                    			newCompositeNode(grammarAccess.getCapabilityKindAccess().getMinimumKindParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinimumKind_2=ruleMinimumKind();

                    state._fsp--;


                    			current = this_MinimumKind_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTargetEnvironmentParser.g:701:3: this_SelectionKind_3= ruleSelectionKind
                    {

                    			newCompositeNode(grammarAccess.getCapabilityKindAccess().getSelectionKindParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectionKind_3=ruleSelectionKind();

                    state._fsp--;


                    			current = this_SelectionKind_3;
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
    // $ANTLR end "ruleCapabilityKind"


    // $ANTLR start "entryRuleDeviceType"
    // InternalTargetEnvironmentParser.g:713:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:713:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalTargetEnvironmentParser.g:714:2: iv_ruleDeviceType= ruleDeviceType EOF
            {
             newCompositeNode(grammarAccess.getDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType=ruleDeviceType();

            state._fsp--;

             current =iv_ruleDeviceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalTargetEnvironmentParser.g:720:1: ruleDeviceType returns [EObject current=null] : (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject this_DeviceType_Impl_0 = null;

        EObject this_ComputationDeviceType_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:726:2: ( (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType ) )
            // InternalTargetEnvironmentParser.g:727:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            {
            // InternalTargetEnvironmentParser.g:727:2: (this_DeviceType_Impl_0= ruleDeviceType_Impl | this_ComputationDeviceType_1= ruleComputationDeviceType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DeviceType) ) {
                alt12=1;
            }
            else if ( (LA12_0==ComputationDeviceType) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:728:3: this_DeviceType_Impl_0= ruleDeviceType_Impl
                    {

                    			newCompositeNode(grammarAccess.getDeviceTypeAccess().getDeviceType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeviceType_Impl_0=ruleDeviceType_Impl();

                    state._fsp--;


                    			current = this_DeviceType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:737:3: this_ComputationDeviceType_1= ruleComputationDeviceType
                    {

                    			newCompositeNode(grammarAccess.getDeviceTypeAccess().getComputationDeviceTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComputationDeviceType_1=ruleComputationDeviceType();

                    state._fsp--;


                    			current = this_ComputationDeviceType_1;
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
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleAbstractCommunicationConnection"
    // InternalTargetEnvironmentParser.g:749:1: entryRuleAbstractCommunicationConnection returns [EObject current=null] : iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF ;
    public final EObject entryRuleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:749:72: (iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:750:2: iv_ruleAbstractCommunicationConnection= ruleAbstractCommunicationConnection EOF
            {
             newCompositeNode(grammarAccess.getAbstractCommunicationConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCommunicationConnection=ruleAbstractCommunicationConnection();

            state._fsp--;

             current =iv_ruleAbstractCommunicationConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCommunicationConnection"


    // $ANTLR start "ruleAbstractCommunicationConnection"
    // InternalTargetEnvironmentParser.g:756:1: ruleAbstractCommunicationConnection returns [EObject current=null] : (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) ;
    public final EObject ruleAbstractCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject this_CommunicationConnection_0 = null;

        EObject this_NetworkConnection_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:762:2: ( (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection ) )
            // InternalTargetEnvironmentParser.g:763:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            {
            // InternalTargetEnvironmentParser.g:763:2: (this_CommunicationConnection_0= ruleCommunicationConnection | this_NetworkConnection_1= ruleNetworkConnection )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==HyphenMinus) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==Name) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==RULE_INDENT) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==Type) ) {
                                int LA13_6 = input.LA(6);

                                if ( (LA13_6==Ethernet||LA13_6==Wlan) ) {
                                    alt13=2;
                                }
                                else if ( (LA13_6==RULE_ID||LA13_6==RULE_STRING) ) {
                                    alt13=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==RULE_INDENT) ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5==Type) ) {
                                int LA13_6 = input.LA(6);

                                if ( (LA13_6==Ethernet||LA13_6==Wlan) ) {
                                    alt13=2;
                                }
                                else if ( (LA13_6==RULE_ID||LA13_6==RULE_STRING) ) {
                                    alt13=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:764:3: this_CommunicationConnection_0= ruleCommunicationConnection
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getCommunicationConnectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationConnection_0=ruleCommunicationConnection();

                    state._fsp--;


                    			current = this_CommunicationConnection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:773:3: this_NetworkConnection_1= ruleNetworkConnection
                    {

                    			newCompositeNode(grammarAccess.getAbstractCommunicationConnectionAccess().getNetworkConnectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworkConnection_1=ruleNetworkConnection();

                    state._fsp--;


                    			current = this_NetworkConnection_1;
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
    // $ANTLR end "ruleAbstractCommunicationConnection"


    // $ANTLR start "entryRuleAbstractNetworkProperty"
    // InternalTargetEnvironmentParser.g:785:1: entryRuleAbstractNetworkProperty returns [EObject current=null] : iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF ;
    public final EObject entryRuleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:785:64: (iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:786:2: iv_ruleAbstractNetworkProperty= ruleAbstractNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getAbstractNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractNetworkProperty=ruleAbstractNetworkProperty();

            state._fsp--;

             current =iv_ruleAbstractNetworkProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNetworkProperty"


    // $ANTLR start "ruleAbstractNetworkProperty"
    // InternalTargetEnvironmentParser.g:792:1: ruleAbstractNetworkProperty returns [EObject current=null] : (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) ;
    public final EObject ruleAbstractNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceNetworkProperty_0 = null;

        EObject this_AddressNetworkProperty_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:798:2: ( (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty ) )
            // InternalTargetEnvironmentParser.g:799:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            {
            // InternalTargetEnvironmentParser.g:799:2: (this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty | this_AddressNetworkProperty_1= ruleAddressNetworkProperty )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==HyphenMinus) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==Name) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==Address) ) {
                        alt14=2;
                    }
                    else if ( (LA14_2==Interface) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:800:3: this_InterfaceNetworkProperty_0= ruleInterfaceNetworkProperty
                    {

                    			newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getInterfaceNetworkPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterfaceNetworkProperty_0=ruleInterfaceNetworkProperty();

                    state._fsp--;


                    			current = this_InterfaceNetworkProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:809:3: this_AddressNetworkProperty_1= ruleAddressNetworkProperty
                    {

                    			newCompositeNode(grammarAccess.getAbstractNetworkPropertyAccess().getAddressNetworkPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddressNetworkProperty_1=ruleAddressNetworkProperty();

                    state._fsp--;


                    			current = this_AddressNetworkProperty_1;
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
    // $ANTLR end "ruleAbstractNetworkProperty"


    // $ANTLR start "entryRuleInterfaceNetworkProperty"
    // InternalTargetEnvironmentParser.g:821:1: entryRuleInterfaceNetworkProperty returns [EObject current=null] : iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF ;
    public final EObject entryRuleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:821:65: (iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:822:2: iv_ruleInterfaceNetworkProperty= ruleInterfaceNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getInterfaceNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceNetworkProperty=ruleInterfaceNetworkProperty();

            state._fsp--;

             current =iv_ruleInterfaceNetworkProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceNetworkProperty"


    // $ANTLR start "ruleInterfaceNetworkProperty"
    // InternalTargetEnvironmentParser.g:828:1: ruleInterfaceNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleInterfaceNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:834:2: ( ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:835:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:835:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:836:3: () rulePreListElement otherlv_2= Name otherlv_3= Interface (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:836:3: ()
            // InternalTargetEnvironmentParser.g:837:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceNetworkPropertyAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceNetworkPropertyAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,Interface,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceNetworkPropertyAccess().getInterfaceKeyword_3());
            		
            // InternalTargetEnvironmentParser.g:858:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:859:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getInterfaceNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceNetworkPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalTargetEnvironmentParser.g:867:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:868:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:868:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:869:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNetworkPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.deployment.Util.PropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getInterfaceNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleInterfaceNetworkProperty"


    // $ANTLR start "entryRuleAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:895:1: entryRuleAddressNetworkProperty returns [EObject current=null] : iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF ;
    public final EObject entryRuleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressNetworkProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:895:63: (iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF )
            // InternalTargetEnvironmentParser.g:896:2: iv_ruleAddressNetworkProperty= ruleAddressNetworkProperty EOF
            {
             newCompositeNode(grammarAccess.getAddressNetworkPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddressNetworkProperty=ruleAddressNetworkProperty();

            state._fsp--;

             current =iv_ruleAddressNetworkProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressNetworkProperty"


    // $ANTLR start "ruleAddressNetworkProperty"
    // InternalTargetEnvironmentParser.g:902:1: ruleAddressNetworkProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleAddressNetworkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:908:2: ( ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:909:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:909:2: ( () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:910:3: () rulePreListElement otherlv_2= Name otherlv_3= Address (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:910:3: ()
            // InternalTargetEnvironmentParser.g:911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddressNetworkPropertyAccess().getAddressNetworkPropertyAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressNetworkPropertyAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,Address,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAddressNetworkPropertyAccess().getAddressKeyword_3());
            		
            // InternalTargetEnvironmentParser.g:932:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:933:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getAddressNetworkPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddressNetworkPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalTargetEnvironmentParser.g:941:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:942:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:942:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:943:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getAddressNetworkPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressNetworkPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.deployment.Util.PropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getAddressNetworkPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleAddressNetworkProperty"


    // $ANTLR start "entryRuleDeviceType_Impl"
    // InternalTargetEnvironmentParser.g:969:1: entryRuleDeviceType_Impl returns [EObject current=null] : iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF ;
    public final EObject entryRuleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType_Impl = null;


        try {
            // InternalTargetEnvironmentParser.g:969:56: (iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF )
            // InternalTargetEnvironmentParser.g:970:2: iv_ruleDeviceType_Impl= ruleDeviceType_Impl EOF
            {
             newCompositeNode(grammarAccess.getDeviceType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType_Impl=ruleDeviceType_Impl();

            state._fsp--;

             current =iv_ruleDeviceType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceType_Impl"


    // $ANTLR start "ruleDeviceType_Impl"
    // InternalTargetEnvironmentParser.g:976:1: ruleDeviceType_Impl returns [EObject current=null] : ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) ;
    public final EObject ruleDeviceType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_INDENT_6=null;
        Token this_DEDENT_8=null;
        Token otherlv_9=null;
        Token this_INDENT_10=null;
        Token this_DEDENT_12=null;
        Token this_DEDENT_13=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_capability_7_0 = null;

        EObject lv_communicationConnection_11_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:982:2: ( ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:983:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:983:2: ( () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:984:3: () otherlv_1= DeviceType this_INDENT_2= RULE_INDENT otherlv_3= Name ( (lv_name_4_0= ruleEString ) ) (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )? (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )? this_DEDENT_13= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:984:3: ()
            // InternalTargetEnvironmentParser.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceType_ImplAccess().getDeviceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,DeviceType,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceType_ImplAccess().getDeviceTypeKeyword_1());
            		
            this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_2, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceType_ImplAccess().getNameKeyword_3());
            		
            // InternalTargetEnvironmentParser.g:1003:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1004:4: (lv_name_4_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1004:4: (lv_name_4_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1005:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1022:3: (otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Capability) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1023:4: otherlv_5= Capability this_INDENT_6= RULE_INDENT ( (lv_capability_7_0= ruleCapabilityProperty ) )+ this_DEDENT_8= RULE_DEDENT
                    {
                    otherlv_5=(Token)match(input,Capability,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeviceType_ImplAccess().getCapabilityKeyword_5_0());
                    			
                    this_INDENT_6=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_6, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalTargetEnvironmentParser.g:1031:4: ( (lv_capability_7_0= ruleCapabilityProperty ) )+
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
                    	    // InternalTargetEnvironmentParser.g:1032:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1032:5: (lv_capability_7_0= ruleCapabilityProperty )
                    	    // InternalTargetEnvironmentParser.g:1033:6: lv_capability_7_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCapabilityCapabilityPropertyParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_capability_7_0=ruleCapabilityProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"capability",
                    	    							lv_capability_7_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.CapabilityProperty");
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

                    this_DEDENT_8=(Token)match(input,RULE_DEDENT,FOLLOW_24); 

                    				newLeafNode(this_DEDENT_8, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1055:3: (otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CommunicationConnection) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1056:4: otherlv_9= CommunicationConnection this_INDENT_10= RULE_INDENT ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_12= RULE_DEDENT
                    {
                    otherlv_9=(Token)match(input,CommunicationConnection,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionKeyword_6_0());
                    			
                    this_INDENT_10=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_10, grammarAccess.getDeviceType_ImplAccess().getINDENTTerminalRuleCall_6_1());
                    			
                    // InternalTargetEnvironmentParser.g:1064:4: ( (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==HyphenMinus) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalTargetEnvironmentParser.g:1065:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1065:5: (lv_communicationConnection_11_0= ruleAbstractCommunicationConnection )
                    	    // InternalTargetEnvironmentParser.g:1066:6: lv_communicationConnection_11_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeviceType_ImplAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_communicationConnection_11_0=ruleAbstractCommunicationConnection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeviceType_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"communicationConnection",
                    	    							lv_communicationConnection_11_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

                    				newLeafNode(this_DEDENT_12, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            this_DEDENT_13=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_13, grammarAccess.getDeviceType_ImplAccess().getDEDENTTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType_Impl"


    // $ANTLR start "entryRuleComputationDeviceType"
    // InternalTargetEnvironmentParser.g:1096:1: entryRuleComputationDeviceType returns [EObject current=null] : iv_ruleComputationDeviceType= ruleComputationDeviceType EOF ;
    public final EObject entryRuleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationDeviceType = null;


        try {
            // InternalTargetEnvironmentParser.g:1096:62: (iv_ruleComputationDeviceType= ruleComputationDeviceType EOF )
            // InternalTargetEnvironmentParser.g:1097:2: iv_ruleComputationDeviceType= ruleComputationDeviceType EOF
            {
             newCompositeNode(grammarAccess.getComputationDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputationDeviceType=ruleComputationDeviceType();

            state._fsp--;

             current =iv_ruleComputationDeviceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputationDeviceType"


    // $ANTLR start "ruleComputationDeviceType"
    // InternalTargetEnvironmentParser.g:1103:1: ruleComputationDeviceType returns [EObject current=null] : (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) ;
    public final EObject ruleComputationDeviceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INDENT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_INDENT_5=null;
        Token this_DEDENT_7=null;
        Token otherlv_8=null;
        Token this_INDENT_9=null;
        Token this_DEDENT_11=null;
        Token this_DEDENT_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_capability_6_0 = null;

        EObject lv_communicationConnection_10_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1109:2: ( (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1110:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1110:2: (otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1111:3: otherlv_0= ComputationDeviceType this_INDENT_1= RULE_INDENT otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )? (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )? this_DEDENT_12= RULE_DEDENT
            {
            otherlv_0=(Token)match(input,ComputationDeviceType,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComputationDeviceTypeAccess().getComputationDeviceTypeKeyword_0());
            		
            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_4); 

            			newLeafNode(this_INDENT_1, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComputationDeviceTypeAccess().getNameKeyword_2());
            		
            // InternalTargetEnvironmentParser.g:1123:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1124:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1124:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1125:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1142:3: (otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Capability) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1143:4: otherlv_4= Capability this_INDENT_5= RULE_INDENT ( (lv_capability_6_0= ruleCapabilityProperty ) )+ this_DEDENT_7= RULE_DEDENT
                    {
                    otherlv_4=(Token)match(input,Capability,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getComputationDeviceTypeAccess().getCapabilityKeyword_4_0());
                    			
                    this_INDENT_5=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_5, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_4_1());
                    			
                    // InternalTargetEnvironmentParser.g:1151:4: ( (lv_capability_6_0= ruleCapabilityProperty ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==HyphenMinus) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalTargetEnvironmentParser.g:1152:5: (lv_capability_6_0= ruleCapabilityProperty )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1152:5: (lv_capability_6_0= ruleCapabilityProperty )
                    	    // InternalTargetEnvironmentParser.g:1153:6: lv_capability_6_0= ruleCapabilityProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCapabilityCapabilityPropertyParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_capability_6_0=ruleCapabilityProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"capability",
                    	    							lv_capability_6_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.CapabilityProperty");
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

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_24); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalTargetEnvironmentParser.g:1175:3: (otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CommunicationConnection) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1176:4: otherlv_8= CommunicationConnection this_INDENT_9= RULE_INDENT ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+ this_DEDENT_11= RULE_DEDENT
                    {
                    otherlv_8=(Token)match(input,CommunicationConnection,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionKeyword_5_0());
                    			
                    this_INDENT_9=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_9, grammarAccess.getComputationDeviceTypeAccess().getINDENTTerminalRuleCall_5_1());
                    			
                    // InternalTargetEnvironmentParser.g:1184:4: ( (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==HyphenMinus) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalTargetEnvironmentParser.g:1185:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1185:5: (lv_communicationConnection_10_0= ruleAbstractCommunicationConnection )
                    	    // InternalTargetEnvironmentParser.g:1186:6: lv_communicationConnection_10_0= ruleAbstractCommunicationConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getComputationDeviceTypeAccess().getCommunicationConnectionAbstractCommunicationConnectionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_communicationConnection_10_0=ruleAbstractCommunicationConnection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComputationDeviceTypeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"communicationConnection",
                    	    							lv_communicationConnection_10_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.AbstractCommunicationConnection");
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

                    this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

                    				newLeafNode(this_DEDENT_11, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            this_DEDENT_12=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_12, grammarAccess.getComputationDeviceTypeAccess().getDEDENTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputationDeviceType"


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalTargetEnvironmentParser.g:1216:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1216:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalTargetEnvironmentParser.g:1217:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getCapabilityPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapabilityProperty=ruleCapabilityProperty();

            state._fsp--;

             current =iv_ruleCapabilityProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapabilityProperty"


    // $ANTLR start "ruleCapabilityProperty"
    // InternalTargetEnvironmentParser.g:1223:1: ruleCapabilityProperty returns [EObject current=null] : ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) ;
    public final EObject ruleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_INDENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_DEDENT_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_kind_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1229:2: ( ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1230:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1230:2: ( rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1231:3: rulePreListElement otherlv_1= Name ( (lv_name_2_0= ruleEString ) ) this_INDENT_3= RULE_INDENT otherlv_4= Kind ( (lv_kind_5_0= ruleCapabilityKind ) ) otherlv_6= Type ( (lv_type_7_0= ruleAbstractResouceType ) ) (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )? this_DEDENT_10= RULE_DEDENT
            {

            			newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getPreListElementParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityPropertyAccess().getNameKeyword_1());
            		
            // InternalTargetEnvironmentParser.g:1242:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1243:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1243:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1244:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_25); 

            			newLeafNode(this_INDENT_3, grammarAccess.getCapabilityPropertyAccess().getINDENTTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Kind,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4());
            		
            // InternalTargetEnvironmentParser.g:1269:3: ( (lv_kind_5_0= ruleCapabilityKind ) )
            // InternalTargetEnvironmentParser.g:1270:4: (lv_kind_5_0= ruleCapabilityKind )
            {
            // InternalTargetEnvironmentParser.g:1270:4: (lv_kind_5_0= ruleCapabilityKind )
            // InternalTargetEnvironmentParser.g:1271:5: lv_kind_5_0= ruleCapabilityKind
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_kind_5_0=ruleCapabilityKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_5_0,
            						"de.fraunhofer.ipa.targetEnvironment.Device.CapabilityKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Type,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getTypeKeyword_6());
            		
            // InternalTargetEnvironmentParser.g:1292:3: ( (lv_type_7_0= ruleAbstractResouceType ) )
            // InternalTargetEnvironmentParser.g:1293:4: (lv_type_7_0= ruleAbstractResouceType )
            {
            // InternalTargetEnvironmentParser.g:1293:4: (lv_type_7_0= ruleAbstractResouceType )
            // InternalTargetEnvironmentParser.g:1294:5: lv_type_7_0= ruleAbstractResouceType
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getTypeAbstractResouceTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_type_7_0=ruleAbstractResouceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.deployment.Util.AbstractResouceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1311:3: (otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Value) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1312:4: otherlv_8= Value ( (lv_value_9_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,Value,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_8_0());
                    			
                    // InternalTargetEnvironmentParser.g:1316:4: ( (lv_value_9_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1317:5: (lv_value_9_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1317:5: (lv_value_9_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1318:6: lv_value_9_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValuePropertyValueParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_9_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
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

            this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_10, grammarAccess.getCapabilityPropertyAccess().getDEDENTTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapabilityProperty"


    // $ANTLR start "entryRuleAttributeKind"
    // InternalTargetEnvironmentParser.g:1344:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1344:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironmentParser.g:1345:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironmentParser.g:1351:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= AttributeKind ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1357:2: ( ( () otherlv_1= AttributeKind ) )
            // InternalTargetEnvironmentParser.g:1358:2: ( () otherlv_1= AttributeKind )
            {
            // InternalTargetEnvironmentParser.g:1358:2: ( () otherlv_1= AttributeKind )
            // InternalTargetEnvironmentParser.g:1359:3: () otherlv_1= AttributeKind
            {
            // InternalTargetEnvironmentParser.g:1359:3: ()
            // InternalTargetEnvironmentParser.g:1360:4: 
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
    // InternalTargetEnvironmentParser.g:1374:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1374:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironmentParser.g:1375:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironmentParser.g:1381:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= MaximumKind ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1387:2: ( ( () otherlv_1= MaximumKind ) )
            // InternalTargetEnvironmentParser.g:1388:2: ( () otherlv_1= MaximumKind )
            {
            // InternalTargetEnvironmentParser.g:1388:2: ( () otherlv_1= MaximumKind )
            // InternalTargetEnvironmentParser.g:1389:3: () otherlv_1= MaximumKind
            {
            // InternalTargetEnvironmentParser.g:1389:3: ()
            // InternalTargetEnvironmentParser.g:1390:4: 
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
    // InternalTargetEnvironmentParser.g:1404:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1404:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironmentParser.g:1405:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironmentParser.g:1411:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= MinimumKind ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1417:2: ( ( () otherlv_1= MinimumKind ) )
            // InternalTargetEnvironmentParser.g:1418:2: ( () otherlv_1= MinimumKind )
            {
            // InternalTargetEnvironmentParser.g:1418:2: ( () otherlv_1= MinimumKind )
            // InternalTargetEnvironmentParser.g:1419:3: () otherlv_1= MinimumKind
            {
            // InternalTargetEnvironmentParser.g:1419:3: ()
            // InternalTargetEnvironmentParser.g:1420:4: 
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
    // InternalTargetEnvironmentParser.g:1434:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironmentParser.g:1434:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironmentParser.g:1435:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironmentParser.g:1441:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= SelectionKind ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1447:2: ( ( () otherlv_1= SelectionKind ) )
            // InternalTargetEnvironmentParser.g:1448:2: ( () otherlv_1= SelectionKind )
            {
            // InternalTargetEnvironmentParser.g:1448:2: ( () otherlv_1= SelectionKind )
            // InternalTargetEnvironmentParser.g:1449:3: () otherlv_1= SelectionKind
            {
            // InternalTargetEnvironmentParser.g:1449:3: ()
            // InternalTargetEnvironmentParser.g:1450:4: 
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


    // $ANTLR start "entryRuleConnectionProperty"
    // InternalTargetEnvironmentParser.g:1464:1: entryRuleConnectionProperty returns [EObject current=null] : iv_ruleConnectionProperty= ruleConnectionProperty EOF ;
    public final EObject entryRuleConnectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionProperty = null;


        try {
            // InternalTargetEnvironmentParser.g:1464:59: (iv_ruleConnectionProperty= ruleConnectionProperty EOF )
            // InternalTargetEnvironmentParser.g:1465:2: iv_ruleConnectionProperty= ruleConnectionProperty EOF
            {
             newCompositeNode(grammarAccess.getConnectionPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionProperty=ruleConnectionProperty();

            state._fsp--;

             current =iv_ruleConnectionProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionProperty"


    // $ANTLR start "ruleConnectionProperty"
    // InternalTargetEnvironmentParser.g:1471:1: ruleConnectionProperty returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) ;
    public final EObject ruleConnectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token this_DEDENT_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1477:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? ) )
            // InternalTargetEnvironmentParser.g:1478:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            {
            // InternalTargetEnvironmentParser.g:1478:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )? )
            // InternalTargetEnvironmentParser.g:1479:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            {
            // InternalTargetEnvironmentParser.g:1479:3: ()
            // InternalTargetEnvironmentParser.g:1480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionPropertyAccess().getConnectionPropertyAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getConnectionPropertyAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionPropertyAccess().getNameKeyword_2());
            		
            // InternalTargetEnvironmentParser.g:1497:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1498:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1498:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1499:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionPropertyAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1516:3: (this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INDENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1517:4: this_INDENT_4= RULE_INDENT otherlv_5= Value ( (lv_value_6_0= rulePropertyValue ) ) this_DEDENT_7= RULE_DEDENT
                    {
                    this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_18); 

                    				newLeafNode(this_INDENT_4, grammarAccess.getConnectionPropertyAccess().getINDENTTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Value,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectionPropertyAccess().getValueKeyword_4_1());
                    			
                    // InternalTargetEnvironmentParser.g:1525:4: ( (lv_value_6_0= rulePropertyValue ) )
                    // InternalTargetEnvironmentParser.g:1526:5: (lv_value_6_0= rulePropertyValue )
                    {
                    // InternalTargetEnvironmentParser.g:1526:5: (lv_value_6_0= rulePropertyValue )
                    // InternalTargetEnvironmentParser.g:1527:6: lv_value_6_0= rulePropertyValue
                    {

                    						newCompositeNode(grammarAccess.getConnectionPropertyAccess().getValuePropertyValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_6_0=rulePropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"de.fraunhofer.ipa.deployment.Util.PropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_DEDENT_7=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

                    				newLeafNode(this_DEDENT_7, grammarAccess.getConnectionPropertyAccess().getDEDENTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleConnectionProperty"


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalTargetEnvironmentParser.g:1553:1: entryRuleNetworkConnection returns [EObject current=null] : iv_ruleNetworkConnection= ruleNetworkConnection EOF ;
    public final EObject entryRuleNetworkConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1553:58: (iv_ruleNetworkConnection= ruleNetworkConnection EOF )
            // InternalTargetEnvironmentParser.g:1554:2: iv_ruleNetworkConnection= ruleNetworkConnection EOF
            {
             newCompositeNode(grammarAccess.getNetworkConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConnection=ruleNetworkConnection();

            state._fsp--;

             current =iv_ruleNetworkConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkConnection"


    // $ANTLR start "ruleNetworkConnection"
    // InternalTargetEnvironmentParser.g:1560:1: ruleNetworkConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleNetworkConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1566:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1567:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1567:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1568:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( (lv_type_6_0= ruleNetworkCommunicationType ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1568:3: ()
            // InternalTargetEnvironmentParser.g:1569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkConnectionAccess().getNetworkConnectionAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkConnectionAccess().getNameKeyword_2());
            		
            // InternalTargetEnvironmentParser.g:1586:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1587:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1587:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1588:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27); 

            			newLeafNode(this_INDENT_4, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkConnectionAccess().getTypeKeyword_5());
            		
            // InternalTargetEnvironmentParser.g:1613:3: ( (lv_type_6_0= ruleNetworkCommunicationType ) )
            // InternalTargetEnvironmentParser.g:1614:4: (lv_type_6_0= ruleNetworkCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:1614:4: (lv_type_6_0= ruleNetworkCommunicationType )
            // InternalTargetEnvironmentParser.g:1615:5: lv_type_6_0= ruleNetworkCommunicationType
            {

            					newCompositeNode(grammarAccess.getNetworkConnectionAccess().getTypeNetworkCommunicationTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_6_0=ruleNetworkCommunicationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.fraunhofer.ipa.deployment.Util.NetworkCommunicationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1632:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Properties) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1633:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getNetworkConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getNetworkConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalTargetEnvironmentParser.g:1641:4: ( (lv_properties_9_0= ruleAbstractNetworkProperty ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalTargetEnvironmentParser.g:1642:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1642:5: (lv_properties_9_0= ruleAbstractNetworkProperty )
                    	    // InternalTargetEnvironmentParser.g:1643:6: lv_properties_9_0= ruleAbstractNetworkProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getNetworkConnectionAccess().getPropertiesAbstractNetworkPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_properties_9_0=ruleAbstractNetworkProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNetworkConnectionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_9_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.AbstractNetworkProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

                    				newLeafNode(this_DEDENT_10, grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_11, grammarAccess.getNetworkConnectionAccess().getDEDENTTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkConnection"


    // $ANTLR start "entryRuleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:1673:1: entryRuleCommunicationConnection returns [EObject current=null] : iv_ruleCommunicationConnection= ruleCommunicationConnection EOF ;
    public final EObject entryRuleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationConnection = null;


        try {
            // InternalTargetEnvironmentParser.g:1673:64: (iv_ruleCommunicationConnection= ruleCommunicationConnection EOF )
            // InternalTargetEnvironmentParser.g:1674:2: iv_ruleCommunicationConnection= ruleCommunicationConnection EOF
            {
             newCompositeNode(grammarAccess.getCommunicationConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationConnection=ruleCommunicationConnection();

            state._fsp--;

             current =iv_ruleCommunicationConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunicationConnection"


    // $ANTLR start "ruleCommunicationConnection"
    // InternalTargetEnvironmentParser.g:1680:1: ruleCommunicationConnection returns [EObject current=null] : ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) ;
    public final EObject ruleCommunicationConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_INDENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_INDENT_8=null;
        Token this_DEDENT_10=null;
        Token this_DEDENT_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_9_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1686:2: ( ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT ) )
            // InternalTargetEnvironmentParser.g:1687:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            {
            // InternalTargetEnvironmentParser.g:1687:2: ( () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT )
            // InternalTargetEnvironmentParser.g:1688:3: () rulePreListElement otherlv_2= Name ( (lv_name_3_0= ruleEString ) ) this_INDENT_4= RULE_INDENT otherlv_5= Type ( ( ruleEString ) ) (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )? this_DEDENT_11= RULE_DEDENT
            {
            // InternalTargetEnvironmentParser.g:1688:3: ()
            // InternalTargetEnvironmentParser.g:1689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationConnectionAccess().getCommunicationConnectionAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPreListElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            rulePreListElement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,Name,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCommunicationConnectionAccess().getNameKeyword_2());
            		
            // InternalTargetEnvironmentParser.g:1706:3: ( (lv_name_3_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1707:4: (lv_name_3_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1707:4: (lv_name_3_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1708:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.deployment.Util.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_27); 

            			newLeafNode(this_INDENT_4, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,Type,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCommunicationConnectionAccess().getTypeKeyword_5());
            		
            // InternalTargetEnvironmentParser.g:1733:3: ( ( ruleEString ) )
            // InternalTargetEnvironmentParser.g:1734:4: ( ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1734:4: ( ruleEString )
            // InternalTargetEnvironmentParser.g:1735:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommunicationConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getTypeCommunicationTypeCrossReference_6_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironmentParser.g:1749:3: (otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Properties) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1750:4: otherlv_7= Properties this_INDENT_8= RULE_INDENT ( (lv_properties_9_0= ruleConnectionProperty ) )+ this_DEDENT_10= RULE_DEDENT
                    {
                    otherlv_7=(Token)match(input,Properties,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommunicationConnectionAccess().getPropertiesKeyword_7_0());
                    			
                    this_INDENT_8=(Token)match(input,RULE_INDENT,FOLLOW_7); 

                    				newLeafNode(this_INDENT_8, grammarAccess.getCommunicationConnectionAccess().getINDENTTerminalRuleCall_7_1());
                    			
                    // InternalTargetEnvironmentParser.g:1758:4: ( (lv_properties_9_0= ruleConnectionProperty ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==HyphenMinus) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalTargetEnvironmentParser.g:1759:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    {
                    	    // InternalTargetEnvironmentParser.g:1759:5: (lv_properties_9_0= ruleConnectionProperty )
                    	    // InternalTargetEnvironmentParser.g:1760:6: lv_properties_9_0= ruleConnectionProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommunicationConnectionAccess().getPropertiesConnectionPropertyParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_properties_9_0=ruleConnectionProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommunicationConnectionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_9_0,
                    	    							"de.fraunhofer.ipa.targetEnvironment.Device.ConnectionProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    this_DEDENT_10=(Token)match(input,RULE_DEDENT,FOLLOW_10); 

                    				newLeafNode(this_DEDENT_10, grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            this_DEDENT_11=(Token)match(input,RULE_DEDENT,FOLLOW_2); 

            			newLeafNode(this_DEDENT_11, grammarAccess.getCommunicationConnectionAccess().getDEDENTTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunicationConnection"


    // $ANTLR start "entryRulePropertyValue"
    // InternalTargetEnvironmentParser.g:1790:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalTargetEnvironmentParser.g:1790:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalTargetEnvironmentParser.g:1791:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalTargetEnvironmentParser.g:1797:1: rulePropertyValue returns [EObject current=null] : (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValueInt_0 = null;

        EObject this_PropertyValueDouble_1 = null;

        EObject this_PropertyValueString_2 = null;

        EObject this_ProcessorArchitectureValue_3 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1803:2: ( (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue ) )
            // InternalTargetEnvironmentParser.g:1804:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            {
            // InternalTargetEnvironmentParser.g:1804:2: (this_PropertyValueInt_0= rulePropertyValueInt | this_PropertyValueDouble_1= rulePropertyValueDouble | this_PropertyValueString_2= rulePropertyValueString | this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_DECINT:
                {
                alt31=1;
                }
                break;
            case RULE_DOUBLE:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt31=3;
                }
                break;
            case Arm64ProcessorArchitecture:
            case X86ProcessorArchitecture:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1805:3: this_PropertyValueInt_0= rulePropertyValueInt
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
                    // InternalTargetEnvironmentParser.g:1814:3: this_PropertyValueDouble_1= rulePropertyValueDouble
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
                    // InternalTargetEnvironmentParser.g:1823:3: this_PropertyValueString_2= rulePropertyValueString
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
                    // InternalTargetEnvironmentParser.g:1832:3: this_ProcessorArchitectureValue_3= ruleProcessorArchitectureValue
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
    // InternalTargetEnvironmentParser.g:1844:1: entryRulePropertyValueInt returns [EObject current=null] : iv_rulePropertyValueInt= rulePropertyValueInt EOF ;
    public final EObject entryRulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInt = null;


        try {
            // InternalTargetEnvironmentParser.g:1844:57: (iv_rulePropertyValueInt= rulePropertyValueInt EOF )
            // InternalTargetEnvironmentParser.g:1845:2: iv_rulePropertyValueInt= rulePropertyValueInt EOF
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
    // InternalTargetEnvironmentParser.g:1851:1: rulePropertyValueInt returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject rulePropertyValueInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1857:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalTargetEnvironmentParser.g:1858:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalTargetEnvironmentParser.g:1858:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalTargetEnvironmentParser.g:1859:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalTargetEnvironmentParser.g:1859:3: (lv_value_0_0= ruleInteger0 )
            // InternalTargetEnvironmentParser.g:1860:4: lv_value_0_0= ruleInteger0
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
    // InternalTargetEnvironmentParser.g:1880:1: entryRulePropertyValueDouble returns [EObject current=null] : iv_rulePropertyValueDouble= rulePropertyValueDouble EOF ;
    public final EObject entryRulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueDouble = null;


        try {
            // InternalTargetEnvironmentParser.g:1880:60: (iv_rulePropertyValueDouble= rulePropertyValueDouble EOF )
            // InternalTargetEnvironmentParser.g:1881:2: iv_rulePropertyValueDouble= rulePropertyValueDouble EOF
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
    // InternalTargetEnvironmentParser.g:1887:1: rulePropertyValueDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject rulePropertyValueDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1893:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalTargetEnvironmentParser.g:1894:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalTargetEnvironmentParser.g:1894:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalTargetEnvironmentParser.g:1895:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalTargetEnvironmentParser.g:1895:3: (lv_value_0_0= ruleDouble0 )
            // InternalTargetEnvironmentParser.g:1896:4: lv_value_0_0= ruleDouble0
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
    // InternalTargetEnvironmentParser.g:1916:1: entryRulePropertyValueString returns [EObject current=null] : iv_rulePropertyValueString= rulePropertyValueString EOF ;
    public final EObject entryRulePropertyValueString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueString = null;


        try {
            // InternalTargetEnvironmentParser.g:1916:60: (iv_rulePropertyValueString= rulePropertyValueString EOF )
            // InternalTargetEnvironmentParser.g:1917:2: iv_rulePropertyValueString= rulePropertyValueString EOF
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
    // InternalTargetEnvironmentParser.g:1923:1: rulePropertyValueString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject rulePropertyValueString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1929:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:1930:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:1930:2: ( (lv_value_0_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:1931:3: (lv_value_0_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:1931:3: (lv_value_0_0= ruleEString )
            // InternalTargetEnvironmentParser.g:1932:4: lv_value_0_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:1952:1: entryRuleProcessorArchitectureValue returns [EObject current=null] : iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF ;
    public final EObject entryRuleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureValue = null;


        try {
            // InternalTargetEnvironmentParser.g:1952:67: (iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF )
            // InternalTargetEnvironmentParser.g:1953:2: iv_ruleProcessorArchitectureValue= ruleProcessorArchitectureValue EOF
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
    // InternalTargetEnvironmentParser.g:1959:1: ruleProcessorArchitectureValue returns [EObject current=null] : (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureValue() throws RecognitionException {
        EObject current = null;

        EObject this_X86ProcessorArchitecture_0 = null;

        EObject this_Arm64ProcessorArchitecture_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:1965:2: ( (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:1966:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:1966:2: (this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture | this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==X86ProcessorArchitecture) ) {
                alt32=1;
            }
            else if ( (LA32_0==Arm64ProcessorArchitecture) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:1967:3: this_X86ProcessorArchitecture_0= ruleX86ProcessorArchitecture
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
                    // InternalTargetEnvironmentParser.g:1976:3: this_Arm64ProcessorArchitecture_1= ruleArm64ProcessorArchitecture
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


    // $ANTLR start "entryRuleAbstractResouceType"
    // InternalTargetEnvironmentParser.g:1988:1: entryRuleAbstractResouceType returns [EObject current=null] : iv_ruleAbstractResouceType= ruleAbstractResouceType EOF ;
    public final EObject entryRuleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractResouceType = null;


        try {
            // InternalTargetEnvironmentParser.g:1988:60: (iv_ruleAbstractResouceType= ruleAbstractResouceType EOF )
            // InternalTargetEnvironmentParser.g:1989:2: iv_ruleAbstractResouceType= ruleAbstractResouceType EOF
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
    // InternalTargetEnvironmentParser.g:1995:1: ruleAbstractResouceType returns [EObject current=null] : (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType ) ;
    public final EObject ruleAbstractResouceType() throws RecognitionException {
        EObject current = null;

        EObject this_OpertingSystemType_0 = null;

        EObject this_ProcessorArchitectureType_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2001:2: ( (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType ) )
            // InternalTargetEnvironmentParser.g:2002:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType )
            {
            // InternalTargetEnvironmentParser.g:2002:2: (this_OpertingSystemType_0= ruleOpertingSystemType | this_ProcessorArchitectureType_1= ruleProcessorArchitectureType )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=Linux && LA33_0<=MacOS)) ) {
                alt33=1;
            }
            else if ( (LA33_0==ProcessorArchitecture) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2003:3: this_OpertingSystemType_0= ruleOpertingSystemType
                    {

                    			newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getOpertingSystemTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpertingSystemType_0=ruleOpertingSystemType();

                    state._fsp--;


                    			current = this_OpertingSystemType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:2012:3: this_ProcessorArchitectureType_1= ruleProcessorArchitectureType
                    {

                    			newCompositeNode(grammarAccess.getAbstractResouceTypeAccess().getProcessorArchitectureTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProcessorArchitectureType_1=ruleProcessorArchitectureType();

                    state._fsp--;


                    			current = this_ProcessorArchitectureType_1;
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
    // $ANTLR end "ruleAbstractResouceType"


    // $ANTLR start "entryRuleOpertingSystemType"
    // InternalTargetEnvironmentParser.g:2024:1: entryRuleOpertingSystemType returns [EObject current=null] : iv_ruleOpertingSystemType= ruleOpertingSystemType EOF ;
    public final EObject entryRuleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:2024:59: (iv_ruleOpertingSystemType= ruleOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:2025:2: iv_ruleOpertingSystemType= ruleOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:2031:1: ruleOpertingSystemType returns [EObject current=null] : (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) ;
    public final EObject ruleOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject this_LinuxOpertingSystemType_0 = null;

        EObject this_MacOSOpertingSystemType_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2037:2: ( (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType ) )
            // InternalTargetEnvironmentParser.g:2038:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            {
            // InternalTargetEnvironmentParser.g:2038:2: (this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType | this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Linux) ) {
                alt34=1;
            }
            else if ( (LA34_0==MacOS) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalTargetEnvironmentParser.g:2039:3: this_LinuxOpertingSystemType_0= ruleLinuxOpertingSystemType
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
                    // InternalTargetEnvironmentParser.g:2048:3: this_MacOSOpertingSystemType_1= ruleMacOSOpertingSystemType
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


    // $ANTLR start "entryRuleProcessorArchitectureType"
    // InternalTargetEnvironmentParser.g:2060:1: entryRuleProcessorArchitectureType returns [EObject current=null] : iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF ;
    public final EObject entryRuleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessorArchitectureType = null;


        try {
            // InternalTargetEnvironmentParser.g:2060:66: (iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF )
            // InternalTargetEnvironmentParser.g:2061:2: iv_ruleProcessorArchitectureType= ruleProcessorArchitectureType EOF
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
    // InternalTargetEnvironmentParser.g:2067:1: ruleProcessorArchitectureType returns [EObject current=null] : ( () otherlv_1= ProcessorArchitecture ) ;
    public final EObject ruleProcessorArchitectureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2073:2: ( ( () otherlv_1= ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:2074:2: ( () otherlv_1= ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:2074:2: ( () otherlv_1= ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:2075:3: () otherlv_1= ProcessorArchitecture
            {
            // InternalTargetEnvironmentParser.g:2075:3: ()
            // InternalTargetEnvironmentParser.g:2076:4: 
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
    // InternalTargetEnvironmentParser.g:2090:1: entryRuleLinuxOpertingSystemType returns [EObject current=null] : iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF ;
    public final EObject entryRuleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinuxOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:2090:64: (iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:2091:2: iv_ruleLinuxOpertingSystemType= ruleLinuxOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:2097:1: ruleLinuxOpertingSystemType returns [EObject current=null] : ( () otherlv_1= Linux ) ;
    public final EObject ruleLinuxOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2103:2: ( ( () otherlv_1= Linux ) )
            // InternalTargetEnvironmentParser.g:2104:2: ( () otherlv_1= Linux )
            {
            // InternalTargetEnvironmentParser.g:2104:2: ( () otherlv_1= Linux )
            // InternalTargetEnvironmentParser.g:2105:3: () otherlv_1= Linux
            {
            // InternalTargetEnvironmentParser.g:2105:3: ()
            // InternalTargetEnvironmentParser.g:2106:4: 
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
    // InternalTargetEnvironmentParser.g:2120:1: entryRuleMacOSOpertingSystemType returns [EObject current=null] : iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF ;
    public final EObject entryRuleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacOSOpertingSystemType = null;


        try {
            // InternalTargetEnvironmentParser.g:2120:64: (iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF )
            // InternalTargetEnvironmentParser.g:2121:2: iv_ruleMacOSOpertingSystemType= ruleMacOSOpertingSystemType EOF
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
    // InternalTargetEnvironmentParser.g:2127:1: ruleMacOSOpertingSystemType returns [EObject current=null] : ( () otherlv_1= MacOS ) ;
    public final EObject ruleMacOSOpertingSystemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2133:2: ( ( () otherlv_1= MacOS ) )
            // InternalTargetEnvironmentParser.g:2134:2: ( () otherlv_1= MacOS )
            {
            // InternalTargetEnvironmentParser.g:2134:2: ( () otherlv_1= MacOS )
            // InternalTargetEnvironmentParser.g:2135:3: () otherlv_1= MacOS
            {
            // InternalTargetEnvironmentParser.g:2135:3: ()
            // InternalTargetEnvironmentParser.g:2136:4: 
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
    // InternalTargetEnvironmentParser.g:2150:1: entryRuleX86ProcessorArchitecture returns [EObject current=null] : iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF ;
    public final EObject entryRuleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX86ProcessorArchitecture = null;


        try {
            // InternalTargetEnvironmentParser.g:2150:65: (iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:2151:2: iv_ruleX86ProcessorArchitecture= ruleX86ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:2157:1: ruleX86ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= X86ProcessorArchitecture ) ;
    public final EObject ruleX86ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2163:2: ( ( () otherlv_1= X86ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:2164:2: ( () otherlv_1= X86ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:2164:2: ( () otherlv_1= X86ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:2165:3: () otherlv_1= X86ProcessorArchitecture
            {
            // InternalTargetEnvironmentParser.g:2165:3: ()
            // InternalTargetEnvironmentParser.g:2166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,X86ProcessorArchitecture,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getX86ProcessorArchitectureAccess().getX86ProcessorArchitectureKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalTargetEnvironmentParser.g:2180:1: entryRuleArm64ProcessorArchitecture returns [EObject current=null] : iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF ;
    public final EObject entryRuleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArm64ProcessorArchitecture = null;


        try {
            // InternalTargetEnvironmentParser.g:2180:67: (iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF )
            // InternalTargetEnvironmentParser.g:2181:2: iv_ruleArm64ProcessorArchitecture= ruleArm64ProcessorArchitecture EOF
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
    // InternalTargetEnvironmentParser.g:2187:1: ruleArm64ProcessorArchitecture returns [EObject current=null] : ( () otherlv_1= Arm64ProcessorArchitecture ) ;
    public final EObject ruleArm64ProcessorArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2193:2: ( ( () otherlv_1= Arm64ProcessorArchitecture ) )
            // InternalTargetEnvironmentParser.g:2194:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            {
            // InternalTargetEnvironmentParser.g:2194:2: ( () otherlv_1= Arm64ProcessorArchitecture )
            // InternalTargetEnvironmentParser.g:2195:3: () otherlv_1= Arm64ProcessorArchitecture
            {
            // InternalTargetEnvironmentParser.g:2195:3: ()
            // InternalTargetEnvironmentParser.g:2196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Arm64ProcessorArchitecture,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArm64ProcessorArchitectureAccess().getArm64ProcessorArchitectureKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalTargetEnvironmentParser.g:2210:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2210:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2211:2: iv_ruleCommunicationType= ruleCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2217:1: ruleCommunicationType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2223:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalTargetEnvironmentParser.g:2224:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalTargetEnvironmentParser.g:2224:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalTargetEnvironmentParser.g:2225:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalTargetEnvironmentParser.g:2225:3: ()
            // InternalTargetEnvironmentParser.g:2226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationTypeAccess().getCommunicationTypeAction_0(),
            					current);
            			

            }

            // InternalTargetEnvironmentParser.g:2232:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironmentParser.g:2233:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironmentParser.g:2233:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironmentParser.g:2234:5: lv_name_1_0= ruleEString
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
    // InternalTargetEnvironmentParser.g:2255:1: entryRuleNetworkCommunicationType returns [EObject current=null] : iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF ;
    public final EObject entryRuleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2255:65: (iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2256:2: iv_ruleNetworkCommunicationType= ruleNetworkCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2262:1: ruleNetworkCommunicationType returns [EObject current=null] : (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) ;
    public final EObject ruleNetworkCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject this_EthernetCommunicationType_0 = null;

        EObject this_WlanCommunicationType_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2268:2: ( (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType ) )
            // InternalTargetEnvironmentParser.g:2269:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
            {
            // InternalTargetEnvironmentParser.g:2269:2: (this_EthernetCommunicationType_0= ruleEthernetCommunicationType | this_WlanCommunicationType_1= ruleWlanCommunicationType )
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
                    // InternalTargetEnvironmentParser.g:2270:3: this_EthernetCommunicationType_0= ruleEthernetCommunicationType
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
                    // InternalTargetEnvironmentParser.g:2279:3: this_WlanCommunicationType_1= ruleWlanCommunicationType
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
    // InternalTargetEnvironmentParser.g:2291:1: entryRuleEthernetCommunicationType returns [EObject current=null] : iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF ;
    public final EObject entryRuleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEthernetCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2291:66: (iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2292:2: iv_ruleEthernetCommunicationType= ruleEthernetCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2298:1: ruleEthernetCommunicationType returns [EObject current=null] : ( () otherlv_1= Ethernet ) ;
    public final EObject ruleEthernetCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2304:2: ( ( () otherlv_1= Ethernet ) )
            // InternalTargetEnvironmentParser.g:2305:2: ( () otherlv_1= Ethernet )
            {
            // InternalTargetEnvironmentParser.g:2305:2: ( () otherlv_1= Ethernet )
            // InternalTargetEnvironmentParser.g:2306:3: () otherlv_1= Ethernet
            {
            // InternalTargetEnvironmentParser.g:2306:3: ()
            // InternalTargetEnvironmentParser.g:2307:4: 
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
    // InternalTargetEnvironmentParser.g:2321:1: entryRuleWlanCommunicationType returns [EObject current=null] : iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF ;
    public final EObject entryRuleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWlanCommunicationType = null;


        try {
            // InternalTargetEnvironmentParser.g:2321:62: (iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF )
            // InternalTargetEnvironmentParser.g:2322:2: iv_ruleWlanCommunicationType= ruleWlanCommunicationType EOF
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
    // InternalTargetEnvironmentParser.g:2328:1: ruleWlanCommunicationType returns [EObject current=null] : ( () otherlv_1= Wlan ) ;
    public final EObject ruleWlanCommunicationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2334:2: ( ( () otherlv_1= Wlan ) )
            // InternalTargetEnvironmentParser.g:2335:2: ( () otherlv_1= Wlan )
            {
            // InternalTargetEnvironmentParser.g:2335:2: ( () otherlv_1= Wlan )
            // InternalTargetEnvironmentParser.g:2336:3: () otherlv_1= Wlan
            {
            // InternalTargetEnvironmentParser.g:2336:3: ()
            // InternalTargetEnvironmentParser.g:2337:4: 
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


    // $ANTLR start "entryRuleDouble0"
    // InternalTargetEnvironmentParser.g:2351:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalTargetEnvironmentParser.g:2351:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalTargetEnvironmentParser.g:2352:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalTargetEnvironmentParser.g:2358:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2364:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalTargetEnvironmentParser.g:2365:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalTargetEnvironmentParser.g:2375:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalTargetEnvironmentParser.g:2375:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalTargetEnvironmentParser.g:2376:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalTargetEnvironmentParser.g:2382:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2388:2: (this_DECINT_0= RULE_DECINT )
            // InternalTargetEnvironmentParser.g:2389:2: this_DECINT_0= RULE_DECINT
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
    // InternalTargetEnvironmentParser.g:2399:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironmentParser.g:2399:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironmentParser.g:2400:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironmentParser.g:2406:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironmentParser.g:2412:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironmentParser.g:2413:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironmentParser.g:2413:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalTargetEnvironmentParser.g:2414:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentParser.g:2422:3: this_ID_1= RULE_ID
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
    // InternalTargetEnvironmentParser.g:2433:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:2435:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalTargetEnvironmentParser.g:2436:2: iv_rulePreListElement= rulePreListElement EOF
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
    // InternalTargetEnvironmentParser.g:2445:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalTargetEnvironmentParser.g:2452:2: (kw= HyphenMinus )
            // InternalTargetEnvironmentParser.g:2453:2: kw= HyphenMinus
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000004800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0014018000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000400040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000360000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000800000L});

}