package de.fraunhofer.ipa.targetEnvironment.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceLexer extends Lexer {
    public static final int RULE_DAY=22;
    public static final int RULE_DATE_TIME=27;
    public static final int RULE_BOOLEAN=19;
    public static final int RULE_STRING=33;
    public static final int AttributeKind=5;
    public static final int RULE_YEAR=24;
    public static final int Properties=11;
    public static final int Name=14;
    public static final int RULE_MIN_SEC=26;
    public static final int RULE_SL_COMMENT=28;
    public static final int CommunicationConnection=4;
    public static final int HyphenMinus=16;
    public static final int RULE_DOUBLE=21;
    public static final int Kind=13;
    public static final int RULE_DECINT=20;
    public static final int MinimumKind=9;
    public static final int EOF=-1;
    public static final int RULE_INDENT=29;
    public static final int RULE_DEDENT=30;
    public static final int RULE_HOUR=25;
    public static final int Capability=10;
    public static final int RULE_ID=31;
    public static final int RULE_WS=35;
    public static final int RULE_DIGIT=17;
    public static final int MaximumKind=8;
    public static final int RULE_ANY_OTHER=36;
    public static final int SelectionKind=6;
    public static final int DeviceType=7;
    public static final int Type=15;
    public static final int RULE_INT=32;
    public static final int Value=12;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_MONTH=23;
    public static final int RULE_BINARY=18;

    // delegates
    // delegators

    public InternalDeviceLexer() {;}
    public InternalDeviceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDeviceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDeviceLexer.g"; }

    // $ANTLR start "CommunicationConnection"
    public final void mCommunicationConnection() throws RecognitionException {
        try {
            int _type = CommunicationConnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:14:25: ( 'communicationConnection:' )
            // InternalDeviceLexer.g:14:27: 'communicationConnection:'
            {
            match("communicationConnection:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommunicationConnection"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:16:15: ( 'AttributeKind' )
            // InternalDeviceLexer.g:16:17: 'AttributeKind'
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
            // InternalDeviceLexer.g:18:15: ( 'SelectionKind' )
            // InternalDeviceLexer.g:18:17: 'SelectionKind'
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

    // $ANTLR start "DeviceType"
    public final void mDeviceType() throws RecognitionException {
        try {
            int _type = DeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:20:12: ( 'DeviceType:' )
            // InternalDeviceLexer.g:20:14: 'DeviceType:'
            {
            match("DeviceType:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeviceType"

    // $ANTLR start "MaximumKind"
    public final void mMaximumKind() throws RecognitionException {
        try {
            int _type = MaximumKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:22:13: ( 'MaximumKind' )
            // InternalDeviceLexer.g:22:15: 'MaximumKind'
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
            // InternalDeviceLexer.g:24:13: ( 'MinimumKind' )
            // InternalDeviceLexer.g:24:15: 'MinimumKind'
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

    // $ANTLR start "Capability"
    public final void mCapability() throws RecognitionException {
        try {
            int _type = Capability;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:26:12: ( 'capability:' )
            // InternalDeviceLexer.g:26:14: 'capability:'
            {
            match("capability:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Capability"

    // $ANTLR start "Properties"
    public final void mProperties() throws RecognitionException {
        try {
            int _type = Properties;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:28:12: ( 'properties:' )
            // InternalDeviceLexer.g:28:14: 'properties:'
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

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:30:7: ( 'value:' )
            // InternalDeviceLexer.g:30:9: 'value:'
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

    // $ANTLR start "Kind"
    public final void mKind() throws RecognitionException {
        try {
            int _type = Kind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:32:6: ( 'kind:' )
            // InternalDeviceLexer.g:32:8: 'kind:'
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
            // InternalDeviceLexer.g:34:6: ( 'name:' )
            // InternalDeviceLexer.g:34:8: 'name:'
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
            // InternalDeviceLexer.g:36:6: ( 'type:' )
            // InternalDeviceLexer.g:36:8: 'type:'
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

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:38:13: ( '-' )
            // InternalDeviceLexer.g:38:15: '-'
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
            // InternalDeviceLexer.g:40:21: ( '0' .. '9' )
            // InternalDeviceLexer.g:40:23: '0' .. '9'
            {
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:42:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalDeviceLexer.g:42:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalDeviceLexer.g:42:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDeviceLexer.g:42:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:42:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalDeviceLexer.g:42:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // InternalDeviceLexer.g:
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
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
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:44:14: ( ( 'true' | 'false' ) )
            // InternalDeviceLexer.g:44:16: ( 'true' | 'false' )
            {
            // InternalDeviceLexer.g:44:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeviceLexer.g:44:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:44:24: 'false'
                    {
                    match("false");


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:46:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalDeviceLexer.g:46:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalDeviceLexer.g:46:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDeviceLexer.g:46:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalDeviceLexer.g:46:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalDeviceLexer.g:46:31: RULE_DECINT
                            {
                            mRULE_DECINT();

                            }
                            break;

                        default :
                            break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:46:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalDeviceLexer.g:46:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDeviceLexer.g:46:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalDeviceLexer.g:46:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                                case 1 :
                                    // InternalDeviceLexer.g:46:49: RULE_DIGIT
                                    {
                                    mRULE_DIGIT();

                                    }
                                    break;

                                default :
                                    break loop5;
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

                    // InternalDeviceLexer.g:46:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDeviceLexer.g:
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
            // InternalDeviceLexer.g:48:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:48:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:48:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt11=1;
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
                alt11=2;
                }
                break;
            case '-':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDeviceLexer.g:48:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:48:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalDeviceLexer.g:48:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // InternalDeviceLexer.g:48:29: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalDeviceLexer.g:48:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalDeviceLexer.g:48:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // InternalDeviceLexer.g:48:54: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop10;
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

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:50:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalDeviceLexer.g:50:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalDeviceLexer.g:50:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='3')) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='9')) ) {
                    alt12=2;
                }
                else {
                    alt12=1;}
            }
            else if ( ((LA12_0>='4' && LA12_0<='9')) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeviceLexer.g:50:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:50:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3');
                    matchRange('0','9');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:52:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalDeviceLexer.g:52:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalDeviceLexer.g:52:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='1') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='2')) ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( ((LA13_0>='2' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDeviceLexer.g:52:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:52:33: '1' '0' .. '2'
                    {
                    match('1');
                    matchRange('0','2');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:54:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalDeviceLexer.g:54:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2');
            matchRange('0','9');
            matchRange('0','9');
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:56:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalDeviceLexer.g:56:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalDeviceLexer.g:56:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='1')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='2') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceLexer.g:56:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:56:41: '2' '0' .. '3'
                    {
                    match('2');
                    matchRange('0','3');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_MIN_SEC"
    public final void mRULE_MIN_SEC() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:58:23: ( '0' .. '5' '0' .. '9' )
            // InternalDeviceLexer.g:58:25: '0' .. '5' '0' .. '9'
            {
            matchRange('0','5');
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_SEC"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:60:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalDeviceLexer.g:60:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
            {
            mRULE_YEAR();
            match('-');
            mRULE_MONTH();
            match('-');
            mRULE_DAY();
            match('T');
            mRULE_HOUR();
            match(':');
            mRULE_MIN_SEC();
            match(':');
            mRULE_MIN_SEC();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:62:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDeviceLexer.g:62:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalDeviceLexer.g:62:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // InternalDeviceLexer.g:62:23: ~ ( ( '\\n' | '\\r' ) )
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
                    break loop15;
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
            // InternalDeviceLexer.g:64:22: ()
            // InternalDeviceLexer.g:64:24:
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
            // InternalDeviceLexer.g:66:22: ()
            // InternalDeviceLexer.g:66:24:
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
            // InternalDeviceLexer.g:68:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceLexer.g:68:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceLexer.g:68:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceLexer.g:68:11: '^'
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

            // InternalDeviceLexer.g:68:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
                case 1 :
                    // InternalDeviceLexer.g:
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
                    break loop17;
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
            // InternalDeviceLexer.g:70:10: ( ( '0' .. '9' )+ )
            // InternalDeviceLexer.g:70:12: ( '0' .. '9' )+
            {
            // InternalDeviceLexer.g:70:12: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
                case 1 :
                    // InternalDeviceLexer.g:70:13: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalDeviceLexer.g:72:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceLexer.g:72:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceLexer.g:72:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDeviceLexer.g:72:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalDeviceLexer.g:72:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                        case 1 :
                            // InternalDeviceLexer.g:72:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalDeviceLexer.g:72:28: ~ ( ( '\\\\' | '\"' ) )
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
                            break loop19;
                        }
                    } while (true);

                    match('\"');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:72:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalDeviceLexer.g:72:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                        case 1 :
                            // InternalDeviceLexer.g:72:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalDeviceLexer.g:72:61: ~ ( ( '\\\\' | '\\'' ) )
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
                            break loop20;
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
            // InternalDeviceLexer.g:74:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceLexer.g:74:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalDeviceLexer.g:74:24: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
                case 1 :
                    // InternalDeviceLexer.g:74:52: .
                    {
                    matchAny();

                    }
                    break;

                default :
                    break loop22;
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
            // InternalDeviceLexer.g:76:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceLexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceLexer.g:76:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
                case 1 :
                    // InternalDeviceLexer.g:
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
                    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            // InternalDeviceLexer.g:78:16: ( . )
            // InternalDeviceLexer.g:78:18: .
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
        // InternalDeviceLexer.g:1:8: ( CommunicationConnection | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | Value | Kind | Name | Type | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=25;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalDeviceLexer.g:1:10: CommunicationConnection
                {
                mCommunicationConnection();

                }
                break;
            case 2 :
                // InternalDeviceLexer.g:1:34: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 3 :
                // InternalDeviceLexer.g:1:48: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 4 :
                // InternalDeviceLexer.g:1:62: DeviceType
                {
                mDeviceType();

                }
                break;
            case 5 :
                // InternalDeviceLexer.g:1:73: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 6 :
                // InternalDeviceLexer.g:1:85: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 7 :
                // InternalDeviceLexer.g:1:97: Capability
                {
                mCapability();

                }
                break;
            case 8 :
                // InternalDeviceLexer.g:1:108: Properties
                {
                mProperties();

                }
                break;
            case 9 :
                // InternalDeviceLexer.g:1:119: Value
                {
                mValue();

                }
                break;
            case 10 :
                // InternalDeviceLexer.g:1:125: Kind
                {
                mKind();

                }
                break;
            case 11 :
                // InternalDeviceLexer.g:1:130: Name
                {
                mName();

                }
                break;
            case 12 :
                // InternalDeviceLexer.g:1:135: Type
                {
                mType();

                }
                break;
            case 13 :
                // InternalDeviceLexer.g:1:140: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 14 :
                // InternalDeviceLexer.g:1:152: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 15 :
                // InternalDeviceLexer.g:1:164: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 16 :
                // InternalDeviceLexer.g:1:177: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 17 :
                // InternalDeviceLexer.g:1:189: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 18 :
                // InternalDeviceLexer.g:1:201: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 19 :
                // InternalDeviceLexer.g:1:216: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 20 :
                // InternalDeviceLexer.g:1:232: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 21 :
                // InternalDeviceLexer.g:1:240: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 22 :
                // InternalDeviceLexer.g:1:249: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 23 :
                // InternalDeviceLexer.g:1:261: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 24 :
                // InternalDeviceLexer.g:1:277: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 25 :
                // InternalDeviceLexer.g:1:285: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER();

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA8_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA8_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
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
            return "46:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\12\32\1\47\1\46\1\32\2\46\1\uffff\1\27\1\uffff\3\27\2\uffff\2\32\1\uffff\13\32\3\uffff\1\100\1\uffff\1\32\2\46\4\uffff\15\32\1\100\1\uffff\1\32\1\46\14\32\1\137\1\100\1\32\1\46\11\32\5\uffff\1\137\10\32\1\uffff\41\32\1\uffff\2\32\1\uffff\1\u0096\1\u0097\1\uffff\3\32\2\uffff\1\32\1\u009c\1\u009d\1\32\2\uffff\11\32\1\uffff";
    static final String DFA24_eofS =
        "\u00a8\uffff";
    static final String DFA24_minS =
        "\1\0\1\141\1\164\2\145\1\141\1\162\1\141\1\151\1\141\1\162\1\60\1\56\1\141\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\160\1\uffff\1\164\1\154\1\166\1\170\1\156\1\157\1\154\1\156\1\155\1\160\1\165\3\uffff\1\60\1\uffff\1\154\2\60\4\uffff\1\155\1\141\1\162\1\145\3\151\1\160\1\165\1\144\3\145\1\60\1\uffff\1\163\1\60\1\165\1\142\1\151\2\143\2\155\2\145\3\72\1\60\1\55\1\145\1\55\1\156\1\151\1\142\1\164\1\145\2\165\1\162\1\72\5\uffff\1\60\1\151\1\154\1\165\1\151\1\124\2\155\1\164\1\uffff\1\143\1\151\1\164\1\157\1\171\2\113\1\151\1\141\1\164\1\145\1\156\1\160\2\151\1\145\1\164\1\171\2\113\1\145\2\156\1\163\1\151\1\72\2\151\1\72\2\144\1\72\1\157\1\uffff\2\156\1\uffff\2\60\1\uffff\1\156\2\144\2\uffff\1\103\2\60\1\157\2\uffff\2\156\1\145\1\143\1\164\1\151\1\157\1\156\1\72\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\157\1\164\2\145\1\151\1\162\1\141\1\151\1\141\1\171\1\71\1\145\1\141\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\155\1\160\1\uffff\1\164\1\154\1\166\1\170\1\156\1\157\1\154\1\156\1\155\1\160\1\165\3\uffff\1\71\1\uffff\1\154\2\71\4\uffff\1\155\1\141\1\162\1\145\3\151\1\160\1\165\1\144\3\145\1\71\1\uffff\1\163\1\71\1\165\1\142\1\151\2\143\2\155\2\145\3\72\1\172\1\55\1\145\1\71\1\156\1\151\1\142\1\164\1\145\2\165\1\162\1\72\5\uffff\1\172\1\151\1\154\1\165\1\151\1\124\2\155\1\164\1\uffff\1\143\1\151\1\164\1\157\1\171\2\113\1\151\1\141\1\164\1\145\1\156\1\160\2\151\1\145\1\164\1\171\2\113\1\145\2\156\1\163\1\151\1\72\2\151\1\72\2\144\1\72\1\157\1\uffff\2\156\1\uffff\2\172\1\uffff\1\156\2\144\2\uffff\1\103\2\172\1\157\2\uffff\2\156\1\145\1\143\1\164\1\151\1\157\1\156\1\72\1\uffff";
    static final String DFA24_acceptS =
        "\20\uffff\1\23\1\uffff\1\24\3\uffff\1\30\1\31\2\uffff\1\24\13\uffff\1\21\1\15\1\16\1\uffff\1\20\3\uffff\1\23\1\26\1\27\1\30\16\uffff\1\25\33\uffff\1\12\1\13\1\14\1\17\1\22\11\uffff\1\11\41\uffff\1\7\2\uffff\1\4\2\uffff\1\10\3\uffff\1\5\1\6\4\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA24_specialS =
        "\1\1\22\uffff\1\0\1\2\u0093\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\1\20\3\27\1\24\5\27\1\13\1\27\1\25\1\14\2\16\7\17\7\27\1\2\2\22\1\4\10\22\1\5\5\22\1\3\7\22\3\27\1\21\1\22\1\27\2\22\1\1\2\22\1\15\4\22\1\10\2\22\1\11\1\22\1\6\3\22\1\12\1\22\1\7\4\22\uff85\27",
            "\1\31\15\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36\7\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45\6\uffff\1\44",
            "\12\46",
            "\1\52\1\uffff\12\51\10\uffff\1\50\2\uffff\1\52\34\uffff\1\50\2\uffff\1\52",
            "\1\53",
            "\1\52\1\uffff\12\54\13\uffff\1\52\37\uffff\1\52",
            "\1\52\1\uffff\12\55\13\uffff\1\52\37\uffff\1\52",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\0\57",
            "\0\57",
            "\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\12\77",
            "",
            "\1\101",
            "\12\102",
            "\12\55",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\120",
            "",
            "\1\121",
            "\12\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\140",
            "\1\141",
            "\1\140\2\uffff\12\55",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
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
            "\1\u0082",
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
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CommunicationConnection | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | Value | Kind | Name | Type | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA24_19 = input.LA(1);

                        s = -1;
                        if ( ((LA24_19>='\u0000' && LA24_19<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='c') ) {s = 1;}

                        else if ( (LA24_0=='A') ) {s = 2;}

                        else if ( (LA24_0=='S') ) {s = 3;}

                        else if ( (LA24_0=='D') ) {s = 4;}

                        else if ( (LA24_0=='M') ) {s = 5;}

                        else if ( (LA24_0=='p') ) {s = 6;}

                        else if ( (LA24_0=='v') ) {s = 7;}

                        else if ( (LA24_0=='k') ) {s = 8;}

                        else if ( (LA24_0=='n') ) {s = 9;}

                        else if ( (LA24_0=='t') ) {s = 10;}

                        else if ( (LA24_0=='-') ) {s = 11;}

                        else if ( (LA24_0=='0') ) {s = 12;}

                        else if ( (LA24_0=='f') ) {s = 13;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 14;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 15;}

                        else if ( (LA24_0=='#') ) {s = 16;}

                        else if ( (LA24_0=='^') ) {s = 17;}

                        else if ( ((LA24_0>='B' && LA24_0<='C')||(LA24_0>='E' && LA24_0<='L')||(LA24_0>='N' && LA24_0<='R')||(LA24_0>='T' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='b')||(LA24_0>='d' && LA24_0<='e')||(LA24_0>='g' && LA24_0<='j')||(LA24_0>='l' && LA24_0<='m')||LA24_0=='o'||(LA24_0>='q' && LA24_0<='s')||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 18;}

                        else if ( (LA24_0=='\"') ) {s = 19;}

                        else if ( (LA24_0=='\'') ) {s = 20;}

                        else if ( (LA24_0=='/') ) {s = 21;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 22;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=',')||LA24_0=='.'||(LA24_0>=':' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA24_20 = input.LA(1);

                        s = -1;
                        if ( ((LA24_20>='\u0000' && LA24_20<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}
