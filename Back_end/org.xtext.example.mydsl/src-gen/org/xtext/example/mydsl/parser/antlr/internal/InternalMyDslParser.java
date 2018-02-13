package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Search'", "'restaurant'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Search";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSearch"
    // InternalMyDsl.g:64:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSearch= ruleSearch EOF )
            // InternalMyDsl.g:65:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalMyDsl.g:71:1: ruleSearch returns [EObject current=null] : ( () otherlv_1= 'Search' ( (lv_specifications_2_0= ruleSpecification ) ) ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_specifications_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Search' ( (lv_specifications_2_0= ruleSpecification ) ) ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Search' ( (lv_specifications_2_0= ruleSpecification ) ) )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Search' ( (lv_specifications_2_0= ruleSpecification ) ) )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Search' ( (lv_specifications_2_0= ruleSpecification ) )
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSearchAccess().getSearchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getSearchKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_specifications_2_0= ruleSpecification ) )
            // InternalMyDsl.g:91:4: (lv_specifications_2_0= ruleSpecification )
            {
            // InternalMyDsl.g:91:4: (lv_specifications_2_0= ruleSpecification )
            // InternalMyDsl.g:92:5: lv_specifications_2_0= ruleSpecification
            {

            					newCompositeNode(grammarAccess.getSearchAccess().getSpecificationsSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_specifications_2_0=ruleSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSearchRule());
            					}
            					add(
            						current,
            						"specifications",
            						lv_specifications_2_0,
            						"org.xtext.example.mydsl.MyDsl.Specification");
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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleSpecification"
    // InternalMyDsl.g:113:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalMyDsl.g:113:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalMyDsl.g:114:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalMyDsl.g:120:1: ruleSpecification returns [EObject current=null] : this_Restaurant_0= ruleRestaurant ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_Restaurant_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:126:2: (this_Restaurant_0= ruleRestaurant )
            // InternalMyDsl.g:127:2: this_Restaurant_0= ruleRestaurant
            {

            		newCompositeNode(grammarAccess.getSpecificationAccess().getRestaurantParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Restaurant_0=ruleRestaurant();

            state._fsp--;


            		current = this_Restaurant_0;
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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleRestaurant"
    // InternalMyDsl.g:138:1: entryRuleRestaurant returns [EObject current=null] : iv_ruleRestaurant= ruleRestaurant EOF ;
    public final EObject entryRuleRestaurant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurant = null;


        try {
            // InternalMyDsl.g:138:51: (iv_ruleRestaurant= ruleRestaurant EOF )
            // InternalMyDsl.g:139:2: iv_ruleRestaurant= ruleRestaurant EOF
            {
             newCompositeNode(grammarAccess.getRestaurantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestaurant=ruleRestaurant();

            state._fsp--;

             current =iv_ruleRestaurant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestaurant"


    // $ANTLR start "ruleRestaurant"
    // InternalMyDsl.g:145:1: ruleRestaurant returns [EObject current=null] : ( () otherlv_1= 'restaurant' ( (lv_arguments_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRestaurant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_arguments_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:151:2: ( ( () otherlv_1= 'restaurant' ( (lv_arguments_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:152:2: ( () otherlv_1= 'restaurant' ( (lv_arguments_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:152:2: ( () otherlv_1= 'restaurant' ( (lv_arguments_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:153:3: () otherlv_1= 'restaurant' ( (lv_arguments_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:153:3: ()
            // InternalMyDsl.g:154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestaurantAccess().getRestaurantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRestaurantAccess().getRestaurantKeyword_1());
            		
            // InternalMyDsl.g:164:3: ( (lv_arguments_2_0= RULE_STRING ) )
            // InternalMyDsl.g:165:4: (lv_arguments_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:165:4: (lv_arguments_2_0= RULE_STRING )
            // InternalMyDsl.g:166:5: lv_arguments_2_0= RULE_STRING
            {
            lv_arguments_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_arguments_2_0, grammarAccess.getRestaurantAccess().getArgumentsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestaurantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arguments",
            						lv_arguments_2_0,
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
    // $ANTLR end "ruleRestaurant"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}