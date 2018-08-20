package ac.soton.xtheory.parser.antlr.internal;

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
import ac.soton.xtheory.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'theory'", "'('", "')'", "'import'", "'type'", "'op'", "'axm'", "'thm'", "'ruleblock'", "'end'", "'='", "'|'", "','", "':'", "'associative'", "'commutative'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'variables'", "'rule'", "'=='", "'|-'", "'required'", "'prefix'", "'infix'", "'postfix'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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


        public InternalTheoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTheoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTheoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTheory.g"; }



     	private TheoryGrammarAccess grammarAccess;

        public InternalTheoryParser(TokenStream input, TheoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Theory";
       	}

       	@Override
       	protected TheoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTheory"
    // InternalTheory.g:65:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalTheory.g:65:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalTheory.g:66:2: iv_ruleTheory= ruleTheory EOF
            {
             newCompositeNode(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheory=ruleTheory();

            state._fsp--;

             current =iv_ruleTheory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheory.g:72:1: ruleTheory returns [EObject current=null] : (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )* otherlv_18= 'end' ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_imports_6_0=null;
        Token lv_imports_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_internalElements_9_0 = null;

        EObject lv_internalElements_11_0 = null;

        EObject lv_internalElements_13_0 = null;

        EObject lv_internalElements_15_0 = null;

        EObject lv_ruleBlocks_17_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:78:2: ( (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )* otherlv_18= 'end' ) )
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )* otherlv_18= 'end' )
            {
            // InternalTheory.g:79:2: (otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )* otherlv_18= 'end' )
            // InternalTheory.g:80:3: otherlv_0= 'theory' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )? (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )? ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )* otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoryAccess().getTheoryKeyword_0());
            		
            // InternalTheory.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:102:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTheory.g:103:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalTheory.g:107:4: ( (lv_parameters_3_0= ruleParameter ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTheory.g:108:5: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalTheory.g:108:5: (lv_parameters_3_0= ruleParameter )
                    	    // InternalTheory.g:109:6: lv_parameters_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTheoryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_3_0,
                    	    							"ac.soton.xtheory.Theory.Parameter");
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

                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalTheory.g:131:3: (otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTheory.g:132:4: otherlv_5= 'import' ( (lv_imports_6_0= RULE_ID ) ) ( (lv_imports_7_0= RULE_ID ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTheoryAccess().getImportKeyword_3_0());
                    			
                    // InternalTheory.g:136:4: ( (lv_imports_6_0= RULE_ID ) )
                    // InternalTheory.g:137:5: (lv_imports_6_0= RULE_ID )
                    {
                    // InternalTheory.g:137:5: (lv_imports_6_0= RULE_ID )
                    // InternalTheory.g:138:6: lv_imports_6_0= RULE_ID
                    {
                    lv_imports_6_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_imports_6_0, grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTheoryRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"imports",
                    							lv_imports_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalTheory.g:154:4: ( (lv_imports_7_0= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTheory.g:155:5: (lv_imports_7_0= RULE_ID )
                    	    {
                    	    // InternalTheory.g:155:5: (lv_imports_7_0= RULE_ID )
                    	    // InternalTheory.g:156:6: lv_imports_7_0= RULE_ID
                    	    {
                    	    lv_imports_7_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(lv_imports_7_0, grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTheoryRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"imports",
                    	    							lv_imports_7_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

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

            // InternalTheory.g:173:3: ( (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) ) | (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) ) | (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) ) | (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) ) | (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) ) )*
            loop5:
            do {
                int alt5=6;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt5=1;
                    }
                    break;
                case 16:
                    {
                    alt5=2;
                    }
                    break;
                case 17:
                    {
                    alt5=3;
                    }
                    break;
                case 18:
                    {
                    alt5=4;
                    }
                    break;
                case 19:
                    {
                    alt5=5;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalTheory.g:174:4: (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) )
            	    {
            	    // InternalTheory.g:174:4: (otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) ) )
            	    // InternalTheory.g:175:5: otherlv_8= 'type' ( (lv_internalElements_9_0= ruleType ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getTheoryAccess().getTypeKeyword_4_0_0());
            	    				
            	    // InternalTheory.g:179:5: ( (lv_internalElements_9_0= ruleType ) )
            	    // InternalTheory.g:180:6: (lv_internalElements_9_0= ruleType )
            	    {
            	    // InternalTheory.g:180:6: (lv_internalElements_9_0= ruleType )
            	    // InternalTheory.g:181:7: lv_internalElements_9_0= ruleType
            	    {

            	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_internalElements_9_0=ruleType();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    							}
            	    							add(
            	    								current,
            	    								"internalElements",
            	    								lv_internalElements_9_0,
            	    								"ac.soton.xtheory.Theory.Type");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTheory.g:200:4: (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) )
            	    {
            	    // InternalTheory.g:200:4: (otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) ) )
            	    // InternalTheory.g:201:5: otherlv_10= 'op' ( (lv_internalElements_11_0= ruleOperator ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getTheoryAccess().getOpKeyword_4_1_0());
            	    				
            	    // InternalTheory.g:205:5: ( (lv_internalElements_11_0= ruleOperator ) )
            	    // InternalTheory.g:206:6: (lv_internalElements_11_0= ruleOperator )
            	    {
            	    // InternalTheory.g:206:6: (lv_internalElements_11_0= ruleOperator )
            	    // InternalTheory.g:207:7: lv_internalElements_11_0= ruleOperator
            	    {

            	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_internalElements_11_0=ruleOperator();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    							}
            	    							add(
            	    								current,
            	    								"internalElements",
            	    								lv_internalElements_11_0,
            	    								"ac.soton.xtheory.Theory.Operator");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTheory.g:226:4: (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) )
            	    {
            	    // InternalTheory.g:226:4: (otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) ) )
            	    // InternalTheory.g:227:5: otherlv_12= 'axm' ( (lv_internalElements_13_0= ruleAxiom ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

            	    					newLeafNode(otherlv_12, grammarAccess.getTheoryAccess().getAxmKeyword_4_2_0());
            	    				
            	    // InternalTheory.g:231:5: ( (lv_internalElements_13_0= ruleAxiom ) )
            	    // InternalTheory.g:232:6: (lv_internalElements_13_0= ruleAxiom )
            	    {
            	    // InternalTheory.g:232:6: (lv_internalElements_13_0= ruleAxiom )
            	    // InternalTheory.g:233:7: lv_internalElements_13_0= ruleAxiom
            	    {

            	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_internalElements_13_0=ruleAxiom();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    							}
            	    							add(
            	    								current,
            	    								"internalElements",
            	    								lv_internalElements_13_0,
            	    								"ac.soton.xtheory.Theory.Axiom");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTheory.g:252:4: (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) )
            	    {
            	    // InternalTheory.g:252:4: (otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) ) )
            	    // InternalTheory.g:253:5: otherlv_14= 'thm' ( (lv_internalElements_15_0= ruleTheorem ) )
            	    {
            	    otherlv_14=(Token)match(input,18,FOLLOW_9); 

            	    					newLeafNode(otherlv_14, grammarAccess.getTheoryAccess().getThmKeyword_4_3_0());
            	    				
            	    // InternalTheory.g:257:5: ( (lv_internalElements_15_0= ruleTheorem ) )
            	    // InternalTheory.g:258:6: (lv_internalElements_15_0= ruleTheorem )
            	    {
            	    // InternalTheory.g:258:6: (lv_internalElements_15_0= ruleTheorem )
            	    // InternalTheory.g:259:7: lv_internalElements_15_0= ruleTheorem
            	    {

            	    							newCompositeNode(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_internalElements_15_0=ruleTheorem();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    							}
            	    							add(
            	    								current,
            	    								"internalElements",
            	    								lv_internalElements_15_0,
            	    								"ac.soton.xtheory.Theory.Theorem");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTheory.g:278:4: (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) )
            	    {
            	    // InternalTheory.g:278:4: (otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) ) )
            	    // InternalTheory.g:279:5: otherlv_16= 'ruleblock' ( (lv_ruleBlocks_17_0= ruleRuleBlock ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_10); 

            	    					newLeafNode(otherlv_16, grammarAccess.getTheoryAccess().getRuleblockKeyword_4_4_0());
            	    				
            	    // InternalTheory.g:283:5: ( (lv_ruleBlocks_17_0= ruleRuleBlock ) )
            	    // InternalTheory.g:284:6: (lv_ruleBlocks_17_0= ruleRuleBlock )
            	    {
            	    // InternalTheory.g:284:6: (lv_ruleBlocks_17_0= ruleRuleBlock )
            	    // InternalTheory.g:285:7: lv_ruleBlocks_17_0= ruleRuleBlock
            	    {

            	    							newCompositeNode(grammarAccess.getTheoryAccess().getRuleBlocksRuleBlockParserRuleCall_4_4_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_ruleBlocks_17_0=ruleRuleBlock();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTheoryRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ruleBlocks",
            	    								lv_ruleBlocks_17_0,
            	    								"ac.soton.xtheory.Theory.RuleBlock");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getTheoryAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleParameter"
    // InternalTheory.g:312:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTheory.g:312:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalTheory.g:313:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTheory.g:319:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTheory.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTheory.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:327:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:327:3: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:328:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalTheory.g:347:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTheory.g:347:45: (iv_ruleType= ruleType EOF )
            // InternalTheory.g:348:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTheory.g:354:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? otherlv_4= '=' ( (lv_constructors_5_0= ruleConstructor ) ) (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_constructors_5_0 = null;

        EObject lv_constructors_7_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:360:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? otherlv_4= '=' ( (lv_constructors_5_0= ruleConstructor ) ) (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )* ) )
            // InternalTheory.g:361:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? otherlv_4= '=' ( (lv_constructors_5_0= ruleConstructor ) ) (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )* )
            {
            // InternalTheory.g:361:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? otherlv_4= '=' ( (lv_constructors_5_0= ruleConstructor ) ) (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )* )
            // InternalTheory.g:362:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )? otherlv_4= '=' ( (lv_constructors_5_0= ruleConstructor ) ) (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )*
            {
            // InternalTheory.g:362:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:363:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:363:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:364:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:380:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTheory.g:381:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTheory.g:385:4: ( (otherlv_2= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTheory.g:386:5: (otherlv_2= RULE_ID )
                    	    {
                    	    // InternalTheory.g:386:5: (otherlv_2= RULE_ID )
                    	    // InternalTheory.g:387:6: otherlv_2= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTypeRule());
                    	    						}
                    	    					
                    	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getParametersParameterCrossReference_1_1_0());
                    	    					

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

                    otherlv_3=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalTheory.g:407:3: ( (lv_constructors_5_0= ruleConstructor ) )
            // InternalTheory.g:408:4: (lv_constructors_5_0= ruleConstructor )
            {
            // InternalTheory.g:408:4: (lv_constructors_5_0= ruleConstructor )
            // InternalTheory.g:409:5: lv_constructors_5_0= ruleConstructor
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_constructors_5_0=ruleConstructor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					add(
            						current,
            						"constructors",
            						lv_constructors_5_0,
            						"ac.soton.xtheory.Theory.Constructor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTheory.g:426:3: (otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTheory.g:427:4: otherlv_6= '|' ( (lv_constructors_7_0= ruleConstructor ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalTheory.g:431:4: ( (lv_constructors_7_0= ruleConstructor ) )
            	    // InternalTheory.g:432:5: (lv_constructors_7_0= ruleConstructor )
            	    {
            	    // InternalTheory.g:432:5: (lv_constructors_7_0= ruleConstructor )
            	    // InternalTheory.g:433:6: lv_constructors_7_0= ruleConstructor
            	    {

            	    						newCompositeNode(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_constructors_7_0=ruleConstructor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constructors",
            	    							lv_constructors_7_0,
            	    							"ac.soton.xtheory.Theory.Constructor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleConstructor"
    // InternalTheory.g:455:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalTheory.g:455:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalTheory.g:456:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalTheory.g:462:1: ruleConstructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_destructors_2_0 = null;

        EObject lv_destructors_4_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:468:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )? ) )
            // InternalTheory.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )? )
            {
            // InternalTheory.g:469:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )? )
            // InternalTheory.g:470:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )?
            {
            // InternalTheory.g:470:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:471:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:471:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:472:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:488:3: (otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTheory.g:489:4: otherlv_1= '(' ( (lv_destructors_2_0= ruleDestructor ) ) (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTheory.g:493:4: ( (lv_destructors_2_0= ruleDestructor ) )
                    // InternalTheory.g:494:5: (lv_destructors_2_0= ruleDestructor )
                    {
                    // InternalTheory.g:494:5: (lv_destructors_2_0= ruleDestructor )
                    // InternalTheory.g:495:6: lv_destructors_2_0= ruleDestructor
                    {

                    						newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_destructors_2_0=ruleDestructor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstructorRule());
                    						}
                    						add(
                    							current,
                    							"destructors",
                    							lv_destructors_2_0,
                    							"ac.soton.xtheory.Theory.Destructor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:512:4: (otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTheory.g:513:5: otherlv_3= ',' ( (lv_destructors_4_0= ruleDestructor ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTheory.g:517:5: ( (lv_destructors_4_0= ruleDestructor ) )
                    	    // InternalTheory.g:518:6: (lv_destructors_4_0= ruleDestructor )
                    	    {
                    	    // InternalTheory.g:518:6: (lv_destructors_4_0= ruleDestructor )
                    	    // InternalTheory.g:519:7: lv_destructors_4_0= ruleDestructor
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_destructors_4_0=ruleDestructor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"destructors",
                    	    								lv_destructors_4_0,
                    	    								"ac.soton.xtheory.Theory.Destructor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleDestructor"
    // InternalTheory.g:546:1: entryRuleDestructor returns [EObject current=null] : iv_ruleDestructor= ruleDestructor EOF ;
    public final EObject entryRuleDestructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructor = null;


        try {
            // InternalTheory.g:546:51: (iv_ruleDestructor= ruleDestructor EOF )
            // InternalTheory.g:547:2: iv_ruleDestructor= ruleDestructor EOF
            {
             newCompositeNode(grammarAccess.getDestructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestructor=ruleDestructor();

            state._fsp--;

             current =iv_ruleDestructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestructor"


    // $ANTLR start "ruleDestructor"
    // InternalTheory.g:553:1: ruleDestructor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDestructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:559:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:560:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:560:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            // InternalTheory.g:561:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:561:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:562:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:562:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:563:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDestructorAccess().getColonKeyword_1());
            		
            // InternalTheory.g:583:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalTheory.g:584:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalTheory.g:584:4: (lv_type_2_0= RULE_STRING )
            // InternalTheory.g:585:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDestructor"


    // $ANTLR start "entryRuleOperator"
    // InternalTheory.g:605:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalTheory.g:605:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalTheory.g:606:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalTheory.g:612:1: ruleOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )? (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )? (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )? ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token lv_associative_10_0=null;
        Token lv_commutative_11_0=null;
        Token otherlv_12=null;
        Token lv_precedent_13_0=null;
        Token otherlv_14=null;
        Token lv_wd_15_0=null;
        Token otherlv_16=null;
        Token lv_definition_17_0=null;
        Token otherlv_18=null;
        Token lv_case_19_0=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        Enumerator lv_notation_9_0 = null;

        EObject lv_cases_20_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:618:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )? (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )? (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )? ) )
            // InternalTheory.g:619:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )? (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )? (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )? )
            {
            // InternalTheory.g:619:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )? (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )? (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )? )
            // InternalTheory.g:620:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) ) (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )? (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )? (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )?
            {
            // InternalTheory.g:620:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:621:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:621:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:622:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTheory.g:638:3: (otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTheory.g:639:4: otherlv_1= '(' ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTheory.g:643:4: ( (lv_arguments_2_0= ruleArgument ) )
                    // InternalTheory.g:644:5: (lv_arguments_2_0= ruleArgument )
                    {
                    // InternalTheory.g:644:5: (lv_arguments_2_0= ruleArgument )
                    // InternalTheory.g:645:6: lv_arguments_2_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_arguments_2_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperatorRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"ac.soton.xtheory.Theory.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTheory.g:662:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalTheory.g:663:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTheory.g:667:5: ( (lv_arguments_4_0= ruleArgument ) )
                    	    // InternalTheory.g:668:6: (lv_arguments_4_0= ruleArgument )
                    	    {
                    	    // InternalTheory.g:668:6: (lv_arguments_4_0= ruleArgument )
                    	    // InternalTheory.g:669:7: lv_arguments_4_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_arguments_4_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"ac.soton.xtheory.Theory.Argument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalTheory.g:692:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) ) )
            // InternalTheory.g:693:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) )
            {
            // InternalTheory.g:693:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* ) )
            // InternalTheory.g:694:5: ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            				
            // InternalTheory.g:697:5: ( ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )* )
            // InternalTheory.g:698:6: ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )*
            {
            // InternalTheory.g:698:6: ( ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) ) )*
            loop14:
            do {
                int alt14=4;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 >= 37 && LA14_0 <= 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                    alt14=3;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTheory.g:699:4: ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalTheory.g:699:4: ({...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalTheory.g:700:5: {...}? => ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalTheory.g:700:105: ( ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) ) )
            	    // InternalTheory.g:701:6: ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalTheory.g:704:9: ({...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) ) )
            	    // InternalTheory.g:704:10: {...}? => (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:704:19: (otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) )
            	    // InternalTheory.g:704:20: otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_17); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperatorAccess().getColonKeyword_2_0_0());
            	    								
            	    // InternalTheory.g:708:9: ( (lv_type_8_0= RULE_STRING ) )
            	    // InternalTheory.g:709:10: (lv_type_8_0= RULE_STRING )
            	    {
            	    // InternalTheory.g:709:10: (lv_type_8_0= RULE_STRING )
            	    // InternalTheory.g:710:11: lv_type_8_0= RULE_STRING
            	    {
            	    lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    											newLeafNode(lv_type_8_0, grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getOperatorRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												lv_type_8_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTheory.g:732:4: ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) )
            	    {
            	    // InternalTheory.g:732:4: ({...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) ) )
            	    // InternalTheory.g:733:5: {...}? => ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalTheory.g:733:105: ( ({...}? => ( (lv_notation_9_0= ruleNotation ) ) ) )
            	    // InternalTheory.g:734:6: ({...}? => ( (lv_notation_9_0= ruleNotation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalTheory.g:737:9: ({...}? => ( (lv_notation_9_0= ruleNotation ) ) )
            	    // InternalTheory.g:737:10: {...}? => ( (lv_notation_9_0= ruleNotation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:737:19: ( (lv_notation_9_0= ruleNotation ) )
            	    // InternalTheory.g:737:20: (lv_notation_9_0= ruleNotation )
            	    {
            	    // InternalTheory.g:737:20: (lv_notation_9_0= ruleNotation )
            	    // InternalTheory.g:738:10: lv_notation_9_0= ruleNotation
            	    {

            	    										newCompositeNode(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_19);
            	    lv_notation_9_0=ruleNotation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getOperatorRule());
            	    										}
            	    										set(
            	    											current,
            	    											"notation",
            	    											lv_notation_9_0,
            	    											"ac.soton.xtheory.Theory.Notation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTheory.g:760:4: ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) )
            	    {
            	    // InternalTheory.g:760:4: ({...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) ) )
            	    // InternalTheory.g:761:5: {...}? => ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalTheory.g:761:105: ( ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) ) )
            	    // InternalTheory.g:762:6: ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalTheory.g:765:9: ({...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? ) )
            	    // InternalTheory.g:765:10: {...}? => ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperator", "true");
            	    }
            	    // InternalTheory.g:765:19: ( ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )? )
            	    // InternalTheory.g:765:20: ( (lv_associative_10_0= 'associative' ) ) ( (lv_commutative_11_0= 'commutative' ) )?
            	    {
            	    // InternalTheory.g:765:20: ( (lv_associative_10_0= 'associative' ) )
            	    // InternalTheory.g:766:10: (lv_associative_10_0= 'associative' )
            	    {
            	    // InternalTheory.g:766:10: (lv_associative_10_0= 'associative' )
            	    // InternalTheory.g:767:11: lv_associative_10_0= 'associative'
            	    {
            	    lv_associative_10_0=(Token)match(input,25,FOLLOW_20); 

            	    											newLeafNode(lv_associative_10_0, grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_2_2_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getOperatorRule());
            	    											}
            	    											setWithLastConsumed(current, "associative", true, "associative");
            	    										

            	    }


            	    }

            	    // InternalTheory.g:779:9: ( (lv_commutative_11_0= 'commutative' ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==26) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalTheory.g:780:10: (lv_commutative_11_0= 'commutative' )
            	            {
            	            // InternalTheory.g:780:10: (lv_commutative_11_0= 'commutative' )
            	            // InternalTheory.g:781:11: lv_commutative_11_0= 'commutative'
            	            {
            	            lv_commutative_11_0=(Token)match(input,26,FOLLOW_19); 

            	            											newLeafNode(lv_commutative_11_0, grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_2_2_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getOperatorRule());
            	            											}
            	            											setWithLastConsumed(current, "commutative", true, "commutative");
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            				

            }

            // InternalTheory.g:806:3: (otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTheory.g:807:4: otherlv_12= '#' ( (lv_precedent_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getOperatorAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalTheory.g:811:4: ( (lv_precedent_13_0= RULE_INT ) )
                    // InternalTheory.g:812:5: (lv_precedent_13_0= RULE_INT )
                    {
                    // InternalTheory.g:812:5: (lv_precedent_13_0= RULE_INT )
                    // InternalTheory.g:813:6: lv_precedent_13_0= RULE_INT
                    {
                    lv_precedent_13_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_precedent_13_0, grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"precedent",
                    							lv_precedent_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:830:3: (otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTheory.g:831:4: otherlv_14= 'for' ( (lv_wd_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getOperatorAccess().getForKeyword_4_0());
                    			
                    // InternalTheory.g:835:4: ( (lv_wd_15_0= RULE_STRING ) )
                    // InternalTheory.g:836:5: (lv_wd_15_0= RULE_STRING )
                    {
                    // InternalTheory.g:836:5: (lv_wd_15_0= RULE_STRING )
                    // InternalTheory.g:837:6: lv_wd_15_0= RULE_STRING
                    {
                    lv_wd_15_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_wd_15_0, grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperatorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"wd",
                    							lv_wd_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTheory.g:854:3: (otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTheory.g:855:4: otherlv_16= '=' ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) )
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getOperatorAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalTheory.g:859:4: ( ( (lv_definition_17_0= RULE_STRING ) ) | (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_STRING) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==29) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTheory.g:860:5: ( (lv_definition_17_0= RULE_STRING ) )
                            {
                            // InternalTheory.g:860:5: ( (lv_definition_17_0= RULE_STRING ) )
                            // InternalTheory.g:861:6: (lv_definition_17_0= RULE_STRING )
                            {
                            // InternalTheory.g:861:6: (lv_definition_17_0= RULE_STRING )
                            // InternalTheory.g:862:7: lv_definition_17_0= RULE_STRING
                            {
                            lv_definition_17_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_definition_17_0, grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOperatorRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"definition",
                            								lv_definition_17_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTheory.g:879:5: (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ )
                            {
                            // InternalTheory.g:879:5: (otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+ )
                            // InternalTheory.g:880:6: otherlv_18= 'case' ( (lv_case_19_0= RULE_ID ) ) ( (lv_cases_20_0= ruleCase ) )+
                            {
                            otherlv_18=(Token)match(input,29,FOLLOW_3); 

                            						newLeafNode(otherlv_18, grammarAccess.getOperatorAccess().getCaseKeyword_5_1_1_0());
                            					
                            // InternalTheory.g:884:6: ( (lv_case_19_0= RULE_ID ) )
                            // InternalTheory.g:885:7: (lv_case_19_0= RULE_ID )
                            {
                            // InternalTheory.g:885:7: (lv_case_19_0= RULE_ID )
                            // InternalTheory.g:886:8: lv_case_19_0= RULE_ID
                            {
                            lv_case_19_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                            								newLeafNode(lv_case_19_0, grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_5_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getOperatorRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"case",
                            									lv_case_19_0,
                            									"org.eclipse.xtext.common.Terminals.ID");
                            							

                            }


                            }

                            // InternalTheory.g:902:6: ( (lv_cases_20_0= ruleCase ) )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==RULE_STRING) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalTheory.g:903:7: (lv_cases_20_0= ruleCase )
                            	    {
                            	    // InternalTheory.g:903:7: (lv_cases_20_0= ruleCase )
                            	    // InternalTheory.g:904:8: lv_cases_20_0= ruleCase
                            	    {

                            	    								newCompositeNode(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_5_1_1_2_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_cases_20_0=ruleCase();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getOperatorRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"cases",
                            	    									lv_cases_20_0,
                            	    									"ac.soton.xtheory.Theory.Case");
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


                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleArgument"
    // InternalTheory.g:928:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalTheory.g:928:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalTheory.g:929:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalTheory.g:935:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:941:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:942:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:942:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            // InternalTheory.g:943:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:943:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:944:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:944:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:945:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
            		
            // InternalTheory.g:965:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalTheory.g:966:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalTheory.g:966:4: (lv_type_2_0= RULE_STRING )
            // InternalTheory.g:967:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleCase"
    // InternalTheory.g:987:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalTheory.g:987:45: (iv_ruleCase= ruleCase EOF )
            // InternalTheory.g:988:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTheory.g:994:1: ruleCase returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        Token lv_formula_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1000:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1001:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1001:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1002:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_formula_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1002:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1003:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1003:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1004:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_pattern_0_0, grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:1024:3: ( (lv_formula_2_0= RULE_STRING ) )
            // InternalTheory.g:1025:4: (lv_formula_2_0= RULE_STRING )
            {
            // InternalTheory.g:1025:4: (lv_formula_2_0= RULE_STRING )
            // InternalTheory.g:1026:5: lv_formula_2_0= RULE_STRING
            {
            lv_formula_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_formula_2_0, grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"formula",
            						lv_formula_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAxiom"
    // InternalTheory.g:1046:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalTheory.g:1046:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalTheory.g:1047:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalTheory.g:1053:1: ruleAxiom returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_predicate_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1059:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1060:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1060:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1061:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAxiomAccess().getCommercialAtKeyword_0());
            		
            // InternalTheory.g:1065:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1066:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1066:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1067:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAxiomAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1087:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalTheory.g:1088:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalTheory.g:1088:4: (lv_predicate_3_0= RULE_STRING )
            // InternalTheory.g:1089:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAxiomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTheorem"
    // InternalTheory.g:1109:1: entryRuleTheorem returns [EObject current=null] : iv_ruleTheorem= ruleTheorem EOF ;
    public final EObject entryRuleTheorem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheorem = null;


        try {
            // InternalTheory.g:1109:48: (iv_ruleTheorem= ruleTheorem EOF )
            // InternalTheory.g:1110:2: iv_ruleTheorem= ruleTheorem EOF
            {
             newCompositeNode(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheorem=ruleTheorem();

            state._fsp--;

             current =iv_ruleTheorem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // InternalTheory.g:1116:1: ruleTheorem returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTheorem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_predicate_3_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1122:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1123:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1123:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) ) )
            // InternalTheory.g:1124:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_predicate_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoremAccess().getCommercialAtKeyword_0());
            		
            // InternalTheory.g:1128:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1129:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1129:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1130:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoremRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTheoremAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1150:3: ( (lv_predicate_3_0= RULE_STRING ) )
            // InternalTheory.g:1151:4: (lv_predicate_3_0= RULE_STRING )
            {
            // InternalTheory.g:1151:4: (lv_predicate_3_0= RULE_STRING )
            // InternalTheory.g:1152:5: lv_predicate_3_0= RULE_STRING
            {
            lv_predicate_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_predicate_3_0, grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoremRule());
            					}
            					setWithLastConsumed(
            						current,
            						"predicate",
            						lv_predicate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalTheory.g:1172:1: entryRuleRuleBlock returns [EObject current=null] : iv_ruleRuleBlock= ruleRuleBlock EOF ;
    public final EObject entryRuleRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBlock = null;


        try {
            // InternalTheory.g:1172:50: (iv_ruleRuleBlock= ruleRuleBlock EOF )
            // InternalTheory.g:1173:2: iv_ruleRuleBlock= ruleRuleBlock EOF
            {
             newCompositeNode(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBlock=ruleRuleBlock();

            state._fsp--;

             current =iv_ruleRuleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalTheory.g:1179:1: ruleRuleBlock returns [EObject current=null] : ( (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )? (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+ ) ;
    public final EObject ruleRuleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1185:2: ( ( (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )? (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+ ) )
            // InternalTheory.g:1186:2: ( (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )? (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+ )
            {
            // InternalTheory.g:1186:2: ( (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )? (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+ )
            // InternalTheory.g:1187:3: (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )? (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+
            {
            // InternalTheory.g:1187:3: (otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+ )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTheory.g:1188:4: otherlv_0= 'variables' ( (lv_variables_1_0= ruleVariable ) )+
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleBlockAccess().getVariablesKeyword_0_0());
                    			
                    // InternalTheory.g:1192:4: ( (lv_variables_1_0= ruleVariable ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalTheory.g:1193:5: (lv_variables_1_0= ruleVariable )
                    	    {
                    	    // InternalTheory.g:1193:5: (lv_variables_1_0= ruleVariable )
                    	    // InternalTheory.g:1194:6: lv_variables_1_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_variables_1_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_1_0,
                    	    							"ac.soton.xtheory.Theory.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }
                    break;

            }

            // InternalTheory.g:1212:3: (otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTheory.g:1213:4: otherlv_2= 'rule' ( (lv_rules_3_0= ruleRule ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRuleBlockAccess().getRuleKeyword_1_0());
            	    			
            	    // InternalTheory.g:1217:4: ( (lv_rules_3_0= ruleRule ) )
            	    // InternalTheory.g:1218:5: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalTheory.g:1218:5: (lv_rules_3_0= ruleRule )
            	    // InternalTheory.g:1219:6: lv_rules_3_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_3_0,
            	    							"ac.soton.xtheory.Theory.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalTheory.g:1241:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTheory.g:1241:45: (iv_ruleRule= ruleRule EOF )
            // InternalTheory.g:1242:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTheory.g:1248:1: ruleRule returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_rrule_3_0 = null;

        EObject lv_irule_4_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1254:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) ) ) )
            // InternalTheory.g:1255:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) ) )
            {
            // InternalTheory.g:1255:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) ) )
            // InternalTheory.g:1256:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getCommercialAtKeyword_0());
            		
            // InternalTheory.g:1260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheory.g:1261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheory.g:1261:4: (lv_name_1_0= RULE_ID )
            // InternalTheory.g:1262:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
            		
            // InternalTheory.g:1282:3: ( ( (lv_rrule_3_0= ruleRewriteRule ) ) | ( (lv_irule_4_0= ruleInferenceRule ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_STRING||(LA23_1>=35 && LA23_1<=36)) ) {
                    alt23=2;
                }
                else if ( (LA23_1==34) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTheory.g:1283:4: ( (lv_rrule_3_0= ruleRewriteRule ) )
                    {
                    // InternalTheory.g:1283:4: ( (lv_rrule_3_0= ruleRewriteRule ) )
                    // InternalTheory.g:1284:5: (lv_rrule_3_0= ruleRewriteRule )
                    {
                    // InternalTheory.g:1284:5: (lv_rrule_3_0= ruleRewriteRule )
                    // InternalTheory.g:1285:6: lv_rrule_3_0= ruleRewriteRule
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rrule_3_0=ruleRewriteRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"rrule",
                    							lv_rrule_3_0,
                    							"ac.soton.xtheory.Theory.RewriteRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1303:4: ( (lv_irule_4_0= ruleInferenceRule ) )
                    {
                    // InternalTheory.g:1303:4: ( (lv_irule_4_0= ruleInferenceRule ) )
                    // InternalTheory.g:1304:5: (lv_irule_4_0= ruleInferenceRule )
                    {
                    // InternalTheory.g:1304:5: (lv_irule_4_0= ruleInferenceRule )
                    // InternalTheory.g:1305:6: lv_irule_4_0= ruleInferenceRule
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_irule_4_0=ruleInferenceRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"irule",
                    							lv_irule_4_0,
                    							"ac.soton.xtheory.Theory.InferenceRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:1327:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTheory.g:1327:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTheory.g:1328:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTheory.g:1334:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1340:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1342:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1342:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTheory.g:1343:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTheory.g:1343:4: (lv_name_0_0= RULE_ID )
            // InternalTheory.g:1344:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalTheory.g:1364:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalTheory.g:1365:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalTheory.g:1365:4: (lv_type_2_0= RULE_STRING )
            // InternalTheory.g:1366:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:1386:1: entryRuleRewriteRule returns [EObject current=null] : iv_ruleRewriteRule= ruleRewriteRule EOF ;
    public final EObject entryRuleRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriteRule = null;


        try {
            // InternalTheory.g:1386:52: (iv_ruleRewriteRule= ruleRewriteRule EOF )
            // InternalTheory.g:1387:2: iv_ruleRewriteRule= ruleRewriteRule EOF
            {
             newCompositeNode(grammarAccess.getRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRewriteRule=ruleRewriteRule();

            state._fsp--;

             current =iv_ruleRewriteRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // InternalTheory.g:1393:1: ruleRewriteRule returns [EObject current=null] : ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) ) ;
    public final EObject ruleRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token otherlv_1=null;
        EObject lv_urule_2_0 = null;

        EObject lv_crule_3_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1399:2: ( ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) ) )
            // InternalTheory.g:1400:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) )
            {
            // InternalTheory.g:1400:2: ( ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) ) )
            // InternalTheory.g:1401:3: ( (lv_pattern_0_0= RULE_STRING ) ) otherlv_1= '==' ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) )
            {
            // InternalTheory.g:1401:3: ( (lv_pattern_0_0= RULE_STRING ) )
            // InternalTheory.g:1402:4: (lv_pattern_0_0= RULE_STRING )
            {
            // InternalTheory.g:1402:4: (lv_pattern_0_0= RULE_STRING )
            // InternalTheory.g:1403:5: lv_pattern_0_0= RULE_STRING
            {
            lv_pattern_0_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_pattern_0_0, grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalTheory.g:1423:3: ( ( (lv_urule_2_0= ruleUnconditionalRewrite ) ) | ( (lv_crule_3_0= ruleConditionalRewrite ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||(LA24_1>=15 && LA24_1<=20)||LA24_1==33) ) {
                    alt24=1;
                }
                else if ( (LA24_1==30) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalTheory.g:1424:4: ( (lv_urule_2_0= ruleUnconditionalRewrite ) )
                    {
                    // InternalTheory.g:1424:4: ( (lv_urule_2_0= ruleUnconditionalRewrite ) )
                    // InternalTheory.g:1425:5: (lv_urule_2_0= ruleUnconditionalRewrite )
                    {
                    // InternalTheory.g:1425:5: (lv_urule_2_0= ruleUnconditionalRewrite )
                    // InternalTheory.g:1426:6: lv_urule_2_0= ruleUnconditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_urule_2_0=ruleUnconditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"urule",
                    							lv_urule_2_0,
                    							"ac.soton.xtheory.Theory.UnconditionalRewrite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1444:4: ( (lv_crule_3_0= ruleConditionalRewrite ) )
                    {
                    // InternalTheory.g:1444:4: ( (lv_crule_3_0= ruleConditionalRewrite ) )
                    // InternalTheory.g:1445:5: (lv_crule_3_0= ruleConditionalRewrite )
                    {
                    // InternalTheory.g:1445:5: (lv_crule_3_0= ruleConditionalRewrite )
                    // InternalTheory.g:1446:6: lv_crule_3_0= ruleConditionalRewrite
                    {

                    						newCompositeNode(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_crule_3_0=ruleConditionalRewrite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
                    						}
                    						set(
                    							current,
                    							"crule",
                    							lv_crule_3_0,
                    							"ac.soton.xtheory.Theory.ConditionalRewrite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleInferenceRule"
    // InternalTheory.g:1468:1: entryRuleInferenceRule returns [EObject current=null] : iv_ruleInferenceRule= ruleInferenceRule EOF ;
    public final EObject entryRuleInferenceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInferenceRule = null;


        try {
            // InternalTheory.g:1468:54: (iv_ruleInferenceRule= ruleInferenceRule EOF )
            // InternalTheory.g:1469:2: iv_ruleInferenceRule= ruleInferenceRule EOF
            {
             newCompositeNode(grammarAccess.getInferenceRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInferenceRule=ruleInferenceRule();

            state._fsp--;

             current =iv_ruleInferenceRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInferenceRule"


    // $ANTLR start "ruleInferenceRule"
    // InternalTheory.g:1475:1: ruleInferenceRule returns [EObject current=null] : ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) ;
    public final EObject ruleInferenceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_given_0_0 = null;

        EObject lv_infer_2_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1481:2: ( ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) ) )
            // InternalTheory.g:1482:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            {
            // InternalTheory.g:1482:2: ( ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) ) )
            // InternalTheory.g:1483:3: ( (lv_given_0_0= ruleGiven ) )* otherlv_1= '|-' ( (lv_infer_2_0= ruleInfer ) )
            {
            // InternalTheory.g:1483:3: ( (lv_given_0_0= ruleGiven ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTheory.g:1484:4: (lv_given_0_0= ruleGiven )
            	    {
            	    // InternalTheory.g:1484:4: (lv_given_0_0= ruleGiven )
            	    // InternalTheory.g:1485:5: lv_given_0_0= ruleGiven
            	    {

            	    					newCompositeNode(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_given_0_0=ruleGiven();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInferenceRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"given",
            	    						lv_given_0_0,
            	    						"ac.soton.xtheory.Theory.Given");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_1=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1());
            		
            // InternalTheory.g:1506:3: ( (lv_infer_2_0= ruleInfer ) )
            // InternalTheory.g:1507:4: (lv_infer_2_0= ruleInfer )
            {
            // InternalTheory.g:1507:4: (lv_infer_2_0= ruleInfer )
            // InternalTheory.g:1508:5: lv_infer_2_0= ruleInfer
            {

            					newCompositeNode(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_infer_2_0=ruleInfer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInferenceRuleRule());
            					}
            					set(
            						current,
            						"infer",
            						lv_infer_2_0,
            						"ac.soton.xtheory.Theory.Infer");
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
    // $ANTLR end "ruleInferenceRule"


    // $ANTLR start "entryRuleGiven"
    // InternalTheory.g:1529:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalTheory.g:1529:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalTheory.g:1530:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalTheory.g:1536:1: ruleGiven returns [EObject current=null] : ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;
        Token lv_required_1_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1542:2: ( ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? ) )
            // InternalTheory.g:1543:2: ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            {
            // InternalTheory.g:1543:2: ( ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )? )
            // InternalTheory.g:1544:3: ( (lv_expression_0_0= RULE_STRING ) ) ( (lv_required_1_0= 'required' ) )?
            {
            // InternalTheory.g:1544:3: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalTheory.g:1545:4: (lv_expression_0_0= RULE_STRING )
            {
            // InternalTheory.g:1545:4: (lv_expression_0_0= RULE_STRING )
            // InternalTheory.g:1546:5: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_expression_0_0, grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTheory.g:1562:3: ( (lv_required_1_0= 'required' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTheory.g:1563:4: (lv_required_1_0= 'required' )
                    {
                    // InternalTheory.g:1563:4: (lv_required_1_0= 'required' )
                    // InternalTheory.g:1564:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGivenRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleInfer"
    // InternalTheory.g:1580:1: entryRuleInfer returns [EObject current=null] : iv_ruleInfer= ruleInfer EOF ;
    public final EObject entryRuleInfer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfer = null;


        try {
            // InternalTheory.g:1580:46: (iv_ruleInfer= ruleInfer EOF )
            // InternalTheory.g:1581:2: iv_ruleInfer= ruleInfer EOF
            {
             newCompositeNode(grammarAccess.getInferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfer=ruleInfer();

            state._fsp--;

             current =iv_ruleInfer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfer"


    // $ANTLR start "ruleInfer"
    // InternalTheory.g:1587:1: ruleInfer returns [EObject current=null] : ( (lv_expression_0_0= RULE_STRING ) ) ;
    public final EObject ruleInfer() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1593:2: ( ( (lv_expression_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1594:2: ( (lv_expression_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1594:2: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalTheory.g:1595:3: (lv_expression_0_0= RULE_STRING )
            {
            // InternalTheory.g:1595:3: (lv_expression_0_0= RULE_STRING )
            // InternalTheory.g:1596:4: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_expression_0_0, grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInferRule());
            				}
            				setWithLastConsumed(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleInfer"


    // $ANTLR start "entryRuleUnconditionalRewrite"
    // InternalTheory.g:1615:1: entryRuleUnconditionalRewrite returns [EObject current=null] : iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF ;
    public final EObject entryRuleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalRewrite = null;


        try {
            // InternalTheory.g:1615:61: (iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF )
            // InternalTheory.g:1616:2: iv_ruleUnconditionalRewrite= ruleUnconditionalRewrite EOF
            {
             newCompositeNode(grammarAccess.getUnconditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnconditionalRewrite=ruleUnconditionalRewrite();

            state._fsp--;

             current =iv_ruleUnconditionalRewrite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnconditionalRewrite"


    // $ANTLR start "ruleUnconditionalRewrite"
    // InternalTheory.g:1622:1: ruleUnconditionalRewrite returns [EObject current=null] : ( (lv_rhs_0_0= RULE_STRING ) ) ;
    public final EObject ruleUnconditionalRewrite() throws RecognitionException {
        EObject current = null;

        Token lv_rhs_0_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1628:2: ( ( (lv_rhs_0_0= RULE_STRING ) ) )
            // InternalTheory.g:1629:2: ( (lv_rhs_0_0= RULE_STRING ) )
            {
            // InternalTheory.g:1629:2: ( (lv_rhs_0_0= RULE_STRING ) )
            // InternalTheory.g:1630:3: (lv_rhs_0_0= RULE_STRING )
            {
            // InternalTheory.g:1630:3: (lv_rhs_0_0= RULE_STRING )
            // InternalTheory.g:1631:4: lv_rhs_0_0= RULE_STRING
            {
            lv_rhs_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_rhs_0_0, grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnconditionalRewriteRule());
            				}
            				addWithLastConsumed(
            					current,
            					"rhs",
            					lv_rhs_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleUnconditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewrite"
    // InternalTheory.g:1650:1: entryRuleConditionalRewrite returns [EObject current=null] : iv_ruleConditionalRewrite= ruleConditionalRewrite EOF ;
    public final EObject entryRuleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewrite = null;


        try {
            // InternalTheory.g:1650:59: (iv_ruleConditionalRewrite= ruleConditionalRewrite EOF )
            // InternalTheory.g:1651:2: iv_ruleConditionalRewrite= ruleConditionalRewrite EOF
            {
             newCompositeNode(grammarAccess.getConditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalRewrite=ruleConditionalRewrite();

            state._fsp--;

             current =iv_ruleConditionalRewrite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalRewrite"


    // $ANTLR start "ruleConditionalRewrite"
    // InternalTheory.g:1657:1: ruleConditionalRewrite returns [EObject current=null] : ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) ;
    public final EObject ruleConditionalRewrite() throws RecognitionException {
        EObject current = null;

        EObject lv_rewrites_0_0 = null;

        EObject lv_rewrites_1_0 = null;



        	enterRule();

        try {
            // InternalTheory.g:1663:2: ( ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* ) )
            // InternalTheory.g:1664:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            {
            // InternalTheory.g:1664:2: ( ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )* )
            // InternalTheory.g:1665:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) ) ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            {
            // InternalTheory.g:1665:3: ( (lv_rewrites_0_0= ruleConditionalRewriteRule ) )
            // InternalTheory.g:1666:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            {
            // InternalTheory.g:1666:4: (lv_rewrites_0_0= ruleConditionalRewriteRule )
            // InternalTheory.g:1667:5: lv_rewrites_0_0= ruleConditionalRewriteRule
            {

            					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_rewrites_0_0=ruleConditionalRewriteRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            					}
            					add(
            						current,
            						"rewrites",
            						lv_rewrites_0_0,
            						"ac.soton.xtheory.Theory.ConditionalRewriteRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTheory.g:1684:3: ( (lv_rewrites_1_0= ruleConditionalRewriteRule ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTheory.g:1685:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    {
            	    // InternalTheory.g:1685:4: (lv_rewrites_1_0= ruleConditionalRewriteRule )
            	    // InternalTheory.g:1686:5: lv_rewrites_1_0= ruleConditionalRewriteRule
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_rewrites_1_0=ruleConditionalRewriteRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalRewriteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rewrites",
            	    						lv_rewrites_1_0,
            	    						"ac.soton.xtheory.Theory.ConditionalRewriteRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleConditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewriteRule"
    // InternalTheory.g:1707:1: entryRuleConditionalRewriteRule returns [EObject current=null] : iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF ;
    public final EObject entryRuleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRewriteRule = null;


        try {
            // InternalTheory.g:1707:63: (iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF )
            // InternalTheory.g:1708:2: iv_ruleConditionalRewriteRule= ruleConditionalRewriteRule EOF
            {
             newCompositeNode(grammarAccess.getConditionalRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalRewriteRule=ruleConditionalRewriteRule();

            state._fsp--;

             current =iv_ruleConditionalRewriteRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalRewriteRule"


    // $ANTLR start "ruleConditionalRewriteRule"
    // InternalTheory.g:1714:1: ruleConditionalRewriteRule returns [EObject current=null] : ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConditionalRewriteRule() throws RecognitionException {
        EObject current = null;

        Token lv_lhs_0_0=null;
        Token otherlv_1=null;
        Token lv_rhs_2_0=null;


        	enterRule();

        try {
            // InternalTheory.g:1720:2: ( ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) ) )
            // InternalTheory.g:1721:2: ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            {
            // InternalTheory.g:1721:2: ( ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) ) )
            // InternalTheory.g:1722:3: ( (lv_lhs_0_0= RULE_STRING ) ) otherlv_1= '=>' ( (lv_rhs_2_0= RULE_STRING ) )
            {
            // InternalTheory.g:1722:3: ( (lv_lhs_0_0= RULE_STRING ) )
            // InternalTheory.g:1723:4: (lv_lhs_0_0= RULE_STRING )
            {
            // InternalTheory.g:1723:4: (lv_lhs_0_0= RULE_STRING )
            // InternalTheory.g:1724:5: lv_lhs_0_0= RULE_STRING
            {
            lv_lhs_0_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_lhs_0_0, grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalTheory.g:1744:3: ( (lv_rhs_2_0= RULE_STRING ) )
            // InternalTheory.g:1745:4: (lv_rhs_2_0= RULE_STRING )
            {
            // InternalTheory.g:1745:4: (lv_rhs_2_0= RULE_STRING )
            // InternalTheory.g:1746:5: lv_rhs_2_0= RULE_STRING
            {
            lv_rhs_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_rhs_2_0, grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRewriteRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleConditionalRewriteRule"


    // $ANTLR start "ruleNotation"
    // InternalTheory.g:1766:1: ruleNotation returns [Enumerator current=null] : ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) ;
    public final Enumerator ruleNotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTheory.g:1772:2: ( ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) ) )
            // InternalTheory.g:1773:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            {
            // InternalTheory.g:1773:2: ( (enumLiteral_0= 'prefix' ) | (enumLiteral_1= 'infix' ) | (enumLiteral_2= 'postfix' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt28=1;
                }
                break;
            case 38:
                {
                alt28=2;
                }
                break;
            case 39:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalTheory.g:1774:3: (enumLiteral_0= 'prefix' )
                    {
                    // InternalTheory.g:1774:3: (enumLiteral_0= 'prefix' )
                    // InternalTheory.g:1775:4: enumLiteral_0= 'prefix'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:1782:3: (enumLiteral_1= 'infix' )
                    {
                    // InternalTheory.g:1782:3: (enumLiteral_1= 'infix' )
                    // InternalTheory.g:1783:4: enumLiteral_1= 'infix'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:1790:3: (enumLiteral_2= 'postfix' )
                    {
                    // InternalTheory.g:1790:3: (enumLiteral_2= 'postfix' )
                    // InternalTheory.g:1791:4: enumLiteral_2= 'postfix'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleNotation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FD000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F8010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000E01B201002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000E01B200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000E01F200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});

}
