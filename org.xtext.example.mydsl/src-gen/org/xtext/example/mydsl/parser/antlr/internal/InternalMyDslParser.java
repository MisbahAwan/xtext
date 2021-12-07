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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ZNotationModel'", "'{'", "'ModelName'", "'schema'", "','", "'}'", "'Schema'", "'SchemaTitle'", "'schemastate'", "'relation'", "'Relation'", "'RelationType'", "'RelatedTo'", "'Variable'", "'Name'", "'Value'", "'Type'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "ZNotationModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleZNotationModel"
    // InternalMyDsl.g:64:1: entryRuleZNotationModel returns [EObject current=null] : iv_ruleZNotationModel= ruleZNotationModel EOF ;
    public final EObject entryRuleZNotationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZNotationModel = null;


        try {
            // InternalMyDsl.g:64:55: (iv_ruleZNotationModel= ruleZNotationModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleZNotationModel= ruleZNotationModel EOF
            {
             newCompositeNode(grammarAccess.getZNotationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZNotationModel=ruleZNotationModel();

            state._fsp--;

             current =iv_ruleZNotationModel; 
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
    // $ANTLR end "entryRuleZNotationModel"


    // $ANTLR start "ruleZNotationModel"
    // InternalMyDsl.g:71:1: ruleZNotationModel returns [EObject current=null] : ( () otherlv_1= 'ZNotationModel' otherlv_2= '{' (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )? (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleZNotationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ModelName_4_0 = null;

        EObject lv_schema_7_0 = null;

        EObject lv_schema_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'ZNotationModel' otherlv_2= '{' (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )? (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'ZNotationModel' otherlv_2= '{' (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )? (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'ZNotationModel' otherlv_2= '{' (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )? (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'ZNotationModel' otherlv_2= '{' (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )? (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZNotationModelAccess().getZNotationModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getZNotationModelAccess().getZNotationModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:94:3: (otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:95:4: otherlv_3= 'ModelName' ( (lv_ModelName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getZNotationModelAccess().getModelNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:99:4: ( (lv_ModelName_4_0= ruleEString ) )
                    // InternalMyDsl.g:100:5: (lv_ModelName_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:100:5: (lv_ModelName_4_0= ruleEString )
                    // InternalMyDsl.g:101:6: lv_ModelName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getZNotationModelAccess().getModelNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ModelName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getZNotationModelRule());
                    						}
                    						set(
                    							current,
                    							"ModelName",
                    							lv_ModelName_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:119:3: (otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:120:4: otherlv_5= 'schema' otherlv_6= '{' ( (lv_schema_7_0= ruleSchema ) ) (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getZNotationModelAccess().getSchemaKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:128:4: ( (lv_schema_7_0= ruleSchema ) )
                    // InternalMyDsl.g:129:5: (lv_schema_7_0= ruleSchema )
                    {
                    // InternalMyDsl.g:129:5: (lv_schema_7_0= ruleSchema )
                    // InternalMyDsl.g:130:6: lv_schema_7_0= ruleSchema
                    {

                    						newCompositeNode(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_schema_7_0=ruleSchema();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getZNotationModelRule());
                    						}
                    						add(
                    							current,
                    							"schema",
                    							lv_schema_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Schema");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:147:4: (otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:148:5: otherlv_8= ',' ( (lv_schema_9_0= ruleSchema ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getZNotationModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:152:5: ( (lv_schema_9_0= ruleSchema ) )
                    	    // InternalMyDsl.g:153:6: (lv_schema_9_0= ruleSchema )
                    	    {
                    	    // InternalMyDsl.g:153:6: (lv_schema_9_0= ruleSchema )
                    	    // InternalMyDsl.g:154:7: lv_schema_9_0= ruleSchema
                    	    {

                    	    							newCompositeNode(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_schema_9_0=ruleSchema();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getZNotationModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"schema",
                    	    								lv_schema_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Schema");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleZNotationModel"


    // $ANTLR start "entryRuleSchema"
    // InternalMyDsl.g:185:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalMyDsl.g:185:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalMyDsl.g:186:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalMyDsl.g:192:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= 'Schema' otherlv_2= '{' (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )? (otherlv_5= 'schemastate' ( ( ruleEString ) ) )? (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_SchemaTitle_4_0 = null;

        EObject lv_relation_9_0 = null;

        EObject lv_relation_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( ( () otherlv_1= 'Schema' otherlv_2= '{' (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )? (otherlv_5= 'schemastate' ( ( ruleEString ) ) )? (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalMyDsl.g:199:2: ( () otherlv_1= 'Schema' otherlv_2= '{' (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )? (otherlv_5= 'schemastate' ( ( ruleEString ) ) )? (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:199:2: ( () otherlv_1= 'Schema' otherlv_2= '{' (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )? (otherlv_5= 'schemastate' ( ( ruleEString ) ) )? (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalMyDsl.g:200:3: () otherlv_1= 'Schema' otherlv_2= '{' (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )? (otherlv_5= 'schemastate' ( ( ruleEString ) ) )? (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalMyDsl.g:200:3: ()
            // InternalMyDsl.g:201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getSchemaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:215:3: (otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:216:4: otherlv_3= 'SchemaTitle' ( (lv_SchemaTitle_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getSchemaTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:220:4: ( (lv_SchemaTitle_4_0= ruleEString ) )
                    // InternalMyDsl.g:221:5: (lv_SchemaTitle_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:221:5: (lv_SchemaTitle_4_0= ruleEString )
                    // InternalMyDsl.g:222:6: lv_SchemaTitle_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSchemaAccess().getSchemaTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_SchemaTitle_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchemaRule());
                    						}
                    						set(
                    							current,
                    							"SchemaTitle",
                    							lv_SchemaTitle_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:240:3: (otherlv_5= 'schemastate' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:241:4: otherlv_5= 'schemastate' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSchemaAccess().getSchemastateKeyword_4_0());
                    			
                    // InternalMyDsl.g:245:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:246:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:246:5: ( ruleEString )
                    // InternalMyDsl.g:247:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSchemaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSchemaAccess().getSchemastateSchemaStateCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:262:3: (otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:263:4: otherlv_7= 'relation' otherlv_8= '{' ( (lv_relation_9_0= ruleRelation ) ) (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getRelationKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:271:4: ( (lv_relation_9_0= ruleRelation ) )
                    // InternalMyDsl.g:272:5: (lv_relation_9_0= ruleRelation )
                    {
                    // InternalMyDsl.g:272:5: (lv_relation_9_0= ruleRelation )
                    // InternalMyDsl.g:273:6: lv_relation_9_0= ruleRelation
                    {

                    						newCompositeNode(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_relation_9_0=ruleRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchemaRule());
                    						}
                    						add(
                    							current,
                    							"relation",
                    							lv_relation_9_0,
                    							"org.xtext.example.mydsl.MyDsl.Relation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:290:4: (otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:291:5: otherlv_10= ',' ( (lv_relation_11_0= ruleRelation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSchemaAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:295:5: ( (lv_relation_11_0= ruleRelation ) )
                    	    // InternalMyDsl.g:296:6: (lv_relation_11_0= ruleRelation )
                    	    {
                    	    // InternalMyDsl.g:296:6: (lv_relation_11_0= ruleRelation )
                    	    // InternalMyDsl.g:297:7: lv_relation_11_0= ruleRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_relation_11_0=ruleRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSchemaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation",
                    	    								lv_relation_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Relation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:328:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:328:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:329:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:335:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:342:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:342:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:343:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:351:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:362:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:362:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:363:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:369:1: ruleRelation returns [EObject current=null] : ( () otherlv_1= 'Relation' otherlv_2= '{' (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )? (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_RelationType_4_0 = null;

        AntlrDatatypeRuleToken lv_RelatedTo_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( ( () otherlv_1= 'Relation' otherlv_2= '{' (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )? (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:376:2: ( () otherlv_1= 'Relation' otherlv_2= '{' (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )? (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:376:2: ( () otherlv_1= 'Relation' otherlv_2= '{' (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )? (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:377:3: () otherlv_1= 'Relation' otherlv_2= '{' (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )? (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:377:3: ()
            // InternalMyDsl.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationAccess().getRelationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:392:3: (otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:393:4: otherlv_3= 'RelationType' ( (lv_RelationType_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelationTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:397:4: ( (lv_RelationType_4_0= ruleEString ) )
                    // InternalMyDsl.g:398:5: (lv_RelationType_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:398:5: (lv_RelationType_4_0= ruleEString )
                    // InternalMyDsl.g:399:6: lv_RelationType_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRelationTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_RelationType_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"RelationType",
                    							lv_RelationType_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:417:3: (otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:418:4: otherlv_5= 'RelatedTo' ( (lv_RelatedTo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRelatedToKeyword_4_0());
                    			
                    // InternalMyDsl.g:422:4: ( (lv_RelatedTo_6_0= ruleEString ) )
                    // InternalMyDsl.g:423:5: (lv_RelatedTo_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:423:5: (lv_RelatedTo_6_0= ruleEString )
                    // InternalMyDsl.g:424:6: lv_RelatedTo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelationAccess().getRelatedToEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_RelatedTo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    						}
                    						set(
                    							current,
                    							"RelatedTo",
                    							lv_RelatedTo_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:450:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:450:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:451:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMyDsl.g:457:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        AntlrDatatypeRuleToken lv_Value_6_0 = null;

        AntlrDatatypeRuleToken lv_Type_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:463:2: ( ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalMyDsl.g:464:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:464:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalMyDsl.g:465:3: () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalMyDsl.g:465:3: ()
            // InternalMyDsl.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:480:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:481:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:485:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalMyDsl.g:486:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:486:5: (lv_Name_4_0= ruleEString )
                    // InternalMyDsl.g:487:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:505:3: (otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:506:4: otherlv_5= 'Value' ( (lv_Value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getValueKeyword_4_0());
                    			
                    // InternalMyDsl.g:510:4: ( (lv_Value_6_0= ruleEString ) )
                    // InternalMyDsl.g:511:5: (lv_Value_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:511:5: (lv_Value_6_0= ruleEString )
                    // InternalMyDsl.g:512:6: lv_Value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_Value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"Value",
                    							lv_Value_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:530:3: (otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:531:4: otherlv_7= 'Type' ( (lv_Type_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getTypeKeyword_5_0());
                    			
                    // InternalMyDsl.g:535:4: ( (lv_Type_8_0= ruleEString ) )
                    // InternalMyDsl.g:536:5: (lv_Type_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:536:5: (lv_Type_8_0= ruleEString )
                    // InternalMyDsl.g:537:6: lv_Type_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Type_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008010000L});

}