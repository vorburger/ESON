package org.eclipse.emf.eson.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEFactoryLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ANY=5;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
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

    public InternalEFactoryLexer() {;} 
    public InternalEFactoryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEFactoryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:11:7: ( 'use' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:11:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:12:7: ( '.*' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:12:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:13:7: ( 'import' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:14:7: ( '@Name' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:14:9: '@Name'
            {
            match("@Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:15:7: ( '{' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:16:7: ( '=' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:17:7: ( '}' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:18:7: ( ':' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:19:7: ( '[' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:20:7: ( ']' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:21:7: ( '.' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' )+ )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' )+
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1973:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=',' && LA2_0<='-')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:
            	    {
            	    if ( (input.LA(1)>=',' && input.LA(1)<='-')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ID_WITHDOT"
    public final void mRULE_ID_WITHDOT() throws RecognitionException {
        try {
            int _type = RULE_ID_WITHDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1975:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' | '.' )+ )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1975:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' | '.' )+
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1975:19: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1975:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1975:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ',' | '-' | '0' .. '9' | '.' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=',' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:
            	    {
            	    if ( (input.LA(1)>=',' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_WITHDOT"

    // $ANTLR start "RULE_ANY"
    public final void mRULE_ANY() throws RecognitionException {
        try {
            int _type = RULE_ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:10: ( ( RULE_STRING | RULE_ID_WITHDOT ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:12: ( RULE_STRING | RULE_ID_WITHDOT )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:12: ( RULE_STRING | RULE_ID_WITHDOT )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"'||LA5_0=='\'') ) {
                alt5=1;
            }
            else if ( ((LA5_0>=',' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='^' && LA5_0<='_')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:13: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1977:25: RULE_ID_WITHDOT
                    {
                    mRULE_ID_WITHDOT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1979:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1981:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1981:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1981:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1981:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1983:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1985:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1985:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1987:16: ( . )
            // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1987:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_ID_WITHDOT | RULE_ANY | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=19;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:84: RULE_ID_WITHDOT
                {
                mRULE_ID_WITHDOT(); 

                }
                break;
            case 14 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:100: RULE_ANY
                {
                mRULE_ANY(); 

                }
                break;
            case 15 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:109: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:121: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:137: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:153: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // ../org.eclipse.emf.eson.ui/src-gen/org/eclipse/emf/eson/ui/contentassist/antlr/internal/InternalEFactory.g:1:161: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\23\1\27\1\23\1\21\6\uffff\1\21\1\23\3\21\2\uffff\1\23\1\uffff\1\23\1\52\2\uffff\1\23\20\uffff\1\57\1\uffff\1\23\4\uffff\2\23\1\63\1\uffff";
    static final String DFA14_eofS =
        "\64\uffff";
    static final String DFA14_minS =
        "\1\0\1\54\1\52\1\54\1\116\6\uffff\2\54\2\0\1\52\2\uffff\1\54\1\uffff\2\54\2\uffff\1\54\7\uffff\2\0\1\uffff\2\0\4\uffff\1\54\1\uffff\1\54\1\0\1\uffff\1\0\1\uffff\3\54\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\3\172\1\116\6\uffff\2\172\2\uffff\1\57\2\uffff\1\172\1\uffff\2\172\2\uffff\1\172\7\uffff\2\uffff\1\uffff\2\uffff\4\uffff\1\172\1\uffff\1\172\1\uffff\1\uffff\1\uffff\1\uffff\3\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\5\uffff\1\22\1\23\1\uffff\1\14\2\uffff\1\2\1\13\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\16\2\uffff\1\16\1\20\1\21\1\22\1\uffff\1\15\2\uffff\1\16\1\uffff\1\1\3\uffff\1\3";
    static final String DFA14_specialS =
        "\1\6\14\uffff\1\10\1\3\21\uffff\1\0\1\4\1\uffff\1\1\1\7\7\uffff\1\5\1\uffff\1\2\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\4\21\2\14\1\2\1\17\12\14\1\10\2\21\1\6\2\21\1\4\32\14\1\11\1\21\1\12\1\13\1\14\1\21\10\14\1\3\13\14\1\1\5\14\1\5\1\21\1\7\uff82\21",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\22\24\1\22\7\24",
            "\1\26\1\uffff\3\25\1\uffff\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\14\24\1\30\15\24",
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\42\41\1\42\71\41\1\40\uffa3\41",
            "\47\44\1\45\64\44\1\43\uffa3\44",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\4\24\1\51\25\24",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\3\25\1\uffff\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\17\24\1\53\12\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\54",
            "\42\41\1\42\71\41\1\40\uffa3\41",
            "",
            "\0\56",
            "\47\44\1\45\64\44\1\43\uffa3\44",
            "",
            "",
            "",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\16\24\1\60\13\24",
            "\42\41\1\42\71\41\1\40\uffa3\41",
            "",
            "\47\44\1\45\64\44\1\43\uffa3\44",
            "",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\21\24\1\61\10\24",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\23\24\1\62\6\24",
            "\2\24\1\25\1\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_ID_WITHDOT | RULE_ANY | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_46 = input.LA(1);

                        s = -1;
                        if ( (LA14_46=='\'') ) {s = 37;}

                        else if ( (LA14_46=='\\') ) {s = 35;}

                        else if ( ((LA14_46>='\u0000' && LA14_46<='&')||(LA14_46>='(' && LA14_46<='[')||(LA14_46>=']' && LA14_46<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( (LA14_14=='\\') ) {s = 35;}

                        else if ( ((LA14_14>='\u0000' && LA14_14<='&')||(LA14_14>='(' && LA14_14<='[')||(LA14_14>=']' && LA14_14<='\uFFFF')) ) {s = 36;}

                        else if ( (LA14_14=='\'') ) {s = 37;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( (LA14_33=='\"') ) {s = 34;}

                        else if ( (LA14_33=='\\') ) {s = 32;}

                        else if ( ((LA14_33>='\u0000' && LA14_33<='!')||(LA14_33>='#' && LA14_33<='[')||(LA14_33>=']' && LA14_33<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( (LA14_44=='\"') ) {s = 34;}

                        else if ( (LA14_44=='\\') ) {s = 32;}

                        else if ( ((LA14_44>='\u0000' && LA14_44<='!')||(LA14_44>='#' && LA14_44<='[')||(LA14_44>=']' && LA14_44<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='u') ) {s = 1;}

                        else if ( (LA14_0=='.') ) {s = 2;}

                        else if ( (LA14_0=='i') ) {s = 3;}

                        else if ( (LA14_0=='@') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='=') ) {s = 6;}

                        else if ( (LA14_0=='}') ) {s = 7;}

                        else if ( (LA14_0==':') ) {s = 8;}

                        else if ( (LA14_0=='[') ) {s = 9;}

                        else if ( (LA14_0==']') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( ((LA14_0>=',' && LA14_0<='-')||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='t')||(LA14_0>='v' && LA14_0<='z')) ) {s = 12;}

                        else if ( (LA14_0=='\"') ) {s = 13;}

                        else if ( (LA14_0=='\'') ) {s = 14;}

                        else if ( (LA14_0=='/') ) {s = 15;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 16;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='?')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( (LA14_36=='\'') ) {s = 37;}

                        else if ( (LA14_36=='\\') ) {s = 35;}

                        else if ( ((LA14_36>='\u0000' && LA14_36<='&')||(LA14_36>='(' && LA14_36<='[')||(LA14_36>=']' && LA14_36<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_13 = input.LA(1);

                        s = -1;
                        if ( (LA14_13=='\\') ) {s = 32;}

                        else if ( ((LA14_13>='\u0000' && LA14_13<='!')||(LA14_13>='#' && LA14_13<='[')||(LA14_13>=']' && LA14_13<='\uFFFF')) ) {s = 33;}

                        else if ( (LA14_13=='\"') ) {s = 34;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}