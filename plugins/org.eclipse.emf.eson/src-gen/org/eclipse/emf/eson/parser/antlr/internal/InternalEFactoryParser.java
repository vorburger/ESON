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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY", "RULE_ID_WITHDOT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "'.*'", "'import'", "'@Name'", "'{'", "'='", "'}'", "':'", "'['", "']'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ANY=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int RULE_ID_WITHDOT=6;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=10;

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

                if ( (LA1_0==14) ) {
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

                if ( (LA2_0==12) ) {
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

                if ( (LA3_0==15) ) {
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageImport280); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackageImport315); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleNamespaceImport398); if (state.failed) return current;
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:286:1: ruleCustomNameMapping returns [EObject current=null] : (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) ;
    public final EObject ruleCustomNameMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:289:28: ( (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:1: (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:1: (otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:290:3: otherlv_0= '@Name' otherlv_1= '{' ( ( ruleQualifiedName ) ) otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCustomNameMapping592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCustomNameMappingAccess().getNameKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCustomNameMapping604); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCustomNameMapping639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCustomNameMappingAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:317:1: ( (otherlv_4= RULE_ID ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:318:1: (otherlv_4= RULE_ID )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:318:1: (otherlv_4= RULE_ID )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:319:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomNameMappingRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomNameMapping659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getCustomNameMappingAccess().getNameFeatureEAttributeCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCustomNameMapping671); if (state.failed) return current;
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:342:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:343:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:344:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature707);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature717); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:351:1: ruleFeature returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:354:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:355:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:355:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )? )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:355:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )?
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:355:2: ( (otherlv_0= RULE_ID ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:356:1: (otherlv_0= RULE_ID )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:356:1: (otherlv_0= RULE_ID )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:357:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFeatureRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getEFeatureEStructuralFeatureCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFeature774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:372:1: ( (lv_value_2_0= ruleValue ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ANY||(LA4_0>=19 && LA4_0<=20)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=RULE_ID && LA4_2<=RULE_ANY)||LA4_2==16||LA4_2==18||LA4_2==22) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:373:1: (lv_value_2_0= ruleValue )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:373:1: (lv_value_2_0= ruleValue )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:374:3: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleFeature795);
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:398:1: entryRuleNewObject returns [EObject current=null] : iv_ruleNewObject= ruleNewObject EOF ;
    public final EObject entryRuleNewObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewObject = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:399:2: (iv_ruleNewObject= ruleNewObject EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:400:2: iv_ruleNewObject= ruleNewObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewObjectRule()); 
            }
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject832);
            iv_ruleNewObject=ruleNewObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject842); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:407:1: ruleNewObject returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ANY ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleNewObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:410:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ANY ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:411:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ANY ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:411:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ANY ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:411:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ANY ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:411:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:412:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:412:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:413:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewObjectRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNewObjectAccess().getEClassEClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewObject890);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:426:2: ( (lv_name_1_0= RULE_ANY ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ANY) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:427:1: (lv_name_1_0= RULE_ANY )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:427:1: (lv_name_1_0= RULE_ANY )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:428:3: lv_name_1_0= RULE_ANY
                    {
                    lv_name_1_0=(Token)match(input,RULE_ANY,FOLLOW_RULE_ANY_in_ruleNewObject907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getNewObjectAccess().getNameANYTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewObjectRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ANY");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNewObject925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:448:1: ( (lv_features_3_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:449:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:449:1: (lv_features_3_0= ruleFeature )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:450:3: lv_features_3_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNewObject946);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleNewObject959); if (state.failed) return current;
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:478:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:479:2: (iv_ruleValue= ruleValue EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:480:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue995);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1005); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:487:1: ruleValue returns [EObject current=null] : (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ruleContainment )=>this_Containment_2= ruleContainment ) | ( ( ruleReference )=>this_Reference_3= ruleReference ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_MultiValue_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_Containment_2 = null;

        EObject this_Reference_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:490:28: ( (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ruleContainment )=>this_Containment_2= ruleContainment ) | ( ( ruleReference )=>this_Reference_3= ruleReference ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:491:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ruleContainment )=>this_Containment_2= ruleContainment ) | ( ( ruleReference )=>this_Reference_3= ruleReference ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:491:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ruleContainment )=>this_Containment_2= ruleContainment ) | ( ( ruleReference )=>this_Reference_3= ruleReference ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:492:5: this_MultiValue_0= ruleMultiValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getMultiValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultiValue_in_ruleValue1052);
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
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:502:5: this_Attribute_1= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleValue1079);
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
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:511:6: ( ( ruleContainment )=>this_Containment_2= ruleContainment )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:511:6: ( ( ruleContainment )=>this_Containment_2= ruleContainment )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:511:7: ( ruleContainment )=>this_Containment_2= ruleContainment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainment_in_ruleValue1112);
                    this_Containment_2=ruleContainment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Containment_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:6: ( ( ruleReference )=>this_Reference_3= ruleReference )
                    {
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:6: ( ( ruleReference )=>this_Reference_3= ruleReference )
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:7: ( ruleReference )=>this_Reference_3= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleValue1146);
                    this_Reference_3=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Reference_3; 
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


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:538:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:539:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:540:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1182);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1192); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:547:1: ruleAttribute returns [EObject current=null] : (this_EnumAttribute_0= ruleEnumAttribute | this_AnyAttribute_1= ruleAnyAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_EnumAttribute_0 = null;

        EObject this_AnyAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:550:28: ( (this_EnumAttribute_0= ruleEnumAttribute | this_AnyAttribute_1= ruleAnyAttribute ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:551:1: (this_EnumAttribute_0= ruleEnumAttribute | this_AnyAttribute_1= ruleAnyAttribute )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:551:1: (this_EnumAttribute_0= ruleEnumAttribute | this_AnyAttribute_1= ruleAnyAttribute )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ANY) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:552:5: this_EnumAttribute_0= ruleEnumAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getEnumAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumAttribute_in_ruleAttribute1239);
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
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:562:5: this_AnyAttribute_1= ruleAnyAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributeAccess().getAnyAttributeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyAttribute_in_ruleAttribute1266);
                    this_AnyAttribute_1=ruleAnyAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnyAttribute_1; 
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


    // $ANTLR start "entryRuleMultiValue"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:578:1: entryRuleMultiValue returns [EObject current=null] : iv_ruleMultiValue= ruleMultiValue EOF ;
    public final EObject entryRuleMultiValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValue = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:579:2: (iv_ruleMultiValue= ruleMultiValue EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:580:2: iv_ruleMultiValue= ruleMultiValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValue_in_entryRuleMultiValue1301);
            iv_ruleMultiValue=ruleMultiValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValue1311); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:587:1: ruleMultiValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleMultiValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:590:28: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:591:1: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:591:1: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:591:2: () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']'
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:591:2: ()
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:592:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiValueAccess().getMultiValueAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMultiValue1357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMultiValueAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:601:1: ( (lv_values_2_0= ruleValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_ANY)||(LA9_0>=19 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:602:1: (lv_values_2_0= ruleValue )
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:602:1: (lv_values_2_0= ruleValue )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:603:3: lv_values_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiValueAccess().getValuesValueParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleMultiValue1378);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMultiValue1391); if (state.failed) return current;
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:631:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:632:2: (iv_ruleReference= ruleReference EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:633:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1427);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1437); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:640:1: ruleReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:643:28: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:644:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:644:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:645:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:645:1: ( ruleQualifiedName )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:646:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReference1484);
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


    // $ANTLR start "entryRuleContainment"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:667:1: entryRuleContainment returns [EObject current=null] : iv_ruleContainment= ruleContainment EOF ;
    public final EObject entryRuleContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainment = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:668:2: (iv_ruleContainment= ruleContainment EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:669:2: iv_ruleContainment= ruleContainment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentRule()); 
            }
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment1519);
            iv_ruleContainment=ruleContainment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment1529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainment"


    // $ANTLR start "ruleContainment"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:676:1: ruleContainment returns [EObject current=null] : ( (lv_value_0_0= ruleNewObject ) ) ;
    public final EObject ruleContainment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:679:28: ( ( (lv_value_0_0= ruleNewObject ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:680:1: ( (lv_value_0_0= ruleNewObject ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:680:1: ( (lv_value_0_0= ruleNewObject ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:681:1: (lv_value_0_0= ruleNewObject )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:681:1: (lv_value_0_0= ruleNewObject )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:682:3: lv_value_0_0= ruleNewObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNewObject_in_ruleContainment1574);
            lv_value_0_0=ruleNewObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"NewObject");
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
    // $ANTLR end "ruleContainment"


    // $ANTLR start "entryRuleEnumAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:706:1: entryRuleEnumAttribute returns [EObject current=null] : iv_ruleEnumAttribute= ruleEnumAttribute EOF ;
    public final EObject entryRuleEnumAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:707:2: (iv_ruleEnumAttribute= ruleEnumAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:708:2: iv_ruleEnumAttribute= ruleEnumAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute1609);
            iv_ruleEnumAttribute=ruleEnumAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumAttribute1619); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:715:1: ruleEnumAttribute returns [EObject current=null] : (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:718:28: ( (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:719:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:719:1: (otherlv_0= ':' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:719:3: otherlv_0= ':' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnumAttribute1656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumAttributeAccess().getColonKeyword_0());
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:723:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:724:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:724:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:725:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumAttributeRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumAttribute1676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEnumAttributeAccess().getValueEEnumLiteralCrossReference_1_0()); 
              	
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


    // $ANTLR start "entryRuleAnyAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:744:1: entryRuleAnyAttribute returns [EObject current=null] : iv_ruleAnyAttribute= ruleAnyAttribute EOF ;
    public final EObject entryRuleAnyAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyAttribute = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:745:2: (iv_ruleAnyAttribute= ruleAnyAttribute EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:746:2: iv_ruleAnyAttribute= ruleAnyAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAnyAttribute_in_entryRuleAnyAttribute1712);
            iv_ruleAnyAttribute=ruleAnyAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyAttribute1722); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnyAttribute"


    // $ANTLR start "ruleAnyAttribute"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:753:1: ruleAnyAttribute returns [EObject current=null] : ( (lv_value_0_0= RULE_ANY ) ) ;
    public final EObject ruleAnyAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:756:28: ( ( (lv_value_0_0= RULE_ANY ) ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:757:1: ( (lv_value_0_0= RULE_ANY ) )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:757:1: ( (lv_value_0_0= RULE_ANY ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:758:1: (lv_value_0_0= RULE_ANY )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:758:1: (lv_value_0_0= RULE_ANY )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:759:3: lv_value_0_0= RULE_ANY
            {
            lv_value_0_0=(Token)match(input,RULE_ANY,FOLLOW_RULE_ANY_in_ruleAnyAttribute1763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getAnyAttributeAccess().getValueANYTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnyAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ANY");
              	    
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
    // $ANTLR end "ruleAnyAttribute"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:783:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:784:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:785:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1804);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1815); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:792:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:795:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:796:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:796:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:797:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1862);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:807:1: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:808:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildcard1881); if (state.failed) return current;
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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:821:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:822:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:823:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1924);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1935); if (state.failed) return current;

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
    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:830:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:833:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:834:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:834:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:834:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:841:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) && (synpred3_InternalEFactory())) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:841:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:841:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:841:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName2003); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2019); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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

    // $ANTLR start synpred1_InternalEFactory
    public final void synpred1_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:511:7: ( ruleContainment )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:511:9: ruleContainment
        {
        pushFollow(FOLLOW_ruleContainment_in_synpred1_InternalEFactory1096);
        ruleContainment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEFactory

    // $ANTLR start synpred2_InternalEFactory
    public final void synpred2_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:7: ( ruleReference )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:521:9: ruleReference
        {
        pushFollow(FOLLOW_ruleReference_in_synpred2_InternalEFactory1130);
        ruleReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalEFactory

    // $ANTLR start synpred3_InternalEFactory
    public final void synpred3_InternalEFactory_fragment() throws RecognitionException {   
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:841:3: ( '.' )
        // ../org.eclipse.emf.eson/src-gen/org/eclipse/emf/eson/parser/antlr/internal/InternalEFactory.g:842:2: '.'
        {
        match(input,22,FOLLOW_22_in_synpred3_InternalEFactory1994); if (state.failed) return ;

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\20\uffff";
    static final String DFA7_eofS =
        "\3\uffff\1\7\11\uffff\1\7\2\uffff";
    static final String DFA7_minS =
        "\1\4\2\uffff\3\4\7\uffff\1\4\2\uffff";
    static final String DFA7_maxS =
        "\1\24\2\uffff\1\26\1\4\1\25\7\uffff\1\26\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\3\6\4\1\uffff\2\4";
    static final String DFA7_specialS =
        "\3\uffff\1\0\1\uffff\1\1\7\uffff\1\2\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\2\15\uffff\1\2\1\1",
            "",
            "",
            "\1\11\1\5\12\uffff\1\6\1\uffff\1\10\1\14\1\13\1\12\1\4",
            "\1\15",
            "\1\17\1\16\12\uffff\1\6\2\uffff\1\14\1\13\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\5\12\uffff\1\6\1\uffff\1\10\1\14\1\13\1\12\1\4",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "491:1: (this_MultiValue_0= ruleMultiValue | this_Attribute_1= ruleAttribute | ( ( ruleContainment )=>this_Containment_2= ruleContainment ) | ( ( ruleReference )=>this_Reference_3= ruleReference ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_3==22) ) {s = 4;}

                        else if ( (LA7_3==RULE_ANY) ) {s = 5;}

                        else if ( (LA7_3==16) && (synpred1_InternalEFactory())) {s = 6;}

                        else if ( (LA7_3==EOF) && (synpred2_InternalEFactory())) {s = 7;}

                        else if ( (LA7_3==18) && (synpred2_InternalEFactory())) {s = 8;}

                        else if ( (LA7_3==RULE_ID) && (synpred2_InternalEFactory())) {s = 9;}

                        else if ( (LA7_3==21) && (synpred2_InternalEFactory())) {s = 10;}

                        else if ( (LA7_3==20) && (synpred2_InternalEFactory())) {s = 11;}

                        else if ( (LA7_3==19) && (synpred2_InternalEFactory())) {s = 12;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_5==21) && (synpred2_InternalEFactory())) {s = 10;}

                        else if ( (LA7_5==20) && (synpred2_InternalEFactory())) {s = 11;}

                        else if ( (LA7_5==19) && (synpred2_InternalEFactory())) {s = 12;}

                        else if ( (LA7_5==RULE_ANY) && (synpred2_InternalEFactory())) {s = 14;}

                        else if ( (LA7_5==RULE_ID) && (synpred2_InternalEFactory())) {s = 15;}

                        else if ( (LA7_5==16) && (synpred1_InternalEFactory())) {s = 6;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_13==EOF) && (synpred2_InternalEFactory())) {s = 7;}

                        else if ( (LA7_13==18) && (synpred2_InternalEFactory())) {s = 8;}

                        else if ( (LA7_13==RULE_ID) && (synpred2_InternalEFactory())) {s = 9;}

                        else if ( (LA7_13==21) && (synpred2_InternalEFactory())) {s = 10;}

                        else if ( (LA7_13==20) && (synpred2_InternalEFactory())) {s = 11;}

                        else if ( (LA7_13==19) && (synpred2_InternalEFactory())) {s = 12;}

                        else if ( (LA7_13==RULE_ANY) ) {s = 5;}

                        else if ( (LA7_13==22) ) {s = 4;}

                        else if ( (LA7_13==16) && (synpred1_InternalEFactory())) {s = 6;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_ruleFactory131 = new BitSet(new long[]{0x000000000000D010L});
    public static final BitSet FOLLOW_rulePackageImport_in_ruleFactory153 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFactory175 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_ruleNewObject_in_ruleFactory197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageImport_in_entryRulePackageImport233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageImport243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageImport280 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageImport303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageImport315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceImport_in_entryRuleNamespaceImport351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceImport361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNamespaceImport398 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleNamespaceImport419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_ruleAnnotation511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNameMapping_in_entryRuleCustomNameMapping545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNameMapping555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCustomNameMapping592 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCustomNameMapping604 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCustomNameMapping627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCustomNameMapping639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomNameMapping659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCustomNameMapping671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFeature774 = new BitSet(new long[]{0x0000000000189032L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFeature795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewObject890 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ANY_in_ruleNewObject907 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNewObject925 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNewObject946 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleNewObject959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_ruleValue1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleValue1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_ruleValue1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_ruleAttribute1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyAttribute_in_ruleAttribute1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValue_in_entryRuleMultiValue1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValue1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMultiValue1357 = new BitSet(new long[]{0x0000000000389030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMultiValue1378 = new BitSet(new long[]{0x0000000000389030L});
    public static final BitSet FOLLOW_21_in_ruleMultiValue1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReference1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_ruleContainment1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumAttribute_in_entryRuleEnumAttribute1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumAttribute1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumAttribute1656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumAttribute1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyAttribute_in_entryRuleAnyAttribute1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyAttribute1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_in_ruleAnyAttribute1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1862 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildcard1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1975 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName2003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2019 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleContainment_in_synpred1_InternalEFactory1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_synpred2_InternalEFactory1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred3_InternalEFactory1994 = new BitSet(new long[]{0x0000000000000002L});

}