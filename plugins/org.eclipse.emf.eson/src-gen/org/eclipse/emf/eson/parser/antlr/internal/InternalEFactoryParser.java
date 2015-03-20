package org.eclipse.emf.eson.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.emf.eson.services.EFactoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEFactoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LONG_ID", "RULE_LONG_UNSIGNED", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "'.*'", "'import'", "'@Name'", "'{'", "'='", "'}'", "':'", "'['", "']'", "'NULL'", "'.'", "'true'", "'false'", "'-'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_LONG_UNSIGNED=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_LONG_ID=6;
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
    public String getGrammarFileName() { return "../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g"; }



     	private EFactoryGrammarAccess grammarAccess;
     	
        public InternalEFactoryParser(TokenStream input, EFactoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Factory";	
       	}
       	
       	@Override
       	protected EFactoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFactory"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:67:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:68:2: (iv_ruleFactory= ruleFactory EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:69:2: iv_ruleFactory= ruleFactory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFactoryRule()); 
            }
            pushFollow(FOLLOW_ruleFactory_in_entryRuleFactory75);
            iv_ruleFactory=ruleFactory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFactory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactory85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:76:1: ruleFactory returns [EObject current=null] : ( ( (lv_imports_0_0= ruleNamespaceImport ) )* ( (lv_epackages_1_0= rulePackageImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )* ( (lv_root_3_0= ruleNewObject ) ) ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_epackages_1_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_root_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:79:28: ( ( ( (lv_imports_0_0= ruleNamespaceImport ) )* ( (lv_epackages_1_0= rulePackageImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )* ( (lv_root_3_0= ruleNewObject ) ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:80:1: ( ( (lv_imports_0_0= ruleNamespaceImport ) )* ( (lv_epackages_1_0= rulePackageImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )* ( (lv_root_3_0= ruleNewObject ) ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:80:1: ( ( (lv_imports_0_0= ruleNamespaceImport ) )* ( (lv_epackages_1_0= rulePackageImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )* ( (lv_root_3_0= ruleNewObject ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:80:2: ( (lv_imports_0_0= ruleNamespaceImport ) )* ( (lv_epackages_1_0= rulePackageImport ) )* ( (lv_annotations_2_0= ruleAnnotation ) )* ( (lv_root_3_0= ruleNewObject ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:80:2: ( (lv_imports_0_0= ruleNamespaceImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:81:1: (lv_imports_0_0= ruleNamespaceImport )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:81:1: (lv_imports_0_0= ruleNamespaceImport )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:82:3: lv_imports_0_0= ruleNamespaceImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFactoryAccess().getImportsNamespaceImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNamespaceImport_in_ruleFactory131);
            	    lv_imports_0_0=ruleNamespaceImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"NamespaceImport");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:98:3: ( (lv_epackages_1_0= rulePackageImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:99:1: (lv_epackages_1_0= rulePackageImport )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:99:1: (lv_epackages_1_0= rulePackageImport )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:100:3: lv_epackages_1_0= rulePackageImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFactoryAccess().getEpackagesPackageImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageImport_in_ruleFactory153);
            	    lv_epackages_1_0=rulePackageImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"epackages",
            	              		lv_epackages_1_0, 
            	              		"PackageImport");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:116:3: ( (lv_annotations_2_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:117:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:117:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:118:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFactoryAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFactory175);
            	    lv_annotations_2_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_2_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:134:3: ( (lv_root_3_0= ruleNewObject ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:135:1: (lv_root_3_0= ruleNewObject )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:135:1: (lv_root_3_0= ruleNewObject )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:136:3: lv_root_3_0= ruleNewObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNewObject_in_ruleFactory197);
            lv_root_3_0=ruleNewObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFactoryRule());
              	        }
                     		set(
                     			current, 
                     			"root",
                      		lv_root_3_0, 
                      		"NewObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRulePackageImport"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:160:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:161:2: (iv_rulePackageImport= rulePackageImport EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:162:2: iv_rulePackageImport= rulePackageImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageImportRule()); 
            }
            pushFollow(FOLLOW_rulePackageImport_in_entryRulePackageImport233);
            iv_rulePackageImport=rulePackageImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageImport243); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageImport"


    // $ANTLR start "rulePackageImport"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:169:1: rulePackageImport returns [EObject current=null] : (otherlv_0= 'use' ( ( ruleQualifiedName ) ) otherlv_2= '.*' ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:172:28: ( (otherlv_0= 'use' ( ( ruleQualifiedName ) ) otherlv_2= '.*' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:173:1: (otherlv_0= 'use' ( ( ruleQualifiedName ) ) otherlv_2= '.*' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:173:1: (otherlv_0= 'use' ( ( ruleQualifiedName ) ) otherlv_2= '.*' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:173:3: otherlv_0= 'use' ( ( ruleQualifiedName ) ) otherlv_2= '.*'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackageImport280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageImportAccess().getUseKeyword_0());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:177:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:178:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:178:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:179:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageImportRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageImportAccess().getEPackageEPackageCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageImport303);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackageImport315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageImportAccess().getFullStopAsteriskKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleNamespaceImport"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:204:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:205:2: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:206:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceImportRule()); 
            }
            pushFollow(FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport351);
            iv_ruleNamespaceImport=ruleNamespaceImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceImport361); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:213:1: ruleNamespaceImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:216:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:217:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:217:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:217:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNamespaceImport398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNamespaceImportAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:221:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:222:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:223:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleNamespaceImport419);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:247:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:248:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:249:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation455);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:256:1: ruleAnnotation returns [EObject current=null] : this_CustomNameMapping_0= ruleCustomNameMapping ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CustomNameMapping_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:259:28: (this_CustomNameMapping_0= ruleCustomNameMapping )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:261:5: this_CustomNameMapping_0= ruleCustomNameMapping
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAnnotationAccess().getCustomNameMappingParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_ruleAnnotation511);
            this_CustomNameMapping_0=ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CustomNameMapping_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCustomNameMapping"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:277:1: entryRuleCustomNameMapping returns [EObject current=null] : iv_ruleCustomNameMapping= ruleCustomNameMapping EOF ;
    public final EObject entryRuleCustomNameMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomNameMapping = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:278:2: (iv_ruleCustomNameMapping= ruleCustomNameMapping EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:279:2: iv_ruleCustomNameMapping= ruleCustomNameMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomNameMappingRule()); 
            }
            pushFollow(FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping545);
            iv_ruleCustomNameMapping=ruleCustomNameMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomNameMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNameMapping555); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCustomNameMapping"


    // $ANTLR start "ruleCustomNameMapping"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:286:1: ruleCustomNameMapping returns [EObject current=null] : (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomNameMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:289:28: ( (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:1: (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:1: (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( ( ruleQualifiedName ) ) otherlv_5= '}' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:3: otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( ( ruleQualifiedName ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleCustomNameMapping592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCustomNameMappingAccess().getNameKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleCustomNameMapping604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCustomNameMappingAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:298:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:299:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:299:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:300:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomNameMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomNameMappingAccess().getEClassEClassCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCustomNameMapping627);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCustomNameMapping639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:317:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:318:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:318:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:319:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomNameMappingRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCustomNameMapping662);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCustomNameMapping674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCustomNameMappingAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCustomNameMapping"


    // $ANTLR start "entryRuleFeature"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:344:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:345:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:346:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature710);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature720); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:353:1: ruleFeature returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:356:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:357:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:357:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:357:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )?
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:357:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:358:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:358:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:359:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFeatureRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature768);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFeature780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:376:1: ( (lv_value_2_0= ruleValue ) )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:377:1: (lv_value_2_0= ruleValue )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:377:1: (lv_value_2_0= ruleValue )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:378:3: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleFeature801);
                    lv_value_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNewObject"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:402:1: entryRuleNewObject returns [EObject current=null] : iv_ruleNewObject= ruleNewObject EOF ;
    public final EObject entryRuleNewObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewObject = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:403:2: (iv_ruleNewObject= ruleNewObject EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:404:2: iv_ruleNewObject= ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject838);
            iv_ruleNewObject=ruleNewObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNewObject"


    // $ANTLR start "ruleNewObject"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:411:1: ruleNewObject returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleNewObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:414:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:415:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:415:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:415:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= ruleValidID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:415:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:416:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:416:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:417:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewObjectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewObject896);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:430:2: ( (lv_name_1_0= ruleValidID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_LONG_UNSIGNED)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:431:1: (lv_name_1_0= ruleValidID )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:431:1: (lv_name_1_0= ruleValidID )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:432:3: lv_name_1_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewObjectAccess().getNameValidIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleNewObject917);
                    lv_name_1_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNewObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNewObject930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:452:1: ( (lv_features_3_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_LONG_UNSIGNED)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:453:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:453:1: (lv_features_3_0= ruleFeature )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:454:3: lv_features_3_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNewObject951);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNewObjectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_3_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleNewObject964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNewObject"


    // $ANTLR start "entryRuleValue"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:482:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:483:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:484:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1000);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:491:1: ruleValue returns [EObject current=null] : (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () ) | ( ( ruleReference )=>this_Reference_9= ruleReference ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MultiValue_0 = null;

        EObject this_Attribute_1 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_features_6_0 = null;

        EObject this_Reference_9 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:494:28: ( (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () ) | ( ( ruleReference )=>this_Reference_9= ruleReference ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:495:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () ) | ( ( ruleReference )=>this_Reference_9= ruleReference ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:495:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () ) | ( ( ruleReference )=>this_Reference_9= ruleReference ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:496:5: this_MultiValue_0= ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultiValue_in_ruleValue1057);
                    this_MultiValue_0=ruleMultiValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:506:5: this_Attribute_1= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleValue1084);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:6: ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:6: ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:7: ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' ()
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:7: ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:8: ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:525:5: ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:525:6: () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{'
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:525:6: ()
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:526:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getValueAccess().getNewObjectAction_2_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:531:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:532:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:532:1: ( ruleQualifiedName )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:533:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getValueRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getEClassEClassCrossReference_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleValue1157);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:546:2: ( (lv_name_4_0= ruleValidID ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_LONG_UNSIGNED)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:547:1: (lv_name_4_0= ruleValidID )
                            {
                            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:547:1: (lv_name_4_0= ruleValidID )
                            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:548:3: lv_name_4_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValueAccess().getNameValidIDParserRuleCall_2_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleValue1178);
                            lv_name_4_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_4_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleValue1191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2_0_0_3());
                          
                    }

                    }


                    }

                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:568:3: ( (lv_features_6_0= ruleFeature ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_LONG_UNSIGNED)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:569:1: (lv_features_6_0= ruleFeature )
                    	    {
                    	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:569:1: (lv_features_6_0= ruleFeature )
                    	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:570:3: lv_features_6_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueAccess().getFeaturesFeatureParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleValue1214);
                    	    lv_features_6_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"features",
                    	              		lv_features_6_0, 
                    	              		"Feature");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleValue1227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:590:1: ()
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:591:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getValueAccess().getContainmentValueAction_2_3(),
                                  current);
                          
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:597:6: ( ( ruleReference )=>this_Reference_9= ruleReference )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:597:6: ( ( ruleReference )=>this_Reference_9= ruleReference )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:597:7: ( ruleReference )=>this_Reference_9= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1271);
                    this_Reference_9=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reference_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMultiValue"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:614:1: entryRuleMultiValue returns [EObject current=null] : iv_ruleMultiValue= ruleMultiValue EOF ;
    public final EObject entryRuleMultiValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValue = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:615:2: (iv_ruleMultiValue= ruleMultiValue EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:616:2: iv_ruleMultiValue= ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValue_in_entryRuleMultiValue1307);
            iv_ruleMultiValue=ruleMultiValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValue1317); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiValue"


    // $ANTLR start "ruleMultiValue"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:623:1: ruleMultiValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleMultiValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:626:28: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:627:1: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:627:1: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:627:2: () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']'
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:627:2: ()
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:628:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiValueAccess().getMultiValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMultiValue1363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:637:1: ( (lv_values_2_0= ruleValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_LONG_UNSIGNED)||(LA10_0>=20 && LA10_0<=21)||LA10_0==23||(LA10_0>=25 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:638:1: (lv_values_2_0= ruleValue )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:638:1: (lv_values_2_0= ruleValue )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:639:3: lv_values_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleMultiValue1384);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_2_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMultiValue1397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMultiValueAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiValue"


    // $ANTLR start "entryRuleReference"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:667:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:668:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:669:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1433);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:676:1: ruleReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:679:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:680:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:680:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:681:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:681:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:682:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReference1490);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:703:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:704:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:705:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1525);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1535); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:712:1: ruleAttribute returns [EObject current=null] : (this_EnumAttribute_0= ruleEnumAttribute | this_StringAttribute_1= ruleStringAttribute | this_IntegerAttribute_2= ruleIntegerAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_DoubleAttribute_4= ruleDoubleAttribute | this_DateAttribute_5= ruleDateAttribute | this_NullAttribute_6= ruleNullAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_EnumAttribute_0 = null;

        EObject this_StringAttribute_1 = null;

        EObject this_IntegerAttribute_2 = null;

        EObject this_BooleanAttribute_3 = null;

        EObject this_DoubleAttribute_4 = null;

        EObject this_DateAttribute_5 = null;

        EObject this_NullAttribute_6 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:715:28: ( (this_EnumAttribute_0= ruleEnumAttribute | this_StringAttribute_1= ruleStringAttribute | this_IntegerAttribute_2= ruleIntegerAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_DoubleAttribute_4= ruleDoubleAttribute | this_DateAttribute_5= ruleDateAttribute | this_NullAttribute_6= ruleNullAttribute ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:716:1: (this_EnumAttribute_0= ruleEnumAttribute | this_StringAttribute_1= ruleStringAttribute | this_IntegerAttribute_2= ruleIntegerAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_DoubleAttribute_4= ruleDoubleAttribute | this_DateAttribute_5= ruleDateAttribute | this_NullAttribute_6= ruleNullAttribute )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:716:1: (this_EnumAttribute_0= ruleEnumAttribute | this_StringAttribute_1= ruleStringAttribute | this_IntegerAttribute_2= ruleIntegerAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_DoubleAttribute_4= ruleDoubleAttribute | this_DateAttribute_5= ruleDateAttribute | this_NullAttribute_6= ruleNullAttribute )
            int alt11=7;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:717:5: this_EnumAttribute_0= ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumAttribute_in_ruleAttribute1582);
                    this_EnumAttribute_0=ruleEnumAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumAttribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:727:5: this_StringAttribute_1= ruleStringAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getStringAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringAttribute_in_ruleAttribute1609);
                    this_StringAttribute_1=ruleStringAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringAttribute_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:737:5: this_IntegerAttribute_2= ruleIntegerAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getIntegerAttributeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerAttribute_in_ruleAttribute1636);
                    this_IntegerAttribute_2=ruleIntegerAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerAttribute_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:747:5: this_BooleanAttribute_3= ruleBooleanAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getBooleanAttributeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanAttribute_in_ruleAttribute1663);
                    this_BooleanAttribute_3=ruleBooleanAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanAttribute_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:757:5: this_DoubleAttribute_4= ruleDoubleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getDoubleAttributeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleAttribute_in_ruleAttribute1690);
                    this_DoubleAttribute_4=ruleDoubleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleAttribute_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:767:5: this_DateAttribute_5= ruleDateAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getDateAttributeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateAttribute_in_ruleAttribute1717);
                    this_DateAttribute_5=ruleDateAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateAttribute_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:777:5: this_NullAttribute_6= ruleNullAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getNullAttributeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullAttribute_in_ruleAttribute1744);
                    this_NullAttribute_6=ruleNullAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullAttribute_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEnumAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:793:1: entryRuleEnumAttribute returns [EObject current=null] : iv_ruleEnumAttribute= ruleEnumAttribute EOF ;
    public final EObject entryRuleEnumAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:794:2: (iv_ruleEnumAttribute= ruleEnumAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:795:2: iv_ruleEnumAttribute= ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute1779);
            iv_ruleEnumAttribute=ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAttribute1789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumAttribute"


    // $ANTLR start "ruleEnumAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:802:1: ruleEnumAttribute returns [EObject current=null] : (otherlv_0= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:805:28: ( (otherlv_0= ':' ( ( ruleQualifiedName ) ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:806:1: (otherlv_0= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:806:1: (otherlv_0= ':' ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:806:3: otherlv_0= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEnumAttribute1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAttributeAccess().getColonKeyword_0());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:810:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:811:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:811:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:812:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumAttributeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEnumAttribute1849);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumAttribute"


    // $ANTLR start "entryRuleStringAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:833:1: entryRuleStringAttribute returns [EObject current=null] : iv_ruleStringAttribute= ruleStringAttribute EOF ;
    public final EObject entryRuleStringAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:834:2: (iv_ruleStringAttribute= ruleStringAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:835:2: iv_ruleStringAttribute= ruleStringAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1885);
            iv_ruleStringAttribute=ruleStringAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringAttribute1895); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringAttribute"


    // $ANTLR start "ruleStringAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:842:1: ruleStringAttribute returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:845:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:846:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:846:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:847:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:847:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:848:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringAttribute1936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringAttributeAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringAttribute"


    // $ANTLR start "entryRuleIntegerAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:872:1: entryRuleIntegerAttribute returns [EObject current=null] : iv_ruleIntegerAttribute= ruleIntegerAttribute EOF ;
    public final EObject entryRuleIntegerAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:873:2: (iv_ruleIntegerAttribute= ruleIntegerAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:874:2: iv_ruleIntegerAttribute= ruleIntegerAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute1976);
            iv_ruleIntegerAttribute=ruleIntegerAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAttribute1986); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerAttribute"


    // $ANTLR start "ruleIntegerAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:881:1: ruleIntegerAttribute returns [EObject current=null] : ( (lv_value_0_0= ruleLong ) ) ;
    public final EObject ruleIntegerAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:884:28: ( ( (lv_value_0_0= ruleLong ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:885:1: ( (lv_value_0_0= ruleLong ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:885:1: ( (lv_value_0_0= ruleLong ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:886:1: (lv_value_0_0= ruleLong )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:886:1: (lv_value_0_0= ruleLong )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:887:3: lv_value_0_0= ruleLong
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerAttributeAccess().getValueLongParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLong_in_ruleIntegerAttribute2031);
            lv_value_0_0=ruleLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Long");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerAttribute"


    // $ANTLR start "entryRuleDoubleAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:911:1: entryRuleDoubleAttribute returns [EObject current=null] : iv_ruleDoubleAttribute= ruleDoubleAttribute EOF ;
    public final EObject entryRuleDoubleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:912:2: (iv_ruleDoubleAttribute= ruleDoubleAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:913:2: iv_ruleDoubleAttribute= ruleDoubleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute2066);
            iv_ruleDoubleAttribute=ruleDoubleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleAttribute2076); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoubleAttribute"


    // $ANTLR start "ruleDoubleAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:920:1: ruleDoubleAttribute returns [EObject current=null] : ( (lv_value_0_0= ruleDouble ) ) ;
    public final EObject ruleDoubleAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:923:28: ( ( (lv_value_0_0= ruleDouble ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:924:1: ( (lv_value_0_0= ruleDouble ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:924:1: ( (lv_value_0_0= ruleDouble ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:925:1: (lv_value_0_0= ruleDouble )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:925:1: (lv_value_0_0= ruleDouble )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:926:3: lv_value_0_0= ruleDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDoubleAttributeAccess().getValueDoubleParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDouble_in_ruleDoubleAttribute2121);
            lv_value_0_0=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDoubleAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Double");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDoubleAttribute"


    // $ANTLR start "entryRuleDateAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:950:1: entryRuleDateAttribute returns [EObject current=null] : iv_ruleDateAttribute= ruleDateAttribute EOF ;
    public final EObject entryRuleDateAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:951:2: (iv_ruleDateAttribute= ruleDateAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:952:2: iv_ruleDateAttribute= ruleDateAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute2156);
            iv_ruleDateAttribute=ruleDateAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateAttribute2166); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDateAttribute"


    // $ANTLR start "ruleDateAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:959:1: ruleDateAttribute returns [EObject current=null] : ( (lv_value_0_0= ruleDate ) ) ;
    public final EObject ruleDateAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:962:28: ( ( (lv_value_0_0= ruleDate ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:963:1: ( (lv_value_0_0= ruleDate ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:963:1: ( (lv_value_0_0= ruleDate ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:964:1: (lv_value_0_0= ruleDate )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:964:1: (lv_value_0_0= ruleDate )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:965:3: lv_value_0_0= ruleDate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateAttributeAccess().getValueDateParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDate_in_ruleDateAttribute2211);
            lv_value_0_0=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Date");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDateAttribute"


    // $ANTLR start "entryRuleNullAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:989:1: entryRuleNullAttribute returns [EObject current=null] : iv_ruleNullAttribute= ruleNullAttribute EOF ;
    public final EObject entryRuleNullAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:990:2: (iv_ruleNullAttribute= ruleNullAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:991:2: iv_ruleNullAttribute= ruleNullAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute2246);
            iv_ruleNullAttribute=ruleNullAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullAttribute2256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullAttribute"


    // $ANTLR start "ruleNullAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:998:1: ruleNullAttribute returns [EObject current=null] : ( (lv_value_0_0= 'NULL' ) ) ;
    public final EObject ruleNullAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1001:28: ( ( (lv_value_0_0= 'NULL' ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1002:1: ( (lv_value_0_0= 'NULL' ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1002:1: ( (lv_value_0_0= 'NULL' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1003:1: (lv_value_0_0= 'NULL' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1003:1: (lv_value_0_0= 'NULL' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1004:3: lv_value_0_0= 'NULL'
            {
            lv_value_0_0=(Token)match(input,23,FOLLOW_23_in_ruleNullAttribute2298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_0_0, grammarAccess.getNullAttributeAccess().getValueNULLKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNullAttributeRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_0_0, "NULL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNullAttribute"


    // $ANTLR start "entryRuleBooleanAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1025:1: entryRuleBooleanAttribute returns [EObject current=null] : iv_ruleBooleanAttribute= ruleBooleanAttribute EOF ;
    public final EObject entryRuleBooleanAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1026:2: (iv_ruleBooleanAttribute= ruleBooleanAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1027:2: iv_ruleBooleanAttribute= ruleBooleanAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute2346);
            iv_ruleBooleanAttribute=ruleBooleanAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAttribute2356); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanAttribute"


    // $ANTLR start "ruleBooleanAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1034:1: ruleBooleanAttribute returns [EObject current=null] : ( (lv_value_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1037:28: ( ( (lv_value_0_0= ruleBoolean ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1038:1: ( (lv_value_0_0= ruleBoolean ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1038:1: ( (lv_value_0_0= ruleBoolean ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1039:1: (lv_value_0_0= ruleBoolean )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1039:1: (lv_value_0_0= ruleBoolean )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1040:3: lv_value_0_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanAttributeAccess().getValueBooleanParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolean_in_ruleBooleanAttribute2401);
            lv_value_0_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Boolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanAttribute"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1064:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1065:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1066:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2437);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1073:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1076:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1077:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1077:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1078:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard2495);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1088:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1089:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard2514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1102:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1103:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1104:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2557);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1111:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1114:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1115:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1115:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1116:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2615);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1126:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) && (synpred3_InternalEFactory())) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1126:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1126:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1126:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedName2643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2666);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1153:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1154:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1155:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID2714);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID2725); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1162:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_LONG_ID_1= RULE_LONG_ID | this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_LONG_ID_1=null;
        Token this_LONG_UNSIGNED_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1165:28: ( (this_ID_0= RULE_ID | this_LONG_ID_1= RULE_LONG_ID | this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1166:1: (this_ID_0= RULE_ID | this_LONG_ID_1= RULE_LONG_ID | this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1166:1: (this_ID_0= RULE_ID | this_LONG_ID_1= RULE_LONG_ID | this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_LONG_ID:
                {
                alt14=2;
                }
                break;
            case RULE_LONG_UNSIGNED:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1166:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1174:10: this_LONG_ID_1= RULE_LONG_ID
                    {
                    this_LONG_ID_1=(Token)match(input,RULE_LONG_ID,FOLLOW_RULE_LONG_ID_in_ruleValidID2791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LONG_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LONG_ID_1, grammarAccess.getValidIDAccess().getLONG_IDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1182:10: this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED
                    {
                    this_LONG_UNSIGNED_2=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleValidID2817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LONG_UNSIGNED_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LONG_UNSIGNED_2, grammarAccess.getValidIDAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleBoolean"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1197:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1198:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1199:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2863);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1206:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1209:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1210:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1210:1: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1211:2: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBoolean2912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1218:2: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBoolean2931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleLong"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1231:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1232:2: (iv_ruleLong= ruleLong EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1233:2: iv_ruleLong= ruleLong EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLongRule()); 
            }
            pushFollow(FOLLOW_ruleLong_in_entryRuleLong2972);
            iv_ruleLong=ruleLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLong.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLong2983); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1240:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_LONG_UNSIGNED_1= RULE_LONG_UNSIGNED ) ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LONG_UNSIGNED_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1243:28: ( ( (kw= '-' )? this_LONG_UNSIGNED_1= RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1244:1: ( (kw= '-' )? this_LONG_UNSIGNED_1= RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1244:1: ( (kw= '-' )? this_LONG_UNSIGNED_1= RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1244:2: (kw= '-' )? this_LONG_UNSIGNED_1= RULE_LONG_UNSIGNED
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1244:2: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1245:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleLong3022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLongAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_LONG_UNSIGNED_1=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleLong3039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LONG_UNSIGNED_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LONG_UNSIGNED_1, grammarAccess.getLongAccess().getLONG_UNSIGNEDTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleDouble"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1265:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1266:2: (iv_ruleDouble= ruleDouble EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1267:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble3085);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble3096); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1274:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Long_0= ruleLong kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LONG_UNSIGNED_2=null;
        AntlrDatatypeRuleToken this_Long_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1277:28: ( (this_Long_0= ruleLong kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1278:1: (this_Long_0= ruleLong kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1278:1: (this_Long_0= ruleLong kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1279:5: this_Long_0= ruleLong kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDoubleAccess().getLongParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLong_in_ruleDouble3143);
            this_Long_0=ruleLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Long_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_ruleDouble3161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
                  
            }
            this_LONG_UNSIGNED_2=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleDouble3176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LONG_UNSIGNED_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LONG_UNSIGNED_2, grammarAccess.getDoubleAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleDate"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1310:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1311:2: (iv_ruleDate= ruleDate EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1312:2: iv_ruleDate= ruleDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateRule()); 
            }
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate3222);
            iv_ruleDate=ruleDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDate.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate3233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1319:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LONG_UNSIGNED_0= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_4= RULE_LONG_UNSIGNED ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LONG_UNSIGNED_0=null;
        Token kw=null;
        Token this_LONG_UNSIGNED_2=null;
        Token this_LONG_UNSIGNED_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1322:28: ( (this_LONG_UNSIGNED_0= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_4= RULE_LONG_UNSIGNED ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1323:1: (this_LONG_UNSIGNED_0= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_4= RULE_LONG_UNSIGNED )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1323:1: (this_LONG_UNSIGNED_0= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_4= RULE_LONG_UNSIGNED )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1323:6: this_LONG_UNSIGNED_0= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_2= RULE_LONG_UNSIGNED kw= '.' this_LONG_UNSIGNED_4= RULE_LONG_UNSIGNED
            {
            this_LONG_UNSIGNED_0=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LONG_UNSIGNED_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LONG_UNSIGNED_0, grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_ruleDate3291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1()); 
                  
            }
            this_LONG_UNSIGNED_2=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LONG_UNSIGNED_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LONG_UNSIGNED_2, grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,24,FOLLOW_24_in_ruleDate3324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_3()); 
                  
            }
            this_LONG_UNSIGNED_4=(Token)match(input,RULE_LONG_UNSIGNED,FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LONG_UNSIGNED_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LONG_UNSIGNED_4, grammarAccess.getDateAccess().getLONG_UNSIGNEDTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDate"

    // $ANTLR start synpred1_InternalEFactory
    public final void synpred1_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:8: ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:9: ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' )
        {
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:9: ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:10: () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{'
        {
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:515:10: ()
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:516:1: 
        {
        }

        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:516:2: ( ( ruleQualifiedName ) )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:517:1: ( ruleQualifiedName )
        {
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:517:1: ( ruleQualifiedName )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:518:3: ruleQualifiedName
        {
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred1_InternalEFactory1111);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:520:2: ( ( ruleValidID ) )?
        int alt17=2;
        int LA17_0 = input.LA(1);

        if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_LONG_UNSIGNED)) ) {
            alt17=1;
        }
        switch (alt17) {
            case 1 :
                // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:1: ( ruleValidID )
                {
                // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:1: ( ruleValidID )
                // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:522:1: ruleValidID
                {
                pushFollow(FOLLOW_ruleValidID_in_synpred1_InternalEFactory1120);
                ruleValidID();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        match(input,17,FOLLOW_17_in_synpred1_InternalEFactory1127); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalEFactory

    // $ANTLR start synpred2_InternalEFactory
    public final void synpred2_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:597:7: ( ruleReference )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:597:9: ruleReference
        {
        pushFollow(FOLLOW_ruleReference_in_synpred2_InternalEFactory1255);
        ruleReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1126:3: ( '.' )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:1127:2: '.'
        {
        match(input,24,FOLLOW_24_in_synpred3_InternalEFactory2634); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalEFactory

    // Delegated rules

    public final boolean synpred1_InternalEFactory() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEFactory_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\1\5\1\uffff\3\1\3\uffff\4\1\1\uffff\1\1";
    static final String DFA4_minS =
        "\1\4\1\uffff\3\5\1\uffff\10\5";
    static final String DFA4_maxS =
        "\1\33\1\uffff\3\30\1\uffff\2\7\4\30\1\7\1\30";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\10\uffff";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\3\1\4\1\2\13\uffff\1\5\2\1\1\uffff\1\1\1\uffff\3\1",
            "",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\6",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7",
            "",
            "\1\10\1\11\1\12",
            "\1\10\1\11\1\13",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\14",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7",
            "\1\10\1\11\1\15",
            "\3\1\11\uffff\1\1\1\uffff\1\1\1\5\3\uffff\1\7"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "376:1: ( (lv_value_2_0= ruleValue ) )?";
        }
    }
    static final String DFA9_eotS =
        "\35\uffff";
    static final String DFA9_eofS =
        "\4\uffff\2\15\24\uffff\3\15";
    static final String DFA9_minS =
        "\1\4\2\uffff\1\5\2\4\6\uffff\1\5\2\uffff\3\0\10\uffff\3\4";
    static final String DFA9_maxS =
        "\1\33\2\uffff\1\30\2\33\6\uffff\1\7\2\uffff\3\0\10\uffff\3\33";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\5\3\1\4\1\uffff\2\4\3\uffff\10\4\3\uffff";
    static final String DFA9_specialS =
        "\3\uffff\1\2\1\10\1\3\11\uffff\1\5\1\0\1\7\10\uffff\1\4\1\6\1\1}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\4\1\5\1\3\14\uffff\1\2\1\1\1\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\7\1\10\1\11\11\uffff\1\12\6\uffff\1\6",
            "\1\25\1\17\1\20\1\21\11\uffff\1\12\1\uffff\1\16\1\24\1\23\1\22\1\31\1\14\1\27\1\30\1\26",
            "\1\25\1\17\1\20\1\21\11\uffff\1\12\1\uffff\1\16\1\24\1\23\1\22\1\31\1\14\1\27\1\30\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\1\33\1\34",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\17\1\20\1\21\11\uffff\1\12\1\uffff\1\16\1\24\1\23\1\22\1\31\1\14\1\27\1\30\1\26",
            "\1\25\1\17\1\20\1\21\11\uffff\1\12\1\uffff\1\16\1\24\1\23\1\22\1\31\1\14\1\27\1\30\1\26",
            "\1\25\1\17\1\20\1\21\11\uffff\1\12\1\uffff\1\16\1\24\1\23\1\22\1\31\1\14\1\27\1\30\1\26"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "495:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ( ( () ( ( ruleQualifiedName ) ) ( ( ruleValidID ) )? '{' ) )=> ( () ( ( ruleQualifiedName ) ) ( (lv_name_4_0= ruleValidID ) )? otherlv_5= '{' ) ) ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' () ) | ( ( ruleReference )=>this_Reference_9= ruleReference ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEFactory()) ) {s = 10;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 25;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_28 = input.LA(1);

                         
                        int index9_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_28==EOF) && (synpred2_InternalEFactory())) {s = 13;}

                        else if ( (LA9_28==19) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA9_28==RULE_ID) ) {s = 15;}

                        else if ( (LA9_28==RULE_LONG_ID) ) {s = 16;}

                        else if ( (LA9_28==RULE_LONG_UNSIGNED) ) {s = 17;}

                        else if ( (LA9_28==22) && (synpred2_InternalEFactory())) {s = 18;}

                        else if ( (LA9_28==21) && (synpred2_InternalEFactory())) {s = 19;}

                        else if ( (LA9_28==20) && (synpred2_InternalEFactory())) {s = 20;}

                        else if ( (LA9_28==RULE_STRING) && (synpred2_InternalEFactory())) {s = 21;}

                        else if ( (LA9_28==27) && (synpred2_InternalEFactory())) {s = 22;}

                        else if ( (LA9_28==25) && (synpred2_InternalEFactory())) {s = 23;}

                        else if ( (LA9_28==26) && (synpred2_InternalEFactory())) {s = 24;}

                        else if ( (LA9_28==23) && (synpred2_InternalEFactory())) {s = 25;}

                        else if ( (LA9_28==24) ) {s = 12;}

                        else if ( (LA9_28==17) && (synpred1_InternalEFactory())) {s = 10;}

                         
                        input.seek(index9_28);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_3==24) && (synpred1_InternalEFactory())) {s = 6;}

                        else if ( (LA9_3==RULE_ID) && (synpred1_InternalEFactory())) {s = 7;}

                        else if ( (LA9_3==RULE_LONG_ID) && (synpred1_InternalEFactory())) {s = 8;}

                        else if ( (LA9_3==RULE_LONG_UNSIGNED) && (synpred1_InternalEFactory())) {s = 9;}

                        else if ( (LA9_3==17) && (synpred1_InternalEFactory())) {s = 10;}

                        else if ( (true) ) {s = 2;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_5==24) ) {s = 12;}

                        else if ( (LA9_5==EOF) && (synpred2_InternalEFactory())) {s = 13;}

                        else if ( (LA9_5==19) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA9_5==RULE_ID) ) {s = 15;}

                        else if ( (LA9_5==RULE_LONG_ID) ) {s = 16;}

                        else if ( (LA9_5==RULE_LONG_UNSIGNED) ) {s = 17;}

                        else if ( (LA9_5==22) && (synpred2_InternalEFactory())) {s = 18;}

                        else if ( (LA9_5==21) && (synpred2_InternalEFactory())) {s = 19;}

                        else if ( (LA9_5==20) && (synpred2_InternalEFactory())) {s = 20;}

                        else if ( (LA9_5==RULE_STRING) && (synpred2_InternalEFactory())) {s = 21;}

                        else if ( (LA9_5==27) && (synpred2_InternalEFactory())) {s = 22;}

                        else if ( (LA9_5==25) && (synpred2_InternalEFactory())) {s = 23;}

                        else if ( (LA9_5==26) && (synpred2_InternalEFactory())) {s = 24;}

                        else if ( (LA9_5==23) && (synpred2_InternalEFactory())) {s = 25;}

                        else if ( (LA9_5==17) && (synpred1_InternalEFactory())) {s = 10;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_26 = input.LA(1);

                         
                        int index9_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_26==EOF) && (synpred2_InternalEFactory())) {s = 13;}

                        else if ( (LA9_26==19) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA9_26==RULE_ID) ) {s = 15;}

                        else if ( (LA9_26==RULE_LONG_ID) ) {s = 16;}

                        else if ( (LA9_26==RULE_LONG_UNSIGNED) ) {s = 17;}

                        else if ( (LA9_26==22) && (synpred2_InternalEFactory())) {s = 18;}

                        else if ( (LA9_26==21) && (synpred2_InternalEFactory())) {s = 19;}

                        else if ( (LA9_26==20) && (synpred2_InternalEFactory())) {s = 20;}

                        else if ( (LA9_26==RULE_STRING) && (synpred2_InternalEFactory())) {s = 21;}

                        else if ( (LA9_26==27) && (synpred2_InternalEFactory())) {s = 22;}

                        else if ( (LA9_26==25) && (synpred2_InternalEFactory())) {s = 23;}

                        else if ( (LA9_26==26) && (synpred2_InternalEFactory())) {s = 24;}

                        else if ( (LA9_26==23) && (synpred2_InternalEFactory())) {s = 25;}

                        else if ( (LA9_26==24) ) {s = 12;}

                        else if ( (LA9_26==17) && (synpred1_InternalEFactory())) {s = 10;}

                         
                        input.seek(index9_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEFactory()) ) {s = 10;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 25;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_27 = input.LA(1);

                         
                        int index9_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_27==RULE_ID) ) {s = 15;}

                        else if ( (LA9_27==RULE_LONG_ID) ) {s = 16;}

                        else if ( (LA9_27==RULE_LONG_UNSIGNED) ) {s = 17;}

                        else if ( (LA9_27==17) && (synpred1_InternalEFactory())) {s = 10;}

                        else if ( (LA9_27==24) ) {s = 12;}

                        else if ( (LA9_27==EOF) && (synpred2_InternalEFactory())) {s = 13;}

                        else if ( (LA9_27==19) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA9_27==22) && (synpred2_InternalEFactory())) {s = 18;}

                        else if ( (LA9_27==21) && (synpred2_InternalEFactory())) {s = 19;}

                        else if ( (LA9_27==20) && (synpred2_InternalEFactory())) {s = 20;}

                        else if ( (LA9_27==RULE_STRING) && (synpred2_InternalEFactory())) {s = 21;}

                        else if ( (LA9_27==27) && (synpred2_InternalEFactory())) {s = 22;}

                        else if ( (LA9_27==25) && (synpred2_InternalEFactory())) {s = 23;}

                        else if ( (LA9_27==26) && (synpred2_InternalEFactory())) {s = 24;}

                        else if ( (LA9_27==23) && (synpred2_InternalEFactory())) {s = 25;}

                         
                        input.seek(index9_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEFactory()) ) {s = 10;}

                        else if ( (synpred2_InternalEFactory()) ) {s = 25;}

                         
                        input.seek(index9_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_4==24) ) {s = 12;}

                        else if ( (LA9_4==EOF) && (synpred2_InternalEFactory())) {s = 13;}

                        else if ( (LA9_4==19) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA9_4==RULE_ID) ) {s = 15;}

                        else if ( (LA9_4==RULE_LONG_ID) ) {s = 16;}

                        else if ( (LA9_4==RULE_LONG_UNSIGNED) ) {s = 17;}

                        else if ( (LA9_4==22) && (synpred2_InternalEFactory())) {s = 18;}

                        else if ( (LA9_4==21) && (synpred2_InternalEFactory())) {s = 19;}

                        else if ( (LA9_4==20) && (synpred2_InternalEFactory())) {s = 20;}

                        else if ( (LA9_4==RULE_STRING) && (synpred2_InternalEFactory())) {s = 21;}

                        else if ( (LA9_4==27) && (synpred2_InternalEFactory())) {s = 22;}

                        else if ( (LA9_4==25) && (synpred2_InternalEFactory())) {s = 23;}

                        else if ( (LA9_4==26) && (synpred2_InternalEFactory())) {s = 24;}

                        else if ( (LA9_4==23) && (synpred2_InternalEFactory())) {s = 25;}

                        else if ( (LA9_4==17) && (synpred1_InternalEFactory())) {s = 10;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\4\uffff\1\10\2\uffff\1\10\3\uffff\1\12\1\uffff";
    static final String DFA11_minS =
        "\1\4\2\uffff\1\7\1\4\2\uffff\1\4\1\uffff\1\7\1\uffff\1\4\1\uffff";
    static final String DFA11_maxS =
        "\1\33\2\uffff\1\7\1\33\2\uffff\1\33\1\uffff\1\7\1\uffff\1\33\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\4\1\7\1\uffff\1\3\1\uffff\1\5\1\uffff\1\6";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\2\uffff\1\4\14\uffff\1\1\2\uffff\1\6\1\uffff\2\5\1\3",
            "",
            "",
            "\1\7",
            "\4\10\13\uffff\5\10\1\11\3\10",
            "",
            "",
            "\4\10\13\uffff\5\10\1\12\3\10",
            "",
            "\1\13",
            "",
            "\4\12\13\uffff\5\12\1\14\3\12",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "716:1: (this_EnumAttribute_0= ruleEnumAttribute | this_StringAttribute_1= ruleStringAttribute | this_IntegerAttribute_2= ruleIntegerAttribute | this_BooleanAttribute_3= ruleBooleanAttribute | this_DoubleAttribute_4= ruleDoubleAttribute | this_DateAttribute_5= ruleDateAttribute | this_NullAttribute_6= ruleNullAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_ruleFactory131 = new BitSet(new long[]{0x000000000001A0E0L});
    public static final BitSet FOLLOW_rulePackageImport_in_ruleFactory153 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFactory175 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleNewObject_in_ruleFactory197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_entryRulePackageImport233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageImport243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackageImport280 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageImport303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackageImport315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceImport361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNamespaceImport398 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleNamespaceImport419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_ruleAnnotation511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNameMapping555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCustomNameMapping592 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomNameMapping604 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCustomNameMapping627 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustomNameMapping639 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCustomNameMapping662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCustomNameMapping674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature768 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFeature780 = new BitSet(new long[]{0x000000000EB120F2L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFeature801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewObject896 = new BitSet(new long[]{0x00000000000320E0L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleNewObject917 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNewObject930 = new BitSet(new long[]{0x00000000000920E0L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNewObject951 = new BitSet(new long[]{0x00000000000920E0L});
    public static final BitSet FOLLOW_19_in_ruleNewObject964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_ruleValue1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleValue1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleValue1157 = new BitSet(new long[]{0x00000000000320E0L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleValue1178 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleValue1191 = new BitSet(new long[]{0x00000000000920E0L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleValue1214 = new BitSet(new long[]{0x00000000000920E0L});
    public static final BitSet FOLLOW_19_in_ruleValue1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_entryRuleMultiValue1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValue1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleMultiValue1363 = new BitSet(new long[]{0x000000000EF120F0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMultiValue1384 = new BitSet(new long[]{0x000000000EF120F0L});
    public static final BitSet FOLLOW_22_in_ruleMultiValue1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReference1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_ruleAttribute1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_ruleAttribute1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_ruleAttribute1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_ruleAttribute1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_ruleAttribute1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_ruleAttribute1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_ruleAttribute1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAttribute1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEnumAttribute1826 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEnumAttribute1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringAttribute_in_entryRuleStringAttribute1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringAttribute1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAttribute1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAttribute_in_entryRuleIntegerAttribute1976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAttribute1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_ruleIntegerAttribute2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleAttribute_in_entryRuleDoubleAttribute2066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleAttribute2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleDoubleAttribute2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateAttribute_in_entryRuleDateAttribute2156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateAttribute2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleDateAttribute2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullAttribute_in_entryRuleNullAttribute2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullAttribute2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNullAttribute2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAttribute_in_entryRuleBooleanAttribute2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAttribute2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleBooleanAttribute2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard2495 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2615 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedName2643 = new BitSet(new long[]{0x00000000000120E0L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2666 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID2714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_ID_in_ruleValidID2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleValidID2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBoolean2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBoolean2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_entryRuleLong2972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLong2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLong3022 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleLong3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLong_in_ruleDouble3143 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDouble3161 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleDouble3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3273 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate3291 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3306 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDate3324 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LONG_UNSIGNED_in_ruleDate3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred1_InternalEFactory1111 = new BitSet(new long[]{0x00000000000320E0L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred1_InternalEFactory1120 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalEFactory1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_synpred2_InternalEFactory1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred3_InternalEFactory2634 = new BitSet(new long[]{0x0000000000000002L});

}