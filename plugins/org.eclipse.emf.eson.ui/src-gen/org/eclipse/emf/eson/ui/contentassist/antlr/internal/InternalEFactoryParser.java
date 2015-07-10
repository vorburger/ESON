package org.eclipse.emf.eson.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LONG_ID", "RULE_LONG_UNSIGNED", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'use'", "'.*'", "'import'", "'@Name'", "'{'", "'='", "'}'", "':'", "'['", "']'", "'.'", "'-'", "'NULL'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int RULE_LONG_ID=5;
    public static final int T__14=14;
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
    public String getGrammarFileName() { return "InternalEFactory.g"; }


     
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
    // InternalEFactory.g:61:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // InternalEFactory.g:62:1: ( ruleFactory EOF )
            // InternalEFactory.g:63:1: ruleFactory EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFactory();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:70:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:74:2: ( ( ( rule__Factory__Group__0 ) ) )
            // InternalEFactory.g:75:1: ( ( rule__Factory__Group__0 ) )
            {
            // InternalEFactory.g:75:1: ( ( rule__Factory__Group__0 ) )
            // InternalEFactory.g:76:1: ( rule__Factory__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getGroup()); 
            }
            // InternalEFactory.g:77:1: ( rule__Factory__Group__0 )
            // InternalEFactory.g:77:2: rule__Factory__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:89:1: entryRulePackageImport : rulePackageImport EOF ;
    public final void entryRulePackageImport() throws RecognitionException {
        try {
            // InternalEFactory.g:90:1: ( rulePackageImport EOF )
            // InternalEFactory.g:91:1: rulePackageImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackageImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:98:1: rulePackageImport : ( ( rule__PackageImport__Group__0 ) ) ;
    public final void rulePackageImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:102:2: ( ( ( rule__PackageImport__Group__0 ) ) )
            // InternalEFactory.g:103:1: ( ( rule__PackageImport__Group__0 ) )
            {
            // InternalEFactory.g:103:1: ( ( rule__PackageImport__Group__0 ) )
            // InternalEFactory.g:104:1: ( rule__PackageImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getGroup()); 
            }
            // InternalEFactory.g:105:1: ( rule__PackageImport__Group__0 )
            // InternalEFactory.g:105:2: rule__PackageImport__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:117:1: entryRuleNamespaceImport : ruleNamespaceImport EOF ;
    public final void entryRuleNamespaceImport() throws RecognitionException {
        try {
            // InternalEFactory.g:118:1: ( ruleNamespaceImport EOF )
            // InternalEFactory.g:119:1: ruleNamespaceImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:126:1: ruleNamespaceImport : ( ( rule__NamespaceImport__Group__0 ) ) ;
    public final void ruleNamespaceImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:130:2: ( ( ( rule__NamespaceImport__Group__0 ) ) )
            // InternalEFactory.g:131:1: ( ( rule__NamespaceImport__Group__0 ) )
            {
            // InternalEFactory.g:131:1: ( ( rule__NamespaceImport__Group__0 ) )
            // InternalEFactory.g:132:1: ( rule__NamespaceImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getGroup()); 
            }
            // InternalEFactory.g:133:1: ( rule__NamespaceImport__Group__0 )
            // InternalEFactory.g:133:2: rule__NamespaceImport__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalEFactory.g:145:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalEFactory.g:146:1: ( ruleAnnotation EOF )
            // InternalEFactory.g:147:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalEFactory.g:154:1: ruleAnnotation : ( ruleCustomNameMapping ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:158:2: ( ( ruleCustomNameMapping ) )
            // InternalEFactory.g:159:1: ( ruleCustomNameMapping )
            {
            // InternalEFactory.g:159:1: ( ruleCustomNameMapping )
            // InternalEFactory.g:160:1: ruleCustomNameMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCustomNameMappingParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCustomNameMappingParserRuleCall()); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCustomNameMapping"
    // InternalEFactory.g:173:1: entryRuleCustomNameMapping : ruleCustomNameMapping EOF ;
    public final void entryRuleCustomNameMapping() throws RecognitionException {
        try {
            // InternalEFactory.g:174:1: ( ruleCustomNameMapping EOF )
            // InternalEFactory.g:175:1: ruleCustomNameMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCustomNameMapping"


    // $ANTLR start "ruleCustomNameMapping"
    // InternalEFactory.g:182:1: ruleCustomNameMapping : ( ( rule__CustomNameMapping__Group__0 ) ) ;
    public final void ruleCustomNameMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:186:2: ( ( ( rule__CustomNameMapping__Group__0 ) ) )
            // InternalEFactory.g:187:1: ( ( rule__CustomNameMapping__Group__0 ) )
            {
            // InternalEFactory.g:187:1: ( ( rule__CustomNameMapping__Group__0 ) )
            // InternalEFactory.g:188:1: ( rule__CustomNameMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getGroup()); 
            }
            // InternalEFactory.g:189:1: ( rule__CustomNameMapping__Group__0 )
            // InternalEFactory.g:189:2: rule__CustomNameMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getGroup()); 
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
    // $ANTLR end "ruleCustomNameMapping"


    // $ANTLR start "entryRuleFeature"
    // InternalEFactory.g:201:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalEFactory.g:202:1: ( ruleFeature EOF )
            // InternalEFactory.g:203:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:210:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:214:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalEFactory.g:215:1: ( ( rule__Feature__Group__0 ) )
            {
            // InternalEFactory.g:215:1: ( ( rule__Feature__Group__0 ) )
            // InternalEFactory.g:216:1: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // InternalEFactory.g:217:1: ( rule__Feature__Group__0 )
            // InternalEFactory.g:217:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:229:1: entryRuleNewObject : ruleNewObject EOF ;
    public final void entryRuleNewObject() throws RecognitionException {
        try {
            // InternalEFactory.g:230:1: ( ruleNewObject EOF )
            // InternalEFactory.g:231:1: ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:238:1: ruleNewObject : ( ( rule__NewObject__Group__0 ) ) ;
    public final void ruleNewObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:242:2: ( ( ( rule__NewObject__Group__0 ) ) )
            // InternalEFactory.g:243:1: ( ( rule__NewObject__Group__0 ) )
            {
            // InternalEFactory.g:243:1: ( ( rule__NewObject__Group__0 ) )
            // InternalEFactory.g:244:1: ( rule__NewObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getGroup()); 
            }
            // InternalEFactory.g:245:1: ( rule__NewObject__Group__0 )
            // InternalEFactory.g:245:2: rule__NewObject__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:257:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalEFactory.g:258:1: ( ruleValue EOF )
            // InternalEFactory.g:259:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:266:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:270:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalEFactory.g:271:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalEFactory.g:271:1: ( ( rule__Value__Alternatives ) )
            // InternalEFactory.g:272:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalEFactory.g:273:1: ( rule__Value__Alternatives )
            // InternalEFactory.g:273:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:285:1: entryRuleMultiValue : ruleMultiValue EOF ;
    public final void entryRuleMultiValue() throws RecognitionException {
        try {
            // InternalEFactory.g:286:1: ( ruleMultiValue EOF )
            // InternalEFactory.g:287:1: ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:294:1: ruleMultiValue : ( ( rule__MultiValue__Group__0 ) ) ;
    public final void ruleMultiValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:298:2: ( ( ( rule__MultiValue__Group__0 ) ) )
            // InternalEFactory.g:299:1: ( ( rule__MultiValue__Group__0 ) )
            {
            // InternalEFactory.g:299:1: ( ( rule__MultiValue__Group__0 ) )
            // InternalEFactory.g:300:1: ( rule__MultiValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getGroup()); 
            }
            // InternalEFactory.g:301:1: ( rule__MultiValue__Group__0 )
            // InternalEFactory.g:301:2: rule__MultiValue__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:313:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalEFactory.g:314:1: ( ruleReference EOF )
            // InternalEFactory.g:315:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:322:1: ruleReference : ( ( rule__Reference__ValueAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:326:2: ( ( ( rule__Reference__ValueAssignment ) ) )
            // InternalEFactory.g:327:1: ( ( rule__Reference__ValueAssignment ) )
            {
            // InternalEFactory.g:327:1: ( ( rule__Reference__ValueAssignment ) )
            // InternalEFactory.g:328:1: ( rule__Reference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:329:1: ( rule__Reference__ValueAssignment )
            // InternalEFactory.g:329:2: rule__Reference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:342:1: ( ruleAttribute EOF )
            // InternalEFactory.g:343:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:350:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:354:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalEFactory.g:355:1: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalEFactory.g:355:1: ( ( rule__Attribute__Alternatives ) )
            // InternalEFactory.g:356:1: ( rule__Attribute__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAlternatives()); 
            }
            // InternalEFactory.g:357:1: ( rule__Attribute__Alternatives )
            // InternalEFactory.g:357:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:369:1: entryRuleEnumAttribute : ruleEnumAttribute EOF ;
    public final void entryRuleEnumAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:370:1: ( ruleEnumAttribute EOF )
            // InternalEFactory.g:371:1: ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:378:1: ruleEnumAttribute : ( ( rule__EnumAttribute__Group__0 ) ) ;
    public final void ruleEnumAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:382:2: ( ( ( rule__EnumAttribute__Group__0 ) ) )
            // InternalEFactory.g:383:1: ( ( rule__EnumAttribute__Group__0 ) )
            {
            // InternalEFactory.g:383:1: ( ( rule__EnumAttribute__Group__0 ) )
            // InternalEFactory.g:384:1: ( rule__EnumAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getGroup()); 
            }
            // InternalEFactory.g:385:1: ( rule__EnumAttribute__Group__0 )
            // InternalEFactory.g:385:2: rule__EnumAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:397:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:398:1: ( ruleStringAttribute EOF )
            // InternalEFactory.g:399:1: ruleStringAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:406:1: ruleStringAttribute : ( ( rule__StringAttribute__ValueAssignment ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:410:2: ( ( ( rule__StringAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:411:1: ( ( rule__StringAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:411:1: ( ( rule__StringAttribute__ValueAssignment ) )
            // InternalEFactory.g:412:1: ( rule__StringAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:413:1: ( rule__StringAttribute__ValueAssignment )
            // InternalEFactory.g:413:2: rule__StringAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:425:1: entryRuleIntegerAttribute : ruleIntegerAttribute EOF ;
    public final void entryRuleIntegerAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:426:1: ( ruleIntegerAttribute EOF )
            // InternalEFactory.g:427:1: ruleIntegerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntegerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:434:1: ruleIntegerAttribute : ( ( rule__IntegerAttribute__ValueAssignment ) ) ;
    public final void ruleIntegerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:438:2: ( ( ( rule__IntegerAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:439:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:439:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            // InternalEFactory.g:440:1: ( rule__IntegerAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:441:1: ( rule__IntegerAttribute__ValueAssignment )
            // InternalEFactory.g:441:2: rule__IntegerAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:453:1: entryRuleDoubleAttribute : ruleDoubleAttribute EOF ;
    public final void entryRuleDoubleAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:454:1: ( ruleDoubleAttribute EOF )
            // InternalEFactory.g:455:1: ruleDoubleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDoubleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:462:1: ruleDoubleAttribute : ( ( rule__DoubleAttribute__ValueAssignment ) ) ;
    public final void ruleDoubleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:466:2: ( ( ( rule__DoubleAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:467:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:467:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            // InternalEFactory.g:468:1: ( rule__DoubleAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:469:1: ( rule__DoubleAttribute__ValueAssignment )
            // InternalEFactory.g:469:2: rule__DoubleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:481:1: entryRuleDateAttribute : ruleDateAttribute EOF ;
    public final void entryRuleDateAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:482:1: ( ruleDateAttribute EOF )
            // InternalEFactory.g:483:1: ruleDateAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDateAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:490:1: ruleDateAttribute : ( ( rule__DateAttribute__ValueAssignment ) ) ;
    public final void ruleDateAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:494:2: ( ( ( rule__DateAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:495:1: ( ( rule__DateAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:495:1: ( ( rule__DateAttribute__ValueAssignment ) )
            // InternalEFactory.g:496:1: ( rule__DateAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:497:1: ( rule__DateAttribute__ValueAssignment )
            // InternalEFactory.g:497:2: rule__DateAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:509:1: entryRuleNullAttribute : ruleNullAttribute EOF ;
    public final void entryRuleNullAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:510:1: ( ruleNullAttribute EOF )
            // InternalEFactory.g:511:1: ruleNullAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:518:1: ruleNullAttribute : ( ( rule__NullAttribute__ValueAssignment ) ) ;
    public final void ruleNullAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:522:2: ( ( ( rule__NullAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:523:1: ( ( rule__NullAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:523:1: ( ( rule__NullAttribute__ValueAssignment ) )
            // InternalEFactory.g:524:1: ( rule__NullAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:525:1: ( rule__NullAttribute__ValueAssignment )
            // InternalEFactory.g:525:2: rule__NullAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:537:1: entryRuleBooleanAttribute : ruleBooleanAttribute EOF ;
    public final void entryRuleBooleanAttribute() throws RecognitionException {
        try {
            // InternalEFactory.g:538:1: ( ruleBooleanAttribute EOF )
            // InternalEFactory.g:539:1: ruleBooleanAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:546:1: ruleBooleanAttribute : ( ( rule__BooleanAttribute__ValueAssignment ) ) ;
    public final void ruleBooleanAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:550:2: ( ( ( rule__BooleanAttribute__ValueAssignment ) ) )
            // InternalEFactory.g:551:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            {
            // InternalEFactory.g:551:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            // InternalEFactory.g:552:1: ( rule__BooleanAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueAssignment()); 
            }
            // InternalEFactory.g:553:1: ( rule__BooleanAttribute__ValueAssignment )
            // InternalEFactory.g:553:2: rule__BooleanAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:565:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalEFactory.g:566:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalEFactory.g:567:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:574:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:578:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalEFactory.g:579:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalEFactory.g:579:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalEFactory.g:580:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalEFactory.g:581:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalEFactory.g:581:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:593:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEFactory.g:594:1: ( ruleQualifiedName EOF )
            // InternalEFactory.g:595:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:602:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:606:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEFactory.g:607:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEFactory.g:607:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEFactory.g:608:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalEFactory.g:609:1: ( rule__QualifiedName__Group__0 )
            // InternalEFactory.g:609:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:621:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalEFactory.g:622:1: ( ruleValidID EOF )
            // InternalEFactory.g:623:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:630:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:634:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalEFactory.g:635:1: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalEFactory.g:635:1: ( ( rule__ValidID__Alternatives ) )
            // InternalEFactory.g:636:1: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // InternalEFactory.g:637:1: ( rule__ValidID__Alternatives )
            // InternalEFactory.g:637:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:649:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalEFactory.g:650:1: ( ruleBoolean EOF )
            // InternalEFactory.g:651:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:658:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:662:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalEFactory.g:663:1: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalEFactory.g:663:1: ( ( rule__Boolean__Alternatives ) )
            // InternalEFactory.g:664:1: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalEFactory.g:665:1: ( rule__Boolean__Alternatives )
            // InternalEFactory.g:665:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:677:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalEFactory.g:678:1: ( ruleLong EOF )
            // InternalEFactory.g:679:1: ruleLong EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLongRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:686:1: ruleLong : ( ( rule__Long__Group__0 ) ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:690:2: ( ( ( rule__Long__Group__0 ) ) )
            // InternalEFactory.g:691:1: ( ( rule__Long__Group__0 ) )
            {
            // InternalEFactory.g:691:1: ( ( rule__Long__Group__0 ) )
            // InternalEFactory.g:692:1: ( rule__Long__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getGroup()); 
            }
            // InternalEFactory.g:693:1: ( rule__Long__Group__0 )
            // InternalEFactory.g:693:2: rule__Long__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:705:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalEFactory.g:706:1: ( ruleDouble EOF )
            // InternalEFactory.g:707:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:714:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:718:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalEFactory.g:719:1: ( ( rule__Double__Group__0 ) )
            {
            // InternalEFactory.g:719:1: ( ( rule__Double__Group__0 ) )
            // InternalEFactory.g:720:1: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // InternalEFactory.g:721:1: ( rule__Double__Group__0 )
            // InternalEFactory.g:721:2: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:733:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalEFactory.g:734:1: ( ruleDate EOF )
            // InternalEFactory.g:735:1: ruleDate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:742:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:746:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalEFactory.g:747:1: ( ( rule__Date__Group__0 ) )
            {
            // InternalEFactory.g:747:1: ( ( rule__Date__Group__0 ) )
            // InternalEFactory.g:748:1: ( rule__Date__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getGroup()); 
            }
            // InternalEFactory.g:749:1: ( rule__Date__Group__0 )
            // InternalEFactory.g:749:2: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:761:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( rule__Value__Group_2__0 ) ) | ( ( ruleReference ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:765:1: ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( rule__Value__Group_2__0 ) ) | ( ( ruleReference ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case 13:
            case 14:
            case 22:
            case 26:
            case 27:
                {
                alt1=2;
                }
                break;
            case RULE_LONG_UNSIGNED:
                {
                int LA1_3 = input.LA(2);

                if ( (synpred2_InternalEFactory()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalEFactory()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_4 = input.LA(2);

                if ( (synpred3_InternalEFactory()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LONG_ID:
                {
                int LA1_5 = input.LA(2);

                if ( (synpred3_InternalEFactory()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEFactory.g:766:1: ( ruleMultiValue )
                    {
                    // InternalEFactory.g:766:1: ( ruleMultiValue )
                    // InternalEFactory.g:767:1: ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:772:6: ( ruleAttribute )
                    {
                    // InternalEFactory.g:772:6: ( ruleAttribute )
                    // InternalEFactory.g:773:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:778:6: ( ( rule__Value__Group_2__0 ) )
                    {
                    // InternalEFactory.g:778:6: ( ( rule__Value__Group_2__0 ) )
                    // InternalEFactory.g:779:1: ( rule__Value__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getGroup_2()); 
                    }
                    // InternalEFactory.g:780:1: ( rule__Value__Group_2__0 )
                    // InternalEFactory.g:780:2: rule__Value__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:784:6: ( ( ruleReference ) )
                    {
                    // InternalEFactory.g:784:6: ( ( ruleReference ) )
                    // InternalEFactory.g:785:1: ( ruleReference )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    }
                    // InternalEFactory.g:786:1: ( ruleReference )
                    // InternalEFactory.g:786:3: ruleReference
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:795:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:799:1: ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEFactory.g:800:1: ( ruleEnumAttribute )
                    {
                    // InternalEFactory.g:800:1: ( ruleEnumAttribute )
                    // InternalEFactory.g:801:1: ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:806:6: ( ruleStringAttribute )
                    {
                    // InternalEFactory.g:806:6: ( ruleStringAttribute )
                    // InternalEFactory.g:807:1: ruleStringAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:812:6: ( ruleIntegerAttribute )
                    {
                    // InternalEFactory.g:812:6: ( ruleIntegerAttribute )
                    // InternalEFactory.g:813:1: ruleIntegerAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:818:6: ( ruleBooleanAttribute )
                    {
                    // InternalEFactory.g:818:6: ( ruleBooleanAttribute )
                    // InternalEFactory.g:819:1: ruleBooleanAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:824:6: ( ruleDoubleAttribute )
                    {
                    // InternalEFactory.g:824:6: ( ruleDoubleAttribute )
                    // InternalEFactory.g:825:1: ruleDoubleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:830:6: ( ruleDateAttribute )
                    {
                    // InternalEFactory.g:830:6: ( ruleDateAttribute )
                    // InternalEFactory.g:831:1: ruleDateAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalEFactory.g:836:6: ( ruleNullAttribute )
                    {
                    // InternalEFactory.g:836:6: ( ruleNullAttribute )
                    // InternalEFactory.g:837:1: ruleNullAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:847:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( RULE_LONG_ID ) | ( RULE_LONG_UNSIGNED ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:851:1: ( ( RULE_ID ) | ( RULE_LONG_ID ) | ( RULE_LONG_UNSIGNED ) )
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
                    // InternalEFactory.g:852:1: ( RULE_ID )
                    {
                    // InternalEFactory.g:852:1: ( RULE_ID )
                    // InternalEFactory.g:853:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEFactory.g:858:6: ( RULE_LONG_ID )
                    {
                    // InternalEFactory.g:858:6: ( RULE_LONG_ID )
                    // InternalEFactory.g:859:1: RULE_LONG_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONG_IDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_LONG_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getLONG_IDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEFactory.g:864:6: ( RULE_LONG_UNSIGNED )
                    {
                    // InternalEFactory.g:864:6: ( RULE_LONG_UNSIGNED )
                    // InternalEFactory.g:865:1: RULE_LONG_UNSIGNED
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                    }
                    match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:875:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:879:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalEFactory.g:880:1: ( 'true' )
                    {
                    // InternalEFactory.g:880:1: ( 'true' )
                    // InternalEFactory.g:881:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEFactory.g:888:6: ( 'false' )
                    {
                    // InternalEFactory.g:888:6: ( 'false' )
                    // InternalEFactory.g:889:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:903:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:907:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // InternalEFactory.g:908:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Factory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:915:1: rule__Factory__Group__0__Impl : ( ( rule__Factory__ImportsAssignment_0 )* ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:919:1: ( ( ( rule__Factory__ImportsAssignment_0 )* ) )
            // InternalEFactory.g:920:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            {
            // InternalEFactory.g:920:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            // InternalEFactory.g:921:1: ( rule__Factory__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 
            }
            // InternalEFactory.g:922:1: ( rule__Factory__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEFactory.g:922:2: rule__Factory__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalEFactory.g:932:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:936:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // InternalEFactory.g:937:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Factory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:944:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__EpackagesAssignment_1 )* ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:948:1: ( ( ( rule__Factory__EpackagesAssignment_1 )* ) )
            // InternalEFactory.g:949:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            {
            // InternalEFactory.g:949:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            // InternalEFactory.g:950:1: ( rule__Factory__EpackagesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesAssignment_1()); 
            }
            // InternalEFactory.g:951:1: ( rule__Factory__EpackagesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEFactory.g:951:2: rule__Factory__EpackagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalEFactory.g:961:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl rule__Factory__Group__3 ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:965:1: ( rule__Factory__Group__2__Impl rule__Factory__Group__3 )
            // InternalEFactory.g:966:2: rule__Factory__Group__2__Impl rule__Factory__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Factory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Factory__Group__3();

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
    // InternalEFactory.g:973:1: rule__Factory__Group__2__Impl : ( ( rule__Factory__AnnotationsAssignment_2 )* ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:977:1: ( ( ( rule__Factory__AnnotationsAssignment_2 )* ) )
            // InternalEFactory.g:978:1: ( ( rule__Factory__AnnotationsAssignment_2 )* )
            {
            // InternalEFactory.g:978:1: ( ( rule__Factory__AnnotationsAssignment_2 )* )
            // InternalEFactory.g:979:1: ( rule__Factory__AnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAssignment_2()); 
            }
            // InternalEFactory.g:980:1: ( rule__Factory__AnnotationsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEFactory.g:980:2: rule__Factory__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Factory__AnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getAnnotationsAssignment_2()); 
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


    // $ANTLR start "rule__Factory__Group__3"
    // InternalEFactory.g:990:1: rule__Factory__Group__3 : rule__Factory__Group__3__Impl ;
    public final void rule__Factory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:994:1: ( rule__Factory__Group__3__Impl )
            // InternalEFactory.g:995:2: rule__Factory__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__3__Impl();

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
    // $ANTLR end "rule__Factory__Group__3"


    // $ANTLR start "rule__Factory__Group__3__Impl"
    // InternalEFactory.g:1001:1: rule__Factory__Group__3__Impl : ( ( rule__Factory__RootAssignment_3 ) ) ;
    public final void rule__Factory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1005:1: ( ( ( rule__Factory__RootAssignment_3 ) ) )
            // InternalEFactory.g:1006:1: ( ( rule__Factory__RootAssignment_3 ) )
            {
            // InternalEFactory.g:1006:1: ( ( rule__Factory__RootAssignment_3 ) )
            // InternalEFactory.g:1007:1: ( rule__Factory__RootAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootAssignment_3()); 
            }
            // InternalEFactory.g:1008:1: ( rule__Factory__RootAssignment_3 )
            // InternalEFactory.g:1008:2: rule__Factory__RootAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Factory__RootAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getRootAssignment_3()); 
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
    // $ANTLR end "rule__Factory__Group__3__Impl"


    // $ANTLR start "rule__PackageImport__Group__0"
    // InternalEFactory.g:1026:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1030:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // InternalEFactory.g:1031:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PackageImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1038:1: rule__PackageImport__Group__0__Impl : ( 'use' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1042:1: ( ( 'use' ) )
            // InternalEFactory.g:1043:1: ( 'use' )
            {
            // InternalEFactory.g:1043:1: ( 'use' )
            // InternalEFactory.g:1044:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getUseKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1057:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1061:1: ( rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 )
            // InternalEFactory.g:1062:2: rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1069:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__EPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1073:1: ( ( ( rule__PackageImport__EPackageAssignment_1 ) ) )
            // InternalEFactory.g:1074:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            {
            // InternalEFactory.g:1074:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            // InternalEFactory.g:1075:1: ( rule__PackageImport__EPackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageAssignment_1()); 
            }
            // InternalEFactory.g:1076:1: ( rule__PackageImport__EPackageAssignment_1 )
            // InternalEFactory.g:1076:2: rule__PackageImport__EPackageAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1086:1: rule__PackageImport__Group__2 : rule__PackageImport__Group__2__Impl ;
    public final void rule__PackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1090:1: ( rule__PackageImport__Group__2__Impl )
            // InternalEFactory.g:1091:2: rule__PackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1097:1: rule__PackageImport__Group__2__Impl : ( '.*' ) ;
    public final void rule__PackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1101:1: ( ( '.*' ) )
            // InternalEFactory.g:1102:1: ( '.*' )
            {
            // InternalEFactory.g:1102:1: ( '.*' )
            // InternalEFactory.g:1103:1: '.*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1122:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1126:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // InternalEFactory.g:1127:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NamespaceImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1134:1: rule__NamespaceImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1138:1: ( ( 'import' ) )
            // InternalEFactory.g:1139:1: ( 'import' )
            {
            // InternalEFactory.g:1139:1: ( 'import' )
            // InternalEFactory.g:1140:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1153:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1157:1: ( rule__NamespaceImport__Group__1__Impl )
            // InternalEFactory.g:1158:2: rule__NamespaceImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1164:1: rule__NamespaceImport__Group__1__Impl : ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1168:1: ( ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalEFactory.g:1169:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalEFactory.g:1169:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            // InternalEFactory.g:1170:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalEFactory.g:1171:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            // InternalEFactory.g:1171:2: rule__NamespaceImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__CustomNameMapping__Group__0"
    // InternalEFactory.g:1185:1: rule__CustomNameMapping__Group__0 : rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 ;
    public final void rule__CustomNameMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1189:1: ( rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 )
            // InternalEFactory.g:1190:2: rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CustomNameMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__1();

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
    // $ANTLR end "rule__CustomNameMapping__Group__0"


    // $ANTLR start "rule__CustomNameMapping__Group__0__Impl"
    // InternalEFactory.g:1197:1: rule__CustomNameMapping__Group__0__Impl : ( '@Name' ) ;
    public final void rule__CustomNameMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1201:1: ( ( '@Name' ) )
            // InternalEFactory.g:1202:1: ( '@Name' )
            {
            // InternalEFactory.g:1202:1: ( '@Name' )
            // InternalEFactory.g:1203:1: '@Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getNameKeyword_0()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__0__Impl"


    // $ANTLR start "rule__CustomNameMapping__Group__1"
    // InternalEFactory.g:1216:1: rule__CustomNameMapping__Group__1 : rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 ;
    public final void rule__CustomNameMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1220:1: ( rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 )
            // InternalEFactory.g:1221:2: rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CustomNameMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__2();

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
    // $ANTLR end "rule__CustomNameMapping__Group__1"


    // $ANTLR start "rule__CustomNameMapping__Group__1__Impl"
    // InternalEFactory.g:1228:1: rule__CustomNameMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomNameMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1232:1: ( ( '{' ) )
            // InternalEFactory.g:1233:1: ( '{' )
            {
            // InternalEFactory.g:1233:1: ( '{' )
            // InternalEFactory.g:1234:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__1__Impl"


    // $ANTLR start "rule__CustomNameMapping__Group__2"
    // InternalEFactory.g:1247:1: rule__CustomNameMapping__Group__2 : rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 ;
    public final void rule__CustomNameMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1251:1: ( rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 )
            // InternalEFactory.g:1252:2: rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CustomNameMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__3();

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
    // $ANTLR end "rule__CustomNameMapping__Group__2"


    // $ANTLR start "rule__CustomNameMapping__Group__2__Impl"
    // InternalEFactory.g:1259:1: rule__CustomNameMapping__Group__2__Impl : ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) ;
    public final void rule__CustomNameMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1263:1: ( ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) )
            // InternalEFactory.g:1264:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            {
            // InternalEFactory.g:1264:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            // InternalEFactory.g:1265:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassAssignment_2()); 
            }
            // InternalEFactory.g:1266:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            // InternalEFactory.g:1266:2: rule__CustomNameMapping__EClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__EClassAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getEClassAssignment_2()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__2__Impl"


    // $ANTLR start "rule__CustomNameMapping__Group__3"
    // InternalEFactory.g:1276:1: rule__CustomNameMapping__Group__3 : rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 ;
    public final void rule__CustomNameMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1280:1: ( rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 )
            // InternalEFactory.g:1281:2: rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__CustomNameMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__4();

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
    // $ANTLR end "rule__CustomNameMapping__Group__3"


    // $ANTLR start "rule__CustomNameMapping__Group__3__Impl"
    // InternalEFactory.g:1288:1: rule__CustomNameMapping__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomNameMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1292:1: ( ( '=' ) )
            // InternalEFactory.g:1293:1: ( '=' )
            {
            // InternalEFactory.g:1293:1: ( '=' )
            // InternalEFactory.g:1294:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__3__Impl"


    // $ANTLR start "rule__CustomNameMapping__Group__4"
    // InternalEFactory.g:1307:1: rule__CustomNameMapping__Group__4 : rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 ;
    public final void rule__CustomNameMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1311:1: ( rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 )
            // InternalEFactory.g:1312:2: rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CustomNameMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__5();

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
    // $ANTLR end "rule__CustomNameMapping__Group__4"


    // $ANTLR start "rule__CustomNameMapping__Group__4__Impl"
    // InternalEFactory.g:1319:1: rule__CustomNameMapping__Group__4__Impl : ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) ;
    public final void rule__CustomNameMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1323:1: ( ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) )
            // InternalEFactory.g:1324:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            {
            // InternalEFactory.g:1324:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            // InternalEFactory.g:1325:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureAssignment_4()); 
            }
            // InternalEFactory.g:1326:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            // InternalEFactory.g:1326:2: rule__CustomNameMapping__NameFeatureAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__NameFeatureAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getNameFeatureAssignment_4()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__4__Impl"


    // $ANTLR start "rule__CustomNameMapping__Group__5"
    // InternalEFactory.g:1336:1: rule__CustomNameMapping__Group__5 : rule__CustomNameMapping__Group__5__Impl ;
    public final void rule__CustomNameMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1340:1: ( rule__CustomNameMapping__Group__5__Impl )
            // InternalEFactory.g:1341:2: rule__CustomNameMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomNameMapping__Group__5__Impl();

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
    // $ANTLR end "rule__CustomNameMapping__Group__5"


    // $ANTLR start "rule__CustomNameMapping__Group__5__Impl"
    // InternalEFactory.g:1347:1: rule__CustomNameMapping__Group__5__Impl : ( '}' ) ;
    public final void rule__CustomNameMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1351:1: ( ( '}' ) )
            // InternalEFactory.g:1352:1: ( '}' )
            {
            // InternalEFactory.g:1352:1: ( '}' )
            // InternalEFactory.g:1353:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__CustomNameMapping__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalEFactory.g:1378:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1382:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalEFactory.g:1383:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1390:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__EFeatureAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1394:1: ( ( ( rule__Feature__EFeatureAssignment_0 ) ) )
            // InternalEFactory.g:1395:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            {
            // InternalEFactory.g:1395:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            // InternalEFactory.g:1396:1: ( rule__Feature__EFeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
            }
            // InternalEFactory.g:1397:1: ( rule__Feature__EFeatureAssignment_0 )
            // InternalEFactory.g:1397:2: rule__Feature__EFeatureAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1407:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1411:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalEFactory.g:1412:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1419:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1423:1: ( ( ':' ) )
            // InternalEFactory.g:1424:1: ( ':' )
            {
            // InternalEFactory.g:1424:1: ( ':' )
            // InternalEFactory.g:1425:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1438:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1442:1: ( rule__Feature__Group__2__Impl )
            // InternalEFactory.g:1443:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1449:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1453:1: ( ( ( rule__Feature__ValueAssignment_2 )? ) )
            // InternalEFactory.g:1454:1: ( ( rule__Feature__ValueAssignment_2 )? )
            {
            // InternalEFactory.g:1454:1: ( ( rule__Feature__ValueAssignment_2 )? )
            // InternalEFactory.g:1455:1: ( rule__Feature__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            }
            // InternalEFactory.g:1456:1: ( rule__Feature__ValueAssignment_2 )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEFactory.g:1456:2: rule__Feature__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1472:1: rule__NewObject__Group__0 : rule__NewObject__Group__0__Impl rule__NewObject__Group__1 ;
    public final void rule__NewObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1476:1: ( rule__NewObject__Group__0__Impl rule__NewObject__Group__1 )
            // InternalEFactory.g:1477:2: rule__NewObject__Group__0__Impl rule__NewObject__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__NewObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1484:1: rule__NewObject__Group__0__Impl : ( ( rule__NewObject__EClassAssignment_0 ) ) ;
    public final void rule__NewObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1488:1: ( ( ( rule__NewObject__EClassAssignment_0 ) ) )
            // InternalEFactory.g:1489:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            {
            // InternalEFactory.g:1489:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            // InternalEFactory.g:1490:1: ( rule__NewObject__EClassAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
            }
            // InternalEFactory.g:1491:1: ( rule__NewObject__EClassAssignment_0 )
            // InternalEFactory.g:1491:2: rule__NewObject__EClassAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1501:1: rule__NewObject__Group__1 : rule__NewObject__Group__1__Impl rule__NewObject__Group__2 ;
    public final void rule__NewObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1505:1: ( rule__NewObject__Group__1__Impl rule__NewObject__Group__2 )
            // InternalEFactory.g:1506:2: rule__NewObject__Group__1__Impl rule__NewObject__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__NewObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1513:1: rule__NewObject__Group__1__Impl : ( ( rule__NewObject__NameAssignment_1 )? ) ;
    public final void rule__NewObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1517:1: ( ( ( rule__NewObject__NameAssignment_1 )? ) )
            // InternalEFactory.g:1518:1: ( ( rule__NewObject__NameAssignment_1 )? )
            {
            // InternalEFactory.g:1518:1: ( ( rule__NewObject__NameAssignment_1 )? )
            // InternalEFactory.g:1519:1: ( rule__NewObject__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
            }
            // InternalEFactory.g:1520:1: ( rule__NewObject__NameAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_LONG_UNSIGNED)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEFactory.g:1520:2: rule__NewObject__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1530:1: rule__NewObject__Group__2 : rule__NewObject__Group__2__Impl rule__NewObject__Group__3 ;
    public final void rule__NewObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1534:1: ( rule__NewObject__Group__2__Impl rule__NewObject__Group__3 )
            // InternalEFactory.g:1535:2: rule__NewObject__Group__2__Impl rule__NewObject__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__NewObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1542:1: rule__NewObject__Group__2__Impl : ( '{' ) ;
    public final void rule__NewObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1546:1: ( ( '{' ) )
            // InternalEFactory.g:1547:1: ( '{' )
            {
            // InternalEFactory.g:1547:1: ( '{' )
            // InternalEFactory.g:1548:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1561:1: rule__NewObject__Group__3 : rule__NewObject__Group__3__Impl rule__NewObject__Group__4 ;
    public final void rule__NewObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1565:1: ( rule__NewObject__Group__3__Impl rule__NewObject__Group__4 )
            // InternalEFactory.g:1566:2: rule__NewObject__Group__3__Impl rule__NewObject__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__NewObject__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1573:1: rule__NewObject__Group__3__Impl : ( ( rule__NewObject__FeaturesAssignment_3 )* ) ;
    public final void rule__NewObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1577:1: ( ( ( rule__NewObject__FeaturesAssignment_3 )* ) )
            // InternalEFactory.g:1578:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            {
            // InternalEFactory.g:1578:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            // InternalEFactory.g:1579:1: ( rule__NewObject__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
            }
            // InternalEFactory.g:1580:1: ( rule__NewObject__FeaturesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_LONG_UNSIGNED)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEFactory.g:1580:2: rule__NewObject__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__NewObject__FeaturesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalEFactory.g:1590:1: rule__NewObject__Group__4 : rule__NewObject__Group__4__Impl ;
    public final void rule__NewObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1594:1: ( rule__NewObject__Group__4__Impl )
            // InternalEFactory.g:1595:2: rule__NewObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1601:1: rule__NewObject__Group__4__Impl : ( '}' ) ;
    public final void rule__NewObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1605:1: ( ( '}' ) )
            // InternalEFactory.g:1606:1: ( '}' )
            {
            // InternalEFactory.g:1606:1: ( '}' )
            // InternalEFactory.g:1607:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1630:1: rule__Value__Group_2__0 : rule__Value__Group_2__0__Impl rule__Value__Group_2__1 ;
    public final void rule__Value__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1634:1: ( rule__Value__Group_2__0__Impl rule__Value__Group_2__1 )
            // InternalEFactory.g:1635:2: rule__Value__Group_2__0__Impl rule__Value__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Value__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1642:1: rule__Value__Group_2__0__Impl : ( ( rule__Value__Group_2_0__0 ) ) ;
    public final void rule__Value__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1646:1: ( ( ( rule__Value__Group_2_0__0 ) ) )
            // InternalEFactory.g:1647:1: ( ( rule__Value__Group_2_0__0 ) )
            {
            // InternalEFactory.g:1647:1: ( ( rule__Value__Group_2_0__0 ) )
            // InternalEFactory.g:1648:1: ( rule__Value__Group_2_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getGroup_2_0()); 
            }
            // InternalEFactory.g:1649:1: ( rule__Value__Group_2_0__0 )
            // InternalEFactory.g:1649:2: rule__Value__Group_2_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1659:1: rule__Value__Group_2__1 : rule__Value__Group_2__1__Impl rule__Value__Group_2__2 ;
    public final void rule__Value__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1663:1: ( rule__Value__Group_2__1__Impl rule__Value__Group_2__2 )
            // InternalEFactory.g:1664:2: rule__Value__Group_2__1__Impl rule__Value__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Value__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1671:1: rule__Value__Group_2__1__Impl : ( ( rule__Value__FeaturesAssignment_2_1 )* ) ;
    public final void rule__Value__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1675:1: ( ( ( rule__Value__FeaturesAssignment_2_1 )* ) )
            // InternalEFactory.g:1676:1: ( ( rule__Value__FeaturesAssignment_2_1 )* )
            {
            // InternalEFactory.g:1676:1: ( ( rule__Value__FeaturesAssignment_2_1 )* )
            // InternalEFactory.g:1677:1: ( rule__Value__FeaturesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFeaturesAssignment_2_1()); 
            }
            // InternalEFactory.g:1678:1: ( rule__Value__FeaturesAssignment_2_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_LONG_UNSIGNED)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEFactory.g:1678:2: rule__Value__FeaturesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Value__FeaturesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalEFactory.g:1688:1: rule__Value__Group_2__2 : rule__Value__Group_2__2__Impl rule__Value__Group_2__3 ;
    public final void rule__Value__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1692:1: ( rule__Value__Group_2__2__Impl rule__Value__Group_2__3 )
            // InternalEFactory.g:1693:2: rule__Value__Group_2__2__Impl rule__Value__Group_2__3
            {
            pushFollow(FOLLOW_1);
            rule__Value__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1700:1: rule__Value__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Value__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1704:1: ( ( '}' ) )
            // InternalEFactory.g:1705:1: ( '}' )
            {
            // InternalEFactory.g:1705:1: ( '}' )
            // InternalEFactory.g:1706:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1719:1: rule__Value__Group_2__3 : rule__Value__Group_2__3__Impl ;
    public final void rule__Value__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1723:1: ( rule__Value__Group_2__3__Impl )
            // InternalEFactory.g:1724:2: rule__Value__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1730:1: rule__Value__Group_2__3__Impl : ( () ) ;
    public final void rule__Value__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1734:1: ( ( () ) )
            // InternalEFactory.g:1735:1: ( () )
            {
            // InternalEFactory.g:1735:1: ( () )
            // InternalEFactory.g:1736:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getContainmentValueAction_2_3()); 
            }
            // InternalEFactory.g:1737:1: ()
            // InternalEFactory.g:1739:1: 
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
    // InternalEFactory.g:1757:1: rule__Value__Group_2_0__0 : rule__Value__Group_2_0__0__Impl ;
    public final void rule__Value__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1761:1: ( rule__Value__Group_2_0__0__Impl )
            // InternalEFactory.g:1762:2: rule__Value__Group_2_0__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1768:1: rule__Value__Group_2_0__0__Impl : ( ( rule__Value__Group_2_0_0__0 ) ) ;
    public final void rule__Value__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1772:1: ( ( ( rule__Value__Group_2_0_0__0 ) ) )
            // InternalEFactory.g:1773:1: ( ( rule__Value__Group_2_0_0__0 ) )
            {
            // InternalEFactory.g:1773:1: ( ( rule__Value__Group_2_0_0__0 ) )
            // InternalEFactory.g:1774:1: ( rule__Value__Group_2_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getGroup_2_0_0()); 
            }
            // InternalEFactory.g:1775:1: ( rule__Value__Group_2_0_0__0 )
            // InternalEFactory.g:1775:2: rule__Value__Group_2_0_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1787:1: rule__Value__Group_2_0_0__0 : rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1 ;
    public final void rule__Value__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1791:1: ( rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1 )
            // InternalEFactory.g:1792:2: rule__Value__Group_2_0_0__0__Impl rule__Value__Group_2_0_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_2_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1799:1: rule__Value__Group_2_0_0__0__Impl : ( () ) ;
    public final void rule__Value__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1803:1: ( ( () ) )
            // InternalEFactory.g:1804:1: ( () )
            {
            // InternalEFactory.g:1804:1: ( () )
            // InternalEFactory.g:1805:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNewObjectAction_2_0_0_0()); 
            }
            // InternalEFactory.g:1806:1: ()
            // InternalEFactory.g:1808:1: 
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
    // InternalEFactory.g:1818:1: rule__Value__Group_2_0_0__1 : rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2 ;
    public final void rule__Value__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1822:1: ( rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2 )
            // InternalEFactory.g:1823:2: rule__Value__Group_2_0_0__1__Impl rule__Value__Group_2_0_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_2_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1830:1: rule__Value__Group_2_0_0__1__Impl : ( ( rule__Value__EClassAssignment_2_0_0_1 )? ) ;
    public final void rule__Value__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1834:1: ( ( ( rule__Value__EClassAssignment_2_0_0_1 )? ) )
            // InternalEFactory.g:1835:1: ( ( rule__Value__EClassAssignment_2_0_0_1 )? )
            {
            // InternalEFactory.g:1835:1: ( ( rule__Value__EClassAssignment_2_0_0_1 )? )
            // InternalEFactory.g:1836:1: ( rule__Value__EClassAssignment_2_0_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassAssignment_2_0_0_1()); 
            }
            // InternalEFactory.g:1837:1: ( rule__Value__EClassAssignment_2_0_0_1 )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (synpred20_InternalEFactory()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case RULE_LONG_ID:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred20_InternalEFactory()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case RULE_LONG_UNSIGNED:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred20_InternalEFactory()) ) {
                        alt12=1;
                    }
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // InternalEFactory.g:1837:2: rule__Value__EClassAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__EClassAssignment_2_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // InternalEFactory.g:1847:1: rule__Value__Group_2_0_0__2 : rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3 ;
    public final void rule__Value__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1851:1: ( rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3 )
            // InternalEFactory.g:1852:2: rule__Value__Group_2_0_0__2__Impl rule__Value__Group_2_0_0__3
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_2_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1859:1: rule__Value__Group_2_0_0__2__Impl : ( ( rule__Value__NameAssignment_2_0_0_2 )? ) ;
    public final void rule__Value__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1863:1: ( ( ( rule__Value__NameAssignment_2_0_0_2 )? ) )
            // InternalEFactory.g:1864:1: ( ( rule__Value__NameAssignment_2_0_0_2 )? )
            {
            // InternalEFactory.g:1864:1: ( ( rule__Value__NameAssignment_2_0_0_2 )? )
            // InternalEFactory.g:1865:1: ( rule__Value__NameAssignment_2_0_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNameAssignment_2_0_0_2()); 
            }
            // InternalEFactory.g:1866:1: ( rule__Value__NameAssignment_2_0_0_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_LONG_UNSIGNED)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEFactory.g:1866:2: rule__Value__NameAssignment_2_0_0_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1876:1: rule__Value__Group_2_0_0__3 : rule__Value__Group_2_0_0__3__Impl ;
    public final void rule__Value__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1880:1: ( rule__Value__Group_2_0_0__3__Impl )
            // InternalEFactory.g:1881:2: rule__Value__Group_2_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1887:1: rule__Value__Group_2_0_0__3__Impl : ( '{' ) ;
    public final void rule__Value__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1891:1: ( ( '{' ) )
            // InternalEFactory.g:1892:1: ( '{' )
            {
            // InternalEFactory.g:1892:1: ( '{' )
            // InternalEFactory.g:1893:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2_0_0_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1914:1: rule__MultiValue__Group__0 : rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 ;
    public final void rule__MultiValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1918:1: ( rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 )
            // InternalEFactory.g:1919:2: rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MultiValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1926:1: rule__MultiValue__Group__0__Impl : ( () ) ;
    public final void rule__MultiValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1930:1: ( ( () ) )
            // InternalEFactory.g:1931:1: ( () )
            {
            // InternalEFactory.g:1931:1: ( () )
            // InternalEFactory.g:1932:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getMultiValueAction_0()); 
            }
            // InternalEFactory.g:1933:1: ()
            // InternalEFactory.g:1935:1: 
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
    // InternalEFactory.g:1945:1: rule__MultiValue__Group__1 : rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 ;
    public final void rule__MultiValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1949:1: ( rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 )
            // InternalEFactory.g:1950:2: rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MultiValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1957:1: rule__MultiValue__Group__1__Impl : ( '[' ) ;
    public final void rule__MultiValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1961:1: ( ( '[' ) )
            // InternalEFactory.g:1962:1: ( '[' )
            {
            // InternalEFactory.g:1962:1: ( '[' )
            // InternalEFactory.g:1963:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:1976:1: rule__MultiValue__Group__2 : rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 ;
    public final void rule__MultiValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1980:1: ( rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 )
            // InternalEFactory.g:1981:2: rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MultiValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:1988:1: rule__MultiValue__Group__2__Impl : ( ( rule__MultiValue__ValuesAssignment_2 )* ) ;
    public final void rule__MultiValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:1992:1: ( ( ( rule__MultiValue__ValuesAssignment_2 )* ) )
            // InternalEFactory.g:1993:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            {
            // InternalEFactory.g:1993:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            // InternalEFactory.g:1994:1: ( rule__MultiValue__ValuesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesAssignment_2()); 
            }
            // InternalEFactory.g:1995:1: ( rule__MultiValue__ValuesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=13 && LA14_0<=14)||LA14_0==19||(LA14_0>=22 && LA14_0<=23)||(LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEFactory.g:1995:2: rule__MultiValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MultiValue__ValuesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalEFactory.g:2005:1: rule__MultiValue__Group__3 : rule__MultiValue__Group__3__Impl ;
    public final void rule__MultiValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2009:1: ( rule__MultiValue__Group__3__Impl )
            // InternalEFactory.g:2010:2: rule__MultiValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2016:1: rule__MultiValue__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2020:1: ( ( ']' ) )
            // InternalEFactory.g:2021:1: ( ']' )
            {
            // InternalEFactory.g:2021:1: ( ']' )
            // InternalEFactory.g:2022:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2043:1: rule__EnumAttribute__Group__0 : rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 ;
    public final void rule__EnumAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2047:1: ( rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 )
            // InternalEFactory.g:2048:2: rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2055:1: rule__EnumAttribute__Group__0__Impl : ( ':' ) ;
    public final void rule__EnumAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2059:1: ( ( ':' ) )
            // InternalEFactory.g:2060:1: ( ':' )
            {
            // InternalEFactory.g:2060:1: ( ':' )
            // InternalEFactory.g:2061:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getColonKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2074:1: rule__EnumAttribute__Group__1 : rule__EnumAttribute__Group__1__Impl ;
    public final void rule__EnumAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2078:1: ( rule__EnumAttribute__Group__1__Impl )
            // InternalEFactory.g:2079:2: rule__EnumAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2085:1: rule__EnumAttribute__Group__1__Impl : ( ( rule__EnumAttribute__ValueAssignment_1 ) ) ;
    public final void rule__EnumAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2089:1: ( ( ( rule__EnumAttribute__ValueAssignment_1 ) ) )
            // InternalEFactory.g:2090:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            {
            // InternalEFactory.g:2090:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            // InternalEFactory.g:2091:1: ( rule__EnumAttribute__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueAssignment_1()); 
            }
            // InternalEFactory.g:2092:1: ( rule__EnumAttribute__ValueAssignment_1 )
            // InternalEFactory.g:2092:2: rule__EnumAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2106:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2110:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalEFactory.g:2111:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2118:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2122:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2123:1: ( ruleQualifiedName )
            {
            // InternalEFactory.g:2123:1: ( ruleQualifiedName )
            // InternalEFactory.g:2124:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2135:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2139:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalEFactory.g:2140:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2146:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2150:1: ( ( ( '.*' )? ) )
            // InternalEFactory.g:2151:1: ( ( '.*' )? )
            {
            // InternalEFactory.g:2151:1: ( ( '.*' )? )
            // InternalEFactory.g:2152:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalEFactory.g:2153:1: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEFactory.g:2154:2: '.*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:2169:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2173:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEFactory.g:2174:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2181:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2185:1: ( ( ruleValidID ) )
            // InternalEFactory.g:2186:1: ( ruleValidID )
            {
            // InternalEFactory.g:2186:1: ( ruleValidID )
            // InternalEFactory.g:2187:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2198:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2202:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEFactory.g:2203:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2209:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2213:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEFactory.g:2214:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEFactory.g:2214:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEFactory.g:2215:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalEFactory.g:2216:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEFactory.g:2216:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalEFactory.g:2230:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2234:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEFactory.g:2235:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2242:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2246:1: ( ( ( '.' ) ) )
            // InternalEFactory.g:2247:1: ( ( '.' ) )
            {
            // InternalEFactory.g:2247:1: ( ( '.' ) )
            // InternalEFactory.g:2248:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalEFactory.g:2249:1: ( '.' )
            // InternalEFactory.g:2250:2: '.'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:2261:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2265:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEFactory.g:2266:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2272:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2276:1: ( ( ruleValidID ) )
            // InternalEFactory.g:2277:1: ( ruleValidID )
            {
            // InternalEFactory.g:2277:1: ( ruleValidID )
            // InternalEFactory.g:2278:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2293:1: rule__Long__Group__0 : rule__Long__Group__0__Impl rule__Long__Group__1 ;
    public final void rule__Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2297:1: ( rule__Long__Group__0__Impl rule__Long__Group__1 )
            // InternalEFactory.g:2298:2: rule__Long__Group__0__Impl rule__Long__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Long__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2305:1: rule__Long__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2309:1: ( ( ( '-' )? ) )
            // InternalEFactory.g:2310:1: ( ( '-' )? )
            {
            // InternalEFactory.g:2310:1: ( ( '-' )? )
            // InternalEFactory.g:2311:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalEFactory.g:2312:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEFactory.g:2313:2: '-'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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
    // InternalEFactory.g:2324:1: rule__Long__Group__1 : rule__Long__Group__1__Impl ;
    public final void rule__Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2328:1: ( rule__Long__Group__1__Impl )
            // InternalEFactory.g:2329:2: rule__Long__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2335:1: rule__Long__Group__1__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2339:1: ( ( RULE_LONG_UNSIGNED ) )
            // InternalEFactory.g:2340:1: ( RULE_LONG_UNSIGNED )
            {
            // InternalEFactory.g:2340:1: ( RULE_LONG_UNSIGNED )
            // InternalEFactory.g:2341:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLongAccess().getLONG_UNSIGNEDTerminalRuleCall_1()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2356:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2360:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalEFactory.g:2361:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2368:1: rule__Double__Group__0__Impl : ( ruleLong ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2372:1: ( ( ruleLong ) )
            // InternalEFactory.g:2373:1: ( ruleLong )
            {
            // InternalEFactory.g:2373:1: ( ruleLong )
            // InternalEFactory.g:2374:1: ruleLong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getLongParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2385:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2389:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalEFactory.g:2390:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2397:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2401:1: ( ( '.' ) )
            // InternalEFactory.g:2402:1: ( '.' )
            {
            // InternalEFactory.g:2402:1: ( '.' )
            // InternalEFactory.g:2403:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2416:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2420:1: ( rule__Double__Group__2__Impl )
            // InternalEFactory.g:2421:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2427:1: rule__Double__Group__2__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2431:1: ( ( RULE_LONG_UNSIGNED ) )
            // InternalEFactory.g:2432:1: ( RULE_LONG_UNSIGNED )
            {
            // InternalEFactory.g:2432:1: ( RULE_LONG_UNSIGNED )
            // InternalEFactory.g:2433:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2450:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2454:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalEFactory.g:2455:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Date__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2462:1: rule__Date__Group__0__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2466:1: ( ( RULE_LONG_UNSIGNED ) )
            // InternalEFactory.g:2467:1: ( RULE_LONG_UNSIGNED )
            {
            // InternalEFactory.g:2467:1: ( RULE_LONG_UNSIGNED )
            // InternalEFactory.g:2468:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_0()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2479:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2483:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalEFactory.g:2484:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Date__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2491:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2495:1: ( ( '.' ) )
            // InternalEFactory.g:2496:1: ( '.' )
            {
            // InternalEFactory.g:2496:1: ( '.' )
            // InternalEFactory.g:2497:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2510:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2514:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalEFactory.g:2515:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Date__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2522:1: rule__Date__Group__2__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2526:1: ( ( RULE_LONG_UNSIGNED ) )
            // InternalEFactory.g:2527:1: ( RULE_LONG_UNSIGNED )
            {
            // InternalEFactory.g:2527:1: ( RULE_LONG_UNSIGNED )
            // InternalEFactory.g:2528:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2539:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2543:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalEFactory.g:2544:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Date__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2551:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2555:1: ( ( '.' ) )
            // InternalEFactory.g:2556:1: ( '.' )
            {
            // InternalEFactory.g:2556:1: ( '.' )
            // InternalEFactory.g:2557:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2570:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2574:1: ( rule__Date__Group__4__Impl )
            // InternalEFactory.g:2575:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2581:1: rule__Date__Group__4__Impl : ( RULE_LONG_UNSIGNED ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2585:1: ( ( RULE_LONG_UNSIGNED ) )
            // InternalEFactory.g:2586:1: ( RULE_LONG_UNSIGNED )
            {
            // InternalEFactory.g:2586:1: ( RULE_LONG_UNSIGNED )
            // InternalEFactory.g:2587:1: RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_4()); 
            }
            match(input,RULE_LONG_UNSIGNED,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2609:1: rule__Factory__ImportsAssignment_0 : ( ruleNamespaceImport ) ;
    public final void rule__Factory__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2613:1: ( ( ruleNamespaceImport ) )
            // InternalEFactory.g:2614:1: ( ruleNamespaceImport )
            {
            // InternalEFactory.g:2614:1: ( ruleNamespaceImport )
            // InternalEFactory.g:2615:1: ruleNamespaceImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsNamespaceImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2624:1: rule__Factory__EpackagesAssignment_1 : ( rulePackageImport ) ;
    public final void rule__Factory__EpackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2628:1: ( ( rulePackageImport ) )
            // InternalEFactory.g:2629:1: ( rulePackageImport )
            {
            // InternalEFactory.g:2629:1: ( rulePackageImport )
            // InternalEFactory.g:2630:1: rulePackageImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Factory__AnnotationsAssignment_2"
    // InternalEFactory.g:2639:1: rule__Factory__AnnotationsAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__Factory__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2643:1: ( ( ruleAnnotation ) )
            // InternalEFactory.g:2644:1: ( ruleAnnotation )
            {
            // InternalEFactory.g:2644:1: ( ruleAnnotation )
            // InternalEFactory.g:2645:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Factory__AnnotationsAssignment_2"


    // $ANTLR start "rule__Factory__RootAssignment_3"
    // InternalEFactory.g:2654:1: rule__Factory__RootAssignment_3 : ( ruleNewObject ) ;
    public final void rule__Factory__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2658:1: ( ( ruleNewObject ) )
            // InternalEFactory.g:2659:1: ( ruleNewObject )
            {
            // InternalEFactory.g:2659:1: ( ruleNewObject )
            // InternalEFactory.g:2660:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Factory__RootAssignment_3"


    // $ANTLR start "rule__PackageImport__EPackageAssignment_1"
    // InternalEFactory.g:2669:1: rule__PackageImport__EPackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackageImport__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2673:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2674:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2674:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2675:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
            }
            // InternalEFactory.g:2676:1: ( ruleQualifiedName )
            // InternalEFactory.g:2677:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2688:1: rule__NamespaceImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__NamespaceImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2692:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalEFactory.g:2693:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalEFactory.g:2693:1: ( ruleQualifiedNameWithWildcard )
            // InternalEFactory.g:2694:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__CustomNameMapping__EClassAssignment_2"
    // InternalEFactory.g:2703:1: rule__CustomNameMapping__EClassAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CustomNameMapping__EClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2707:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2708:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2708:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2709:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassCrossReference_2_0()); 
            }
            // InternalEFactory.g:2710:1: ( ruleQualifiedName )
            // InternalEFactory.g:2711:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getEClassEClassCrossReference_2_0()); 
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
    // $ANTLR end "rule__CustomNameMapping__EClassAssignment_2"


    // $ANTLR start "rule__CustomNameMapping__NameFeatureAssignment_4"
    // InternalEFactory.g:2722:1: rule__CustomNameMapping__NameFeatureAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CustomNameMapping__NameFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2726:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2727:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2727:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2728:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
            }
            // InternalEFactory.g:2729:1: ( ruleQualifiedName )
            // InternalEFactory.g:2730:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
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
    // $ANTLR end "rule__CustomNameMapping__NameFeatureAssignment_4"


    // $ANTLR start "rule__Feature__EFeatureAssignment_0"
    // InternalEFactory.g:2741:1: rule__Feature__EFeatureAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__EFeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2745:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2746:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2746:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2747:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
            }
            // InternalEFactory.g:2748:1: ( ruleQualifiedName )
            // InternalEFactory.g:2749:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureQualifiedNameParserRuleCall_0_0_1()); 
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
    // InternalEFactory.g:2760:1: rule__Feature__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2764:1: ( ( ruleValue ) )
            // InternalEFactory.g:2765:1: ( ruleValue )
            {
            // InternalEFactory.g:2765:1: ( ruleValue )
            // InternalEFactory.g:2766:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2775:1: rule__NewObject__EClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NewObject__EClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2779:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2780:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2780:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2781:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
            }
            // InternalEFactory.g:2782:1: ( ruleQualifiedName )
            // InternalEFactory.g:2783:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2794:1: rule__NewObject__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NewObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2798:1: ( ( ruleValidID ) )
            // InternalEFactory.g:2799:1: ( ruleValidID )
            {
            // InternalEFactory.g:2799:1: ( ruleValidID )
            // InternalEFactory.g:2800:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2809:1: rule__NewObject__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__NewObject__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2813:1: ( ( ruleFeature ) )
            // InternalEFactory.g:2814:1: ( ruleFeature )
            {
            // InternalEFactory.g:2814:1: ( ruleFeature )
            // InternalEFactory.g:2815:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2824:1: rule__Value__EClassAssignment_2_0_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Value__EClassAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2828:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2829:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2829:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2830:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassEClassCrossReference_2_0_0_1_0()); 
            }
            // InternalEFactory.g:2831:1: ( ruleQualifiedName )
            // InternalEFactory.g:2832:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_0_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2843:1: rule__Value__NameAssignment_2_0_0_2 : ( ruleValidID ) ;
    public final void rule__Value__NameAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2847:1: ( ( ruleValidID ) )
            // InternalEFactory.g:2848:1: ( ruleValidID )
            {
            // InternalEFactory.g:2848:1: ( ruleValidID )
            // InternalEFactory.g:2849:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getNameValidIDParserRuleCall_2_0_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2858:1: rule__Value__FeaturesAssignment_2_1 : ( ruleFeature ) ;
    public final void rule__Value__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2862:1: ( ( ruleFeature ) )
            // InternalEFactory.g:2863:1: ( ruleFeature )
            {
            // InternalEFactory.g:2863:1: ( ruleFeature )
            // InternalEFactory.g:2864:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2873:1: rule__MultiValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__MultiValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2877:1: ( ( ruleValue ) )
            // InternalEFactory.g:2878:1: ( ruleValue )
            {
            // InternalEFactory.g:2878:1: ( ruleValue )
            // InternalEFactory.g:2879:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2888:1: rule__Reference__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2892:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2893:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2893:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2894:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            }
            // InternalEFactory.g:2895:1: ( ruleQualifiedName )
            // InternalEFactory.g:2896:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2907:1: rule__EnumAttribute__ValueAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2911:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEFactory.g:2912:1: ( ( ruleQualifiedName ) )
            {
            // InternalEFactory.g:2912:1: ( ( ruleQualifiedName ) )
            // InternalEFactory.g:2913:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
            }
            // InternalEFactory.g:2914:1: ( ruleQualifiedName )
            // InternalEFactory.g:2915:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralQualifiedNameParserRuleCall_1_0_1()); 
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
    // InternalEFactory.g:2926:1: rule__StringAttribute__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2930:1: ( ( RULE_STRING ) )
            // InternalEFactory.g:2931:1: ( RULE_STRING )
            {
            // InternalEFactory.g:2931:1: ( RULE_STRING )
            // InternalEFactory.g:2932:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:2941:1: rule__IntegerAttribute__ValueAssignment : ( ruleLong ) ;
    public final void rule__IntegerAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2945:1: ( ( ruleLong ) )
            // InternalEFactory.g:2946:1: ( ruleLong )
            {
            // InternalEFactory.g:2946:1: ( ruleLong )
            // InternalEFactory.g:2947:1: ruleLong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueLongParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2956:1: rule__DoubleAttribute__ValueAssignment : ( ruleDouble ) ;
    public final void rule__DoubleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2960:1: ( ( ruleDouble ) )
            // InternalEFactory.g:2961:1: ( ruleDouble )
            {
            // InternalEFactory.g:2961:1: ( ruleDouble )
            // InternalEFactory.g:2962:1: ruleDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueDoubleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2971:1: rule__DateAttribute__ValueAssignment : ( ruleDate ) ;
    public final void rule__DateAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2975:1: ( ( ruleDate ) )
            // InternalEFactory.g:2976:1: ( ruleDate )
            {
            // InternalEFactory.g:2976:1: ( ruleDate )
            // InternalEFactory.g:2977:1: ruleDate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueDateParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalEFactory.g:2986:1: rule__NullAttribute__ValueAssignment : ( ( 'NULL' ) ) ;
    public final void rule__NullAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:2990:1: ( ( ( 'NULL' ) ) )
            // InternalEFactory.g:2991:1: ( ( 'NULL' ) )
            {
            // InternalEFactory.g:2991:1: ( ( 'NULL' ) )
            // InternalEFactory.g:2992:1: ( 'NULL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            // InternalEFactory.g:2993:1: ( 'NULL' )
            // InternalEFactory.g:2994:1: 'NULL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalEFactory.g:3009:1: rule__BooleanAttribute__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEFactory.g:3013:1: ( ( ruleBoolean ) )
            // InternalEFactory.g:3014:1: ( ruleBoolean )
            {
            // InternalEFactory.g:3014:1: ( ruleBoolean )
            // InternalEFactory.g:3015:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
        // InternalEFactory.g:772:6: ( ( ruleAttribute ) )
        // InternalEFactory.g:772:6: ( ruleAttribute )
        {
        // InternalEFactory.g:772:6: ( ruleAttribute )
        // InternalEFactory.g:773:1: ruleAttribute
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleAttribute();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // InternalEFactory.g:778:6: ( ( ( rule__Value__Group_2__0 ) ) )
        // InternalEFactory.g:778:6: ( ( rule__Value__Group_2__0 ) )
        {
        // InternalEFactory.g:778:6: ( ( rule__Value__Group_2__0 ) )
        // InternalEFactory.g:779:1: ( rule__Value__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getGroup_2()); 
        }
        // InternalEFactory.g:780:1: ( rule__Value__Group_2__0 )
        // InternalEFactory.g:780:2: rule__Value__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__Value__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEFactory

    // $ANTLR start synpred20_InternalEFactory
    public final void synpred20_InternalEFactory_fragment() throws RecognitionException {   
        // InternalEFactory.g:1837:2: ( rule__Value__EClassAssignment_2_0_0_1 )
        // InternalEFactory.g:1837:2: rule__Value__EClassAssignment_2_0_0_1
        {
        pushFollow(FOLLOW_2);
        rule__Value__EClassAssignment_2_0_0_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalEFactory

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
    public final boolean synpred20_InternalEFactory() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalEFactory_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\4\uffff\1\10\2\uffff\1\10\3\uffff\1\12\1\uffff";
    static final String DFA2_minS =
        "\1\6\2\uffff\1\6\1\4\2\uffff\1\4\1\uffff\1\6\1\uffff\1\4\1\uffff";
    static final String DFA2_maxS =
        "\1\33\2\uffff\1\6\1\33\2\uffff\1\33\1\uffff\1\6\1\uffff\1\33\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\4\1\7\1\uffff\1\3\1\uffff\1\5\1\uffff\1\6";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\1\2\5\uffff\2\5\7\uffff\1\1\3\uffff\1\3\1\6",
            "",
            "",
            "\1\7",
            "\4\10\5\uffff\2\10\4\uffff\1\10\1\uffff\4\10\1\11\2\10",
            "",
            "",
            "\4\10\5\uffff\2\10\4\uffff\1\10\1\uffff\4\10\1\12\2\10",
            "",
            "\1\13",
            "",
            "\4\12\5\uffff\2\12\4\uffff\1\12\1\uffff\4\12\1\14\2\12",
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
            return "795:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );";
        }
    }
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\1\5\1\uffff\3\1\3\uffff\4\1\1\uffff\1\1";
    static final String DFA8_minS =
        "\1\4\1\uffff\3\4\1\uffff\10\4";
    static final String DFA8_maxS =
        "\1\33\1\uffff\3\31\1\uffff\2\6\4\31\1\6\1\31";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\10\uffff";
    static final String DFA8_specialS =
        "\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\1\4\1\2\1\1\5\uffff\2\1\4\uffff\1\1\1\uffff\1\5\2\1\2\uffff\2\1",
            "",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\6",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7",
            "",
            "\1\10\1\11\1\12",
            "\1\10\1\11\1\13",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\14",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7",
            "\1\10\1\11\1\15",
            "\3\1\14\uffff\1\1\1\uffff\1\1\1\5\2\uffff\1\7"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1456:1: ( rule__Feature__ValueAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000048070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000CCCE0F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C8070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000248070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000048072L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000DCCE0F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000CCCE0F2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});

}