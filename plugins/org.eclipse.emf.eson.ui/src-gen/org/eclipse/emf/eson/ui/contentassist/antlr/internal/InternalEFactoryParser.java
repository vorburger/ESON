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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LONG", "RULE_STRING", "RULE_DOUBLE", "RULE_DATE", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "'.*'", "'@Name'", "'{'", "'='", "'}'", "':'", "'['", "']'", "'.'", "'NULL'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=4;
    public static final int RULE_DATE=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_LONG=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=10;
    public static final int RULE_WS=13;

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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:117:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:118:1: ( ruleAnnotation EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:119:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation187);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation194); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:126:1: ruleAnnotation : ( ruleCustomNameMapping ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:130:2: ( ( ruleCustomNameMapping ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:131:1: ( ruleCustomNameMapping )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:131:1: ( ruleCustomNameMapping )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:132:1: ruleCustomNameMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCustomNameMappingParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_ruleAnnotation220);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:145:1: entryRuleCustomNameMapping : ruleCustomNameMapping EOF ;
    public final void entryRuleCustomNameMapping() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:146:1: ( ruleCustomNameMapping EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:147:1: ruleCustomNameMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingRule()); 
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping246);
            ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNameMapping253); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:154:1: ruleCustomNameMapping : ( ( rule__CustomNameMapping__Group__0 ) ) ;
    public final void ruleCustomNameMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:158:2: ( ( ( rule__CustomNameMapping__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ( rule__CustomNameMapping__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ( rule__CustomNameMapping__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:160:1: ( rule__CustomNameMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:161:1: ( rule__CustomNameMapping__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:161:2: rule__CustomNameMapping__Group__0
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__0_in_ruleCustomNameMapping279);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:173:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:174:1: ( ruleFeature EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:175:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature306);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature313); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:182:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:186:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__Feature__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:188:1: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:1: ( rule__Feature__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature339);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:201:1: entryRuleNewObject : ruleNewObject EOF ;
    public final void entryRuleNewObject() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:202:1: ( ruleNewObject EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:203:1: ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject366);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject373); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:210:1: ruleNewObject : ( ( rule__NewObject__Group__0 ) ) ;
    public final void ruleNewObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:214:2: ( ( ( rule__NewObject__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__NewObject__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__NewObject__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:216:1: ( rule__NewObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:1: ( rule__NewObject__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:2: rule__NewObject__Group__0
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0_in_ruleNewObject399);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:229:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:230:1: ( ruleValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:231:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue426);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue433); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:238:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:242:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:244:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:1: ( rule__Value__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue459);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:257:1: entryRuleMultiValue : ruleMultiValue EOF ;
    public final void entryRuleMultiValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:258:1: ( ruleMultiValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:259:1: ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValue_in_entryRuleMultiValue486);
            ruleMultiValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValue493); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:266:1: ruleMultiValue : ( ( rule__MultiValue__Group__0 ) ) ;
    public final void ruleMultiValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:270:2: ( ( ( rule__MultiValue__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__MultiValue__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__MultiValue__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:272:1: ( rule__MultiValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:1: ( rule__MultiValue__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:2: rule__MultiValue__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue519);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:285:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:286:1: ( ruleReference EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:287:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference546);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference553); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:294:1: ruleReference : ( ( rule__Reference__ValueAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:298:2: ( ( ( rule__Reference__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__Reference__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__Reference__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:300:1: ( rule__Reference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:1: ( rule__Reference__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:2: rule__Reference__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ValueAssignment_in_ruleReference579);
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


    // $ANTLR start "entryRuleContainment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:313:1: entryRuleContainment : ruleContainment EOF ;
    public final void entryRuleContainment() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:314:1: ( ruleContainment EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:315:1: ruleContainment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentRule()); 
            }
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment606);
            ruleContainment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment613); if (state.failed) return ;

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
    // $ANTLR end "entryRuleContainment"


    // $ANTLR start "ruleContainment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:322:1: ruleContainment : ( ( rule__Containment__ValueAssignment ) ) ;
    public final void ruleContainment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:326:2: ( ( ( rule__Containment__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__Containment__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__Containment__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:328:1: ( rule__Containment__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:1: ( rule__Containment__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:2: rule__Containment__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment639);
            rule__Containment__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainmentAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleContainment"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:342:1: ( ruleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:343:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute666);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute673); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:350:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:354:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:356:1: ( rule__Attribute__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:1: ( rule__Attribute__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute699);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:369:1: entryRuleEnumAttribute : ruleEnumAttribute EOF ;
    public final void entryRuleEnumAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:370:1: ( ruleEnumAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:371:1: ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute726);
            ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAttribute733); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:378:1: ruleEnumAttribute : ( ( rule__EnumAttribute__Group__0 ) ) ;
    public final void ruleEnumAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:382:2: ( ( ( rule__EnumAttribute__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__EnumAttribute__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__EnumAttribute__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:384:1: ( rule__EnumAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:1: ( rule__EnumAttribute__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:2: rule__EnumAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute759);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:397:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:398:1: ( ruleStringAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:399:1: ruleStringAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute786);
            ruleStringAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute793); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:406:1: ruleStringAttribute : ( ( rule__StringAttribute__ValueAssignment ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:410:2: ( ( ( rule__StringAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__StringAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__StringAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:412:1: ( rule__StringAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:1: ( rule__StringAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:2: rule__StringAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute819);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:425:1: entryRuleIntegerAttribute : ruleIntegerAttribute EOF ;
    public final void entryRuleIntegerAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:426:1: ( ruleIntegerAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:427:1: ruleIntegerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute846);
            ruleIntegerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAttribute853); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:434:1: ruleIntegerAttribute : ( ( rule__IntegerAttribute__ValueAssignment ) ) ;
    public final void ruleIntegerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:438:2: ( ( ( rule__IntegerAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:440:1: ( rule__IntegerAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:1: ( rule__IntegerAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:2: rule__IntegerAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute879);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:453:1: entryRuleDoubleAttribute : ruleDoubleAttribute EOF ;
    public final void entryRuleDoubleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:454:1: ( ruleDoubleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:455:1: ruleDoubleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute906);
            ruleDoubleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleAttribute913); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:462:1: ruleDoubleAttribute : ( ( rule__DoubleAttribute__ValueAssignment ) ) ;
    public final void ruleDoubleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:466:2: ( ( ( rule__DoubleAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:468:1: ( rule__DoubleAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:1: ( rule__DoubleAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:2: rule__DoubleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute939);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:481:1: entryRuleDateAttribute : ruleDateAttribute EOF ;
    public final void entryRuleDateAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:482:1: ( ruleDateAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:483:1: ruleDateAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute966);
            ruleDateAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateAttribute973); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:490:1: ruleDateAttribute : ( ( rule__DateAttribute__ValueAssignment ) ) ;
    public final void ruleDateAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:494:2: ( ( ( rule__DateAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__DateAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__DateAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:496:1: ( rule__DateAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:1: ( rule__DateAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:2: rule__DateAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute999);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:509:1: entryRuleNullAttribute : ruleNullAttribute EOF ;
    public final void entryRuleNullAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:510:1: ( ruleNullAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:511:1: ruleNullAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute1026);
            ruleNullAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullAttribute1033); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:518:1: ruleNullAttribute : ( ( rule__NullAttribute__ValueAssignment ) ) ;
    public final void ruleNullAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:522:2: ( ( ( rule__NullAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__NullAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__NullAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:524:1: ( rule__NullAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:1: ( rule__NullAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:2: rule__NullAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute1059);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:537:1: entryRuleBooleanAttribute : ruleBooleanAttribute EOF ;
    public final void entryRuleBooleanAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:538:1: ( ruleBooleanAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:539:1: ruleBooleanAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute1086);
            ruleBooleanAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAttribute1093); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:546:1: ruleBooleanAttribute : ( ( rule__BooleanAttribute__ValueAssignment ) ) ;
    public final void ruleBooleanAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:550:2: ( ( ( rule__BooleanAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:552:1: ( rule__BooleanAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:1: ( rule__BooleanAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:2: rule__BooleanAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1119);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:565:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:566:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:567:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1146);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1153); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:574:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:578:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:580:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1179);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:593:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:594:1: ( ruleValidID EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:595:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1206);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1213); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:602:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:606:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__ValidID__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:608:1: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:1: ( rule__ValidID__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1239);
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


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:621:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:625:1: ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:626:1: ( ruleMultiValue )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:626:1: ( ruleMultiValue )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:627:1: ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1275);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:632:6: ( ruleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:632:6: ( ruleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:633:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Value__Alternatives1292);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:638:6: ( ( ruleContainment ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:638:6: ( ( ruleContainment ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:639:1: ( ruleContainment )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:640:1: ( ruleContainment )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:640:3: ruleContainment
                    {
                    pushFollow(FOLLOW_ruleContainment_in_rule__Value__Alternatives1310);
                    ruleContainment();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:644:6: ( ( ruleReference ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:644:6: ( ( ruleReference ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:645:1: ( ruleReference )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:646:1: ( ruleReference )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:646:3: ruleReference
                    {
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1329);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:655:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:659:1: ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_LONG:
                {
                alt2=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=4;
                }
                break;
            case RULE_DOUBLE:
                {
                alt2=5;
                }
                break;
            case RULE_DATE:
                {
                alt2=6;
                }
                break;
            case 25:
                {
                alt2=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:660:1: ( ruleEnumAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:660:1: ( ruleEnumAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:661:1: ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1362);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:666:6: ( ruleStringAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:666:6: ( ruleStringAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:667:1: ruleStringAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1379);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:672:6: ( ruleIntegerAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:672:6: ( ruleIntegerAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:673:1: ruleIntegerAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1396);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:678:6: ( ruleBooleanAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:678:6: ( ruleBooleanAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:679:1: ruleBooleanAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1413);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:684:6: ( ruleDoubleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:684:6: ( ruleDoubleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:685:1: ruleDoubleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1430);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:690:6: ( ruleDateAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:690:6: ( ruleDateAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:691:1: ruleDateAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1447);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:6: ( ruleNullAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:6: ( ruleNullAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:697:1: ruleNullAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1464);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:707:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( RULE_LONG ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:711:1: ( ( RULE_ID ) | ( RULE_LONG ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_LONG) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:712:1: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:712:1: ( RULE_ID )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:713:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1496); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:718:6: ( RULE_LONG )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:718:6: ( RULE_LONG )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:719:1: RULE_LONG
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_LONG,FOLLOW_RULE_LONG_in_rule__ValidID__Alternatives1513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getLONGTerminalRuleCall_1()); 
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


    // $ANTLR start "rule__Factory__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:731:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:735:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:736:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01543);
            rule__Factory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01546);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:743:1: rule__Factory__Group__0__Impl : ( ( rule__Factory__EpackagesAssignment_0 )* ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:747:1: ( ( ( rule__Factory__EpackagesAssignment_0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:748:1: ( ( rule__Factory__EpackagesAssignment_0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:748:1: ( ( rule__Factory__EpackagesAssignment_0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:749:1: ( rule__Factory__EpackagesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:750:1: ( rule__Factory__EpackagesAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:750:2: rule__Factory__EpackagesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Factory__EpackagesAssignment_0_in_rule__Factory__Group__0__Impl1573);
            	    rule__Factory__EpackagesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getEpackagesAssignment_0()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:760:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:764:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:765:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11604);
            rule__Factory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11607);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:772:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__AnnotationsAssignment_1 )* ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:776:1: ( ( ( rule__Factory__AnnotationsAssignment_1 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:777:1: ( ( rule__Factory__AnnotationsAssignment_1 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:777:1: ( ( rule__Factory__AnnotationsAssignment_1 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:778:1: ( rule__Factory__AnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:779:1: ( rule__Factory__AnnotationsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:779:2: rule__Factory__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Factory__AnnotationsAssignment_1_in_rule__Factory__Group__1__Impl1634);
            	    rule__Factory__AnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getAnnotationsAssignment_1()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:789:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:793:1: ( rule__Factory__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:794:2: rule__Factory__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21665);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:800:1: rule__Factory__Group__2__Impl : ( ( rule__Factory__RootAssignment_2 ) ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:804:1: ( ( ( rule__Factory__RootAssignment_2 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:805:1: ( ( rule__Factory__RootAssignment_2 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:805:1: ( ( rule__Factory__RootAssignment_2 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:806:1: ( rule__Factory__RootAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:807:1: ( rule__Factory__RootAssignment_2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:807:2: rule__Factory__RootAssignment_2
            {
            pushFollow(FOLLOW_rule__Factory__RootAssignment_2_in_rule__Factory__Group__2__Impl1692);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:823:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:827:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:828:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01728);
            rule__PackageImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01731);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:835:1: rule__PackageImport__Group__0__Impl : ( 'use' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:839:1: ( ( 'use' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:840:1: ( 'use' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:840:1: ( 'use' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:841:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getUseKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__PackageImport__Group__0__Impl1759); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:854:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:858:1: ( rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:859:2: rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__11790);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__11793);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:866:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__EPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:870:1: ( ( ( rule__PackageImport__EPackageAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:871:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:871:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:872:1: ( rule__PackageImport__EPackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:873:1: ( rule__PackageImport__EPackageAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:873:2: rule__PackageImport__EPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl1820);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:883:1: rule__PackageImport__Group__2 : rule__PackageImport__Group__2__Impl ;
    public final void rule__PackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:887:1: ( rule__PackageImport__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:888:2: rule__PackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__21850);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:894:1: rule__PackageImport__Group__2__Impl : ( '.*' ) ;
    public final void rule__PackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:898:1: ( ( '.*' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:899:1: ( '.*' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:899:1: ( '.*' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:900:1: '.*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__PackageImport__Group__2__Impl1878); if (state.failed) return ;
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


    // $ANTLR start "rule__CustomNameMapping__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:919:1: rule__CustomNameMapping__Group__0 : rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 ;
    public final void rule__CustomNameMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:923:1: ( rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:924:2: rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__0__Impl_in_rule__CustomNameMapping__Group__01915);
            rule__CustomNameMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__1_in_rule__CustomNameMapping__Group__01918);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:931:1: rule__CustomNameMapping__Group__0__Impl : ( '@Name' ) ;
    public final void rule__CustomNameMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:935:1: ( ( '@Name' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:936:1: ( '@Name' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:936:1: ( '@Name' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:937:1: '@Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__CustomNameMapping__Group__0__Impl1946); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:950:1: rule__CustomNameMapping__Group__1 : rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 ;
    public final void rule__CustomNameMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:954:1: ( rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:955:2: rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__1__Impl_in_rule__CustomNameMapping__Group__11977);
            rule__CustomNameMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__2_in_rule__CustomNameMapping__Group__11980);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:962:1: rule__CustomNameMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomNameMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:966:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:967:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:967:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:968:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__CustomNameMapping__Group__1__Impl2008); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:981:1: rule__CustomNameMapping__Group__2 : rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 ;
    public final void rule__CustomNameMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:985:1: ( rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:986:2: rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__2__Impl_in_rule__CustomNameMapping__Group__22039);
            rule__CustomNameMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__3_in_rule__CustomNameMapping__Group__22042);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:993:1: rule__CustomNameMapping__Group__2__Impl : ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) ;
    public final void rule__CustomNameMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:997:1: ( ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:998:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:998:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:999:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1000:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1000:2: rule__CustomNameMapping__EClassAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__EClassAssignment_2_in_rule__CustomNameMapping__Group__2__Impl2069);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1010:1: rule__CustomNameMapping__Group__3 : rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 ;
    public final void rule__CustomNameMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1014:1: ( rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1015:2: rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__3__Impl_in_rule__CustomNameMapping__Group__32099);
            rule__CustomNameMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__4_in_rule__CustomNameMapping__Group__32102);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1022:1: rule__CustomNameMapping__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomNameMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1026:1: ( ( '=' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1027:1: ( '=' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1027:1: ( '=' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1028:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__CustomNameMapping__Group__3__Impl2130); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1041:1: rule__CustomNameMapping__Group__4 : rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 ;
    public final void rule__CustomNameMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1045:1: ( rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1046:2: rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__4__Impl_in_rule__CustomNameMapping__Group__42161);
            rule__CustomNameMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__5_in_rule__CustomNameMapping__Group__42164);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1053:1: rule__CustomNameMapping__Group__4__Impl : ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) ;
    public final void rule__CustomNameMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1057:1: ( ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1058:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1058:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1059:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureAssignment_4()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1060:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1060:2: rule__CustomNameMapping__NameFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__NameFeatureAssignment_4_in_rule__CustomNameMapping__Group__4__Impl2191);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1070:1: rule__CustomNameMapping__Group__5 : rule__CustomNameMapping__Group__5__Impl ;
    public final void rule__CustomNameMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1074:1: ( rule__CustomNameMapping__Group__5__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1075:2: rule__CustomNameMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__5__Impl_in_rule__CustomNameMapping__Group__52221);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1081:1: rule__CustomNameMapping__Group__5__Impl : ( '}' ) ;
    public final void rule__CustomNameMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1085:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1086:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1086:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1087:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_20_in_rule__CustomNameMapping__Group__5__Impl2249); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1112:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1116:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1117:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02292);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02295);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1124:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__EFeatureAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1128:1: ( ( ( rule__Feature__EFeatureAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1129:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1129:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1130:1: ( rule__Feature__EFeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1131:1: ( rule__Feature__EFeatureAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1131:2: rule__Feature__EFeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2322);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1141:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1145:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1146:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12352);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12355);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1153:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1157:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1158:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1158:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1159:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Feature__Group__1__Impl2383); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1172:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1176:1: ( rule__Feature__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1177:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22414);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1183:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1187:1: ( ( ( rule__Feature__ValueAssignment_2 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1188:1: ( ( rule__Feature__ValueAssignment_2 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1188:1: ( ( rule__Feature__ValueAssignment_2 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1189:1: ( rule__Feature__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1190:1: ( rule__Feature__ValueAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_LONG && LA6_0<=RULE_BOOLEAN)||(LA6_0>=21 && LA6_0<=22)||LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_LONG)||LA6_2==18||LA6_2==20||LA6_2==24) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1190:2: rule__Feature__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2441);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1206:1: rule__NewObject__Group__0 : rule__NewObject__Group__0__Impl rule__NewObject__Group__1 ;
    public final void rule__NewObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1210:1: ( rule__NewObject__Group__0__Impl rule__NewObject__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1211:2: rule__NewObject__Group__0__Impl rule__NewObject__Group__1
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02478);
            rule__NewObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02481);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1218:1: rule__NewObject__Group__0__Impl : ( ( rule__NewObject__EClassAssignment_0 ) ) ;
    public final void rule__NewObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1222:1: ( ( ( rule__NewObject__EClassAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1223:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1223:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1224:1: ( rule__NewObject__EClassAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1225:1: ( rule__NewObject__EClassAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1225:2: rule__NewObject__EClassAssignment_0
            {
            pushFollow(FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2508);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1235:1: rule__NewObject__Group__1 : rule__NewObject__Group__1__Impl rule__NewObject__Group__2 ;
    public final void rule__NewObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1239:1: ( rule__NewObject__Group__1__Impl rule__NewObject__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1240:2: rule__NewObject__Group__1__Impl rule__NewObject__Group__2
            {
            pushFollow(FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12538);
            rule__NewObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12541);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1247:1: rule__NewObject__Group__1__Impl : ( ( rule__NewObject__NameAssignment_1 )? ) ;
    public final void rule__NewObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1251:1: ( ( ( rule__NewObject__NameAssignment_1 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1252:1: ( ( rule__NewObject__NameAssignment_1 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1252:1: ( ( rule__NewObject__NameAssignment_1 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1253:1: ( rule__NewObject__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1254:1: ( rule__NewObject__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_LONG)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1254:2: rule__NewObject__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2568);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1264:1: rule__NewObject__Group__2 : rule__NewObject__Group__2__Impl rule__NewObject__Group__3 ;
    public final void rule__NewObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1268:1: ( rule__NewObject__Group__2__Impl rule__NewObject__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1269:2: rule__NewObject__Group__2__Impl rule__NewObject__Group__3
            {
            pushFollow(FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22599);
            rule__NewObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22602);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1276:1: rule__NewObject__Group__2__Impl : ( '{' ) ;
    public final void rule__NewObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1280:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1281:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1281:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1282:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__NewObject__Group__2__Impl2630); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1295:1: rule__NewObject__Group__3 : rule__NewObject__Group__3__Impl rule__NewObject__Group__4 ;
    public final void rule__NewObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1299:1: ( rule__NewObject__Group__3__Impl rule__NewObject__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1300:2: rule__NewObject__Group__3__Impl rule__NewObject__Group__4
            {
            pushFollow(FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32661);
            rule__NewObject__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32664);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1307:1: rule__NewObject__Group__3__Impl : ( ( rule__NewObject__FeaturesAssignment_3 )* ) ;
    public final void rule__NewObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1311:1: ( ( ( rule__NewObject__FeaturesAssignment_3 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1312:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1312:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1313:1: ( rule__NewObject__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1314:1: ( rule__NewObject__FeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1314:2: rule__NewObject__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2691);
            	    rule__NewObject__FeaturesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1324:1: rule__NewObject__Group__4 : rule__NewObject__Group__4__Impl ;
    public final void rule__NewObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1328:1: ( rule__NewObject__Group__4__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1329:2: rule__NewObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42722);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1335:1: rule__NewObject__Group__4__Impl : ( '}' ) ;
    public final void rule__NewObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1339:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1340:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1340:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1341:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__NewObject__Group__4__Impl2750); if (state.failed) return ;
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


    // $ANTLR start "rule__MultiValue__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1364:1: rule__MultiValue__Group__0 : rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 ;
    public final void rule__MultiValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1368:1: ( rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1369:2: rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__02791);
            rule__MultiValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__02794);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1376:1: rule__MultiValue__Group__0__Impl : ( () ) ;
    public final void rule__MultiValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1380:1: ( ( () ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1381:1: ( () )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1381:1: ( () )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1382:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getMultiValueAction_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1383:1: ()
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1385:1: 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1395:1: rule__MultiValue__Group__1 : rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 ;
    public final void rule__MultiValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1399:1: ( rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1400:2: rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__12852);
            rule__MultiValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__12855);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1407:1: rule__MultiValue__Group__1__Impl : ( '[' ) ;
    public final void rule__MultiValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1411:1: ( ( '[' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1412:1: ( '[' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1412:1: ( '[' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1413:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__MultiValue__Group__1__Impl2883); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1426:1: rule__MultiValue__Group__2 : rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 ;
    public final void rule__MultiValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1430:1: ( rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1431:2: rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__22914);
            rule__MultiValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__22917);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1438:1: rule__MultiValue__Group__2__Impl : ( ( rule__MultiValue__ValuesAssignment_2 )* ) ;
    public final void rule__MultiValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1442:1: ( ( ( rule__MultiValue__ValuesAssignment_2 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1443:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1443:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1444:1: ( rule__MultiValue__ValuesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1445:1: ( rule__MultiValue__ValuesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_BOOLEAN)||(LA9_0>=21 && LA9_0<=22)||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1445:2: rule__MultiValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl2944);
            	    rule__MultiValue__ValuesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1455:1: rule__MultiValue__Group__3 : rule__MultiValue__Group__3__Impl ;
    public final void rule__MultiValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1459:1: ( rule__MultiValue__Group__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1460:2: rule__MultiValue__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__32975);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1466:1: rule__MultiValue__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1470:1: ( ( ']' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1471:1: ( ']' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1471:1: ( ']' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1472:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__MultiValue__Group__3__Impl3003); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1493:1: rule__EnumAttribute__Group__0 : rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 ;
    public final void rule__EnumAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1497:1: ( rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1498:2: rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03042);
            rule__EnumAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03045);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1505:1: rule__EnumAttribute__Group__0__Impl : ( ':' ) ;
    public final void rule__EnumAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1509:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1510:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1510:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1511:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getColonKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__EnumAttribute__Group__0__Impl3073); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1524:1: rule__EnumAttribute__Group__1 : rule__EnumAttribute__Group__1__Impl ;
    public final void rule__EnumAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1528:1: ( rule__EnumAttribute__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1529:2: rule__EnumAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13104);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1535:1: rule__EnumAttribute__Group__1__Impl : ( ( rule__EnumAttribute__ValueAssignment_1 ) ) ;
    public final void rule__EnumAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1539:1: ( ( ( rule__EnumAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1540:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1540:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1541:1: ( rule__EnumAttribute__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1542:1: ( rule__EnumAttribute__ValueAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1542:2: rule__EnumAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3131);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1556:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1560:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1561:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03165);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03168);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1568:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1572:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1573:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1573:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1574:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3195);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1585:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1589:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1590:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13224);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1596:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1600:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1601:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1601:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1602:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1603:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1603:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3251);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1617:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1621:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1622:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03286);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03289);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1629:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1633:1: ( ( ( '.' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1634:1: ( ( '.' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1634:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1635:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1636:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1637:2: '.'
            {
            match(input,24,FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3318); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1648:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1652:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1653:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13350);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1659:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1663:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1664:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1664:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1665:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl3377);
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


    // $ANTLR start "rule__Factory__EpackagesAssignment_0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1681:1: rule__Factory__EpackagesAssignment_0 : ( rulePackageImport ) ;
    public final void rule__Factory__EpackagesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1685:1: ( ( rulePackageImport ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1686:1: ( rulePackageImport )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1686:1: ( rulePackageImport )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1687:1: rulePackageImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_03415);
            rulePackageImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Factory__EpackagesAssignment_0"


    // $ANTLR start "rule__Factory__AnnotationsAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1696:1: rule__Factory__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Factory__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1700:1: ( ( ruleAnnotation ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1701:1: ( ruleAnnotation )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1701:1: ( ruleAnnotation )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1702:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Factory__AnnotationsAssignment_13446);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Factory__AnnotationsAssignment_1"


    // $ANTLR start "rule__Factory__RootAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1711:1: rule__Factory__RootAssignment_2 : ( ruleNewObject ) ;
    public final void rule__Factory__RootAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1715:1: ( ( ruleNewObject ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1716:1: ( ruleNewObject )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1716:1: ( ruleNewObject )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1717:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_23477);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1726:1: rule__PackageImport__EPackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackageImport__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1730:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1731:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1731:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1732:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1733:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1734:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_13512);
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


    // $ANTLR start "rule__CustomNameMapping__EClassAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1745:1: rule__CustomNameMapping__EClassAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CustomNameMapping__EClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1749:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1750:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1750:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1751:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassCrossReference_2_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1752:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1753:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CustomNameMapping__EClassAssignment_23551);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1764:1: rule__CustomNameMapping__NameFeatureAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CustomNameMapping__NameFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1768:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1769:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1769:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1770:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1771:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1772:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomNameMapping__NameFeatureAssignment_43590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeIDTerminalRuleCall_4_0_1()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1783:1: rule__Feature__EFeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__EFeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1787:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1788:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1788:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1789:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1790:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1791:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_03629); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1802:1: rule__Feature__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1806:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1807:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1807:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1808:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_23664);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1817:1: rule__NewObject__EClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NewObject__EClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1821:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1822:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1822:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1823:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1824:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1825:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_03699);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1836:1: rule__NewObject__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NewObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1840:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1841:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1841:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1842:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_13734);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1851:1: rule__NewObject__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__NewObject__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1855:1: ( ( ruleFeature ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1856:1: ( ruleFeature )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1856:1: ( ruleFeature )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1857:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_33765);
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


    // $ANTLR start "rule__MultiValue__ValuesAssignment_2"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1866:1: rule__MultiValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__MultiValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1870:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1871:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1871:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1872:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_23796);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1881:1: rule__Reference__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1885:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1886:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1886:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1887:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1888:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1889:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment3831);
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


    // $ANTLR start "rule__Containment__ValueAssignment"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1900:1: rule__Containment__ValueAssignment : ( ruleNewObject ) ;
    public final void rule__Containment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1904:1: ( ( ruleNewObject ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1905:1: ( ruleNewObject )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1905:1: ( ruleNewObject )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1906:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment3866);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__Containment__ValueAssignment"


    // $ANTLR start "rule__EnumAttribute__ValueAssignment_1"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1915:1: rule__EnumAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1919:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1920:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1920:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1921:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1922:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1923:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_13901); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1934:1: rule__StringAttribute__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1938:1: ( ( RULE_STRING ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1939:1: ( RULE_STRING )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1939:1: ( RULE_STRING )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1940:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment3936); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1949:1: rule__IntegerAttribute__ValueAssignment : ( RULE_LONG ) ;
    public final void rule__IntegerAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1953:1: ( ( RULE_LONG ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1954:1: ( RULE_LONG )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1954:1: ( RULE_LONG )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1955:1: RULE_LONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueLONGTerminalRuleCall_0()); 
            }
            match(input,RULE_LONG,FOLLOW_RULE_LONG_in_rule__IntegerAttribute__ValueAssignment3967); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeAccess().getValueLONGTerminalRuleCall_0()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1964:1: rule__DoubleAttribute__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__DoubleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1968:1: ( ( RULE_DOUBLE ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1969:1: ( RULE_DOUBLE )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1969:1: ( RULE_DOUBLE )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1970:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__DoubleAttribute__ValueAssignment3998); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeAccess().getValueDOUBLETerminalRuleCall_0()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:1: rule__DateAttribute__ValueAssignment : ( RULE_DATE ) ;
    public final void rule__DateAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:1: ( ( RULE_DATE ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1984:1: ( RULE_DATE )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1984:1: ( RULE_DATE )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1985:1: RULE_DATE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueDATETerminalRuleCall_0()); 
            }
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateAttribute__ValueAssignment4029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeAccess().getValueDATETerminalRuleCall_0()); 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1994:1: rule__NullAttribute__ValueAssignment : ( ( 'NULL' ) ) ;
    public final void rule__NullAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1998:1: ( ( ( 'NULL' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1999:1: ( ( 'NULL' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1999:1: ( ( 'NULL' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2000:1: ( 'NULL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2001:1: ( 'NULL' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2002:1: 'NULL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__NullAttribute__ValueAssignment4065); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2017:1: rule__BooleanAttribute__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2021:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2022:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2022:1: ( RULE_BOOLEAN )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2023:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanAttribute__ValueAssignment4104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeAccess().getValueBOOLEANTerminalRuleCall_0()); 
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
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:632:6: ( ( ruleAttribute ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:632:6: ( ruleAttribute )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:632:6: ( ruleAttribute )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:633:1: ruleAttribute
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1292);
        ruleAttribute();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:638:6: ( ( ( ruleContainment ) ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:638:6: ( ( ruleContainment ) )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:638:6: ( ( ruleContainment ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:639:1: ( ruleContainment )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
        }
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:640:1: ( ruleContainment )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:640:3: ruleContainment
        {
        pushFollow(FOLLOW_ruleContainment_in_synpred3_InternalEFactory1310);
        ruleContainment();

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
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\4\uffff\1\6\5\uffff\2\6";
    static final String DFA1_minS =
        "\1\4\2\uffff\2\4\2\uffff\1\4\2\0\2\4";
    static final String DFA1_maxS =
        "\1\31\2\uffff\1\30\1\31\2\uffff\1\5\2\0\2\31";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\5\uffff";
    static final String DFA1_specialS =
        "\3\uffff\1\0\4\uffff\1\2\1\1\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\3\4\2\13\uffff\1\2\1\1\2\uffff\1\2",
            "",
            "",
            "\2\5\14\uffff\1\5\5\uffff\1\5",
            "\1\10\1\11\4\6\10\uffff\1\5\1\uffff\4\6\1\7\1\6",
            "",
            "",
            "\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\10\1\11\4\6\10\uffff\1\5\1\uffff\4\6\1\7\1\6",
            "\1\10\1\11\4\6\10\uffff\1\5\1\uffff\4\6\1\7\1\6"
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
            return "621:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_3>=RULE_ID && LA1_3<=RULE_LONG)||LA1_3==18||LA1_3==24) ) {s = 5;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 2;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index1_8);
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
 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0_in_ruleFactory100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_entryRulePackageImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__0_in_rulePackageImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_ruleAnnotation220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNameMapping253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__0_in_ruleCustomNameMapping279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0_in_ruleNewObject399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_entryRuleMultiValue486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValue493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ValueAssignment_in_ruleReference579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAttribute733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAttribute853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleAttribute913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateAttribute973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullAttribute1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAttribute1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Value__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_rule__Value__Alternatives1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_rule__ValidID__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01543 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__EpackagesAssignment_0_in_rule__Factory__Group__0__Impl1573 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11604 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__AnnotationsAssignment_1_in_rule__Factory__Group__1__Impl1634 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__RootAssignment_2_in_rule__Factory__Group__2__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01728 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageImport__Group__0__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__11790 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__21850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageImport__Group__2__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__0__Impl_in_rule__CustomNameMapping__Group__01915 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__1_in_rule__CustomNameMapping__Group__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CustomNameMapping__Group__0__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__1__Impl_in_rule__CustomNameMapping__Group__11977 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__2_in_rule__CustomNameMapping__Group__11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomNameMapping__Group__1__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__2__Impl_in_rule__CustomNameMapping__Group__22039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__3_in_rule__CustomNameMapping__Group__22042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__EClassAssignment_2_in_rule__CustomNameMapping__Group__2__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__3__Impl_in_rule__CustomNameMapping__Group__32099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__4_in_rule__CustomNameMapping__Group__32102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomNameMapping__Group__3__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__4__Impl_in_rule__CustomNameMapping__Group__42161 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__5_in_rule__CustomNameMapping__Group__42164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__NameFeatureAssignment_4_in_rule__CustomNameMapping__Group__4__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__5__Impl_in_rule__CustomNameMapping__Group__52221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CustomNameMapping__Group__5__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12352 = new BitSet(new long[]{0x00000000026203F0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02478 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12538 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22599 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NewObject__Group__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32661 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2691 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NewObject__Group__4__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__02791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__02794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__12852 = new BitSet(new long[]{0x0000000002E203F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__12855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MultiValue__Group__1__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__22914 = new BitSet(new long[]{0x0000000002E203F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__22917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl2944 = new BitSet(new long[]{0x00000000026203F2L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__32975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiValue__Group__3__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumAttribute__Group__0__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03165 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3251 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03286 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Factory__AnnotationsAssignment_13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_23477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_13512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CustomNameMapping__EClassAssignment_23551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomNameMapping__NameFeatureAssignment_43590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_03629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_03699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_13734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_33765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_23796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_rule__IntegerAttribute__ValueAssignment3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__DoubleAttribute__ValueAssignment3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateAttribute__ValueAssignment4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NullAttribute__ValueAssignment4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanAttribute__ValueAssignment4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_synpred3_InternalEFactory1310 = new BitSet(new long[]{0x0000000000000002L});

}