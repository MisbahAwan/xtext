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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ZNotationModel'", "'{'", "'}'", "'ModelName'", "'schema'", "','", "'Schema'", "'Title'", "'schemastate'", "'Variable'", "'Name'", "'Value'", "'Type'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:128:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVariable EOF )
            // InternalMyDsl.g:130:1: ruleVariable EOF
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
    // InternalMyDsl.g:137:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:144:4: rule__Variable__Group__0
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
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
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
    // InternalMyDsl.g:173:1: rule__ZNotationModel__Group__0 : rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1 ;
    public final void rule__ZNotationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1 )
            // InternalMyDsl.g:178:2: rule__ZNotationModel__Group__0__Impl rule__ZNotationModel__Group__1
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
    // InternalMyDsl.g:185:1: rule__ZNotationModel__Group__0__Impl : ( () ) ;
    public final void rule__ZNotationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( () ) )
            // InternalMyDsl.g:190:1: ( () )
            {
            // InternalMyDsl.g:190:1: ( () )
            // InternalMyDsl.g:191:2: ()
            {
             before(grammarAccess.getZNotationModelAccess().getZNotationModelAction_0()); 
            // InternalMyDsl.g:192:2: ()
            // InternalMyDsl.g:192:3: 
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
    // InternalMyDsl.g:200:1: rule__ZNotationModel__Group__1 : rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2 ;
    public final void rule__ZNotationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2 )
            // InternalMyDsl.g:205:2: rule__ZNotationModel__Group__1__Impl rule__ZNotationModel__Group__2
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
    // InternalMyDsl.g:212:1: rule__ZNotationModel__Group__1__Impl : ( 'ZNotationModel' ) ;
    public final void rule__ZNotationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( 'ZNotationModel' ) )
            // InternalMyDsl.g:217:1: ( 'ZNotationModel' )
            {
            // InternalMyDsl.g:217:1: ( 'ZNotationModel' )
            // InternalMyDsl.g:218:2: 'ZNotationModel'
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
    // InternalMyDsl.g:227:1: rule__ZNotationModel__Group__2 : rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3 ;
    public final void rule__ZNotationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3 )
            // InternalMyDsl.g:232:2: rule__ZNotationModel__Group__2__Impl rule__ZNotationModel__Group__3
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
    // InternalMyDsl.g:239:1: rule__ZNotationModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ZNotationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( '{' ) )
            // InternalMyDsl.g:244:1: ( '{' )
            {
            // InternalMyDsl.g:244:1: ( '{' )
            // InternalMyDsl.g:245:2: '{'
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
    // InternalMyDsl.g:254:1: rule__ZNotationModel__Group__3 : rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4 ;
    public final void rule__ZNotationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4 )
            // InternalMyDsl.g:259:2: rule__ZNotationModel__Group__3__Impl rule__ZNotationModel__Group__4
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
    // InternalMyDsl.g:266:1: rule__ZNotationModel__Group__3__Impl : ( ( rule__ZNotationModel__Group_3__0 )? ) ;
    public final void rule__ZNotationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( ( ( rule__ZNotationModel__Group_3__0 )? ) )
            // InternalMyDsl.g:271:1: ( ( rule__ZNotationModel__Group_3__0 )? )
            {
            // InternalMyDsl.g:271:1: ( ( rule__ZNotationModel__Group_3__0 )? )
            // InternalMyDsl.g:272:2: ( rule__ZNotationModel__Group_3__0 )?
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_3()); 
            // InternalMyDsl.g:273:2: ( rule__ZNotationModel__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:273:3: rule__ZNotationModel__Group_3__0
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
    // InternalMyDsl.g:281:1: rule__ZNotationModel__Group__4 : rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5 ;
    public final void rule__ZNotationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5 )
            // InternalMyDsl.g:286:2: rule__ZNotationModel__Group__4__Impl rule__ZNotationModel__Group__5
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
    // InternalMyDsl.g:293:1: rule__ZNotationModel__Group__4__Impl : ( ( rule__ZNotationModel__Group_4__0 )? ) ;
    public final void rule__ZNotationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ( rule__ZNotationModel__Group_4__0 )? ) )
            // InternalMyDsl.g:298:1: ( ( rule__ZNotationModel__Group_4__0 )? )
            {
            // InternalMyDsl.g:298:1: ( ( rule__ZNotationModel__Group_4__0 )? )
            // InternalMyDsl.g:299:2: ( rule__ZNotationModel__Group_4__0 )?
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_4()); 
            // InternalMyDsl.g:300:2: ( rule__ZNotationModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:300:3: rule__ZNotationModel__Group_4__0
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
    // InternalMyDsl.g:308:1: rule__ZNotationModel__Group__5 : rule__ZNotationModel__Group__5__Impl ;
    public final void rule__ZNotationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__ZNotationModel__Group__5__Impl )
            // InternalMyDsl.g:313:2: rule__ZNotationModel__Group__5__Impl
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
    // InternalMyDsl.g:319:1: rule__ZNotationModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ZNotationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( '}' ) )
            // InternalMyDsl.g:324:1: ( '}' )
            {
            // InternalMyDsl.g:324:1: ( '}' )
            // InternalMyDsl.g:325:2: '}'
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
    // InternalMyDsl.g:335:1: rule__ZNotationModel__Group_3__0 : rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1 ;
    public final void rule__ZNotationModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1 )
            // InternalMyDsl.g:340:2: rule__ZNotationModel__Group_3__0__Impl rule__ZNotationModel__Group_3__1
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
    // InternalMyDsl.g:347:1: rule__ZNotationModel__Group_3__0__Impl : ( 'ModelName' ) ;
    public final void rule__ZNotationModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( 'ModelName' ) )
            // InternalMyDsl.g:352:1: ( 'ModelName' )
            {
            // InternalMyDsl.g:352:1: ( 'ModelName' )
            // InternalMyDsl.g:353:2: 'ModelName'
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
    // InternalMyDsl.g:362:1: rule__ZNotationModel__Group_3__1 : rule__ZNotationModel__Group_3__1__Impl ;
    public final void rule__ZNotationModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__ZNotationModel__Group_3__1__Impl )
            // InternalMyDsl.g:367:2: rule__ZNotationModel__Group_3__1__Impl
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
    // InternalMyDsl.g:373:1: rule__ZNotationModel__Group_3__1__Impl : ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) ) ;
    public final void rule__ZNotationModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) ) )
            // InternalMyDsl.g:378:1: ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:378:1: ( ( rule__ZNotationModel__ModelNameAssignment_3_1 ) )
            // InternalMyDsl.g:379:2: ( rule__ZNotationModel__ModelNameAssignment_3_1 )
            {
             before(grammarAccess.getZNotationModelAccess().getModelNameAssignment_3_1()); 
            // InternalMyDsl.g:380:2: ( rule__ZNotationModel__ModelNameAssignment_3_1 )
            // InternalMyDsl.g:380:3: rule__ZNotationModel__ModelNameAssignment_3_1
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
    // InternalMyDsl.g:389:1: rule__ZNotationModel__Group_4__0 : rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1 ;
    public final void rule__ZNotationModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1 )
            // InternalMyDsl.g:394:2: rule__ZNotationModel__Group_4__0__Impl rule__ZNotationModel__Group_4__1
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
    // InternalMyDsl.g:401:1: rule__ZNotationModel__Group_4__0__Impl : ( 'schema' ) ;
    public final void rule__ZNotationModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( 'schema' ) )
            // InternalMyDsl.g:406:1: ( 'schema' )
            {
            // InternalMyDsl.g:406:1: ( 'schema' )
            // InternalMyDsl.g:407:2: 'schema'
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
    // InternalMyDsl.g:416:1: rule__ZNotationModel__Group_4__1 : rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2 ;
    public final void rule__ZNotationModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2 )
            // InternalMyDsl.g:421:2: rule__ZNotationModel__Group_4__1__Impl rule__ZNotationModel__Group_4__2
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
    // InternalMyDsl.g:428:1: rule__ZNotationModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ZNotationModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( '{' ) )
            // InternalMyDsl.g:433:1: ( '{' )
            {
            // InternalMyDsl.g:433:1: ( '{' )
            // InternalMyDsl.g:434:2: '{'
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
    // InternalMyDsl.g:443:1: rule__ZNotationModel__Group_4__2 : rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3 ;
    public final void rule__ZNotationModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3 )
            // InternalMyDsl.g:448:2: rule__ZNotationModel__Group_4__2__Impl rule__ZNotationModel__Group_4__3
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
    // InternalMyDsl.g:455:1: rule__ZNotationModel__Group_4__2__Impl : ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) ) ;
    public final void rule__ZNotationModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) ) )
            // InternalMyDsl.g:460:1: ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) )
            {
            // InternalMyDsl.g:460:1: ( ( rule__ZNotationModel__SchemaAssignment_4_2 ) )
            // InternalMyDsl.g:461:2: ( rule__ZNotationModel__SchemaAssignment_4_2 )
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_2()); 
            // InternalMyDsl.g:462:2: ( rule__ZNotationModel__SchemaAssignment_4_2 )
            // InternalMyDsl.g:462:3: rule__ZNotationModel__SchemaAssignment_4_2
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
    // InternalMyDsl.g:470:1: rule__ZNotationModel__Group_4__3 : rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4 ;
    public final void rule__ZNotationModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4 )
            // InternalMyDsl.g:475:2: rule__ZNotationModel__Group_4__3__Impl rule__ZNotationModel__Group_4__4
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
    // InternalMyDsl.g:482:1: rule__ZNotationModel__Group_4__3__Impl : ( ( rule__ZNotationModel__Group_4_3__0 )* ) ;
    public final void rule__ZNotationModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ( rule__ZNotationModel__Group_4_3__0 )* ) )
            // InternalMyDsl.g:487:1: ( ( rule__ZNotationModel__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:487:1: ( ( rule__ZNotationModel__Group_4_3__0 )* )
            // InternalMyDsl.g:488:2: ( rule__ZNotationModel__Group_4_3__0 )*
            {
             before(grammarAccess.getZNotationModelAccess().getGroup_4_3()); 
            // InternalMyDsl.g:489:2: ( rule__ZNotationModel__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:489:3: rule__ZNotationModel__Group_4_3__0
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
    // InternalMyDsl.g:497:1: rule__ZNotationModel__Group_4__4 : rule__ZNotationModel__Group_4__4__Impl ;
    public final void rule__ZNotationModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__ZNotationModel__Group_4__4__Impl )
            // InternalMyDsl.g:502:2: rule__ZNotationModel__Group_4__4__Impl
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
    // InternalMyDsl.g:508:1: rule__ZNotationModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ZNotationModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( '}' ) )
            // InternalMyDsl.g:513:1: ( '}' )
            {
            // InternalMyDsl.g:513:1: ( '}' )
            // InternalMyDsl.g:514:2: '}'
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
    // InternalMyDsl.g:524:1: rule__ZNotationModel__Group_4_3__0 : rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1 ;
    public final void rule__ZNotationModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1 )
            // InternalMyDsl.g:529:2: rule__ZNotationModel__Group_4_3__0__Impl rule__ZNotationModel__Group_4_3__1
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
    // InternalMyDsl.g:536:1: rule__ZNotationModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ZNotationModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ',' ) )
            // InternalMyDsl.g:541:1: ( ',' )
            {
            // InternalMyDsl.g:541:1: ( ',' )
            // InternalMyDsl.g:542:2: ','
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
    // InternalMyDsl.g:551:1: rule__ZNotationModel__Group_4_3__1 : rule__ZNotationModel__Group_4_3__1__Impl ;
    public final void rule__ZNotationModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__ZNotationModel__Group_4_3__1__Impl )
            // InternalMyDsl.g:556:2: rule__ZNotationModel__Group_4_3__1__Impl
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
    // InternalMyDsl.g:562:1: rule__ZNotationModel__Group_4_3__1__Impl : ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) ) ;
    public final void rule__ZNotationModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:567:1: ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:567:1: ( ( rule__ZNotationModel__SchemaAssignment_4_3_1 ) )
            // InternalMyDsl.g:568:2: ( rule__ZNotationModel__SchemaAssignment_4_3_1 )
            {
             before(grammarAccess.getZNotationModelAccess().getSchemaAssignment_4_3_1()); 
            // InternalMyDsl.g:569:2: ( rule__ZNotationModel__SchemaAssignment_4_3_1 )
            // InternalMyDsl.g:569:3: rule__ZNotationModel__SchemaAssignment_4_3_1
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
    // InternalMyDsl.g:578:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalMyDsl.g:583:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
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
    // InternalMyDsl.g:590:1: rule__Schema__Group__0__Impl : ( () ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( () ) )
            // InternalMyDsl.g:595:1: ( () )
            {
            // InternalMyDsl.g:595:1: ( () )
            // InternalMyDsl.g:596:2: ()
            {
             before(grammarAccess.getSchemaAccess().getSchemaAction_0()); 
            // InternalMyDsl.g:597:2: ()
            // InternalMyDsl.g:597:3: 
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
    // InternalMyDsl.g:605:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalMyDsl.g:610:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
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
    // InternalMyDsl.g:617:1: rule__Schema__Group__1__Impl : ( 'Schema' ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( 'Schema' ) )
            // InternalMyDsl.g:622:1: ( 'Schema' )
            {
            // InternalMyDsl.g:622:1: ( 'Schema' )
            // InternalMyDsl.g:623:2: 'Schema'
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
    // InternalMyDsl.g:632:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalMyDsl.g:637:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
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
    // InternalMyDsl.g:644:1: rule__Schema__Group__2__Impl : ( '{' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( '{' ) )
            // InternalMyDsl.g:649:1: ( '{' )
            {
            // InternalMyDsl.g:649:1: ( '{' )
            // InternalMyDsl.g:650:2: '{'
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
    // InternalMyDsl.g:659:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalMyDsl.g:664:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
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
    // InternalMyDsl.g:671:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__Group_3__0 )? ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__Schema__Group_3__0 )? ) )
            // InternalMyDsl.g:676:1: ( ( rule__Schema__Group_3__0 )? )
            {
            // InternalMyDsl.g:676:1: ( ( rule__Schema__Group_3__0 )? )
            // InternalMyDsl.g:677:2: ( rule__Schema__Group_3__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_3()); 
            // InternalMyDsl.g:678:2: ( rule__Schema__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:678:3: rule__Schema__Group_3__0
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
    // InternalMyDsl.g:686:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalMyDsl.g:691:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
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
    // InternalMyDsl.g:698:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__Group_4__0 )? ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ( rule__Schema__Group_4__0 )? ) )
            // InternalMyDsl.g:703:1: ( ( rule__Schema__Group_4__0 )? )
            {
            // InternalMyDsl.g:703:1: ( ( rule__Schema__Group_4__0 )? )
            // InternalMyDsl.g:704:2: ( rule__Schema__Group_4__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_4()); 
            // InternalMyDsl.g:705:2: ( rule__Schema__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:705:3: rule__Schema__Group_4__0
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
    // InternalMyDsl.g:713:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Schema__Group__5__Impl )
            // InternalMyDsl.g:718:2: rule__Schema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__5__Impl();

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
    // InternalMyDsl.g:724:1: rule__Schema__Group__5__Impl : ( '}' ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( '}' ) )
            // InternalMyDsl.g:729:1: ( '}' )
            {
            // InternalMyDsl.g:729:1: ( '}' )
            // InternalMyDsl.g:730:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Schema__Group_3__0"
    // InternalMyDsl.g:740:1: rule__Schema__Group_3__0 : rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1 ;
    public final void rule__Schema__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1 )
            // InternalMyDsl.g:745:2: rule__Schema__Group_3__0__Impl rule__Schema__Group_3__1
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
    // InternalMyDsl.g:752:1: rule__Schema__Group_3__0__Impl : ( 'Title' ) ;
    public final void rule__Schema__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( 'Title' ) )
            // InternalMyDsl.g:757:1: ( 'Title' )
            {
            // InternalMyDsl.g:757:1: ( 'Title' )
            // InternalMyDsl.g:758:2: 'Title'
            {
             before(grammarAccess.getSchemaAccess().getTitleKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getTitleKeyword_3_0()); 

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
    // InternalMyDsl.g:767:1: rule__Schema__Group_3__1 : rule__Schema__Group_3__1__Impl ;
    public final void rule__Schema__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Schema__Group_3__1__Impl )
            // InternalMyDsl.g:772:2: rule__Schema__Group_3__1__Impl
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
    // InternalMyDsl.g:778:1: rule__Schema__Group_3__1__Impl : ( ( rule__Schema__TitleAssignment_3_1 ) ) ;
    public final void rule__Schema__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( rule__Schema__TitleAssignment_3_1 ) ) )
            // InternalMyDsl.g:783:1: ( ( rule__Schema__TitleAssignment_3_1 ) )
            {
            // InternalMyDsl.g:783:1: ( ( rule__Schema__TitleAssignment_3_1 ) )
            // InternalMyDsl.g:784:2: ( rule__Schema__TitleAssignment_3_1 )
            {
             before(grammarAccess.getSchemaAccess().getTitleAssignment_3_1()); 
            // InternalMyDsl.g:785:2: ( rule__Schema__TitleAssignment_3_1 )
            // InternalMyDsl.g:785:3: rule__Schema__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getTitleAssignment_3_1()); 

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
    // InternalMyDsl.g:794:1: rule__Schema__Group_4__0 : rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 ;
    public final void rule__Schema__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 )
            // InternalMyDsl.g:799:2: rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1
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
    // InternalMyDsl.g:806:1: rule__Schema__Group_4__0__Impl : ( 'schemastate' ) ;
    public final void rule__Schema__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( 'schemastate' ) )
            // InternalMyDsl.g:811:1: ( 'schemastate' )
            {
            // InternalMyDsl.g:811:1: ( 'schemastate' )
            // InternalMyDsl.g:812:2: 'schemastate'
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
    // InternalMyDsl.g:821:1: rule__Schema__Group_4__1 : rule__Schema__Group_4__1__Impl ;
    public final void rule__Schema__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Schema__Group_4__1__Impl )
            // InternalMyDsl.g:826:2: rule__Schema__Group_4__1__Impl
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
    // InternalMyDsl.g:832:1: rule__Schema__Group_4__1__Impl : ( ( rule__Schema__SchemastateAssignment_4_1 ) ) ;
    public final void rule__Schema__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( ( ( rule__Schema__SchemastateAssignment_4_1 ) ) )
            // InternalMyDsl.g:837:1: ( ( rule__Schema__SchemastateAssignment_4_1 ) )
            {
            // InternalMyDsl.g:837:1: ( ( rule__Schema__SchemastateAssignment_4_1 ) )
            // InternalMyDsl.g:838:2: ( rule__Schema__SchemastateAssignment_4_1 )
            {
             before(grammarAccess.getSchemaAccess().getSchemastateAssignment_4_1()); 
            // InternalMyDsl.g:839:2: ( rule__Schema__SchemastateAssignment_4_1 )
            // InternalMyDsl.g:839:3: rule__Schema__SchemastateAssignment_4_1
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:848:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:853:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:860:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( () ) )
            // InternalMyDsl.g:865:1: ( () )
            {
            // InternalMyDsl.g:865:1: ( () )
            // InternalMyDsl.g:866:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalMyDsl.g:867:2: ()
            // InternalMyDsl.g:867:3: 
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
    // InternalMyDsl.g:875:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMyDsl.g:880:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalMyDsl.g:887:1: rule__Variable__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( 'Variable' ) )
            // InternalMyDsl.g:892:1: ( 'Variable' )
            {
            // InternalMyDsl.g:892:1: ( 'Variable' )
            // InternalMyDsl.g:893:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:902:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMyDsl.g:907:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:914:1: rule__Variable__Group__2__Impl : ( '{' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( '{' ) )
            // InternalMyDsl.g:919:1: ( '{' )
            {
            // InternalMyDsl.g:919:1: ( '{' )
            // InternalMyDsl.g:920:2: '{'
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
    // InternalMyDsl.g:929:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalMyDsl.g:934:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:941:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( ( rule__Variable__Group_3__0 )? ) )
            // InternalMyDsl.g:946:1: ( ( rule__Variable__Group_3__0 )? )
            {
            // InternalMyDsl.g:946:1: ( ( rule__Variable__Group_3__0 )? )
            // InternalMyDsl.g:947:2: ( rule__Variable__Group_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // InternalMyDsl.g:948:2: ( rule__Variable__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:948:3: rule__Variable__Group_3__0
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
    // InternalMyDsl.g:956:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalMyDsl.g:961:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:968:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalMyDsl.g:973:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalMyDsl.g:973:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalMyDsl.g:974:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalMyDsl.g:975:2: ( rule__Variable__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:975:3: rule__Variable__Group_4__0
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
    // InternalMyDsl.g:983:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // InternalMyDsl.g:988:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:995:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__Group_5__0 )? ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( ( rule__Variable__Group_5__0 )? ) )
            // InternalMyDsl.g:1000:1: ( ( rule__Variable__Group_5__0 )? )
            {
            // InternalMyDsl.g:1000:1: ( ( rule__Variable__Group_5__0 )? )
            // InternalMyDsl.g:1001:2: ( rule__Variable__Group_5__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_5()); 
            // InternalMyDsl.g:1002:2: ( rule__Variable__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1002:3: rule__Variable__Group_5__0
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
    // InternalMyDsl.g:1010:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Variable__Group__6__Impl )
            // InternalMyDsl.g:1015:2: rule__Variable__Group__6__Impl
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
    // InternalMyDsl.g:1021:1: rule__Variable__Group__6__Impl : ( '}' ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( '}' ) )
            // InternalMyDsl.g:1026:1: ( '}' )
            {
            // InternalMyDsl.g:1026:1: ( '}' )
            // InternalMyDsl.g:1027:2: '}'
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
    // InternalMyDsl.g:1037:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalMyDsl.g:1042:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
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
    // InternalMyDsl.g:1049:1: rule__Variable__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( 'Name' ) )
            // InternalMyDsl.g:1054:1: ( 'Name' )
            {
            // InternalMyDsl.g:1054:1: ( 'Name' )
            // InternalMyDsl.g:1055:2: 'Name'
            {
             before(grammarAccess.getVariableAccess().getNameKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1064:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Variable__Group_3__1__Impl )
            // InternalMyDsl.g:1069:2: rule__Variable__Group_3__1__Impl
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
    // InternalMyDsl.g:1075:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__NameAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( ( rule__Variable__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1080:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1080:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1081:2: ( rule__Variable__NameAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1082:2: ( rule__Variable__NameAssignment_3_1 )
            // InternalMyDsl.g:1082:3: rule__Variable__NameAssignment_3_1
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
    // InternalMyDsl.g:1091:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalMyDsl.g:1096:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
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
    // InternalMyDsl.g:1103:1: rule__Variable__Group_4__0__Impl : ( 'Value' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( 'Value' ) )
            // InternalMyDsl.g:1108:1: ( 'Value' )
            {
            // InternalMyDsl.g:1108:1: ( 'Value' )
            // InternalMyDsl.g:1109:2: 'Value'
            {
             before(grammarAccess.getVariableAccess().getValueKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1118:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Variable__Group_4__1__Impl )
            // InternalMyDsl.g:1123:2: rule__Variable__Group_4__1__Impl
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
    // InternalMyDsl.g:1129:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__ValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( ( ( rule__Variable__ValueAssignment_4_1 ) ) )
            // InternalMyDsl.g:1134:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1134:1: ( ( rule__Variable__ValueAssignment_4_1 ) )
            // InternalMyDsl.g:1135:2: ( rule__Variable__ValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment_4_1()); 
            // InternalMyDsl.g:1136:2: ( rule__Variable__ValueAssignment_4_1 )
            // InternalMyDsl.g:1136:3: rule__Variable__ValueAssignment_4_1
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
    // InternalMyDsl.g:1145:1: rule__Variable__Group_5__0 : rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 ;
    public final void rule__Variable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 )
            // InternalMyDsl.g:1150:2: rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1
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
    // InternalMyDsl.g:1157:1: rule__Variable__Group_5__0__Impl : ( 'Type' ) ;
    public final void rule__Variable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( 'Type' ) )
            // InternalMyDsl.g:1162:1: ( 'Type' )
            {
            // InternalMyDsl.g:1162:1: ( 'Type' )
            // InternalMyDsl.g:1163:2: 'Type'
            {
             before(grammarAccess.getVariableAccess().getTypeKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1172:1: rule__Variable__Group_5__1 : rule__Variable__Group_5__1__Impl ;
    public final void rule__Variable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Variable__Group_5__1__Impl )
            // InternalMyDsl.g:1177:2: rule__Variable__Group_5__1__Impl
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
    // InternalMyDsl.g:1183:1: rule__Variable__Group_5__1__Impl : ( ( rule__Variable__TypeAssignment_5_1 ) ) ;
    public final void rule__Variable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( ( ( rule__Variable__TypeAssignment_5_1 ) ) )
            // InternalMyDsl.g:1188:1: ( ( rule__Variable__TypeAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1188:1: ( ( rule__Variable__TypeAssignment_5_1 ) )
            // InternalMyDsl.g:1189:2: ( rule__Variable__TypeAssignment_5_1 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_5_1()); 
            // InternalMyDsl.g:1190:2: ( rule__Variable__TypeAssignment_5_1 )
            // InternalMyDsl.g:1190:3: rule__Variable__TypeAssignment_5_1
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
    // InternalMyDsl.g:1199:1: rule__ZNotationModel__ModelNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ZNotationModel__ModelNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1204:2: ( ruleEString )
            {
            // InternalMyDsl.g:1204:2: ( ruleEString )
            // InternalMyDsl.g:1205:3: ruleEString
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
    // InternalMyDsl.g:1214:1: rule__ZNotationModel__SchemaAssignment_4_2 : ( ruleSchema ) ;
    public final void rule__ZNotationModel__SchemaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( ruleSchema ) )
            // InternalMyDsl.g:1219:2: ( ruleSchema )
            {
            // InternalMyDsl.g:1219:2: ( ruleSchema )
            // InternalMyDsl.g:1220:3: ruleSchema
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
    // InternalMyDsl.g:1229:1: rule__ZNotationModel__SchemaAssignment_4_3_1 : ( ruleSchema ) ;
    public final void rule__ZNotationModel__SchemaAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( ruleSchema ) )
            // InternalMyDsl.g:1234:2: ( ruleSchema )
            {
            // InternalMyDsl.g:1234:2: ( ruleSchema )
            // InternalMyDsl.g:1235:3: ruleSchema
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


    // $ANTLR start "rule__Schema__TitleAssignment_3_1"
    // InternalMyDsl.g:1244:1: rule__Schema__TitleAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Schema__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1249:2: ( ruleEString )
            {
            // InternalMyDsl.g:1249:2: ( ruleEString )
            // InternalMyDsl.g:1250:3: ruleEString
            {
             before(grammarAccess.getSchemaAccess().getTitleEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getTitleEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Schema__TitleAssignment_3_1"


    // $ANTLR start "rule__Schema__SchemastateAssignment_4_1"
    // InternalMyDsl.g:1259:1: rule__Schema__SchemastateAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Schema__SchemastateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1264:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1264:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1265:3: ( ruleEString )
            {
             before(grammarAccess.getSchemaAccess().getSchemastateSchemaStateCrossReference_4_1_0()); 
            // InternalMyDsl.g:1266:3: ( ruleEString )
            // InternalMyDsl.g:1267:4: ruleEString
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


    // $ANTLR start "rule__Variable__NameAssignment_3_1"
    // InternalMyDsl.g:1278:1: rule__Variable__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1283:2: ( ruleEString )
            {
            // InternalMyDsl.g:1283:2: ( ruleEString )
            // InternalMyDsl.g:1284:3: ruleEString
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
    // InternalMyDsl.g:1293:1: rule__Variable__ValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Variable__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1298:2: ( ruleEString )
            {
            // InternalMyDsl.g:1298:2: ( ruleEString )
            // InternalMyDsl.g:1299:3: ruleEString
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
    // InternalMyDsl.g:1308:1: rule__Variable__TypeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Variable__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1313:2: ( ruleEString )
            {
            // InternalMyDsl.g:1313:2: ( ruleEString )
            // InternalMyDsl.g:1314:3: ruleEString
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E02000L});

}