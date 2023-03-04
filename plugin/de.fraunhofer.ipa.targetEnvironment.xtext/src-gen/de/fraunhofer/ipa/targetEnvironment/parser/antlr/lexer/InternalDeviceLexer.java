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
    public static final int RULE_DAY=35;
    public static final int Address=23;
    public static final int RULE_DATE_TIME=40;
    public static final int RULE_BOOLEAN=32;
    public static final int AttributeKind=14;
    public static final int RULE_YEAR=37;
    public static final int Name=26;
    public static final int RULE_MIN_SEC=39;
    public static final int WlanCommunicationType=10;
    public static final int Kind=25;
    public static final int RULE_DEDENT=43;
    public static final int LinuxOpertingSystem=11;
    public static final int Capability=20;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=30;
    public static final int SelectionKind=15;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=16;
    public static final int RULE_INT=45;
    public static final int Value=24;
    public static final int RULE_ML_COMMENT=47;
    public static final int OperatingSystem=13;
    public static final int ProcessorArchitecture=9;
    public static final int RULE_STRING=46;
    public static final int Properties=21;
    public static final int RULE_SL_COMMENT=41;
    public static final int CommunicationConnection=7;
    public static final int HyphenMinus=28;
    public static final int RULE_DOUBLE=34;
    public static final int ResouceType=19;
    public static final int RightCurlyBracket=29;
    public static final int RULE_DECINT=33;
    public static final int MinimumKind=18;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int RULE_HOUR=38;
    public static final int EthernetCommunicationType=5;
    public static final int RULE_WS=48;
    public static final int MaximumKind=17;
    public static final int RULE_ANY_OTHER=49;
    public static final int ComputationDeviceType=8;
    public static final int CommunicationType=12;
    public static final int Type=27;
    public static final int X86ProcessorArchitecture=6;
    public static final int RULE_MONTH=36;
    public static final int RULE_BINARY=31;
    public static final int Interface=22;

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

    // $ANTLR start "EthernetCommunicationType"
    public final void mEthernetCommunicationType() throws RecognitionException {
        try {
            int _type = EthernetCommunicationType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:16:27: ( 'EthernetCommunicationType' )
            // InternalDeviceLexer.g:16:29: 'EthernetCommunicationType'
            {
            match("EthernetCommunicationType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EthernetCommunicationType"

    // $ANTLR start "X86ProcessorArchitecture"
    public final void mX86ProcessorArchitecture() throws RecognitionException {
        try {
            int _type = X86ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:18:26: ( 'X86ProcessorArchitecture' )
            // InternalDeviceLexer.g:18:28: 'X86ProcessorArchitecture'
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
            // InternalDeviceLexer.g:20:25: ( 'communicationConnection:' )
            // InternalDeviceLexer.g:20:27: 'communicationConnection:'
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
            // InternalDeviceLexer.g:22:23: ( 'ComputationDeviceType:' )
            // InternalDeviceLexer.g:22:25: 'ComputationDeviceType:'
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
            // InternalDeviceLexer.g:24:23: ( 'processorArchitecture:' )
            // InternalDeviceLexer.g:24:25: 'processorArchitecture:'
            {
            match("processorArchitecture:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ProcessorArchitecture"

    // $ANTLR start "WlanCommunicationType"
    public final void mWlanCommunicationType() throws RecognitionException {
        try {
            int _type = WlanCommunicationType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:26:23: ( 'WlanCommunicationType' )
            // InternalDeviceLexer.g:26:25: 'WlanCommunicationType'
            {
            match("WlanCommunicationType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WlanCommunicationType"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:28:21: ( 'LinuxOpertingSystem' )
            // InternalDeviceLexer.g:28:23: 'LinuxOpertingSystem'
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

    // $ANTLR start "CommunicationType"
    public final void mCommunicationType() throws RecognitionException {
        try {
            int _type = CommunicationType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:30:19: ( 'CommunicationType' )
            // InternalDeviceLexer.g:30:21: 'CommunicationType'
            {
            match("CommunicationType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommunicationType"

    // $ANTLR start "OperatingSystem"
    public final void mOperatingSystem() throws RecognitionException {
        try {
            int _type = OperatingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:32:17: ( 'operatingSystem:' )
            // InternalDeviceLexer.g:32:19: 'operatingSystem:'
            {
            match("operatingSystem:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OperatingSystem"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:34:15: ( 'AttributeKind' )
            // InternalDeviceLexer.g:34:17: 'AttributeKind'
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
            // InternalDeviceLexer.g:36:15: ( 'SelectionKind' )
            // InternalDeviceLexer.g:36:17: 'SelectionKind'
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
            // InternalDeviceLexer.g:38:12: ( 'DeviceType:' )
            // InternalDeviceLexer.g:38:14: 'DeviceType:'
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
            // InternalDeviceLexer.g:40:13: ( 'MaximumKind' )
            // InternalDeviceLexer.g:40:15: 'MaximumKind'
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
            // InternalDeviceLexer.g:42:13: ( 'MinimumKind' )
            // InternalDeviceLexer.g:42:15: 'MinimumKind'
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

    // $ANTLR start "ResouceType"
    public final void mResouceType() throws RecognitionException {
        try {
            int _type = ResouceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:44:13: ( 'ResouceType' )
            // InternalDeviceLexer.g:44:15: 'ResouceType'
            {
            match("ResouceType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ResouceType"

    // $ANTLR start "Capability"
    public final void mCapability() throws RecognitionException {
        try {
            int _type = Capability;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:46:12: ( 'capability:' )
            // InternalDeviceLexer.g:46:14: 'capability:'
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
            // InternalDeviceLexer.g:48:12: ( 'properties:' )
            // InternalDeviceLexer.g:48:14: 'properties:'
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
            // InternalDeviceLexer.g:50:11: ( 'interface' )
            // InternalDeviceLexer.g:50:13: 'interface'
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

    // $ANTLR start "Address"
    public final void mAddress() throws RecognitionException {
        try {
            int _type = Address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:52:9: ( 'address' )
            // InternalDeviceLexer.g:52:11: 'address'
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
            // InternalDeviceLexer.g:54:7: ( 'value:' )
            // InternalDeviceLexer.g:54:9: 'value:'
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
            // InternalDeviceLexer.g:56:6: ( 'kind:' )
            // InternalDeviceLexer.g:56:8: 'kind:'
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
            // InternalDeviceLexer.g:58:6: ( 'name:' )
            // InternalDeviceLexer.g:58:8: 'name:'
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
            // InternalDeviceLexer.g:60:6: ( 'type:' )
            // InternalDeviceLexer.g:60:8: 'type:'
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
            // InternalDeviceLexer.g:62:13: ( '-' )
            // InternalDeviceLexer.g:62:15: '-'
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

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:64:19: ( '}' )
            // InternalDeviceLexer.g:64:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalDeviceLexer.g:66:21: ( '0' .. '9' )
            // InternalDeviceLexer.g:66:23: '0' .. '9'
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
            // InternalDeviceLexer.g:68:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalDeviceLexer.g:68:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalDeviceLexer.g:68:15: ( '0b' | '0B' )
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
                    // InternalDeviceLexer.g:68:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:68:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalDeviceLexer.g:68:27: ( '0' | '1' )+
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
            // InternalDeviceLexer.g:70:14: ( ( 'true' | 'false' ) )
            // InternalDeviceLexer.g:70:16: ( 'true' | 'false' )
            {
            // InternalDeviceLexer.g:70:16: ( 'true' | 'false' )
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
                    // InternalDeviceLexer.g:70:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:70:24: 'false'
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
            // InternalDeviceLexer.g:72:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalDeviceLexer.g:72:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalDeviceLexer.g:72:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDeviceLexer.g:72:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalDeviceLexer.g:72:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:72:31: RULE_DECINT
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
                    // InternalDeviceLexer.g:72:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalDeviceLexer.g:72:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDeviceLexer.g:72:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalDeviceLexer.g:72:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalDeviceLexer.g:72:49: RULE_DIGIT
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

                    // InternalDeviceLexer.g:72:73: ( '-' | '+' )?
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
            // InternalDeviceLexer.g:74:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:74:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:74:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalDeviceLexer.g:74:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:74:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalDeviceLexer.g:74:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:74:29: RULE_DIGIT
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
                    // InternalDeviceLexer.g:74:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalDeviceLexer.g:74:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDeviceLexer.g:74:54: RULE_DIGIT
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
            // InternalDeviceLexer.g:76:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalDeviceLexer.g:76:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalDeviceLexer.g:76:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalDeviceLexer.g:76:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:76:31: '1' .. '3' '0' .. '9'
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
            // InternalDeviceLexer.g:78:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalDeviceLexer.g:78:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalDeviceLexer.g:78:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalDeviceLexer.g:78:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:78:33: '1' '0' .. '2'
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
            // InternalDeviceLexer.g:80:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalDeviceLexer.g:80:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalDeviceLexer.g:82:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalDeviceLexer.g:82:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalDeviceLexer.g:82:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalDeviceLexer.g:82:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:82:41: '2' '0' .. '3'
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
            // InternalDeviceLexer.g:84:23: ( '0' .. '5' '0' .. '9' )
            // InternalDeviceLexer.g:84:25: '0' .. '5' '0' .. '9'
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
            // InternalDeviceLexer.g:86:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalDeviceLexer.g:86:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalDeviceLexer.g:88:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDeviceLexer.g:88:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalDeviceLexer.g:88:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDeviceLexer.g:88:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalDeviceLexer.g:90:22: ()
            // InternalDeviceLexer.g:90:24: 
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
            // InternalDeviceLexer.g:92:22: ()
            // InternalDeviceLexer.g:92:24: 
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
            // InternalDeviceLexer.g:94:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceLexer.g:94:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceLexer.g:94:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDeviceLexer.g:94:11: '^'
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

            // InternalDeviceLexer.g:94:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalDeviceLexer.g:96:10: ( ( '0' .. '9' )+ )
            // InternalDeviceLexer.g:96:12: ( '0' .. '9' )+
            {
            // InternalDeviceLexer.g:96:12: ( '0' .. '9' )+
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
            	    // InternalDeviceLexer.g:96:13: '0' .. '9'
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
            // InternalDeviceLexer.g:98:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDeviceLexer.g:98:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDeviceLexer.g:98:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalDeviceLexer.g:98:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceLexer.g:98:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDeviceLexer.g:98:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDeviceLexer.g:98:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalDeviceLexer.g:98:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDeviceLexer.g:98:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDeviceLexer.g:100:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceLexer.g:100:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDeviceLexer.g:100:24: ( options {greedy=false; } : . )*
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
            	    // InternalDeviceLexer.g:100:52: .
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
            // InternalDeviceLexer.g:102:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalDeviceLexer.g:104:16: ( . )
            // InternalDeviceLexer.g:104:18: .
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
        // InternalDeviceLexer.g:1:8: ( Arm64ProcessorArchitecture | EthernetCommunicationType | X86ProcessorArchitecture | CommunicationConnection | ComputationDeviceType | ProcessorArchitecture | WlanCommunicationType | LinuxOpertingSystem | CommunicationType | OperatingSystem | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | ResouceType | Capability | Properties | Interface | Address | Value | Kind | Name | Type | HyphenMinus | RightCurlyBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=38;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalDeviceLexer.g:1:10: Arm64ProcessorArchitecture
                {
                mArm64ProcessorArchitecture(); 

                }
                break;
            case 2 :
                // InternalDeviceLexer.g:1:37: EthernetCommunicationType
                {
                mEthernetCommunicationType(); 

                }
                break;
            case 3 :
                // InternalDeviceLexer.g:1:63: X86ProcessorArchitecture
                {
                mX86ProcessorArchitecture(); 

                }
                break;
            case 4 :
                // InternalDeviceLexer.g:1:88: CommunicationConnection
                {
                mCommunicationConnection(); 

                }
                break;
            case 5 :
                // InternalDeviceLexer.g:1:112: ComputationDeviceType
                {
                mComputationDeviceType(); 

                }
                break;
            case 6 :
                // InternalDeviceLexer.g:1:134: ProcessorArchitecture
                {
                mProcessorArchitecture(); 

                }
                break;
            case 7 :
                // InternalDeviceLexer.g:1:156: WlanCommunicationType
                {
                mWlanCommunicationType(); 

                }
                break;
            case 8 :
                // InternalDeviceLexer.g:1:178: LinuxOpertingSystem
                {
                mLinuxOpertingSystem(); 

                }
                break;
            case 9 :
                // InternalDeviceLexer.g:1:198: CommunicationType
                {
                mCommunicationType(); 

                }
                break;
            case 10 :
                // InternalDeviceLexer.g:1:216: OperatingSystem
                {
                mOperatingSystem(); 

                }
                break;
            case 11 :
                // InternalDeviceLexer.g:1:232: AttributeKind
                {
                mAttributeKind(); 

                }
                break;
            case 12 :
                // InternalDeviceLexer.g:1:246: SelectionKind
                {
                mSelectionKind(); 

                }
                break;
            case 13 :
                // InternalDeviceLexer.g:1:260: DeviceType
                {
                mDeviceType(); 

                }
                break;
            case 14 :
                // InternalDeviceLexer.g:1:271: MaximumKind
                {
                mMaximumKind(); 

                }
                break;
            case 15 :
                // InternalDeviceLexer.g:1:283: MinimumKind
                {
                mMinimumKind(); 

                }
                break;
            case 16 :
                // InternalDeviceLexer.g:1:295: ResouceType
                {
                mResouceType(); 

                }
                break;
            case 17 :
                // InternalDeviceLexer.g:1:307: Capability
                {
                mCapability(); 

                }
                break;
            case 18 :
                // InternalDeviceLexer.g:1:318: Properties
                {
                mProperties(); 

                }
                break;
            case 19 :
                // InternalDeviceLexer.g:1:329: Interface
                {
                mInterface(); 

                }
                break;
            case 20 :
                // InternalDeviceLexer.g:1:339: Address
                {
                mAddress(); 

                }
                break;
            case 21 :
                // InternalDeviceLexer.g:1:347: Value
                {
                mValue(); 

                }
                break;
            case 22 :
                // InternalDeviceLexer.g:1:353: Kind
                {
                mKind(); 

                }
                break;
            case 23 :
                // InternalDeviceLexer.g:1:358: Name
                {
                mName(); 

                }
                break;
            case 24 :
                // InternalDeviceLexer.g:1:363: Type
                {
                mType(); 

                }
                break;
            case 25 :
                // InternalDeviceLexer.g:1:368: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 26 :
                // InternalDeviceLexer.g:1:380: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 27 :
                // InternalDeviceLexer.g:1:398: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 28 :
                // InternalDeviceLexer.g:1:410: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 29 :
                // InternalDeviceLexer.g:1:423: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 30 :
                // InternalDeviceLexer.g:1:435: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 31 :
                // InternalDeviceLexer.g:1:447: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 32 :
                // InternalDeviceLexer.g:1:462: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalDeviceLexer.g:1:478: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalDeviceLexer.g:1:486: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalDeviceLexer.g:1:495: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalDeviceLexer.g:1:507: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalDeviceLexer.g:1:523: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalDeviceLexer.g:1:531: RULE_ANY_OTHER
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
            return "72:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\23\44\1\73\1\uffff\1\72\1\44\2\72\1\uffff\1\41\1\uffff\3\41\2\uffff\2\44\1\uffff\25\44\4\uffff\1\137\1\uffff\1\44\2\72\4\uffff\27\44\1\137\1\uffff\1\44\1\72\30\44\1\u0096\1\137\1\44\1\72\25\44\5\uffff\1\u0096\24\44\1\uffff\23\44\1\u00d5\23\44\1\uffff\22\44\1\u00fb\22\44\1\uffff\5\44\1\uffff\3\44\1\uffff\4\44\1\uffff\1\u011a\1\u011b\1\u011c\14\44\3\uffff\1\44\1\u012a\11\44\1\u0134\1\44\1\uffff\11\44\1\uffff\23\44\1\uffff\5\44\1\u0157\10\44\1\uffff\12\44\1\u016a\7\44\1\uffff\6\44\1\u0178\4\44\3\uffff\6\44\1\u0183\1\uffff\1\44\1\u0185\1\uffff\1\u0186\2\uffff";
    static final String DFA24_eofS =
        "\u0187\uffff";
    static final String DFA24_minS =
        "\1\0\1\162\1\164\1\70\1\141\1\157\1\162\1\154\1\151\1\160\2\145\1\141\1\145\1\156\1\144\1\141\1\151\1\141\1\162\1\60\1\uffff\1\56\1\141\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\164\1\uffff\1\150\1\66\1\155\1\160\1\155\1\157\1\141\1\156\1\145\1\154\1\166\1\170\1\156\1\163\1\164\1\144\1\154\1\156\1\155\1\160\1\165\4\uffff\1\60\1\uffff\1\154\2\60\4\uffff\1\66\1\162\1\145\1\120\1\155\1\141\1\155\1\143\1\156\1\165\1\162\1\145\3\151\1\157\1\145\1\162\1\165\1\144\3\145\1\60\1\uffff\1\163\1\60\1\64\1\151\2\162\1\165\1\142\2\165\2\145\1\103\1\170\1\141\2\143\2\155\1\165\1\162\2\145\3\72\1\60\1\55\1\145\1\55\1\120\1\142\1\156\1\157\1\156\1\151\1\164\1\156\1\163\1\162\1\157\1\117\2\164\1\145\2\165\1\143\1\146\1\163\1\72\5\uffff\1\60\1\162\1\165\1\145\1\143\1\151\1\154\1\141\1\151\1\163\1\164\1\155\1\160\2\151\1\124\2\155\1\145\1\141\1\163\1\uffff\1\157\2\164\1\145\1\143\1\151\1\164\1\143\1\157\1\151\1\155\1\145\1\156\1\157\1\171\2\113\1\124\1\143\1\60\1\143\1\145\1\103\1\163\1\141\1\164\1\151\1\141\1\162\1\145\1\165\1\162\1\147\1\156\1\160\2\151\1\171\1\145\1\uffff\1\145\1\113\1\157\1\163\1\164\1\171\1\157\1\164\1\101\1\163\1\156\1\164\1\123\1\113\1\145\2\156\1\160\1\60\1\163\1\151\1\155\1\157\1\151\1\72\1\156\1\151\1\162\1\72\2\151\1\171\1\151\1\72\2\144\1\145\1\uffff\1\163\1\156\1\155\1\162\1\157\1\uffff\1\104\1\157\1\143\1\uffff\1\143\1\156\1\163\1\156\1\uffff\3\60\1\157\1\144\1\165\1\101\1\156\1\145\1\156\1\150\1\141\1\147\1\164\1\144\3\uffff\1\162\1\60\1\156\1\162\1\103\1\166\1\124\1\151\1\164\1\123\1\145\1\60\1\101\1\uffff\1\151\1\143\1\157\1\151\1\171\1\164\1\151\1\171\1\155\1\uffff\1\162\1\143\1\150\1\156\1\143\1\160\1\145\1\157\1\163\1\72\1\143\1\141\1\151\1\156\2\145\1\143\1\156\1\164\1\uffff\1\150\2\164\1\145\1\124\1\60\1\164\1\124\1\145\2\151\1\145\1\143\1\171\1\uffff\1\165\1\171\1\155\1\164\1\157\1\143\1\164\1\160\1\162\1\160\1\60\1\145\1\156\1\164\1\151\3\145\1\uffff\1\143\1\124\1\165\1\157\2\72\1\60\1\164\1\171\1\162\1\156\3\uffff\1\165\1\160\1\145\1\72\1\162\1\145\1\60\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA24_maxS =
        "\1\uffff\2\164\1\70\2\157\1\162\1\154\1\151\1\160\2\145\1\151\1\145\1\156\1\144\1\141\1\151\1\141\1\171\1\71\1\uffff\1\145\1\141\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\155\1\164\1\uffff\1\150\1\66\1\155\1\160\1\155\1\157\1\141\1\156\1\145\1\154\1\166\1\170\1\156\1\163\1\164\1\144\1\154\1\156\1\155\1\160\1\165\4\uffff\1\71\1\uffff\1\154\2\71\4\uffff\1\66\1\162\1\145\1\120\1\155\1\141\2\160\1\156\1\165\1\162\1\145\3\151\1\157\1\145\1\162\1\165\1\144\3\145\1\71\1\uffff\1\163\1\71\1\64\1\151\2\162\1\165\1\142\2\165\2\145\1\103\1\170\1\141\2\143\2\155\1\165\1\162\2\145\3\72\1\172\1\55\1\145\1\71\1\120\1\142\1\156\1\157\1\156\1\151\1\164\1\156\1\163\1\162\1\157\1\117\2\164\1\145\2\165\1\143\1\146\1\163\1\72\5\uffff\1\172\1\162\1\165\1\145\1\143\1\151\1\154\1\141\1\151\1\163\1\164\1\155\1\160\2\151\1\124\2\155\1\145\1\141\1\163\1\uffff\1\157\2\164\1\145\1\143\1\151\1\164\1\143\1\157\1\151\1\155\1\145\1\156\1\157\1\171\2\113\1\124\1\143\1\172\1\143\1\145\1\103\1\163\1\141\1\164\1\151\1\141\1\162\1\145\1\165\1\162\1\147\1\156\1\160\2\151\1\171\1\145\1\uffff\1\145\1\113\1\157\1\163\1\164\1\171\1\157\1\164\1\101\1\163\1\156\1\164\1\123\1\113\1\145\2\156\1\160\1\172\1\163\1\151\1\155\1\157\1\151\1\72\1\156\1\151\1\162\1\72\2\151\1\171\1\151\1\72\2\144\1\145\1\uffff\1\163\1\156\1\155\1\162\1\157\1\uffff\1\104\1\157\1\143\1\uffff\1\143\1\156\1\163\1\156\1\uffff\3\172\1\157\1\144\1\165\1\101\1\156\1\145\1\156\1\150\1\141\1\147\1\164\1\144\3\uffff\1\162\1\172\1\156\1\162\1\103\1\166\1\124\1\151\1\164\1\123\1\145\1\172\1\101\1\uffff\1\151\1\143\1\157\1\151\1\171\1\164\1\151\1\171\1\155\1\uffff\1\162\1\143\1\150\1\156\1\143\1\160\1\145\1\157\1\163\1\72\1\143\1\141\1\151\1\156\2\145\1\143\1\156\1\164\1\uffff\1\150\2\164\1\145\1\124\1\172\1\164\1\124\1\145\2\151\1\145\1\143\1\171\1\uffff\1\165\1\171\1\155\1\164\1\157\1\143\1\164\1\160\1\162\1\160\1\172\1\145\1\156\1\164\1\151\3\145\1\uffff\1\143\1\124\1\165\1\157\2\72\1\172\1\164\1\171\1\162\1\156\3\uffff\1\165\1\160\1\145\1\72\1\162\1\145\1\172\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA24_acceptS =
        "\25\uffff\1\32\4\uffff\1\40\1\uffff\1\41\3\uffff\1\45\1\46\2\uffff\1\41\25\uffff\1\36\1\31\1\32\1\33\1\uffff\1\35\3\uffff\1\40\1\43\1\44\1\45\30\uffff\1\42\63\uffff\1\26\1\27\1\30\1\34\1\37\25\uffff\1\25\47\uffff\1\24\45\uffff\1\23\5\uffff\1\21\3\uffff\1\22\4\uffff\1\15\17\uffff\1\16\1\17\1\20\15\uffff\1\13\11\uffff\1\14\23\uffff\1\12\16\uffff\1\11\22\uffff\1\10\13\uffff\1\5\1\6\1\7\7\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA24_specialS =
        "\1\1\34\uffff\1\0\1\2\u0168\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\1\32\3\41\1\36\5\41\1\24\1\41\1\37\1\26\2\30\7\31\7\41\1\1\1\34\1\5\1\13\1\2\6\34\1\10\1\14\4\34\1\15\1\12\3\34\1\7\1\3\2\34\3\41\1\33\1\34\1\41\1\17\1\34\1\4\2\34\1\27\2\34\1\16\1\34\1\21\2\34\1\22\1\11\1\6\3\34\1\23\1\34\1\20\4\34\2\41\1\25\uff82\41",
            "\1\42\1\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\50\15\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\6\uffff\1\70",
            "\12\72",
            "",
            "\1\77\1\uffff\12\76\10\uffff\1\75\2\uffff\1\77\34\uffff\1\75\2\uffff\1\77",
            "\1\100",
            "\1\77\1\uffff\12\101\13\uffff\1\77\37\uffff\1\77",
            "\1\77\1\uffff\12\102\13\uffff\1\77\37\uffff\1\77",
            "",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\104",
            "\0\104",
            "\1\105",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
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
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\12\136",
            "",
            "\1\140",
            "\12\141",
            "\12\102",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\151\2\uffff\1\150",
            "\1\152\14\uffff\1\153",
            "\1\154",
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
            "\12\173",
            "",
            "\1\174",
            "\12\175",
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
            "\1\u0094",
            "\1\u0095",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0097",
            "\1\u0098",
            "\1\u0097\2\uffff\12\102",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
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
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ae",
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
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
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
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
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
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
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
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "",
            "\1\u0129",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0184",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
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
            return "1:1: Tokens : ( Arm64ProcessorArchitecture | EthernetCommunicationType | X86ProcessorArchitecture | CommunicationConnection | ComputationDeviceType | ProcessorArchitecture | WlanCommunicationType | LinuxOpertingSystem | CommunicationType | OperatingSystem | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | ResouceType | Capability | Properties | Interface | Address | Value | Kind | Name | Type | HyphenMinus | RightCurlyBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_29 = input.LA(1);

                        s = -1;
                        if ( ((LA24_29>='\u0000' && LA24_29<='\uFFFF')) ) {s = 68;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='A') ) {s = 1;}

                        else if ( (LA24_0=='E') ) {s = 2;}

                        else if ( (LA24_0=='X') ) {s = 3;}

                        else if ( (LA24_0=='c') ) {s = 4;}

                        else if ( (LA24_0=='C') ) {s = 5;}

                        else if ( (LA24_0=='p') ) {s = 6;}

                        else if ( (LA24_0=='W') ) {s = 7;}

                        else if ( (LA24_0=='L') ) {s = 8;}

                        else if ( (LA24_0=='o') ) {s = 9;}

                        else if ( (LA24_0=='S') ) {s = 10;}

                        else if ( (LA24_0=='D') ) {s = 11;}

                        else if ( (LA24_0=='M') ) {s = 12;}

                        else if ( (LA24_0=='R') ) {s = 13;}

                        else if ( (LA24_0=='i') ) {s = 14;}

                        else if ( (LA24_0=='a') ) {s = 15;}

                        else if ( (LA24_0=='v') ) {s = 16;}

                        else if ( (LA24_0=='k') ) {s = 17;}

                        else if ( (LA24_0=='n') ) {s = 18;}

                        else if ( (LA24_0=='t') ) {s = 19;}

                        else if ( (LA24_0=='-') ) {s = 20;}

                        else if ( (LA24_0=='}') ) {s = 21;}

                        else if ( (LA24_0=='0') ) {s = 22;}

                        else if ( (LA24_0=='f') ) {s = 23;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 24;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 25;}

                        else if ( (LA24_0=='#') ) {s = 26;}

                        else if ( (LA24_0=='^') ) {s = 27;}

                        else if ( (LA24_0=='B'||(LA24_0>='F' && LA24_0<='K')||(LA24_0>='N' && LA24_0<='Q')||(LA24_0>='T' && LA24_0<='V')||(LA24_0>='Y' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||(LA24_0>='d' && LA24_0<='e')||(LA24_0>='g' && LA24_0<='h')||LA24_0=='j'||(LA24_0>='l' && LA24_0<='m')||(LA24_0>='q' && LA24_0<='s')||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 28;}

                        else if ( (LA24_0=='\"') ) {s = 29;}

                        else if ( (LA24_0=='\'') ) {s = 30;}

                        else if ( (LA24_0=='/') ) {s = 31;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 32;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=',')||LA24_0=='.'||(LA24_0>=':' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='|')||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_30 = input.LA(1);

                        s = -1;
                        if ( ((LA24_30>='\u0000' && LA24_30<='\uFFFF')) ) {s = 68;}

                        else s = 33;

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