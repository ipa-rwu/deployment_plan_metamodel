package de.fraunhofer.ipa.deployment.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUtilLexer extends Lexer {
    public static final int Description=8;
    public static final int Processor=12;
    public static final int RULE_STRING=36;
    public static final int AttributeKind=6;
    public static final int Focal=20;
    public static final int Wlan=25;
    public static final int Properties=11;
    public static final int Name=23;
    public static final int RULE_SL_COMMENT=31;
    public static final int Container=14;
    public static final int HyphenMinus=27;
    public static final int Debian=16;
    public static final int RULE_DOUBLE=30;
    public static final int Kind=22;
    public static final int X86=26;
    public static final int RULE_DECINT=29;
    public static final int MinimumKind=10;
    public static final int EOF=-1;
    public static final int RULE_INDENT=32;
    public static final int Ubuntu=17;
    public static final int RULE_DEDENT=33;
    public static final int Jammy=21;
    public static final int LinuxOpertingSystem=4;
    public static final int RULE_ID=34;
    public static final int RULE_WS=38;
    public static final int RULE_DIGIT=28;
    public static final int MaximumKind=9;
    public static final int RULE_ANY_OTHER=39;
    public static final int SelectionKind=7;
    public static final int RangeKind=13;
    public static final int Type=24;
    public static final int MacOSOpertingSystem=5;
    public static final int Arm64=19;
    public static final int RULE_INT=35;
    public static final int Ethernet=15;
    public static final int Value=18;
    public static final int RULE_ML_COMMENT=37;

    // delegates
    // delegators

    public InternalUtilLexer() {;}
    public InternalUtilLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUtilLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUtilLexer.g"; }

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:14:21: ( 'LinuxOpertingSystem' )
            // InternalUtilLexer.g:14:23: 'LinuxOpertingSystem'
            {
            match("LinuxOpertingSystem");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LinuxOpertingSystem"

    // $ANTLR start "MacOSOpertingSystem"
    public final void mMacOSOpertingSystem() throws RecognitionException {
        try {
            int _type = MacOSOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:16:21: ( 'MacOSOpertingSystem' )
            // InternalUtilLexer.g:16:23: 'MacOSOpertingSystem'
            {
            match("MacOSOpertingSystem");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MacOSOpertingSystem"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:18:15: ( 'AttributeKind' )
            // InternalUtilLexer.g:18:17: 'AttributeKind'
            {
            match("AttributeKind");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AttributeKind"

    // $ANTLR start "SelectionKind"
    public final void mSelectionKind() throws RecognitionException {
        try {
            int _type = SelectionKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:20:15: ( 'SelectionKind' )
            // InternalUtilLexer.g:20:17: 'SelectionKind'
            {
            match("SelectionKind");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SelectionKind"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:22:13: ( 'description:' )
            // InternalUtilLexer.g:22:15: 'description:'
            {
            match("description:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "MaximumKind"
    public final void mMaximumKind() throws RecognitionException {
        try {
            int _type = MaximumKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:24:13: ( 'MaximumKind' )
            // InternalUtilLexer.g:24:15: 'MaximumKind'
            {
            match("MaximumKind");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaximumKind"

    // $ANTLR start "MinimumKind"
    public final void mMinimumKind() throws RecognitionException {
        try {
            int _type = MinimumKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:26:13: ( 'MinimumKind' )
            // InternalUtilLexer.g:26:15: 'MinimumKind'
            {
            match("MinimumKind");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinimumKind"

    // $ANTLR start "Properties"
    public final void mProperties() throws RecognitionException {
        try {
            int _type = Properties;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:28:12: ( 'properties:' )
            // InternalUtilLexer.g:28:14: 'properties:'
            {
            match("properties:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Properties"

    // $ANTLR start "Processor"
    public final void mProcessor() throws RecognitionException {
        try {
            int _type = Processor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:30:11: ( 'Processor' )
            // InternalUtilLexer.g:30:13: 'Processor'
            {
            match("Processor");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Processor"

    // $ANTLR start "RangeKind"
    public final void mRangeKind() throws RecognitionException {
        try {
            int _type = RangeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:32:11: ( 'RangeKind' )
            // InternalUtilLexer.g:32:13: 'RangeKind'
            {
            match("RangeKind");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RangeKind"

    // $ANTLR start "Container"
    public final void mContainer() throws RecognitionException {
        try {
            int _type = Container;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:34:11: ( 'container' )
            // InternalUtilLexer.g:34:13: 'container'
            {
            match("container");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Container"

    // $ANTLR start "Ethernet"
    public final void mEthernet() throws RecognitionException {
        try {
            int _type = Ethernet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:36:10: ( 'Ethernet' )
            // InternalUtilLexer.g:36:12: 'Ethernet'
            {
            match("Ethernet");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ethernet"

    // $ANTLR start "Debian"
    public final void mDebian() throws RecognitionException {
        try {
            int _type = Debian;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:38:8: ( 'debian' )
            // InternalUtilLexer.g:38:10: 'debian'
            {
            match("debian");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Debian"

    // $ANTLR start "Ubuntu"
    public final void mUbuntu() throws RecognitionException {
        try {
            int _type = Ubuntu;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:40:8: ( 'ubuntu' )
            // InternalUtilLexer.g:40:10: 'ubuntu'
            {
            match("ubuntu");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ubuntu"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:42:7: ( 'value:' )
            // InternalUtilLexer.g:42:9: 'value:'
            {
            match("value:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Arm64"
    public final void mArm64() throws RecognitionException {
        try {
            int _type = Arm64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:44:7: ( 'arm64' )
            // InternalUtilLexer.g:44:9: 'arm64'
            {
            match("arm64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Arm64"

    // $ANTLR start "Focal"
    public final void mFocal() throws RecognitionException {
        try {
            int _type = Focal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:46:7: ( 'focal' )
            // InternalUtilLexer.g:46:9: 'focal'
            {
            match("focal");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Focal"

    // $ANTLR start "Jammy"
    public final void mJammy() throws RecognitionException {
        try {
            int _type = Jammy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:48:7: ( 'jammy' )
            // InternalUtilLexer.g:48:9: 'jammy'
            {
            match("jammy");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Jammy"

    // $ANTLR start "Kind"
    public final void mKind() throws RecognitionException {
        try {
            int _type = Kind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:50:6: ( 'kind:' )
            // InternalUtilLexer.g:50:8: 'kind:'
            {
            match("kind:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Kind"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:52:6: ( 'name:' )
            // InternalUtilLexer.g:52:8: 'name:'
            {
            match("name:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:54:6: ( 'type:' )
            // InternalUtilLexer.g:54:8: 'type:'
            {
            match("type:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Wlan"
    public final void mWlan() throws RecognitionException {
        try {
            int _type = Wlan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:56:6: ( 'Wlan' )
            // InternalUtilLexer.g:56:8: 'Wlan'
            {
            match("Wlan");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Wlan"

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:58:5: ( 'x86' )
            // InternalUtilLexer.g:58:7: 'x86'
            {
            match("x86");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X86"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:60:13: ( '-' )
            // InternalUtilLexer.g:60:15: '-'
            {
            match('-');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalUtilLexer.g:62:21: ( '0' .. '9' )
            // InternalUtilLexer.g:62:23: '0' .. '9'
            {
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:64:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalUtilLexer.g:64:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalUtilLexer.g:64:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalUtilLexer.g:64:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalUtilLexer.g:64:31: ( RULE_DECINT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalUtilLexer.g:64:31: RULE_DECINT
                            {
                            mRULE_DECINT();

                            }
                            break;

                        default :
                            break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalUtilLexer.g:64:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalUtilLexer.g:64:44: ( '.' ( RULE_DIGIT )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalUtilLexer.g:64:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalUtilLexer.g:64:49: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                                case 1 :
                                    // InternalUtilLexer.g:64:49: RULE_DIGIT
                                    {
                                    mRULE_DIGIT();

                                    }
                                    break;

                                default :
                                    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalUtilLexer.g:64:73: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalUtilLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DIGIT();

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:66:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalUtilLexer.g:66:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalUtilLexer.g:66:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt8=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt8=2;
                }
                break;
            case '-':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUtilLexer.g:66:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalUtilLexer.g:66:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalUtilLexer.g:66:29: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalUtilLexer.g:66:29: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalUtilLexer.g:66:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalUtilLexer.g:66:54: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalUtilLexer.g:66:54: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:68:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalUtilLexer.g:68:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalUtilLexer.g:68:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalUtilLexer.g:68:23: ~ ( ( '\\n' | '\\r' ) )
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
                    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INDENT"
    public final void mRULE_INDENT() throws RecognitionException {
        try {
            // InternalUtilLexer.g:70:22: ()
            // InternalUtilLexer.g:70:24:
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDENT"

    // $ANTLR start "RULE_DEDENT"
    public final void mRULE_DEDENT() throws RecognitionException {
        try {
            // InternalUtilLexer.g:72:22: ()
            // InternalUtilLexer.g:72:24:
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEDENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:74:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUtilLexer.g:74:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUtilLexer.g:74:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUtilLexer.g:74:11: '^'
                    {
                    match('^');

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUtilLexer.g:74:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalUtilLexer.g:
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

                default :
                    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:76:10: ( ( '0' .. '9' )+ )
            // InternalUtilLexer.g:76:12: ( '0' .. '9' )+
            {
            // InternalUtilLexer.g:76:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // InternalUtilLexer.g:76:13: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:78:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUtilLexer.g:78:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUtilLexer.g:78:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUtilLexer.g:78:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalUtilLexer.g:78:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                        case 1 :
                            // InternalUtilLexer.g:78:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalUtilLexer.g:78:28: ~ ( ( '\\\\' | '\"' ) )
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
                            break loop13;
                        }
                    } while (true);

                    match('\"');

                    }
                    break;
                case 2 :
                    // InternalUtilLexer.g:78:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalUtilLexer.g:78:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                        case 1 :
                            // InternalUtilLexer.g:78:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalUtilLexer.g:78:61: ~ ( ( '\\\\' | '\\'' ) )
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
                            break loop14;
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
            // InternalUtilLexer.g:80:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUtilLexer.g:80:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalUtilLexer.g:80:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
                case 1 :
                    // InternalUtilLexer.g:80:52: .
                    {
                    matchAny();

                    }
                    break;

                default :
                    break loop16;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUtilLexer.g:82:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUtilLexer.g:82:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUtilLexer.g:82:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
                case 1 :
                    // InternalUtilLexer.g:
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
                    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalUtilLexer.g:84:16: ( . )
            // InternalUtilLexer.g:84:18: .
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
        // InternalUtilLexer.g:1:8: ( LinuxOpertingSystem | MacOSOpertingSystem | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Processor | RangeKind | Container | Ethernet | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=33;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalUtilLexer.g:1:10: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 2 :
                // InternalUtilLexer.g:1:30: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 3 :
                // InternalUtilLexer.g:1:50: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 4 :
                // InternalUtilLexer.g:1:64: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 5 :
                // InternalUtilLexer.g:1:78: Description
                {
                mDescription();

                }
                break;
            case 6 :
                // InternalUtilLexer.g:1:90: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 7 :
                // InternalUtilLexer.g:1:102: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 8 :
                // InternalUtilLexer.g:1:114: Properties
                {
                mProperties();

                }
                break;
            case 9 :
                // InternalUtilLexer.g:1:125: Processor
                {
                mProcessor();

                }
                break;
            case 10 :
                // InternalUtilLexer.g:1:135: RangeKind
                {
                mRangeKind();

                }
                break;
            case 11 :
                // InternalUtilLexer.g:1:145: Container
                {
                mContainer();

                }
                break;
            case 12 :
                // InternalUtilLexer.g:1:155: Ethernet
                {
                mEthernet();

                }
                break;
            case 13 :
                // InternalUtilLexer.g:1:164: Debian
                {
                mDebian();

                }
                break;
            case 14 :
                // InternalUtilLexer.g:1:171: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 15 :
                // InternalUtilLexer.g:1:178: Value
                {
                mValue();

                }
                break;
            case 16 :
                // InternalUtilLexer.g:1:184: Arm64
                {
                mArm64();

                }
                break;
            case 17 :
                // InternalUtilLexer.g:1:190: Focal
                {
                mFocal();

                }
                break;
            case 18 :
                // InternalUtilLexer.g:1:196: Jammy
                {
                mJammy();

                }
                break;
            case 19 :
                // InternalUtilLexer.g:1:202: Kind
                {
                mKind();

                }
                break;
            case 20 :
                // InternalUtilLexer.g:1:207: Name
                {
                mName();

                }
                break;
            case 21 :
                // InternalUtilLexer.g:1:212: Type
                {
                mType();

                }
                break;
            case 22 :
                // InternalUtilLexer.g:1:217: Wlan
                {
                mWlan();

                }
                break;
            case 23 :
                // InternalUtilLexer.g:1:222: X86
                {
                mX86();

                }
                break;
            case 24 :
                // InternalUtilLexer.g:1:226: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 25 :
                // InternalUtilLexer.g:1:238: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 26 :
                // InternalUtilLexer.g:1:250: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 27 :
                // InternalUtilLexer.g:1:262: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 28 :
                // InternalUtilLexer.g:1:278: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 29 :
                // InternalUtilLexer.g:1:286: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 30 :
                // InternalUtilLexer.g:1:295: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 31 :
                // InternalUtilLexer.g:1:307: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 32 :
                // InternalUtilLexer.g:1:323: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 33 :
                // InternalUtilLexer.g:1:331: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER();

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA5_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA5_eofS =
        "\10\uffff";
    static final String DFA5_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA5_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "64:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\24\41\1\67\2\66\1\uffff\1\37\1\uffff\3\37\2\uffff\1\41\1\uffff\24\41\4\uffff\1\66\4\uffff\26\41\1\154\25\41\1\u0082\1\uffff\17\41\1\u0092\1\u0093\1\u0094\4\uffff\7\41\1\u009c\5\41\1\u00a2\4\uffff\7\41\1\uffff\5\41\1\uffff\13\41\1\u00ba\10\41\1\u00c3\1\u00c4\1\u00c5\1\uffff\10\41\3\uffff\2\41\1\u00d0\1\u00d1\3\41\1\uffff\2\41\2\uffff\2\41\1\uffff\2\41\1\u00db\1\u00dc\2\41\2\uffff\10\41\1\u00e7\1\u00e8\2\uffff";
    static final String DFA18_eofS =
        "\u00e9\uffff";
    static final String DFA18_minS =
        "\1\0\1\151\1\141\1\164\2\145\2\162\1\141\1\157\1\164\1\142\1\141\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\70\1\60\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\156\1\uffff\1\143\1\156\1\164\1\154\1\142\2\157\2\156\1\150\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\66\4\uffff\1\60\4\uffff\1\165\1\117\2\151\1\162\1\145\1\143\1\151\1\160\1\143\1\147\1\164\1\145\1\156\1\165\1\66\1\141\1\155\1\144\2\145\1\156\1\60\1\170\1\123\2\155\1\151\1\143\1\162\1\141\3\145\1\141\1\162\1\164\1\145\1\64\1\154\1\171\3\72\1\60\1\uffff\2\117\2\165\1\142\1\164\1\151\1\156\1\162\1\163\1\113\1\151\1\156\1\165\1\72\3\60\4\uffff\2\160\2\155\1\165\1\151\1\160\1\60\1\164\1\163\1\151\1\156\1\145\1\60\4\uffff\2\145\2\113\1\164\1\157\1\164\1\uffff\1\151\1\157\1\156\1\145\1\164\1\uffff\2\162\2\151\1\145\1\156\1\151\1\145\1\162\1\144\1\162\1\60\2\164\2\156\2\113\1\157\1\163\3\60\1\uffff\2\151\2\144\2\151\1\156\1\72\3\uffff\2\156\2\60\2\156\1\72\1\uffff\2\147\2\uffff\2\144\1\uffff\2\123\2\60\2\171\2\uffff\2\163\2\164\2\145\2\155\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\2\151\1\164\2\145\2\162\1\141\1\157\1\164\1\142\1\141\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\70\1\71\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\156\1\uffff\1\170\1\156\1\164\1\154\1\163\2\157\2\156\1\150\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\66\4\uffff\1\71\4\uffff\1\165\1\117\2\151\1\162\1\145\1\143\1\151\1\160\1\143\1\147\1\164\1\145\1\156\1\165\1\66\1\141\1\155\1\144\2\145\1\156\1\172\1\170\1\123\2\155\1\151\1\143\1\162\1\141\3\145\1\141\1\162\1\164\1\145\1\64\1\154\1\171\3\72\1\172\1\uffff\2\117\2\165\1\142\1\164\1\151\1\156\1\162\1\163\1\113\1\151\1\156\1\165\1\72\3\172\4\uffff\2\160\2\155\1\165\1\151\1\160\1\172\1\164\1\163\1\151\1\156\1\145\1\172\4\uffff\2\145\2\113\1\164\1\157\1\164\1\uffff\1\151\1\157\1\156\1\145\1\164\1\uffff\2\162\2\151\1\145\1\156\1\151\1\145\1\162\1\144\1\162\1\172\2\164\2\156\2\113\1\157\1\163\3\172\1\uffff\2\151\2\144\2\151\1\156\1\72\3\uffff\2\156\2\172\2\156\1\72\1\uffff\2\147\2\uffff\2\144\1\uffff\2\123\2\172\2\171\2\uffff\2\163\2\164\2\145\2\155\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\30\uffff\1\33\1\uffff\1\34\3\uffff\1\40\1\41\1\uffff\1\34\24\uffff\1\32\1\30\1\35\1\31\1\uffff\1\33\1\36\1\37\1\40\55\uffff\1\27\22\uffff\1\23\1\24\1\25\1\26\16\uffff\1\17\1\20\1\21\1\22\7\uffff\1\15\5\uffff\1\16\27\uffff\1\14\10\uffff\1\11\1\12\1\13\7\uffff\1\10\2\uffff\1\6\1\7\2\uffff\1\5\6\uffff\1\3\1\4\12\uffff\1\1\1\2";
    static final String DFA18_specialS =
        "\1\1\32\uffff\1\2\1\0\u00cc\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\30\3\37\1\34\5\37\1\25\1\37\1\35\1\26\11\27\7\37\1\3\3\32\1\12\6\32\1\1\1\2\2\32\1\7\1\32\1\10\1\4\3\32\1\23\3\32\3\37\1\31\1\32\1\37\1\15\1\32\1\11\1\5\1\32\1\16\3\32\1\17\1\20\2\32\1\21\1\32\1\6\3\32\1\22\1\13\1\14\1\32\1\24\2\32\uff85\37",
            "\1\40",
            "\1\42\7\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\66",
            "\1\71\1\uffff\12\70\13\uffff\1\71\37\uffff\1\71",
            "\1\71\1\uffff\12\72\13\uffff\1\71\37\uffff\1\71",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\74",
            "\0\74",
            "\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\100\24\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\20\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "\12\72",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00dd",
            "\1\u00de",
            "",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LinuxOpertingSystem | MacOSOpertingSystem | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Processor | RangeKind | Container | Ethernet | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA18_28 = input.LA(1);

                        s = -1;
                        if ( ((LA18_28>='\u0000' && LA18_28<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='L') ) {s = 1;}

                        else if ( (LA18_0=='M') ) {s = 2;}

                        else if ( (LA18_0=='A') ) {s = 3;}

                        else if ( (LA18_0=='S') ) {s = 4;}

                        else if ( (LA18_0=='d') ) {s = 5;}

                        else if ( (LA18_0=='p') ) {s = 6;}

                        else if ( (LA18_0=='P') ) {s = 7;}

                        else if ( (LA18_0=='R') ) {s = 8;}

                        else if ( (LA18_0=='c') ) {s = 9;}

                        else if ( (LA18_0=='E') ) {s = 10;}

                        else if ( (LA18_0=='u') ) {s = 11;}

                        else if ( (LA18_0=='v') ) {s = 12;}

                        else if ( (LA18_0=='a') ) {s = 13;}

                        else if ( (LA18_0=='f') ) {s = 14;}

                        else if ( (LA18_0=='j') ) {s = 15;}

                        else if ( (LA18_0=='k') ) {s = 16;}

                        else if ( (LA18_0=='n') ) {s = 17;}

                        else if ( (LA18_0=='t') ) {s = 18;}

                        else if ( (LA18_0=='W') ) {s = 19;}

                        else if ( (LA18_0=='x') ) {s = 20;}

                        else if ( (LA18_0=='-') ) {s = 21;}

                        else if ( (LA18_0=='0') ) {s = 22;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 23;}

                        else if ( (LA18_0=='#') ) {s = 24;}

                        else if ( (LA18_0=='^') ) {s = 25;}

                        else if ( ((LA18_0>='B' && LA18_0<='D')||(LA18_0>='F' && LA18_0<='K')||(LA18_0>='N' && LA18_0<='O')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='b'||LA18_0=='e'||(LA18_0>='g' && LA18_0<='i')||(LA18_0>='l' && LA18_0<='m')||LA18_0=='o'||(LA18_0>='q' && LA18_0<='s')||LA18_0=='w'||(LA18_0>='y' && LA18_0<='z')) ) {s = 26;}

                        else if ( (LA18_0=='\"') ) {s = 27;}

                        else if ( (LA18_0=='\'') ) {s = 28;}

                        else if ( (LA18_0=='/') ) {s = 29;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 30;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=',')||LA18_0=='.'||(LA18_0>=':' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA18_27 = input.LA(1);

                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}
