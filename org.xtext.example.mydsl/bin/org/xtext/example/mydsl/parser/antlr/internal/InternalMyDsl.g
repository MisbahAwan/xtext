/*
 * generated by Xtext 2.25.0
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
    	return "ZNotationModel";
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

// Entry rule entryRuleZNotationModel
entryRuleZNotationModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getZNotationModelRule()); }
	iv_ruleZNotationModel=ruleZNotationModel
	{ $current=$iv_ruleZNotationModel.current; }
	EOF;

// Rule ZNotationModel
ruleZNotationModel returns [EObject current=null]
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
					grammarAccess.getZNotationModelAccess().getZNotationModelAction_0(),
					$current);
			}
		)
		otherlv_1='ZNotationModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getZNotationModelAccess().getZNotationModelKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='ModelName'
			{
				newLeafNode(otherlv_3, grammarAccess.getZNotationModelAccess().getModelNameKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getZNotationModelAccess().getModelNameEStringParserRuleCall_3_1_0());
					}
					lv_ModelName_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getZNotationModelRule());
						}
						set(
							$current,
							"ModelName",
							lv_ModelName_4_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='schema'
			{
				newLeafNode(otherlv_5, grammarAccess.getZNotationModelAccess().getSchemaKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_2_0());
					}
					lv_schema_7_0=ruleSchema
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getZNotationModelRule());
						}
						add(
							$current,
							"schema",
							lv_schema_7_0,
							"org.xtext.example.mydsl.MyDsl.Schema");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getZNotationModelAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_3_1_0());
						}
						lv_schema_9_0=ruleSchema
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getZNotationModelRule());
							}
							add(
								$current,
								"schema",
								lv_schema_9_0,
								"org.xtext.example.mydsl.MyDsl.Schema");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSchema
entryRuleSchema returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSchemaRule()); }
	iv_ruleSchema=ruleSchema
	{ $current=$iv_ruleSchema.current; }
	EOF;

// Rule Schema
ruleSchema returns [EObject current=null]
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
					grammarAccess.getSchemaAccess().getSchemaAction_0(),
					$current);
			}
		)
		otherlv_1='Schema'
		{
			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getSchemaKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='SchemaTitle'
			{
				newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getSchemaTitleKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSchemaAccess().getSchemaTitleEStringParserRuleCall_3_1_0());
					}
					lv_SchemaTitle_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSchemaRule());
						}
						set(
							$current,
							"SchemaTitle",
							lv_SchemaTitle_4_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='schemastate'
			{
				newLeafNode(otherlv_5, grammarAccess.getSchemaAccess().getSchemastateKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSchemaRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSchemaAccess().getSchemastateSchemaStateCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='relation'
			{
				newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getRelationKeyword_5_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_2_0());
					}
					lv_relation_9_0=ruleRelation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSchemaRule());
						}
						add(
							$current,
							"relation",
							lv_relation_9_0,
							"org.xtext.example.mydsl.MyDsl.Relation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getSchemaAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_3_1_0());
						}
						lv_relation_11_0=ruleRelation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSchemaRule());
							}
							add(
								$current,
								"relation",
								lv_relation_11_0,
								"org.xtext.example.mydsl.MyDsl.Relation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
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
					grammarAccess.getRelationAccess().getRelationAction_0(),
					$current);
			}
		)
		otherlv_1='Relation'
		{
			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='RelationType'
			{
				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelationTypeKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationAccess().getRelationTypeEStringParserRuleCall_3_1_0());
					}
					lv_RelationType_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationRule());
						}
						set(
							$current,
							"RelationType",
							lv_RelationType_4_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='RelatedTo'
			{
				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRelatedToKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationAccess().getRelatedToEStringParserRuleCall_4_1_0());
					}
					lv_RelatedTo_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationRule());
						}
						set(
							$current,
							"RelatedTo",
							lv_RelatedTo_6_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
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
					grammarAccess.getVariableAccess().getVariableAction_0(),
					$current);
			}
		)
		otherlv_1='Variable'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Name'
			{
				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getNameKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_1_0());
					}
					lv_Name_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"Name",
							lv_Name_4_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='Value'
			{
				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getValueKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getValueEStringParserRuleCall_4_1_0());
					}
					lv_Value_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"Value",
							lv_Value_6_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='Type'
			{
				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getTypeKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getTypeEStringParserRuleCall_5_1_0());
					}
					lv_Type_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"Type",
							lv_Type_8_0,
							"org.xtext.example.mydsl.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
