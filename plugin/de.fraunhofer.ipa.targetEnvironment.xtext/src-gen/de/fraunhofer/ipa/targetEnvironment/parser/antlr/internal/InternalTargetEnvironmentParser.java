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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TargetDeployEnviroment'", "'{'", "'includeDevice'", "','", "'}'", "'configConnection'", "'DeviceInstance'", "'refDeviceType'", "'ConfigConnection'", "'connectDevice'", "'CapabilityProperty'", "'value'", "'kind'", "'AttributeKind'", "'MaximumKind'", "'MinimumKind'", "'SelectionKind'", "'Property'", "'IndirectConnection'", "'properties'", "'DirectConnection'", "'ConnectedDevice'", "'refDevice'", "'refConnection'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTargetEnvironmentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetEnvironmentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTargetEnvironmentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTargetEnvironment.g"; }



     	private TargetEnvironmentGrammarAccess grammarAccess;

        public InternalTargetEnvironmentParser(TokenStream input, TargetEnvironmentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TargetDeployEnviroment";
       	}

       	@Override
       	protected TargetEnvironmentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTargetDeployEnviroment"
    // InternalTargetEnvironment.g:64:1: entryRuleTargetDeployEnviroment returns [EObject current=null] : iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF ;
    public final EObject entryRuleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetDeployEnviroment = null;


        try {
            // InternalTargetEnvironment.g:64:63: (iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF )
            // InternalTargetEnvironment.g:65:2: iv_ruleTargetDeployEnviroment= ruleTargetDeployEnviroment EOF
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
    // InternalTargetEnvironment.g:71:1: ruleTargetDeployEnviroment returns [EObject current=null] : ( () otherlv_1= 'TargetDeployEnviroment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )? (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleTargetDeployEnviroment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_includeDevice_6_0 = null;

        EObject lv_includeDevice_8_0 = null;

        EObject lv_configConnection_12_0 = null;

        EObject lv_configConnection_14_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:77:2: ( ( () otherlv_1= 'TargetDeployEnviroment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )? (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalTargetEnvironment.g:78:2: ( () otherlv_1= 'TargetDeployEnviroment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )? (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalTargetEnvironment.g:78:2: ( () otherlv_1= 'TargetDeployEnviroment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )? (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalTargetEnvironment.g:79:3: () otherlv_1= 'TargetDeployEnviroment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )? (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalTargetEnvironment.g:79:3: ()
            // InternalTargetEnvironment.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetDeployEnviromentAccess().getTargetDeployEnviromentKeyword_1());
            		
            // InternalTargetEnvironment.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironment.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironment.g:91:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironment.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTargetDeployEnviromentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTargetEnvironment.g:113:3: (otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTargetEnvironment.g:114:4: otherlv_4= 'includeDevice' otherlv_5= '{' ( (lv_includeDevice_6_0= ruleDeviceInstance ) ) (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTargetDeployEnviromentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTargetEnvironment.g:122:4: ( (lv_includeDevice_6_0= ruleDeviceInstance ) )
                    // InternalTargetEnvironment.g:123:5: (lv_includeDevice_6_0= ruleDeviceInstance )
                    {
                    // InternalTargetEnvironment.g:123:5: (lv_includeDevice_6_0= ruleDeviceInstance )
                    // InternalTargetEnvironment.g:124:6: lv_includeDevice_6_0= ruleDeviceInstance
                    {

                    						newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_includeDevice_6_0=ruleDeviceInstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    						}
                    						add(
                    							current,
                    							"includeDevice",
                    							lv_includeDevice_6_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:141:4: (otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:142:5: otherlv_7= ',' ( (lv_includeDevice_8_0= ruleDeviceInstance ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTargetDeployEnviromentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:146:5: ( (lv_includeDevice_8_0= ruleDeviceInstance ) )
                    	    // InternalTargetEnvironment.g:147:6: (lv_includeDevice_8_0= ruleDeviceInstance )
                    	    {
                    	    // InternalTargetEnvironment.g:147:6: (lv_includeDevice_8_0= ruleDeviceInstance )
                    	    // InternalTargetEnvironment.g:148:7: lv_includeDevice_8_0= ruleDeviceInstance
                    	    {

                    	    							newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getIncludeDeviceDeviceInstanceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_includeDevice_8_0=ruleDeviceInstance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"includeDevice",
                    	    								lv_includeDevice_8_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.DeviceInstance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTargetDeployEnviromentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTargetEnvironment.g:171:3: (otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTargetEnvironment.g:172:4: otherlv_10= 'configConnection' otherlv_11= '{' ( (lv_configConnection_12_0= ruleConfigConnection ) ) (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getTargetDeployEnviromentAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalTargetEnvironment.g:180:4: ( (lv_configConnection_12_0= ruleConfigConnection ) )
                    // InternalTargetEnvironment.g:181:5: (lv_configConnection_12_0= ruleConfigConnection )
                    {
                    // InternalTargetEnvironment.g:181:5: (lv_configConnection_12_0= ruleConfigConnection )
                    // InternalTargetEnvironment.g:182:6: lv_configConnection_12_0= ruleConfigConnection
                    {

                    						newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_configConnection_12_0=ruleConfigConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    						}
                    						add(
                    							current,
                    							"configConnection",
                    							lv_configConnection_12_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:199:4: (otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:200:5: otherlv_13= ',' ( (lv_configConnection_14_0= ruleConfigConnection ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTargetDeployEnviromentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:204:5: ( (lv_configConnection_14_0= ruleConfigConnection ) )
                    	    // InternalTargetEnvironment.g:205:6: (lv_configConnection_14_0= ruleConfigConnection )
                    	    {
                    	    // InternalTargetEnvironment.g:205:6: (lv_configConnection_14_0= ruleConfigConnection )
                    	    // InternalTargetEnvironment.g:206:7: lv_configConnection_14_0= ruleConfigConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getTargetDeployEnviromentAccess().getConfigConnectionConfigConnectionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_configConnection_14_0=ruleConfigConnection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTargetDeployEnviromentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"configConnection",
                    	    								lv_configConnection_14_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConfigConnection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getTargetDeployEnviromentAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTargetDeployEnviromentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleConnection"
    // InternalTargetEnvironment.g:237:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalTargetEnvironment.g:237:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalTargetEnvironment.g:238:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalTargetEnvironment.g:244:1: ruleConnection returns [EObject current=null] : (this_IndirectConnection_0= ruleIndirectConnection | this_DirectConnection_1= ruleDirectConnection ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_IndirectConnection_0 = null;

        EObject this_DirectConnection_1 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:250:2: ( (this_IndirectConnection_0= ruleIndirectConnection | this_DirectConnection_1= ruleDirectConnection ) )
            // InternalTargetEnvironment.g:251:2: (this_IndirectConnection_0= ruleIndirectConnection | this_DirectConnection_1= ruleDirectConnection )
            {
            // InternalTargetEnvironment.g:251:2: (this_IndirectConnection_0= ruleIndirectConnection | this_DirectConnection_1= ruleDirectConnection )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetEnvironment.g:252:3: this_IndirectConnection_0= ruleIndirectConnection
                    {

                    			newCompositeNode(grammarAccess.getConnectionAccess().getIndirectConnectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndirectConnection_0=ruleIndirectConnection();

                    state._fsp--;


                    			current = this_IndirectConnection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironment.g:261:3: this_DirectConnection_1= ruleDirectConnection
                    {

                    			newCompositeNode(grammarAccess.getConnectionAccess().getDirectConnectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectConnection_1=ruleDirectConnection();

                    state._fsp--;


                    			current = this_DirectConnection_1;
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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleCapabilityKind"
    // InternalTargetEnvironment.g:273:1: entryRuleCapabilityKind returns [EObject current=null] : iv_ruleCapabilityKind= ruleCapabilityKind EOF ;
    public final EObject entryRuleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityKind = null;


        try {
            // InternalTargetEnvironment.g:273:55: (iv_ruleCapabilityKind= ruleCapabilityKind EOF )
            // InternalTargetEnvironment.g:274:2: iv_ruleCapabilityKind= ruleCapabilityKind EOF
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
    // InternalTargetEnvironment.g:280:1: ruleCapabilityKind returns [EObject current=null] : (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) ;
    public final EObject ruleCapabilityKind() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeKind_0 = null;

        EObject this_MaximumKind_1 = null;

        EObject this_MinimumKind_2 = null;

        EObject this_SelectionKind_3 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:286:2: ( (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind ) )
            // InternalTargetEnvironment.g:287:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            {
            // InternalTargetEnvironment.g:287:2: (this_AttributeKind_0= ruleAttributeKind | this_MaximumKind_1= ruleMaximumKind | this_MinimumKind_2= ruleMinimumKind | this_SelectionKind_3= ruleSelectionKind )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTargetEnvironment.g:288:3: this_AttributeKind_0= ruleAttributeKind
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
                    // InternalTargetEnvironment.g:297:3: this_MaximumKind_1= ruleMaximumKind
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
                    // InternalTargetEnvironment.g:306:3: this_MinimumKind_2= ruleMinimumKind
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
                    // InternalTargetEnvironment.g:315:3: this_SelectionKind_3= ruleSelectionKind
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


    // $ANTLR start "entryRuleEString"
    // InternalTargetEnvironment.g:327:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTargetEnvironment.g:327:47: (iv_ruleEString= ruleEString EOF )
            // InternalTargetEnvironment.g:328:2: iv_ruleEString= ruleEString EOF
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
    // InternalTargetEnvironment.g:334:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironment.g:340:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTargetEnvironment.g:341:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTargetEnvironment.g:341:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetEnvironment.g:342:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironment.g:350:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDeviceInstance"
    // InternalTargetEnvironment.g:361:1: entryRuleDeviceInstance returns [EObject current=null] : iv_ruleDeviceInstance= ruleDeviceInstance EOF ;
    public final EObject entryRuleDeviceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInstance = null;


        try {
            // InternalTargetEnvironment.g:361:55: (iv_ruleDeviceInstance= ruleDeviceInstance EOF )
            // InternalTargetEnvironment.g:362:2: iv_ruleDeviceInstance= ruleDeviceInstance EOF
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
    // InternalTargetEnvironment.g:368:1: ruleDeviceInstance returns [EObject current=null] : (otherlv_0= 'DeviceInstance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'refDeviceType' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleDeviceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:374:2: ( (otherlv_0= 'DeviceInstance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'refDeviceType' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalTargetEnvironment.g:375:2: (otherlv_0= 'DeviceInstance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'refDeviceType' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalTargetEnvironment.g:375:2: (otherlv_0= 'DeviceInstance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'refDeviceType' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalTargetEnvironment.g:376:3: otherlv_0= 'DeviceInstance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'refDeviceType' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceInstanceAccess().getDeviceInstanceKeyword_0());
            		
            // InternalTargetEnvironment.g:380:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironment.g:381:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironment.g:381:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironment.g:382:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceInstanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeKeyword_3());
            		
            // InternalTargetEnvironment.g:407:3: ( ( ruleEString ) )
            // InternalTargetEnvironment.g:408:4: ( ruleEString )
            {
            // InternalTargetEnvironment.g:408:4: ( ruleEString )
            // InternalTargetEnvironment.g:409:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeviceInstanceAccess().getRefDeviceTypeDeviceTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeviceInstanceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalTargetEnvironment.g:431:1: entryRuleConfigConnection returns [EObject current=null] : iv_ruleConfigConnection= ruleConfigConnection EOF ;
    public final EObject entryRuleConfigConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigConnection = null;


        try {
            // InternalTargetEnvironment.g:431:57: (iv_ruleConfigConnection= ruleConfigConnection EOF )
            // InternalTargetEnvironment.g:432:2: iv_ruleConfigConnection= ruleConfigConnection EOF
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
    // InternalTargetEnvironment.g:438:1: ruleConfigConnection returns [EObject current=null] : (otherlv_0= 'ConfigConnection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectDevice' otherlv_4= '{' ( (lv_connectDevice_5_0= ruleConnectedDevice ) ) (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleConfigConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_connectDevice_5_0 = null;

        EObject lv_connectDevice_7_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:444:2: ( (otherlv_0= 'ConfigConnection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectDevice' otherlv_4= '{' ( (lv_connectDevice_5_0= ruleConnectedDevice ) ) (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalTargetEnvironment.g:445:2: (otherlv_0= 'ConfigConnection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectDevice' otherlv_4= '{' ( (lv_connectDevice_5_0= ruleConnectedDevice ) ) (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalTargetEnvironment.g:445:2: (otherlv_0= 'ConfigConnection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectDevice' otherlv_4= '{' ( (lv_connectDevice_5_0= ruleConnectedDevice ) ) (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalTargetEnvironment.g:446:3: otherlv_0= 'ConfigConnection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'connectDevice' otherlv_4= '{' ( (lv_connectDevice_5_0= ruleConnectedDevice ) ) (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigConnectionAccess().getConfigConnectionKeyword_0());
            		
            // InternalTargetEnvironment.g:450:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironment.g:451:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironment.g:451:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironment.g:452:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConfigConnectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConfigConnectionAccess().getConnectDeviceKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigConnectionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTargetEnvironment.g:481:3: ( (lv_connectDevice_5_0= ruleConnectedDevice ) )
            // InternalTargetEnvironment.g:482:4: (lv_connectDevice_5_0= ruleConnectedDevice )
            {
            // InternalTargetEnvironment.g:482:4: (lv_connectDevice_5_0= ruleConnectedDevice )
            // InternalTargetEnvironment.g:483:5: lv_connectDevice_5_0= ruleConnectedDevice
            {

            					newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_connectDevice_5_0=ruleConnectedDevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
            					}
            					add(
            						current,
            						"connectDevice",
            						lv_connectDevice_5_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironment.g:500:3: (otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTargetEnvironment.g:501:4: otherlv_6= ',' ( (lv_connectDevice_7_0= ruleConnectedDevice ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConfigConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTargetEnvironment.g:505:4: ( (lv_connectDevice_7_0= ruleConnectedDevice ) )
            	    // InternalTargetEnvironment.g:506:5: (lv_connectDevice_7_0= ruleConnectedDevice )
            	    {
            	    // InternalTargetEnvironment.g:506:5: (lv_connectDevice_7_0= ruleConnectedDevice )
            	    // InternalTargetEnvironment.g:507:6: lv_connectDevice_7_0= ruleConnectedDevice
            	    {

            	    						newCompositeNode(grammarAccess.getConfigConnectionAccess().getConnectDeviceConnectedDeviceParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_connectDevice_7_0=ruleConnectedDevice();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigConnectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectDevice",
            	    							lv_connectDevice_7_0,
            	    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.ConnectedDevice");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigConnectionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigConnectionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleCapabilityProperty"
    // InternalTargetEnvironment.g:537:1: entryRuleCapabilityProperty returns [EObject current=null] : iv_ruleCapabilityProperty= ruleCapabilityProperty EOF ;
    public final EObject entryRuleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProperty = null;


        try {
            // InternalTargetEnvironment.g:537:59: (iv_ruleCapabilityProperty= ruleCapabilityProperty EOF )
            // InternalTargetEnvironment.g:538:2: iv_ruleCapabilityProperty= ruleCapabilityProperty EOF
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
    // InternalTargetEnvironment.g:544:1: ruleCapabilityProperty returns [EObject current=null] : (otherlv_0= 'CapabilityProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= 'kind' ( (lv_kind_10_0= ruleCapabilityKind ) ) otherlv_11= '}' ) ;
    public final EObject ruleCapabilityProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;

        EObject lv_kind_10_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:550:2: ( (otherlv_0= 'CapabilityProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= 'kind' ( (lv_kind_10_0= ruleCapabilityKind ) ) otherlv_11= '}' ) )
            // InternalTargetEnvironment.g:551:2: (otherlv_0= 'CapabilityProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= 'kind' ( (lv_kind_10_0= ruleCapabilityKind ) ) otherlv_11= '}' )
            {
            // InternalTargetEnvironment.g:551:2: (otherlv_0= 'CapabilityProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= 'kind' ( (lv_kind_10_0= ruleCapabilityKind ) ) otherlv_11= '}' )
            // InternalTargetEnvironment.g:552:3: otherlv_0= 'CapabilityProperty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= 'kind' ( (lv_kind_10_0= ruleCapabilityKind ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapabilityPropertyAccess().getCapabilityPropertyKeyword_0());
            		
            // InternalTargetEnvironment.g:556:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTargetEnvironment.g:557:4: (lv_name_1_0= ruleEString )
            {
            // InternalTargetEnvironment.g:557:4: (lv_name_1_0= ruleEString )
            // InternalTargetEnvironment.g:558:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTargetEnvironment.g:579:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetEnvironment.g:580:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCapabilityPropertyAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCapabilityPropertyAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTargetEnvironment.g:588:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalTargetEnvironment.g:589:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalTargetEnvironment.g:589:5: (lv_value_5_0= ruleEString )
                    // InternalTargetEnvironment.g:590:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValueEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:607:4: (otherlv_6= ',' ( (lv_value_7_0= ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:608:5: otherlv_6= ',' ( (lv_value_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCapabilityPropertyAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:612:5: ( (lv_value_7_0= ruleEString ) )
                    	    // InternalTargetEnvironment.g:613:6: (lv_value_7_0= ruleEString )
                    	    {
                    	    // InternalTargetEnvironment.g:613:6: (lv_value_7_0= ruleEString )
                    	    // InternalTargetEnvironment.g:614:7: lv_value_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getValueEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_value_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getCapabilityPropertyAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getCapabilityPropertyAccess().getKindKeyword_4());
            		
            // InternalTargetEnvironment.g:641:3: ( (lv_kind_10_0= ruleCapabilityKind ) )
            // InternalTargetEnvironment.g:642:4: (lv_kind_10_0= ruleCapabilityKind )
            {
            // InternalTargetEnvironment.g:642:4: (lv_kind_10_0= ruleCapabilityKind )
            // InternalTargetEnvironment.g:643:5: lv_kind_10_0= ruleCapabilityKind
            {

            					newCompositeNode(grammarAccess.getCapabilityPropertyAccess().getKindCapabilityKindParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_kind_10_0=ruleCapabilityKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityPropertyRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_10_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.CapabilityKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCapabilityPropertyAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalTargetEnvironment.g:668:1: entryRuleAttributeKind returns [EObject current=null] : iv_ruleAttributeKind= ruleAttributeKind EOF ;
    public final EObject entryRuleAttributeKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeKind = null;


        try {
            // InternalTargetEnvironment.g:668:54: (iv_ruleAttributeKind= ruleAttributeKind EOF )
            // InternalTargetEnvironment.g:669:2: iv_ruleAttributeKind= ruleAttributeKind EOF
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
    // InternalTargetEnvironment.g:675:1: ruleAttributeKind returns [EObject current=null] : ( () otherlv_1= 'AttributeKind' ) ;
    public final EObject ruleAttributeKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironment.g:681:2: ( ( () otherlv_1= 'AttributeKind' ) )
            // InternalTargetEnvironment.g:682:2: ( () otherlv_1= 'AttributeKind' )
            {
            // InternalTargetEnvironment.g:682:2: ( () otherlv_1= 'AttributeKind' )
            // InternalTargetEnvironment.g:683:3: () otherlv_1= 'AttributeKind'
            {
            // InternalTargetEnvironment.g:683:3: ()
            // InternalTargetEnvironment.g:684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeKindAccess().getAttributeKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

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
    // InternalTargetEnvironment.g:698:1: entryRuleMaximumKind returns [EObject current=null] : iv_ruleMaximumKind= ruleMaximumKind EOF ;
    public final EObject entryRuleMaximumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumKind = null;


        try {
            // InternalTargetEnvironment.g:698:52: (iv_ruleMaximumKind= ruleMaximumKind EOF )
            // InternalTargetEnvironment.g:699:2: iv_ruleMaximumKind= ruleMaximumKind EOF
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
    // InternalTargetEnvironment.g:705:1: ruleMaximumKind returns [EObject current=null] : ( () otherlv_1= 'MaximumKind' ) ;
    public final EObject ruleMaximumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironment.g:711:2: ( ( () otherlv_1= 'MaximumKind' ) )
            // InternalTargetEnvironment.g:712:2: ( () otherlv_1= 'MaximumKind' )
            {
            // InternalTargetEnvironment.g:712:2: ( () otherlv_1= 'MaximumKind' )
            // InternalTargetEnvironment.g:713:3: () otherlv_1= 'MaximumKind'
            {
            // InternalTargetEnvironment.g:713:3: ()
            // InternalTargetEnvironment.g:714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaximumKindAccess().getMaximumKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalTargetEnvironment.g:728:1: entryRuleMinimumKind returns [EObject current=null] : iv_ruleMinimumKind= ruleMinimumKind EOF ;
    public final EObject entryRuleMinimumKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumKind = null;


        try {
            // InternalTargetEnvironment.g:728:52: (iv_ruleMinimumKind= ruleMinimumKind EOF )
            // InternalTargetEnvironment.g:729:2: iv_ruleMinimumKind= ruleMinimumKind EOF
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
    // InternalTargetEnvironment.g:735:1: ruleMinimumKind returns [EObject current=null] : ( () otherlv_1= 'MinimumKind' ) ;
    public final EObject ruleMinimumKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironment.g:741:2: ( ( () otherlv_1= 'MinimumKind' ) )
            // InternalTargetEnvironment.g:742:2: ( () otherlv_1= 'MinimumKind' )
            {
            // InternalTargetEnvironment.g:742:2: ( () otherlv_1= 'MinimumKind' )
            // InternalTargetEnvironment.g:743:3: () otherlv_1= 'MinimumKind'
            {
            // InternalTargetEnvironment.g:743:3: ()
            // InternalTargetEnvironment.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinimumKindAccess().getMinimumKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

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
    // InternalTargetEnvironment.g:758:1: entryRuleSelectionKind returns [EObject current=null] : iv_ruleSelectionKind= ruleSelectionKind EOF ;
    public final EObject entryRuleSelectionKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionKind = null;


        try {
            // InternalTargetEnvironment.g:758:54: (iv_ruleSelectionKind= ruleSelectionKind EOF )
            // InternalTargetEnvironment.g:759:2: iv_ruleSelectionKind= ruleSelectionKind EOF
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
    // InternalTargetEnvironment.g:765:1: ruleSelectionKind returns [EObject current=null] : ( () otherlv_1= 'SelectionKind' ) ;
    public final EObject ruleSelectionKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTargetEnvironment.g:771:2: ( ( () otherlv_1= 'SelectionKind' ) )
            // InternalTargetEnvironment.g:772:2: ( () otherlv_1= 'SelectionKind' )
            {
            // InternalTargetEnvironment.g:772:2: ( () otherlv_1= 'SelectionKind' )
            // InternalTargetEnvironment.g:773:3: () otherlv_1= 'SelectionKind'
            {
            // InternalTargetEnvironment.g:773:3: ()
            // InternalTargetEnvironment.g:774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectionKindAccess().getSelectionKindAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProperty"
    // InternalTargetEnvironment.g:788:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalTargetEnvironment.g:788:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalTargetEnvironment.g:789:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalTargetEnvironment.g:795:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:801:2: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalTargetEnvironment.g:802:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalTargetEnvironment.g:802:2: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalTargetEnvironment.g:803:3: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalTargetEnvironment.g:803:3: ()
            // InternalTargetEnvironment.g:804:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            // InternalTargetEnvironment.g:814:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironment.g:815:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironment.g:815:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironment.g:816:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTargetEnvironment.g:837:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetEnvironment.g:838:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getValueKeyword_4_0());
                    			
                    // InternalTargetEnvironment.g:842:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalTargetEnvironment.g:843:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalTargetEnvironment.g:843:5: (lv_value_5_0= ruleEString )
                    // InternalTargetEnvironment.g:844:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleIndirectConnection"
    // InternalTargetEnvironment.g:870:1: entryRuleIndirectConnection returns [EObject current=null] : iv_ruleIndirectConnection= ruleIndirectConnection EOF ;
    public final EObject entryRuleIndirectConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectConnection = null;


        try {
            // InternalTargetEnvironment.g:870:59: (iv_ruleIndirectConnection= ruleIndirectConnection EOF )
            // InternalTargetEnvironment.g:871:2: iv_ruleIndirectConnection= ruleIndirectConnection EOF
            {
             newCompositeNode(grammarAccess.getIndirectConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndirectConnection=ruleIndirectConnection();

            state._fsp--;

             current =iv_ruleIndirectConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndirectConnection"


    // $ANTLR start "ruleIndirectConnection"
    // InternalTargetEnvironment.g:877:1: ruleIndirectConnection returns [EObject current=null] : ( () otherlv_1= 'IndirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleIndirectConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:883:2: ( ( () otherlv_1= 'IndirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalTargetEnvironment.g:884:2: ( () otherlv_1= 'IndirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalTargetEnvironment.g:884:2: ( () otherlv_1= 'IndirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalTargetEnvironment.g:885:3: () otherlv_1= 'IndirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalTargetEnvironment.g:885:3: ()
            // InternalTargetEnvironment.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndirectConnectionAccess().getIndirectConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIndirectConnectionAccess().getIndirectConnectionKeyword_1());
            		
            // InternalTargetEnvironment.g:896:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironment.g:897:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironment.g:897:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironment.g:898:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndirectConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getIndirectConnectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTargetEnvironment.g:919:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetEnvironment.g:920:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIndirectConnectionAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getIndirectConnectionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTargetEnvironment.g:928:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalTargetEnvironment.g:929:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalTargetEnvironment.g:929:5: (lv_properties_6_0= ruleProperty )
                    // InternalTargetEnvironment.g:930:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getIndirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:947:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:948:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getIndirectConnectionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:952:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalTargetEnvironment.g:953:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalTargetEnvironment.g:953:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalTargetEnvironment.g:954:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getIndirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIndirectConnectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getIndirectConnectionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIndirectConnectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndirectConnection"


    // $ANTLR start "entryRuleDirectConnection"
    // InternalTargetEnvironment.g:985:1: entryRuleDirectConnection returns [EObject current=null] : iv_ruleDirectConnection= ruleDirectConnection EOF ;
    public final EObject entryRuleDirectConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectConnection = null;


        try {
            // InternalTargetEnvironment.g:985:57: (iv_ruleDirectConnection= ruleDirectConnection EOF )
            // InternalTargetEnvironment.g:986:2: iv_ruleDirectConnection= ruleDirectConnection EOF
            {
             newCompositeNode(grammarAccess.getDirectConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectConnection=ruleDirectConnection();

            state._fsp--;

             current =iv_ruleDirectConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectConnection"


    // $ANTLR start "ruleDirectConnection"
    // InternalTargetEnvironment.g:992:1: ruleDirectConnection returns [EObject current=null] : ( () otherlv_1= 'DirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDirectConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:998:2: ( ( () otherlv_1= 'DirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalTargetEnvironment.g:999:2: ( () otherlv_1= 'DirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalTargetEnvironment.g:999:2: ( () otherlv_1= 'DirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalTargetEnvironment.g:1000:3: () otherlv_1= 'DirectConnection' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalTargetEnvironment.g:1000:3: ()
            // InternalTargetEnvironment.g:1001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectConnectionAccess().getDirectConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectConnectionAccess().getDirectConnectionKeyword_1());
            		
            // InternalTargetEnvironment.g:1011:3: ( (lv_name_2_0= ruleEString ) )
            // InternalTargetEnvironment.g:1012:4: (lv_name_2_0= ruleEString )
            {
            // InternalTargetEnvironment.g:1012:4: (lv_name_2_0= ruleEString )
            // InternalTargetEnvironment.g:1013:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDirectConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDirectConnectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTargetEnvironment.g:1034:3: (otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetEnvironment.g:1035:4: otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDirectConnectionAccess().getPropertiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getDirectConnectionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTargetEnvironment.g:1043:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalTargetEnvironment.g:1044:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalTargetEnvironment.g:1044:5: (lv_properties_6_0= ruleProperty )
                    // InternalTargetEnvironment.g:1045:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getDirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:1062:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:1063:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDirectConnectionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:1067:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalTargetEnvironment.g:1068:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalTargetEnvironment.g:1068:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalTargetEnvironment.g:1069:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getDirectConnectionAccess().getPropertiesPropertyParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDirectConnectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDirectConnectionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDirectConnectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectConnection"


    // $ANTLR start "entryRuleConnectedDevice"
    // InternalTargetEnvironment.g:1100:1: entryRuleConnectedDevice returns [EObject current=null] : iv_ruleConnectedDevice= ruleConnectedDevice EOF ;
    public final EObject entryRuleConnectedDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectedDevice = null;


        try {
            // InternalTargetEnvironment.g:1100:56: (iv_ruleConnectedDevice= ruleConnectedDevice EOF )
            // InternalTargetEnvironment.g:1101:2: iv_ruleConnectedDevice= ruleConnectedDevice EOF
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
    // InternalTargetEnvironment.g:1107:1: ruleConnectedDevice returns [EObject current=null] : (otherlv_0= 'ConnectedDevice' otherlv_1= '{' otherlv_2= 'refDevice' ( ( ruleEString ) ) otherlv_4= 'refConnection' ( ( ruleEString ) ) (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleConnectedDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalTargetEnvironment.g:1113:2: ( (otherlv_0= 'ConnectedDevice' otherlv_1= '{' otherlv_2= 'refDevice' ( ( ruleEString ) ) otherlv_4= 'refConnection' ( ( ruleEString ) ) (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalTargetEnvironment.g:1114:2: (otherlv_0= 'ConnectedDevice' otherlv_1= '{' otherlv_2= 'refDevice' ( ( ruleEString ) ) otherlv_4= 'refConnection' ( ( ruleEString ) ) (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalTargetEnvironment.g:1114:2: (otherlv_0= 'ConnectedDevice' otherlv_1= '{' otherlv_2= 'refDevice' ( ( ruleEString ) ) otherlv_4= 'refConnection' ( ( ruleEString ) ) (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalTargetEnvironment.g:1115:3: otherlv_0= 'ConnectedDevice' otherlv_1= '{' otherlv_2= 'refDevice' ( ( ruleEString ) ) otherlv_4= 'refConnection' ( ( ruleEString ) ) (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectedDeviceAccess().getConnectedDeviceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectedDeviceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectedDeviceAccess().getRefDeviceKeyword_2());
            		
            // InternalTargetEnvironment.g:1127:3: ( ( ruleEString ) )
            // InternalTargetEnvironment.g:1128:4: ( ruleEString )
            {
            // InternalTargetEnvironment.g:1128:4: ( ruleEString )
            // InternalTargetEnvironment.g:1129:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectedDeviceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefDeviceDeviceInstanceCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectedDeviceAccess().getRefConnectionKeyword_4());
            		
            // InternalTargetEnvironment.g:1147:3: ( ( ruleEString ) )
            // InternalTargetEnvironment.g:1148:4: ( ruleEString )
            {
            // InternalTargetEnvironment.g:1148:4: ( ruleEString )
            // InternalTargetEnvironment.g:1149:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectedDeviceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectedDeviceAccess().getRefConnectionConnectionCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTargetEnvironment.g:1163:3: (otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTargetEnvironment.g:1164:4: otherlv_6= 'properties' otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getConnectedDeviceAccess().getPropertiesKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectedDeviceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalTargetEnvironment.g:1172:4: ( (lv_properties_8_0= ruleProperty ) )
                    // InternalTargetEnvironment.g:1173:5: (lv_properties_8_0= ruleProperty )
                    {
                    // InternalTargetEnvironment.g:1173:5: (lv_properties_8_0= ruleProperty )
                    // InternalTargetEnvironment.g:1174:6: lv_properties_8_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesPropertyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_properties_8_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_8_0,
                    							"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTargetEnvironment.g:1191:4: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalTargetEnvironment.g:1192:5: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getConnectedDeviceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalTargetEnvironment.g:1196:5: ( (lv_properties_10_0= ruleProperty ) )
                    	    // InternalTargetEnvironment.g:1197:6: (lv_properties_10_0= ruleProperty )
                    	    {
                    	    // InternalTargetEnvironment.g:1197:6: (lv_properties_10_0= ruleProperty )
                    	    // InternalTargetEnvironment.g:1198:7: lv_properties_10_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnectedDeviceAccess().getPropertiesPropertyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_properties_10_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnectedDeviceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_10_0,
                    	    								"de.fraunhofer.ipa.targetEnvironment.TargetEnvironment.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getConnectedDeviceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getConnectedDeviceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});

}