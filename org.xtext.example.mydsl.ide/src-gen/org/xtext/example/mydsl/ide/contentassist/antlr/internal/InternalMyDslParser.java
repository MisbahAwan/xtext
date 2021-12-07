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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ZNotationModel'", "'{'", "'}'", "'ModelName'", "'schema'", "','", "'Schema'", "'SchemaTitle'", "'schemastate'", "'relation'", "'Relation'", "'RelationType'", "'RelatedTo'", "'Variable'", "'Name'", "'Value'", "'Type'"
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



    // $ANTLR start "entryRuleZNotationModel"
    // InternalMyDsl.g:53:1: entryRuleZNotationModel : ruleZNotationModel EOF ;
    public final void entryRuleZNotationModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleZNotationModel EOF )
            // InternalMyDsl.g:55:1: ruleZNotationModel EOF
            {
             before(grammarAccess.getZNotationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleZNotationModel();

            state._fsp--;

             after(grammarAccess.getZNotationModelRule()); 
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
    // $ANTLR end "entryRuleZNotationModel"


    // $ANTLR start "ruleZNotationModel"
    // InternalMyDsl.g:62:1: ruleZNotationModel : ( ( rule__ZNotationModel__Group__0 ) ) ;
    public final void ruleZNotationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ZNotationModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ZNotationModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ZNotationModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ZNotationModel__Group__0 )
            {
             before(grammarAccess.getZNotationModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ZNotationModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__ZNotationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZNotationModelAccess().getGroup()); 

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
    // $ANTLR end "ruleZNotationModel"


    // $ANTLR start "entryRuleSchema"
    // InternalMyDsl.g:78:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleSchema EOF )
            // InternalMyDsl.g:80:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalMyDsl.g:87:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Schema__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Schema__Group__0 )
            // InternalMyDsl.g:94:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:128:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRelation EOF )
            // InternalMyDsl.g:130:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:137:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:144:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:153:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleVariable EOF )
            // InternalMyDsl.g:155:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:162:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:169:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:182:2: ( RULE_STRING )
                    // InternalMyDsl.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:188:2: ( RULE_ID )
                    // InternalMyDsl.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ZNotationModel__Group__0"
    // InternalMyDsl.g:198:1: rule__ZNotationModel__Group__0 : rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1 ;
    public final void rule__ZNotationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1 )
            // InternalMyDsl.g:203:2: rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ZNotationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__1();

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
    // $ANTLR end "rule__ZNotationModel__Group__0"


    // $ANTLR start "rule__ZNotationModel__Group__0__Impl"
    // InternalMyDsl.g:210:1: rule__ZNotationModel__Group__0__Impl : ( () ) ;
    public final void rule__ZNotationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( () ) )
            // InternalMyDsl.g:215:1: ( () )
            {
            // InternalMyDsl.g:215:1: ( () )
            // InternalMyDsl.g:216:2: ()
            {
             before(grammarAccess.getZNotationModelAccess().getZNotationModelAction_0()); 
            // InternalMyDsl.g:217:2: ()
            // InternalMyDsl.g:217:3: 
            {
            }

             after(grammarAccess.getZNotationModelAccess().getZNotationModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZNotationModel__Group__0__Impl"


    // $ANTLR start "rule__ZNotationModel__Group__1"
    // InternalMyDsl.g:225:1: rule__ZNotationModel__Group__1 : rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2 ;
    public final void rule__ZNotationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2 )
            // InternalMyDsl.g:230:2: rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ZNotationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__2();

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
    // $ANTLR end "rule__ZNotationModel__Group__1"


    // $ANTLR start "rule__ZNotationModel__Group__1__Impl"
    // InternalMyDsl.g:237:1: rule__ZNotationModel__Group__1__Impl : ( 'ZNotationModel' ) ;
    public final void rule__ZNotationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( ( 'ZNotationModel' ) )
            // InternalMyDsl.g:242:1: ( 'ZNotationModel' )
            {
            // InternalMyDsl.g:242:1: ( 'ZNotationModel' )
            // InternalMyDsl.g:243:2: 'ZNotationModel'
            {
             before(grammarAccess.getZNotationModelAccess().getZNotationModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getZNotationModelKeyword_1()); 

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
    // $ANTLR end "rule__ZNotationModel__Group__1__Impl"


    // $ANTLR start "rule__ZNotationModel__Group__2"
    // InternalMyDsl.g:252:1: rule__ZNotationModel__Group__2 : rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3 ;
    public final void rule__ZNotationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3 )
            // InternalMyDsl.g:257:2: rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ZNotationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__3();

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
    // $ANTLR end "rule__ZNotationModel__Group__2"


    // $ANTLR start "rule__ZNotationModel__Group__2__Impl"
    // InternalMyDsl.g:264:1: rule__ZNotationModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ZNotationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( ( '{' ) )
            // InternalMyDsl.g:269:1: ( '{' )
            {
            // InternalMyDsl.g:269:1: ( '{' )
            // InternalMyDsl.g:270:2: '{'
            {
             before(grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ZNotationModel__Group__2__Impl"


    // $ANTLR start "rule__ZNotationModel__Group__3"
    // InternalMyDsl.g:279:1: rule__ZNotationModel__Group__3 : rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4 ;
    public final void rule__ZNotationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4 )
            // InternalMyDsl.g:284:2: rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ZNotationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__4();

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
    // $ANTLR end "rule__ZNotationModel__Group__3"


    // $ANTLR start "rule__ZNotationModel__Group__3__Impl"
    // InternalMyDsl.g:291:1: rule__ZNotationModel__Group__3__Impl : ( ( rule__ZNotationModel__Group_3__0 )? ) ;
    public final void rule__ZNotationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( ( rule__ZNotationModel__Group_3__0 )? ) )
            // InternalMyDsl.g:296:1: ( ( rule__ZNotationModel__Group_3__0 )? )
            {
            // InternalMyDsl.g:296:1: ( ( rule__ZNotationModel__Group_3__0 )? )
            // InternalMyDsl.g:297:2: ( rule__ZNotationModel__Group_3__0 )?
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_3()); 
            // InternalMyDsl.g:298:2: ( rule__ZNotationModel__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:298:3: rule__ZNotationModel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ZNotationModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZNotationModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ZNotationModel__Group__3__Impl"


    // $ANTLR start "rule__ZNotationModel__Group__4"
    // InternalMyDsl.g:306:1: rule__ZNotationModel__Group__4 : rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5 ;
    public final void rule__ZNotationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5 )
            // InternalMyDsl.g:311:2: rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ZNotationModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__5();

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
    // $ANTLR end "rule__ZNotationModel__Group__4"


    // $ANTLR start "rule__ZNotationModel__Group__4__Impl"
    // InternalMyDsl.g:318:1: rule__ZNotationModel__Group__4__Impl : ( ( rule__ZNotationModel__Group_4__0 )? ) ;
    public final void rule__ZNotationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ( rule__ZNotationModel__Group_4__0 )? ) )
            // InternalMyDsl.g:323:1: ( ( rule__ZNotationModel__Group_4__0 )? )
            {
            // InternalMyDsl.g:323:1: ( ( rule__ZNotationModel__Group_4__0 )? )
            // InternalMyDsl.g:324:2: ( rule__ZNotationModel__Group_4__0 )?
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_4()); 
            // InternalMyDsl.g:325:2: ( rule__ZNotationModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:325:3: rule__ZNotationModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ZNotationModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZNotationModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ZNotationModel__Group__4__Impl"


    // $ANTLR start "rule__ZNotationModel__Group__5"
    // InternalMyDsl.g:333:1: rule__ZNotationModel__Group__5 : rule__ZNotationModel__Group__5__Impl ;
    public final void rule__ZNotationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__ZNotationModel__Group__5__Impl )
            // InternalMyDsl.g:338:2: rule__ZNotationModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group__5__Impl();

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
    // $ANTLR end "rule__ZNotationModel__Group__5"


    // $ANTLR start "rule__ZNotationModel__Group__5__Impl"
    // InternalMyDsl.g:344:1: rule__ZNotationModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ZNotationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( '}' ) )
            // InternalMyDsl.g:349:1: ( '}' )
            {
            // InternalMyDsl.g:349:1: ( '}' )
            // InternalMyDsl.g:350:2: '}'
            {
             before(grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ZNotationModel__Group__5__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_3__0"
    // InternalMyDsl.g:360:1: rule__ZNotationModel__Group_3__0 : rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1 ;
    public final void rule__ZNotationModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1 )
            // InternalMyDsl.g:365:2: rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ZNotationModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_3__1();

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
    // $ANTLR end "rule__ZNotationModel__Group_3__0"


    // $ANTLR start "rule__ZNotationModel__Group_3__0__Impl"
    // InternalMyDsl.g:372:1: rule__ZNotationModel__Group_3__0__Impl : ( 'ModelName' ) ;
    public final void rule__ZNotationModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( ( 'ModelName' ) )
            // InternalMyDsl.g:377:1: ( 'ModelName' )
            {
            // InternalMyDsl.g:377:1: ( 'ModelName' )
            // InternalMyDsl.g:378:2: 'ModelName'
            {
             before(grammarAccess.getZNotationModelAccess().getModelNameKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getModelNameKeyword_3_0()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_3__0__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_3__1"
    // InternalMyDsl.g:387:1: rule__ZNotationModel__Group_3__1 : rule__ZNotationModel__Group_3__1__Impl ;
    public final void rule__ZNotationModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__ZNotationModel__Group_3__1__Impl )
            // InternalMyDsl.g:392:2: rule__ZNotationModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_3__1__Impl();

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
    // $ANTLR end "rule__ZNotationModel__Group_3__1"


    // $ANTLR start "rule__ZNotationModel__Group_3__1__Impl"
    // InternalMyDsl.g:398:1: rule__ZNotationModel__Group_3__1__Impl : ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) ) ;
    public final void rule__ZNotationModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:402:1: ( ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) ) )
            // InternalMyDsl.g:403:1: ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:403:1: ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) )
            // InternalMyDsl.g:404:2: ( rule__ZNotationModel__ModelNameAssignment_3_1 )
            {
             before(grammarAccess.getZNotationModelAccess().getModelNameAssignment_3_1()); 
            // InternalMyDsl.g:405:2: ( rule__ZNotationModel__ModelNameAssignment_3_1 )
            // InternalMyDsl.g:405:3: rule__ZNotationModel__ModelNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__ModelNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getZNotationModelAccess().getModelNameAssignment_3_1()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_3__1__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4__0"
    // InternalMyDsl.g:414:1: rule__ZNotationModel__Group_4__0 : rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1 ;
    public final void rule__ZNotationModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1 )
            // InternalMyDsl.g:419:2: rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ZNotationModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4__1();

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
    // $ANTLR end "rule__ZNotationModel__Group_4__0"


    // $ANTLR start "rule__ZNotationModel__Group_4__0__Impl"
    // InternalMyDsl.g:426:1: rule__ZNotationModel__Group_4__0__Impl : ( 'schema' ) ;
    public final void rule__ZNotationModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( 'schema' ) )
            // InternalMyDsl.g:431:1: ( 'schema' )
            {
            // InternalMyDsl.g:431:1: ( 'schema' )
            // InternalMyDsl.g:432:2: 'schema'
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getSchemaKeyword_4_0()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4__0__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4__1"
    // InternalMyDsl.g:441:1: rule__ZNotationModel__Group_4__1 : rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2 ;
    public final void rule__ZNotationModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2 )
            // InternalMyDsl.g:446:2: rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__ZNotationModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4__2();

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
    // $ANTLR end "rule__ZNotationModel__Group_4__1"


    // $ANTLR start "rule__ZNotationModel__Group_4__1__Impl"
    // InternalMyDsl.g:453:1: rule__ZNotationModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ZNotationModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( '{' ) )
            // InternalMyDsl.g:458:1: ( '{' )
            {
            // InternalMyDsl.g:458:1: ( '{' )
            // InternalMyDsl.g:459:2: '{'
            {
             before(grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4__1__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4__2"
    // InternalMyDsl.g:468:1: rule__ZNotationModel__Group_4__2 : rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3 ;
    public final void rule__ZNotationModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3 )
            // InternalMyDsl.g:473:2: rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ZNotationModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4__3();

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
    // $ANTLR end "rule__ZNotationModel__Group_4__2"


    // $ANTLR start "rule__ZNotationModel__Group_4__2__Impl"
    // InternalMyDsl.g:480:1: rule__ZNotationModel__Group_4__2__Impl : ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) ) ;
    public final void rule__ZNotationModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) ) )
            // InternalMyDsl.g:485:1: ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) )
            {
            // InternalMyDsl.g:485:1: ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) )
            // InternalMyDsl.g:486:2: ( rule__ZNotationModel__SchemaAssignment_4_2 )
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_2()); 
            // InternalMyDsl.g:487:2: ( rule__ZNotationModel__SchemaAssignment_4_2 )
            // InternalMyDsl.g:487:3: rule__ZNotationModel__SchemaAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__SchemaAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_2()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4__2__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4__3"
    // InternalMyDsl.g:495:1: rule__ZNotationModel__Group_4__3 : rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4 ;
    public final void rule__ZNotationModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4 )
            // InternalMyDsl.g:500:2: rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__ZNotationModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4__4();

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
    // $ANTLR end "rule__ZNotationModel__Group_4__3"


    // $ANTLR start "rule__ZNotationModel__Group_4__3__Impl"
    // InternalMyDsl.g:507:1: rule__ZNotationModel__Group_4__3__Impl : ( ( rule__ZNotationModel__Group_4_3__0 )* ) ;
    public final void rule__ZNotationModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( ( rule__ZNotationModel__Group_4_3__0 )* ) )
            // InternalMyDsl.g:512:1: ( ( rule__ZNotationModel__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:512:1: ( ( rule__ZNotationModel__Group_4_3__0 )* )
            // InternalMyDsl.g:513:2: ( rule__ZNotationModel__Group_4_3__0 )*
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_4_3()); 
            // InternalMyDsl.g:514:2: ( rule__ZNotationModel__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:514:3: rule__ZNotationModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ZNotationModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getZNotationModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4__3__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4__4"
    // InternalMyDsl.g:522:1: rule__ZNotationModel__Group_4__4 : rule__ZNotationModel__Group_4__4__Impl ;
    public final void rule__ZNotationModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__ZNotationModel__Group_4__4__Impl )
            // InternalMyDsl.g:527:2: rule__ZNotationModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4__4__Impl();

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
    // $ANTLR end "rule__ZNotationModel__Group_4__4"


    // $ANTLR start "rule__ZNotationModel__Group_4__4__Impl"
    // InternalMyDsl.g:533:1: rule__ZNotationModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ZNotationModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( '}' ) )
            // InternalMyDsl.g:538:1: ( '}' )
            {
            // InternalMyDsl.g:538:1: ( '}' )
            // InternalMyDsl.g:539:2: '}'
            {
             before(grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4__4__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4_3__0"
    // InternalMyDsl.g:549:1: rule__ZNotationModel__Group_4_3__0 : rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1 ;
    public final void rule__ZNotationModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1 )
            // InternalMyDsl.g:554:2: rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ZNotationModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4_3__1();

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
    // $ANTLR end "rule__ZNotationModel__Group_4_3__0"


    // $ANTLR start "rule__ZNotationModel__Group_4_3__0__Impl"
    // InternalMyDsl.g:561:1: rule__ZNotationModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ZNotationModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( ',' ) )
            // InternalMyDsl.g:566:1: ( ',' )
            {
            // InternalMyDsl.g:566:1: ( ',' )
            // InternalMyDsl.g:567:2: ','
            {
             before(grammarAccess.getZNotationModelAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getZNotationModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__ZNotationModel__Group_4_3__1"
    // InternalMyDsl.g:576:1: rule__ZNotationModel__Group_4_3__1 : rule__ZNotationModel__Group_4_3__1__Impl ;
    public final void rule__ZNotationModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__ZNotationModel__Group_4_3__1__Impl )
            // InternalMyDsl.g:581:2: rule__ZNotationModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__ZNotationModel__Group_4_3__1"


    // $ANTLR start "rule__ZNotationModel__Group_4_3__1__Impl"
    // InternalMyDsl.g:587:1: rule__ZNotationModel__Group_4_3__1__Impl : ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) ) ;
    public final void rule__ZNotationModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:592:1: ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:592:1: ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) )
            // InternalMyDsl.g:593:2: ( rule__ZNotationModel__SchemaAssignment_4_3_1 )
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_3_1()); 
            // InternalMyDsl.g:594:2: ( rule__ZNotationModel__SchemaAssignment_4_3_1 )
            // InternalMyDsl.g:594:3: rule__ZNotationModel__SchemaAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ZNotationModel__SchemaAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_3_1()); 

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
    // $ANTLR end "rule__ZNotationModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalMyDsl.g:603:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalMyDsl.g:608:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

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
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalMyDsl.g:615:1: rule__Schema__Group__0__Impl : ( () ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( () ) )
            // InternalMyDsl.g:620:1: ( () )
            {
            // InternalMyDsl.g:620:1: ( () )
            // InternalMyDsl.g:621:2: ()
            {
             before(grammarAccess.getSchemaAccess().getSchemaAction_0()); 
            // InternalMyDsl.g:622:2: ()
            // InternalMyDsl.g:622:3: 
            {
            }

             after(grammarAccess.getSchemaAccess().getSchemaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalMyDsl.g:630:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalMyDsl.g:635:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

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
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalMyDsl.g:642:1: rule__Schema__Group__1__Impl : ( 'Schema' ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( 'Schema' ) )
            // InternalMyDsl.g:647:1: ( 'Schema' )
            {
            // InternalMyDsl.g:647:1: ( 'Schema' )
            // InternalMyDsl.g:648:2: 'Schema'
            {
             before(grammarAccess.getSchemaAccess().getSchemaKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemaKeyword_1()); 

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
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalMyDsl.g:657:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalMyDsl.g:662:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

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
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalMyDsl.g:669:1: rule__Schema__Group__2__Impl : ( '{' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( '{' ) )
            // InternalMyDsl.g:674:1: ( '{' )
            {
            // InternalMyDsl.g:674:1: ( '{' )
            // InternalMyDsl.g:675:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalMyDsl.g:684:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalMyDsl.g:689:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

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
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalMyDsl.g:696:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__Group_3__0 )? ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( ( rule__Schema__Group_3__0 )? ) )
            // InternalMyDsl.g:701:1: ( ( rule__Schema__Group_3__0 )? )
            {
            // InternalMyDsl.g:701:1: ( ( rule__Schema__Group_3__0 )? )
            // InternalMyDsl.g:702:2: ( rule__Schema__Group_3__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_3()); 
            // InternalMyDsl.g:703:2: ( rule__Schema__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:703:3: rule__Schema__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalMyDsl.g:711:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalMyDsl.g:716:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__5();

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
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalMyDsl.g:723:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__Group_4__0 )? ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__Schema__Group_4__0 )? ) )
            // InternalMyDsl.g:728:1: ( ( rule__Schema__Group_4__0 )? )
            {
            // InternalMyDsl.g:728:1: ( ( rule__Schema__Group_4__0 )? )
            // InternalMyDsl.g:729:2: ( rule__Schema__Group_4__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_4()); 
            // InternalMyDsl.g:730:2: ( rule__Schema__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:730:3: rule__Schema__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // InternalMyDsl.g:738:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl rule__Schema__Group__6 ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__Schema__Group__5__Impl rule__Schema__Group__6 )
            // InternalMyDsl.g:743:2: rule__Schema__Group__5__Impl rule__Schema__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__6();

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
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // InternalMyDsl.g:750:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__Group_5__0 )? ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__Schema__Group_5__0 )? ) )
            // InternalMyDsl.g:755:1: ( ( rule__Schema__Group_5__0 )? )
            {
            // InternalMyDsl.g:755:1: ( ( rule__Schema__Group_5__0 )? )
            // InternalMyDsl.g:756:2: ( rule__Schema__Group_5__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_5()); 
            // InternalMyDsl.g:757:2: ( rule__Schema__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:757:3: rule__Schema__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__Schema__Group__6"
    // InternalMyDsl.g:765:1: rule__Schema__Group__6 : rule__Schema__Group__6__Impl ;
    public final void rule__Schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__Schema__Group__6__Impl )
            // InternalMyDsl.g:770:2: rule__Schema__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__6__Impl();

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
    // $ANTLR end "rule__Schema__Group__6"


    // $ANTLR start "rule__Schema__Group__6__Impl"
    // InternalMyDsl.g:776:1: rule__Schema__Group__6__Impl : ( '}' ) ;
    public final void rule__Schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( '}' ) )
            // InternalMyDsl.g:781:1: ( '}' )
            {
            // InternalMyDsl.g:781:1: ( '}' )
            // InternalMyDsl.g:782:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Schema__Group__6__Impl"


    // $ANTLR start "rule__Schema__Group_3__0"
    // InternalMyDsl.g:792:1: rule__Schema__Group_3__0 : rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1 ;
    public final void rule__Schema__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1 )
            // InternalMyDsl.g:797:2: rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Schema__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_3__1();

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
    // $ANTLR end "rule__Schema__Group_3__0"


    // $ANTLR start "rule__Schema__Group_3__0__Impl"
    // InternalMyDsl.g:804:1: rule__Schema__Group_3__0__Impl : ( 'SchemaTitle' ) ;
    public final void rule__Schema__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( 'SchemaTitle' ) )
            // InternalMyDsl.g:809:1: ( 'SchemaTitle' )
            {
            // InternalMyDsl.g:809:1: ( 'SchemaTitle' )
            // InternalMyDsl.g:810:2: 'SchemaTitle'
            {
             before(grammarAccess.getSchemaAccess().getSchemaTitleKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemaTitleKeyword_3_0()); 

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
    // $ANTLR end "rule__Schema__Group_3__0__Impl"


    // $ANTLR start "rule__Schema__Group_3__1"
    // InternalMyDsl.g:819:1: rule__Schema__Group_3__1 : rule__Schema__Group_3__1__Impl ;
    public final void rule__Schema__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( rule__Schema__Group_3__1__Impl )
            // InternalMyDsl.g:824:2: rule__Schema__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_3__1__Impl();

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
    // $ANTLR end "rule__Schema__Group_3__1"


    // $ANTLR start "rule__Schema__Group_3__1__Impl"
    // InternalMyDsl.g:830:1: rule__Schema__Group_3__1__Impl : ( ( rule__Schema__SchemaTitleAssignment_3_1 ) ) ;
    public final void rule__Schema__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( ( rule__Schema__SchemaTitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:835:1: ( ( rule__Schema__SchemaTitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:835:1: ( ( rule__Schema__SchemaTitleAssignment_3_1 ) )
            // InternalMyDsl.g:836:2: ( rule__Schema__SchemaTitleAssignment_3_1 )
            {
             before(grammarAccess.getSchemaAccess().getSchemaTitleAssignment_3_1()); 
            // InternalMyDsl.g:837:2: ( rule__Schema__SchemaTitleAssignment_3_1 )
            // InternalMyDsl.g:837:3: rule__Schema__SchemaTitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__SchemaTitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getSchemaTitleAssignment_3_1()); 

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
    // $ANTLR end "rule__Schema__Group_3__1__Impl"


    // $ANTLR start "rule__Schema__Group_4__0"
    // InternalMyDsl.g:846:1: rule__Schema__Group_4__0 : rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 ;
    public final void rule__Schema__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 )
            // InternalMyDsl.g:851:2: rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Schema__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__1();

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
    // $ANTLR end "rule__Schema__Group_4__0"


    // $ANTLR start "rule__Schema__Group_4__0__Impl"
    // InternalMyDsl.g:858:1: rule__Schema__Group_4__0__Impl : ( 'schemastate' ) ;
    public final void rule__Schema__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( 'schemastate' ) )
            // InternalMyDsl.g:863:1: ( 'schemastate' )
            {
            // InternalMyDsl.g:863:1: ( 'schemastate' )
            // InternalMyDsl.g:864:2: 'schemastate'
            {
             before(grammarAccess.getSchemaAccess().getSchemastateKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemastateKeyword_4_0()); 

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
    // $ANTLR end "rule__Schema__Group_4__0__Impl"


    // $ANTLR start "rule__Schema__Group_4__1"
    // InternalMyDsl.g:873:1: rule__Schema__Group_4__1 : rule__Schema__Group_4__1__Impl ;
    public final void rule__Schema__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( rule__Schema__Group_4__1__Impl )
            // InternalMyDsl.g:878:2: rule__Schema__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__1__Impl();

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
    // $ANTLR end "rule__Schema__Group_4__1"


    // $ANTLR start "rule__Schema__Group_4__1__Impl"
    // InternalMyDsl.g:884:1: rule__Schema__Group_4__1__Impl : ( ( rule__Schema__SchemastateAssignment_4_1 ) ) ;
    public final void rule__Schema__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( ( ( rule__Schema__SchemastateAssignment_4_1 ) ) )
            // InternalMyDsl.g:889:1: ( ( rule__Schema__SchemastateAssignment_4_1 ) )
            {
            // InternalMyDsl.g:889:1: ( ( rule__Schema__SchemastateAssignment_4_1 ) )
            // InternalMyDsl.g:890:2: ( rule__Schema__SchemastateAssignment_4_1 )
            {
             before(grammarAccess.getSchemaAccess().getSchemastateAssignment_4_1()); 
            // InternalMyDsl.g:891:2: ( rule__Schema__SchemastateAssignment_4_1 )
            // InternalMyDsl.g:891:3: rule__Schema__SchemastateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__SchemastateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getSchemastateAssignment_4_1()); 

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
    // $ANTLR end "rule__Schema__Group_4__1__Impl"


    // $ANTLR start "rule__Schema__Group_5__0"
    // InternalMyDsl.g:900:1: rule__Schema__Group_5__0 : rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 ;
    public final void rule__Schema__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 )
            // InternalMyDsl.g:905:2: rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Schema__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__1();

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
    // $ANTLR end "rule__Schema__Group_5__0"


    // $ANTLR start "rule__Schema__Group_5__0__Impl"
    // InternalMyDsl.g:912:1: rule__Schema__Group_5__0__Impl : ( 'relation' ) ;
    public final void rule__Schema__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( 'relation' ) )
            // InternalMyDsl.g:917:1: ( 'relation' )
            {
            // InternalMyDsl.g:917:1: ( 'relation' )
            // InternalMyDsl.g:918:2: 'relation'
            {
             before(grammarAccess.getSchemaAccess().getRelationKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRelationKeyword_5_0()); 

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
    // $ANTLR end "rule__Schema__Group_5__0__Impl"


    // $ANTLR start "rule__Schema__Group_5__1"
    // InternalMyDsl.g:927:1: rule__Schema__Group_5__1 : rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2 ;
    public final void rule__Schema__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2 )
            // InternalMyDsl.g:932:2: rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__2();

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
    // $ANTLR end "rule__Schema__Group_5__1"


    // $ANTLR start "rule__Schema__Group_5__1__Impl"
    // InternalMyDsl.g:939:1: rule__Schema__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Schema__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( '{' ) )
            // InternalMyDsl.g:944:1: ( '{' )
            {
            // InternalMyDsl.g:944:1: ( '{' )
            // InternalMyDsl.g:945:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Schema__Group_5__1__Impl"


    // $ANTLR start "rule__Schema__Group_5__2"
    // InternalMyDsl.g:954:1: rule__Schema__Group_5__2 : rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3 ;
    public final void rule__Schema__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3 )
            // InternalMyDsl.g:959:2: rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__3();

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
    // $ANTLR end "rule__Schema__Group_5__2"


    // $ANTLR start "rule__Schema__Group_5__2__Impl"
    // InternalMyDsl.g:966:1: rule__Schema__Group_5__2__Impl : ( ( rule__Schema__RelationAssignment_5_2 ) ) ;
    public final void rule__Schema__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ( rule__Schema__RelationAssignment_5_2 ) ) )
            // InternalMyDsl.g:971:1: ( ( rule__Schema__RelationAssignment_5_2 ) )
            {
            // InternalMyDsl.g:971:1: ( ( rule__Schema__RelationAssignment_5_2 ) )
            // InternalMyDsl.g:972:2: ( rule__Schema__RelationAssignment_5_2 )
            {
             before(grammarAccess.getSchemaAccess().getRelationAssignment_5_2()); 
            // InternalMyDsl.g:973:2: ( rule__Schema__RelationAssignment_5_2 )
            // InternalMyDsl.g:973:3: rule__Schema__RelationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Schema__RelationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getRelationAssignment_5_2()); 

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
    // $ANTLR end "rule__Schema__Group_5__2__Impl"


    // $ANTLR start "rule__Schema__Group_5__3"
    // InternalMyDsl.g:981:1: rule__Schema__Group_5__3 : rule__Schema__Group_5__3__Impl rule__Schema__Group_5__4 ;
    public final void rule__Schema__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( rule__Schema__Group_5__3__Impl rule__Schema__Group_5__4 )
            // InternalMyDsl.g:986:2: rule__Schema__Group_5__3__Impl rule__Schema__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__4();

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
    // $ANTLR end "rule__Schema__Group_5__3"


    // $ANTLR start "rule__Schema__Group_5__3__Impl"
    // InternalMyDsl.g:993:1: rule__Schema__Group_5__3__Impl : ( ( rule__Schema__Group_5_3__0 )* ) ;
    public final void rule__Schema__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__Schema__Group_5_3__0 )* ) )
            // InternalMyDsl.g:998:1: ( ( rule__Schema__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:998:1: ( ( rule__Schema__Group_5_3__0 )* )
            // InternalMyDsl.g:999:2: ( rule__Schema__Group_5_3__0 )*
            {
             before(grammarAccess.getSchemaAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1000:2: ( rule__Schema__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1000:3: rule__Schema__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Schema__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Schema__Group_5__3__Impl"


    // $ANTLR start "rule__Schema__Group_5__4"
    // InternalMyDsl.g:1008:1: rule__Schema__Group_5__4 : rule__Schema__Group_5__4__Impl ;
    public final void rule__Schema__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( rule__Schema__Group_5__4__Impl )
            // InternalMyDsl.g:1013:2: rule__Schema__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__4__Impl();

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
    // $ANTLR end "rule__Schema__Group_5__4"


    // $ANTLR start "rule__Schema__Group_5__4__Impl"
    // InternalMyDsl.g:1019:1: rule__Schema__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Schema__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( ( '}' ) )
            // InternalMyDsl.g:1024:1: ( '}' )
            {
            // InternalMyDsl.g:1024:1: ( '}' )
            // InternalMyDsl.g:1025:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Schema__Group_5__4__Impl"


    // $ANTLR start "rule__Schema__Group_5_3__0"
    // InternalMyDsl.g:1035:1: rule__Schema__Group_5_3__0 : rule__Schema__Group_5_3__0__Impl rule__Schema__Group_5_3__1 ;
    public final void rule__Schema__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( rule__Schema__Group_5_3__0__Impl rule__Schema__Group_5_3__1 )
            // InternalMyDsl.g:1040:2: rule__Schema__Group_5_3__0__Impl rule__Schema__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_3__1();

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
    // $ANTLR end "rule__Schema__Group_5_3__0"


    // $ANTLR start "rule__Schema__Group_5_3__0__Impl"
    // InternalMyDsl.g:1047:1: rule__Schema__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Schema__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( ',' ) )
            // InternalMyDsl.g:1052:1: ( ',' )
            {
            // InternalMyDsl.g:1052:1: ( ',' )
            // InternalMyDsl.g:1053:2: ','
            {
             before(grammarAccess.getSchemaAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Schema__Group_5_3__0__Impl"


    // $ANTLR start "rule__Schema__Group_5_3__1"
    // InternalMyDsl.g:1062:1: rule__Schema__Group_5_3__1 : rule__Schema__Group_5_3__1__Impl ;
    public final void rule__Schema__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__Schema__Group_5_3__1__Impl )
            // InternalMyDsl.g:1067:2: rule__Schema__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Schema__Group_5_3__1"


    // $ANTLR start "rule__Schema__Group_5_3__1__Impl"
    // InternalMyDsl.g:1073:1: rule__Schema__Group_5_3__1__Impl : ( ( rule__Schema__RelationAssignment_5_3_1 ) ) ;
    public final void rule__Schema__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( ( ( rule__Schema__RelationAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1078:1: ( ( rule__Schema__RelationAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1078:1: ( ( rule__Schema__RelationAssignment_5_3_1 ) )
            // InternalMyDsl.g:1079:2: ( rule__Schema__RelationAssignment_5_3_1 )
            {
             before(grammarAccess.getSchemaAccess().getRelationAssignment_5_3_1()); 
            // InternalMyDsl.g:1080:2: ( rule__Schema__RelationAssignment_5_3_1 )
            // InternalMyDsl.g:1080:3: rule__Schema__RelationAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__RelationAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getRelationAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Schema__Group_5_3__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:1089:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:1094:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:1101:1: rule__Relation__Group__0__Impl : ( () ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( () ) )
            // InternalMyDsl.g:1106:1: ( () )
            {
            // InternalMyDsl.g:1106:1: ( () )
            // InternalMyDsl.g:1107:2: ()
            {
             before(grammarAccess.getRelationAccess().getRelationAction_0()); 
            // InternalMyDsl.g:1108:2: ()
            // InternalMyDsl.g:1108:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getRelationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:1116:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:1121:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:1128:1: rule__Relation__Group__1__Impl : ( 'Relation' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( 'Relation' ) )
            // InternalMyDsl.g:1133:1: ( 'Relation' )
            {
            // InternalMyDsl.g:1133:1: ( 'Relation' )
            // InternalMyDsl.g:1134:2: 'Relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_1()); 

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
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:1143:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:1148:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:1155:1: rule__Relation__Group__2__Impl : ( '{' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( '{' ) )
            // InternalMyDsl.g:1160:1: ( '{' )
            {
            // InternalMyDsl.g:1160:1: ( '{' )
            // InternalMyDsl.g:1161:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:1170:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:1175:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:1182:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__Group_3__0 )? ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ( rule__Relation__Group_3__0 )? ) )
            // InternalMyDsl.g:1187:1: ( ( rule__Relation__Group_3__0 )? )
            {
            // InternalMyDsl.g:1187:1: ( ( rule__Relation__Group_3__0 )? )
            // InternalMyDsl.g:1188:2: ( rule__Relation__Group_3__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_3()); 
            // InternalMyDsl.g:1189:2: ( rule__Relation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1189:3: rule__Relation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:1197:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:1202:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:1209:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 )? ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( ( ( rule__Relation__Group_4__0 )? ) )
            // InternalMyDsl.g:1214:1: ( ( rule__Relation__Group_4__0 )? )
            {
            // InternalMyDsl.g:1214:1: ( ( rule__Relation__Group_4__0 )? )
            // InternalMyDsl.g:1215:2: ( rule__Relation__Group_4__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // InternalMyDsl.g:1216:2: ( rule__Relation__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1216:3: rule__Relation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:1224:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__Relation__Group__5__Impl )
            // InternalMyDsl.g:1229:2: rule__Relation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__5__Impl();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:1235:1: rule__Relation__Group__5__Impl : ( '}' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( ( '}' ) )
            // InternalMyDsl.g:1240:1: ( '}' )
            {
            // InternalMyDsl.g:1240:1: ( '}' )
            // InternalMyDsl.g:1241:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group_3__0"
    // InternalMyDsl.g:1251:1: rule__Relation__Group_3__0 : rule__Relation__Group_3__0__Impl rule__Relation__Group_3__1 ;
    public final void rule__Relation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__Relation__Group_3__0__Impl rule__Relation__Group_3__1 )
            // InternalMyDsl.g:1256:2: rule__Relation__Group_3__0__Impl rule__Relation__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Relation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_3__1();

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
    // $ANTLR end "rule__Relation__Group_3__0"


    // $ANTLR start "rule__Relation__Group_3__0__Impl"
    // InternalMyDsl.g:1263:1: rule__Relation__Group_3__0__Impl : ( 'RelationType' ) ;
    public final void rule__Relation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( ( 'RelationType' ) )
            // InternalMyDsl.g:1268:1: ( 'RelationType' )
            {
            // InternalMyDsl.g:1268:1: ( 'RelationType' )
            // InternalMyDsl.g:1269:2: 'RelationType'
            {
             before(grammarAccess.getRelationAccess().getRelationTypeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Relation__Group_3__0__Impl"


    // $ANTLR start "rule__Relation__Group_3__1"
    // InternalMyDsl.g:1278:1: rule__Relation__Group_3__1 : rule__Relation__Group_3__1__Impl ;
    public final void rule__Relation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__Relation__Group_3__1__Impl )
            // InternalMyDsl.g:1283:2: rule__Relation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Relation__Group_3__1"


    // $ANTLR start "rule__Relation__Group_3__1__Impl"
    // InternalMyDsl.g:1289:1: rule__Relation__Group_3__1__Impl : ( ( rule__Relation__RelationTypeAssignment_3_1 ) ) ;
    public final void rule__Relation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( ( ( rule__Relation__RelationTypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:1294:1: ( ( rule__Relation__RelationTypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1294:1: ( ( rule__Relation__RelationTypeAssignment_3_1 ) )
            // InternalMyDsl.g:1295:2: ( rule__Relation__RelationTypeAssignment_3_1 )
            {
             before(grammarAccess.getRelationAccess().getRelationTypeAssignment_3_1()); 
            // InternalMyDsl.g:1296:2: ( rule__Relation__RelationTypeAssignment_3_1 )
            // InternalMyDsl.g:1296:3: rule__Relation__RelationTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RelationTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRelationTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Relation__Group_3__1__Impl"


    // $ANTLR start "rule__Relation__Group_4__0"
    // InternalMyDsl.g:1305:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // InternalMyDsl.g:1310:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_4__1();

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
    // $ANTLR end "rule__Relation__Group_4__0"


    // $ANTLR start "rule__Relation__Group_4__0__Impl"
    // InternalMyDsl.g:1317:1: rule__Relation__Group_4__0__Impl : ( 'RelatedTo' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( ( 'RelatedTo' ) )
            // InternalMyDsl.g:1322:1: ( 'RelatedTo' )
            {
            // InternalMyDsl.g:1322:1: ( 'RelatedTo' )
            // InternalMyDsl.g:1323:2: 'RelatedTo'
            {
             before(grammarAccess.getRelationAccess().getRelatedToKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelatedToKeyword_4_0()); 

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
    // $ANTLR end "rule__Relation__Group_4__0__Impl"


    // $ANTLR start "rule__Relation__Group_4__1"
    // InternalMyDsl.g:1332:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__Relation__Group_4__1__Impl )
            // InternalMyDsl.g:1337:2: rule__Relation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_4__1__Impl();

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
    // $ANTLR end "rule__Relation__Group_4__1"


    // $ANTLR start "rule__Relation__Group_4__1__Impl"
    // InternalMyDsl.g:1343:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__RelatedToAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( ( ( rule__Relation__RelatedToAssignment_4_1 ) ) )
            // InternalMyDsl.g:1348:1: ( ( rule__Relation__RelatedToAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1348:1: ( ( rule__Relation__RelatedToAssignment_4_1 ) )
            // InternalMyDsl.g:1349:2: ( rule__Relation__RelatedToAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getRelatedToAssignment_4_1()); 
            // InternalMyDsl.g:1350:2: ( rule__Relation__RelatedToAssignment_4_1 )
            // InternalMyDsl.g:1350:3: rule__Relation__RelatedToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RelatedToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRelatedToAssignment_4_1()); 

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
    // $ANTLR end "rule__Relation__Group_4__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:1359:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:1364:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMyDsl.g:1371:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( () ) )
            // InternalMyDsl.g:1376:1: ( () )
            {
            // InternalMyDsl.g:1376:1: ( () )
            // InternalMyDsl.g:1377:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalMyDsl.g:1378:2: ()
            // InternalMyDsl.g:1378:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMyDsl.g:1386:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMyDsl.g:1391:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMyDsl.g:1398:1: rule__Variable__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( ( 'Variable' ) )
            // InternalMyDsl.g:1403:1: ( 'Variable' )
            {
            // InternalMyDsl.g:1403:1: ( 'Variable' )
            // InternalMyDsl.g:1404:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMyDsl.g:1413:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMyDsl.g:1418:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMyDsl.g:1425:1: rule__Variable__Group__2__Impl : ( '{' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( ( '{' ) )
            // InternalMyDsl.g:1430:1: ( '{' )
            {
            // InternalMyDsl.g:1430:1: ( '{' )
            // InternalMyDsl.g:1431:2: '{'
            {
             before(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMyDsl.g:1440:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalMyDsl.g:1445:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMyDsl.g:1452:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( ( rule__Variable__Group_3__0 )? ) )
            // InternalMyDsl.g:1457:1: ( ( rule__Variable__Group_3__0 )? )
            {
            // InternalMyDsl.g:1457:1: ( ( rule__Variable__Group_3__0 )? )
            // InternalMyDsl.g:1458:2: ( rule__Variable__Group_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // InternalMyDsl.g:1459:2: ( rule__Variable__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1459:3: rule__Variable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalMyDsl.g:1467:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalMyDsl.g:1472:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

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
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalMyDsl.g:1479:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalMyDsl.g:1484:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalMyDsl.g:1484:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalMyDsl.g:1485:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalMyDsl.g:1486:2: ( rule__Variable__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1486:3: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalMyDsl.g:1494:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // InternalMyDsl.g:1499:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__6();

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
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalMyDsl.g:1506:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__Group_5__0 )? ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( ( rule__Variable__Group_5__0 )? ) )
            // InternalMyDsl.g:1511:1: ( ( rule__Variable__Group_5__0 )? )
            {
            // InternalMyDsl.g:1511:1: ( ( rule__Variable__Group_5__0 )? )
            // InternalMyDsl.g:1512:2: ( rule__Variable__Group_5__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_5()); 
            // InternalMyDsl.g:1513:2: ( rule__Variable__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1513:3: rule__Variable__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__6"
    // InternalMyDsl.g:1521:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( rule__Variable__Group__6__Impl )
            // InternalMyDsl.g:1526:2: rule__Variable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__6__Impl();

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
    // $ANTLR end "rule__Variable__Group__6"


    // $ANTLR start "rule__Variable__Group__6__Impl"
    // InternalMyDsl.g:1532:1: rule__Variable__Group__6__Impl : ( '}' ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( ( '}' ) )
            // InternalMyDsl.g:1537:1: ( '}' )
            {
            // InternalMyDsl.g:1537:1: ( '}' )
            // InternalMyDsl.g:1538:2: '}'
            {
             before(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Variable__Group__6__Impl"


    // $ANTLR start "rule__Variable__Group_3__0"
    // InternalMyDsl.g:1548:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalMyDsl.g:1553:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1();

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
    // $ANTLR end "rule__Variable__Group_3__0"


    // $ANTLR start "rule__Variable__Group_3__0__Impl"
    // InternalMyDsl.g:1560:1: rule__Variable__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( ( 'Name' ) )
            // InternalMyDsl.g:1565:1: ( 'Name' )
            {
            // InternalMyDsl.g:1565:1: ( 'Name' )
            // InternalMyDsl.g:1566:2: 'Name'
            {
             before(grammarAccess.getVariableAccess().getNameKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Variable__Group_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_3__1"
    // InternalMyDsl.g:1575:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( rule__Variable__Group_3__1__Impl )
            // InternalMyDsl.g:1580:2: rule__Variable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_3__1"


    // $ANTLR start "rule__Variable__Group_3__1__Impl"
    // InternalMyDsl.g:1586:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__NameAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( ( ( rule__Variable__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1591:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1591:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1592:2: ( rule__Variable__NameAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1593:2: ( rule__Variable__NameAssignment_3_1 )
            // InternalMyDsl.g:1593:3: rule__Variable__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Variable__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalMyDsl.g:1602:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalMyDsl.g:1607:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1();

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
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalMyDsl.g:1614:1: rule__Variable__Group_4__0__Impl : ( 'Value' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( 'Value' ) )
            // InternalMyDsl.g:1619:1: ( 'Value' )
            {
            // InternalMyDsl.g:1619:1: ( 'Value' )
            // InternalMyDsl.g:1620:2: 'Value'
            {
             before(grammarAccess.getVariableAccess().getValueKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValueKeyword_4_0()); 

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
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalMyDsl.g:1629:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__Variable__Group_4__1__Impl )
            // InternalMyDsl.g:1634:2: rule__Variable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalMyDsl.g:1640:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__ValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( ( ( rule__Variable__ValueAssignment_4_1 ) ) )
            // InternalMyDsl.g:1645:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1645:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            // InternalMyDsl.g:1646:2: ( rule__Variable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_4_1()); 
            // InternalMyDsl.g:1647:2: ( rule__Variable__ValueAssignment_4_1 )
            // InternalMyDsl.g:1647:3: rule__Variable__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__Variable__Group_5__0"
    // InternalMyDsl.g:1656:1: rule__Variable__Group_5__0 : rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 ;
    public final void rule__Variable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 )
            // InternalMyDsl.g:1661:2: rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_5__1();

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
    // $ANTLR end "rule__Variable__Group_5__0"


    // $ANTLR start "rule__Variable__Group_5__0__Impl"
    // InternalMyDsl.g:1668:1: rule__Variable__Group_5__0__Impl : ( 'Type' ) ;
    public final void rule__Variable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( 'Type' ) )
            // InternalMyDsl.g:1673:1: ( 'Type' )
            {
            // InternalMyDsl.g:1673:1: ( 'Type' )
            // InternalMyDsl.g:1674:2: 'Type'
            {
             before(grammarAccess.getVariableAccess().getTypeKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Variable__Group_5__0__Impl"


    // $ANTLR start "rule__Variable__Group_5__1"
    // InternalMyDsl.g:1683:1: rule__Variable__Group_5__1 : rule__Variable__Group_5__1__Impl ;
    public final void rule__Variable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__Variable__Group_5__1__Impl )
            // InternalMyDsl.g:1688:2: rule__Variable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_5__1__Impl();

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
    // $ANTLR end "rule__Variable__Group_5__1"


    // $ANTLR start "rule__Variable__Group_5__1__Impl"
    // InternalMyDsl.g:1694:1: rule__Variable__Group_5__1__Impl : ( ( rule__Variable__TypeAssignment_5_1 ) ) ;
    public final void rule__Variable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( ( ( rule__Variable__TypeAssignment_5_1 ) ) )
            // InternalMyDsl.g:1699:1: ( ( rule__Variable__TypeAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1699:1: ( ( rule__Variable__TypeAssignment_5_1 ) )
            // InternalMyDsl.g:1700:2: ( rule__Variable__TypeAssignment_5_1 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_5_1()); 
            // InternalMyDsl.g:1701:2: ( rule__Variable__TypeAssignment_5_1 )
            // InternalMyDsl.g:1701:3: rule__Variable__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__Variable__Group_5__1__Impl"


    // $ANTLR start "rule__ZNotationModel__ModelNameAssignment_3_1"
    // InternalMyDsl.g:1710:1: rule__ZNotationModel__ModelNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ZNotationModel__ModelNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1715:2: ( ruleEString )
            {
            // InternalMyDsl.g:1715:2: ( ruleEString )
            // InternalMyDsl.g:1716:3: ruleEString
            {
             before(grammarAccess.getZNotationModelAccess().getModelNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getZNotationModelAccess().getModelNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ZNotationModel__ModelNameAssignment_3_1"


    // $ANTLR start "rule__ZNotationModel__SchemaAssignment_4_2"
    // InternalMyDsl.g:1725:1: rule__ZNotationModel__SchemaAssignment_4_2 : ( ruleSchema ) ;
    public final void rule__ZNotationModel__SchemaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( ruleSchema ) )
            // InternalMyDsl.g:1730:2: ( ruleSchema )
            {
            // InternalMyDsl.g:1730:2: ( ruleSchema )
            // InternalMyDsl.g:1731:3: ruleSchema
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ZNotationModel__SchemaAssignment_4_2"


    // $ANTLR start "rule__ZNotationModel__SchemaAssignment_4_3_1"
    // InternalMyDsl.g:1740:1: rule__ZNotationModel__SchemaAssignment_4_3_1 : ( ruleSchema ) ;
    public final void rule__ZNotationModel__SchemaAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ruleSchema ) )
            // InternalMyDsl.g:1745:2: ( ruleSchema )
            {
            // InternalMyDsl.g:1745:2: ( ruleSchema )
            // InternalMyDsl.g:1746:3: ruleSchema
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getZNotationModelAccess().getSchemaSchemaParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__ZNotationModel__SchemaAssignment_4_3_1"


    // $ANTLR start "rule__Schema__SchemaTitleAssignment_3_1"
    // InternalMyDsl.g:1755:1: rule__Schema__SchemaTitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Schema__SchemaTitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1760:2: ( ruleEString )
            {
            // InternalMyDsl.g:1760:2: ( ruleEString )
            // InternalMyDsl.g:1761:3: ruleEString
            {
             before(grammarAccess.getSchemaAccess().getSchemaTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getSchemaTitleEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Schema__SchemaTitleAssignment_3_1"


    // $ANTLR start "rule__Schema__SchemastateAssignment_4_1"
    // InternalMyDsl.g:1770:1: rule__Schema__SchemastateAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Schema__SchemastateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1775:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1775:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1776:3: ( ruleEString )
            {
             before(grammarAccess.getSchemaAccess().getSchemastateSchemaStateCrossReference_4_1_0()); 
            // InternalMyDsl.g:1777:3: ( ruleEString )
            // InternalMyDsl.g:1778:4: ruleEString
            {
             before(grammarAccess.getSchemaAccess().getSchemastateSchemaStateEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getSchemastateSchemaStateEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSchemaAccess().getSchemastateSchemaStateCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Schema__SchemastateAssignment_4_1"


    // $ANTLR start "rule__Schema__RelationAssignment_5_2"
    // InternalMyDsl.g:1789:1: rule__Schema__RelationAssignment_5_2 : ( ruleRelation ) ;
    public final void rule__Schema__RelationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1793:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:1794:2: ( ruleRelation )
            {
            // InternalMyDsl.g:1794:2: ( ruleRelation )
            // InternalMyDsl.g:1795:3: ruleRelation
            {
             before(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Schema__RelationAssignment_5_2"


    // $ANTLR start "rule__Schema__RelationAssignment_5_3_1"
    // InternalMyDsl.g:1804:1: rule__Schema__RelationAssignment_5_3_1 : ( ruleRelation ) ;
    public final void rule__Schema__RelationAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:1809:2: ( ruleRelation )
            {
            // InternalMyDsl.g:1809:2: ( ruleRelation )
            // InternalMyDsl.g:1810:3: ruleRelation
            {
             before(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getRelationRelationParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Schema__RelationAssignment_5_3_1"


    // $ANTLR start "rule__Relation__RelationTypeAssignment_3_1"
    // InternalMyDsl.g:1819:1: rule__Relation__RelationTypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Relation__RelationTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1824:2: ( ruleEString )
            {
            // InternalMyDsl.g:1824:2: ( ruleEString )
            // InternalMyDsl.g:1825:3: ruleEString
            {
             before(grammarAccess.getRelationAccess().getRelationTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRelationTypeEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Relation__RelationTypeAssignment_3_1"


    // $ANTLR start "rule__Relation__RelatedToAssignment_4_1"
    // InternalMyDsl.g:1834:1: rule__Relation__RelatedToAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Relation__RelatedToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1839:2: ( ruleEString )
            {
            // InternalMyDsl.g:1839:2: ( ruleEString )
            // InternalMyDsl.g:1840:3: ruleEString
            {
             before(grammarAccess.getRelationAccess().getRelatedToEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRelatedToEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Relation__RelatedToAssignment_4_1"


    // $ANTLR start "rule__Variable__NameAssignment_3_1"
    // InternalMyDsl.g:1849:1: rule__Variable__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1854:2: ( ruleEString )
            {
            // InternalMyDsl.g:1854:2: ( ruleEString )
            // InternalMyDsl.g:1855:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_3_1"


    // $ANTLR start "rule__Variable__ValueAssignment_4_1"
    // InternalMyDsl.g:1864:1: rule__Variable__ValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Variable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1869:2: ( ruleEString )
            {
            // InternalMyDsl.g:1869:2: ( ruleEString )
            // InternalMyDsl.g:1870:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getValueEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValueEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Variable__ValueAssignment_4_1"


    // $ANTLR start "rule__Variable__TypeAssignment_5_1"
    // InternalMyDsl.g:1879:1: rule__Variable__TypeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Variable__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1884:2: ( ruleEString )
            {
            // InternalMyDsl.g:1884:2: ( ruleEString )
            // InternalMyDsl.g:1885:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Variable__TypeAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E002000L});

}