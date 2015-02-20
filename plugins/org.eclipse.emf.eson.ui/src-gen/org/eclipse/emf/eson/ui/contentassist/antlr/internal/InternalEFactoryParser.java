package org.eclipse.emf.eson.ui.contentassist.antlr.internal; 

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
import org.eclipse.emf.eson.services.EFactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEFactoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LONG_ID", "RULE_LONG_UNSIGNED", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'use'", "'.*'", "'import'", "':'", "'{'", "'}'", "'['", "']'", "'.'", "'-'", "'NULL'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_LONG_UNSIGNED=6;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_LONG_ID=5;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalEFactoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEFactoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEFactoryParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g"; }


     
     	private EFactoryGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EFactoryGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleFactory"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:61:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:62:1: ( ruleFactory EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:63:1: ruleFactory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryRule()); 
            }
            pushFollow(FOLLOW_ruleFactory_in_entryRuleFactory67);
            ruleFactory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactory74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:70:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:74:2: ( ( ( rule__Factory__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:75:1: ( ( rule__Factory__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:75:1: ( ( rule__Factory__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:76:1: ( rule__Factory__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:77:1: ( rule__Factory__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:77:2: rule__Factory__Group__0
            {
            pushFollow(FOLLOW_rule__Factory__Group__0_in_ruleFactory100);
            rule__Factory__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getGroup()); 
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
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRulePackageImport"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:89:1: entryRulePackageImport : rulePackageImport EOF ;
    public final void entryRulePackageImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:90:1: ( rulePackageImport EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:91:1: rulePackageImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportRule()); 
            }
            pushFollow(FOLLOW_rulePackageImport_in_entryRulePackageImport127);
            rulePackageImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageImport"


    // $ANTLR start "rulePackageImport"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:98:1: rulePackageImport : ( ( rule__PackageImport__Group__0 ) ) ;
    public final void rulePackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:102:2: ( ( ( rule__PackageImport__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:103:1: ( ( rule__PackageImport__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:103:1: ( ( rule__PackageImport__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:104:1: ( rule__PackageImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:105:1: ( rule__PackageImport__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:105:2: rule__PackageImport__Group__0
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__0_in_rulePackageImport160);
            rule__PackageImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getGroup()); 
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
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleNamespaceImport"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:117:1: entryRuleNamespaceImport : ruleNamespaceImport EOF ;
    public final void entryRuleNamespaceImport() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:118:1: ( ruleNamespaceImport EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:119:1: ruleNamespaceImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportRule()); 
            }
            pushFollow(FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport187);
            ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceImport194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:126:1: ruleNamespaceImport : ( ( rule__NamespaceImport__Group__0 ) ) ;
    public final void ruleNamespaceImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:130:2: ( ( ( rule__NamespaceImport__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:131:1: ( ( rule__NamespaceImport__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:131:1: ( ( rule__NamespaceImport__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:132:1: ( rule__NamespaceImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:133:1: ( rule__NamespaceImport__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:133:2: rule__NamespaceImport__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceImport__Group__0_in_ruleNamespaceImport220);
            rule__NamespaceImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getGroup()); 
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
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleFeature"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:145:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:146:1: ( ruleFeature EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:147:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature247);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:154:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:158:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ( rule__Feature__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:160:1: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:161:1: ( rule__Feature__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:161:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature280);
            rule__Feature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getGroup()); 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNewObject"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:173:1: entryRuleNewObject : ruleNewObject EOF ;
    public final void entryRuleNewObject() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:174:1: ( ruleNewObject EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:175:1: ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject307);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNewObject"


    // $ANTLR start "ruleNewObject"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:182:1: ruleNewObject : ( ( rule__NewObject__Group__0 ) ) ;
    public final void ruleNewObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:186:2: ( ( ( rule__NewObject__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__NewObject__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__NewObject__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:188:1: ( rule__NewObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:1: ( rule__NewObject__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:2: rule__NewObject__Group__0
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0_in_ruleNewObject340);
            rule__NewObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getGroup()); 
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
    // $ANTLR end "ruleNewObject"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:201:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:202:1: ( ruleValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:203:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue367);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:210:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:214:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:216:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:1: ( rule__Value__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue400);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMultiValue"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:229:1: entryRuleMultiValue : ruleMultiValue EOF ;
    public final void entryRuleMultiValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:230:1: ( ruleMultiValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:231:1: ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValue_in_entryRuleMultiValue427);
            ruleMultiValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValue434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiValue"


    // $ANTLR start "ruleMultiValue"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:238:1: ruleMultiValue : ( ( rule__MultiValue__Group__0 ) ) ;
    public final void ruleMultiValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:242:2: ( ( ( rule__MultiValue__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__MultiValue__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__MultiValue__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:244:1: ( rule__MultiValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:1: ( rule__MultiValue__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:2: rule__MultiValue__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue460);
            rule__MultiValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiValue"


    // $ANTLR start "entryRuleReference"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:257:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:258:1: ( ruleReference EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:259:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference487);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:266:1: ruleReference : ( ( rule__Reference__ValueAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:270:2: ( ( ( rule__Reference__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__Reference__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__Reference__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:272:1: ( rule__Reference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:1: ( rule__Reference__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:2: rule__Reference__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ValueAssignment_in_ruleReference520);
            rule__Reference__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:285:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:286:1: ( ruleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:287:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute547);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:294:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:298:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:300:1: ( rule__Attribute__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:1: ( rule__Attribute__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute580);
            rule__Attribute__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEnumAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:313:1: entryRuleEnumAttribute : ruleEnumAttribute EOF ;
    public final void entryRuleEnumAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:314:1: ( ruleEnumAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:315:1: ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute607);
            ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAttribute614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumAttribute"


    // $ANTLR start "ruleEnumAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:322:1: ruleEnumAttribute : ( ( rule__EnumAttribute__Group__0 ) ) ;
    public final void ruleEnumAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:326:2: ( ( ( rule__EnumAttribute__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__EnumAttribute__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__EnumAttribute__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:328:1: ( rule__EnumAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:1: ( rule__EnumAttribute__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:2: rule__EnumAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute640);
            rule__EnumAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:341:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:342:1: ( ruleStringAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:343:1: ruleStringAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute667);
            ruleStringAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:350:1: ruleStringAttribute : ( ( rule__StringAttribute__ValueAssignment ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:354:2: ( ( ( rule__StringAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__StringAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__StringAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:356:1: ( rule__StringAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:1: ( rule__StringAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:2: rule__StringAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute700);
            rule__StringAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleIntegerAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:369:1: entryRuleIntegerAttribute : ruleIntegerAttribute EOF ;
    public final void entryRuleIntegerAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:370:1: ( ruleIntegerAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:371:1: ruleIntegerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute727);
            ruleIntegerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAttribute734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntegerAttribute"


    // $ANTLR start "ruleIntegerAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:378:1: ruleIntegerAttribute : ( ( rule__IntegerAttribute__ValueAssignment ) ) ;
    public final void ruleIntegerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:382:2: ( ( ( rule__IntegerAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:384:1: ( rule__IntegerAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:1: ( rule__IntegerAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:2: rule__IntegerAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute760);
            rule__IntegerAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleIntegerAttribute"


    // $ANTLR start "entryRuleDoubleAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:397:1: entryRuleDoubleAttribute : ruleDoubleAttribute EOF ;
    public final void entryRuleDoubleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:398:1: ( ruleDoubleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:399:1: ruleDoubleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute787);
            ruleDoubleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleAttribute794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoubleAttribute"


    // $ANTLR start "ruleDoubleAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:406:1: ruleDoubleAttribute : ( ( rule__DoubleAttribute__ValueAssignment ) ) ;
    public final void ruleDoubleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:410:2: ( ( ( rule__DoubleAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:412:1: ( rule__DoubleAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:1: ( rule__DoubleAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:2: rule__DoubleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute820);
            rule__DoubleAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDoubleAttribute"


    // $ANTLR start "entryRuleDateAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:425:1: entryRuleDateAttribute : ruleDateAttribute EOF ;
    public final void entryRuleDateAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:426:1: ( ruleDateAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:427:1: ruleDateAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute847);
            ruleDateAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateAttribute854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDateAttribute"


    // $ANTLR start "ruleDateAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:434:1: ruleDateAttribute : ( ( rule__DateAttribute__ValueAssignment ) ) ;
    public final void ruleDateAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:438:2: ( ( ( rule__DateAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__DateAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__DateAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:440:1: ( rule__DateAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:1: ( rule__DateAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:2: rule__DateAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute880);
            rule__DateAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDateAttribute"


    // $ANTLR start "entryRuleNullAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:453:1: entryRuleNullAttribute : ruleNullAttribute EOF ;
    public final void entryRuleNullAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:454:1: ( ruleNullAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:455:1: ruleNullAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute907);
            ruleNullAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullAttribute914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNullAttribute"


    // $ANTLR start "ruleNullAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:462:1: ruleNullAttribute : ( ( rule__NullAttribute__ValueAssignment ) ) ;
    public final void ruleNullAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:466:2: ( ( ( rule__NullAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__NullAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__NullAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:468:1: ( rule__NullAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:1: ( rule__NullAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:2: rule__NullAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute940);
            rule__NullAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleNullAttribute"


    // $ANTLR start "entryRuleBooleanAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:481:1: entryRuleBooleanAttribute : ruleBooleanAttribute EOF ;
    public final void entryRuleBooleanAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:482:1: ( ruleBooleanAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:483:1: ruleBooleanAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute967);
            ruleBooleanAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAttribute974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanAttribute"


    // $ANTLR start "ruleBooleanAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:490:1: ruleBooleanAttribute : ( ( rule__BooleanAttribute__ValueAssignment ) ) ;
    public final void ruleBooleanAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:494:2: ( ( ( rule__BooleanAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:496:1: ( rule__BooleanAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:1: ( rule__BooleanAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:2: rule__BooleanAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1000);
            rule__BooleanAttribute__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanAttribute"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:509:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:510:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:511:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1027);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:518:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:522:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:524:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1060);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:537:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:538:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:539:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1087);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:546:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:550:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:552:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1120);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:565:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:566:1: ( ruleValidID EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:567:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1147);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:574:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:578:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__ValidID__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:580:1: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:1: ( rule__ValidID__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1180);
            rule__ValidID__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getAlternatives()); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleBoolean"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:593:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:594:1: ( ruleBoolean EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:595:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1207);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:602:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:606:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__Boolean__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:608:1: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:1: ( rule__Boolean__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1240);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleLong"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:621:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:622:1: ( ruleLong EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:623:1: ruleLong EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongRule()); 
            }
            pushFollow(FOLLOW_ruleLong_in_entryRuleLong1267);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLong1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:630:1: ruleLong : ( ( rule__Long__Group__0 ) ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:634:2: ( ( ( rule__Long__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:635:1: ( ( rule__Long__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:635:1: ( ( rule__Long__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:636:1: ( rule__Long__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:637:1: ( rule__Long__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:637:2: rule__Long__Group__0
            {
            pushFollow(FOLLOW_rule__Long__Group__0_in_ruleLong1300);
            rule__Long__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongAccess().getGroup()); 
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
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleDouble"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:649:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:650:1: ( ruleDouble EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:651:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble1327);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:658:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:662:2: ( ( ( rule__Double__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:663:1: ( ( rule__Double__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:663:1: ( ( rule__Double__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:664:1: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:665:1: ( rule__Double__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:665:2: rule__Double__Group__0
            {
            pushFollow(FOLLOW_rule__Double__Group__0_in_ruleDouble1360);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleDate"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:677:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:678:1: ( ruleDate EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:679:1: ruleDate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateRule()); 
            }
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate1387);
            ruleDate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:686:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:690:2: ( ( ( rule__Date__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:691:1: ( ( rule__Date__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:691:1: ( ( rule__Date__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:692:1: ( rule__Date__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:693:1: ( rule__Date__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:693:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_rule__Date__Group__0_in_ruleDate1420);
            rule__Date__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getGroup()); 
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
    // $ANTLR end "ruleDate"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:705:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( rule__Value__Group_2__0 ) ) | ( ( ruleReference ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:709:1: ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( rule__Value__Group_2__0 ) ) | ( ( ruleReference ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:710:1: ( ruleMultiValue )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:710:1: ( ruleMultiValue )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:711:1: ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1456);
                    ruleMultiValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:6: ( ruleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:6: ( ruleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:717:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Value__Alternatives1473);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ( rule__Value__Group_2__0 ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ( rule__Value__Group_2__0 ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:723:1: ( rule__Value__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getGroup_2()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:724:1: ( rule__Value__Group_2__0 )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:724:2: rule__Value__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Value__Group_2__0_in_rule__Value__Alternatives1490);
                    rule__Value__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:728:6: ( ( ruleReference ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:728:6: ( ( ruleReference ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:729:1: ( ruleReference )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:730:1: ( ruleReference )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:730:3: ruleReference
                    {
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1509);
                    ruleReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:739:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:743:1: ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:744:1: ( ruleEnumAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:744:1: ( ruleEnumAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:745:1: ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1542);
                    ruleEnumAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:750:6: ( ruleStringAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:750:6: ( ruleStringAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:751:1: ruleStringAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1559);
                    ruleStringAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:756:6: ( ruleIntegerAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:756:6: ( ruleIntegerAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:757:1: ruleIntegerAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1576);
                    ruleIntegerAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:762:6: ( ruleBooleanAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:762:6: ( ruleBooleanAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:763:1: ruleBooleanAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1593);
                    ruleBooleanAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:768:6: ( ruleDoubleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:768:6: ( ruleDoubleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:769:1: ruleDoubleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1610);
                    ruleDoubleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:774:6: ( ruleDateAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:774:6: ( ruleDateAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:775:1: ruleDateAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1627);
                    ruleDateAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:780:6: ( ruleNullAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:780:6: ( ruleNullAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:781:1: ruleNullAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1644);
                    ruleNullAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                    }

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:791:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( RULE_LONG_ID ) | ( RULE_LONG_UNSIGNED ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:795:1: ( ( RULE_ID ) | ( RULE_LONG_ID ) | ( RULE_LONG_UNSIGNED ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_LONG_ID:
                {
                alt3=2;
                }
                break;
            case RULE_LONG_UNSIGNED:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:796:1: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:796:1: ( RULE_ID )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:797:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1676); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:802:6: ( RULE_LONG_ID )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:802:6: ( RULE_LONG_ID )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:803:1: RULE_LONG_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONG_IDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_LONG_ID,FOLLOW_RULE_LONG_ID_in_rule__ValidID__Alternatives1693); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getLONG_IDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:808:6: ( RULE_LONG_UNSIGNED )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:808:6: ( RULE_LONG_UNSIGNED )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:809:1: RULE_LONG_UNSIGNED
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                    }
                    match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__ValidID__Alternatives1710); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:819:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:823:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:824:1: ( 'true' )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:824:1: ( 'true' )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:825:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Boolean__Alternatives1743); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:832:6: ( 'false' )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:832:6: ( 'false' )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:833:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Boolean__Alternatives1763); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Factory__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:847:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:851:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:852:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01795);
            rule__Factory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01798);
            rule__Factory__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__0"


    // $ANTLR start "rule__Factory__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:859:1: rule__Factory__Group__0__Impl : ( ( rule__Factory__ImportsAssignment_0 )* ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:863:1: ( ( ( rule__Factory__ImportsAssignment_0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:864:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:864:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:865:1: ( rule__Factory__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:866:1: ( rule__Factory__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:866:2: rule__Factory__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1825);
            	    rule__Factory__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Factory__Group__0__Impl"


    // $ANTLR start "rule__Factory__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:876:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:880:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:881:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11856);
            rule__Factory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11859);
            rule__Factory__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__1"


    // $ANTLR start "rule__Factory__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:888:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__EpackagesAssignment_1 )* ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:892:1: ( ( ( rule__Factory__EpackagesAssignment_1 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:893:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:893:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:894:1: ( rule__Factory__EpackagesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:895:1: ( rule__Factory__EpackagesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:895:2: rule__Factory__EpackagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Factory__EpackagesAssignment_1_in_rule__Factory__Group__1__Impl1886);
            	    rule__Factory__EpackagesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getEpackagesAssignment_1()); 
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
    // $ANTLR end "rule__Factory__Group__1__Impl"


    // $ANTLR start "rule__Factory__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:905:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:909:1: ( rule__Factory__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:910:2: rule__Factory__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21917);
            rule__Factory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__2"


    // $ANTLR start "rule__Factory__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:916:1: rule__Factory__Group__2__Impl : ( ( rule__Factory__RootAssignment_2 ) ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:920:1: ( ( ( rule__Factory__RootAssignment_2 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:921:1: ( ( rule__Factory__RootAssignment_2 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:921:1: ( ( rule__Factory__RootAssignment_2 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:922:1: ( rule__Factory__RootAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:923:1: ( rule__Factory__RootAssignment_2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:923:2: rule__Factory__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__Factory__RootAssignment_2_in_rule__Factory__Group__2__Impl1944);
            rule__Factory__RootAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getRootAssignment_2()); 
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
    // $ANTLR end "rule__Factory__Group__2__Impl"


    // $ANTLR start "rule__PackageImport__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:939:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:943:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:944:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01980);
            rule__PackageImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01983);
            rule__PackageImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__0"


    // $ANTLR start "rule__PackageImport__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:951:1: rule__PackageImport__Group__0__Impl : ( 'use' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:955:1: ( ( 'use' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:956:1: ( 'use' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:956:1: ( 'use' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:957:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getUseKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__PackageImport__Group__0__Impl2011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getUseKeyword_0()); 
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
    // $ANTLR end "rule__PackageImport__Group__0__Impl"


    // $ANTLR start "rule__PackageImport__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:970:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:974:1: ( rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:975:2: rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__12042);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__12045);
            rule__PackageImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__1"


    // $ANTLR start "rule__PackageImport__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:982:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__EPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:986:1: ( ( ( rule__PackageImport__EPackageAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:987:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:987:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:988:1: ( rule__PackageImport__EPackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:989:1: ( rule__PackageImport__EPackageAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:989:2: rule__PackageImport__EPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl2072);
            rule__PackageImport__EPackageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getEPackageAssignment_1()); 
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
    // $ANTLR end "rule__PackageImport__Group__1__Impl"


    // $ANTLR start "rule__PackageImport__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:999:1: rule__PackageImport__Group__2 : rule__PackageImport__Group__2__Impl ;
    public final void rule__PackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1003:1: ( rule__PackageImport__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1004:2: rule__PackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__22102);
            rule__PackageImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageImport__Group__2"


    // $ANTLR start "rule__PackageImport__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1010:1: rule__PackageImport__Group__2__Impl : ( '.*' ) ;
    public final void rule__PackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1014:1: ( ( '.*' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1015:1: ( '.*' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1015:1: ( '.*' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1016:1: '.*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__PackageImport__Group__2__Impl2130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__PackageImport__Group__2__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1035:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1039:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1040:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceImport__Group__0__Impl_in_rule__NamespaceImport__Group__02167);
            rule__NamespaceImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NamespaceImport__Group__1_in_rule__NamespaceImport__Group__02170);
            rule__NamespaceImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__0"


    // $ANTLR start "rule__NamespaceImport__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1047:1: rule__NamespaceImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1051:1: ( ( 'import' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1052:1: ( 'import' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1052:1: ( 'import' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1053:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__NamespaceImport__Group__0__Impl2198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__NamespaceImport__Group__0__Impl"


    // $ANTLR start "rule__NamespaceImport__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1066:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1070:1: ( rule__NamespaceImport__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1071:2: rule__NamespaceImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceImport__Group__1__Impl_in_rule__NamespaceImport__Group__12229);
            rule__NamespaceImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceImport__Group__1"


    // $ANTLR start "rule__NamespaceImport__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1077:1: rule__NamespaceImport__Group__1__Impl : ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1081:1: ( ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1082:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1082:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1083:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1084:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1084:2: rule__NamespaceImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceImport__ImportedNamespaceAssignment_1_in_rule__NamespaceImport__Group__1__Impl2256);
            rule__NamespaceImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__NamespaceImport__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1098:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1102:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1103:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02290);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02293);
            rule__Feature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1110:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__EFeatureAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1114:1: ( ( ( rule__Feature__EFeatureAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1115:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1115:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1116:1: ( rule__Feature__EFeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1117:1: ( rule__Feature__EFeatureAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1117:2: rule__Feature__EFeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2320);
            rule__Feature__EFeatureAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1127:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1131:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1132:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12350);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12353);
            rule__Feature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1139:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1143:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1144:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1144:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1145:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Feature__Group__1__Impl2381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1158:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1162:1: ( rule__Feature__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1163:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22412);
            rule__Feature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1169:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1173:1: ( ( ( rule__Feature__ValueAssignment_2 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1174:1: ( ( rule__Feature__ValueAssignment_2 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1174:1: ( ( rule__Feature__ValueAssignment_2 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1175:1: ( rule__Feature__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1176:1: ( rule__Feature__ValueAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_LONG_ID && LA7_0<=RULE_STRING)||(LA7_0>=13 && LA7_0<=14)||LA7_0==18||LA7_0==21||(LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_LONG_UNSIGNED)||(LA7_2>=19 && LA7_2<=20)||LA7_2==23) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1176:2: rule__Feature__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2439);
                    rule__Feature__ValueAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__NewObject__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1192:1: rule__NewObject__Group__0 : rule__NewObject__Group__0__Impl rule__NewObject__Group__1 ;
    public final void rule__NewObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1196:1: ( rule__NewObject__Group__0__Impl rule__NewObject__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1197:2: rule__NewObject__Group__0__Impl rule__NewObject__Group__1
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02476);
            rule__NewObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02479);
            rule__NewObject__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__0"


    // $ANTLR start "rule__NewObject__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1204:1: rule__NewObject__Group__0__Impl : ( ( rule__NewObject__EClassAssignment_0 ) ) ;
    public final void rule__NewObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1208:1: ( ( ( rule__NewObject__EClassAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1209:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1209:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1210:1: ( rule__NewObject__EClassAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1211:1: ( rule__NewObject__EClassAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1211:2: rule__NewObject__EClassAssignment_0
            {
            pushFollow(FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2506);
            rule__NewObject__EClassAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
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
    // $ANTLR end "rule__NewObject__Group__0__Impl"


    // $ANTLR start "rule__NewObject__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1221:1: rule__NewObject__Group__1 : rule__NewObject__Group__1__Impl rule__NewObject__Group__2 ;
    public final void rule__NewObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1225:1: ( rule__NewObject__Group__1__Impl rule__NewObject__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1226:2: rule__NewObject__Group__1__Impl rule__NewObject__Group__2
            {
            pushFollow(FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12536);
            rule__NewObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12539);
            rule__NewObject__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__1"


    // $ANTLR start "rule__NewObject__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1233:1: rule__NewObject__Group__1__Impl : ( ( rule__NewObject__NameAssignment_1 )? ) ;
    public final void rule__NewObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1237:1: ( ( ( rule__NewObject__NameAssignment_1 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1238:1: ( ( rule__NewObject__NameAssignment_1 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1238:1: ( ( rule__NewObject__NameAssignment_1 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1239:1: ( rule__NewObject__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1240:1: ( rule__NewObject__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_LONG_UNSIGNED)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1240:2: rule__NewObject__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2566);
                    rule__NewObject__NameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__NewObject__Group__1__Impl"


    // $ANTLR start "rule__NewObject__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1250:1: rule__NewObject__Group__2 : rule__NewObject__Group__2__Impl rule__NewObject__Group__3 ;
    public final void rule__NewObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1254:1: ( rule__NewObject__Group__2__Impl rule__NewObject__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1255:2: rule__NewObject__Group__2__Impl rule__NewObject__Group__3
            {
            pushFollow(FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22597);
            rule__NewObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22600);
            rule__NewObject__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__2"


    // $ANTLR start "rule__NewObject__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1262:1: rule__NewObject__Group__2__Impl : ( '{' ) ;
    public final void rule__NewObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1266:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1267:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1267:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1268:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__NewObject__Group__2__Impl2628); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__NewObject__Group__2__Impl"


    // $ANTLR start "rule__NewObject__Group__3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1281:1: rule__NewObject__Group__3 : rule__NewObject__Group__3__Impl rule__NewObject__Group__4 ;
    public final void rule__NewObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1285:1: ( rule__NewObject__Group__3__Impl rule__NewObject__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1286:2: rule__NewObject__Group__3__Impl rule__NewObject__Group__4
            {
            pushFollow(FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32659);
            rule__NewObject__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32662);
            rule__NewObject__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__3"


    // $ANTLR start "rule__NewObject__Group__3__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1293:1: rule__NewObject__Group__3__Impl : ( ( rule__NewObject__FeaturesAssignment_3 )* ) ;
    public final void rule__NewObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1297:1: ( ( ( rule__NewObject__FeaturesAssignment_3 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1298:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1298:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1299:1: ( rule__NewObject__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1300:1: ( rule__NewObject__FeaturesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1300:2: rule__NewObject__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2689);
            	    rule__NewObject__FeaturesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
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
    // $ANTLR end "rule__NewObject__Group__3__Impl"


    // $ANTLR start "rule__NewObject__Group__4"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1310:1: rule__NewObject__Group__4 : rule__NewObject__Group__4__Impl ;
    public final void rule__NewObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1314:1: ( rule__NewObject__Group__4__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1315:2: rule__NewObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42720);
            rule__NewObject__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__4"


    // $ANTLR start "rule__NewObject__Group__4__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1321:1: rule__NewObject__Group__4__Impl : ( '}' ) ;
    public final void rule__NewObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1325:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1326:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1326:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1327:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__NewObject__Group__4__Impl2748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__NewObject__Group__4__Impl"


    // $ANTLR start "rule__Value__Group_2__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1350:1: rule__Value__Group_2__0 : rule__Value__Group_2__0__Impl rule__Value__Group_2__1 ;
    public final void rule__Value__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1354:1: ( rule__Value__Group_2__0__Impl rule__Value__Group_2__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1355:2: rule__Value__Group_2__0__Impl rule__Value__Group_2__1
            {
            pushFollow(FOLLOW_rule__Value__Group_2__0__Impl_in_rule__Value__Group_2__02789);
            rule__Value__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2__1_in_rule__Value__Group_2__02792);
            rule__Value__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__0"


    // $ANTLR start "rule__Value__Group_2__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1362:1: rule__Value__Group_2__0__Impl : ( ( rule__Value__Group_2_0__0 ) ) ;
    public final void rule__Value__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1366:1: ( ( ( rule__Value__Group_2_0__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1367:1: ( ( rule__Value__Group_2_0__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1367:1: ( ( rule__Value__Group_2_0__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1368:1: ( rule__Value__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getGroup_2_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1369:1: ( rule__Value__Group_2_0__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1369:2: rule__Value__Group_2_0__0
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0__0_in_rule__Value__Group_2__0__Impl2819);
            rule__Value__Group_2_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getGroup_2_0()); 
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
    // $ANTLR end "rule__Value__Group_2__0__Impl"


    // $ANTLR start "rule__Value__Group_2__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1379:1: rule__Value__Group_2__1 : rule__Value__Group_2__1__Impl rule__Value__Group_2__2 ;
    public final void rule__Value__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1383:1: ( rule__Value__Group_2__1__Impl rule__Value__Group_2__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1384:2: rule__Value__Group_2__1__Impl rule__Value__Group_2__2
            {
            pushFollow(FOLLOW_rule__Value__Group_2__1__Impl_in_rule__Value__Group_2__12849);
            rule__Value__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2__2_in_rule__Value__Group_2__12852);
            rule__Value__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__1"


    // $ANTLR start "rule__Value__Group_2__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1391:1: rule__Value__Group_2__1__Impl : ( ( rule__Value__FeaturesAssignment_2_1 )* ) ;
    public final void rule__Value__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1395:1: ( ( ( rule__Value__FeaturesAssignment_2_1 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1396:1: ( ( rule__Value__FeaturesAssignment_2_1 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1396:1: ( ( rule__Value__FeaturesAssignment_2_1 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1397:1: ( rule__Value__FeaturesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFeaturesAssignment_2_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1398:1: ( rule__Value__FeaturesAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1398:2: rule__Value__FeaturesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Value__FeaturesAssignment_2_1_in_rule__Value__Group_2__1__Impl2879);
            	    rule__Value__FeaturesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getFeaturesAssignment_2_1()); 
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
    // $ANTLR end "rule__Value__Group_2__1__Impl"


    // $ANTLR start "rule__Value__Group_2__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1408:1: rule__Value__Group_2__2 : rule__Value__Group_2__2__Impl rule__Value__Group_2__3 ;
    public final void rule__Value__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1412:1: ( rule__Value__Group_2__2__Impl rule__Value__Group_2__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1413:2: rule__Value__Group_2__2__Impl rule__Value__Group_2__3
            {
            pushFollow(FOLLOW_rule__Value__Group_2__2__Impl_in_rule__Value__Group_2__22910);
            rule__Value__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2__3_in_rule__Value__Group_2__22913);
            rule__Value__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__2"


    // $ANTLR start "rule__Value__Group_2__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1420:1: rule__Value__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Value__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1424:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1425:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1425:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1426:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Value__Group_2__2__Impl2941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_2_2()); 
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
    // $ANTLR end "rule__Value__Group_2__2__Impl"


    // $ANTLR start "rule__Value__Group_2__3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1439:1: rule__Value__Group_2__3 : rule__Value__Group_2__3__Impl ;
    public final void rule__Value__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1443:1: ( rule__Value__Group_2__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1444:2: rule__Value__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_2__3__Impl_in_rule__Value__Group_2__32972);
            rule__Value__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__3"


    // $ANTLR start "rule__Value__Group_2__3__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1450:1: rule__Value__Group_2__3__Impl : ( () ) ;
    public final void rule__Value__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1454:1: ( ( () ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1455:1: ( () )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1455:1: ( () )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1456:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getContainmentValueAction_2_3()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1457:1: ()
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1459:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getContainmentValueAction_2_3()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__3__Impl"


    // $ANTLR start "rule__Value__Group_2_0__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1477:1: rule__Value__Group_2_0__0 : rule__Value__Group_2_0__0__Impl ;
    public final void rule__Value__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1481:1: ( rule__Value__Group_2_0__0__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1482:2: rule__Value__Group_2_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0__0__Impl_in_rule__Value__Group_2_0__03038);
            rule__Value__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0__0"


    // $ANTLR start "rule__Value__Group_2_0__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1488:1: rule__Value__Group_2_0__0__Impl : ( ( rule__Value__Group_2_0_0__0 ) ) ;
    public final void rule__Value__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1492:1: ( ( ( rule__Value__Group_2_0_0__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1493:1: ( ( rule__Value__Group_2_0_0__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1493:1: ( ( rule__Value__Group_2_0_0__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1494:1: ( rule__Value__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getGroup_2_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1495:1: ( rule__Value__Group_2_0_0__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1495:2: rule__Value__Group_2_0_0__0
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__0_in_rule__Value__Group_2_0__0__Impl3065);
            rule__Value__Group_2_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getGroup_2_0_0()); 
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
    // $ANTLR end "rule__Value__Group_2_0__0__Impl"


    // $ANTLR start "rule__Value__Group_2_0_0__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1507:1: rule__Value__Group_2_0_0__0 : rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1 ;
    public final void rule__Value__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1511:1: ( rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1512:2: rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__0__Impl_in_rule__Value__Group_2_0_0__03097);
            rule__Value__Group_2_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__1_in_rule__Value__Group_2_0_0__03100);
            rule__Value__Group_2_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0_0__0"


    // $ANTLR start "rule__Value__Group_2_0_0__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1519:1: rule__Value__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__Value__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1523:1: ( ( () ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1524:1: ( () )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1524:1: ( () )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1525:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNewObjectAction_2_0_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1526:1: ()
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1528:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getNewObjectAction_2_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__Value__Group_2_0_0__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1538:1: rule__Value__Group_2_0_0__1 : rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2 ;
    public final void rule__Value__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1542:1: ( rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1543:2: rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__1__Impl_in_rule__Value__Group_2_0_0__13158);
            rule__Value__Group_2_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__2_in_rule__Value__Group_2_0_0__13161);
            rule__Value__Group_2_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0_0__1"


    // $ANTLR start "rule__Value__Group_2_0_0__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1550:1: rule__Value__Group_2_0_0__1__Impl : ( ( rule__Value__EClassAssignment_2_0_0_1 ) ) ;
    public final void rule__Value__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1554:1: ( ( ( rule__Value__EClassAssignment_2_0_0_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1555:1: ( ( rule__Value__EClassAssignment_2_0_0_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1555:1: ( ( rule__Value__EClassAssignment_2_0_0_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1556:1: ( rule__Value__EClassAssignment_2_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassAssignment_2_0_0_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1557:1: ( rule__Value__EClassAssignment_2_0_0_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1557:2: rule__Value__EClassAssignment_2_0_0_1
            {
            pushFollow(FOLLOW_rule__Value__EClassAssignment_2_0_0_1_in_rule__Value__Group_2_0_0__1__Impl3188);
            rule__Value__EClassAssignment_2_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getEClassAssignment_2_0_0_1()); 
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
    // $ANTLR end "rule__Value__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__Value__Group_2_0_0__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1567:1: rule__Value__Group_2_0_0__2 : rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3 ;
    public final void rule__Value__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1571:1: ( rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1572:2: rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__2__Impl_in_rule__Value__Group_2_0_0__23218);
            rule__Value__Group_2_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__3_in_rule__Value__Group_2_0_0__23221);
            rule__Value__Group_2_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0_0__2"


    // $ANTLR start "rule__Value__Group_2_0_0__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1579:1: rule__Value__Group_2_0_0__2__Impl : ( ( rule__Value__NameAssignment_2_0_0_2 )? ) ;
    public final void rule__Value__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1583:1: ( ( ( rule__Value__NameAssignment_2_0_0_2 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1584:1: ( ( rule__Value__NameAssignment_2_0_0_2 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1584:1: ( ( rule__Value__NameAssignment_2_0_0_2 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1585:1: ( rule__Value__NameAssignment_2_0_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNameAssignment_2_0_0_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1586:1: ( rule__Value__NameAssignment_2_0_0_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_LONG_UNSIGNED)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1586:2: rule__Value__NameAssignment_2_0_0_2
                    {
                    pushFollow(FOLLOW_rule__Value__NameAssignment_2_0_0_2_in_rule__Value__Group_2_0_0__2__Impl3248);
                    rule__Value__NameAssignment_2_0_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getNameAssignment_2_0_0_2()); 
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
    // $ANTLR end "rule__Value__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__Value__Group_2_0_0__3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1596:1: rule__Value__Group_2_0_0__3 : rule__Value__Group_2_0_0__3__Impl ;
    public final void rule__Value__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1600:1: ( rule__Value__Group_2_0_0__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1601:2: rule__Value__Group_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_2_0_0__3__Impl_in_rule__Value__Group_2_0_0__33279);
            rule__Value__Group_2_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2_0_0__3"


    // $ANTLR start "rule__Value__Group_2_0_0__3__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1607:1: rule__Value__Group_2_0_0__3__Impl : ( '{' ) ;
    public final void rule__Value__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1611:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1612:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1612:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1613:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2_0_0_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__Value__Group_2_0_0__3__Impl3307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2_0_0_3()); 
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
    // $ANTLR end "rule__Value__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__MultiValue__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1634:1: rule__MultiValue__Group__0 : rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 ;
    public final void rule__MultiValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1638:1: ( rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1639:2: rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__03346);
            rule__MultiValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__03349);
            rule__MultiValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValue__Group__0"


    // $ANTLR start "rule__MultiValue__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1646:1: rule__MultiValue__Group__0__Impl : ( () ) ;
    public final void rule__MultiValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1650:1: ( ( () ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1651:1: ( () )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1651:1: ( () )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1652:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getMultiValueAction_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1653:1: ()
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1655:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getMultiValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValue__Group__0__Impl"


    // $ANTLR start "rule__MultiValue__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1665:1: rule__MultiValue__Group__1 : rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 ;
    public final void rule__MultiValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1669:1: ( rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1670:2: rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__13407);
            rule__MultiValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__13410);
            rule__MultiValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValue__Group__1"


    // $ANTLR start "rule__MultiValue__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1677:1: rule__MultiValue__Group__1__Impl : ( '[' ) ;
    public final void rule__MultiValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1681:1: ( ( '[' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1682:1: ( '[' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1682:1: ( '[' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1683:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__MultiValue__Group__1__Impl3438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__MultiValue__Group__1__Impl"


    // $ANTLR start "rule__MultiValue__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1696:1: rule__MultiValue__Group__2 : rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 ;
    public final void rule__MultiValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1700:1: ( rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1701:2: rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__23469);
            rule__MultiValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__23472);
            rule__MultiValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValue__Group__2"


    // $ANTLR start "rule__MultiValue__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1708:1: rule__MultiValue__Group__2__Impl : ( ( rule__MultiValue__ValuesAssignment_2 )* ) ;
    public final void rule__MultiValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1712:1: ( ( ( rule__MultiValue__ValuesAssignment_2 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1713:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1713:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1714:1: ( rule__MultiValue__ValuesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1715:1: ( rule__MultiValue__ValuesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=13 && LA12_0<=14)||LA12_0==18||LA12_0==21||(LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1715:2: rule__MultiValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl3499);
            	    rule__MultiValue__ValuesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getValuesAssignment_2()); 
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
    // $ANTLR end "rule__MultiValue__Group__2__Impl"


    // $ANTLR start "rule__MultiValue__Group__3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1725:1: rule__MultiValue__Group__3 : rule__MultiValue__Group__3__Impl ;
    public final void rule__MultiValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1729:1: ( rule__MultiValue__Group__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1730:2: rule__MultiValue__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__33530);
            rule__MultiValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValue__Group__3"


    // $ANTLR start "rule__MultiValue__Group__3__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1736:1: rule__MultiValue__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1740:1: ( ( ']' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1741:1: ( ']' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1741:1: ( ']' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1742:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__MultiValue__Group__3__Impl3558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__MultiValue__Group__3__Impl"


    // $ANTLR start "rule__EnumAttribute__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1763:1: rule__EnumAttribute__Group__0 : rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 ;
    public final void rule__EnumAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1767:1: ( rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1768:2: rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03597);
            rule__EnumAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03600);
            rule__EnumAttribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumAttribute__Group__0"


    // $ANTLR start "rule__EnumAttribute__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1775:1: rule__EnumAttribute__Group__0__Impl : ( ':' ) ;
    public final void rule__EnumAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1779:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1780:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1780:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1781:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getColonKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__EnumAttribute__Group__0__Impl3628); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getColonKeyword_0()); 
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
    // $ANTLR end "rule__EnumAttribute__Group__0__Impl"


    // $ANTLR start "rule__EnumAttribute__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1794:1: rule__EnumAttribute__Group__1 : rule__EnumAttribute__Group__1__Impl ;
    public final void rule__EnumAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1798:1: ( rule__EnumAttribute__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1799:2: rule__EnumAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13659);
            rule__EnumAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumAttribute__Group__1"


    // $ANTLR start "rule__EnumAttribute__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1805:1: rule__EnumAttribute__Group__1__Impl : ( ( rule__EnumAttribute__ValueAssignment_1 ) ) ;
    public final void rule__EnumAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1809:1: ( ( ( rule__EnumAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1810:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1810:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1811:1: ( rule__EnumAttribute__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1812:1: ( rule__EnumAttribute__ValueAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1812:2: rule__EnumAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3686);
            rule__EnumAttribute__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__EnumAttribute__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1826:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1830:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1831:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03720);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03723);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1838:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1842:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1843:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1843:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1844:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3750);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1855:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1859:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1860:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13779);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1866:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1870:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1871:1: ( ( '.*' )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1871:1: ( ( '.*' )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1872:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1873:1: ( '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1874:2: '.*'
                    {
                    match(input,16,FOLLOW_16_in_rule__QualifiedNameWithWildcard__Group__1__Impl3808); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1889:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1893:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1894:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03845);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03848);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1901:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1905:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1906:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1906:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1907:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3875);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1918:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1922:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1923:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13904);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1929:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1933:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1934:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1934:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1935:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1936:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1936:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3931);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1950:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1954:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1955:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03966);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03969);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1962:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1966:1: ( ( ( '.' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1967:1: ( ( '.' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1967:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1968:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1969:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1970:2: '.'
            {
            match(input,23,FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl3998); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1981:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1985:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1986:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14030);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1992:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1996:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1997:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1997:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1998:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4057);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Long__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2013:1: rule__Long__Group__0 : rule__Long__Group__0__Impl rule__Long__Group__1 ;
    public final void rule__Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2017:1: ( rule__Long__Group__0__Impl rule__Long__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2018:2: rule__Long__Group__0__Impl rule__Long__Group__1
            {
            pushFollow(FOLLOW_rule__Long__Group__0__Impl_in_rule__Long__Group__04090);
            rule__Long__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Long__Group__1_in_rule__Long__Group__04093);
            rule__Long__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__0"


    // $ANTLR start "rule__Long__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2025:1: rule__Long__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2029:1: ( ( ( '-' )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2030:1: ( ( '-' )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2030:1: ( ( '-' )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2031:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2032:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2033:2: '-'
                    {
                    match(input,24,FOLLOW_24_in_rule__Long__Group__0__Impl4122); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__Long__Group__0__Impl"


    // $ANTLR start "rule__Long__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2044:1: rule__Long__Group__1 : rule__Long__Group__1__Impl ;
    public final void rule__Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2048:1: ( rule__Long__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2049:2: rule__Long__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Long__Group__1__Impl_in_rule__Long__Group__14155);
            rule__Long__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__1"


    // $ANTLR start "rule__Long__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2055:1: rule__Long__Group__1__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2059:1: ( ( RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2060:1: ( RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2060:1: ( RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2061:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getLONG_UNSIGNEDTerminalRuleCall_1()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__Long__Group__1__Impl4182); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongAccess().getLONG_UNSIGNEDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Long__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2076:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2080:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2081:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__04215);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__1_in_rule__Double__Group__04218);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2088:1: rule__Double__Group__0__Impl : ( ruleLong ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2092:1: ( ( ruleLong ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2093:1: ( ruleLong )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2093:1: ( ruleLong )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2094:1: ruleLong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getLongParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLong_in_rule__Double__Group__0__Impl4245);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getLongParserRuleCall_0()); 
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
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2105:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2109:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2110:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__14274);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Double__Group__2_in_rule__Double__Group__14277);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2117:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2121:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2122:1: ( '.' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2122:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2123:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Double__Group__1__Impl4305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2136:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2140:1: ( rule__Double__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2141:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__24336);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2147:1: rule__Double__Group__2__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2151:1: ( ( RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2152:1: ( RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2152:1: ( RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2153:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__Double__Group__2__Impl4363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2170:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2174:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2175:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04398);
            rule__Date__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04401);
            rule__Date__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2182:1: rule__Date__Group__0__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2186:1: ( ( RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2187:1: ( RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2187:1: ( RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2188:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_0()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__0__Impl4428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2199:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2203:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2204:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14457);
            rule__Date__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14460);
            rule__Date__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2211:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2215:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2216:1: ( '.' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2216:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2217:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Date__Group__1__Impl4488); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2230:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2234:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2235:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__24519);
            rule__Date__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Date__Group__3_in_rule__Date__Group__24522);
            rule__Date__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2242:1: rule__Date__Group__2__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2246:1: ( ( RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2247:1: ( RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2247:1: ( RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2248:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__2__Impl4549); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2259:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2263:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2264:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__34578);
            rule__Date__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Date__Group__4_in_rule__Date__Group__34581);
            rule__Date__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2271:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2275:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2276:1: ( '.' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2276:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2277:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Date__Group__3__Impl4609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
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
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2290:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2294:1: ( rule__Date__Group__4__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2295:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__44640);
            rule__Date__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2301:1: rule__Date__Group__4__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2305:1: ( ( RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2306:1: ( RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2306:1: ( RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2307:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_4()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__4__Impl4667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Factory__ImportsAssignment_0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2329:1: rule__Factory__ImportsAssignment_0 : ( ruleNamespaceImport ) ;
    public final void rule__Factory__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2333:1: ( ( ruleNamespaceImport ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2334:1: ( ruleNamespaceImport )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2334:1: ( ruleNamespaceImport )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2335:1: ruleNamespaceImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsNamespaceImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNamespaceImport_in_rule__Factory__ImportsAssignment_04711);
            ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getImportsNamespaceImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Factory__ImportsAssignment_0"


    // $ANTLR start "rule__Factory__EpackagesAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2344:1: rule__Factory__EpackagesAssignment_1 : ( rulePackageImport ) ;
    public final void rule__Factory__EpackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2348:1: ( ( rulePackageImport ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2349:1: ( rulePackageImport )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2349:1: ( rulePackageImport )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2350:1: rulePackageImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_14742);
            rulePackageImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Factory__EpackagesAssignment_1"


    // $ANTLR start "rule__Factory__RootAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2359:1: rule__Factory__RootAssignment_2 : ( ruleNewObject ) ;
    public final void rule__Factory__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2363:1: ( ( ruleNewObject ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2364:1: ( ruleNewObject )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2364:1: ( ruleNewObject )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2365:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_24773);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Factory__RootAssignment_2"


    // $ANTLR start "rule__PackageImport__EPackageAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2374:1: rule__PackageImport__EPackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackageImport__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2378:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2379:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2379:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2380:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2381:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2382:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_14808);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getEPackageEPackageQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
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
    // $ANTLR end "rule__PackageImport__EPackageAssignment_1"


    // $ANTLR start "rule__NamespaceImport__ImportedNamespaceAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2393:1: rule__NamespaceImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__NamespaceImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2397:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2398:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2398:1: ( ruleQualifiedNameWithWildcard )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2399:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__NamespaceImport__ImportedNamespaceAssignment_14843);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NamespaceImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Feature__EFeatureAssignment_0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2408:1: rule__Feature__EFeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__EFeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2412:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2413:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2413:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2414:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2415:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2416:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_04878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
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
    // $ANTLR end "rule__Feature__EFeatureAssignment_0"


    // $ANTLR start "rule__Feature__ValueAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2427:1: rule__Feature__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2431:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2432:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2432:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2433:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_24913);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Feature__ValueAssignment_2"


    // $ANTLR start "rule__NewObject__EClassAssignment_0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2442:1: rule__NewObject__EClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NewObject__EClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2446:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2447:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2447:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2448:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2449:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2450:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_04948);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getEClassEClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
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
    // $ANTLR end "rule__NewObject__EClassAssignment_0"


    // $ANTLR start "rule__NewObject__NameAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2461:1: rule__NewObject__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NewObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2465:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2466:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2466:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2467:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_14983);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NewObject__NameAssignment_1"


    // $ANTLR start "rule__NewObject__FeaturesAssignment_3"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2476:1: rule__NewObject__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__NewObject__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2480:1: ( ( ruleFeature ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2481:1: ( ruleFeature )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2481:1: ( ruleFeature )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2482:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_35014);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__NewObject__FeaturesAssignment_3"


    // $ANTLR start "rule__Value__EClassAssignment_2_0_0_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2491:1: rule__Value__EClassAssignment_2_0_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Value__EClassAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2495:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2496:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2496:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2497:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassEClassCrossReference_2_0_0_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2498:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2499:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_0_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Value__EClassAssignment_2_0_0_15049);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getEClassEClassCrossReference_2_0_0_1_0()); 
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
    // $ANTLR end "rule__Value__EClassAssignment_2_0_0_1"


    // $ANTLR start "rule__Value__NameAssignment_2_0_0_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2510:1: rule__Value__NameAssignment_2_0_0_2 : ( ruleValidID ) ;
    public final void rule__Value__NameAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2514:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2515:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2515:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2516:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNameValidIDParserRuleCall_2_0_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__Value__NameAssignment_2_0_0_25084);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getNameValidIDParserRuleCall_2_0_0_2_0()); 
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
    // $ANTLR end "rule__Value__NameAssignment_2_0_0_2"


    // $ANTLR start "rule__Value__FeaturesAssignment_2_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2525:1: rule__Value__FeaturesAssignment_2_1 : ( ruleFeature ) ;
    public final void rule__Value__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2529:1: ( ( ruleFeature ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2530:1: ( ruleFeature )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2530:1: ( ruleFeature )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2531:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__Value__FeaturesAssignment_2_15115);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Value__FeaturesAssignment_2_1"


    // $ANTLR start "rule__MultiValue__ValuesAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2540:1: rule__MultiValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__MultiValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2544:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2545:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2545:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2546:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_25146);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MultiValue__ValuesAssignment_2"


    // $ANTLR start "rule__Reference__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2555:1: rule__Reference__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2559:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2560:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2560:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2561:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2562:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2563:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment5181);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getValueEObjectQualifiedNameParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
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
    // $ANTLR end "rule__Reference__ValueAssignment"


    // $ANTLR start "rule__EnumAttribute__ValueAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2574:1: rule__EnumAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2578:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2579:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2579:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2580:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2581:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_15220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
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
    // $ANTLR end "rule__EnumAttribute__ValueAssignment_1"


    // $ANTLR start "rule__StringAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2593:1: rule__StringAttribute__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2597:1: ( ( RULE_STRING ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2598:1: ( RULE_STRING )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2598:1: ( RULE_STRING )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2599:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment5255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringAttribute__ValueAssignment"


    // $ANTLR start "rule__IntegerAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2608:1: rule__IntegerAttribute__ValueAssignment : ( ruleLong ) ;
    public final void rule__IntegerAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2612:1: ( ( ruleLong ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2613:1: ( ruleLong )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2613:1: ( ruleLong )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2614:1: ruleLong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueLongParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLong_in_rule__IntegerAttribute__ValueAssignment5286);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeAccess().getValueLongParserRuleCall_0()); 
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
    // $ANTLR end "rule__IntegerAttribute__ValueAssignment"


    // $ANTLR start "rule__DoubleAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2623:1: rule__DoubleAttribute__ValueAssignment : ( ruleDouble ) ;
    public final void rule__DoubleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2627:1: ( ( ruleDouble ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2628:1: ( ruleDouble )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2628:1: ( ruleDouble )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2629:1: ruleDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueDoubleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_rule__DoubleAttribute__ValueAssignment5317);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeAccess().getValueDoubleParserRuleCall_0()); 
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
    // $ANTLR end "rule__DoubleAttribute__ValueAssignment"


    // $ANTLR start "rule__DateAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2638:1: rule__DateAttribute__ValueAssignment : ( ruleDate ) ;
    public final void rule__DateAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2642:1: ( ( ruleDate ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2643:1: ( ruleDate )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2643:1: ( ruleDate )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2644:1: ruleDate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueDateParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDate_in_rule__DateAttribute__ValueAssignment5348);
            ruleDate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeAccess().getValueDateParserRuleCall_0()); 
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
    // $ANTLR end "rule__DateAttribute__ValueAssignment"


    // $ANTLR start "rule__NullAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2653:1: rule__NullAttribute__ValueAssignment : ( ( 'NULL' ) ) ;
    public final void rule__NullAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2657:1: ( ( ( 'NULL' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2658:1: ( ( 'NULL' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2658:1: ( ( 'NULL' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2659:1: ( 'NULL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2660:1: ( 'NULL' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2661:1: 'NULL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__NullAttribute__ValueAssignment5384); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
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
    // $ANTLR end "rule__NullAttribute__ValueAssignment"


    // $ANTLR start "rule__BooleanAttribute__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2676:1: rule__BooleanAttribute__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2680:1: ( ( ruleBoolean ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2681:1: ( ruleBoolean )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2681:1: ( ruleBoolean )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2682:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__BooleanAttribute__ValueAssignment5423);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeAccess().getValueBooleanParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanAttribute__ValueAssignment"

    // $ANTLR start synpred2_InternalEFactory
    public final void synpred2_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:6: ( ( ruleAttribute ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:6: ( ruleAttribute )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:6: ( ruleAttribute )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:717:1: ruleAttribute
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1473);
        ruleAttribute();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ( ( rule__Value__Group_2__0 ) ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ( rule__Value__Group_2__0 ) )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ( rule__Value__Group_2__0 ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:723:1: ( rule__Value__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getGroup_2()); 
        }
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:724:1: ( rule__Value__Group_2__0 )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:724:2: rule__Value__Group_2__0
        {
        pushFollow(FOLLOW_rule__Value__Group_2__0_in_synpred3_InternalEFactory1490);
        rule__Value__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEFactory

    // Delegated rules

    public final boolean synpred2_InternalEFactory() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEFactory_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEFactory() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEFactory_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\4\uffff\2\7\6\uffff\3\7";
    static final String DFA1_minS =
        "\1\4\2\uffff\3\4\2\uffff\1\4\3\0\3\4";
    static final String DFA1_maxS =
        "\1\31\2\uffff\1\27\2\31\2\uffff\1\6\3\0\3\31";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\3\1\4\7\uffff";
    static final String DFA1_specialS =
        "\3\uffff\1\1\5\uffff\1\2\1\0\1\3\3\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\5\1\3\1\2\5\uffff\2\2\3\uffff\1\2\2\uffff\1\1\2\uffff\2\2",
            "",
            "",
            "\3\6\14\uffff\1\6\3\uffff\1\6",
            "\1\11\1\12\1\13\1\7\5\uffff\2\7\3\uffff\1\7\1\6\3\7\1\10\2\7",
            "\1\11\1\12\1\13\1\7\5\uffff\2\7\3\uffff\1\7\1\6\3\7\1\10\2\7",
            "",
            "",
            "\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\11\1\12\1\13\1\7\5\uffff\2\7\3\uffff\1\7\1\6\3\7\1\10\2\7",
            "\1\11\1\12\1\13\1\7\5\uffff\2\7\3\uffff\1\7\1\6\3\7\1\10\2\7",
            "\1\11\1\12\1\13\1\7\5\uffff\2\7\3\uffff\1\7\1\6\3\7\1\10\2\7"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "705:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( rule__Value__Group_2__0 ) ) | ( ( ruleReference ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_3>=RULE_ID && LA1_3<=RULE_LONG_UNSIGNED)||LA1_3==19||LA1_3==23) ) {s = 6;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 2;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\4\uffff\1\10\2\uffff\1\10\3\uffff\1\12\1\uffff";
    static final String DFA2_minS =
        "\1\6\2\uffff\1\6\1\4\2\uffff\1\4\1\uffff\1\6\1\uffff\1\4\1\uffff";
    static final String DFA2_maxS =
        "\1\31\2\uffff\1\6\1\31\2\uffff\1\31\1\uffff\1\6\1\uffff\1\31\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\4\1\7\1\uffff\1\3\1\uffff\1\5\1\uffff\1\6";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\1\2\5\uffff\2\5\3\uffff\1\1\5\uffff\1\3\1\6",
            "",
            "",
            "\1\7",
            "\4\10\5\uffff\2\10\3\uffff\1\10\1\uffff\3\10\1\11\2\10",
            "",
            "",
            "\4\10\5\uffff\2\10\3\uffff\1\10\1\uffff\3\10\1\12\2\10",
            "",
            "\1\13",
            "",
            "\4\12\5\uffff\2\12\3\uffff\1\12\1\uffff\3\12\1\14\2\12",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "739:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0_in_ruleFactory100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_entryRulePackageImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__0_in_rulePackageImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceImport194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__0_in_ruleNamespaceImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0_in_ruleNewObject340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_entryRuleMultiValue427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValue434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ValueAssignment_in_ruleReference520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAttribute614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAttribute734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleAttribute794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateAttribute854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullAttribute914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAttribute974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_entryRuleLong1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLong1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Long__Group__0_in_ruleLong1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0_in_ruleDouble1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0_in_ruleDate1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Value__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2__0_in_rule__Value__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_ID_in_rule__ValidID__Alternatives1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__ValidID__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Boolean__Alternatives1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Boolean__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01795 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11856 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__EpackagesAssignment_1_in_rule__Factory__Group__1__Impl1886 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__RootAssignment_2_in_rule__Factory__Group__2__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01980 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageImport__Group__0__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__12042 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__12045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__22102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageImport__Group__2__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__0__Impl_in_rule__NamespaceImport__Group__02167 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__1_in_rule__NamespaceImport__Group__02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamespaceImport__Group__0__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__1__Impl_in_rule__NamespaceImport__Group__12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__ImportedNamespaceAssignment_1_in_rule__NamespaceImport__Group__1__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02290 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12350 = new BitSet(new long[]{0x000000000324E0F0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02476 = new BitSet(new long[]{0x0000000000088070L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12536 = new BitSet(new long[]{0x0000000000088070L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22597 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NewObject__Group__2__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32659 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2689 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NewObject__Group__4__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2__0__Impl_in_rule__Value__Group_2__02789 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Value__Group_2__1_in_rule__Value__Group_2__02792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0__0_in_rule__Value__Group_2__0__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2__1__Impl_in_rule__Value__Group_2__12849 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Value__Group_2__2_in_rule__Value__Group_2__12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__FeaturesAssignment_2_1_in_rule__Value__Group_2__1__Impl2879 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Value__Group_2__2__Impl_in_rule__Value__Group_2__22910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Value__Group_2__3_in_rule__Value__Group_2__22913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Value__Group_2__2__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2__3__Impl_in_rule__Value__Group_2__32972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0__0__Impl_in_rule__Value__Group_2_0__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__0_in_rule__Value__Group_2_0__0__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__0__Impl_in_rule__Value__Group_2_0_0__03097 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__1_in_rule__Value__Group_2_0_0__03100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__1__Impl_in_rule__Value__Group_2_0_0__13158 = new BitSet(new long[]{0x0000000000088070L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__2_in_rule__Value__Group_2_0_0__13161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__EClassAssignment_2_0_0_1_in_rule__Value__Group_2_0_0__1__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__2__Impl_in_rule__Value__Group_2_0_0__23218 = new BitSet(new long[]{0x0000000000088070L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__3_in_rule__Value__Group_2_0_0__23221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__NameAssignment_2_0_0_2_in_rule__Value__Group_2_0_0__2__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2_0_0__3__Impl_in_rule__Value__Group_2_0_0__33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Value__Group_2_0_0__3__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__03346 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__13407 = new BitSet(new long[]{0x000000000364E0F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MultiValue__Group__1__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__23469 = new BitSet(new long[]{0x000000000364E0F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__23472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl3499 = new BitSet(new long[]{0x000000000324E0F2L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__33530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MultiValue__Group__3__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumAttribute__Group__0__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03720 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedNameWithWildcard__Group__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03845 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3931 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03966 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Long__Group__0__Impl_in_rule__Long__Group__04090 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_rule__Long__Group__1_in_rule__Long__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Long__Group__0__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Long__Group__1__Impl_in_rule__Long__Group__14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__Long__Group__1__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__04215 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Double__Group__1_in_rule__Double__Group__04218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_rule__Double__Group__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__14274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Double__Group__2_in_rule__Double__Group__14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Double__Group__1__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__24336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__Double__Group__2__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__0__Impl_in_rule__Date__Group__04398 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Date__Group__1_in_rule__Date__Group__04401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__0__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__1__Impl_in_rule__Date__Group__14457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Date__Group__2_in_rule__Date__Group__14460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Date__Group__1__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__2__Impl_in_rule__Date__Group__24519 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Date__Group__3_in_rule__Date__Group__24522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__2__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__3__Impl_in_rule__Date__Group__34578 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Date__Group__4_in_rule__Date__Group__34581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Date__Group__3__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Date__Group__4__Impl_in_rule__Date__Group__44640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_rule__Date__Group__4__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_rule__Factory__ImportsAssignment_04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_24773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_14808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__NamespaceImport__ImportedNamespaceAssignment_14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_24913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_35014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Value__EClassAssignment_2_0_0_15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__Value__NameAssignment_2_0_0_25084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Value__FeaturesAssignment_2_15115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_25146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_15220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_rule__IntegerAttribute__ValueAssignment5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__DoubleAttribute__ValueAssignment5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_rule__DateAttribute__ValueAssignment5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NullAttribute__ValueAssignment5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__BooleanAttribute__ValueAssignment5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_2__0_in_synpred3_InternalEFactory1490 = new BitSet(new long[]{0x0000000000000002L});

}