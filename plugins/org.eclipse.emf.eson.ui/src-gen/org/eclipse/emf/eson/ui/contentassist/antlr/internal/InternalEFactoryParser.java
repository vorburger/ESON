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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LONG", "RULE_STRING", "RULE_DOUBLE", "RULE_DATE", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "'.*'", "'import'", "'@Name'", "'{'", "'='", "'}'", "':'", "'['", "']'", "'.'", "'NULL'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DATE=8;
    public static final int T__26=26;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_LONG=5;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:145:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:146:1: ( ruleAnnotation EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:147:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation247);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation254); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:154:1: ruleAnnotation : ( ruleCustomNameMapping ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:158:2: ( ( ruleCustomNameMapping ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ruleCustomNameMapping )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:159:1: ( ruleCustomNameMapping )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:160:1: ruleCustomNameMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCustomNameMappingParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_ruleAnnotation280);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:173:1: entryRuleCustomNameMapping : ruleCustomNameMapping EOF ;
    public final void entryRuleCustomNameMapping() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:174:1: ( ruleCustomNameMapping EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:175:1: ruleCustomNameMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingRule()); 
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping306);
            ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomNameMappingRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNameMapping313); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:182:1: ruleCustomNameMapping : ( ( rule__CustomNameMapping__Group__0 ) ) ;
    public final void ruleCustomNameMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:186:2: ( ( ( rule__CustomNameMapping__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__CustomNameMapping__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:187:1: ( ( rule__CustomNameMapping__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:188:1: ( rule__CustomNameMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:1: ( rule__CustomNameMapping__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:189:2: rule__CustomNameMapping__Group__0
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__0_in_ruleCustomNameMapping339);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:201:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:202:1: ( ruleFeature EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:203:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature366);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature373); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:210:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:214:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:215:1: ( ( rule__Feature__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:216:1: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:1: ( rule__Feature__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:217:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature399);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:229:1: entryRuleNewObject : ruleNewObject EOF ;
    public final void entryRuleNewObject() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:230:1: ( ruleNewObject EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:231:1: ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject426);
            ruleNewObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewObjectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject433); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:238:1: ruleNewObject : ( ( rule__NewObject__Group__0 ) ) ;
    public final void ruleNewObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:242:2: ( ( ( rule__NewObject__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__NewObject__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:243:1: ( ( rule__NewObject__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:244:1: ( rule__NewObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:1: ( rule__NewObject__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:245:2: rule__NewObject__Group__0
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0_in_ruleNewObject459);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:257:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:258:1: ( ruleValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:259:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue486);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue493); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:266:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:270:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:271:1: ( ( rule__Value__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:272:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:1: ( rule__Value__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:273:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue519);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:285:1: entryRuleMultiValue : ruleMultiValue EOF ;
    public final void entryRuleMultiValue() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:286:1: ( ruleMultiValue EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:287:1: ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValue_in_entryRuleMultiValue546);
            ruleMultiValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValue553); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:294:1: ruleMultiValue : ( ( rule__MultiValue__Group__0 ) ) ;
    public final void ruleMultiValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:298:2: ( ( ( rule__MultiValue__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__MultiValue__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:299:1: ( ( rule__MultiValue__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:300:1: ( rule__MultiValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:1: ( rule__MultiValue__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:301:2: rule__MultiValue__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue579);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:313:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:314:1: ( ruleReference EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:315:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference606);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference613); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:322:1: ruleReference : ( ( rule__Reference__ValueAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:326:2: ( ( ( rule__Reference__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__Reference__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:327:1: ( ( rule__Reference__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:328:1: ( rule__Reference__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:1: ( rule__Reference__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:329:2: rule__Reference__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ValueAssignment_in_ruleReference639);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:341:1: entryRuleContainment : ruleContainment EOF ;
    public final void entryRuleContainment() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:342:1: ( ruleContainment EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:343:1: ruleContainment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentRule()); 
            }
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment666);
            ruleContainment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment673); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:350:1: ruleContainment : ( ( rule__Containment__ValueAssignment ) ) ;
    public final void ruleContainment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:354:2: ( ( ( rule__Containment__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__Containment__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:355:1: ( ( rule__Containment__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:356:1: ( rule__Containment__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:1: ( rule__Containment__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:357:2: rule__Containment__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment699);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:369:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:370:1: ( ruleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:371:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute726);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute733); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:378:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:382:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:383:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:384:1: ( rule__Attribute__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:1: ( rule__Attribute__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:385:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute759);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:397:1: entryRuleEnumAttribute : ruleEnumAttribute EOF ;
    public final void entryRuleEnumAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:398:1: ( ruleEnumAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:399:1: ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute786);
            ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAttribute793); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:406:1: ruleEnumAttribute : ( ( rule__EnumAttribute__Group__0 ) ) ;
    public final void ruleEnumAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:410:2: ( ( ( rule__EnumAttribute__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__EnumAttribute__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:411:1: ( ( rule__EnumAttribute__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:412:1: ( rule__EnumAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:1: ( rule__EnumAttribute__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:413:2: rule__EnumAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute819);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:425:1: entryRuleStringAttribute : ruleStringAttribute EOF ;
    public final void entryRuleStringAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:426:1: ( ruleStringAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:427:1: ruleStringAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute846);
            ruleStringAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute853); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:434:1: ruleStringAttribute : ( ( rule__StringAttribute__ValueAssignment ) ) ;
    public final void ruleStringAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:438:2: ( ( ( rule__StringAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__StringAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:439:1: ( ( rule__StringAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:440:1: ( rule__StringAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:1: ( rule__StringAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:441:2: rule__StringAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute879);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:453:1: entryRuleIntegerAttribute : ruleIntegerAttribute EOF ;
    public final void entryRuleIntegerAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:454:1: ( ruleIntegerAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:455:1: ruleIntegerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute906);
            ruleIntegerAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAttribute913); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:462:1: ruleIntegerAttribute : ( ( rule__IntegerAttribute__ValueAssignment ) ) ;
    public final void ruleIntegerAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:466:2: ( ( ( rule__IntegerAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:467:1: ( ( rule__IntegerAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:468:1: ( rule__IntegerAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:1: ( rule__IntegerAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:469:2: rule__IntegerAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute939);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:481:1: entryRuleDoubleAttribute : ruleDoubleAttribute EOF ;
    public final void entryRuleDoubleAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:482:1: ( ruleDoubleAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:483:1: ruleDoubleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute966);
            ruleDoubleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleAttribute973); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:490:1: ruleDoubleAttribute : ( ( rule__DoubleAttribute__ValueAssignment ) ) ;
    public final void ruleDoubleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:494:2: ( ( ( rule__DoubleAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:495:1: ( ( rule__DoubleAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:496:1: ( rule__DoubleAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:1: ( rule__DoubleAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:497:2: rule__DoubleAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute999);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:509:1: entryRuleDateAttribute : ruleDateAttribute EOF ;
    public final void entryRuleDateAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:510:1: ( ruleDateAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:511:1: ruleDateAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute1026);
            ruleDateAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateAttribute1033); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:518:1: ruleDateAttribute : ( ( rule__DateAttribute__ValueAssignment ) ) ;
    public final void ruleDateAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:522:2: ( ( ( rule__DateAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__DateAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:523:1: ( ( rule__DateAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:524:1: ( rule__DateAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:1: ( rule__DateAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:525:2: rule__DateAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute1059);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:537:1: entryRuleNullAttribute : ruleNullAttribute EOF ;
    public final void entryRuleNullAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:538:1: ( ruleNullAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:539:1: ruleNullAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute1086);
            ruleNullAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullAttribute1093); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:546:1: ruleNullAttribute : ( ( rule__NullAttribute__ValueAssignment ) ) ;
    public final void ruleNullAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:550:2: ( ( ( rule__NullAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__NullAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:551:1: ( ( rule__NullAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:552:1: ( rule__NullAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:1: ( rule__NullAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:553:2: rule__NullAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute1119);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:565:1: entryRuleBooleanAttribute : ruleBooleanAttribute EOF ;
    public final void entryRuleBooleanAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:566:1: ( ruleBooleanAttribute EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:567:1: ruleBooleanAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute1146);
            ruleBooleanAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAttribute1153); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:574:1: ruleBooleanAttribute : ( ( rule__BooleanAttribute__ValueAssignment ) ) ;
    public final void ruleBooleanAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:578:2: ( ( ( rule__BooleanAttribute__ValueAssignment ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:579:1: ( ( rule__BooleanAttribute__ValueAssignment ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:580:1: ( rule__BooleanAttribute__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueAssignment()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:1: ( rule__BooleanAttribute__ValueAssignment )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:581:2: rule__BooleanAttribute__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1179);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:593:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:594:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:595:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1206);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1213); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:602:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:606:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:607:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:608:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:609:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1239);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:621:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:622:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:623:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1266);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1273); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:630:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:634:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:635:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:635:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:636:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:637:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:637:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1299);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:649:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:650:1: ( ruleValidID EOF )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:651:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1326);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1333); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:658:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:662:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:663:1: ( ( rule__ValidID__Alternatives ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:663:1: ( ( rule__ValidID__Alternatives ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:664:1: ( rule__ValidID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getAlternatives()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:665:1: ( rule__ValidID__Alternatives )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:665:2: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1359);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:677:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:681:1: ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:682:1: ( ruleMultiValue )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:682:1: ( ruleMultiValue )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:683:1: ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1395);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:688:6: ( ruleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:688:6: ( ruleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:689:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Value__Alternatives1412);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:694:6: ( ( ruleContainment ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:694:6: ( ( ruleContainment ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:695:1: ( ruleContainment )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:1: ( ruleContainment )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:3: ruleContainment
                    {
                    pushFollow(FOLLOW_ruleContainment_in_rule__Value__Alternatives1430);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:700:6: ( ( ruleReference ) )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:700:6: ( ( ruleReference ) )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:701:1: ( ruleReference )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                    }
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:702:1: ( ruleReference )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:702:3: ruleReference
                    {
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1449);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:711:1: rule__Attribute__Alternatives : ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:715:1: ( ( ruleEnumAttribute ) | ( ruleStringAttribute ) | ( ruleIntegerAttribute ) | ( ruleBooleanAttribute ) | ( ruleDoubleAttribute ) | ( ruleDateAttribute ) | ( ruleNullAttribute ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 22:
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
            case 26:
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:1: ( ruleEnumAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:716:1: ( ruleEnumAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:717:1: ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1482);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ruleStringAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:722:6: ( ruleStringAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:723:1: ruleStringAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1499);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:728:6: ( ruleIntegerAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:728:6: ( ruleIntegerAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:729:1: ruleIntegerAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1516);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:734:6: ( ruleBooleanAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:734:6: ( ruleBooleanAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:735:1: ruleBooleanAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1533);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:740:6: ( ruleDoubleAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:740:6: ( ruleDoubleAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:741:1: ruleDoubleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1550);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:746:6: ( ruleDateAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:746:6: ( ruleDateAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:747:1: ruleDateAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1567);
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:752:6: ( ruleNullAttribute )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:752:6: ( ruleNullAttribute )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:753:1: ruleNullAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1584);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:763:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( RULE_LONG ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:767:1: ( ( RULE_ID ) | ( RULE_LONG ) )
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
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:768:1: ( RULE_ID )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:768:1: ( RULE_ID )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:769:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1616); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:774:6: ( RULE_LONG )
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:774:6: ( RULE_LONG )
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:775:1: RULE_LONG
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidIDAccess().getLONGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_LONG,FOLLOW_RULE_LONG_in_rule__ValidID__Alternatives1633); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:787:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:791:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:792:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01663);
            rule__Factory__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01666);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:799:1: rule__Factory__Group__0__Impl : ( ( rule__Factory__ImportsAssignment_0 )* ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:803:1: ( ( ( rule__Factory__ImportsAssignment_0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:804:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:804:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:805:1: ( rule__Factory__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:806:1: ( rule__Factory__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:806:2: rule__Factory__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1693);
            	    rule__Factory__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:816:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:820:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:821:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11724);
            rule__Factory__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11727);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:828:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__EpackagesAssignment_1 )* ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:832:1: ( ( ( rule__Factory__EpackagesAssignment_1 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:833:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:833:1: ( ( rule__Factory__EpackagesAssignment_1 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:834:1: ( rule__Factory__EpackagesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:835:1: ( rule__Factory__EpackagesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:835:2: rule__Factory__EpackagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Factory__EpackagesAssignment_1_in_rule__Factory__Group__1__Impl1754);
            	    rule__Factory__EpackagesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:845:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl rule__Factory__Group__3 ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:849:1: ( rule__Factory__Group__2__Impl rule__Factory__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:850:2: rule__Factory__Group__2__Impl rule__Factory__Group__3
            {
            pushFollow(FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21785);
            rule__Factory__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factory__Group__3_in_rule__Factory__Group__21788);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:857:1: rule__Factory__Group__2__Impl : ( ( rule__Factory__AnnotationsAssignment_2 )* ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:861:1: ( ( ( rule__Factory__AnnotationsAssignment_2 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:862:1: ( ( rule__Factory__AnnotationsAssignment_2 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:862:1: ( ( rule__Factory__AnnotationsAssignment_2 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:863:1: ( rule__Factory__AnnotationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:864:1: ( rule__Factory__AnnotationsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:864:2: rule__Factory__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Factory__AnnotationsAssignment_2_in_rule__Factory__Group__2__Impl1815);
            	    rule__Factory__AnnotationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:874:1: rule__Factory__Group__3 : rule__Factory__Group__3__Impl ;
    public final void rule__Factory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:878:1: ( rule__Factory__Group__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:879:2: rule__Factory__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Factory__Group__3__Impl_in_rule__Factory__Group__31846);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:885:1: rule__Factory__Group__3__Impl : ( ( rule__Factory__RootAssignment_3 ) ) ;
    public final void rule__Factory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:889:1: ( ( ( rule__Factory__RootAssignment_3 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:890:1: ( ( rule__Factory__RootAssignment_3 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:890:1: ( ( rule__Factory__RootAssignment_3 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:891:1: ( rule__Factory__RootAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootAssignment_3()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:892:1: ( rule__Factory__RootAssignment_3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:892:2: rule__Factory__RootAssignment_3
            {
            pushFollow(FOLLOW_rule__Factory__RootAssignment_3_in_rule__Factory__Group__3__Impl1873);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:910:1: rule__PackageImport__Group__0 : rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 ;
    public final void rule__PackageImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:914:1: ( rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:915:2: rule__PackageImport__Group__0__Impl rule__PackageImport__Group__1
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01911);
            rule__PackageImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01914);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:922:1: rule__PackageImport__Group__0__Impl : ( 'use' ) ;
    public final void rule__PackageImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:926:1: ( ( 'use' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:927:1: ( 'use' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:927:1: ( 'use' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:928:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getUseKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__PackageImport__Group__0__Impl1942); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:941:1: rule__PackageImport__Group__1 : rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 ;
    public final void rule__PackageImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:945:1: ( rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:946:2: rule__PackageImport__Group__1__Impl rule__PackageImport__Group__2
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__11973);
            rule__PackageImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__11976);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:953:1: rule__PackageImport__Group__1__Impl : ( ( rule__PackageImport__EPackageAssignment_1 ) ) ;
    public final void rule__PackageImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:957:1: ( ( ( rule__PackageImport__EPackageAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:958:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:958:1: ( ( rule__PackageImport__EPackageAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:959:1: ( rule__PackageImport__EPackageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:960:1: ( rule__PackageImport__EPackageAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:960:2: rule__PackageImport__EPackageAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl2003);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:970:1: rule__PackageImport__Group__2 : rule__PackageImport__Group__2__Impl ;
    public final void rule__PackageImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:974:1: ( rule__PackageImport__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:975:2: rule__PackageImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__22033);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:981:1: rule__PackageImport__Group__2__Impl : ( '.*' ) ;
    public final void rule__PackageImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:985:1: ( ( '.*' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:986:1: ( '.*' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:986:1: ( '.*' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:987:1: '.*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__PackageImport__Group__2__Impl2061); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1006:1: rule__NamespaceImport__Group__0 : rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 ;
    public final void rule__NamespaceImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1010:1: ( rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1011:2: rule__NamespaceImport__Group__0__Impl rule__NamespaceImport__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceImport__Group__0__Impl_in_rule__NamespaceImport__Group__02098);
            rule__NamespaceImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NamespaceImport__Group__1_in_rule__NamespaceImport__Group__02101);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1018:1: rule__NamespaceImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__NamespaceImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1022:1: ( ( 'import' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1023:1: ( 'import' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1023:1: ( 'import' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1024:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__NamespaceImport__Group__0__Impl2129); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1037:1: rule__NamespaceImport__Group__1 : rule__NamespaceImport__Group__1__Impl ;
    public final void rule__NamespaceImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1041:1: ( rule__NamespaceImport__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1042:2: rule__NamespaceImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceImport__Group__1__Impl_in_rule__NamespaceImport__Group__12160);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1048:1: rule__NamespaceImport__Group__1__Impl : ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__NamespaceImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1052:1: ( ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1053:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1053:1: ( ( rule__NamespaceImport__ImportedNamespaceAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1054:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1055:1: ( rule__NamespaceImport__ImportedNamespaceAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1055:2: rule__NamespaceImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__NamespaceImport__ImportedNamespaceAssignment_1_in_rule__NamespaceImport__Group__1__Impl2187);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1069:1: rule__CustomNameMapping__Group__0 : rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 ;
    public final void rule__CustomNameMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1073:1: ( rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1074:2: rule__CustomNameMapping__Group__0__Impl rule__CustomNameMapping__Group__1
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__0__Impl_in_rule__CustomNameMapping__Group__02221);
            rule__CustomNameMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__1_in_rule__CustomNameMapping__Group__02224);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1081:1: rule__CustomNameMapping__Group__0__Impl : ( '@Name' ) ;
    public final void rule__CustomNameMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1085:1: ( ( '@Name' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1086:1: ( '@Name' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1086:1: ( '@Name' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1087:1: '@Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__CustomNameMapping__Group__0__Impl2252); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1100:1: rule__CustomNameMapping__Group__1 : rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 ;
    public final void rule__CustomNameMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1104:1: ( rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1105:2: rule__CustomNameMapping__Group__1__Impl rule__CustomNameMapping__Group__2
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__1__Impl_in_rule__CustomNameMapping__Group__12283);
            rule__CustomNameMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__2_in_rule__CustomNameMapping__Group__12286);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1112:1: rule__CustomNameMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__CustomNameMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1116:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1117:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1117:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1118:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__CustomNameMapping__Group__1__Impl2314); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1131:1: rule__CustomNameMapping__Group__2 : rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 ;
    public final void rule__CustomNameMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1135:1: ( rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1136:2: rule__CustomNameMapping__Group__2__Impl rule__CustomNameMapping__Group__3
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__2__Impl_in_rule__CustomNameMapping__Group__22345);
            rule__CustomNameMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__3_in_rule__CustomNameMapping__Group__22348);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1143:1: rule__CustomNameMapping__Group__2__Impl : ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) ;
    public final void rule__CustomNameMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1147:1: ( ( ( rule__CustomNameMapping__EClassAssignment_2 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1148:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1148:1: ( ( rule__CustomNameMapping__EClassAssignment_2 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1149:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1150:1: ( rule__CustomNameMapping__EClassAssignment_2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1150:2: rule__CustomNameMapping__EClassAssignment_2
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__EClassAssignment_2_in_rule__CustomNameMapping__Group__2__Impl2375);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1160:1: rule__CustomNameMapping__Group__3 : rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 ;
    public final void rule__CustomNameMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1164:1: ( rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1165:2: rule__CustomNameMapping__Group__3__Impl rule__CustomNameMapping__Group__4
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__3__Impl_in_rule__CustomNameMapping__Group__32405);
            rule__CustomNameMapping__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__4_in_rule__CustomNameMapping__Group__32408);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1172:1: rule__CustomNameMapping__Group__3__Impl : ( '=' ) ;
    public final void rule__CustomNameMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1176:1: ( ( '=' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1177:1: ( '=' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1177:1: ( '=' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1178:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__CustomNameMapping__Group__3__Impl2436); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1191:1: rule__CustomNameMapping__Group__4 : rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 ;
    public final void rule__CustomNameMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1195:1: ( rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1196:2: rule__CustomNameMapping__Group__4__Impl rule__CustomNameMapping__Group__5
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__4__Impl_in_rule__CustomNameMapping__Group__42467);
            rule__CustomNameMapping__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__5_in_rule__CustomNameMapping__Group__42470);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1203:1: rule__CustomNameMapping__Group__4__Impl : ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) ;
    public final void rule__CustomNameMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1207:1: ( ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1208:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1208:1: ( ( rule__CustomNameMapping__NameFeatureAssignment_4 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1209:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureAssignment_4()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1210:1: ( rule__CustomNameMapping__NameFeatureAssignment_4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1210:2: rule__CustomNameMapping__NameFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__NameFeatureAssignment_4_in_rule__CustomNameMapping__Group__4__Impl2497);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1220:1: rule__CustomNameMapping__Group__5 : rule__CustomNameMapping__Group__5__Impl ;
    public final void rule__CustomNameMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1224:1: ( rule__CustomNameMapping__Group__5__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1225:2: rule__CustomNameMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CustomNameMapping__Group__5__Impl_in_rule__CustomNameMapping__Group__52527);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1231:1: rule__CustomNameMapping__Group__5__Impl : ( '}' ) ;
    public final void rule__CustomNameMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1235:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1236:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1236:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1237:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_21_in_rule__CustomNameMapping__Group__5__Impl2555); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1262:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1266:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1267:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02598);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02601);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1274:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__EFeatureAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1278:1: ( ( ( rule__Feature__EFeatureAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1279:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1279:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1280:1: ( rule__Feature__EFeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1281:1: ( rule__Feature__EFeatureAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1281:2: rule__Feature__EFeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2628);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1291:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1295:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1296:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12658);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12661);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1303:1: rule__Feature__Group__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1307:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1308:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1308:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1309:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Feature__Group__1__Impl2689); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1322:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1326:1: ( rule__Feature__Group__2__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1327:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22720);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1333:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1337:1: ( ( ( rule__Feature__ValueAssignment_2 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1338:1: ( ( rule__Feature__ValueAssignment_2 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1338:1: ( ( rule__Feature__ValueAssignment_2 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1339:1: ( rule__Feature__ValueAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1340:1: ( rule__Feature__ValueAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_LONG && LA7_0<=RULE_BOOLEAN)||(LA7_0>=22 && LA7_0<=23)||LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_LONG)||LA7_2==19||LA7_2==21||LA7_2==25) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1340:2: rule__Feature__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2747);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1356:1: rule__NewObject__Group__0 : rule__NewObject__Group__0__Impl rule__NewObject__Group__1 ;
    public final void rule__NewObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1360:1: ( rule__NewObject__Group__0__Impl rule__NewObject__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1361:2: rule__NewObject__Group__0__Impl rule__NewObject__Group__1
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02784);
            rule__NewObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02787);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1368:1: rule__NewObject__Group__0__Impl : ( ( rule__NewObject__EClassAssignment_0 ) ) ;
    public final void rule__NewObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1372:1: ( ( ( rule__NewObject__EClassAssignment_0 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1373:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1373:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1374:1: ( rule__NewObject__EClassAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1375:1: ( rule__NewObject__EClassAssignment_0 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1375:2: rule__NewObject__EClassAssignment_0
            {
            pushFollow(FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2814);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1385:1: rule__NewObject__Group__1 : rule__NewObject__Group__1__Impl rule__NewObject__Group__2 ;
    public final void rule__NewObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1389:1: ( rule__NewObject__Group__1__Impl rule__NewObject__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1390:2: rule__NewObject__Group__1__Impl rule__NewObject__Group__2
            {
            pushFollow(FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12844);
            rule__NewObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12847);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1397:1: rule__NewObject__Group__1__Impl : ( ( rule__NewObject__NameAssignment_1 )? ) ;
    public final void rule__NewObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1401:1: ( ( ( rule__NewObject__NameAssignment_1 )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1402:1: ( ( rule__NewObject__NameAssignment_1 )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1402:1: ( ( rule__NewObject__NameAssignment_1 )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1403:1: ( rule__NewObject__NameAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1404:1: ( rule__NewObject__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_LONG)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1404:2: rule__NewObject__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2874);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1414:1: rule__NewObject__Group__2 : rule__NewObject__Group__2__Impl rule__NewObject__Group__3 ;
    public final void rule__NewObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1418:1: ( rule__NewObject__Group__2__Impl rule__NewObject__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1419:2: rule__NewObject__Group__2__Impl rule__NewObject__Group__3
            {
            pushFollow(FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22905);
            rule__NewObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22908);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1426:1: rule__NewObject__Group__2__Impl : ( '{' ) ;
    public final void rule__NewObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1430:1: ( ( '{' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1431:1: ( '{' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1431:1: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1432:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__NewObject__Group__2__Impl2936); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1445:1: rule__NewObject__Group__3 : rule__NewObject__Group__3__Impl rule__NewObject__Group__4 ;
    public final void rule__NewObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1449:1: ( rule__NewObject__Group__3__Impl rule__NewObject__Group__4 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1450:2: rule__NewObject__Group__3__Impl rule__NewObject__Group__4
            {
            pushFollow(FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32967);
            rule__NewObject__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32970);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1457:1: rule__NewObject__Group__3__Impl : ( ( rule__NewObject__FeaturesAssignment_3 )* ) ;
    public final void rule__NewObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1461:1: ( ( ( rule__NewObject__FeaturesAssignment_3 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1462:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1462:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1463:1: ( rule__NewObject__FeaturesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1464:1: ( rule__NewObject__FeaturesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1464:2: rule__NewObject__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2997);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1474:1: rule__NewObject__Group__4 : rule__NewObject__Group__4__Impl ;
    public final void rule__NewObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1478:1: ( rule__NewObject__Group__4__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1479:2: rule__NewObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__43028);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1485:1: rule__NewObject__Group__4__Impl : ( '}' ) ;
    public final void rule__NewObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1489:1: ( ( '}' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1490:1: ( '}' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1490:1: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1491:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__NewObject__Group__4__Impl3056); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1514:1: rule__MultiValue__Group__0 : rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 ;
    public final void rule__MultiValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1518:1: ( rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1519:2: rule__MultiValue__Group__0__Impl rule__MultiValue__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__03097);
            rule__MultiValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__03100);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1526:1: rule__MultiValue__Group__0__Impl : ( () ) ;
    public final void rule__MultiValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1530:1: ( ( () ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1531:1: ( () )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1531:1: ( () )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1532:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getMultiValueAction_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1533:1: ()
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1535:1: 
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1545:1: rule__MultiValue__Group__1 : rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 ;
    public final void rule__MultiValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1549:1: ( rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1550:2: rule__MultiValue__Group__1__Impl rule__MultiValue__Group__2
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__13158);
            rule__MultiValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__13161);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1557:1: rule__MultiValue__Group__1__Impl : ( '[' ) ;
    public final void rule__MultiValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1561:1: ( ( '[' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1562:1: ( '[' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1562:1: ( '[' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1563:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__MultiValue__Group__1__Impl3189); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1576:1: rule__MultiValue__Group__2 : rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 ;
    public final void rule__MultiValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1580:1: ( rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1581:2: rule__MultiValue__Group__2__Impl rule__MultiValue__Group__3
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__23220);
            rule__MultiValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__23223);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1588:1: rule__MultiValue__Group__2__Impl : ( ( rule__MultiValue__ValuesAssignment_2 )* ) ;
    public final void rule__MultiValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1592:1: ( ( ( rule__MultiValue__ValuesAssignment_2 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1593:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1593:1: ( ( rule__MultiValue__ValuesAssignment_2 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1594:1: ( rule__MultiValue__ValuesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesAssignment_2()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1595:1: ( rule__MultiValue__ValuesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_BOOLEAN)||(LA10_0>=22 && LA10_0<=23)||LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1595:2: rule__MultiValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl3250);
            	    rule__MultiValue__ValuesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1605:1: rule__MultiValue__Group__3 : rule__MultiValue__Group__3__Impl ;
    public final void rule__MultiValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1609:1: ( rule__MultiValue__Group__3__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1610:2: rule__MultiValue__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__33281);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1616:1: rule__MultiValue__Group__3__Impl : ( ']' ) ;
    public final void rule__MultiValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1620:1: ( ( ']' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1621:1: ( ']' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1621:1: ( ']' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1622:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_24_in_rule__MultiValue__Group__3__Impl3309); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1643:1: rule__EnumAttribute__Group__0 : rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 ;
    public final void rule__EnumAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1647:1: ( rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1648:2: rule__EnumAttribute__Group__0__Impl rule__EnumAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03348);
            rule__EnumAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03351);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1655:1: rule__EnumAttribute__Group__0__Impl : ( ':' ) ;
    public final void rule__EnumAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1659:1: ( ( ':' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1660:1: ( ':' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1660:1: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1661:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getColonKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__EnumAttribute__Group__0__Impl3379); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1674:1: rule__EnumAttribute__Group__1 : rule__EnumAttribute__Group__1__Impl ;
    public final void rule__EnumAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1678:1: ( rule__EnumAttribute__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1679:2: rule__EnumAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13410);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1685:1: rule__EnumAttribute__Group__1__Impl : ( ( rule__EnumAttribute__ValueAssignment_1 ) ) ;
    public final void rule__EnumAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1689:1: ( ( ( rule__EnumAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1690:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1690:1: ( ( rule__EnumAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1691:1: ( rule__EnumAttribute__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueAssignment_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1692:1: ( rule__EnumAttribute__ValueAssignment_1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1692:2: rule__EnumAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3437);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1706:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1710:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1711:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03471);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03474);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1718:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1722:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1723:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1723:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1724:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3501);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1735:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1739:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1740:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13530);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1746:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1750:1: ( ( ( '.*' )? ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1751:1: ( ( '.*' )? )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1751:1: ( ( '.*' )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1752:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1753:1: ( '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1754:2: '.*'
                    {
                    match(input,16,FOLLOW_16_in_rule__QualifiedNameWithWildcard__Group__1__Impl3559); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1769:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1773:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1774:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03596);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03599);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1781:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1785:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1786:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1786:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1787:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3626);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1798:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1802:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1803:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13655);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1809:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1813:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1814:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1814:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1815:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1816:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1816:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3682);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1830:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1834:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1835:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03717);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03720);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1842:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1846:1: ( ( ( '.' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1847:1: ( ( '.' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1847:1: ( ( '.' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1848:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1849:1: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1850:2: '.'
            {
            match(input,25,FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3749); if (state.failed) return ;

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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1861:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1865:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1866:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13781);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1872:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1876:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1877:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1877:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1878:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl3808);
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


    // $ANTLR start "rule__Factory__ImportsAssignment_0"
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1894:1: rule__Factory__ImportsAssignment_0 : ( ruleNamespaceImport ) ;
    public final void rule__Factory__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1898:1: ( ( ruleNamespaceImport ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1899:1: ( ruleNamespaceImport )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1899:1: ( ruleNamespaceImport )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1900:1: ruleNamespaceImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getImportsNamespaceImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNamespaceImport_in_rule__Factory__ImportsAssignment_03846);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1909:1: rule__Factory__EpackagesAssignment_1 : ( rulePackageImport ) ;
    public final void rule__Factory__EpackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1913:1: ( ( rulePackageImport ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1914:1: ( rulePackageImport )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1914:1: ( rulePackageImport )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1915:1: rulePackageImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_13877);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1924:1: rule__Factory__AnnotationsAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__Factory__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1928:1: ( ( ruleAnnotation ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1929:1: ( ruleAnnotation )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1929:1: ( ruleAnnotation )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1930:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Factory__AnnotationsAssignment_23908);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1939:1: rule__Factory__RootAssignment_3 : ( ruleNewObject ) ;
    public final void rule__Factory__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1943:1: ( ( ruleNewObject ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1944:1: ( ruleNewObject )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1944:1: ( ruleNewObject )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1945:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_33939);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1954:1: rule__PackageImport__EPackageAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PackageImport__EPackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1958:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1959:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1959:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1960:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1961:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1962:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageImportAccess().getEPackageEPackageQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_13974);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:1: rule__NamespaceImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__NamespaceImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1978:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1978:1: ( ruleQualifiedNameWithWildcard )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__NamespaceImport__ImportedNamespaceAssignment_14009);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1988:1: rule__CustomNameMapping__EClassAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CustomNameMapping__EClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1992:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1993:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1993:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1994:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassCrossReference_2_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1995:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1996:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getEClassEClassQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CustomNameMapping__EClassAssignment_24044);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2007:1: rule__CustomNameMapping__NameFeatureAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CustomNameMapping__NameFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2011:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2012:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2012:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2013:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2014:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2015:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomNameMapping__NameFeatureAssignment_44083); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2026:1: rule__Feature__EFeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__EFeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2030:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2031:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2031:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2032:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2033:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2034:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_04122); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2045:1: rule__Feature__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2049:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2050:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2050:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2051:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_24157);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2060:1: rule__NewObject__EClassAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NewObject__EClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2064:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2065:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2065:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2066:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2067:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2068:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getEClassEClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_04192);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2079:1: rule__NewObject__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NewObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2083:1: ( ( ruleValidID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2084:1: ( ruleValidID )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2084:1: ( ruleValidID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2085:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_14227);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2094:1: rule__NewObject__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__NewObject__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2098:1: ( ( ruleFeature ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2099:1: ( ruleFeature )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2099:1: ( ruleFeature )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2100:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_34258);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2109:1: rule__MultiValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__MultiValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2113:1: ( ( ruleValue ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2114:1: ( ruleValue )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2114:1: ( ruleValue )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2115:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_24289);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2124:1: rule__Reference__ValueAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2128:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2129:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2129:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2130:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2131:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2132:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getValueEObjectQualifiedNameParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment4324);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2143:1: rule__Containment__ValueAssignment : ( ruleNewObject ) ;
    public final void rule__Containment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2147:1: ( ( ruleNewObject ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2148:1: ( ruleNewObject )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2148:1: ( ruleNewObject )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2149:1: ruleNewObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment4359);
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2158:1: rule__EnumAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2162:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2163:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2163:1: ( ( RULE_ID ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2164:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2165:1: ( RULE_ID )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2166:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_14394); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2177:1: rule__StringAttribute__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2181:1: ( ( RULE_STRING ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2182:1: ( RULE_STRING )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2182:1: ( RULE_STRING )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2183:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment4429); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2192:1: rule__IntegerAttribute__ValueAssignment : ( RULE_LONG ) ;
    public final void rule__IntegerAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2196:1: ( ( RULE_LONG ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2197:1: ( RULE_LONG )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2197:1: ( RULE_LONG )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2198:1: RULE_LONG
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAttributeAccess().getValueLONGTerminalRuleCall_0()); 
            }
            match(input,RULE_LONG,FOLLOW_RULE_LONG_in_rule__IntegerAttribute__ValueAssignment4460); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2207:1: rule__DoubleAttribute__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__DoubleAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2211:1: ( ( RULE_DOUBLE ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2212:1: ( RULE_DOUBLE )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2212:1: ( RULE_DOUBLE )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2213:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAttributeAccess().getValueDOUBLETerminalRuleCall_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__DoubleAttribute__ValueAssignment4491); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2222:1: rule__DateAttribute__ValueAssignment : ( RULE_DATE ) ;
    public final void rule__DateAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2226:1: ( ( RULE_DATE ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2227:1: ( RULE_DATE )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2227:1: ( RULE_DATE )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2228:1: RULE_DATE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateAttributeAccess().getValueDATETerminalRuleCall_0()); 
            }
            match(input,RULE_DATE,FOLLOW_RULE_DATE_in_rule__DateAttribute__ValueAssignment4522); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2237:1: rule__NullAttribute__ValueAssignment : ( ( 'NULL' ) ) ;
    public final void rule__NullAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2241:1: ( ( ( 'NULL' ) ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2242:1: ( ( 'NULL' ) )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2242:1: ( ( 'NULL' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2243:1: ( 'NULL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2244:1: ( 'NULL' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2245:1: 'NULL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__NullAttribute__ValueAssignment4558); if (state.failed) return ;
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
    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2260:1: rule__BooleanAttribute__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanAttribute__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2264:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2265:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2265:1: ( RULE_BOOLEAN )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:2266:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAttributeAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanAttribute__ValueAssignment4597); if (state.failed) return ;
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
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:688:6: ( ( ruleAttribute ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:688:6: ( ruleAttribute )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:688:6: ( ruleAttribute )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:689:1: ruleAttribute
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1412);
        ruleAttribute();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:694:6: ( ( ( ruleContainment ) ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:694:6: ( ( ruleContainment ) )
        {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:694:6: ( ( ruleContainment ) )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:695:1: ( ruleContainment )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
        }
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:1: ( ruleContainment )
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:696:3: ruleContainment
        {
        pushFollow(FOLLOW_ruleContainment_in_synpred3_InternalEFactory1430);
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
        "\1\32\2\uffff\1\31\1\32\2\uffff\1\5\2\0\2\32";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\5\uffff";
    static final String DFA1_specialS =
        "\3\uffff\1\2\4\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\3\4\2\14\uffff\1\2\1\1\2\uffff\1\2",
            "",
            "",
            "\2\5\15\uffff\1\5\5\uffff\1\5",
            "\1\10\1\11\4\6\11\uffff\1\5\1\uffff\4\6\1\7\1\6",
            "",
            "",
            "\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\10\1\11\4\6\11\uffff\1\5\1\uffff\4\6\1\7\1\6",
            "\1\10\1\11\4\6\11\uffff\1\5\1\uffff\4\6\1\7\1\6"
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
            return "677:1: rule__Value__Alternatives : ( ( ruleMultiValue ) | ( ruleAttribute ) | ( ( ruleContainment ) ) | ( ( ruleReference ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalEFactory()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index1_8);
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
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA1_3>=RULE_ID && LA1_3<=RULE_LONG)||LA1_3==19||LA1_3==25) ) {s = 5;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 2;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index1_3);
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
    public static final BitSet FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceImport194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__0_in_ruleNamespaceImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_ruleAnnotation280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNameMapping313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__0_in_ruleCustomNameMapping339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0_in_ruleNewObject459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_entryRuleMultiValue546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValue553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0_in_ruleMultiValue579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ValueAssignment_in_ruleReference639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAttribute793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0_in_ruleEnumAttribute819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringAttribute__ValueAssignment_in_ruleStringAttribute879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAttribute913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAttribute__ValueAssignment_in_ruleIntegerAttribute939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleAttribute973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleAttribute__ValueAssignment_in_ruleDoubleAttribute999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateAttribute1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateAttribute__ValueAssignment_in_ruleDateAttribute1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullAttribute1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullAttribute__ValueAssignment_in_ruleNullAttribute1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAttribute1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAttribute__ValueAssignment_in_ruleBooleanAttribute1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValidID__Alternatives_in_ruleValidID1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_rule__Value__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Value__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_rule__Value__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_rule__Attribute__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_rule__Attribute__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_rule__Attribute__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_rule__Attribute__Alternatives1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_rule__Attribute__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_rule__Attribute__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_rule__Attribute__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ValidID__Alternatives1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_rule__ValidID__Alternatives1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01663 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1693 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11724 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__Factory__Group__2_in_rule__Factory__Group__11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__EpackagesAssignment_1_in_rule__Factory__Group__1__Impl1754 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Factory__Group__2__Impl_in_rule__Factory__Group__21785 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__Factory__Group__3_in_rule__Factory__Group__21788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__AnnotationsAssignment_2_in_rule__Factory__Group__2__Impl1815 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Factory__Group__3__Impl_in_rule__Factory__Group__31846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__RootAssignment_3_in_rule__Factory__Group__3__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__0__Impl_in_rule__PackageImport__Group__01911 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1_in_rule__PackageImport__Group__01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageImport__Group__0__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__1__Impl_in_rule__PackageImport__Group__11973 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2_in_rule__PackageImport__Group__11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__EPackageAssignment_1_in_rule__PackageImport__Group__1__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageImport__Group__2__Impl_in_rule__PackageImport__Group__22033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageImport__Group__2__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__0__Impl_in_rule__NamespaceImport__Group__02098 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__1_in_rule__NamespaceImport__Group__02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamespaceImport__Group__0__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__Group__1__Impl_in_rule__NamespaceImport__Group__12160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceImport__ImportedNamespaceAssignment_1_in_rule__NamespaceImport__Group__1__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__0__Impl_in_rule__CustomNameMapping__Group__02221 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__1_in_rule__CustomNameMapping__Group__02224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomNameMapping__Group__0__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__1__Impl_in_rule__CustomNameMapping__Group__12283 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__2_in_rule__CustomNameMapping__Group__12286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomNameMapping__Group__1__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__2__Impl_in_rule__CustomNameMapping__Group__22345 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__3_in_rule__CustomNameMapping__Group__22348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__EClassAssignment_2_in_rule__CustomNameMapping__Group__2__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__3__Impl_in_rule__CustomNameMapping__Group__32405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__4_in_rule__CustomNameMapping__Group__32408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CustomNameMapping__Group__3__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__4__Impl_in_rule__CustomNameMapping__Group__42467 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__5_in_rule__CustomNameMapping__Group__42470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__NameFeatureAssignment_4_in_rule__CustomNameMapping__Group__4__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNameMapping__Group__5__Impl_in_rule__CustomNameMapping__Group__52527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CustomNameMapping__Group__5__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__02598 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__02601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__12658 = new BitSet(new long[]{0x0000000004C483F0L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__22720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__02784 = new BitSet(new long[]{0x00000000000C8030L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__02787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12844 = new BitSet(new long[]{0x00000000000C8030L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22905 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NewObject__Group__2__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32967 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__43028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NewObject__Group__4__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__0__Impl_in_rule__MultiValue__Group__03097 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1_in_rule__MultiValue__Group__03100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__1__Impl_in_rule__MultiValue__Group__13158 = new BitSet(new long[]{0x0000000005C483F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2_in_rule__MultiValue__Group__13161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiValue__Group__1__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__2__Impl_in_rule__MultiValue__Group__23220 = new BitSet(new long[]{0x0000000005C483F0L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3_in_rule__MultiValue__Group__23223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValue__ValuesAssignment_2_in_rule__MultiValue__Group__2__Impl3250 = new BitSet(new long[]{0x0000000004C483F2L});
    public static final BitSet FOLLOW_rule__MultiValue__Group__3__Impl_in_rule__MultiValue__Group__33281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiValue__Group__3__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__0__Impl_in_rule__EnumAttribute__Group__03348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1_in_rule__EnumAttribute__Group__03351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumAttribute__Group__0__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__Group__1__Impl_in_rule__EnumAttribute__Group__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumAttribute__ValueAssignment_1_in_rule__EnumAttribute__Group__1__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03471 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QualifiedNameWithWildcard__Group__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03596 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3682 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03717 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_rule__Factory__ImportsAssignment_03846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_rule__Factory__EpackagesAssignment_13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Factory__AnnotationsAssignment_23908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_33939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageImport__EPackageAssignment_13974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__NamespaceImport__ImportedNamespaceAssignment_14009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CustomNameMapping__EClassAssignment_24044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomNameMapping__NameFeatureAssignment_44083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_04122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_24157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NewObject__EClassAssignment_04192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__NewObject__NameAssignment_14227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_34258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__MultiValue__ValuesAssignment_24289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Reference__ValueAssignment4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumAttribute__ValueAssignment_14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAttribute__ValueAssignment4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_in_rule__IntegerAttribute__ValueAssignment4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__DoubleAttribute__ValueAssignment4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_in_rule__DateAttribute__ValueAssignment4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NullAttribute__ValueAssignment4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanAttribute__ValueAssignment4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_synpred2_InternalEFactory1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_synpred3_InternalEFactory1430 = new BitSet(new long[]{0x0000000000000002L});

}