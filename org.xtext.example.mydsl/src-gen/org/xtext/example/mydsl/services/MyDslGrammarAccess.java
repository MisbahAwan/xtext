/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ZNotationModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ZNotationModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cZNotationModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cZNotationModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cModelNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cModelNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cModelNameEStringParserRuleCall_3_1_0 = (RuleCall)cModelNameAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSchemaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cSchemaAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cSchemaSchemaParserRuleCall_4_2_0 = (RuleCall)cSchemaAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cSchemaAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cSchemaSchemaParserRuleCall_4_3_1_0 = (RuleCall)cSchemaAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ZNotationModel returns ZNotationModel:
		//    {ZNotationModel}
		//    'ZNotationModel'
		//    '{'
		//        ('ModelName' ModelName=EString)?
		//        ('schema' '{' schema+=Schema ( "," schema+=Schema)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ZNotationModel}
		//'ZNotationModel'
		//'{'
		//    ('ModelName' ModelName=EString)?
		//    ('schema' '{' schema+=Schema ( "," schema+=Schema)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{ZNotationModel}
		public Action getZNotationModelAction_0() { return cZNotationModelAction_0; }
		
		//'ZNotationModel'
		public Keyword getZNotationModelKeyword_1() { return cZNotationModelKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('ModelName' ModelName=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'ModelName'
		public Keyword getModelNameKeyword_3_0() { return cModelNameKeyword_3_0; }
		
		//ModelName=EString
		public Assignment getModelNameAssignment_3_1() { return cModelNameAssignment_3_1; }
		
		//EString
		public RuleCall getModelNameEStringParserRuleCall_3_1_0() { return cModelNameEStringParserRuleCall_3_1_0; }
		
		//('schema' '{' schema+=Schema ( "," schema+=Schema)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'schema'
		public Keyword getSchemaKeyword_4_0() { return cSchemaKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//schema+=Schema
		public Assignment getSchemaAssignment_4_2() { return cSchemaAssignment_4_2; }
		
		//Schema
		public RuleCall getSchemaSchemaParserRuleCall_4_2_0() { return cSchemaSchemaParserRuleCall_4_2_0; }
		
		//( "," schema+=Schema)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//schema+=Schema
		public Assignment getSchemaAssignment_4_3_1() { return cSchemaAssignment_4_3_1; }
		
		//Schema
		public RuleCall getSchemaSchemaParserRuleCall_4_3_1_0() { return cSchemaSchemaParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class SchemaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Schema");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSchemaAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSchemaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTitleKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTitleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTitleEStringParserRuleCall_3_1_0 = (RuleCall)cTitleAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSchemastateKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSchemastateAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cSchemastateSchemaStateCrossReference_4_1_0 = (CrossReference)cSchemastateAssignment_4_1.eContents().get(0);
		private final RuleCall cSchemastateSchemaStateEStringParserRuleCall_4_1_0_1 = (RuleCall)cSchemastateSchemaStateCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Schema returns Schema:
		//    {Schema}
		//    'Schema'
		//    '{'
		//        ('Title' Title=EString)?
		//        ('schemastate' schemastate=[SchemaState|EString])?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Schema}
		//'Schema'
		//'{'
		//    ('Title' Title=EString)?
		//    ('schemastate' schemastate=[SchemaState|EString])?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Schema}
		public Action getSchemaAction_0() { return cSchemaAction_0; }
		
		//'Schema'
		public Keyword getSchemaKeyword_1() { return cSchemaKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Title' Title=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Title'
		public Keyword getTitleKeyword_3_0() { return cTitleKeyword_3_0; }
		
		//Title=EString
		public Assignment getTitleAssignment_3_1() { return cTitleAssignment_3_1; }
		
		//EString
		public RuleCall getTitleEStringParserRuleCall_3_1_0() { return cTitleEStringParserRuleCall_3_1_0; }
		
		//('schemastate' schemastate=[SchemaState|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'schemastate'
		public Keyword getSchemastateKeyword_4_0() { return cSchemastateKeyword_4_0; }
		
		//schemastate=[SchemaState|EString]
		public Assignment getSchemastateAssignment_4_1() { return cSchemastateAssignment_4_1; }
		
		//[SchemaState|EString]
		public CrossReference getSchemastateSchemaStateCrossReference_4_1_0() { return cSchemastateSchemaStateCrossReference_4_1_0; }
		
		//EString
		public RuleCall getSchemastateSchemaStateEStringParserRuleCall_4_1_0_1() { return cSchemastateSchemaStateEStringParserRuleCall_4_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class SchemaStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SchemaState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSchemaStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSchemaStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cStatechangeoperatorKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStatechangeoperatorAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cStatechangeoperatorStateChangeOperatorCrossReference_3_1_0 = (CrossReference)cStatechangeoperatorAssignment_3_1.eContents().get(0);
		private final RuleCall cStatechangeoperatorStateChangeOperatorEStringParserRuleCall_3_1_0_1 = (RuleCall)cStatechangeoperatorStateChangeOperatorCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cVariableKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cVariableAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cVariableVariableParserRuleCall_4_2_0 = (RuleCall)cVariableAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cVariableAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cVariableVariableParserRuleCall_4_3_1_0 = (RuleCall)cVariableAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SchemaState returns SchemaState:
		//    {SchemaState}
		//    'SchemaState'
		//    '{'
		//        ('statechangeoperator' statechangeoperator=[StateChangeOperator|EString])?
		//        ('variable' '{' variable+=Variable ( "," variable+=Variable)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{SchemaState}
		//'SchemaState'
		//'{'
		//    ('statechangeoperator' statechangeoperator=[StateChangeOperator|EString])?
		//    ('variable' '{' variable+=Variable ( "," variable+=Variable)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{SchemaState}
		public Action getSchemaStateAction_0() { return cSchemaStateAction_0; }
		
		//'SchemaState'
		public Keyword getSchemaStateKeyword_1() { return cSchemaStateKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('statechangeoperator' statechangeoperator=[StateChangeOperator|EString])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'statechangeoperator'
		public Keyword getStatechangeoperatorKeyword_3_0() { return cStatechangeoperatorKeyword_3_0; }
		
		//statechangeoperator=[StateChangeOperator|EString]
		public Assignment getStatechangeoperatorAssignment_3_1() { return cStatechangeoperatorAssignment_3_1; }
		
		//[StateChangeOperator|EString]
		public CrossReference getStatechangeoperatorStateChangeOperatorCrossReference_3_1_0() { return cStatechangeoperatorStateChangeOperatorCrossReference_3_1_0; }
		
		//EString
		public RuleCall getStatechangeoperatorStateChangeOperatorEStringParserRuleCall_3_1_0_1() { return cStatechangeoperatorStateChangeOperatorEStringParserRuleCall_3_1_0_1; }
		
		//('variable' '{' variable+=Variable ( "," variable+=Variable)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'variable'
		public Keyword getVariableKeyword_4_0() { return cVariableKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//variable+=Variable
		public Assignment getVariableAssignment_4_2() { return cVariableAssignment_4_2; }
		
		//Variable
		public RuleCall getVariableVariableParserRuleCall_4_2_0() { return cVariableVariableParserRuleCall_4_2_0; }
		
		//( "," variable+=Variable)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//variable+=Variable
		public Assignment getVariableAssignment_4_3_1() { return cVariableAssignment_4_3_1; }
		
		//Variable
		public RuleCall getVariableVariableParserRuleCall_4_3_1_0() { return cVariableVariableParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class StateChangeOperatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.StateChangeOperator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateChangeOperatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateChangeOperatorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cStateChangeTypeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStateChangeTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStateChangeTypeEStringParserRuleCall_3_1_0 = (RuleCall)cStateChangeTypeAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StateChangeOperator returns StateChangeOperator:
		//    {StateChangeOperator}
		//    'StateChangeOperator'
		//    '{'
		//        ('StateChangeType' StateChangeType=EString)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{StateChangeOperator}
		//'StateChangeOperator'
		//'{'
		//    ('StateChangeType' StateChangeType=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{StateChangeOperator}
		public Action getStateChangeOperatorAction_0() { return cStateChangeOperatorAction_0; }
		
		//'StateChangeOperator'
		public Keyword getStateChangeOperatorKeyword_1() { return cStateChangeOperatorKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('StateChangeType' StateChangeType=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'StateChangeType'
		public Keyword getStateChangeTypeKeyword_3_0() { return cStateChangeTypeKeyword_3_0; }
		
		//StateChangeType=EString
		public Assignment getStateChangeTypeAssignment_3_1() { return cStateChangeTypeAssignment_3_1; }
		
		//EString
		public RuleCall getStateChangeTypeEStringParserRuleCall_3_1_0() { return cStateChangeTypeEStringParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVariableKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNameKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cValueKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTypeEStringParserRuleCall_5_1_0 = (RuleCall)cTypeAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Variable returns Variable:
		//    {Variable}
		//    'Variable'
		//    '{'
		//        ('Name' Name=EString)?
		//        ('Value' Value=EString)?
		//        ('Type' Type=EString)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Variable}
		//'Variable'
		//'{'
		//    ('Name' Name=EString)?
		//    ('Value' Value=EString)?
		//    ('Type' Type=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }
		
		//'Variable'
		public Keyword getVariableKeyword_1() { return cVariableKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('Name' Name=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Name'
		public Keyword getNameKeyword_3_0() { return cNameKeyword_3_0; }
		
		//Name=EString
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_1_0() { return cNameEStringParserRuleCall_3_1_0; }
		
		//('Value' Value=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'Value'
		public Keyword getValueKeyword_4_0() { return cValueKeyword_4_0; }
		
		//Value=EString
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//EString
		public RuleCall getValueEStringParserRuleCall_4_1_0() { return cValueEStringParserRuleCall_4_1_0; }
		
		//('Type' Type=EString)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'Type'
		public Keyword getTypeKeyword_5_0() { return cTypeKeyword_5_0; }
		
		//Type=EString
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }
		
		//EString
		public RuleCall getTypeEStringParserRuleCall_5_1_0() { return cTypeEStringParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	
	private final ZNotationModelElements pZNotationModel;
	private final SchemaElements pSchema;
	private final EStringElements pEString;
	private final SchemaStateElements pSchemaState;
	private final StateChangeOperatorElements pStateChangeOperator;
	private final VariableElements pVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pZNotationModel = new ZNotationModelElements();
		this.pSchema = new SchemaElements();
		this.pEString = new EStringElements();
		this.pSchemaState = new SchemaStateElements();
		this.pStateChangeOperator = new StateChangeOperatorElements();
		this.pVariable = new VariableElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ZNotationModel returns ZNotationModel:
	//    {ZNotationModel}
	//    'ZNotationModel'
	//    '{'
	//        ('ModelName' ModelName=EString)?
	//        ('schema' '{' schema+=Schema ( "," schema+=Schema)* '}' )?
	//    '}';
	public ZNotationModelElements getZNotationModelAccess() {
		return pZNotationModel;
	}
	
	public ParserRule getZNotationModelRule() {
		return getZNotationModelAccess().getRule();
	}
	
	//Schema returns Schema:
	//    {Schema}
	//    'Schema'
	//    '{'
	//        ('Title' Title=EString)?
	//        ('schemastate' schemastate=[SchemaState|EString])?
	//    '}';
	public SchemaElements getSchemaAccess() {
		return pSchema;
	}
	
	public ParserRule getSchemaRule() {
		return getSchemaAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//SchemaState returns SchemaState:
	//    {SchemaState}
	//    'SchemaState'
	//    '{'
	//        ('statechangeoperator' statechangeoperator=[StateChangeOperator|EString])?
	//        ('variable' '{' variable+=Variable ( "," variable+=Variable)* '}' )?
	//    '}';
	public SchemaStateElements getSchemaStateAccess() {
		return pSchemaState;
	}
	
	public ParserRule getSchemaStateRule() {
		return getSchemaStateAccess().getRule();
	}
	
	//StateChangeOperator returns StateChangeOperator:
	//    {StateChangeOperator}
	//    'StateChangeOperator'
	//    '{'
	//        ('StateChangeType' StateChangeType=EString)?
	//    '}';
	public StateChangeOperatorElements getStateChangeOperatorAccess() {
		return pStateChangeOperator;
	}
	
	public ParserRule getStateChangeOperatorRule() {
		return getStateChangeOperatorAccess().getRule();
	}
	
	//Variable returns Variable:
	//    {Variable}
	//    'Variable'
	//    '{'
	//        ('Name' Name=EString)?
	//        ('Value' Value=EString)?
	//        ('Type' Type=EString)?
	//    '}';
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}