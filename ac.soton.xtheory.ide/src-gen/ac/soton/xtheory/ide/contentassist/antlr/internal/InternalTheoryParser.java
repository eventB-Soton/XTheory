package ac.soton.xtheory.ide.contentassist.antlr.internal;

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
import ac.soton.xtheory.services.TheoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prefix'", "'infix'", "'postfix'", "'theory'", "'end'", "'('", "')'", "'import'", "'type'", "'op'", "'axm'", "'thm'", "'ruleblock'", "'='", "'|'", "','", "':'", "'#'", "'for'", "'case'", "'=>'", "'@'", "'variables'", "'rule'", "'=='", "'|-'", "'associative'", "'commutative'", "'required'"
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

    	public void setGrammarAccess(TheoryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTheory"
    // InternalTheory.g:53:1: entryRuleTheory : ruleTheory EOF ;
    public final void entryRuleTheory() throws RecognitionException {
        try {
            // InternalTheory.g:54:1: ( ruleTheory EOF )
            // InternalTheory.g:55:1: ruleTheory EOF
            {
             before(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            ruleTheory();

            state._fsp--;

             after(grammarAccess.getTheoryRule()); 
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
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheory.g:62:1: ruleTheory : ( ( rule__Theory__Group__0 ) ) ;
    public final void ruleTheory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:66:2: ( ( ( rule__Theory__Group__0 ) ) )
            // InternalTheory.g:67:2: ( ( rule__Theory__Group__0 ) )
            {
            // InternalTheory.g:67:2: ( ( rule__Theory__Group__0 ) )
            // InternalTheory.g:68:3: ( rule__Theory__Group__0 )
            {
             before(grammarAccess.getTheoryAccess().getGroup()); 
            // InternalTheory.g:69:3: ( rule__Theory__Group__0 )
            // InternalTheory.g:69:4: rule__Theory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getGroup()); 

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
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleParameter"
    // InternalTheory.g:78:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalTheory.g:79:1: ( ruleParameter EOF )
            // InternalTheory.g:80:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTheory.g:87:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:91:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalTheory.g:92:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalTheory.g:92:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalTheory.g:93:3: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // InternalTheory.g:94:3: ( rule__Parameter__NameAssignment )
            // InternalTheory.g:94:4: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalTheory.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalTheory.g:104:1: ( ruleType EOF )
            // InternalTheory.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTheory.g:112:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:116:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalTheory.g:117:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalTheory.g:117:2: ( ( rule__Type__Group__0 ) )
            // InternalTheory.g:118:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalTheory.g:119:3: ( rule__Type__Group__0 )
            // InternalTheory.g:119:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleConstructor"
    // InternalTheory.g:128:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // InternalTheory.g:129:1: ( ruleConstructor EOF )
            // InternalTheory.g:130:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalTheory.g:137:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:141:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // InternalTheory.g:142:2: ( ( rule__Constructor__Group__0 ) )
            {
            // InternalTheory.g:142:2: ( ( rule__Constructor__Group__0 ) )
            // InternalTheory.g:143:3: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // InternalTheory.g:144:3: ( rule__Constructor__Group__0 )
            // InternalTheory.g:144:4: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleDestructor"
    // InternalTheory.g:153:1: entryRuleDestructor : ruleDestructor EOF ;
    public final void entryRuleDestructor() throws RecognitionException {
        try {
            // InternalTheory.g:154:1: ( ruleDestructor EOF )
            // InternalTheory.g:155:1: ruleDestructor EOF
            {
             before(grammarAccess.getDestructorRule()); 
            pushFollow(FOLLOW_1);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getDestructorRule()); 
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
    // $ANTLR end "entryRuleDestructor"


    // $ANTLR start "ruleDestructor"
    // InternalTheory.g:162:1: ruleDestructor : ( ( rule__Destructor__Group__0 ) ) ;
    public final void ruleDestructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:166:2: ( ( ( rule__Destructor__Group__0 ) ) )
            // InternalTheory.g:167:2: ( ( rule__Destructor__Group__0 ) )
            {
            // InternalTheory.g:167:2: ( ( rule__Destructor__Group__0 ) )
            // InternalTheory.g:168:3: ( rule__Destructor__Group__0 )
            {
             before(grammarAccess.getDestructorAccess().getGroup()); 
            // InternalTheory.g:169:3: ( rule__Destructor__Group__0 )
            // InternalTheory.g:169:4: rule__Destructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getGroup()); 

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
    // $ANTLR end "ruleDestructor"


    // $ANTLR start "entryRuleOperator"
    // InternalTheory.g:178:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalTheory.g:179:1: ( ruleOperator EOF )
            // InternalTheory.g:180:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalTheory.g:187:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:191:2: ( ( ( rule__Operator__Group__0 ) ) )
            // InternalTheory.g:192:2: ( ( rule__Operator__Group__0 ) )
            {
            // InternalTheory.g:192:2: ( ( rule__Operator__Group__0 ) )
            // InternalTheory.g:193:3: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // InternalTheory.g:194:3: ( rule__Operator__Group__0 )
            // InternalTheory.g:194:4: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getGroup()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleArgument"
    // InternalTheory.g:203:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalTheory.g:204:1: ( ruleArgument EOF )
            // InternalTheory.g:205:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalTheory.g:212:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:216:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalTheory.g:217:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalTheory.g:217:2: ( ( rule__Argument__Group__0 ) )
            // InternalTheory.g:218:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalTheory.g:219:3: ( rule__Argument__Group__0 )
            // InternalTheory.g:219:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleCase"
    // InternalTheory.g:228:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // InternalTheory.g:229:1: ( ruleCase EOF )
            // InternalTheory.g:230:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalTheory.g:237:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:241:2: ( ( ( rule__Case__Group__0 ) ) )
            // InternalTheory.g:242:2: ( ( rule__Case__Group__0 ) )
            {
            // InternalTheory.g:242:2: ( ( rule__Case__Group__0 ) )
            // InternalTheory.g:243:3: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // InternalTheory.g:244:3: ( rule__Case__Group__0 )
            // InternalTheory.g:244:4: rule__Case__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleAxiom"
    // InternalTheory.g:253:1: entryRuleAxiom : ruleAxiom EOF ;
    public final void entryRuleAxiom() throws RecognitionException {
        try {
            // InternalTheory.g:254:1: ( ruleAxiom EOF )
            // InternalTheory.g:255:1: ruleAxiom EOF
            {
             before(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getAxiomRule()); 
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
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalTheory.g:262:1: ruleAxiom : ( ( rule__Axiom__Group__0 ) ) ;
    public final void ruleAxiom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:266:2: ( ( ( rule__Axiom__Group__0 ) ) )
            // InternalTheory.g:267:2: ( ( rule__Axiom__Group__0 ) )
            {
            // InternalTheory.g:267:2: ( ( rule__Axiom__Group__0 ) )
            // InternalTheory.g:268:3: ( rule__Axiom__Group__0 )
            {
             before(grammarAccess.getAxiomAccess().getGroup()); 
            // InternalTheory.g:269:3: ( rule__Axiom__Group__0 )
            // InternalTheory.g:269:4: rule__Axiom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getGroup()); 

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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleTheorem"
    // InternalTheory.g:278:1: entryRuleTheorem : ruleTheorem EOF ;
    public final void entryRuleTheorem() throws RecognitionException {
        try {
            // InternalTheory.g:279:1: ( ruleTheorem EOF )
            // InternalTheory.g:280:1: ruleTheorem EOF
            {
             before(grammarAccess.getTheoremRule()); 
            pushFollow(FOLLOW_1);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoremRule()); 
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
    // $ANTLR end "entryRuleTheorem"


    // $ANTLR start "ruleTheorem"
    // InternalTheory.g:287:1: ruleTheorem : ( ( rule__Theorem__Group__0 ) ) ;
    public final void ruleTheorem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:291:2: ( ( ( rule__Theorem__Group__0 ) ) )
            // InternalTheory.g:292:2: ( ( rule__Theorem__Group__0 ) )
            {
            // InternalTheory.g:292:2: ( ( rule__Theorem__Group__0 ) )
            // InternalTheory.g:293:3: ( rule__Theorem__Group__0 )
            {
             before(grammarAccess.getTheoremAccess().getGroup()); 
            // InternalTheory.g:294:3: ( rule__Theorem__Group__0 )
            // InternalTheory.g:294:4: rule__Theorem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getGroup()); 

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
    // $ANTLR end "ruleTheorem"


    // $ANTLR start "entryRuleRuleBlock"
    // InternalTheory.g:303:1: entryRuleRuleBlock : ruleRuleBlock EOF ;
    public final void entryRuleRuleBlock() throws RecognitionException {
        try {
            // InternalTheory.g:304:1: ( ruleRuleBlock EOF )
            // InternalTheory.g:305:1: ruleRuleBlock EOF
            {
             before(grammarAccess.getRuleBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getRuleBlockRule()); 
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
    // $ANTLR end "entryRuleRuleBlock"


    // $ANTLR start "ruleRuleBlock"
    // InternalTheory.g:312:1: ruleRuleBlock : ( ( rule__RuleBlock__Group__0 ) ) ;
    public final void ruleRuleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:316:2: ( ( ( rule__RuleBlock__Group__0 ) ) )
            // InternalTheory.g:317:2: ( ( rule__RuleBlock__Group__0 ) )
            {
            // InternalTheory.g:317:2: ( ( rule__RuleBlock__Group__0 ) )
            // InternalTheory.g:318:3: ( rule__RuleBlock__Group__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup()); 
            // InternalTheory.g:319:3: ( rule__RuleBlock__Group__0 )
            // InternalTheory.g:319:4: rule__RuleBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleRuleBlock"


    // $ANTLR start "entryRuleRule"
    // InternalTheory.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTheory.g:329:1: ( ruleRule EOF )
            // InternalTheory.g:330:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTheory.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTheory.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTheory.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalTheory.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTheory.g:344:3: ( rule__Rule__Group__0 )
            // InternalTheory.g:344:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTheory.g:353:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTheory.g:354:1: ( ruleVariable EOF )
            // InternalTheory.g:355:1: ruleVariable EOF
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
    // InternalTheory.g:362:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:366:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTheory.g:367:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTheory.g:367:2: ( ( rule__Variable__Group__0 ) )
            // InternalTheory.g:368:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTheory.g:369:3: ( rule__Variable__Group__0 )
            // InternalTheory.g:369:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleRewriteRule"
    // InternalTheory.g:378:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:379:1: ( ruleRewriteRule EOF )
            // InternalTheory.g:380:1: ruleRewriteRule EOF
            {
             before(grammarAccess.getRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRewriteRuleRule()); 
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
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // InternalTheory.g:387:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:391:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // InternalTheory.g:392:2: ( ( rule__RewriteRule__Group__0 ) )
            {
            // InternalTheory.g:392:2: ( ( rule__RewriteRule__Group__0 ) )
            // InternalTheory.g:393:3: ( rule__RewriteRule__Group__0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:394:3: ( rule__RewriteRule__Group__0 )
            // InternalTheory.g:394:4: rule__RewriteRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleInferenceRule"
    // InternalTheory.g:403:1: entryRuleInferenceRule : ruleInferenceRule EOF ;
    public final void entryRuleInferenceRule() throws RecognitionException {
        try {
            // InternalTheory.g:404:1: ( ruleInferenceRule EOF )
            // InternalTheory.g:405:1: ruleInferenceRule EOF
            {
             before(grammarAccess.getInferenceRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getInferenceRuleRule()); 
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
    // $ANTLR end "entryRuleInferenceRule"


    // $ANTLR start "ruleInferenceRule"
    // InternalTheory.g:412:1: ruleInferenceRule : ( ( rule__InferenceRule__Group__0 ) ) ;
    public final void ruleInferenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:416:2: ( ( ( rule__InferenceRule__Group__0 ) ) )
            // InternalTheory.g:417:2: ( ( rule__InferenceRule__Group__0 ) )
            {
            // InternalTheory.g:417:2: ( ( rule__InferenceRule__Group__0 ) )
            // InternalTheory.g:418:3: ( rule__InferenceRule__Group__0 )
            {
             before(grammarAccess.getInferenceRuleAccess().getGroup()); 
            // InternalTheory.g:419:3: ( rule__InferenceRule__Group__0 )
            // InternalTheory.g:419:4: rule__InferenceRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInferenceRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleInferenceRule"


    // $ANTLR start "entryRuleGiven"
    // InternalTheory.g:428:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalTheory.g:429:1: ( ruleGiven EOF )
            // InternalTheory.g:430:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalTheory.g:437:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:441:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalTheory.g:442:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalTheory.g:442:2: ( ( rule__Given__Group__0 ) )
            // InternalTheory.g:443:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalTheory.g:444:3: ( rule__Given__Group__0 )
            // InternalTheory.g:444:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleInfer"
    // InternalTheory.g:453:1: entryRuleInfer : ruleInfer EOF ;
    public final void entryRuleInfer() throws RecognitionException {
        try {
            // InternalTheory.g:454:1: ( ruleInfer EOF )
            // InternalTheory.g:455:1: ruleInfer EOF
            {
             before(grammarAccess.getInferRule()); 
            pushFollow(FOLLOW_1);
            ruleInfer();

            state._fsp--;

             after(grammarAccess.getInferRule()); 
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
    // $ANTLR end "entryRuleInfer"


    // $ANTLR start "ruleInfer"
    // InternalTheory.g:462:1: ruleInfer : ( ( rule__Infer__ExpressionAssignment ) ) ;
    public final void ruleInfer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:466:2: ( ( ( rule__Infer__ExpressionAssignment ) ) )
            // InternalTheory.g:467:2: ( ( rule__Infer__ExpressionAssignment ) )
            {
            // InternalTheory.g:467:2: ( ( rule__Infer__ExpressionAssignment ) )
            // InternalTheory.g:468:3: ( rule__Infer__ExpressionAssignment )
            {
             before(grammarAccess.getInferAccess().getExpressionAssignment()); 
            // InternalTheory.g:469:3: ( rule__Infer__ExpressionAssignment )
            // InternalTheory.g:469:4: rule__Infer__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Infer__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInferAccess().getExpressionAssignment()); 

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
    // $ANTLR end "ruleInfer"


    // $ANTLR start "entryRuleUnconditionalRewrite"
    // InternalTheory.g:478:1: entryRuleUnconditionalRewrite : ruleUnconditionalRewrite EOF ;
    public final void entryRuleUnconditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:479:1: ( ruleUnconditionalRewrite EOF )
            // InternalTheory.g:480:1: ruleUnconditionalRewrite EOF
            {
             before(grammarAccess.getUnconditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            ruleUnconditionalRewrite();

            state._fsp--;

             after(grammarAccess.getUnconditionalRewriteRule()); 
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
    // $ANTLR end "entryRuleUnconditionalRewrite"


    // $ANTLR start "ruleUnconditionalRewrite"
    // InternalTheory.g:487:1: ruleUnconditionalRewrite : ( ( rule__UnconditionalRewrite__RhsAssignment ) ) ;
    public final void ruleUnconditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:491:2: ( ( ( rule__UnconditionalRewrite__RhsAssignment ) ) )
            // InternalTheory.g:492:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            {
            // InternalTheory.g:492:2: ( ( rule__UnconditionalRewrite__RhsAssignment ) )
            // InternalTheory.g:493:3: ( rule__UnconditionalRewrite__RhsAssignment )
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 
            // InternalTheory.g:494:3: ( rule__UnconditionalRewrite__RhsAssignment )
            // InternalTheory.g:494:4: rule__UnconditionalRewrite__RhsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRewrite__RhsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment()); 

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
    // $ANTLR end "ruleUnconditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewrite"
    // InternalTheory.g:503:1: entryRuleConditionalRewrite : ruleConditionalRewrite EOF ;
    public final void entryRuleConditionalRewrite() throws RecognitionException {
        try {
            // InternalTheory.g:504:1: ( ruleConditionalRewrite EOF )
            // InternalTheory.g:505:1: ruleConditionalRewrite EOF
            {
             before(grammarAccess.getConditionalRewriteRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalRewrite();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteRule()); 
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
    // $ANTLR end "entryRuleConditionalRewrite"


    // $ANTLR start "ruleConditionalRewrite"
    // InternalTheory.g:512:1: ruleConditionalRewrite : ( ( rule__ConditionalRewrite__Group__0 ) ) ;
    public final void ruleConditionalRewrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:516:2: ( ( ( rule__ConditionalRewrite__Group__0 ) ) )
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            {
            // InternalTheory.g:517:2: ( ( rule__ConditionalRewrite__Group__0 ) )
            // InternalTheory.g:518:3: ( rule__ConditionalRewrite__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getGroup()); 
            // InternalTheory.g:519:3: ( rule__ConditionalRewrite__Group__0 )
            // InternalTheory.g:519:4: rule__ConditionalRewrite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalRewrite"


    // $ANTLR start "entryRuleConditionalRewriteRule"
    // InternalTheory.g:528:1: entryRuleConditionalRewriteRule : ruleConditionalRewriteRule EOF ;
    public final void entryRuleConditionalRewriteRule() throws RecognitionException {
        try {
            // InternalTheory.g:529:1: ( ruleConditionalRewriteRule EOF )
            // InternalTheory.g:530:1: ruleConditionalRewriteRule EOF
            {
             before(grammarAccess.getConditionalRewriteRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteRuleRule()); 
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
    // $ANTLR end "entryRuleConditionalRewriteRule"


    // $ANTLR start "ruleConditionalRewriteRule"
    // InternalTheory.g:537:1: ruleConditionalRewriteRule : ( ( rule__ConditionalRewriteRule__Group__0 ) ) ;
    public final void ruleConditionalRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:541:2: ( ( ( rule__ConditionalRewriteRule__Group__0 ) ) )
            // InternalTheory.g:542:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            {
            // InternalTheory.g:542:2: ( ( rule__ConditionalRewriteRule__Group__0 ) )
            // InternalTheory.g:543:3: ( rule__ConditionalRewriteRule__Group__0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 
            // InternalTheory.g:544:3: ( rule__ConditionalRewriteRule__Group__0 )
            // InternalTheory.g:544:4: rule__ConditionalRewriteRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalRewriteRule"


    // $ANTLR start "ruleNotation"
    // InternalTheory.g:553:1: ruleNotation : ( ( rule__Notation__Alternatives ) ) ;
    public final void ruleNotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:557:1: ( ( ( rule__Notation__Alternatives ) ) )
            // InternalTheory.g:558:2: ( ( rule__Notation__Alternatives ) )
            {
            // InternalTheory.g:558:2: ( ( rule__Notation__Alternatives ) )
            // InternalTheory.g:559:3: ( rule__Notation__Alternatives )
            {
             before(grammarAccess.getNotationAccess().getAlternatives()); 
            // InternalTheory.g:560:3: ( rule__Notation__Alternatives )
            // InternalTheory.g:560:4: rule__Notation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Notation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNotation"


    // $ANTLR start "rule__Theory__Alternatives_4"
    // InternalTheory.g:568:1: rule__Theory__Alternatives_4 : ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) );
    public final void rule__Theory__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:572:1: ( ( ( rule__Theory__Group_4_0__0 ) ) | ( ( rule__Theory__Group_4_1__0 ) ) | ( ( rule__Theory__Group_4_2__0 ) ) | ( ( rule__Theory__Group_4_3__0 ) ) | ( ( rule__Theory__Group_4_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTheory.g:573:2: ( ( rule__Theory__Group_4_0__0 ) )
                    {
                    // InternalTheory.g:573:2: ( ( rule__Theory__Group_4_0__0 ) )
                    // InternalTheory.g:574:3: ( rule__Theory__Group_4_0__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_0()); 
                    // InternalTheory.g:575:3: ( rule__Theory__Group_4_0__0 )
                    // InternalTheory.g:575:4: rule__Theory__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:579:2: ( ( rule__Theory__Group_4_1__0 ) )
                    {
                    // InternalTheory.g:579:2: ( ( rule__Theory__Group_4_1__0 ) )
                    // InternalTheory.g:580:3: ( rule__Theory__Group_4_1__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_1()); 
                    // InternalTheory.g:581:3: ( rule__Theory__Group_4_1__0 )
                    // InternalTheory.g:581:4: rule__Theory__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:585:2: ( ( rule__Theory__Group_4_2__0 ) )
                    {
                    // InternalTheory.g:585:2: ( ( rule__Theory__Group_4_2__0 ) )
                    // InternalTheory.g:586:3: ( rule__Theory__Group_4_2__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_2()); 
                    // InternalTheory.g:587:3: ( rule__Theory__Group_4_2__0 )
                    // InternalTheory.g:587:4: rule__Theory__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTheory.g:591:2: ( ( rule__Theory__Group_4_3__0 ) )
                    {
                    // InternalTheory.g:591:2: ( ( rule__Theory__Group_4_3__0 ) )
                    // InternalTheory.g:592:3: ( rule__Theory__Group_4_3__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_3()); 
                    // InternalTheory.g:593:3: ( rule__Theory__Group_4_3__0 )
                    // InternalTheory.g:593:4: rule__Theory__Group_4_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTheory.g:597:2: ( ( rule__Theory__Group_4_4__0 ) )
                    {
                    // InternalTheory.g:597:2: ( ( rule__Theory__Group_4_4__0 ) )
                    // InternalTheory.g:598:3: ( rule__Theory__Group_4_4__0 )
                    {
                     before(grammarAccess.getTheoryAccess().getGroup_4_4()); 
                    // InternalTheory.g:599:3: ( rule__Theory__Group_4_4__0 )
                    // InternalTheory.g:599:4: rule__Theory__Group_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_4_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTheoryAccess().getGroup_4_4()); 

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
    // $ANTLR end "rule__Theory__Alternatives_4"


    // $ANTLR start "rule__Operator__Alternatives_5_1"
    // InternalTheory.g:607:1: rule__Operator__Alternatives_5_1 : ( ( ( rule__Operator__DefinitionAssignment_5_1_0 ) ) | ( ( rule__Operator__Group_5_1_1__0 ) ) );
    public final void rule__Operator__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:611:1: ( ( ( rule__Operator__DefinitionAssignment_5_1_0 ) ) | ( ( rule__Operator__Group_5_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTheory.g:612:2: ( ( rule__Operator__DefinitionAssignment_5_1_0 ) )
                    {
                    // InternalTheory.g:612:2: ( ( rule__Operator__DefinitionAssignment_5_1_0 ) )
                    // InternalTheory.g:613:3: ( rule__Operator__DefinitionAssignment_5_1_0 )
                    {
                     before(grammarAccess.getOperatorAccess().getDefinitionAssignment_5_1_0()); 
                    // InternalTheory.g:614:3: ( rule__Operator__DefinitionAssignment_5_1_0 )
                    // InternalTheory.g:614:4: rule__Operator__DefinitionAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__DefinitionAssignment_5_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getDefinitionAssignment_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:618:2: ( ( rule__Operator__Group_5_1_1__0 ) )
                    {
                    // InternalTheory.g:618:2: ( ( rule__Operator__Group_5_1_1__0 ) )
                    // InternalTheory.g:619:3: ( rule__Operator__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_5_1_1()); 
                    // InternalTheory.g:620:3: ( rule__Operator__Group_5_1_1__0 )
                    // InternalTheory.g:620:4: rule__Operator__Group_5_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_5_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_5_1_1()); 

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
    // $ANTLR end "rule__Operator__Alternatives_5_1"


    // $ANTLR start "rule__Rule__Alternatives_3"
    // InternalTheory.g:628:1: rule__Rule__Alternatives_3 : ( ( ( rule__Rule__RruleAssignment_3_0 ) ) | ( ( rule__Rule__IruleAssignment_3_1 ) ) );
    public final void rule__Rule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:632:1: ( ( ( rule__Rule__RruleAssignment_3_0 ) ) | ( ( rule__Rule__IruleAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==35) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_STRING||LA3_1==36||LA3_1==39) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTheory.g:633:2: ( ( rule__Rule__RruleAssignment_3_0 ) )
                    {
                    // InternalTheory.g:633:2: ( ( rule__Rule__RruleAssignment_3_0 ) )
                    // InternalTheory.g:634:3: ( rule__Rule__RruleAssignment_3_0 )
                    {
                     before(grammarAccess.getRuleAccess().getRruleAssignment_3_0()); 
                    // InternalTheory.g:635:3: ( rule__Rule__RruleAssignment_3_0 )
                    // InternalTheory.g:635:4: rule__Rule__RruleAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__RruleAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getRruleAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:639:2: ( ( rule__Rule__IruleAssignment_3_1 ) )
                    {
                    // InternalTheory.g:639:2: ( ( rule__Rule__IruleAssignment_3_1 ) )
                    // InternalTheory.g:640:3: ( rule__Rule__IruleAssignment_3_1 )
                    {
                     before(grammarAccess.getRuleAccess().getIruleAssignment_3_1()); 
                    // InternalTheory.g:641:3: ( rule__Rule__IruleAssignment_3_1 )
                    // InternalTheory.g:641:4: rule__Rule__IruleAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__IruleAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getIruleAssignment_3_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives_3"


    // $ANTLR start "rule__RewriteRule__Alternatives_2"
    // InternalTheory.g:649:1: rule__RewriteRule__Alternatives_2 : ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) );
    public final void rule__RewriteRule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:653:1: ( ( ( rule__RewriteRule__UruleAssignment_2_0 ) ) | ( ( rule__RewriteRule__CruleAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==15||(LA4_1>=19 && LA4_1<=23)||LA4_1==34) ) {
                    alt4=1;
                }
                else if ( (LA4_1==31) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTheory.g:654:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    {
                    // InternalTheory.g:654:2: ( ( rule__RewriteRule__UruleAssignment_2_0 ) )
                    // InternalTheory.g:655:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0()); 
                    // InternalTheory.g:656:3: ( rule__RewriteRule__UruleAssignment_2_0 )
                    // InternalTheory.g:656:4: rule__RewriteRule__UruleAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__UruleAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:660:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    {
                    // InternalTheory.g:660:2: ( ( rule__RewriteRule__CruleAssignment_2_1 ) )
                    // InternalTheory.g:661:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    {
                     before(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1()); 
                    // InternalTheory.g:662:3: ( rule__RewriteRule__CruleAssignment_2_1 )
                    // InternalTheory.g:662:4: rule__RewriteRule__CruleAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RewriteRule__CruleAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1()); 

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
    // $ANTLR end "rule__RewriteRule__Alternatives_2"


    // $ANTLR start "rule__Notation__Alternatives"
    // InternalTheory.g:670:1: rule__Notation__Alternatives : ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) );
    public final void rule__Notation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:674:1: ( ( ( 'prefix' ) ) | ( ( 'infix' ) ) | ( ( 'postfix' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTheory.g:675:2: ( ( 'prefix' ) )
                    {
                    // InternalTheory.g:675:2: ( ( 'prefix' ) )
                    // InternalTheory.g:676:3: ( 'prefix' )
                    {
                     before(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 
                    // InternalTheory.g:677:3: ( 'prefix' )
                    // InternalTheory.g:677:4: 'prefix'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPREFIXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:681:2: ( ( 'infix' ) )
                    {
                    // InternalTheory.g:681:2: ( ( 'infix' ) )
                    // InternalTheory.g:682:3: ( 'infix' )
                    {
                     before(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 
                    // InternalTheory.g:683:3: ( 'infix' )
                    // InternalTheory.g:683:4: 'infix'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getINFIXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:687:2: ( ( 'postfix' ) )
                    {
                    // InternalTheory.g:687:2: ( ( 'postfix' ) )
                    // InternalTheory.g:688:3: ( 'postfix' )
                    {
                     before(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 
                    // InternalTheory.g:689:3: ( 'postfix' )
                    // InternalTheory.g:689:4: 'postfix'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotationAccess().getPOSTFIXEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Notation__Alternatives"


    // $ANTLR start "rule__Theory__Group__0"
    // InternalTheory.g:697:1: rule__Theory__Group__0 : rule__Theory__Group__0__Impl rule__Theory__Group__1 ;
    public final void rule__Theory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:701:1: ( rule__Theory__Group__0__Impl rule__Theory__Group__1 )
            // InternalTheory.g:702:2: rule__Theory__Group__0__Impl rule__Theory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__1();

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
    // $ANTLR end "rule__Theory__Group__0"


    // $ANTLR start "rule__Theory__Group__0__Impl"
    // InternalTheory.g:709:1: rule__Theory__Group__0__Impl : ( 'theory' ) ;
    public final void rule__Theory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:713:1: ( ( 'theory' ) )
            // InternalTheory.g:714:1: ( 'theory' )
            {
            // InternalTheory.g:714:1: ( 'theory' )
            // InternalTheory.g:715:2: 'theory'
            {
             before(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 

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
    // $ANTLR end "rule__Theory__Group__0__Impl"


    // $ANTLR start "rule__Theory__Group__1"
    // InternalTheory.g:724:1: rule__Theory__Group__1 : rule__Theory__Group__1__Impl rule__Theory__Group__2 ;
    public final void rule__Theory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:728:1: ( rule__Theory__Group__1__Impl rule__Theory__Group__2 )
            // InternalTheory.g:729:2: rule__Theory__Group__1__Impl rule__Theory__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__2();

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
    // $ANTLR end "rule__Theory__Group__1"


    // $ANTLR start "rule__Theory__Group__1__Impl"
    // InternalTheory.g:736:1: rule__Theory__Group__1__Impl : ( ( rule__Theory__NameAssignment_1 ) ) ;
    public final void rule__Theory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:740:1: ( ( ( rule__Theory__NameAssignment_1 ) ) )
            // InternalTheory.g:741:1: ( ( rule__Theory__NameAssignment_1 ) )
            {
            // InternalTheory.g:741:1: ( ( rule__Theory__NameAssignment_1 ) )
            // InternalTheory.g:742:2: ( rule__Theory__NameAssignment_1 )
            {
             before(grammarAccess.getTheoryAccess().getNameAssignment_1()); 
            // InternalTheory.g:743:2: ( rule__Theory__NameAssignment_1 )
            // InternalTheory.g:743:3: rule__Theory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Theory__Group__1__Impl"


    // $ANTLR start "rule__Theory__Group__2"
    // InternalTheory.g:751:1: rule__Theory__Group__2 : rule__Theory__Group__2__Impl rule__Theory__Group__3 ;
    public final void rule__Theory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:755:1: ( rule__Theory__Group__2__Impl rule__Theory__Group__3 )
            // InternalTheory.g:756:2: rule__Theory__Group__2__Impl rule__Theory__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__3();

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
    // $ANTLR end "rule__Theory__Group__2"


    // $ANTLR start "rule__Theory__Group__2__Impl"
    // InternalTheory.g:763:1: rule__Theory__Group__2__Impl : ( ( rule__Theory__Group_2__0 )? ) ;
    public final void rule__Theory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:767:1: ( ( ( rule__Theory__Group_2__0 )? ) )
            // InternalTheory.g:768:1: ( ( rule__Theory__Group_2__0 )? )
            {
            // InternalTheory.g:768:1: ( ( rule__Theory__Group_2__0 )? )
            // InternalTheory.g:769:2: ( rule__Theory__Group_2__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_2()); 
            // InternalTheory.g:770:2: ( rule__Theory__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTheory.g:770:3: rule__Theory__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Theory__Group__2__Impl"


    // $ANTLR start "rule__Theory__Group__3"
    // InternalTheory.g:778:1: rule__Theory__Group__3 : rule__Theory__Group__3__Impl rule__Theory__Group__4 ;
    public final void rule__Theory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:782:1: ( rule__Theory__Group__3__Impl rule__Theory__Group__4 )
            // InternalTheory.g:783:2: rule__Theory__Group__3__Impl rule__Theory__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__4();

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
    // $ANTLR end "rule__Theory__Group__3"


    // $ANTLR start "rule__Theory__Group__3__Impl"
    // InternalTheory.g:790:1: rule__Theory__Group__3__Impl : ( ( rule__Theory__Group_3__0 )? ) ;
    public final void rule__Theory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:794:1: ( ( ( rule__Theory__Group_3__0 )? ) )
            // InternalTheory.g:795:1: ( ( rule__Theory__Group_3__0 )? )
            {
            // InternalTheory.g:795:1: ( ( rule__Theory__Group_3__0 )? )
            // InternalTheory.g:796:2: ( rule__Theory__Group_3__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_3()); 
            // InternalTheory.g:797:2: ( rule__Theory__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTheory.g:797:3: rule__Theory__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Theory__Group__3__Impl"


    // $ANTLR start "rule__Theory__Group__4"
    // InternalTheory.g:805:1: rule__Theory__Group__4 : rule__Theory__Group__4__Impl rule__Theory__Group__5 ;
    public final void rule__Theory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:809:1: ( rule__Theory__Group__4__Impl rule__Theory__Group__5 )
            // InternalTheory.g:810:2: rule__Theory__Group__4__Impl rule__Theory__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__5();

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
    // $ANTLR end "rule__Theory__Group__4"


    // $ANTLR start "rule__Theory__Group__4__Impl"
    // InternalTheory.g:817:1: rule__Theory__Group__4__Impl : ( ( rule__Theory__Alternatives_4 )* ) ;
    public final void rule__Theory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:821:1: ( ( ( rule__Theory__Alternatives_4 )* ) )
            // InternalTheory.g:822:1: ( ( rule__Theory__Alternatives_4 )* )
            {
            // InternalTheory.g:822:1: ( ( rule__Theory__Alternatives_4 )* )
            // InternalTheory.g:823:2: ( rule__Theory__Alternatives_4 )*
            {
             before(grammarAccess.getTheoryAccess().getAlternatives_4()); 
            // InternalTheory.g:824:2: ( rule__Theory__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTheory.g:824:3: rule__Theory__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Theory__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Theory__Group__4__Impl"


    // $ANTLR start "rule__Theory__Group__5"
    // InternalTheory.g:832:1: rule__Theory__Group__5 : rule__Theory__Group__5__Impl ;
    public final void rule__Theory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:836:1: ( rule__Theory__Group__5__Impl )
            // InternalTheory.g:837:2: rule__Theory__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__5__Impl();

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
    // $ANTLR end "rule__Theory__Group__5"


    // $ANTLR start "rule__Theory__Group__5__Impl"
    // InternalTheory.g:843:1: rule__Theory__Group__5__Impl : ( 'end' ) ;
    public final void rule__Theory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:847:1: ( ( 'end' ) )
            // InternalTheory.g:848:1: ( 'end' )
            {
            // InternalTheory.g:848:1: ( 'end' )
            // InternalTheory.g:849:2: 'end'
            {
             before(grammarAccess.getTheoryAccess().getEndKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__Theory__Group__5__Impl"


    // $ANTLR start "rule__Theory__Group_2__0"
    // InternalTheory.g:859:1: rule__Theory__Group_2__0 : rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 ;
    public final void rule__Theory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:863:1: ( rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1 )
            // InternalTheory.g:864:2: rule__Theory__Group_2__0__Impl rule__Theory__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__1();

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
    // $ANTLR end "rule__Theory__Group_2__0"


    // $ANTLR start "rule__Theory__Group_2__0__Impl"
    // InternalTheory.g:871:1: rule__Theory__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Theory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:875:1: ( ( '(' ) )
            // InternalTheory.g:876:1: ( '(' )
            {
            // InternalTheory.g:876:1: ( '(' )
            // InternalTheory.g:877:2: '('
            {
             before(grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Theory__Group_2__0__Impl"


    // $ANTLR start "rule__Theory__Group_2__1"
    // InternalTheory.g:886:1: rule__Theory__Group_2__1 : rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 ;
    public final void rule__Theory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:890:1: ( rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2 )
            // InternalTheory.g:891:2: rule__Theory__Group_2__1__Impl rule__Theory__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Theory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__2();

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
    // $ANTLR end "rule__Theory__Group_2__1"


    // $ANTLR start "rule__Theory__Group_2__1__Impl"
    // InternalTheory.g:898:1: rule__Theory__Group_2__1__Impl : ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) ;
    public final void rule__Theory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:902:1: ( ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) ) )
            // InternalTheory.g:903:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            {
            // InternalTheory.g:903:1: ( ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* ) )
            // InternalTheory.g:904:2: ( ( rule__Theory__ParametersAssignment_2_1 ) ) ( ( rule__Theory__ParametersAssignment_2_1 )* )
            {
            // InternalTheory.g:904:2: ( ( rule__Theory__ParametersAssignment_2_1 ) )
            // InternalTheory.g:905:3: ( rule__Theory__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:906:3: ( rule__Theory__ParametersAssignment_2_1 )
            // InternalTheory.g:906:4: rule__Theory__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_7);
            rule__Theory__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }

            // InternalTheory.g:909:2: ( ( rule__Theory__ParametersAssignment_2_1 )* )
            // InternalTheory.g:910:3: ( rule__Theory__ParametersAssignment_2_1 )*
            {
             before(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 
            // InternalTheory.g:911:3: ( rule__Theory__ParametersAssignment_2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTheory.g:911:4: rule__Theory__ParametersAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ParametersAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getParametersAssignment_2_1()); 

            }


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
    // $ANTLR end "rule__Theory__Group_2__1__Impl"


    // $ANTLR start "rule__Theory__Group_2__2"
    // InternalTheory.g:920:1: rule__Theory__Group_2__2 : rule__Theory__Group_2__2__Impl ;
    public final void rule__Theory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:924:1: ( rule__Theory__Group_2__2__Impl )
            // InternalTheory.g:925:2: rule__Theory__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_2__2__Impl();

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
    // $ANTLR end "rule__Theory__Group_2__2"


    // $ANTLR start "rule__Theory__Group_2__2__Impl"
    // InternalTheory.g:931:1: rule__Theory__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Theory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:935:1: ( ( ')' ) )
            // InternalTheory.g:936:1: ( ')' )
            {
            // InternalTheory.g:936:1: ( ')' )
            // InternalTheory.g:937:2: ')'
            {
             before(grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Theory__Group_2__2__Impl"


    // $ANTLR start "rule__Theory__Group_3__0"
    // InternalTheory.g:947:1: rule__Theory__Group_3__0 : rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 ;
    public final void rule__Theory__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:951:1: ( rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1 )
            // InternalTheory.g:952:2: rule__Theory__Group_3__0__Impl rule__Theory__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__1();

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
    // $ANTLR end "rule__Theory__Group_3__0"


    // $ANTLR start "rule__Theory__Group_3__0__Impl"
    // InternalTheory.g:959:1: rule__Theory__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__Theory__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:963:1: ( ( 'import' ) )
            // InternalTheory.g:964:1: ( 'import' )
            {
            // InternalTheory.g:964:1: ( 'import' )
            // InternalTheory.g:965:2: 'import'
            {
             before(grammarAccess.getTheoryAccess().getImportKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportKeyword_3_0()); 

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
    // $ANTLR end "rule__Theory__Group_3__0__Impl"


    // $ANTLR start "rule__Theory__Group_3__1"
    // InternalTheory.g:974:1: rule__Theory__Group_3__1 : rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 ;
    public final void rule__Theory__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:978:1: ( rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2 )
            // InternalTheory.g:979:2: rule__Theory__Group_3__1__Impl rule__Theory__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__2();

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
    // $ANTLR end "rule__Theory__Group_3__1"


    // $ANTLR start "rule__Theory__Group_3__1__Impl"
    // InternalTheory.g:986:1: rule__Theory__Group_3__1__Impl : ( ( rule__Theory__ImportsAssignment_3_1 ) ) ;
    public final void rule__Theory__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:990:1: ( ( ( rule__Theory__ImportsAssignment_3_1 ) ) )
            // InternalTheory.g:991:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            {
            // InternalTheory.g:991:1: ( ( rule__Theory__ImportsAssignment_3_1 ) )
            // InternalTheory.g:992:2: ( rule__Theory__ImportsAssignment_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 
            // InternalTheory.g:993:2: ( rule__Theory__ImportsAssignment_3_1 )
            // InternalTheory.g:993:3: rule__Theory__ImportsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__ImportsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getImportsAssignment_3_1()); 

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
    // $ANTLR end "rule__Theory__Group_3__1__Impl"


    // $ANTLR start "rule__Theory__Group_3__2"
    // InternalTheory.g:1001:1: rule__Theory__Group_3__2 : rule__Theory__Group_3__2__Impl ;
    public final void rule__Theory__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1005:1: ( rule__Theory__Group_3__2__Impl )
            // InternalTheory.g:1006:2: rule__Theory__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_3__2__Impl();

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
    // $ANTLR end "rule__Theory__Group_3__2"


    // $ANTLR start "rule__Theory__Group_3__2__Impl"
    // InternalTheory.g:1012:1: rule__Theory__Group_3__2__Impl : ( ( rule__Theory__ImportsAssignment_3_2 )* ) ;
    public final void rule__Theory__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1016:1: ( ( ( rule__Theory__ImportsAssignment_3_2 )* ) )
            // InternalTheory.g:1017:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            {
            // InternalTheory.g:1017:1: ( ( rule__Theory__ImportsAssignment_3_2 )* )
            // InternalTheory.g:1018:2: ( rule__Theory__ImportsAssignment_3_2 )*
            {
             before(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 
            // InternalTheory.g:1019:2: ( rule__Theory__ImportsAssignment_3_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTheory.g:1019:3: rule__Theory__ImportsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Theory__ImportsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getImportsAssignment_3_2()); 

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
    // $ANTLR end "rule__Theory__Group_3__2__Impl"


    // $ANTLR start "rule__Theory__Group_4_0__0"
    // InternalTheory.g:1028:1: rule__Theory__Group_4_0__0 : rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 ;
    public final void rule__Theory__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1032:1: ( rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1 )
            // InternalTheory.g:1033:2: rule__Theory__Group_4_0__0__Impl rule__Theory__Group_4_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_0__1();

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
    // $ANTLR end "rule__Theory__Group_4_0__0"


    // $ANTLR start "rule__Theory__Group_4_0__0__Impl"
    // InternalTheory.g:1040:1: rule__Theory__Group_4_0__0__Impl : ( 'type' ) ;
    public final void rule__Theory__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1044:1: ( ( 'type' ) )
            // InternalTheory.g:1045:1: ( 'type' )
            {
            // InternalTheory.g:1045:1: ( 'type' )
            // InternalTheory.g:1046:2: 'type'
            {
             before(grammarAccess.getTheoryAccess().getTypeKeyword_4_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTypeKeyword_4_0_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_0__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_0__1"
    // InternalTheory.g:1055:1: rule__Theory__Group_4_0__1 : rule__Theory__Group_4_0__1__Impl ;
    public final void rule__Theory__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1059:1: ( rule__Theory__Group_4_0__1__Impl )
            // InternalTheory.g:1060:2: rule__Theory__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_0__1"


    // $ANTLR start "rule__Theory__Group_4_0__1__Impl"
    // InternalTheory.g:1066:1: rule__Theory__Group_4_0__1__Impl : ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) ;
    public final void rule__Theory__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1070:1: ( ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) ) )
            // InternalTheory.g:1071:1: ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) )
            {
            // InternalTheory.g:1071:1: ( ( rule__Theory__InternalElementsAssignment_4_0_1 ) )
            // InternalTheory.g:1072:2: ( rule__Theory__InternalElementsAssignment_4_0_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 
            // InternalTheory.g:1073:2: ( rule__Theory__InternalElementsAssignment_4_0_1 )
            // InternalTheory.g:1073:3: rule__Theory__InternalElementsAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__InternalElementsAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_0_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_0__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_1__0"
    // InternalTheory.g:1082:1: rule__Theory__Group_4_1__0 : rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 ;
    public final void rule__Theory__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1086:1: ( rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1 )
            // InternalTheory.g:1087:2: rule__Theory__Group_4_1__0__Impl rule__Theory__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Theory__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_1__1();

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
    // $ANTLR end "rule__Theory__Group_4_1__0"


    // $ANTLR start "rule__Theory__Group_4_1__0__Impl"
    // InternalTheory.g:1094:1: rule__Theory__Group_4_1__0__Impl : ( 'op' ) ;
    public final void rule__Theory__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1098:1: ( ( 'op' ) )
            // InternalTheory.g:1099:1: ( 'op' )
            {
            // InternalTheory.g:1099:1: ( 'op' )
            // InternalTheory.g:1100:2: 'op'
            {
             before(grammarAccess.getTheoryAccess().getOpKeyword_4_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getOpKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_1__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_1__1"
    // InternalTheory.g:1109:1: rule__Theory__Group_4_1__1 : rule__Theory__Group_4_1__1__Impl ;
    public final void rule__Theory__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1113:1: ( rule__Theory__Group_4_1__1__Impl )
            // InternalTheory.g:1114:2: rule__Theory__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_1__1"


    // $ANTLR start "rule__Theory__Group_4_1__1__Impl"
    // InternalTheory.g:1120:1: rule__Theory__Group_4_1__1__Impl : ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) ;
    public final void rule__Theory__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1124:1: ( ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) ) )
            // InternalTheory.g:1125:1: ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) )
            {
            // InternalTheory.g:1125:1: ( ( rule__Theory__InternalElementsAssignment_4_1_1 ) )
            // InternalTheory.g:1126:2: ( rule__Theory__InternalElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 
            // InternalTheory.g:1127:2: ( rule__Theory__InternalElementsAssignment_4_1_1 )
            // InternalTheory.g:1127:3: rule__Theory__InternalElementsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__InternalElementsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_1__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_2__0"
    // InternalTheory.g:1136:1: rule__Theory__Group_4_2__0 : rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 ;
    public final void rule__Theory__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1140:1: ( rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1 )
            // InternalTheory.g:1141:2: rule__Theory__Group_4_2__0__Impl rule__Theory__Group_4_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_2__1();

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
    // $ANTLR end "rule__Theory__Group_4_2__0"


    // $ANTLR start "rule__Theory__Group_4_2__0__Impl"
    // InternalTheory.g:1148:1: rule__Theory__Group_4_2__0__Impl : ( 'axm' ) ;
    public final void rule__Theory__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1152:1: ( ( 'axm' ) )
            // InternalTheory.g:1153:1: ( 'axm' )
            {
            // InternalTheory.g:1153:1: ( 'axm' )
            // InternalTheory.g:1154:2: 'axm'
            {
             before(grammarAccess.getTheoryAccess().getAxmKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getAxmKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_2__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_2__1"
    // InternalTheory.g:1163:1: rule__Theory__Group_4_2__1 : rule__Theory__Group_4_2__1__Impl ;
    public final void rule__Theory__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1167:1: ( rule__Theory__Group_4_2__1__Impl )
            // InternalTheory.g:1168:2: rule__Theory__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_2__1"


    // $ANTLR start "rule__Theory__Group_4_2__1__Impl"
    // InternalTheory.g:1174:1: rule__Theory__Group_4_2__1__Impl : ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) ;
    public final void rule__Theory__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1178:1: ( ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) ) )
            // InternalTheory.g:1179:1: ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) )
            {
            // InternalTheory.g:1179:1: ( ( rule__Theory__InternalElementsAssignment_4_2_1 ) )
            // InternalTheory.g:1180:2: ( rule__Theory__InternalElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 
            // InternalTheory.g:1181:2: ( rule__Theory__InternalElementsAssignment_4_2_1 )
            // InternalTheory.g:1181:3: rule__Theory__InternalElementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__InternalElementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_2__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_3__0"
    // InternalTheory.g:1190:1: rule__Theory__Group_4_3__0 : rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 ;
    public final void rule__Theory__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1194:1: ( rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1 )
            // InternalTheory.g:1195:2: rule__Theory__Group_4_3__0__Impl rule__Theory__Group_4_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__1();

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
    // $ANTLR end "rule__Theory__Group_4_3__0"


    // $ANTLR start "rule__Theory__Group_4_3__0__Impl"
    // InternalTheory.g:1202:1: rule__Theory__Group_4_3__0__Impl : ( 'thm' ) ;
    public final void rule__Theory__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1206:1: ( ( 'thm' ) )
            // InternalTheory.g:1207:1: ( 'thm' )
            {
            // InternalTheory.g:1207:1: ( 'thm' )
            // InternalTheory.g:1208:2: 'thm'
            {
             before(grammarAccess.getTheoryAccess().getThmKeyword_4_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getThmKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_3__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_3__1"
    // InternalTheory.g:1217:1: rule__Theory__Group_4_3__1 : rule__Theory__Group_4_3__1__Impl ;
    public final void rule__Theory__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1221:1: ( rule__Theory__Group_4_3__1__Impl )
            // InternalTheory.g:1222:2: rule__Theory__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_3__1"


    // $ANTLR start "rule__Theory__Group_4_3__1__Impl"
    // InternalTheory.g:1228:1: rule__Theory__Group_4_3__1__Impl : ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) ;
    public final void rule__Theory__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1232:1: ( ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) ) )
            // InternalTheory.g:1233:1: ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) )
            {
            // InternalTheory.g:1233:1: ( ( rule__Theory__InternalElementsAssignment_4_3_1 ) )
            // InternalTheory.g:1234:2: ( rule__Theory__InternalElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 
            // InternalTheory.g:1235:2: ( rule__Theory__InternalElementsAssignment_4_3_1 )
            // InternalTheory.g:1235:3: rule__Theory__InternalElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__InternalElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getInternalElementsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_3__1__Impl"


    // $ANTLR start "rule__Theory__Group_4_4__0"
    // InternalTheory.g:1244:1: rule__Theory__Group_4_4__0 : rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 ;
    public final void rule__Theory__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1248:1: ( rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1 )
            // InternalTheory.g:1249:2: rule__Theory__Group_4_4__0__Impl rule__Theory__Group_4_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Theory__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__1();

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
    // $ANTLR end "rule__Theory__Group_4_4__0"


    // $ANTLR start "rule__Theory__Group_4_4__0__Impl"
    // InternalTheory.g:1256:1: rule__Theory__Group_4_4__0__Impl : ( 'ruleblock' ) ;
    public final void rule__Theory__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1260:1: ( ( 'ruleblock' ) )
            // InternalTheory.g:1261:1: ( 'ruleblock' )
            {
            // InternalTheory.g:1261:1: ( 'ruleblock' )
            // InternalTheory.g:1262:2: 'ruleblock'
            {
             before(grammarAccess.getTheoryAccess().getRuleblockKeyword_4_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRuleblockKeyword_4_4_0()); 

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
    // $ANTLR end "rule__Theory__Group_4_4__0__Impl"


    // $ANTLR start "rule__Theory__Group_4_4__1"
    // InternalTheory.g:1271:1: rule__Theory__Group_4_4__1 : rule__Theory__Group_4_4__1__Impl ;
    public final void rule__Theory__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1275:1: ( rule__Theory__Group_4_4__1__Impl )
            // InternalTheory.g:1276:2: rule__Theory__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_4_4__1__Impl();

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
    // $ANTLR end "rule__Theory__Group_4_4__1"


    // $ANTLR start "rule__Theory__Group_4_4__1__Impl"
    // InternalTheory.g:1282:1: rule__Theory__Group_4_4__1__Impl : ( ( rule__Theory__RuleBlocksAssignment_4_4_1 ) ) ;
    public final void rule__Theory__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1286:1: ( ( ( rule__Theory__RuleBlocksAssignment_4_4_1 ) ) )
            // InternalTheory.g:1287:1: ( ( rule__Theory__RuleBlocksAssignment_4_4_1 ) )
            {
            // InternalTheory.g:1287:1: ( ( rule__Theory__RuleBlocksAssignment_4_4_1 ) )
            // InternalTheory.g:1288:2: ( rule__Theory__RuleBlocksAssignment_4_4_1 )
            {
             before(grammarAccess.getTheoryAccess().getRuleBlocksAssignment_4_4_1()); 
            // InternalTheory.g:1289:2: ( rule__Theory__RuleBlocksAssignment_4_4_1 )
            // InternalTheory.g:1289:3: rule__Theory__RuleBlocksAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__RuleBlocksAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getRuleBlocksAssignment_4_4_1()); 

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
    // $ANTLR end "rule__Theory__Group_4_4__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalTheory.g:1298:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1302:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalTheory.g:1303:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalTheory.g:1310:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1314:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // InternalTheory.g:1315:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // InternalTheory.g:1315:1: ( ( rule__Type__NameAssignment_0 ) )
            // InternalTheory.g:1316:2: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // InternalTheory.g:1317:2: ( rule__Type__NameAssignment_0 )
            // InternalTheory.g:1317:3: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalTheory.g:1325:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1329:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalTheory.g:1330:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalTheory.g:1337:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1341:1: ( ( ( rule__Type__Group_1__0 )? ) )
            // InternalTheory.g:1342:1: ( ( rule__Type__Group_1__0 )? )
            {
            // InternalTheory.g:1342:1: ( ( rule__Type__Group_1__0 )? )
            // InternalTheory.g:1343:2: ( rule__Type__Group_1__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // InternalTheory.g:1344:2: ( rule__Type__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTheory.g:1344:3: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalTheory.g:1352:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1356:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalTheory.g:1357:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalTheory.g:1364:1: rule__Type__Group__2__Impl : ( '=' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1368:1: ( ( '=' ) )
            // InternalTheory.g:1369:1: ( '=' )
            {
            // InternalTheory.g:1369:1: ( '=' )
            // InternalTheory.g:1370:2: '='
            {
             before(grammarAccess.getTypeAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalTheory.g:1379:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1383:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalTheory.g:1384:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

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
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalTheory.g:1391:1: rule__Type__Group__3__Impl : ( ( rule__Type__ConstructorsAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1395:1: ( ( ( rule__Type__ConstructorsAssignment_3 ) ) )
            // InternalTheory.g:1396:1: ( ( rule__Type__ConstructorsAssignment_3 ) )
            {
            // InternalTheory.g:1396:1: ( ( rule__Type__ConstructorsAssignment_3 ) )
            // InternalTheory.g:1397:2: ( rule__Type__ConstructorsAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_3()); 
            // InternalTheory.g:1398:2: ( rule__Type__ConstructorsAssignment_3 )
            // InternalTheory.g:1398:3: rule__Type__ConstructorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_3()); 

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
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // InternalTheory.g:1406:1: rule__Type__Group__4 : rule__Type__Group__4__Impl ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1410:1: ( rule__Type__Group__4__Impl )
            // InternalTheory.g:1411:2: rule__Type__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__4__Impl();

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
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalTheory.g:1417:1: rule__Type__Group__4__Impl : ( ( rule__Type__Group_4__0 )* ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1421:1: ( ( ( rule__Type__Group_4__0 )* ) )
            // InternalTheory.g:1422:1: ( ( rule__Type__Group_4__0 )* )
            {
            // InternalTheory.g:1422:1: ( ( rule__Type__Group_4__0 )* )
            // InternalTheory.g:1423:2: ( rule__Type__Group_4__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_4()); 
            // InternalTheory.g:1424:2: ( rule__Type__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTheory.g:1424:3: rule__Type__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Type__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalTheory.g:1433:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1437:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalTheory.g:1438:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

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
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalTheory.g:1445:1: rule__Type__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1449:1: ( ( '(' ) )
            // InternalTheory.g:1450:1: ( '(' )
            {
            // InternalTheory.g:1450:1: ( '(' )
            // InternalTheory.g:1451:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalTheory.g:1460:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1464:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // InternalTheory.g:1465:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Type__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2();

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
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalTheory.g:1472:1: rule__Type__Group_1__1__Impl : ( ( ( rule__Type__ParametersAssignment_1_1 ) ) ( ( rule__Type__ParametersAssignment_1_1 )* ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1476:1: ( ( ( ( rule__Type__ParametersAssignment_1_1 ) ) ( ( rule__Type__ParametersAssignment_1_1 )* ) ) )
            // InternalTheory.g:1477:1: ( ( ( rule__Type__ParametersAssignment_1_1 ) ) ( ( rule__Type__ParametersAssignment_1_1 )* ) )
            {
            // InternalTheory.g:1477:1: ( ( ( rule__Type__ParametersAssignment_1_1 ) ) ( ( rule__Type__ParametersAssignment_1_1 )* ) )
            // InternalTheory.g:1478:2: ( ( rule__Type__ParametersAssignment_1_1 ) ) ( ( rule__Type__ParametersAssignment_1_1 )* )
            {
            // InternalTheory.g:1478:2: ( ( rule__Type__ParametersAssignment_1_1 ) )
            // InternalTheory.g:1479:3: ( rule__Type__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_1_1()); 
            // InternalTheory.g:1480:3: ( rule__Type__ParametersAssignment_1_1 )
            // InternalTheory.g:1480:4: rule__Type__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_7);
            rule__Type__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getParametersAssignment_1_1()); 

            }

            // InternalTheory.g:1483:2: ( ( rule__Type__ParametersAssignment_1_1 )* )
            // InternalTheory.g:1484:3: ( rule__Type__ParametersAssignment_1_1 )*
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_1_1()); 
            // InternalTheory.g:1485:3: ( rule__Type__ParametersAssignment_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTheory.g:1485:4: rule__Type__ParametersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Type__ParametersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getParametersAssignment_1_1()); 

            }


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
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // InternalTheory.g:1494:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1498:1: ( rule__Type__Group_1__2__Impl )
            // InternalTheory.g:1499:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2__Impl();

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
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // InternalTheory.g:1505:1: rule__Type__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1509:1: ( ( ')' ) )
            // InternalTheory.g:1510:1: ( ')' )
            {
            // InternalTheory.g:1510:1: ( ')' )
            // InternalTheory.g:1511:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // InternalTheory.g:1521:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1525:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // InternalTheory.g:1526:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1();

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
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // InternalTheory.g:1533:1: rule__Type__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1537:1: ( ( '|' ) )
            // InternalTheory.g:1538:1: ( '|' )
            {
            // InternalTheory.g:1538:1: ( '|' )
            // InternalTheory.g:1539:2: '|'
            {
             before(grammarAccess.getTypeAccess().getVerticalLineKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getVerticalLineKeyword_4_0()); 

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
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // InternalTheory.g:1548:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1552:1: ( rule__Type__Group_4__1__Impl )
            // InternalTheory.g:1553:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_4__1__Impl();

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
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // InternalTheory.g:1559:1: rule__Type__Group_4__1__Impl : ( ( rule__Type__ConstructorsAssignment_4_1 ) ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1563:1: ( ( ( rule__Type__ConstructorsAssignment_4_1 ) ) )
            // InternalTheory.g:1564:1: ( ( rule__Type__ConstructorsAssignment_4_1 ) )
            {
            // InternalTheory.g:1564:1: ( ( rule__Type__ConstructorsAssignment_4_1 ) )
            // InternalTheory.g:1565:2: ( rule__Type__ConstructorsAssignment_4_1 )
            {
             before(grammarAccess.getTypeAccess().getConstructorsAssignment_4_1()); 
            // InternalTheory.g:1566:2: ( rule__Type__ConstructorsAssignment_4_1 )
            // InternalTheory.g:1566:3: rule__Type__ConstructorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ConstructorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getConstructorsAssignment_4_1()); 

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
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // InternalTheory.g:1575:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1579:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // InternalTheory.g:1580:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group__1();

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
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // InternalTheory.g:1587:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__NameAssignment_0 ) ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1591:1: ( ( ( rule__Constructor__NameAssignment_0 ) ) )
            // InternalTheory.g:1592:1: ( ( rule__Constructor__NameAssignment_0 ) )
            {
            // InternalTheory.g:1592:1: ( ( rule__Constructor__NameAssignment_0 ) )
            // InternalTheory.g:1593:2: ( rule__Constructor__NameAssignment_0 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_0()); 
            // InternalTheory.g:1594:2: ( rule__Constructor__NameAssignment_0 )
            // InternalTheory.g:1594:3: rule__Constructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // InternalTheory.g:1602:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1606:1: ( rule__Constructor__Group__1__Impl )
            // InternalTheory.g:1607:2: rule__Constructor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group__1__Impl();

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
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // InternalTheory.g:1613:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__Group_1__0 )? ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1617:1: ( ( ( rule__Constructor__Group_1__0 )? ) )
            // InternalTheory.g:1618:1: ( ( rule__Constructor__Group_1__0 )? )
            {
            // InternalTheory.g:1618:1: ( ( rule__Constructor__Group_1__0 )? )
            // InternalTheory.g:1619:2: ( rule__Constructor__Group_1__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_1()); 
            // InternalTheory.g:1620:2: ( rule__Constructor__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTheory.g:1620:3: rule__Constructor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constructor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group_1__0"
    // InternalTheory.g:1629:1: rule__Constructor__Group_1__0 : rule__Constructor__Group_1__0__Impl rule__Constructor__Group_1__1 ;
    public final void rule__Constructor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1633:1: ( rule__Constructor__Group_1__0__Impl rule__Constructor__Group_1__1 )
            // InternalTheory.g:1634:2: rule__Constructor__Group_1__0__Impl rule__Constructor__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Constructor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1__1();

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
    // $ANTLR end "rule__Constructor__Group_1__0"


    // $ANTLR start "rule__Constructor__Group_1__0__Impl"
    // InternalTheory.g:1641:1: rule__Constructor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Constructor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1645:1: ( ( '(' ) )
            // InternalTheory.g:1646:1: ( '(' )
            {
            // InternalTheory.g:1646:1: ( '(' )
            // InternalTheory.g:1647:2: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Constructor__Group_1__0__Impl"


    // $ANTLR start "rule__Constructor__Group_1__1"
    // InternalTheory.g:1656:1: rule__Constructor__Group_1__1 : rule__Constructor__Group_1__1__Impl rule__Constructor__Group_1__2 ;
    public final void rule__Constructor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1660:1: ( rule__Constructor__Group_1__1__Impl rule__Constructor__Group_1__2 )
            // InternalTheory.g:1661:2: rule__Constructor__Group_1__1__Impl rule__Constructor__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Constructor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1__2();

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
    // $ANTLR end "rule__Constructor__Group_1__1"


    // $ANTLR start "rule__Constructor__Group_1__1__Impl"
    // InternalTheory.g:1668:1: rule__Constructor__Group_1__1__Impl : ( ( rule__Constructor__DestructorsAssignment_1_1 ) ) ;
    public final void rule__Constructor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1672:1: ( ( ( rule__Constructor__DestructorsAssignment_1_1 ) ) )
            // InternalTheory.g:1673:1: ( ( rule__Constructor__DestructorsAssignment_1_1 ) )
            {
            // InternalTheory.g:1673:1: ( ( rule__Constructor__DestructorsAssignment_1_1 ) )
            // InternalTheory.g:1674:2: ( rule__Constructor__DestructorsAssignment_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_1_1()); 
            // InternalTheory.g:1675:2: ( rule__Constructor__DestructorsAssignment_1_1 )
            // InternalTheory.g:1675:3: rule__Constructor__DestructorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__DestructorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getDestructorsAssignment_1_1()); 

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
    // $ANTLR end "rule__Constructor__Group_1__1__Impl"


    // $ANTLR start "rule__Constructor__Group_1__2"
    // InternalTheory.g:1683:1: rule__Constructor__Group_1__2 : rule__Constructor__Group_1__2__Impl rule__Constructor__Group_1__3 ;
    public final void rule__Constructor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1687:1: ( rule__Constructor__Group_1__2__Impl rule__Constructor__Group_1__3 )
            // InternalTheory.g:1688:2: rule__Constructor__Group_1__2__Impl rule__Constructor__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Constructor__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1__3();

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
    // $ANTLR end "rule__Constructor__Group_1__2"


    // $ANTLR start "rule__Constructor__Group_1__2__Impl"
    // InternalTheory.g:1695:1: rule__Constructor__Group_1__2__Impl : ( ( rule__Constructor__Group_1_2__0 )* ) ;
    public final void rule__Constructor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1699:1: ( ( ( rule__Constructor__Group_1_2__0 )* ) )
            // InternalTheory.g:1700:1: ( ( rule__Constructor__Group_1_2__0 )* )
            {
            // InternalTheory.g:1700:1: ( ( rule__Constructor__Group_1_2__0 )* )
            // InternalTheory.g:1701:2: ( rule__Constructor__Group_1_2__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_1_2()); 
            // InternalTheory.g:1702:2: ( rule__Constructor__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTheory.g:1702:3: rule__Constructor__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Constructor__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Constructor__Group_1__2__Impl"


    // $ANTLR start "rule__Constructor__Group_1__3"
    // InternalTheory.g:1710:1: rule__Constructor__Group_1__3 : rule__Constructor__Group_1__3__Impl ;
    public final void rule__Constructor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1714:1: ( rule__Constructor__Group_1__3__Impl )
            // InternalTheory.g:1715:2: rule__Constructor__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1__3__Impl();

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
    // $ANTLR end "rule__Constructor__Group_1__3"


    // $ANTLR start "rule__Constructor__Group_1__3__Impl"
    // InternalTheory.g:1721:1: rule__Constructor__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Constructor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1725:1: ( ( ')' ) )
            // InternalTheory.g:1726:1: ( ')' )
            {
            // InternalTheory.g:1726:1: ( ')' )
            // InternalTheory.g:1727:2: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Constructor__Group_1__3__Impl"


    // $ANTLR start "rule__Constructor__Group_1_2__0"
    // InternalTheory.g:1737:1: rule__Constructor__Group_1_2__0 : rule__Constructor__Group_1_2__0__Impl rule__Constructor__Group_1_2__1 ;
    public final void rule__Constructor__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1741:1: ( rule__Constructor__Group_1_2__0__Impl rule__Constructor__Group_1_2__1 )
            // InternalTheory.g:1742:2: rule__Constructor__Group_1_2__0__Impl rule__Constructor__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Constructor__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1_2__1();

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
    // $ANTLR end "rule__Constructor__Group_1_2__0"


    // $ANTLR start "rule__Constructor__Group_1_2__0__Impl"
    // InternalTheory.g:1749:1: rule__Constructor__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1753:1: ( ( ',' ) )
            // InternalTheory.g:1754:1: ( ',' )
            {
            // InternalTheory.g:1754:1: ( ',' )
            // InternalTheory.g:1755:2: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Constructor__Group_1_2__0__Impl"


    // $ANTLR start "rule__Constructor__Group_1_2__1"
    // InternalTheory.g:1764:1: rule__Constructor__Group_1_2__1 : rule__Constructor__Group_1_2__1__Impl ;
    public final void rule__Constructor__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1768:1: ( rule__Constructor__Group_1_2__1__Impl )
            // InternalTheory.g:1769:2: rule__Constructor__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Constructor__Group_1_2__1"


    // $ANTLR start "rule__Constructor__Group_1_2__1__Impl"
    // InternalTheory.g:1775:1: rule__Constructor__Group_1_2__1__Impl : ( ( rule__Constructor__DestructorsAssignment_1_2_1 ) ) ;
    public final void rule__Constructor__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1779:1: ( ( ( rule__Constructor__DestructorsAssignment_1_2_1 ) ) )
            // InternalTheory.g:1780:1: ( ( rule__Constructor__DestructorsAssignment_1_2_1 ) )
            {
            // InternalTheory.g:1780:1: ( ( rule__Constructor__DestructorsAssignment_1_2_1 ) )
            // InternalTheory.g:1781:2: ( rule__Constructor__DestructorsAssignment_1_2_1 )
            {
             before(grammarAccess.getConstructorAccess().getDestructorsAssignment_1_2_1()); 
            // InternalTheory.g:1782:2: ( rule__Constructor__DestructorsAssignment_1_2_1 )
            // InternalTheory.g:1782:3: rule__Constructor__DestructorsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constructor__DestructorsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getDestructorsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Constructor__Group_1_2__1__Impl"


    // $ANTLR start "rule__Destructor__Group__0"
    // InternalTheory.g:1791:1: rule__Destructor__Group__0 : rule__Destructor__Group__0__Impl rule__Destructor__Group__1 ;
    public final void rule__Destructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1795:1: ( rule__Destructor__Group__0__Impl rule__Destructor__Group__1 )
            // InternalTheory.g:1796:2: rule__Destructor__Group__0__Impl rule__Destructor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Destructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destructor__Group__1();

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
    // $ANTLR end "rule__Destructor__Group__0"


    // $ANTLR start "rule__Destructor__Group__0__Impl"
    // InternalTheory.g:1803:1: rule__Destructor__Group__0__Impl : ( ( rule__Destructor__NameAssignment_0 ) ) ;
    public final void rule__Destructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1807:1: ( ( ( rule__Destructor__NameAssignment_0 ) ) )
            // InternalTheory.g:1808:1: ( ( rule__Destructor__NameAssignment_0 ) )
            {
            // InternalTheory.g:1808:1: ( ( rule__Destructor__NameAssignment_0 ) )
            // InternalTheory.g:1809:2: ( rule__Destructor__NameAssignment_0 )
            {
             before(grammarAccess.getDestructorAccess().getNameAssignment_0()); 
            // InternalTheory.g:1810:2: ( rule__Destructor__NameAssignment_0 )
            // InternalTheory.g:1810:3: rule__Destructor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Destructor__Group__0__Impl"


    // $ANTLR start "rule__Destructor__Group__1"
    // InternalTheory.g:1818:1: rule__Destructor__Group__1 : rule__Destructor__Group__1__Impl rule__Destructor__Group__2 ;
    public final void rule__Destructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1822:1: ( rule__Destructor__Group__1__Impl rule__Destructor__Group__2 )
            // InternalTheory.g:1823:2: rule__Destructor__Group__1__Impl rule__Destructor__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Destructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destructor__Group__2();

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
    // $ANTLR end "rule__Destructor__Group__1"


    // $ANTLR start "rule__Destructor__Group__1__Impl"
    // InternalTheory.g:1830:1: rule__Destructor__Group__1__Impl : ( ':' ) ;
    public final void rule__Destructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1834:1: ( ( ':' ) )
            // InternalTheory.g:1835:1: ( ':' )
            {
            // InternalTheory.g:1835:1: ( ':' )
            // InternalTheory.g:1836:2: ':'
            {
             before(grammarAccess.getDestructorAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Destructor__Group__1__Impl"


    // $ANTLR start "rule__Destructor__Group__2"
    // InternalTheory.g:1845:1: rule__Destructor__Group__2 : rule__Destructor__Group__2__Impl ;
    public final void rule__Destructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1849:1: ( rule__Destructor__Group__2__Impl )
            // InternalTheory.g:1850:2: rule__Destructor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__Group__2__Impl();

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
    // $ANTLR end "rule__Destructor__Group__2"


    // $ANTLR start "rule__Destructor__Group__2__Impl"
    // InternalTheory.g:1856:1: rule__Destructor__Group__2__Impl : ( ( rule__Destructor__TypeAssignment_2 ) ) ;
    public final void rule__Destructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1860:1: ( ( ( rule__Destructor__TypeAssignment_2 ) ) )
            // InternalTheory.g:1861:1: ( ( rule__Destructor__TypeAssignment_2 ) )
            {
            // InternalTheory.g:1861:1: ( ( rule__Destructor__TypeAssignment_2 ) )
            // InternalTheory.g:1862:2: ( rule__Destructor__TypeAssignment_2 )
            {
             before(grammarAccess.getDestructorAccess().getTypeAssignment_2()); 
            // InternalTheory.g:1863:2: ( rule__Destructor__TypeAssignment_2 )
            // InternalTheory.g:1863:3: rule__Destructor__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Destructor__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDestructorAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Destructor__Group__2__Impl"


    // $ANTLR start "rule__Operator__Group__0"
    // InternalTheory.g:1872:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1876:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // InternalTheory.g:1877:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__1();

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
    // $ANTLR end "rule__Operator__Group__0"


    // $ANTLR start "rule__Operator__Group__0__Impl"
    // InternalTheory.g:1884:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__NameAssignment_0 ) ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1888:1: ( ( ( rule__Operator__NameAssignment_0 ) ) )
            // InternalTheory.g:1889:1: ( ( rule__Operator__NameAssignment_0 ) )
            {
            // InternalTheory.g:1889:1: ( ( rule__Operator__NameAssignment_0 ) )
            // InternalTheory.g:1890:2: ( rule__Operator__NameAssignment_0 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_0()); 
            // InternalTheory.g:1891:2: ( rule__Operator__NameAssignment_0 )
            // InternalTheory.g:1891:3: rule__Operator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Operator__Group__0__Impl"


    // $ANTLR start "rule__Operator__Group__1"
    // InternalTheory.g:1899:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1903:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // InternalTheory.g:1904:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__2();

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
    // $ANTLR end "rule__Operator__Group__1"


    // $ANTLR start "rule__Operator__Group__1__Impl"
    // InternalTheory.g:1911:1: rule__Operator__Group__1__Impl : ( ( rule__Operator__Group_1__0 )? ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1915:1: ( ( ( rule__Operator__Group_1__0 )? ) )
            // InternalTheory.g:1916:1: ( ( rule__Operator__Group_1__0 )? )
            {
            // InternalTheory.g:1916:1: ( ( rule__Operator__Group_1__0 )? )
            // InternalTheory.g:1917:2: ( rule__Operator__Group_1__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_1()); 
            // InternalTheory.g:1918:2: ( rule__Operator__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTheory.g:1918:3: rule__Operator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Operator__Group__1__Impl"


    // $ANTLR start "rule__Operator__Group__2"
    // InternalTheory.g:1926:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1930:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // InternalTheory.g:1931:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__3();

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
    // $ANTLR end "rule__Operator__Group__2"


    // $ANTLR start "rule__Operator__Group__2__Impl"
    // InternalTheory.g:1938:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__UnorderedGroup_2 ) ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1942:1: ( ( ( rule__Operator__UnorderedGroup_2 ) ) )
            // InternalTheory.g:1943:1: ( ( rule__Operator__UnorderedGroup_2 ) )
            {
            // InternalTheory.g:1943:1: ( ( rule__Operator__UnorderedGroup_2 ) )
            // InternalTheory.g:1944:2: ( rule__Operator__UnorderedGroup_2 )
            {
             before(grammarAccess.getOperatorAccess().getUnorderedGroup_2()); 
            // InternalTheory.g:1945:2: ( rule__Operator__UnorderedGroup_2 )
            // InternalTheory.g:1945:3: rule__Operator__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getUnorderedGroup_2()); 

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
    // $ANTLR end "rule__Operator__Group__2__Impl"


    // $ANTLR start "rule__Operator__Group__3"
    // InternalTheory.g:1953:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1957:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // InternalTheory.g:1958:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__4();

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
    // $ANTLR end "rule__Operator__Group__3"


    // $ANTLR start "rule__Operator__Group__3__Impl"
    // InternalTheory.g:1965:1: rule__Operator__Group__3__Impl : ( ( rule__Operator__Group_3__0 )? ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1969:1: ( ( ( rule__Operator__Group_3__0 )? ) )
            // InternalTheory.g:1970:1: ( ( rule__Operator__Group_3__0 )? )
            {
            // InternalTheory.g:1970:1: ( ( rule__Operator__Group_3__0 )? )
            // InternalTheory.g:1971:2: ( rule__Operator__Group_3__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_3()); 
            // InternalTheory.g:1972:2: ( rule__Operator__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTheory.g:1972:3: rule__Operator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Operator__Group__3__Impl"


    // $ANTLR start "rule__Operator__Group__4"
    // InternalTheory.g:1980:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1984:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // InternalTheory.g:1985:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Operator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group__5();

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
    // $ANTLR end "rule__Operator__Group__4"


    // $ANTLR start "rule__Operator__Group__4__Impl"
    // InternalTheory.g:1992:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__Group_4__0 )? ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:1996:1: ( ( ( rule__Operator__Group_4__0 )? ) )
            // InternalTheory.g:1997:1: ( ( rule__Operator__Group_4__0 )? )
            {
            // InternalTheory.g:1997:1: ( ( rule__Operator__Group_4__0 )? )
            // InternalTheory.g:1998:2: ( rule__Operator__Group_4__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_4()); 
            // InternalTheory.g:1999:2: ( rule__Operator__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTheory.g:1999:3: rule__Operator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Operator__Group__4__Impl"


    // $ANTLR start "rule__Operator__Group__5"
    // InternalTheory.g:2007:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2011:1: ( rule__Operator__Group__5__Impl )
            // InternalTheory.g:2012:2: rule__Operator__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group__5__Impl();

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
    // $ANTLR end "rule__Operator__Group__5"


    // $ANTLR start "rule__Operator__Group__5__Impl"
    // InternalTheory.g:2018:1: rule__Operator__Group__5__Impl : ( ( rule__Operator__Group_5__0 )? ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2022:1: ( ( ( rule__Operator__Group_5__0 )? ) )
            // InternalTheory.g:2023:1: ( ( rule__Operator__Group_5__0 )? )
            {
            // InternalTheory.g:2023:1: ( ( rule__Operator__Group_5__0 )? )
            // InternalTheory.g:2024:2: ( rule__Operator__Group_5__0 )?
            {
             before(grammarAccess.getOperatorAccess().getGroup_5()); 
            // InternalTheory.g:2025:2: ( rule__Operator__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTheory.g:2025:3: rule__Operator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Operator__Group__5__Impl"


    // $ANTLR start "rule__Operator__Group_1__0"
    // InternalTheory.g:2034:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2038:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalTheory.g:2039:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Operator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__1();

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
    // $ANTLR end "rule__Operator__Group_1__0"


    // $ANTLR start "rule__Operator__Group_1__0__Impl"
    // InternalTheory.g:2046:1: rule__Operator__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2050:1: ( ( '(' ) )
            // InternalTheory.g:2051:1: ( '(' )
            {
            // InternalTheory.g:2051:1: ( '(' )
            // InternalTheory.g:2052:2: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Operator__Group_1__0__Impl"


    // $ANTLR start "rule__Operator__Group_1__1"
    // InternalTheory.g:2061:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2065:1: ( rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 )
            // InternalTheory.g:2066:2: rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Operator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__2();

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
    // $ANTLR end "rule__Operator__Group_1__1"


    // $ANTLR start "rule__Operator__Group_1__1__Impl"
    // InternalTheory.g:2073:1: rule__Operator__Group_1__1__Impl : ( ( rule__Operator__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2077:1: ( ( ( rule__Operator__ArgumentsAssignment_1_1 ) ) )
            // InternalTheory.g:2078:1: ( ( rule__Operator__ArgumentsAssignment_1_1 ) )
            {
            // InternalTheory.g:2078:1: ( ( rule__Operator__ArgumentsAssignment_1_1 ) )
            // InternalTheory.g:2079:2: ( rule__Operator__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_1_1()); 
            // InternalTheory.g:2080:2: ( rule__Operator__ArgumentsAssignment_1_1 )
            // InternalTheory.g:2080:3: rule__Operator__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getArgumentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Operator__Group_1__1__Impl"


    // $ANTLR start "rule__Operator__Group_1__2"
    // InternalTheory.g:2088:1: rule__Operator__Group_1__2 : rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 ;
    public final void rule__Operator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2092:1: ( rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 )
            // InternalTheory.g:2093:2: rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Operator__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__3();

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
    // $ANTLR end "rule__Operator__Group_1__2"


    // $ANTLR start "rule__Operator__Group_1__2__Impl"
    // InternalTheory.g:2100:1: rule__Operator__Group_1__2__Impl : ( ( rule__Operator__Group_1_2__0 )* ) ;
    public final void rule__Operator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2104:1: ( ( ( rule__Operator__Group_1_2__0 )* ) )
            // InternalTheory.g:2105:1: ( ( rule__Operator__Group_1_2__0 )* )
            {
            // InternalTheory.g:2105:1: ( ( rule__Operator__Group_1_2__0 )* )
            // InternalTheory.g:2106:2: ( rule__Operator__Group_1_2__0 )*
            {
             before(grammarAccess.getOperatorAccess().getGroup_1_2()); 
            // InternalTheory.g:2107:2: ( rule__Operator__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTheory.g:2107:3: rule__Operator__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Operator__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Operator__Group_1__2__Impl"


    // $ANTLR start "rule__Operator__Group_1__3"
    // InternalTheory.g:2115:1: rule__Operator__Group_1__3 : rule__Operator__Group_1__3__Impl ;
    public final void rule__Operator__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2119:1: ( rule__Operator__Group_1__3__Impl )
            // InternalTheory.g:2120:2: rule__Operator__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__3__Impl();

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
    // $ANTLR end "rule__Operator__Group_1__3"


    // $ANTLR start "rule__Operator__Group_1__3__Impl"
    // InternalTheory.g:2126:1: rule__Operator__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2130:1: ( ( ')' ) )
            // InternalTheory.g:2131:1: ( ')' )
            {
            // InternalTheory.g:2131:1: ( ')' )
            // InternalTheory.g:2132:2: ')'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Operator__Group_1__3__Impl"


    // $ANTLR start "rule__Operator__Group_1_2__0"
    // InternalTheory.g:2142:1: rule__Operator__Group_1_2__0 : rule__Operator__Group_1_2__0__Impl rule__Operator__Group_1_2__1 ;
    public final void rule__Operator__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2146:1: ( rule__Operator__Group_1_2__0__Impl rule__Operator__Group_1_2__1 )
            // InternalTheory.g:2147:2: rule__Operator__Group_1_2__0__Impl rule__Operator__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Operator__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_1_2__1();

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
    // $ANTLR end "rule__Operator__Group_1_2__0"


    // $ANTLR start "rule__Operator__Group_1_2__0__Impl"
    // InternalTheory.g:2154:1: rule__Operator__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2158:1: ( ( ',' ) )
            // InternalTheory.g:2159:1: ( ',' )
            {
            // InternalTheory.g:2159:1: ( ',' )
            // InternalTheory.g:2160:2: ','
            {
             before(grammarAccess.getOperatorAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Operator__Group_1_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_1_2__1"
    // InternalTheory.g:2169:1: rule__Operator__Group_1_2__1 : rule__Operator__Group_1_2__1__Impl ;
    public final void rule__Operator__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2173:1: ( rule__Operator__Group_1_2__1__Impl )
            // InternalTheory.g:2174:2: rule__Operator__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_1_2__1"


    // $ANTLR start "rule__Operator__Group_1_2__1__Impl"
    // InternalTheory.g:2180:1: rule__Operator__Group_1_2__1__Impl : ( ( rule__Operator__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__Operator__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2184:1: ( ( ( rule__Operator__ArgumentsAssignment_1_2_1 ) ) )
            // InternalTheory.g:2185:1: ( ( rule__Operator__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalTheory.g:2185:1: ( ( rule__Operator__ArgumentsAssignment_1_2_1 ) )
            // InternalTheory.g:2186:2: ( rule__Operator__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getOperatorAccess().getArgumentsAssignment_1_2_1()); 
            // InternalTheory.g:2187:2: ( rule__Operator__ArgumentsAssignment_1_2_1 )
            // InternalTheory.g:2187:3: rule__Operator__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getArgumentsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Operator__Group_1_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_2_0__0"
    // InternalTheory.g:2196:1: rule__Operator__Group_2_0__0 : rule__Operator__Group_2_0__0__Impl rule__Operator__Group_2_0__1 ;
    public final void rule__Operator__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2200:1: ( rule__Operator__Group_2_0__0__Impl rule__Operator__Group_2_0__1 )
            // InternalTheory.g:2201:2: rule__Operator__Group_2_0__0__Impl rule__Operator__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_0__1();

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
    // $ANTLR end "rule__Operator__Group_2_0__0"


    // $ANTLR start "rule__Operator__Group_2_0__0__Impl"
    // InternalTheory.g:2208:1: rule__Operator__Group_2_0__0__Impl : ( ':' ) ;
    public final void rule__Operator__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2212:1: ( ( ':' ) )
            // InternalTheory.g:2213:1: ( ':' )
            {
            // InternalTheory.g:2213:1: ( ':' )
            // InternalTheory.g:2214:2: ':'
            {
             before(grammarAccess.getOperatorAccess().getColonKeyword_2_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getColonKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Operator__Group_2_0__0__Impl"


    // $ANTLR start "rule__Operator__Group_2_0__1"
    // InternalTheory.g:2223:1: rule__Operator__Group_2_0__1 : rule__Operator__Group_2_0__1__Impl ;
    public final void rule__Operator__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2227:1: ( rule__Operator__Group_2_0__1__Impl )
            // InternalTheory.g:2228:2: rule__Operator__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_2_0__1"


    // $ANTLR start "rule__Operator__Group_2_0__1__Impl"
    // InternalTheory.g:2234:1: rule__Operator__Group_2_0__1__Impl : ( ( rule__Operator__TypeAssignment_2_0_1 ) ) ;
    public final void rule__Operator__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2238:1: ( ( ( rule__Operator__TypeAssignment_2_0_1 ) ) )
            // InternalTheory.g:2239:1: ( ( rule__Operator__TypeAssignment_2_0_1 ) )
            {
            // InternalTheory.g:2239:1: ( ( rule__Operator__TypeAssignment_2_0_1 ) )
            // InternalTheory.g:2240:2: ( rule__Operator__TypeAssignment_2_0_1 )
            {
             before(grammarAccess.getOperatorAccess().getTypeAssignment_2_0_1()); 
            // InternalTheory.g:2241:2: ( rule__Operator__TypeAssignment_2_0_1 )
            // InternalTheory.g:2241:3: rule__Operator__TypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__TypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getTypeAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Operator__Group_2_0__1__Impl"


    // $ANTLR start "rule__Operator__Group_2_2__0"
    // InternalTheory.g:2250:1: rule__Operator__Group_2_2__0 : rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 ;
    public final void rule__Operator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2254:1: ( rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1 )
            // InternalTheory.g:2255:2: rule__Operator__Group_2_2__0__Impl rule__Operator__Group_2_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Operator__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_2__1();

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
    // $ANTLR end "rule__Operator__Group_2_2__0"


    // $ANTLR start "rule__Operator__Group_2_2__0__Impl"
    // InternalTheory.g:2262:1: rule__Operator__Group_2_2__0__Impl : ( ( rule__Operator__AssociativeAssignment_2_2_0 ) ) ;
    public final void rule__Operator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2266:1: ( ( ( rule__Operator__AssociativeAssignment_2_2_0 ) ) )
            // InternalTheory.g:2267:1: ( ( rule__Operator__AssociativeAssignment_2_2_0 ) )
            {
            // InternalTheory.g:2267:1: ( ( rule__Operator__AssociativeAssignment_2_2_0 ) )
            // InternalTheory.g:2268:2: ( rule__Operator__AssociativeAssignment_2_2_0 )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssignment_2_2_0()); 
            // InternalTheory.g:2269:2: ( rule__Operator__AssociativeAssignment_2_2_0 )
            // InternalTheory.g:2269:3: rule__Operator__AssociativeAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AssociativeAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAssociativeAssignment_2_2_0()); 

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
    // $ANTLR end "rule__Operator__Group_2_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2_2__1"
    // InternalTheory.g:2277:1: rule__Operator__Group_2_2__1 : rule__Operator__Group_2_2__1__Impl ;
    public final void rule__Operator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2281:1: ( rule__Operator__Group_2_2__1__Impl )
            // InternalTheory.g:2282:2: rule__Operator__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_2_2__1"


    // $ANTLR start "rule__Operator__Group_2_2__1__Impl"
    // InternalTheory.g:2288:1: rule__Operator__Group_2_2__1__Impl : ( ( rule__Operator__CommutativeAssignment_2_2_1 )? ) ;
    public final void rule__Operator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2292:1: ( ( ( rule__Operator__CommutativeAssignment_2_2_1 )? ) )
            // InternalTheory.g:2293:1: ( ( rule__Operator__CommutativeAssignment_2_2_1 )? )
            {
            // InternalTheory.g:2293:1: ( ( rule__Operator__CommutativeAssignment_2_2_1 )? )
            // InternalTheory.g:2294:2: ( rule__Operator__CommutativeAssignment_2_2_1 )?
            {
             before(grammarAccess.getOperatorAccess().getCommutativeAssignment_2_2_1()); 
            // InternalTheory.g:2295:2: ( rule__Operator__CommutativeAssignment_2_2_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTheory.g:2295:3: rule__Operator__CommutativeAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__CommutativeAssignment_2_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorAccess().getCommutativeAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Operator__Group_2_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_3__0"
    // InternalTheory.g:2304:1: rule__Operator__Group_3__0 : rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 ;
    public final void rule__Operator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2308:1: ( rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 )
            // InternalTheory.g:2309:2: rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Operator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__1();

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
    // $ANTLR end "rule__Operator__Group_3__0"


    // $ANTLR start "rule__Operator__Group_3__0__Impl"
    // InternalTheory.g:2316:1: rule__Operator__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Operator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2320:1: ( ( '#' ) )
            // InternalTheory.g:2321:1: ( '#' )
            {
            // InternalTheory.g:2321:1: ( '#' )
            // InternalTheory.g:2322:2: '#'
            {
             before(grammarAccess.getOperatorAccess().getNumberSignKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getNumberSignKeyword_3_0()); 

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
    // $ANTLR end "rule__Operator__Group_3__0__Impl"


    // $ANTLR start "rule__Operator__Group_3__1"
    // InternalTheory.g:2331:1: rule__Operator__Group_3__1 : rule__Operator__Group_3__1__Impl ;
    public final void rule__Operator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2335:1: ( rule__Operator__Group_3__1__Impl )
            // InternalTheory.g:2336:2: rule__Operator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_3__1"


    // $ANTLR start "rule__Operator__Group_3__1__Impl"
    // InternalTheory.g:2342:1: rule__Operator__Group_3__1__Impl : ( ( rule__Operator__PrecedentAssignment_3_1 ) ) ;
    public final void rule__Operator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2346:1: ( ( ( rule__Operator__PrecedentAssignment_3_1 ) ) )
            // InternalTheory.g:2347:1: ( ( rule__Operator__PrecedentAssignment_3_1 ) )
            {
            // InternalTheory.g:2347:1: ( ( rule__Operator__PrecedentAssignment_3_1 ) )
            // InternalTheory.g:2348:2: ( rule__Operator__PrecedentAssignment_3_1 )
            {
             before(grammarAccess.getOperatorAccess().getPrecedentAssignment_3_1()); 
            // InternalTheory.g:2349:2: ( rule__Operator__PrecedentAssignment_3_1 )
            // InternalTheory.g:2349:3: rule__Operator__PrecedentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__PrecedentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getPrecedentAssignment_3_1()); 

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
    // $ANTLR end "rule__Operator__Group_3__1__Impl"


    // $ANTLR start "rule__Operator__Group_4__0"
    // InternalTheory.g:2358:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2362:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalTheory.g:2363:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__1();

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
    // $ANTLR end "rule__Operator__Group_4__0"


    // $ANTLR start "rule__Operator__Group_4__0__Impl"
    // InternalTheory.g:2370:1: rule__Operator__Group_4__0__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2374:1: ( ( 'for' ) )
            // InternalTheory.g:2375:1: ( 'for' )
            {
            // InternalTheory.g:2375:1: ( 'for' )
            // InternalTheory.g:2376:2: 'for'
            {
             before(grammarAccess.getOperatorAccess().getForKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getForKeyword_4_0()); 

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
    // $ANTLR end "rule__Operator__Group_4__0__Impl"


    // $ANTLR start "rule__Operator__Group_4__1"
    // InternalTheory.g:2385:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2389:1: ( rule__Operator__Group_4__1__Impl )
            // InternalTheory.g:2390:2: rule__Operator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_4__1"


    // $ANTLR start "rule__Operator__Group_4__1__Impl"
    // InternalTheory.g:2396:1: rule__Operator__Group_4__1__Impl : ( ( rule__Operator__WdAssignment_4_1 ) ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2400:1: ( ( ( rule__Operator__WdAssignment_4_1 ) ) )
            // InternalTheory.g:2401:1: ( ( rule__Operator__WdAssignment_4_1 ) )
            {
            // InternalTheory.g:2401:1: ( ( rule__Operator__WdAssignment_4_1 ) )
            // InternalTheory.g:2402:2: ( rule__Operator__WdAssignment_4_1 )
            {
             before(grammarAccess.getOperatorAccess().getWdAssignment_4_1()); 
            // InternalTheory.g:2403:2: ( rule__Operator__WdAssignment_4_1 )
            // InternalTheory.g:2403:3: rule__Operator__WdAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__WdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getWdAssignment_4_1()); 

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
    // $ANTLR end "rule__Operator__Group_4__1__Impl"


    // $ANTLR start "rule__Operator__Group_5__0"
    // InternalTheory.g:2412:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2416:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalTheory.g:2417:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__Operator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__1();

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
    // $ANTLR end "rule__Operator__Group_5__0"


    // $ANTLR start "rule__Operator__Group_5__0__Impl"
    // InternalTheory.g:2424:1: rule__Operator__Group_5__0__Impl : ( '=' ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2428:1: ( ( '=' ) )
            // InternalTheory.g:2429:1: ( '=' )
            {
            // InternalTheory.g:2429:1: ( '=' )
            // InternalTheory.g:2430:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_5_0()); 

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
    // $ANTLR end "rule__Operator__Group_5__0__Impl"


    // $ANTLR start "rule__Operator__Group_5__1"
    // InternalTheory.g:2439:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2443:1: ( rule__Operator__Group_5__1__Impl )
            // InternalTheory.g:2444:2: rule__Operator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_5__1"


    // $ANTLR start "rule__Operator__Group_5__1__Impl"
    // InternalTheory.g:2450:1: rule__Operator__Group_5__1__Impl : ( ( rule__Operator__Alternatives_5_1 ) ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2454:1: ( ( ( rule__Operator__Alternatives_5_1 ) ) )
            // InternalTheory.g:2455:1: ( ( rule__Operator__Alternatives_5_1 ) )
            {
            // InternalTheory.g:2455:1: ( ( rule__Operator__Alternatives_5_1 ) )
            // InternalTheory.g:2456:2: ( rule__Operator__Alternatives_5_1 )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives_5_1()); 
            // InternalTheory.g:2457:2: ( rule__Operator__Alternatives_5_1 )
            // InternalTheory.g:2457:3: rule__Operator__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives_5_1()); 

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
    // $ANTLR end "rule__Operator__Group_5__1__Impl"


    // $ANTLR start "rule__Operator__Group_5_1_1__0"
    // InternalTheory.g:2466:1: rule__Operator__Group_5_1_1__0 : rule__Operator__Group_5_1_1__0__Impl rule__Operator__Group_5_1_1__1 ;
    public final void rule__Operator__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2470:1: ( rule__Operator__Group_5_1_1__0__Impl rule__Operator__Group_5_1_1__1 )
            // InternalTheory.g:2471:2: rule__Operator__Group_5_1_1__0__Impl rule__Operator__Group_5_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Operator__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_5_1_1__1();

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
    // $ANTLR end "rule__Operator__Group_5_1_1__0"


    // $ANTLR start "rule__Operator__Group_5_1_1__0__Impl"
    // InternalTheory.g:2478:1: rule__Operator__Group_5_1_1__0__Impl : ( 'case' ) ;
    public final void rule__Operator__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2482:1: ( ( 'case' ) )
            // InternalTheory.g:2483:1: ( 'case' )
            {
            // InternalTheory.g:2483:1: ( 'case' )
            // InternalTheory.g:2484:2: 'case'
            {
             before(grammarAccess.getOperatorAccess().getCaseKeyword_5_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCaseKeyword_5_1_1_0()); 

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
    // $ANTLR end "rule__Operator__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__Operator__Group_5_1_1__1"
    // InternalTheory.g:2493:1: rule__Operator__Group_5_1_1__1 : rule__Operator__Group_5_1_1__1__Impl rule__Operator__Group_5_1_1__2 ;
    public final void rule__Operator__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2497:1: ( rule__Operator__Group_5_1_1__1__Impl rule__Operator__Group_5_1_1__2 )
            // InternalTheory.g:2498:2: rule__Operator__Group_5_1_1__1__Impl rule__Operator__Group_5_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_5_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_5_1_1__2();

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
    // $ANTLR end "rule__Operator__Group_5_1_1__1"


    // $ANTLR start "rule__Operator__Group_5_1_1__1__Impl"
    // InternalTheory.g:2505:1: rule__Operator__Group_5_1_1__1__Impl : ( ( rule__Operator__CaseAssignment_5_1_1_1 ) ) ;
    public final void rule__Operator__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2509:1: ( ( ( rule__Operator__CaseAssignment_5_1_1_1 ) ) )
            // InternalTheory.g:2510:1: ( ( rule__Operator__CaseAssignment_5_1_1_1 ) )
            {
            // InternalTheory.g:2510:1: ( ( rule__Operator__CaseAssignment_5_1_1_1 ) )
            // InternalTheory.g:2511:2: ( rule__Operator__CaseAssignment_5_1_1_1 )
            {
             before(grammarAccess.getOperatorAccess().getCaseAssignment_5_1_1_1()); 
            // InternalTheory.g:2512:2: ( rule__Operator__CaseAssignment_5_1_1_1 )
            // InternalTheory.g:2512:3: rule__Operator__CaseAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__CaseAssignment_5_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCaseAssignment_5_1_1_1()); 

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
    // $ANTLR end "rule__Operator__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Operator__Group_5_1_1__2"
    // InternalTheory.g:2520:1: rule__Operator__Group_5_1_1__2 : rule__Operator__Group_5_1_1__2__Impl ;
    public final void rule__Operator__Group_5_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2524:1: ( rule__Operator__Group_5_1_1__2__Impl )
            // InternalTheory.g:2525:2: rule__Operator__Group_5_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5_1_1__2__Impl();

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
    // $ANTLR end "rule__Operator__Group_5_1_1__2"


    // $ANTLR start "rule__Operator__Group_5_1_1__2__Impl"
    // InternalTheory.g:2531:1: rule__Operator__Group_5_1_1__2__Impl : ( ( ( rule__Operator__CasesAssignment_5_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_5_1_1_2 )* ) ) ;
    public final void rule__Operator__Group_5_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2535:1: ( ( ( ( rule__Operator__CasesAssignment_5_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_5_1_1_2 )* ) ) )
            // InternalTheory.g:2536:1: ( ( ( rule__Operator__CasesAssignment_5_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_5_1_1_2 )* ) )
            {
            // InternalTheory.g:2536:1: ( ( ( rule__Operator__CasesAssignment_5_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_5_1_1_2 )* ) )
            // InternalTheory.g:2537:2: ( ( rule__Operator__CasesAssignment_5_1_1_2 ) ) ( ( rule__Operator__CasesAssignment_5_1_1_2 )* )
            {
            // InternalTheory.g:2537:2: ( ( rule__Operator__CasesAssignment_5_1_1_2 ) )
            // InternalTheory.g:2538:3: ( rule__Operator__CasesAssignment_5_1_1_2 )
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_5_1_1_2()); 
            // InternalTheory.g:2539:3: ( rule__Operator__CasesAssignment_5_1_1_2 )
            // InternalTheory.g:2539:4: rule__Operator__CasesAssignment_5_1_1_2
            {
            pushFollow(FOLLOW_23);
            rule__Operator__CasesAssignment_5_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getCasesAssignment_5_1_1_2()); 

            }

            // InternalTheory.g:2542:2: ( ( rule__Operator__CasesAssignment_5_1_1_2 )* )
            // InternalTheory.g:2543:3: ( rule__Operator__CasesAssignment_5_1_1_2 )*
            {
             before(grammarAccess.getOperatorAccess().getCasesAssignment_5_1_1_2()); 
            // InternalTheory.g:2544:3: ( rule__Operator__CasesAssignment_5_1_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTheory.g:2544:4: rule__Operator__CasesAssignment_5_1_1_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Operator__CasesAssignment_5_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getCasesAssignment_5_1_1_2()); 

            }


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
    // $ANTLR end "rule__Operator__Group_5_1_1__2__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalTheory.g:2554:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2558:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalTheory.g:2559:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

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
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalTheory.g:2566:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2570:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalTheory.g:2571:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalTheory.g:2571:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalTheory.g:2572:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalTheory.g:2573:2: ( rule__Argument__NameAssignment_0 )
            // InternalTheory.g:2573:3: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalTheory.g:2581:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2585:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // InternalTheory.g:2586:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__2();

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
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalTheory.g:2593:1: rule__Argument__Group__1__Impl : ( ':' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2597:1: ( ( ':' ) )
            // InternalTheory.g:2598:1: ( ':' )
            {
            // InternalTheory.g:2598:1: ( ':' )
            // InternalTheory.g:2599:2: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__Argument__Group__2"
    // InternalTheory.g:2608:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2612:1: ( rule__Argument__Group__2__Impl )
            // InternalTheory.g:2613:2: rule__Argument__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__2__Impl();

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
    // $ANTLR end "rule__Argument__Group__2"


    // $ANTLR start "rule__Argument__Group__2__Impl"
    // InternalTheory.g:2619:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__TypeAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2623:1: ( ( ( rule__Argument__TypeAssignment_2 ) ) )
            // InternalTheory.g:2624:1: ( ( rule__Argument__TypeAssignment_2 ) )
            {
            // InternalTheory.g:2624:1: ( ( rule__Argument__TypeAssignment_2 ) )
            // InternalTheory.g:2625:2: ( rule__Argument__TypeAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_2()); 
            // InternalTheory.g:2626:2: ( rule__Argument__TypeAssignment_2 )
            // InternalTheory.g:2626:3: rule__Argument__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Argument__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Argument__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // InternalTheory.g:2635:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2639:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // InternalTheory.g:2640:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__1();

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
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // InternalTheory.g:2647:1: rule__Case__Group__0__Impl : ( ( rule__Case__PatternAssignment_0 ) ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2651:1: ( ( ( rule__Case__PatternAssignment_0 ) ) )
            // InternalTheory.g:2652:1: ( ( rule__Case__PatternAssignment_0 ) )
            {
            // InternalTheory.g:2652:1: ( ( rule__Case__PatternAssignment_0 ) )
            // InternalTheory.g:2653:2: ( rule__Case__PatternAssignment_0 )
            {
             before(grammarAccess.getCaseAccess().getPatternAssignment_0()); 
            // InternalTheory.g:2654:2: ( rule__Case__PatternAssignment_0 )
            // InternalTheory.g:2654:3: rule__Case__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Case__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getPatternAssignment_0()); 

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
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // InternalTheory.g:2662:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2666:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // InternalTheory.g:2667:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Case__Group__2();

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
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // InternalTheory.g:2674:1: rule__Case__Group__1__Impl : ( '=>' ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2678:1: ( ( '=>' ) )
            // InternalTheory.g:2679:1: ( '=>' )
            {
            // InternalTheory.g:2679:1: ( '=>' )
            // InternalTheory.g:2680:2: '=>'
            {
             before(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // InternalTheory.g:2689:1: rule__Case__Group__2 : rule__Case__Group__2__Impl ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2693:1: ( rule__Case__Group__2__Impl )
            // InternalTheory.g:2694:2: rule__Case__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Case__Group__2__Impl();

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
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // InternalTheory.g:2700:1: rule__Case__Group__2__Impl : ( ( rule__Case__FormulaAssignment_2 ) ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2704:1: ( ( ( rule__Case__FormulaAssignment_2 ) ) )
            // InternalTheory.g:2705:1: ( ( rule__Case__FormulaAssignment_2 ) )
            {
            // InternalTheory.g:2705:1: ( ( rule__Case__FormulaAssignment_2 ) )
            // InternalTheory.g:2706:2: ( rule__Case__FormulaAssignment_2 )
            {
             before(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 
            // InternalTheory.g:2707:2: ( rule__Case__FormulaAssignment_2 )
            // InternalTheory.g:2707:3: rule__Case__FormulaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Case__FormulaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getFormulaAssignment_2()); 

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
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Axiom__Group__0"
    // InternalTheory.g:2716:1: rule__Axiom__Group__0 : rule__Axiom__Group__0__Impl rule__Axiom__Group__1 ;
    public final void rule__Axiom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2720:1: ( rule__Axiom__Group__0__Impl rule__Axiom__Group__1 )
            // InternalTheory.g:2721:2: rule__Axiom__Group__0__Impl rule__Axiom__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Axiom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__1();

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
    // $ANTLR end "rule__Axiom__Group__0"


    // $ANTLR start "rule__Axiom__Group__0__Impl"
    // InternalTheory.g:2728:1: rule__Axiom__Group__0__Impl : ( '@' ) ;
    public final void rule__Axiom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2732:1: ( ( '@' ) )
            // InternalTheory.g:2733:1: ( '@' )
            {
            // InternalTheory.g:2733:1: ( '@' )
            // InternalTheory.g:2734:2: '@'
            {
             before(grammarAccess.getAxiomAccess().getCommercialAtKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Axiom__Group__0__Impl"


    // $ANTLR start "rule__Axiom__Group__1"
    // InternalTheory.g:2743:1: rule__Axiom__Group__1 : rule__Axiom__Group__1__Impl rule__Axiom__Group__2 ;
    public final void rule__Axiom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2747:1: ( rule__Axiom__Group__1__Impl rule__Axiom__Group__2 )
            // InternalTheory.g:2748:2: rule__Axiom__Group__1__Impl rule__Axiom__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Axiom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__2();

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
    // $ANTLR end "rule__Axiom__Group__1"


    // $ANTLR start "rule__Axiom__Group__1__Impl"
    // InternalTheory.g:2755:1: rule__Axiom__Group__1__Impl : ( ( rule__Axiom__NameAssignment_1 ) ) ;
    public final void rule__Axiom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2759:1: ( ( ( rule__Axiom__NameAssignment_1 ) ) )
            // InternalTheory.g:2760:1: ( ( rule__Axiom__NameAssignment_1 ) )
            {
            // InternalTheory.g:2760:1: ( ( rule__Axiom__NameAssignment_1 ) )
            // InternalTheory.g:2761:2: ( rule__Axiom__NameAssignment_1 )
            {
             before(grammarAccess.getAxiomAccess().getNameAssignment_1()); 
            // InternalTheory.g:2762:2: ( rule__Axiom__NameAssignment_1 )
            // InternalTheory.g:2762:3: rule__Axiom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Axiom__Group__1__Impl"


    // $ANTLR start "rule__Axiom__Group__2"
    // InternalTheory.g:2770:1: rule__Axiom__Group__2 : rule__Axiom__Group__2__Impl rule__Axiom__Group__3 ;
    public final void rule__Axiom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2774:1: ( rule__Axiom__Group__2__Impl rule__Axiom__Group__3 )
            // InternalTheory.g:2775:2: rule__Axiom__Group__2__Impl rule__Axiom__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Axiom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axiom__Group__3();

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
    // $ANTLR end "rule__Axiom__Group__2"


    // $ANTLR start "rule__Axiom__Group__2__Impl"
    // InternalTheory.g:2782:1: rule__Axiom__Group__2__Impl : ( ':' ) ;
    public final void rule__Axiom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2786:1: ( ( ':' ) )
            // InternalTheory.g:2787:1: ( ':' )
            {
            // InternalTheory.g:2787:1: ( ':' )
            // InternalTheory.g:2788:2: ':'
            {
             before(grammarAccess.getAxiomAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Axiom__Group__2__Impl"


    // $ANTLR start "rule__Axiom__Group__3"
    // InternalTheory.g:2797:1: rule__Axiom__Group__3 : rule__Axiom__Group__3__Impl ;
    public final void rule__Axiom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2801:1: ( rule__Axiom__Group__3__Impl )
            // InternalTheory.g:2802:2: rule__Axiom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__Group__3__Impl();

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
    // $ANTLR end "rule__Axiom__Group__3"


    // $ANTLR start "rule__Axiom__Group__3__Impl"
    // InternalTheory.g:2808:1: rule__Axiom__Group__3__Impl : ( ( rule__Axiom__PredicateAssignment_3 ) ) ;
    public final void rule__Axiom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2812:1: ( ( ( rule__Axiom__PredicateAssignment_3 ) ) )
            // InternalTheory.g:2813:1: ( ( rule__Axiom__PredicateAssignment_3 ) )
            {
            // InternalTheory.g:2813:1: ( ( rule__Axiom__PredicateAssignment_3 ) )
            // InternalTheory.g:2814:2: ( rule__Axiom__PredicateAssignment_3 )
            {
             before(grammarAccess.getAxiomAccess().getPredicateAssignment_3()); 
            // InternalTheory.g:2815:2: ( rule__Axiom__PredicateAssignment_3 )
            // InternalTheory.g:2815:3: rule__Axiom__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Axiom__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxiomAccess().getPredicateAssignment_3()); 

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
    // $ANTLR end "rule__Axiom__Group__3__Impl"


    // $ANTLR start "rule__Theorem__Group__0"
    // InternalTheory.g:2824:1: rule__Theorem__Group__0 : rule__Theorem__Group__0__Impl rule__Theorem__Group__1 ;
    public final void rule__Theorem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2828:1: ( rule__Theorem__Group__0__Impl rule__Theorem__Group__1 )
            // InternalTheory.g:2829:2: rule__Theorem__Group__0__Impl rule__Theorem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Theorem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__1();

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
    // $ANTLR end "rule__Theorem__Group__0"


    // $ANTLR start "rule__Theorem__Group__0__Impl"
    // InternalTheory.g:2836:1: rule__Theorem__Group__0__Impl : ( '@' ) ;
    public final void rule__Theorem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2840:1: ( ( '@' ) )
            // InternalTheory.g:2841:1: ( '@' )
            {
            // InternalTheory.g:2841:1: ( '@' )
            // InternalTheory.g:2842:2: '@'
            {
             before(grammarAccess.getTheoremAccess().getCommercialAtKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Theorem__Group__0__Impl"


    // $ANTLR start "rule__Theorem__Group__1"
    // InternalTheory.g:2851:1: rule__Theorem__Group__1 : rule__Theorem__Group__1__Impl rule__Theorem__Group__2 ;
    public final void rule__Theorem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2855:1: ( rule__Theorem__Group__1__Impl rule__Theorem__Group__2 )
            // InternalTheory.g:2856:2: rule__Theorem__Group__1__Impl rule__Theorem__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Theorem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__2();

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
    // $ANTLR end "rule__Theorem__Group__1"


    // $ANTLR start "rule__Theorem__Group__1__Impl"
    // InternalTheory.g:2863:1: rule__Theorem__Group__1__Impl : ( ( rule__Theorem__NameAssignment_1 ) ) ;
    public final void rule__Theorem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2867:1: ( ( ( rule__Theorem__NameAssignment_1 ) ) )
            // InternalTheory.g:2868:1: ( ( rule__Theorem__NameAssignment_1 ) )
            {
            // InternalTheory.g:2868:1: ( ( rule__Theorem__NameAssignment_1 ) )
            // InternalTheory.g:2869:2: ( rule__Theorem__NameAssignment_1 )
            {
             before(grammarAccess.getTheoremAccess().getNameAssignment_1()); 
            // InternalTheory.g:2870:2: ( rule__Theorem__NameAssignment_1 )
            // InternalTheory.g:2870:3: rule__Theorem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Theorem__Group__1__Impl"


    // $ANTLR start "rule__Theorem__Group__2"
    // InternalTheory.g:2878:1: rule__Theorem__Group__2 : rule__Theorem__Group__2__Impl rule__Theorem__Group__3 ;
    public final void rule__Theorem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2882:1: ( rule__Theorem__Group__2__Impl rule__Theorem__Group__3 )
            // InternalTheory.g:2883:2: rule__Theorem__Group__2__Impl rule__Theorem__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Theorem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theorem__Group__3();

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
    // $ANTLR end "rule__Theorem__Group__2"


    // $ANTLR start "rule__Theorem__Group__2__Impl"
    // InternalTheory.g:2890:1: rule__Theorem__Group__2__Impl : ( ':' ) ;
    public final void rule__Theorem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2894:1: ( ( ':' ) )
            // InternalTheory.g:2895:1: ( ':' )
            {
            // InternalTheory.g:2895:1: ( ':' )
            // InternalTheory.g:2896:2: ':'
            {
             before(grammarAccess.getTheoremAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Theorem__Group__2__Impl"


    // $ANTLR start "rule__Theorem__Group__3"
    // InternalTheory.g:2905:1: rule__Theorem__Group__3 : rule__Theorem__Group__3__Impl ;
    public final void rule__Theorem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2909:1: ( rule__Theorem__Group__3__Impl )
            // InternalTheory.g:2910:2: rule__Theorem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__Group__3__Impl();

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
    // $ANTLR end "rule__Theorem__Group__3"


    // $ANTLR start "rule__Theorem__Group__3__Impl"
    // InternalTheory.g:2916:1: rule__Theorem__Group__3__Impl : ( ( rule__Theorem__PredicateAssignment_3 ) ) ;
    public final void rule__Theorem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2920:1: ( ( ( rule__Theorem__PredicateAssignment_3 ) ) )
            // InternalTheory.g:2921:1: ( ( rule__Theorem__PredicateAssignment_3 ) )
            {
            // InternalTheory.g:2921:1: ( ( rule__Theorem__PredicateAssignment_3 ) )
            // InternalTheory.g:2922:2: ( rule__Theorem__PredicateAssignment_3 )
            {
             before(grammarAccess.getTheoremAccess().getPredicateAssignment_3()); 
            // InternalTheory.g:2923:2: ( rule__Theorem__PredicateAssignment_3 )
            // InternalTheory.g:2923:3: rule__Theorem__PredicateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Theorem__PredicateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTheoremAccess().getPredicateAssignment_3()); 

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
    // $ANTLR end "rule__Theorem__Group__3__Impl"


    // $ANTLR start "rule__RuleBlock__Group__0"
    // InternalTheory.g:2932:1: rule__RuleBlock__Group__0 : rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 ;
    public final void rule__RuleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2936:1: ( rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1 )
            // InternalTheory.g:2937:2: rule__RuleBlock__Group__0__Impl rule__RuleBlock__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RuleBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__1();

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
    // $ANTLR end "rule__RuleBlock__Group__0"


    // $ANTLR start "rule__RuleBlock__Group__0__Impl"
    // InternalTheory.g:2944:1: rule__RuleBlock__Group__0__Impl : ( ( rule__RuleBlock__Group_0__0 )? ) ;
    public final void rule__RuleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2948:1: ( ( ( rule__RuleBlock__Group_0__0 )? ) )
            // InternalTheory.g:2949:1: ( ( rule__RuleBlock__Group_0__0 )? )
            {
            // InternalTheory.g:2949:1: ( ( rule__RuleBlock__Group_0__0 )? )
            // InternalTheory.g:2950:2: ( rule__RuleBlock__Group_0__0 )?
            {
             before(grammarAccess.getRuleBlockAccess().getGroup_0()); 
            // InternalTheory.g:2951:2: ( rule__RuleBlock__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTheory.g:2951:3: rule__RuleBlock__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleBlock__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleBlockAccess().getGroup_0()); 

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
    // $ANTLR end "rule__RuleBlock__Group__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group__1"
    // InternalTheory.g:2959:1: rule__RuleBlock__Group__1 : rule__RuleBlock__Group__1__Impl ;
    public final void rule__RuleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2963:1: ( rule__RuleBlock__Group__1__Impl )
            // InternalTheory.g:2964:2: rule__RuleBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group__1__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group__1"


    // $ANTLR start "rule__RuleBlock__Group__1__Impl"
    // InternalTheory.g:2970:1: rule__RuleBlock__Group__1__Impl : ( ( ( rule__RuleBlock__Group_1__0 ) ) ( ( rule__RuleBlock__Group_1__0 )* ) ) ;
    public final void rule__RuleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2974:1: ( ( ( ( rule__RuleBlock__Group_1__0 ) ) ( ( rule__RuleBlock__Group_1__0 )* ) ) )
            // InternalTheory.g:2975:1: ( ( ( rule__RuleBlock__Group_1__0 ) ) ( ( rule__RuleBlock__Group_1__0 )* ) )
            {
            // InternalTheory.g:2975:1: ( ( ( rule__RuleBlock__Group_1__0 ) ) ( ( rule__RuleBlock__Group_1__0 )* ) )
            // InternalTheory.g:2976:2: ( ( rule__RuleBlock__Group_1__0 ) ) ( ( rule__RuleBlock__Group_1__0 )* )
            {
            // InternalTheory.g:2976:2: ( ( rule__RuleBlock__Group_1__0 ) )
            // InternalTheory.g:2977:3: ( rule__RuleBlock__Group_1__0 )
            {
             before(grammarAccess.getRuleBlockAccess().getGroup_1()); 
            // InternalTheory.g:2978:3: ( rule__RuleBlock__Group_1__0 )
            // InternalTheory.g:2978:4: rule__RuleBlock__Group_1__0
            {
            pushFollow(FOLLOW_25);
            rule__RuleBlock__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getGroup_1()); 

            }

            // InternalTheory.g:2981:2: ( ( rule__RuleBlock__Group_1__0 )* )
            // InternalTheory.g:2982:3: ( rule__RuleBlock__Group_1__0 )*
            {
             before(grammarAccess.getRuleBlockAccess().getGroup_1()); 
            // InternalTheory.g:2983:3: ( rule__RuleBlock__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTheory.g:2983:4: rule__RuleBlock__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__RuleBlock__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRuleBlockAccess().getGroup_1()); 

            }


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
    // $ANTLR end "rule__RuleBlock__Group__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group_0__0"
    // InternalTheory.g:2993:1: rule__RuleBlock__Group_0__0 : rule__RuleBlock__Group_0__0__Impl rule__RuleBlock__Group_0__1 ;
    public final void rule__RuleBlock__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:2997:1: ( rule__RuleBlock__Group_0__0__Impl rule__RuleBlock__Group_0__1 )
            // InternalTheory.g:2998:2: rule__RuleBlock__Group_0__0__Impl rule__RuleBlock__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__RuleBlock__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_0__1();

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
    // $ANTLR end "rule__RuleBlock__Group_0__0"


    // $ANTLR start "rule__RuleBlock__Group_0__0__Impl"
    // InternalTheory.g:3005:1: rule__RuleBlock__Group_0__0__Impl : ( 'variables' ) ;
    public final void rule__RuleBlock__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3009:1: ( ( 'variables' ) )
            // InternalTheory.g:3010:1: ( 'variables' )
            {
            // InternalTheory.g:3010:1: ( 'variables' )
            // InternalTheory.g:3011:2: 'variables'
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getVariablesKeyword_0_0()); 

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
    // $ANTLR end "rule__RuleBlock__Group_0__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group_0__1"
    // InternalTheory.g:3020:1: rule__RuleBlock__Group_0__1 : rule__RuleBlock__Group_0__1__Impl ;
    public final void rule__RuleBlock__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3024:1: ( rule__RuleBlock__Group_0__1__Impl )
            // InternalTheory.g:3025:2: rule__RuleBlock__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_0__1__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group_0__1"


    // $ANTLR start "rule__RuleBlock__Group_0__1__Impl"
    // InternalTheory.g:3031:1: rule__RuleBlock__Group_0__1__Impl : ( ( ( rule__RuleBlock__VariablesAssignment_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_0_1 )* ) ) ;
    public final void rule__RuleBlock__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3035:1: ( ( ( ( rule__RuleBlock__VariablesAssignment_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_0_1 )* ) ) )
            // InternalTheory.g:3036:1: ( ( ( rule__RuleBlock__VariablesAssignment_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_0_1 )* ) )
            {
            // InternalTheory.g:3036:1: ( ( ( rule__RuleBlock__VariablesAssignment_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_0_1 )* ) )
            // InternalTheory.g:3037:2: ( ( rule__RuleBlock__VariablesAssignment_0_1 ) ) ( ( rule__RuleBlock__VariablesAssignment_0_1 )* )
            {
            // InternalTheory.g:3037:2: ( ( rule__RuleBlock__VariablesAssignment_0_1 ) )
            // InternalTheory.g:3038:3: ( rule__RuleBlock__VariablesAssignment_0_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesAssignment_0_1()); 
            // InternalTheory.g:3039:3: ( rule__RuleBlock__VariablesAssignment_0_1 )
            // InternalTheory.g:3039:4: rule__RuleBlock__VariablesAssignment_0_1
            {
            pushFollow(FOLLOW_7);
            rule__RuleBlock__VariablesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getVariablesAssignment_0_1()); 

            }

            // InternalTheory.g:3042:2: ( ( rule__RuleBlock__VariablesAssignment_0_1 )* )
            // InternalTheory.g:3043:3: ( rule__RuleBlock__VariablesAssignment_0_1 )*
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesAssignment_0_1()); 
            // InternalTheory.g:3044:3: ( rule__RuleBlock__VariablesAssignment_0_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTheory.g:3044:4: rule__RuleBlock__VariablesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RuleBlock__VariablesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRuleBlockAccess().getVariablesAssignment_0_1()); 

            }


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
    // $ANTLR end "rule__RuleBlock__Group_0__1__Impl"


    // $ANTLR start "rule__RuleBlock__Group_1__0"
    // InternalTheory.g:3054:1: rule__RuleBlock__Group_1__0 : rule__RuleBlock__Group_1__0__Impl rule__RuleBlock__Group_1__1 ;
    public final void rule__RuleBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3058:1: ( rule__RuleBlock__Group_1__0__Impl rule__RuleBlock__Group_1__1 )
            // InternalTheory.g:3059:2: rule__RuleBlock__Group_1__0__Impl rule__RuleBlock__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_1__1();

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
    // $ANTLR end "rule__RuleBlock__Group_1__0"


    // $ANTLR start "rule__RuleBlock__Group_1__0__Impl"
    // InternalTheory.g:3066:1: rule__RuleBlock__Group_1__0__Impl : ( 'rule' ) ;
    public final void rule__RuleBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3070:1: ( ( 'rule' ) )
            // InternalTheory.g:3071:1: ( 'rule' )
            {
            // InternalTheory.g:3071:1: ( 'rule' )
            // InternalTheory.g:3072:2: 'rule'
            {
             before(grammarAccess.getRuleBlockAccess().getRuleKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleBlockAccess().getRuleKeyword_1_0()); 

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
    // $ANTLR end "rule__RuleBlock__Group_1__0__Impl"


    // $ANTLR start "rule__RuleBlock__Group_1__1"
    // InternalTheory.g:3081:1: rule__RuleBlock__Group_1__1 : rule__RuleBlock__Group_1__1__Impl ;
    public final void rule__RuleBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3085:1: ( rule__RuleBlock__Group_1__1__Impl )
            // InternalTheory.g:3086:2: rule__RuleBlock__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__Group_1__1__Impl();

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
    // $ANTLR end "rule__RuleBlock__Group_1__1"


    // $ANTLR start "rule__RuleBlock__Group_1__1__Impl"
    // InternalTheory.g:3092:1: rule__RuleBlock__Group_1__1__Impl : ( ( rule__RuleBlock__RulesAssignment_1_1 ) ) ;
    public final void rule__RuleBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3096:1: ( ( ( rule__RuleBlock__RulesAssignment_1_1 ) ) )
            // InternalTheory.g:3097:1: ( ( rule__RuleBlock__RulesAssignment_1_1 ) )
            {
            // InternalTheory.g:3097:1: ( ( rule__RuleBlock__RulesAssignment_1_1 ) )
            // InternalTheory.g:3098:2: ( rule__RuleBlock__RulesAssignment_1_1 )
            {
             before(grammarAccess.getRuleBlockAccess().getRulesAssignment_1_1()); 
            // InternalTheory.g:3099:2: ( rule__RuleBlock__RulesAssignment_1_1 )
            // InternalTheory.g:3099:3: rule__RuleBlock__RulesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleBlock__RulesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleBlockAccess().getRulesAssignment_1_1()); 

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
    // $ANTLR end "rule__RuleBlock__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTheory.g:3108:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3112:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTheory.g:3113:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTheory.g:3120:1: rule__Rule__Group__0__Impl : ( '@' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3124:1: ( ( '@' ) )
            // InternalTheory.g:3125:1: ( '@' )
            {
            // InternalTheory.g:3125:1: ( '@' )
            // InternalTheory.g:3126:2: '@'
            {
             before(grammarAccess.getRuleAccess().getCommercialAtKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTheory.g:3135:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3139:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTheory.g:3140:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTheory.g:3147:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3151:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalTheory.g:3152:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalTheory.g:3152:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalTheory.g:3153:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalTheory.g:3154:2: ( rule__Rule__NameAssignment_1 )
            // InternalTheory.g:3154:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTheory.g:3162:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3166:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalTheory.g:3167:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTheory.g:3174:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3178:1: ( ( ':' ) )
            // InternalTheory.g:3179:1: ( ':' )
            {
            // InternalTheory.g:3179:1: ( ':' )
            // InternalTheory.g:3180:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalTheory.g:3189:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3193:1: ( rule__Rule__Group__3__Impl )
            // InternalTheory.g:3194:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalTheory.g:3200:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Alternatives_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3204:1: ( ( ( rule__Rule__Alternatives_3 ) ) )
            // InternalTheory.g:3205:1: ( ( rule__Rule__Alternatives_3 ) )
            {
            // InternalTheory.g:3205:1: ( ( rule__Rule__Alternatives_3 ) )
            // InternalTheory.g:3206:2: ( rule__Rule__Alternatives_3 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_3()); 
            // InternalTheory.g:3207:2: ( rule__Rule__Alternatives_3 )
            // InternalTheory.g:3207:3: rule__Rule__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTheory.g:3216:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3220:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTheory.g:3221:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTheory.g:3228:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3232:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalTheory.g:3233:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalTheory.g:3233:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalTheory.g:3234:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalTheory.g:3235:2: ( rule__Variable__NameAssignment_0 )
            // InternalTheory.g:3235:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalTheory.g:3243:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3247:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTheory.g:3248:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalTheory.g:3255:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3259:1: ( ( ':' ) )
            // InternalTheory.g:3260:1: ( ':' )
            {
            // InternalTheory.g:3260:1: ( ':' )
            // InternalTheory.g:3261:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_1()); 

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
    // InternalTheory.g:3270:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3274:1: ( rule__Variable__Group__2__Impl )
            // InternalTheory.g:3275:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

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
    // InternalTheory.g:3281:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3285:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalTheory.g:3286:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalTheory.g:3286:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalTheory.g:3287:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalTheory.g:3288:2: ( rule__Variable__TypeAssignment_2 )
            // InternalTheory.g:3288:3: rule__Variable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 

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


    // $ANTLR start "rule__RewriteRule__Group__0"
    // InternalTheory.g:3297:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3301:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // InternalTheory.g:3302:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RewriteRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__1();

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
    // $ANTLR end "rule__RewriteRule__Group__0"


    // $ANTLR start "rule__RewriteRule__Group__0__Impl"
    // InternalTheory.g:3309:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__PatternAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3313:1: ( ( ( rule__RewriteRule__PatternAssignment_0 ) ) )
            // InternalTheory.g:3314:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            {
            // InternalTheory.g:3314:1: ( ( rule__RewriteRule__PatternAssignment_0 ) )
            // InternalTheory.g:3315:2: ( rule__RewriteRule__PatternAssignment_0 )
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 
            // InternalTheory.g:3316:2: ( rule__RewriteRule__PatternAssignment_0 )
            // InternalTheory.g:3316:3: rule__RewriteRule__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0()); 

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
    // $ANTLR end "rule__RewriteRule__Group__0__Impl"


    // $ANTLR start "rule__RewriteRule__Group__1"
    // InternalTheory.g:3324:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3328:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // InternalTheory.g:3329:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RewriteRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__2();

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
    // $ANTLR end "rule__RewriteRule__Group__1"


    // $ANTLR start "rule__RewriteRule__Group__1__Impl"
    // InternalTheory.g:3336:1: rule__RewriteRule__Group__1__Impl : ( '==' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3340:1: ( ( '==' ) )
            // InternalTheory.g:3341:1: ( '==' )
            {
            // InternalTheory.g:3341:1: ( '==' )
            // InternalTheory.g:3342:2: '=='
            {
             before(grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRewriteRuleAccess().getEqualsSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__RewriteRule__Group__1__Impl"


    // $ANTLR start "rule__RewriteRule__Group__2"
    // InternalTheory.g:3351:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3355:1: ( rule__RewriteRule__Group__2__Impl )
            // InternalTheory.g:3356:2: rule__RewriteRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Group__2__Impl();

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
    // $ANTLR end "rule__RewriteRule__Group__2"


    // $ANTLR start "rule__RewriteRule__Group__2__Impl"
    // InternalTheory.g:3362:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__Alternatives_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3366:1: ( ( ( rule__RewriteRule__Alternatives_2 ) ) )
            // InternalTheory.g:3367:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            {
            // InternalTheory.g:3367:1: ( ( rule__RewriteRule__Alternatives_2 ) )
            // InternalTheory.g:3368:2: ( rule__RewriteRule__Alternatives_2 )
            {
             before(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 
            // InternalTheory.g:3369:2: ( rule__RewriteRule__Alternatives_2 )
            // InternalTheory.g:3369:3: rule__RewriteRule__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__RewriteRule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRewriteRuleAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__RewriteRule__Group__2__Impl"


    // $ANTLR start "rule__InferenceRule__Group__0"
    // InternalTheory.g:3378:1: rule__InferenceRule__Group__0 : rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 ;
    public final void rule__InferenceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3382:1: ( rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1 )
            // InternalTheory.g:3383:2: rule__InferenceRule__Group__0__Impl rule__InferenceRule__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__InferenceRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__1();

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
    // $ANTLR end "rule__InferenceRule__Group__0"


    // $ANTLR start "rule__InferenceRule__Group__0__Impl"
    // InternalTheory.g:3390:1: rule__InferenceRule__Group__0__Impl : ( ( rule__InferenceRule__GivenAssignment_0 )* ) ;
    public final void rule__InferenceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3394:1: ( ( ( rule__InferenceRule__GivenAssignment_0 )* ) )
            // InternalTheory.g:3395:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            {
            // InternalTheory.g:3395:1: ( ( rule__InferenceRule__GivenAssignment_0 )* )
            // InternalTheory.g:3396:2: ( rule__InferenceRule__GivenAssignment_0 )*
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 
            // InternalTheory.g:3397:2: ( rule__InferenceRule__GivenAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTheory.g:3397:3: rule__InferenceRule__GivenAssignment_0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__InferenceRule__GivenAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0()); 

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
    // $ANTLR end "rule__InferenceRule__Group__0__Impl"


    // $ANTLR start "rule__InferenceRule__Group__1"
    // InternalTheory.g:3405:1: rule__InferenceRule__Group__1 : rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 ;
    public final void rule__InferenceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3409:1: ( rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2 )
            // InternalTheory.g:3410:2: rule__InferenceRule__Group__1__Impl rule__InferenceRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__InferenceRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__2();

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
    // $ANTLR end "rule__InferenceRule__Group__1"


    // $ANTLR start "rule__InferenceRule__Group__1__Impl"
    // InternalTheory.g:3417:1: rule__InferenceRule__Group__1__Impl : ( '|-' ) ;
    public final void rule__InferenceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3421:1: ( ( '|-' ) )
            // InternalTheory.g:3422:1: ( '|-' )
            {
            // InternalTheory.g:3422:1: ( '|-' )
            // InternalTheory.g:3423:2: '|-'
            {
             before(grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInferenceRuleAccess().getVerticalLineHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__InferenceRule__Group__1__Impl"


    // $ANTLR start "rule__InferenceRule__Group__2"
    // InternalTheory.g:3432:1: rule__InferenceRule__Group__2 : rule__InferenceRule__Group__2__Impl ;
    public final void rule__InferenceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3436:1: ( rule__InferenceRule__Group__2__Impl )
            // InternalTheory.g:3437:2: rule__InferenceRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__Group__2__Impl();

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
    // $ANTLR end "rule__InferenceRule__Group__2"


    // $ANTLR start "rule__InferenceRule__Group__2__Impl"
    // InternalTheory.g:3443:1: rule__InferenceRule__Group__2__Impl : ( ( rule__InferenceRule__InferAssignment_2 ) ) ;
    public final void rule__InferenceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3447:1: ( ( ( rule__InferenceRule__InferAssignment_2 ) ) )
            // InternalTheory.g:3448:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            {
            // InternalTheory.g:3448:1: ( ( rule__InferenceRule__InferAssignment_2 ) )
            // InternalTheory.g:3449:2: ( rule__InferenceRule__InferAssignment_2 )
            {
             before(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 
            // InternalTheory.g:3450:2: ( rule__InferenceRule__InferAssignment_2 )
            // InternalTheory.g:3450:3: rule__InferenceRule__InferAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InferenceRule__InferAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInferenceRuleAccess().getInferAssignment_2()); 

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
    // $ANTLR end "rule__InferenceRule__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalTheory.g:3459:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3463:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalTheory.g:3464:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

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
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalTheory.g:3471:1: rule__Given__Group__0__Impl : ( ( rule__Given__ExpressionAssignment_0 ) ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3475:1: ( ( ( rule__Given__ExpressionAssignment_0 ) ) )
            // InternalTheory.g:3476:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            {
            // InternalTheory.g:3476:1: ( ( rule__Given__ExpressionAssignment_0 ) )
            // InternalTheory.g:3477:2: ( rule__Given__ExpressionAssignment_0 )
            {
             before(grammarAccess.getGivenAccess().getExpressionAssignment_0()); 
            // InternalTheory.g:3478:2: ( rule__Given__ExpressionAssignment_0 )
            // InternalTheory.g:3478:3: rule__Given__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Given__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalTheory.g:3486:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3490:1: ( rule__Given__Group__1__Impl )
            // InternalTheory.g:3491:2: rule__Given__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__1__Impl();

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
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalTheory.g:3497:1: rule__Given__Group__1__Impl : ( ( rule__Given__RequiredAssignment_1 )? ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3501:1: ( ( ( rule__Given__RequiredAssignment_1 )? ) )
            // InternalTheory.g:3502:1: ( ( rule__Given__RequiredAssignment_1 )? )
            {
            // InternalTheory.g:3502:1: ( ( rule__Given__RequiredAssignment_1 )? )
            // InternalTheory.g:3503:2: ( rule__Given__RequiredAssignment_1 )?
            {
             before(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 
            // InternalTheory.g:3504:2: ( rule__Given__RequiredAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTheory.g:3504:3: rule__Given__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getRequiredAssignment_1()); 

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
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewrite__Group__0"
    // InternalTheory.g:3513:1: rule__ConditionalRewrite__Group__0 : rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 ;
    public final void rule__ConditionalRewrite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3517:1: ( rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1 )
            // InternalTheory.g:3518:2: rule__ConditionalRewrite__Group__0__Impl rule__ConditionalRewrite__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalRewrite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__1();

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
    // $ANTLR end "rule__ConditionalRewrite__Group__0"


    // $ANTLR start "rule__ConditionalRewrite__Group__0__Impl"
    // InternalTheory.g:3525:1: rule__ConditionalRewrite__Group__0__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) ;
    public final void rule__ConditionalRewrite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3529:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) ) )
            // InternalTheory.g:3530:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            {
            // InternalTheory.g:3530:1: ( ( rule__ConditionalRewrite__RewritesAssignment_0 ) )
            // InternalTheory.g:3531:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 
            // InternalTheory.g:3532:2: ( rule__ConditionalRewrite__RewritesAssignment_0 )
            // InternalTheory.g:3532:3: rule__ConditionalRewrite__RewritesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__RewritesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0()); 

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
    // $ANTLR end "rule__ConditionalRewrite__Group__0__Impl"


    // $ANTLR start "rule__ConditionalRewrite__Group__1"
    // InternalTheory.g:3540:1: rule__ConditionalRewrite__Group__1 : rule__ConditionalRewrite__Group__1__Impl ;
    public final void rule__ConditionalRewrite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3544:1: ( rule__ConditionalRewrite__Group__1__Impl )
            // InternalTheory.g:3545:2: rule__ConditionalRewrite__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewrite__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionalRewrite__Group__1"


    // $ANTLR start "rule__ConditionalRewrite__Group__1__Impl"
    // InternalTheory.g:3551:1: rule__ConditionalRewrite__Group__1__Impl : ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) ;
    public final void rule__ConditionalRewrite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3555:1: ( ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* ) )
            // InternalTheory.g:3556:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            {
            // InternalTheory.g:3556:1: ( ( rule__ConditionalRewrite__RewritesAssignment_1 )* )
            // InternalTheory.g:3557:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 
            // InternalTheory.g:3558:2: ( rule__ConditionalRewrite__RewritesAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTheory.g:3558:3: rule__ConditionalRewrite__RewritesAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionalRewrite__RewritesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1()); 

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
    // $ANTLR end "rule__ConditionalRewrite__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__0"
    // InternalTheory.g:3567:1: rule__ConditionalRewriteRule__Group__0 : rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 ;
    public final void rule__ConditionalRewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3571:1: ( rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1 )
            // InternalTheory.g:3572:2: rule__ConditionalRewriteRule__Group__0__Impl rule__ConditionalRewriteRule__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ConditionalRewriteRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__1();

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__0"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__0__Impl"
    // InternalTheory.g:3579:1: rule__ConditionalRewriteRule__Group__0__Impl : ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3583:1: ( ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) ) )
            // InternalTheory.g:3584:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            {
            // InternalTheory.g:3584:1: ( ( rule__ConditionalRewriteRule__LhsAssignment_0 ) )
            // InternalTheory.g:3585:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0()); 
            // InternalTheory.g:3586:2: ( rule__ConditionalRewriteRule__LhsAssignment_0 )
            // InternalTheory.g:3586:3: rule__ConditionalRewriteRule__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__0__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__1"
    // InternalTheory.g:3594:1: rule__ConditionalRewriteRule__Group__1 : rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 ;
    public final void rule__ConditionalRewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3598:1: ( rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2 )
            // InternalTheory.g:3599:2: rule__ConditionalRewriteRule__Group__1__Impl rule__ConditionalRewriteRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalRewriteRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__2();

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__1"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__1__Impl"
    // InternalTheory.g:3606:1: rule__ConditionalRewriteRule__Group__1__Impl : ( '=>' ) ;
    public final void rule__ConditionalRewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3610:1: ( ( '=>' ) )
            // InternalTheory.g:3611:1: ( '=>' )
            {
            // InternalTheory.g:3611:1: ( '=>' )
            // InternalTheory.g:3612:2: '=>'
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__2"
    // InternalTheory.g:3621:1: rule__ConditionalRewriteRule__Group__2 : rule__ConditionalRewriteRule__Group__2__Impl ;
    public final void rule__ConditionalRewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3625:1: ( rule__ConditionalRewriteRule__Group__2__Impl )
            // InternalTheory.g:3626:2: rule__ConditionalRewriteRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__Group__2__Impl();

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__2"


    // $ANTLR start "rule__ConditionalRewriteRule__Group__2__Impl"
    // InternalTheory.g:3632:1: rule__ConditionalRewriteRule__Group__2__Impl : ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) ;
    public final void rule__ConditionalRewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3636:1: ( ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) ) )
            // InternalTheory.g:3637:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            {
            // InternalTheory.g:3637:1: ( ( rule__ConditionalRewriteRule__RhsAssignment_2 ) )
            // InternalTheory.g:3638:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 
            // InternalTheory.g:3639:2: ( rule__ConditionalRewriteRule__RhsAssignment_2 )
            // InternalTheory.g:3639:3: rule__ConditionalRewriteRule__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRewriteRule__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__Group__2__Impl"


    // $ANTLR start "rule__Operator__UnorderedGroup_2"
    // InternalTheory.g:3648:1: rule__Operator__UnorderedGroup_2 : ( rule__Operator__UnorderedGroup_2__0 )? ;
    public final void rule__Operator__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
        	
        try {
            // InternalTheory.g:3653:1: ( ( rule__Operator__UnorderedGroup_2__0 )? )
            // InternalTheory.g:3654:2: ( rule__Operator__UnorderedGroup_2__0 )?
            {
            // InternalTheory.g:3654:2: ( rule__Operator__UnorderedGroup_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 >= 11 && LA29_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTheory.g:3654:2: rule__Operator__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_2"


    // $ANTLR start "rule__Operator__UnorderedGroup_2__Impl"
    // InternalTheory.g:3662:1: rule__Operator__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__Operator__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTheory.g:3667:1: ( ( ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) ) ) )
            // InternalTheory.g:3668:3: ( ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) ) )
            {
            // InternalTheory.g:3668:3: ( ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 >= 11 && LA30_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                alt30=2;
            }
            else if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                alt30=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalTheory.g:3669:3: ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) )
                    {
                    // InternalTheory.g:3669:3: ({...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) ) )
                    // InternalTheory.g:3670:4: {...}? => ( ( ( rule__Operator__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalTheory.g:3670:104: ( ( ( rule__Operator__Group_2_0__0 ) ) )
                    // InternalTheory.g:3671:5: ( ( rule__Operator__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3677:5: ( ( rule__Operator__Group_2_0__0 ) )
                    // InternalTheory.g:3678:6: ( rule__Operator__Group_2_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2_0()); 
                    // InternalTheory.g:3679:6: ( rule__Operator__Group_2_0__0 )
                    // InternalTheory.g:3679:7: rule__Operator__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTheory.g:3684:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) )
                    {
                    // InternalTheory.g:3684:3: ({...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) ) )
                    // InternalTheory.g:3685:4: {...}? => ( ( ( rule__Operator__NotationAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalTheory.g:3685:104: ( ( ( rule__Operator__NotationAssignment_2_1 ) ) )
                    // InternalTheory.g:3686:5: ( ( rule__Operator__NotationAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3692:5: ( ( rule__Operator__NotationAssignment_2_1 ) )
                    // InternalTheory.g:3693:6: ( rule__Operator__NotationAssignment_2_1 )
                    {
                     before(grammarAccess.getOperatorAccess().getNotationAssignment_2_1()); 
                    // InternalTheory.g:3694:6: ( rule__Operator__NotationAssignment_2_1 )
                    // InternalTheory.g:3694:7: rule__Operator__NotationAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__NotationAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getNotationAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTheory.g:3699:3: ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) )
                    {
                    // InternalTheory.g:3699:3: ({...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) ) )
                    // InternalTheory.g:3700:4: {...}? => ( ( ( rule__Operator__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Operator__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalTheory.g:3700:104: ( ( ( rule__Operator__Group_2_2__0 ) ) )
                    // InternalTheory.g:3701:5: ( ( rule__Operator__Group_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTheory.g:3707:5: ( ( rule__Operator__Group_2_2__0 ) )
                    // InternalTheory.g:3708:6: ( rule__Operator__Group_2_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2_2()); 
                    // InternalTheory.g:3709:6: ( rule__Operator__Group_2_2__0 )
                    // InternalTheory.g:3709:7: rule__Operator__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperatorAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Operator__UnorderedGroup_2__0"
    // InternalTheory.g:3722:1: rule__Operator__UnorderedGroup_2__0 : rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__1 )? ;
    public final void rule__Operator__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3726:1: ( rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__1 )? )
            // InternalTheory.g:3727:2: rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__Operator__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalTheory.g:3728:2: ( rule__Operator__UnorderedGroup_2__1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 >= 11 && LA31_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTheory.g:3728:2: rule__Operator__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Operator__UnorderedGroup_2__0"


    // $ANTLR start "rule__Operator__UnorderedGroup_2__1"
    // InternalTheory.g:3734:1: rule__Operator__UnorderedGroup_2__1 : rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__2 )? ;
    public final void rule__Operator__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3738:1: ( rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__2 )? )
            // InternalTheory.g:3739:2: rule__Operator__UnorderedGroup_2__Impl ( rule__Operator__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_29);
            rule__Operator__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalTheory.g:3740:2: ( rule__Operator__UnorderedGroup_2__2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 >= 11 && LA32_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperatorAccess().getUnorderedGroup_2(), 2) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTheory.g:3740:2: rule__Operator__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Operator__UnorderedGroup_2__1"


    // $ANTLR start "rule__Operator__UnorderedGroup_2__2"
    // InternalTheory.g:3746:1: rule__Operator__UnorderedGroup_2__2 : rule__Operator__UnorderedGroup_2__Impl ;
    public final void rule__Operator__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3750:1: ( rule__Operator__UnorderedGroup_2__Impl )
            // InternalTheory.g:3751:2: rule__Operator__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__Operator__UnorderedGroup_2__2"


    // $ANTLR start "rule__Theory__NameAssignment_1"
    // InternalTheory.g:3758:1: rule__Theory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3762:1: ( ( RULE_ID ) )
            // InternalTheory.g:3763:2: ( RULE_ID )
            {
            // InternalTheory.g:3763:2: ( RULE_ID )
            // InternalTheory.g:3764:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Theory__NameAssignment_1"


    // $ANTLR start "rule__Theory__ParametersAssignment_2_1"
    // InternalTheory.g:3773:1: rule__Theory__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Theory__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3777:1: ( ( ruleParameter ) )
            // InternalTheory.g:3778:2: ( ruleParameter )
            {
            // InternalTheory.g:3778:2: ( ruleParameter )
            // InternalTheory.g:3779:3: ruleParameter
            {
             before(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getParametersParameterParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Theory__ParametersAssignment_2_1"


    // $ANTLR start "rule__Theory__ImportsAssignment_3_1"
    // InternalTheory.g:3788:1: rule__Theory__ImportsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3792:1: ( ( RULE_ID ) )
            // InternalTheory.g:3793:2: ( RULE_ID )
            {
            // InternalTheory.g:3793:2: ( RULE_ID )
            // InternalTheory.g:3794:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Theory__ImportsAssignment_3_1"


    // $ANTLR start "rule__Theory__ImportsAssignment_3_2"
    // InternalTheory.g:3803:1: rule__Theory__ImportsAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Theory__ImportsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3807:1: ( ( RULE_ID ) )
            // InternalTheory.g:3808:2: ( RULE_ID )
            {
            // InternalTheory.g:3808:2: ( RULE_ID )
            // InternalTheory.g:3809:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getImportsIDTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Theory__ImportsAssignment_3_2"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_0_1"
    // InternalTheory.g:3818:1: rule__Theory__InternalElementsAssignment_4_0_1 : ( ruleType ) ;
    public final void rule__Theory__InternalElementsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3822:1: ( ( ruleType ) )
            // InternalTheory.g:3823:2: ( ruleType )
            {
            // InternalTheory.g:3823:2: ( ruleType )
            // InternalTheory.g:3824:3: ruleType
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsTypeParserRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_0_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_1_1"
    // InternalTheory.g:3833:1: rule__Theory__InternalElementsAssignment_4_1_1 : ( ruleOperator ) ;
    public final void rule__Theory__InternalElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3837:1: ( ( ruleOperator ) )
            // InternalTheory.g:3838:2: ( ruleOperator )
            {
            // InternalTheory.g:3838:2: ( ruleOperator )
            // InternalTheory.g:3839:3: ruleOperator
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsOperatorParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_1_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_2_1"
    // InternalTheory.g:3848:1: rule__Theory__InternalElementsAssignment_4_2_1 : ( ruleAxiom ) ;
    public final void rule__Theory__InternalElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3852:1: ( ( ruleAxiom ) )
            // InternalTheory.g:3853:2: ( ruleAxiom )
            {
            // InternalTheory.g:3853:2: ( ruleAxiom )
            // InternalTheory.g:3854:3: ruleAxiom
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxiom();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsAxiomParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_2_1"


    // $ANTLR start "rule__Theory__InternalElementsAssignment_4_3_1"
    // InternalTheory.g:3863:1: rule__Theory__InternalElementsAssignment_4_3_1 : ( ruleTheorem ) ;
    public final void rule__Theory__InternalElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3867:1: ( ( ruleTheorem ) )
            // InternalTheory.g:3868:2: ( ruleTheorem )
            {
            // InternalTheory.g:3868:2: ( ruleTheorem )
            // InternalTheory.g:3869:3: ruleTheorem
            {
             before(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTheorem();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getInternalElementsTheoremParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Theory__InternalElementsAssignment_4_3_1"


    // $ANTLR start "rule__Theory__RuleBlocksAssignment_4_4_1"
    // InternalTheory.g:3878:1: rule__Theory__RuleBlocksAssignment_4_4_1 : ( ruleRuleBlock ) ;
    public final void rule__Theory__RuleBlocksAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3882:1: ( ( ruleRuleBlock ) )
            // InternalTheory.g:3883:2: ( ruleRuleBlock )
            {
            // InternalTheory.g:3883:2: ( ruleRuleBlock )
            // InternalTheory.g:3884:3: ruleRuleBlock
            {
             before(grammarAccess.getTheoryAccess().getRuleBlocksRuleBlockParserRuleCall_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBlock();

            state._fsp--;

             after(grammarAccess.getTheoryAccess().getRuleBlocksRuleBlockParserRuleCall_4_4_1_0()); 

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
    // $ANTLR end "rule__Theory__RuleBlocksAssignment_4_4_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalTheory.g:3893:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3897:1: ( ( RULE_ID ) )
            // InternalTheory.g:3898:2: ( RULE_ID )
            {
            // InternalTheory.g:3898:2: ( RULE_ID )
            // InternalTheory.g:3899:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // InternalTheory.g:3908:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3912:1: ( ( RULE_ID ) )
            // InternalTheory.g:3913:2: ( RULE_ID )
            {
            // InternalTheory.g:3913:2: ( RULE_ID )
            // InternalTheory.g:3914:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Type__ParametersAssignment_1_1"
    // InternalTheory.g:3923:1: rule__Type__ParametersAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Type__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3927:1: ( ( ( RULE_ID ) ) )
            // InternalTheory.g:3928:2: ( ( RULE_ID ) )
            {
            // InternalTheory.g:3928:2: ( ( RULE_ID ) )
            // InternalTheory.g:3929:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeAccess().getParametersParameterCrossReference_1_1_0()); 
            // InternalTheory.g:3930:3: ( RULE_ID )
            // InternalTheory.g:3931:4: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getParametersParameterIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getParametersParameterIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeAccess().getParametersParameterCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Type__ParametersAssignment_1_1"


    // $ANTLR start "rule__Type__ConstructorsAssignment_3"
    // InternalTheory.g:3942:1: rule__Type__ConstructorsAssignment_3 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3946:1: ( ( ruleConstructor ) )
            // InternalTheory.g:3947:2: ( ruleConstructor )
            {
            // InternalTheory.g:3947:2: ( ruleConstructor )
            // InternalTheory.g:3948:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Type__ConstructorsAssignment_3"


    // $ANTLR start "rule__Type__ConstructorsAssignment_4_1"
    // InternalTheory.g:3957:1: rule__Type__ConstructorsAssignment_4_1 : ( ruleConstructor ) ;
    public final void rule__Type__ConstructorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3961:1: ( ( ruleConstructor ) )
            // InternalTheory.g:3962:2: ( ruleConstructor )
            {
            // InternalTheory.g:3962:2: ( ruleConstructor )
            // InternalTheory.g:3963:3: ruleConstructor
            {
             before(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getConstructorsConstructorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Type__ConstructorsAssignment_4_1"


    // $ANTLR start "rule__Constructor__NameAssignment_0"
    // InternalTheory.g:3972:1: rule__Constructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3976:1: ( ( RULE_ID ) )
            // InternalTheory.g:3977:2: ( RULE_ID )
            {
            // InternalTheory.g:3977:2: ( RULE_ID )
            // InternalTheory.g:3978:3: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Constructor__NameAssignment_0"


    // $ANTLR start "rule__Constructor__DestructorsAssignment_1_1"
    // InternalTheory.g:3987:1: rule__Constructor__DestructorsAssignment_1_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:3991:1: ( ( ruleDestructor ) )
            // InternalTheory.g:3992:2: ( ruleDestructor )
            {
            // InternalTheory.g:3992:2: ( ruleDestructor )
            // InternalTheory.g:3993:3: ruleDestructor
            {
             before(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Constructor__DestructorsAssignment_1_1"


    // $ANTLR start "rule__Constructor__DestructorsAssignment_1_2_1"
    // InternalTheory.g:4002:1: rule__Constructor__DestructorsAssignment_1_2_1 : ( ruleDestructor ) ;
    public final void rule__Constructor__DestructorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4006:1: ( ( ruleDestructor ) )
            // InternalTheory.g:4007:2: ( ruleDestructor )
            {
            // InternalTheory.g:4007:2: ( ruleDestructor )
            // InternalTheory.g:4008:3: ruleDestructor
            {
             before(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestructor();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getDestructorsDestructorParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Constructor__DestructorsAssignment_1_2_1"


    // $ANTLR start "rule__Destructor__NameAssignment_0"
    // InternalTheory.g:4017:1: rule__Destructor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Destructor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4021:1: ( ( RULE_ID ) )
            // InternalTheory.g:4022:2: ( RULE_ID )
            {
            // InternalTheory.g:4022:2: ( RULE_ID )
            // InternalTheory.g:4023:3: RULE_ID
            {
             before(grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Destructor__NameAssignment_0"


    // $ANTLR start "rule__Destructor__TypeAssignment_2"
    // InternalTheory.g:4032:1: rule__Destructor__TypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Destructor__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4036:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4037:2: ( RULE_STRING )
            {
            // InternalTheory.g:4037:2: ( RULE_STRING )
            // InternalTheory.g:4038:3: RULE_STRING
            {
             before(grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDestructorAccess().getTypeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Destructor__TypeAssignment_2"


    // $ANTLR start "rule__Operator__NameAssignment_0"
    // InternalTheory.g:4047:1: rule__Operator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4051:1: ( ( RULE_ID ) )
            // InternalTheory.g:4052:2: ( RULE_ID )
            {
            // InternalTheory.g:4052:2: ( RULE_ID )
            // InternalTheory.g:4053:3: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Operator__NameAssignment_0"


    // $ANTLR start "rule__Operator__ArgumentsAssignment_1_1"
    // InternalTheory.g:4062:1: rule__Operator__ArgumentsAssignment_1_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4066:1: ( ( ruleArgument ) )
            // InternalTheory.g:4067:2: ( ruleArgument )
            {
            // InternalTheory.g:4067:2: ( ruleArgument )
            // InternalTheory.g:4068:3: ruleArgument
            {
             before(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Operator__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__Operator__ArgumentsAssignment_1_2_1"
    // InternalTheory.g:4077:1: rule__Operator__ArgumentsAssignment_1_2_1 : ( ruleArgument ) ;
    public final void rule__Operator__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4081:1: ( ( ruleArgument ) )
            // InternalTheory.g:4082:2: ( ruleArgument )
            {
            // InternalTheory.g:4082:2: ( ruleArgument )
            // InternalTheory.g:4083:3: ruleArgument
            {
             before(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getArgumentsArgumentParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Operator__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__Operator__TypeAssignment_2_0_1"
    // InternalTheory.g:4092:1: rule__Operator__TypeAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__Operator__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4096:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4097:2: ( RULE_STRING )
            {
            // InternalTheory.g:4097:2: ( RULE_STRING )
            // InternalTheory.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getTypeSTRINGTerminalRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Operator__TypeAssignment_2_0_1"


    // $ANTLR start "rule__Operator__NotationAssignment_2_1"
    // InternalTheory.g:4107:1: rule__Operator__NotationAssignment_2_1 : ( ruleNotation ) ;
    public final void rule__Operator__NotationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4111:1: ( ( ruleNotation ) )
            // InternalTheory.g:4112:2: ( ruleNotation )
            {
            // InternalTheory.g:4112:2: ( ruleNotation )
            // InternalTheory.g:4113:3: ruleNotation
            {
             before(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNotation();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getNotationNotationEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Operator__NotationAssignment_2_1"


    // $ANTLR start "rule__Operator__AssociativeAssignment_2_2_0"
    // InternalTheory.g:4122:1: rule__Operator__AssociativeAssignment_2_2_0 : ( ( 'associative' ) ) ;
    public final void rule__Operator__AssociativeAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4126:1: ( ( ( 'associative' ) ) )
            // InternalTheory.g:4127:2: ( ( 'associative' ) )
            {
            // InternalTheory.g:4127:2: ( ( 'associative' ) )
            // InternalTheory.g:4128:3: ( 'associative' )
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_2_2_0_0()); 
            // InternalTheory.g:4129:3: ( 'associative' )
            // InternalTheory.g:4130:4: 'associative'
            {
             before(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_2_2_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_2_2_0_0()); 

            }

             after(grammarAccess.getOperatorAccess().getAssociativeAssociativeKeyword_2_2_0_0()); 

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
    // $ANTLR end "rule__Operator__AssociativeAssignment_2_2_0"


    // $ANTLR start "rule__Operator__CommutativeAssignment_2_2_1"
    // InternalTheory.g:4141:1: rule__Operator__CommutativeAssignment_2_2_1 : ( ( 'commutative' ) ) ;
    public final void rule__Operator__CommutativeAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4145:1: ( ( ( 'commutative' ) ) )
            // InternalTheory.g:4146:2: ( ( 'commutative' ) )
            {
            // InternalTheory.g:4146:2: ( ( 'commutative' ) )
            // InternalTheory.g:4147:3: ( 'commutative' )
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_2_2_1_0()); 
            // InternalTheory.g:4148:3: ( 'commutative' )
            // InternalTheory.g:4149:4: 'commutative'
            {
             before(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_2_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_2_2_1_0()); 

            }

             after(grammarAccess.getOperatorAccess().getCommutativeCommutativeKeyword_2_2_1_0()); 

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
    // $ANTLR end "rule__Operator__CommutativeAssignment_2_2_1"


    // $ANTLR start "rule__Operator__PrecedentAssignment_3_1"
    // InternalTheory.g:4160:1: rule__Operator__PrecedentAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Operator__PrecedentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4164:1: ( ( RULE_INT ) )
            // InternalTheory.g:4165:2: ( RULE_INT )
            {
            // InternalTheory.g:4165:2: ( RULE_INT )
            // InternalTheory.g:4166:3: RULE_INT
            {
             before(grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getPrecedentINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Operator__PrecedentAssignment_3_1"


    // $ANTLR start "rule__Operator__WdAssignment_4_1"
    // InternalTheory.g:4175:1: rule__Operator__WdAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Operator__WdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4179:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4180:2: ( RULE_STRING )
            {
            // InternalTheory.g:4180:2: ( RULE_STRING )
            // InternalTheory.g:4181:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getWdSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Operator__WdAssignment_4_1"


    // $ANTLR start "rule__Operator__DefinitionAssignment_5_1_0"
    // InternalTheory.g:4190:1: rule__Operator__DefinitionAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__Operator__DefinitionAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4194:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4195:2: ( RULE_STRING )
            {
            // InternalTheory.g:4195:2: ( RULE_STRING )
            // InternalTheory.g:4196:3: RULE_STRING
            {
             before(grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getDefinitionSTRINGTerminalRuleCall_5_1_0_0()); 

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
    // $ANTLR end "rule__Operator__DefinitionAssignment_5_1_0"


    // $ANTLR start "rule__Operator__CaseAssignment_5_1_1_1"
    // InternalTheory.g:4205:1: rule__Operator__CaseAssignment_5_1_1_1 : ( RULE_ID ) ;
    public final void rule__Operator__CaseAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4209:1: ( ( RULE_ID ) )
            // InternalTheory.g:4210:2: ( RULE_ID )
            {
            // InternalTheory.g:4210:2: ( RULE_ID )
            // InternalTheory.g:4211:3: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_5_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getCaseIDTerminalRuleCall_5_1_1_1_0()); 

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
    // $ANTLR end "rule__Operator__CaseAssignment_5_1_1_1"


    // $ANTLR start "rule__Operator__CasesAssignment_5_1_1_2"
    // InternalTheory.g:4220:1: rule__Operator__CasesAssignment_5_1_1_2 : ( ruleCase ) ;
    public final void rule__Operator__CasesAssignment_5_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4224:1: ( ( ruleCase ) )
            // InternalTheory.g:4225:2: ( ruleCase )
            {
            // InternalTheory.g:4225:2: ( ruleCase )
            // InternalTheory.g:4226:3: ruleCase
            {
             before(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_5_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getCasesCaseParserRuleCall_5_1_1_2_0()); 

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
    // $ANTLR end "rule__Operator__CasesAssignment_5_1_1_2"


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalTheory.g:4235:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4239:1: ( ( RULE_ID ) )
            // InternalTheory.g:4240:2: ( RULE_ID )
            {
            // InternalTheory.g:4240:2: ( RULE_ID )
            // InternalTheory.g:4241:3: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Argument__NameAssignment_0"


    // $ANTLR start "rule__Argument__TypeAssignment_2"
    // InternalTheory.g:4250:1: rule__Argument__TypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4254:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4255:2: ( RULE_STRING )
            {
            // InternalTheory.g:4255:2: ( RULE_STRING )
            // InternalTheory.g:4256:3: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getTypeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Argument__TypeAssignment_2"


    // $ANTLR start "rule__Case__PatternAssignment_0"
    // InternalTheory.g:4265:1: rule__Case__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Case__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4269:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4270:2: ( RULE_STRING )
            {
            // InternalTheory.g:4270:2: ( RULE_STRING )
            // InternalTheory.g:4271:3: RULE_STRING
            {
             before(grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getPatternSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Case__PatternAssignment_0"


    // $ANTLR start "rule__Case__FormulaAssignment_2"
    // InternalTheory.g:4280:1: rule__Case__FormulaAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Case__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4284:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4285:2: ( RULE_STRING )
            {
            // InternalTheory.g:4285:2: ( RULE_STRING )
            // InternalTheory.g:4286:3: RULE_STRING
            {
             before(grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCaseAccess().getFormulaSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Case__FormulaAssignment_2"


    // $ANTLR start "rule__Axiom__NameAssignment_1"
    // InternalTheory.g:4295:1: rule__Axiom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Axiom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4299:1: ( ( RULE_ID ) )
            // InternalTheory.g:4300:2: ( RULE_ID )
            {
            // InternalTheory.g:4300:2: ( RULE_ID )
            // InternalTheory.g:4301:3: RULE_ID
            {
             before(grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Axiom__NameAssignment_1"


    // $ANTLR start "rule__Axiom__PredicateAssignment_3"
    // InternalTheory.g:4310:1: rule__Axiom__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Axiom__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4314:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4315:2: ( RULE_STRING )
            {
            // InternalTheory.g:4315:2: ( RULE_STRING )
            // InternalTheory.g:4316:3: RULE_STRING
            {
             before(grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAxiomAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Axiom__PredicateAssignment_3"


    // $ANTLR start "rule__Theorem__NameAssignment_1"
    // InternalTheory.g:4325:1: rule__Theorem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theorem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4329:1: ( ( RULE_ID ) )
            // InternalTheory.g:4330:2: ( RULE_ID )
            {
            // InternalTheory.g:4330:2: ( RULE_ID )
            // InternalTheory.g:4331:3: RULE_ID
            {
             before(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Theorem__NameAssignment_1"


    // $ANTLR start "rule__Theorem__PredicateAssignment_3"
    // InternalTheory.g:4340:1: rule__Theorem__PredicateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Theorem__PredicateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4344:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4345:2: ( RULE_STRING )
            {
            // InternalTheory.g:4345:2: ( RULE_STRING )
            // InternalTheory.g:4346:3: RULE_STRING
            {
             before(grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTheoremAccess().getPredicateSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Theorem__PredicateAssignment_3"


    // $ANTLR start "rule__RuleBlock__VariablesAssignment_0_1"
    // InternalTheory.g:4355:1: rule__RuleBlock__VariablesAssignment_0_1 : ( ruleVariable ) ;
    public final void rule__RuleBlock__VariablesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4359:1: ( ( ruleVariable ) )
            // InternalTheory.g:4360:2: ( ruleVariable )
            {
            // InternalTheory.g:4360:2: ( ruleVariable )
            // InternalTheory.g:4361:3: ruleVariable
            {
             before(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getRuleBlockAccess().getVariablesVariableParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RuleBlock__VariablesAssignment_0_1"


    // $ANTLR start "rule__RuleBlock__RulesAssignment_1_1"
    // InternalTheory.g:4370:1: rule__RuleBlock__RulesAssignment_1_1 : ( ruleRule ) ;
    public final void rule__RuleBlock__RulesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4374:1: ( ( ruleRule ) )
            // InternalTheory.g:4375:2: ( ruleRule )
            {
            // InternalTheory.g:4375:2: ( ruleRule )
            // InternalTheory.g:4376:3: ruleRule
            {
             before(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleBlockAccess().getRulesRuleParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RuleBlock__RulesAssignment_1_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalTheory.g:4385:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4389:1: ( ( RULE_ID ) )
            // InternalTheory.g:4390:2: ( RULE_ID )
            {
            // InternalTheory.g:4390:2: ( RULE_ID )
            // InternalTheory.g:4391:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__RruleAssignment_3_0"
    // InternalTheory.g:4400:1: rule__Rule__RruleAssignment_3_0 : ( ruleRewriteRule ) ;
    public final void rule__Rule__RruleAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4404:1: ( ( ruleRewriteRule ) )
            // InternalTheory.g:4405:2: ( ruleRewriteRule )
            {
            // InternalTheory.g:4405:2: ( ruleRewriteRule )
            // InternalTheory.g:4406:3: ruleRewriteRule
            {
             before(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRewriteRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRruleRewriteRuleParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Rule__RruleAssignment_3_0"


    // $ANTLR start "rule__Rule__IruleAssignment_3_1"
    // InternalTheory.g:4415:1: rule__Rule__IruleAssignment_3_1 : ( ruleInferenceRule ) ;
    public final void rule__Rule__IruleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4419:1: ( ( ruleInferenceRule ) )
            // InternalTheory.g:4420:2: ( ruleInferenceRule )
            {
            // InternalTheory.g:4420:2: ( ruleInferenceRule )
            // InternalTheory.g:4421:3: ruleInferenceRule
            {
             before(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInferenceRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getIruleInferenceRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Rule__IruleAssignment_3_1"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalTheory.g:4430:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4434:1: ( ( RULE_ID ) )
            // InternalTheory.g:4435:2: ( RULE_ID )
            {
            // InternalTheory.g:4435:2: ( RULE_ID )
            // InternalTheory.g:4436:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__TypeAssignment_2"
    // InternalTheory.g:4445:1: rule__Variable__TypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4449:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4450:2: ( RULE_STRING )
            {
            // InternalTheory.g:4450:2: ( RULE_STRING )
            // InternalTheory.g:4451:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTypeSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable__TypeAssignment_2"


    // $ANTLR start "rule__RewriteRule__PatternAssignment_0"
    // InternalTheory.g:4460:1: rule__RewriteRule__PatternAssignment_0 : ( RULE_STRING ) ;
    public final void rule__RewriteRule__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4464:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4465:2: ( RULE_STRING )
            {
            // InternalTheory.g:4465:2: ( RULE_STRING )
            // InternalTheory.g:4466:3: RULE_STRING
            {
             before(grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRewriteRuleAccess().getPatternSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RewriteRule__PatternAssignment_0"


    // $ANTLR start "rule__RewriteRule__UruleAssignment_2_0"
    // InternalTheory.g:4475:1: rule__RewriteRule__UruleAssignment_2_0 : ( ruleUnconditionalRewrite ) ;
    public final void rule__RewriteRule__UruleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4479:1: ( ( ruleUnconditionalRewrite ) )
            // InternalTheory.g:4480:2: ( ruleUnconditionalRewrite )
            {
            // InternalTheory.g:4480:2: ( ruleUnconditionalRewrite )
            // InternalTheory.g:4481:3: ruleUnconditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnconditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getUruleUnconditionalRewriteParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__RewriteRule__UruleAssignment_2_0"


    // $ANTLR start "rule__RewriteRule__CruleAssignment_2_1"
    // InternalTheory.g:4490:1: rule__RewriteRule__CruleAssignment_2_1 : ( ruleConditionalRewrite ) ;
    public final void rule__RewriteRule__CruleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4494:1: ( ( ruleConditionalRewrite ) )
            // InternalTheory.g:4495:2: ( ruleConditionalRewrite )
            {
            // InternalTheory.g:4495:2: ( ruleConditionalRewrite )
            // InternalTheory.g:4496:3: ruleConditionalRewrite
            {
             before(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewrite();

            state._fsp--;

             after(grammarAccess.getRewriteRuleAccess().getCruleConditionalRewriteParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RewriteRule__CruleAssignment_2_1"


    // $ANTLR start "rule__InferenceRule__GivenAssignment_0"
    // InternalTheory.g:4505:1: rule__InferenceRule__GivenAssignment_0 : ( ruleGiven ) ;
    public final void rule__InferenceRule__GivenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4509:1: ( ( ruleGiven ) )
            // InternalTheory.g:4510:2: ( ruleGiven )
            {
            // InternalTheory.g:4510:2: ( ruleGiven )
            // InternalTheory.g:4511:3: ruleGiven
            {
             before(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getInferenceRuleAccess().getGivenGivenParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__InferenceRule__GivenAssignment_0"


    // $ANTLR start "rule__InferenceRule__InferAssignment_2"
    // InternalTheory.g:4520:1: rule__InferenceRule__InferAssignment_2 : ( ruleInfer ) ;
    public final void rule__InferenceRule__InferAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4524:1: ( ( ruleInfer ) )
            // InternalTheory.g:4525:2: ( ruleInfer )
            {
            // InternalTheory.g:4525:2: ( ruleInfer )
            // InternalTheory.g:4526:3: ruleInfer
            {
             before(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInfer();

            state._fsp--;

             after(grammarAccess.getInferenceRuleAccess().getInferInferParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__InferenceRule__InferAssignment_2"


    // $ANTLR start "rule__Given__ExpressionAssignment_0"
    // InternalTheory.g:4535:1: rule__Given__ExpressionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Given__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4539:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4540:2: ( RULE_STRING )
            {
            // InternalTheory.g:4540:2: ( RULE_STRING )
            // InternalTheory.g:4541:3: RULE_STRING
            {
             before(grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getExpressionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Given__ExpressionAssignment_0"


    // $ANTLR start "rule__Given__RequiredAssignment_1"
    // InternalTheory.g:4550:1: rule__Given__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Given__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4554:1: ( ( ( 'required' ) ) )
            // InternalTheory.g:4555:2: ( ( 'required' ) )
            {
            // InternalTheory.g:4555:2: ( ( 'required' ) )
            // InternalTheory.g:4556:3: ( 'required' )
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalTheory.g:4557:3: ( 'required' )
            // InternalTheory.g:4558:4: 'required'
            {
             before(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getGivenAccess().getRequiredRequiredKeyword_1_0()); 

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
    // $ANTLR end "rule__Given__RequiredAssignment_1"


    // $ANTLR start "rule__Infer__ExpressionAssignment"
    // InternalTheory.g:4569:1: rule__Infer__ExpressionAssignment : ( RULE_STRING ) ;
    public final void rule__Infer__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4573:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4574:2: ( RULE_STRING )
            {
            // InternalTheory.g:4574:2: ( RULE_STRING )
            // InternalTheory.g:4575:3: RULE_STRING
            {
             before(grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInferAccess().getExpressionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Infer__ExpressionAssignment"


    // $ANTLR start "rule__UnconditionalRewrite__RhsAssignment"
    // InternalTheory.g:4584:1: rule__UnconditionalRewrite__RhsAssignment : ( RULE_STRING ) ;
    public final void rule__UnconditionalRewrite__RhsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4588:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4589:2: ( RULE_STRING )
            {
            // InternalTheory.g:4589:2: ( RULE_STRING )
            // InternalTheory.g:4590:3: RULE_STRING
            {
             before(grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnconditionalRewriteAccess().getRhsSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__UnconditionalRewrite__RhsAssignment"


    // $ANTLR start "rule__ConditionalRewrite__RewritesAssignment_0"
    // InternalTheory.g:4599:1: rule__ConditionalRewrite__RewritesAssignment_0 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4603:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:4604:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:4604:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:4605:3: ruleConditionalRewriteRule
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalRewrite__RewritesAssignment_0"


    // $ANTLR start "rule__ConditionalRewrite__RewritesAssignment_1"
    // InternalTheory.g:4614:1: rule__ConditionalRewrite__RewritesAssignment_1 : ( ruleConditionalRewriteRule ) ;
    public final void rule__ConditionalRewrite__RewritesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4618:1: ( ( ruleConditionalRewriteRule ) )
            // InternalTheory.g:4619:2: ( ruleConditionalRewriteRule )
            {
            // InternalTheory.g:4619:2: ( ruleConditionalRewriteRule )
            // InternalTheory.g:4620:3: ruleConditionalRewriteRule
            {
             before(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalRewriteRule();

            state._fsp--;

             after(grammarAccess.getConditionalRewriteAccess().getRewritesConditionalRewriteRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionalRewrite__RewritesAssignment_1"


    // $ANTLR start "rule__ConditionalRewriteRule__LhsAssignment_0"
    // InternalTheory.g:4629:1: rule__ConditionalRewriteRule__LhsAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4633:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4634:2: ( RULE_STRING )
            {
            // InternalTheory.g:4634:2: ( RULE_STRING )
            // InternalTheory.g:4635:3: RULE_STRING
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getLhsSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__LhsAssignment_0"


    // $ANTLR start "rule__ConditionalRewriteRule__RhsAssignment_2"
    // InternalTheory.g:4644:1: rule__ConditionalRewriteRule__RhsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConditionalRewriteRule__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheory.g:4648:1: ( ( RULE_STRING ) )
            // InternalTheory.g:4649:2: ( RULE_STRING )
            {
            // InternalTheory.g:4649:2: ( RULE_STRING )
            // InternalTheory.g:4650:3: RULE_STRING
            {
             before(grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRewriteRuleAccess().getRhsSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConditionalRewriteRule__RhsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FD8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002008013800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000031000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002008003802L});

}
