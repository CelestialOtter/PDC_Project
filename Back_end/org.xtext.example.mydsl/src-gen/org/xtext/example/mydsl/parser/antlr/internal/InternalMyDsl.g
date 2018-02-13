/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSearch
entryRuleSearch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSearchRule()); }
	iv_ruleSearch=ruleSearch
	{ $current=$iv_ruleSearch.current; }
	EOF;

// Rule Search
ruleSearch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSearchAccess().getSearchAction_0(),
					$current);
			}
		)
		otherlv_1='Search'
		{
			newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getSearchKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSearchAccess().getSpecificationsSpecificationParserRuleCall_2_0());
				}
				lv_specifications_2_0=ruleSpecification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSearchRule());
					}
					add(
						$current,
						"specifications",
						lv_specifications_2_0,
						"org.xtext.example.mydsl.MyDsl.Specification");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	iv_ruleSpecification=ruleSpecification
	{ $current=$iv_ruleSpecification.current; }
	EOF;

// Rule Specification
ruleSpecification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getSpecificationAccess().getRestaurantParserRuleCall());
	}
	this_Restaurant_0=ruleRestaurant
	{
		$current = $this_Restaurant_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleRestaurant
entryRuleRestaurant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRestaurantRule()); }
	iv_ruleRestaurant=ruleRestaurant
	{ $current=$iv_ruleRestaurant.current; }
	EOF;

// Rule Restaurant
ruleRestaurant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRestaurantAccess().getRestaurantAction_0(),
					$current);
			}
		)
		otherlv_1='restaurant'
		{
			newLeafNode(otherlv_1, grammarAccess.getRestaurantAccess().getRestaurantKeyword_1());
		}
		(
			(
				lv_arguments_2_0=RULE_STRING
				{
					newLeafNode(lv_arguments_2_0, grammarAccess.getRestaurantAccess().getArgumentsSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRestaurantRule());
					}
					setWithLastConsumed(
						$current,
						"arguments",
						lv_arguments_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
