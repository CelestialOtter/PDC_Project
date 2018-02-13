package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSearch"
    // InternalMyDsl.g:53:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSearch EOF )
            // InternalMyDsl.g:55:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FOLLOW_1);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // InternalMyDsl.g:62:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Search__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Search__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Search__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Search__Group__0 )
            // InternalMyDsl.g:69:4: rule__Search__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleSpecification"
    // InternalMyDsl.g:78:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleSpecification EOF )
            // InternalMyDsl.g:80:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalMyDsl.g:87:1: ruleSpecification : ( ruleRestaurant ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ruleRestaurant ) )
            // InternalMyDsl.g:92:2: ( ruleRestaurant )
            {
            // InternalMyDsl.g:92:2: ( ruleRestaurant )
            // InternalMyDsl.g:93:3: ruleRestaurant
            {
             before(grammarAccess.getSpecificationAccess().getRestaurantParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRestaurant();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getRestaurantParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleRestaurant"
    // InternalMyDsl.g:103:1: entryRuleRestaurant : ruleRestaurant EOF ;
    public final void entryRuleRestaurant() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRestaurant EOF )
            // InternalMyDsl.g:105:1: ruleRestaurant EOF
            {
             before(grammarAccess.getRestaurantRule()); 
            pushFollow(FOLLOW_1);
            ruleRestaurant();

            state._fsp--;

             after(grammarAccess.getRestaurantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestaurant"


    // $ANTLR start "ruleRestaurant"
    // InternalMyDsl.g:112:1: ruleRestaurant : ( ( rule__Restaurant__Group__0 ) ) ;
    public final void ruleRestaurant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Restaurant__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Restaurant__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Restaurant__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Restaurant__Group__0 )
            {
             before(grammarAccess.getRestaurantAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Restaurant__Group__0 )
            // InternalMyDsl.g:119:4: rule__Restaurant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestaurant"


    // $ANTLR start "rule__Search__Group__0"
    // InternalMyDsl.g:127:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // InternalMyDsl.g:132:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // InternalMyDsl.g:139:1: rule__Search__Group__0__Impl : ( () ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:143:1: ( ( () ) )
            // InternalMyDsl.g:144:1: ( () )
            {
            // InternalMyDsl.g:144:1: ( () )
            // InternalMyDsl.g:145:2: ()
            {
             before(grammarAccess.getSearchAccess().getSearchAction_0()); 
            // InternalMyDsl.g:146:2: ()
            // InternalMyDsl.g:146:3: 
            {
            }

             after(grammarAccess.getSearchAccess().getSearchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // InternalMyDsl.g:154:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:158:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // InternalMyDsl.g:159:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Search__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Search__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // InternalMyDsl.g:166:1: rule__Search__Group__1__Impl : ( 'Search' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:170:1: ( ( 'Search' ) )
            // InternalMyDsl.g:171:1: ( 'Search' )
            {
            // InternalMyDsl.g:171:1: ( 'Search' )
            // InternalMyDsl.g:172:2: 'Search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSearchAccess().getSearchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__2"
    // InternalMyDsl.g:181:1: rule__Search__Group__2 : rule__Search__Group__2__Impl ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:185:1: ( rule__Search__Group__2__Impl )
            // InternalMyDsl.g:186:2: rule__Search__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Search__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__2"


    // $ANTLR start "rule__Search__Group__2__Impl"
    // InternalMyDsl.g:192:1: rule__Search__Group__2__Impl : ( ( rule__Search__SpecificationsAssignment_2 ) ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:196:1: ( ( ( rule__Search__SpecificationsAssignment_2 ) ) )
            // InternalMyDsl.g:197:1: ( ( rule__Search__SpecificationsAssignment_2 ) )
            {
            // InternalMyDsl.g:197:1: ( ( rule__Search__SpecificationsAssignment_2 ) )
            // InternalMyDsl.g:198:2: ( rule__Search__SpecificationsAssignment_2 )
            {
             before(grammarAccess.getSearchAccess().getSpecificationsAssignment_2()); 
            // InternalMyDsl.g:199:2: ( rule__Search__SpecificationsAssignment_2 )
            // InternalMyDsl.g:199:3: rule__Search__SpecificationsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Search__SpecificationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getSpecificationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__2__Impl"


    // $ANTLR start "rule__Restaurant__Group__0"
    // InternalMyDsl.g:208:1: rule__Restaurant__Group__0 : rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1 ;
    public final void rule__Restaurant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:212:1: ( rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1 )
            // InternalMyDsl.g:213:2: rule__Restaurant__Group__0__Impl rule__Restaurant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Restaurant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__0"


    // $ANTLR start "rule__Restaurant__Group__0__Impl"
    // InternalMyDsl.g:220:1: rule__Restaurant__Group__0__Impl : ( () ) ;
    public final void rule__Restaurant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:1: ( ( () ) )
            // InternalMyDsl.g:225:1: ( () )
            {
            // InternalMyDsl.g:225:1: ( () )
            // InternalMyDsl.g:226:2: ()
            {
             before(grammarAccess.getRestaurantAccess().getRestaurantAction_0()); 
            // InternalMyDsl.g:227:2: ()
            // InternalMyDsl.g:227:3: 
            {
            }

             after(grammarAccess.getRestaurantAccess().getRestaurantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__0__Impl"


    // $ANTLR start "rule__Restaurant__Group__1"
    // InternalMyDsl.g:235:1: rule__Restaurant__Group__1 : rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2 ;
    public final void rule__Restaurant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2 )
            // InternalMyDsl.g:240:2: rule__Restaurant__Group__1__Impl rule__Restaurant__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Restaurant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__1"


    // $ANTLR start "rule__Restaurant__Group__1__Impl"
    // InternalMyDsl.g:247:1: rule__Restaurant__Group__1__Impl : ( 'restaurant' ) ;
    public final void rule__Restaurant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( ( 'restaurant' ) )
            // InternalMyDsl.g:252:1: ( 'restaurant' )
            {
            // InternalMyDsl.g:252:1: ( 'restaurant' )
            // InternalMyDsl.g:253:2: 'restaurant'
            {
             before(grammarAccess.getRestaurantAccess().getRestaurantKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getRestaurantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__1__Impl"


    // $ANTLR start "rule__Restaurant__Group__2"
    // InternalMyDsl.g:262:1: rule__Restaurant__Group__2 : rule__Restaurant__Group__2__Impl ;
    public final void rule__Restaurant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( rule__Restaurant__Group__2__Impl )
            // InternalMyDsl.g:267:2: rule__Restaurant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__2"


    // $ANTLR start "rule__Restaurant__Group__2__Impl"
    // InternalMyDsl.g:273:1: rule__Restaurant__Group__2__Impl : ( ( rule__Restaurant__ArgumentsAssignment_2 ) ) ;
    public final void rule__Restaurant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:277:1: ( ( ( rule__Restaurant__ArgumentsAssignment_2 ) ) )
            // InternalMyDsl.g:278:1: ( ( rule__Restaurant__ArgumentsAssignment_2 ) )
            {
            // InternalMyDsl.g:278:1: ( ( rule__Restaurant__ArgumentsAssignment_2 ) )
            // InternalMyDsl.g:279:2: ( rule__Restaurant__ArgumentsAssignment_2 )
            {
             before(grammarAccess.getRestaurantAccess().getArgumentsAssignment_2()); 
            // InternalMyDsl.g:280:2: ( rule__Restaurant__ArgumentsAssignment_2 )
            // InternalMyDsl.g:280:3: rule__Restaurant__ArgumentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Restaurant__ArgumentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestaurantAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__Group__2__Impl"


    // $ANTLR start "rule__Search__SpecificationsAssignment_2"
    // InternalMyDsl.g:289:1: rule__Search__SpecificationsAssignment_2 : ( ruleSpecification ) ;
    public final void rule__Search__SpecificationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ruleSpecification ) )
            // InternalMyDsl.g:294:2: ( ruleSpecification )
            {
            // InternalMyDsl.g:294:2: ( ruleSpecification )
            // InternalMyDsl.g:295:3: ruleSpecification
            {
             before(grammarAccess.getSearchAccess().getSpecificationsSpecificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getSpecificationsSpecificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__SpecificationsAssignment_2"


    // $ANTLR start "rule__Restaurant__ArgumentsAssignment_2"
    // InternalMyDsl.g:304:1: rule__Restaurant__ArgumentsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Restaurant__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:309:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:309:2: ( RULE_STRING )
            // InternalMyDsl.g:310:3: RULE_STRING
            {
             before(grammarAccess.getRestaurantAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRestaurantAccess().getArgumentsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurant__ArgumentsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}