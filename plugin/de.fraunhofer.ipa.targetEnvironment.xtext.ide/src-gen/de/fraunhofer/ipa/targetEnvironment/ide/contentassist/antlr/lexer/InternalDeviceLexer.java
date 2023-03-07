package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeviceLexer extends Lexer {
    public static final int RULE_DAY=32;
    public static final int Address=18;
    public static final int RULE_DATE_TIME=37;
    public static final int RULE_BOOLEAN=29;
    public static final int AttributeKind=9;
    public static final int RULE_YEAR=34;
    public static final int Name=23;
    public static final int RULE_MIN_SEC=36;
    public static final int Kind=22;
    public static final int RULE_DEDENT=40;
    public static final int Capability=14;
    public static final int RULE_ID=41;
    public static final int RULE_DIGIT=27;
    public static final int SelectionKind=10;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=11;
    public static final int Linux=20;
    public static final int RULE_INT=42;
    public static final int Ethernet=17;
    public static final int Value=19;
    public static final int RULE_ML_COMMENT=44;
    public static final int MacOS=21;
    public static final int ProcessorArchitecture=8;
    public static final int RULE_STRING=43;
    public static final int Wlan=25;
    public static final int Properties=15;
    public static final int RULE_SL_COMMENT=38;
    public static final int CommunicationConnection=6;
    public static final int HyphenMinus=26;
    public static final int RULE_DOUBLE=31;
    public static final int RULE_DECINT=30;
    public static final int MinimumKind=13;
    public static final int EOF=-1;
    public static final int RULE_INDENT=39;
    public static final int RULE_HOUR=35;
    public static final int RULE_WS=45;
    public static final int MaximumKind=12;
    public static final int RULE_ANY_OTHER=46;
    public static final int ComputationDeviceType=7;
    public static final int Type=24;
    public static final int X86ProcessorArchitecture=5;
    public static final int RULE_MONTH=33;
    public static final int RULE_BINARY=28;
    public static final int Interface=16;

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

    // $ANTLR start "Arm64ProcessorArchitecture"
    public final void mArm64ProcessorArchitecture() throws RecognitionException {
        try {
            int _type = Arm64ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:14:28: ( 'Arm64ProcessorArchitecture' )
            // InternalDeviceLexer.g:14:30: 'Arm64ProcessorArchitecture'
            {
            match("Arm64ProcessorArchitecture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Arm64ProcessorArchitecture"

    // $ANTLR start "X86ProcessorArchitecture"
    public final void mX86ProcessorArchitecture() throws RecognitionException {
        try {
            int _type = X86ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:16:26: ( 'X86ProcessorArchitecture' )
            // InternalDeviceLexer.g:16:28: 'X86ProcessorArchitecture'
            {
            match("X86ProcessorArchitecture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X86ProcessorArchitecture"

    // $ANTLR start "CommunicationConnection"
    public final void mCommunicationConnection() throws RecognitionException {
        try {
            int _type = CommunicationConnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:18:25: ( 'communicationConnection:' )
            // InternalDeviceLexer.g:18:27: 'communicationConnection:'
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

    // $ANTLR start "ComputationDeviceType"
    public final void mComputationDeviceType() throws RecognitionException {
        try {
            int _type = ComputationDeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:20:23: ( 'ComputationDeviceType:' )
            // InternalDeviceLexer.g:20:25: 'ComputationDeviceType:'
            {
            match("ComputationDeviceType:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComputationDeviceType"

    // $ANTLR start "ProcessorArchitecture"
    public final void mProcessorArchitecture() throws RecognitionException {
        try {
            int _type = ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:22:23: ( 'ProcessorArchitecture' )
            // InternalDeviceLexer.g:22:25: 'ProcessorArchitecture'
            {
            match("ProcessorArchitecture"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ProcessorArchitecture"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:24:15: ( 'AttributeKind' )
            // InternalDeviceLexer.g:24:17: 'AttributeKind'
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
            // InternalDeviceLexer.g:26:15: ( 'SelectionKind' )
            // InternalDeviceLexer.g:26:17: 'SelectionKind'
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
            // InternalDeviceLexer.g:28:12: ( 'DeviceType:' )
            // InternalDeviceLexer.g:28:14: 'DeviceType:'
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
            // InternalDeviceLexer.g:30:13: ( 'MaximumKind' )
            // InternalDeviceLexer.g:30:15: 'MaximumKind'
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
            // InternalDeviceLexer.g:32:13: ( 'MinimumKind' )
            // InternalDeviceLexer.g:32:15: 'MinimumKind'
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
            // InternalDeviceLexer.g:34:12: ( 'capability:' )
            // InternalDeviceLexer.g:34:14: 'capability:'
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
            // InternalDeviceLexer.g:36:12: ( 'properties:' )
            // InternalDeviceLexer.g:36:14: 'properties:'
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

    // $ANTLR start "Interface"
    public final void mInterface() throws RecognitionException {
        try {
            int _type = Interface;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:38:11: ( 'interface' )
            // InternalDeviceLexer.g:38:13: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interface"

    // $ANTLR start "Ethernet"
    public final void mEthernet() throws RecognitionException {
        try {
            int _type = Ethernet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:40:10: ( 'Ethernet' )
            // InternalDeviceLexer.g:40:12: 'Ethernet'
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

    // $ANTLR start "Address"
    public final void mAddress() throws RecognitionException {
        try {
            int _type = Address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:42:9: ( 'address' )
            // InternalDeviceLexer.g:42:11: 'address'
            {
            match("address"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Address"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:44:7: ( 'value:' )
            // InternalDeviceLexer.g:44:9: 'value:'
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

    // $ANTLR start "Linux"
    public final void mLinux() throws RecognitionException {
        try {
            int _type = Linux;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:46:7: ( 'Linux' )
            // InternalDeviceLexer.g:46:9: 'Linux'
            {
            match("Linux"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Linux"

    // $ANTLR start "MacOS"
    public final void mMacOS() throws RecognitionException {
        try {
            int _type = MacOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:48:7: ( 'MacOS' )
            // InternalDeviceLexer.g:48:9: 'MacOS'
            {
            match("MacOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MacOS"

    // $ANTLR start "Kind"
    public final void mKind() throws RecognitionException {
        try {
            int _type = Kind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:50:6: ( 'kind:' )
            // InternalDeviceLexer.g:50:8: 'kind:'
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
            // InternalDeviceLexer.g:52:6: ( 'name:' )
            // InternalDeviceLexer.g:52:8: 'name:'
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
            // InternalDeviceLexer.g:54:6: ( 'type:' )
            // InternalDeviceLexer.g:54:8: 'type:'
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
            // InternalDeviceLexer.g:56:6: ( 'Wlan' )
            // InternalDeviceLexer.g:56:8: 'Wlan'
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

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:58:13: ( '-' )
            // InternalDeviceLexer.g:58:15: '-'
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
            // InternalDeviceLexer.g:60:21: ( '0' .. '9' )
            // InternalDeviceLexer.g:60:23: '0' .. '9'
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
            // InternalDeviceLexer.g:62:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalDeviceLexer.g:62:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalDeviceLexer.g:62:15: ( '0b' | '0B' )
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
                    // InternalDeviceLexer.g:62:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:62:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalDeviceLexer.g:62:27: ( '0' | '1' )+
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
            // InternalDeviceLexer.g:64:14: ( ( 'true' | 'false' ) )
            // InternalDeviceLexer.g:64:16: ( 'true' | 'false' )
            {
            // InternalDeviceLexer.g:64:16: ( 'true' | 'false' )
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
                    // InternalDeviceLexer.g:64:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:64:24: 'false'
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
            // InternalDeviceLexer.g:66:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalDeviceLexer.g:66:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalDeviceLexer.g:66:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDeviceLexer.g:66:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalDeviceLexer.g:66:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:66:31: RULE_DECINT
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
                    // InternalDeviceLexer.g:66:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalDeviceLexer.g:66:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDeviceLexer.g:66:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalDeviceLexer.g:66:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalDeviceLexer.g:66:49: RULE_DIGIT
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

                    // InternalDeviceLexer.g:66:73: ( '-' | '+' )?
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
            // InternalDeviceLexer.g:68:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:68:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:68:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalDeviceLexer.g:68:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:68:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalDeviceLexer.g:68:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:68:29: RULE_DIGIT
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
                    // InternalDeviceLexer.g:68:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalDeviceLexer.g:68:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:68:54: RULE_DIGIT
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
            // InternalDeviceLexer.g:70:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalDeviceLexer.g:70:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalDeviceLexer.g:70:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalDeviceLexer.g:70:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:70:31: '1' .. '3' '0' .. '9'
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
            // InternalDeviceLexer.g:72:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalDeviceLexer.g:72:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalDeviceLexer.g:72:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalDeviceLexer.g:72:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:72:33: '1' '0' .. '2'
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
            // InternalDeviceLexer.g:74:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalDeviceLexer.g:74:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalDeviceLexer.g:76:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalDeviceLexer.g:76:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalDeviceLexer.g:76:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalDeviceLexer.g:76:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:76:41: '2' '0' .. '3'
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
            // InternalDeviceLexer.g:78:23: ( '0' .. '5' '0' .. '9' )
            // InternalDeviceLexer.g:78:25: '0' .. '5' '0' .. '9'
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
            // InternalDeviceLexer.g:80:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalDeviceLexer.g:80:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalDeviceLexer.g:82:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDeviceLexer.g:82:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalDeviceLexer.g:82:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeviceLexer.g:82:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalDeviceLexer.g:84:22: ()
            // InternalDeviceLexer.g:84:24: 
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
            // InternalDeviceLexer.g:86:22: ()
            // InternalDeviceLexer.g:86:24: 
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
            // InternalDeviceLexer.g:88:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceLexer.g:88:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceLexer.g:88:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceLexer.g:88:11: '^'
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

            // InternalDeviceLexer.g:88:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalDeviceLexer.g:90:10: ( ( '0' .. '9' )+ )
            // InternalDeviceLexer.g:90:12: ( '0' .. '9' )+
            {
            // InternalDeviceLexer.g:90:12: ( '0' .. '9' )+
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
            	    // InternalDeviceLexer.g:90:13: '0' .. '9'
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
            // InternalDeviceLexer.g:92:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceLexer.g:92:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceLexer.g:92:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDeviceLexer.g:92:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDeviceLexer.g:92:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalDeviceLexer.g:92:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceLexer.g:92:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDeviceLexer.g:92:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDeviceLexer.g:92:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalDeviceLexer.g:92:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceLexer.g:92:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDeviceLexer.g:94:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceLexer.g:94:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDeviceLexer.g:94:24: ( options {greedy=false; } : . )*
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
            	    // InternalDeviceLexer.g:94:52: .
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
            // InternalDeviceLexer.g:96:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceLexer.g:96:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalDeviceLexer.g:98:16: ( . )
            // InternalDeviceLexer.g:98:18: .
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
        // InternalDeviceLexer.g:1:8: ( Arm64ProcessorArchitecture | X86ProcessorArchitecture | CommunicationConnection | ComputationDeviceType | ProcessorArchitecture | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | Interface | Ethernet | Address | Value | Linux | MacOS | Kind | Name | Type | Wlan | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=35;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalDeviceLexer.g:1:10: Arm64ProcessorArchitecture
                {
                mArm64ProcessorArchitecture(); 

                }
                break;
            case 2 :
                // InternalDeviceLexer.g:1:37: X86ProcessorArchitecture
                {
                mX86ProcessorArchitecture(); 

                }
                break;
            case 3 :
                // InternalDeviceLexer.g:1:62: CommunicationConnection
                {
                mCommunicationConnection(); 

                }
                break;
            case 4 :
                // InternalDeviceLexer.g:1:86: ComputationDeviceType
                {
                mComputationDeviceType(); 

                }
                break;
            case 5 :
                // InternalDeviceLexer.g:1:108: ProcessorArchitecture
                {
                mProcessorArchitecture(); 

                }
                break;
            case 6 :
                // InternalDeviceLexer.g:1:130: AttributeKind
                {
                mAttributeKind(); 

                }
                break;
            case 7 :
                // InternalDeviceLexer.g:1:144: SelectionKind
                {
                mSelectionKind(); 

                }
                break;
            case 8 :
                // InternalDeviceLexer.g:1:158: DeviceType
                {
                mDeviceType(); 

                }
                break;
            case 9 :
                // InternalDeviceLexer.g:1:169: MaximumKind
                {
                mMaximumKind(); 

                }
                break;
            case 10 :
                // InternalDeviceLexer.g:1:181: MinimumKind
                {
                mMinimumKind(); 

                }
                break;
            case 11 :
                // InternalDeviceLexer.g:1:193: Capability
                {
                mCapability(); 

                }
                break;
            case 12 :
                // InternalDeviceLexer.g:1:204: Properties
                {
                mProperties(); 

                }
                break;
            case 13 :
                // InternalDeviceLexer.g:1:215: Interface
                {
                mInterface(); 

                }
                break;
            case 14 :
                // InternalDeviceLexer.g:1:225: Ethernet
                {
                mEthernet(); 

                }
                break;
            case 15 :
                // InternalDeviceLexer.g:1:234: Address
                {
                mAddress(); 

                }
                break;
            case 16 :
                // InternalDeviceLexer.g:1:242: Value
                {
                mValue(); 

                }
                break;
            case 17 :
                // InternalDeviceLexer.g:1:248: Linux
                {
                mLinux(); 

                }
                break;
            case 18 :
                // InternalDeviceLexer.g:1:254: MacOS
                {
                mMacOS(); 

                }
                break;
            case 19 :
                // InternalDeviceLexer.g:1:260: Kind
                {
                mKind(); 

                }
                break;
            case 20 :
                // InternalDeviceLexer.g:1:265: Name
                {
                mName(); 

                }
                break;
            case 21 :
                // InternalDeviceLexer.g:1:270: Type
                {
                mType(); 

                }
                break;
            case 22 :
                // InternalDeviceLexer.g:1:275: Wlan
                {
                mWlan(); 

                }
                break;
            case 23 :
                // InternalDeviceLexer.g:1:280: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 24 :
                // InternalDeviceLexer.g:1:292: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 25 :
                // InternalDeviceLexer.g:1:304: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 26 :
                // InternalDeviceLexer.g:1:317: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 27 :
                // InternalDeviceLexer.g:1:329: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 28 :
                // InternalDeviceLexer.g:1:341: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 29 :
                // InternalDeviceLexer.g:1:356: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalDeviceLexer.g:1:372: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalDeviceLexer.g:1:380: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalDeviceLexer.g:1:389: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalDeviceLexer.g:1:401: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalDeviceLexer.g:1:417: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalDeviceLexer.g:1:425: RULE_ANY_OTHER
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
            return "66:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\22\42\1\70\1\67\1\42\2\67\1\uffff\1\37\1\uffff\3\37\2\uffff\2\42\1\uffff\24\42\3\uffff\1\133\1\uffff\1\42\2\67\4\uffff\27\42\1\133\1\uffff\1\42\1\67\25\42\1\u008d\1\u008e\1\133\1\42\1\67\12\42\1\u009b\6\42\1\u00a2\6\uffff\1\u008d\12\42\1\uffff\5\42\2\uffff\16\42\1\u00c0\15\42\1\u00ce\1\uffff\14\42\1\u00db\1\uffff\14\42\1\uffff\4\42\1\uffff\3\42\1\uffff\1\u00ef\1\u00f0\1\uffff\7\42\2\uffff\1\42\1\u00f9\4\42\1\u00fe\1\42\1\uffff\4\42\1\uffff\42\42\1\u0126\3\42\2\uffff\4\42\1\u012e\1\uffff\1\42\1\uffff\1\u0130\1\uffff";
    static final String DFA24_eofS =
        "\u0131\uffff";
    static final String DFA24_minS =
        "\1\0\1\162\1\70\1\141\1\157\1\162\2\145\1\141\1\162\1\156\1\164\1\144\1\141\2\151\1\141\1\162\1\154\1\60\1\56\1\141\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\164\1\uffff\1\66\1\155\1\160\1\155\1\157\1\154\1\166\1\143\1\156\1\157\1\164\1\150\1\144\1\154\2\156\1\155\1\160\1\165\1\141\3\uffff\1\60\1\uffff\1\154\2\60\4\uffff\1\66\1\162\1\120\1\155\1\141\1\160\1\143\1\145\2\151\1\117\1\151\1\160\2\145\1\162\2\165\1\144\3\145\1\156\1\60\1\uffff\1\163\1\60\1\64\1\151\1\162\1\165\1\142\1\165\1\145\2\143\1\155\1\123\1\155\1\145\2\162\2\145\1\170\3\72\2\60\1\55\1\145\1\55\1\120\1\142\1\157\1\156\1\151\1\164\1\163\1\164\1\145\1\165\1\60\1\165\1\162\1\146\1\156\1\163\1\72\1\60\6\uffff\1\60\1\162\1\165\1\143\1\151\1\154\1\141\1\163\1\151\1\124\1\155\1\uffff\1\155\1\164\1\141\1\145\1\163\2\uffff\1\157\1\164\1\145\1\143\1\151\1\164\2\157\1\171\2\113\1\151\1\143\1\164\1\60\1\143\1\145\1\163\1\141\1\164\1\151\1\162\1\156\1\160\2\151\2\145\1\60\1\uffff\1\145\1\113\1\163\1\164\1\171\1\157\1\101\1\113\1\145\2\156\1\163\1\60\1\uffff\1\163\1\151\1\157\1\151\1\72\1\156\1\162\1\151\1\72\2\144\1\72\1\uffff\1\163\1\156\1\162\1\157\1\uffff\1\104\1\143\1\156\1\uffff\2\60\1\uffff\1\157\1\144\1\101\1\156\1\145\1\150\1\144\2\uffff\1\162\1\60\1\162\1\103\1\166\1\151\1\60\1\101\1\uffff\1\143\1\157\1\151\1\164\1\uffff\1\162\1\150\1\156\1\143\1\145\1\143\1\151\1\156\1\145\1\143\1\150\1\164\1\145\1\124\1\164\1\151\1\145\1\143\1\171\1\165\1\164\1\143\1\164\1\160\1\162\1\145\1\164\1\151\2\145\1\143\1\165\1\157\1\72\1\60\1\164\1\162\1\156\2\uffff\1\165\1\145\1\72\1\162\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\164\1\70\2\157\1\162\2\145\1\151\1\162\1\156\1\164\1\144\1\141\2\151\1\141\1\171\1\154\1\71\1\145\1\141\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\155\1\164\1\uffff\1\66\1\155\1\160\1\155\1\157\1\154\1\166\1\170\1\156\1\157\1\164\1\150\1\144\1\154\2\156\1\155\1\160\1\165\1\141\3\uffff\1\71\1\uffff\1\154\2\71\4\uffff\1\66\1\162\1\120\1\155\1\141\1\160\1\143\1\145\2\151\1\117\1\151\1\160\2\145\1\162\2\165\1\144\3\145\1\156\1\71\1\uffff\1\163\1\71\1\64\1\151\1\162\1\165\1\142\1\165\1\145\2\143\1\155\1\123\1\155\1\145\2\162\2\145\1\170\3\72\2\172\1\55\1\145\1\71\1\120\1\142\1\157\1\156\1\151\1\164\1\163\1\164\1\145\1\165\1\172\1\165\1\162\1\146\1\156\1\163\1\72\1\172\6\uffff\1\172\1\162\1\165\1\143\1\151\1\154\1\141\1\163\1\151\1\124\1\155\1\uffff\1\155\1\164\1\141\1\145\1\163\2\uffff\1\157\1\164\1\145\1\143\1\151\1\164\2\157\1\171\2\113\1\151\1\143\1\164\1\172\1\143\1\145\1\163\1\141\1\164\1\151\1\162\1\156\1\160\2\151\2\145\1\172\1\uffff\1\145\1\113\1\163\1\164\1\171\1\157\1\101\1\113\1\145\2\156\1\163\1\172\1\uffff\1\163\1\151\1\157\1\151\1\72\1\156\1\162\1\151\1\72\2\144\1\72\1\uffff\1\163\1\156\1\162\1\157\1\uffff\1\104\1\143\1\156\1\uffff\2\172\1\uffff\1\157\1\144\1\101\1\156\1\145\1\150\1\144\2\uffff\1\162\1\172\1\162\1\103\1\166\1\151\1\172\1\101\1\uffff\1\143\1\157\1\151\1\164\1\uffff\1\162\1\150\1\156\1\143\1\145\1\143\1\151\1\156\1\145\1\143\1\150\1\164\1\145\1\124\1\164\1\151\1\145\1\143\1\171\1\165\1\164\1\143\1\164\1\160\1\162\1\145\1\164\1\151\2\145\1\143\1\165\1\157\1\72\1\172\1\164\1\162\1\156\2\uffff\1\165\1\145\1\72\1\162\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\30\uffff\1\35\1\uffff\1\36\3\uffff\1\42\1\43\2\uffff\1\36\24\uffff\1\33\1\27\1\30\1\uffff\1\32\3\uffff\1\35\1\40\1\41\1\42\30\uffff\1\37\56\uffff\1\23\1\24\1\25\1\31\1\26\1\34\13\uffff\1\22\5\uffff\1\20\1\21\35\uffff\1\17\15\uffff\1\16\14\uffff\1\15\4\uffff\1\13\3\uffff\1\10\2\uffff\1\14\7\uffff\1\11\1\12\10\uffff\1\6\4\uffff\1\7\46\uffff\1\4\1\5\5\uffff\1\3\1\uffff\1\2\1\uffff\1\1";
    static final String DFA24_specialS =
        "\1\1\32\uffff\1\2\1\0\u0114\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\30\3\37\1\34\5\37\1\23\1\37\1\35\1\24\2\26\7\27\7\37\1\1\1\32\1\4\1\7\1\13\6\32\1\16\1\10\2\32\1\5\2\32\1\6\3\32\1\22\1\2\2\32\3\37\1\31\1\32\1\37\1\14\1\32\1\3\2\32\1\25\2\32\1\12\1\32\1\17\2\32\1\20\1\32\1\11\3\32\1\21\1\32\1\15\4\32\uff85\37",
            "\1\40\1\uffff\1\41",
            "\1\43",
            "\1\45\15\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\7\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\6\uffff\1\64",
            "\1\66",
            "\12\67",
            "\1\73\1\uffff\12\72\10\uffff\1\71\2\uffff\1\73\34\uffff\1\71\2\uffff\1\73",
            "\1\74",
            "\1\73\1\uffff\12\75\13\uffff\1\73\37\uffff\1\73",
            "\1\73\1\uffff\12\76\13\uffff\1\73\37\uffff\1\73",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\100",
            "\0\100",
            "\1\101",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\24\uffff\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\12\132",
            "",
            "\1\134",
            "\12\135",
            "\12\76",
            "",
            "",
            "",
            "",
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
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\165",
            "",
            "\1\166",
            "\12\167",
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
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008f",
            "\1\u0090",
            "\1\u008f\2\uffff\12\76",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u012f",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
            return "1:1: Tokens : ( Arm64ProcessorArchitecture | X86ProcessorArchitecture | CommunicationConnection | ComputationDeviceType | ProcessorArchitecture | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | Interface | Ethernet | Address | Value | Linux | MacOS | Kind | Name | Type | Wlan | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_28 = input.LA(1);

                        s = -1;
                        if ( ((LA24_28>='\u0000' && LA24_28<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='A') ) {s = 1;}

                        else if ( (LA24_0=='X') ) {s = 2;}

                        else if ( (LA24_0=='c') ) {s = 3;}

                        else if ( (LA24_0=='C') ) {s = 4;}

                        else if ( (LA24_0=='P') ) {s = 5;}

                        else if ( (LA24_0=='S') ) {s = 6;}

                        else if ( (LA24_0=='D') ) {s = 7;}

                        else if ( (LA24_0=='M') ) {s = 8;}

                        else if ( (LA24_0=='p') ) {s = 9;}

                        else if ( (LA24_0=='i') ) {s = 10;}

                        else if ( (LA24_0=='E') ) {s = 11;}

                        else if ( (LA24_0=='a') ) {s = 12;}

                        else if ( (LA24_0=='v') ) {s = 13;}

                        else if ( (LA24_0=='L') ) {s = 14;}

                        else if ( (LA24_0=='k') ) {s = 15;}

                        else if ( (LA24_0=='n') ) {s = 16;}

                        else if ( (LA24_0=='t') ) {s = 17;}

                        else if ( (LA24_0=='W') ) {s = 18;}

                        else if ( (LA24_0=='-') ) {s = 19;}

                        else if ( (LA24_0=='0') ) {s = 20;}

                        else if ( (LA24_0=='f') ) {s = 21;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 22;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 23;}

                        else if ( (LA24_0=='#') ) {s = 24;}

                        else if ( (LA24_0=='^') ) {s = 25;}

                        else if ( (LA24_0=='B'||(LA24_0>='F' && LA24_0<='K')||(LA24_0>='N' && LA24_0<='O')||(LA24_0>='Q' && LA24_0<='R')||(LA24_0>='T' && LA24_0<='V')||(LA24_0>='Y' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||(LA24_0>='d' && LA24_0<='e')||(LA24_0>='g' && LA24_0<='h')||LA24_0=='j'||(LA24_0>='l' && LA24_0<='m')||LA24_0=='o'||(LA24_0>='q' && LA24_0<='s')||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 26;}

                        else if ( (LA24_0=='\"') ) {s = 27;}

                        else if ( (LA24_0=='\'') ) {s = 28;}

                        else if ( (LA24_0=='/') ) {s = 29;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 30;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=',')||LA24_0=='.'||(LA24_0>=':' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_27 = input.LA(1);

                        s = -1;
                        if ( ((LA24_27>='\u0000' && LA24_27<='\uFFFF')) ) {s = 64;}

                        else s = 31;

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