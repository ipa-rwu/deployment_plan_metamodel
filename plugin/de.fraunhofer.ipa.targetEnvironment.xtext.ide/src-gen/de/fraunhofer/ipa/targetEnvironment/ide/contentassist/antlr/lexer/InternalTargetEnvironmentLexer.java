package de.fraunhofer.ipa.targetEnvironment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetEnvironmentLexer extends Lexer {
    public static final int RULE_DAY=41;
    public static final int Configuration=12;
    public static final int Address=27;
    public static final int RULE_DATE_TIME=46;
    public static final int RULE_BOOLEAN=38;
    public static final int AttributeKind=17;
    public static final int RULE_YEAR=43;
    public static final int RefDeviceType=16;
    public static final int Name=32;
    public static final int RULE_MIN_SEC=45;
    public static final int Kind=31;
    public static final int ConnectDevice=13;
    public static final int RULE_DEDENT=49;
    public static final int Capability=22;
    public static final int RULE_ID=50;
    public static final int ConfigConnection=11;
    public static final int RULE_DIGIT=36;
    public static final int SelectionKind=18;
    public static final int Arm64ProcessorArchitecture=4;
    public static final int DeviceType=19;
    public static final int TargetDeployEnviroment=7;
    public static final int Linux=29;
    public static final int RULE_INT=51;
    public static final int Ethernet=26;
    public static final int Value=28;
    public static final int RULE_ML_COMMENT=53;
    public static final int MacOS=30;
    public static final int RefConnectionProperty=9;
    public static final int ProcessorArchitecture=10;
    public static final int RULE_STRING=52;
    public static final int Wlan=34;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=47;
    public static final int CommunicationConnection=6;
    public static final int HyphenMinus=35;
    public static final int RULE_DOUBLE=40;
    public static final int RULE_DECINT=39;
    public static final int MinimumKind=21;
    public static final int EOF=-1;
    public static final int RULE_INDENT=48;
    public static final int RULE_HOUR=44;
    public static final int RefDevice=24;
    public static final int RULE_WS=54;
    public static final int MaximumKind=20;
    public static final int RULE_ANY_OTHER=55;
    public static final int ComputationDeviceType=8;
    public static final int RefConnection=15;
    public static final int Type=33;
    public static final int X86ProcessorArchitecture=5;
    public static final int RULE_MONTH=42;
    public static final int RULE_BINARY=37;
    public static final int IncludeDevice=14;
    public static final int Interface=25;

    // delegates
    // delegators

    public InternalTargetEnvironmentLexer() {;} 
    public InternalTargetEnvironmentLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTargetEnvironmentLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTargetEnvironmentLexer.g"; }

    // $ANTLR start "Arm64ProcessorArchitecture"
    public final void mArm64ProcessorArchitecture() throws RecognitionException {
        try {
            int _type = Arm64ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:14:28: ( 'Arm64ProcessorArchitecture' )
            // InternalTargetEnvironmentLexer.g:14:30: 'Arm64ProcessorArchitecture'
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
            // InternalTargetEnvironmentLexer.g:16:26: ( 'X86ProcessorArchitecture' )
            // InternalTargetEnvironmentLexer.g:16:28: 'X86ProcessorArchitecture'
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
            // InternalTargetEnvironmentLexer.g:18:25: ( 'communicationConnection:' )
            // InternalTargetEnvironmentLexer.g:18:27: 'communicationConnection:'
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

    // $ANTLR start "TargetDeployEnviroment"
    public final void mTargetDeployEnviroment() throws RecognitionException {
        try {
            int _type = TargetDeployEnviroment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:20:24: ( 'TargetDeployEnviroment:' )
            // InternalTargetEnvironmentLexer.g:20:26: 'TargetDeployEnviroment:'
            {
            match("TargetDeployEnviroment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TargetDeployEnviroment"

    // $ANTLR start "ComputationDeviceType"
    public final void mComputationDeviceType() throws RecognitionException {
        try {
            int _type = ComputationDeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:22:23: ( 'ComputationDeviceType:' )
            // InternalTargetEnvironmentLexer.g:22:25: 'ComputationDeviceType:'
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

    // $ANTLR start "RefConnectionProperty"
    public final void mRefConnectionProperty() throws RecognitionException {
        try {
            int _type = RefConnectionProperty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:24:23: ( 'refConnectionProperty:' )
            // InternalTargetEnvironmentLexer.g:24:25: 'refConnectionProperty:'
            {
            match("refConnectionProperty:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefConnectionProperty"

    // $ANTLR start "ProcessorArchitecture"
    public final void mProcessorArchitecture() throws RecognitionException {
        try {
            int _type = ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:26:23: ( 'ProcessorArchitecture' )
            // InternalTargetEnvironmentLexer.g:26:25: 'ProcessorArchitecture'
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

    // $ANTLR start "ConfigConnection"
    public final void mConfigConnection() throws RecognitionException {
        try {
            int _type = ConfigConnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:28:18: ( 'configConnection:' )
            // InternalTargetEnvironmentLexer.g:28:20: 'configConnection:'
            {
            match("configConnection:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ConfigConnection"

    // $ANTLR start "Configuration"
    public final void mConfiguration() throws RecognitionException {
        try {
            int _type = Configuration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:30:15: ( 'configuration:' )
            // InternalTargetEnvironmentLexer.g:30:17: 'configuration:'
            {
            match("configuration:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Configuration"

    // $ANTLR start "ConnectDevice"
    public final void mConnectDevice() throws RecognitionException {
        try {
            int _type = ConnectDevice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:32:15: ( 'connectDevice:' )
            // InternalTargetEnvironmentLexer.g:32:17: 'connectDevice:'
            {
            match("connectDevice:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ConnectDevice"

    // $ANTLR start "IncludeDevice"
    public final void mIncludeDevice() throws RecognitionException {
        try {
            int _type = IncludeDevice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:34:15: ( 'includeDevice:' )
            // InternalTargetEnvironmentLexer.g:34:17: 'includeDevice:'
            {
            match("includeDevice:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IncludeDevice"

    // $ANTLR start "RefConnection"
    public final void mRefConnection() throws RecognitionException {
        try {
            int _type = RefConnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:36:15: ( 'refConnection:' )
            // InternalTargetEnvironmentLexer.g:36:17: 'refConnection:'
            {
            match("refConnection:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefConnection"

    // $ANTLR start "RefDeviceType"
    public final void mRefDeviceType() throws RecognitionException {
        try {
            int _type = RefDeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:38:15: ( 'refDeviceType:' )
            // InternalTargetEnvironmentLexer.g:38:17: 'refDeviceType:'
            {
            match("refDeviceType:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefDeviceType"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:40:15: ( 'AttributeKind' )
            // InternalTargetEnvironmentLexer.g:40:17: 'AttributeKind'
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
            // InternalTargetEnvironmentLexer.g:42:15: ( 'SelectionKind' )
            // InternalTargetEnvironmentLexer.g:42:17: 'SelectionKind'
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
            // InternalTargetEnvironmentLexer.g:44:12: ( 'DeviceType:' )
            // InternalTargetEnvironmentLexer.g:44:14: 'DeviceType:'
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
            // InternalTargetEnvironmentLexer.g:46:13: ( 'MaximumKind' )
            // InternalTargetEnvironmentLexer.g:46:15: 'MaximumKind'
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
            // InternalTargetEnvironmentLexer.g:48:13: ( 'MinimumKind' )
            // InternalTargetEnvironmentLexer.g:48:15: 'MinimumKind'
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
            // InternalTargetEnvironmentLexer.g:50:12: ( 'capability:' )
            // InternalTargetEnvironmentLexer.g:50:14: 'capability:'
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
            // InternalTargetEnvironmentLexer.g:52:12: ( 'properties:' )
            // InternalTargetEnvironmentLexer.g:52:14: 'properties:'
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

    // $ANTLR start "RefDevice"
    public final void mRefDevice() throws RecognitionException {
        try {
            int _type = RefDevice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:54:11: ( 'refDevice:' )
            // InternalTargetEnvironmentLexer.g:54:13: 'refDevice:'
            {
            match("refDevice:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefDevice"

    // $ANTLR start "Interface"
    public final void mInterface() throws RecognitionException {
        try {
            int _type = Interface;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:56:11: ( 'interface' )
            // InternalTargetEnvironmentLexer.g:56:13: 'interface'
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
            // InternalTargetEnvironmentLexer.g:58:10: ( 'Ethernet' )
            // InternalTargetEnvironmentLexer.g:58:12: 'Ethernet'
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
            // InternalTargetEnvironmentLexer.g:60:9: ( 'address' )
            // InternalTargetEnvironmentLexer.g:60:11: 'address'
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
            // InternalTargetEnvironmentLexer.g:62:7: ( 'value:' )
            // InternalTargetEnvironmentLexer.g:62:9: 'value:'
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
            // InternalTargetEnvironmentLexer.g:64:7: ( 'Linux' )
            // InternalTargetEnvironmentLexer.g:64:9: 'Linux'
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
            // InternalTargetEnvironmentLexer.g:66:7: ( 'MacOS' )
            // InternalTargetEnvironmentLexer.g:66:9: 'MacOS'
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
            // InternalTargetEnvironmentLexer.g:68:6: ( 'kind:' )
            // InternalTargetEnvironmentLexer.g:68:8: 'kind:'
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
            // InternalTargetEnvironmentLexer.g:70:6: ( 'name:' )
            // InternalTargetEnvironmentLexer.g:70:8: 'name:'
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
            // InternalTargetEnvironmentLexer.g:72:6: ( 'type:' )
            // InternalTargetEnvironmentLexer.g:72:8: 'type:'
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
            // InternalTargetEnvironmentLexer.g:74:6: ( 'Wlan' )
            // InternalTargetEnvironmentLexer.g:74:8: 'Wlan'
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
            // InternalTargetEnvironmentLexer.g:76:13: ( '-' )
            // InternalTargetEnvironmentLexer.g:76:15: '-'
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
            // InternalTargetEnvironmentLexer.g:78:21: ( '0' .. '9' )
            // InternalTargetEnvironmentLexer.g:78:23: '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:80:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalTargetEnvironmentLexer.g:80:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalTargetEnvironmentLexer.g:80:15: ( '0b' | '0B' )
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
                    // InternalTargetEnvironmentLexer.g:80:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:80:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalTargetEnvironmentLexer.g:80:27: ( '0' | '1' )+
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
            	    // InternalTargetEnvironmentLexer.g:
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
            // InternalTargetEnvironmentLexer.g:82:14: ( ( 'true' | 'false' ) )
            // InternalTargetEnvironmentLexer.g:82:16: ( 'true' | 'false' )
            {
            // InternalTargetEnvironmentLexer.g:82:16: ( 'true' | 'false' )
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
                    // InternalTargetEnvironmentLexer.g:82:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:82:24: 'false'
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
            // InternalTargetEnvironmentLexer.g:84:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalTargetEnvironmentLexer.g:84:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalTargetEnvironmentLexer.g:84:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:84:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalTargetEnvironmentLexer.g:84:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTargetEnvironmentLexer.g:84:31: RULE_DECINT
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
                    // InternalTargetEnvironmentLexer.g:84:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalTargetEnvironmentLexer.g:84:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTargetEnvironmentLexer.g:84:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalTargetEnvironmentLexer.g:84:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalTargetEnvironmentLexer.g:84:49: RULE_DIGIT
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

                    // InternalTargetEnvironmentLexer.g:84:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTargetEnvironmentLexer.g:
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
            // InternalTargetEnvironmentLexer.g:86:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalTargetEnvironmentLexer.g:86:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalTargetEnvironmentLexer.g:86:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalTargetEnvironmentLexer.g:86:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:86:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalTargetEnvironmentLexer.g:86:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTargetEnvironmentLexer.g:86:29: RULE_DIGIT
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
                    // InternalTargetEnvironmentLexer.g:86:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalTargetEnvironmentLexer.g:86:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalTargetEnvironmentLexer.g:86:54: RULE_DIGIT
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
            // InternalTargetEnvironmentLexer.g:88:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalTargetEnvironmentLexer.g:88:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalTargetEnvironmentLexer.g:88:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalTargetEnvironmentLexer.g:88:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:88:31: '1' .. '3' '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:90:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalTargetEnvironmentLexer.g:90:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalTargetEnvironmentLexer.g:90:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalTargetEnvironmentLexer.g:90:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:90:33: '1' '0' .. '2'
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
            // InternalTargetEnvironmentLexer.g:92:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalTargetEnvironmentLexer.g:92:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:94:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalTargetEnvironmentLexer.g:94:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalTargetEnvironmentLexer.g:94:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalTargetEnvironmentLexer.g:94:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:94:41: '2' '0' .. '3'
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
            // InternalTargetEnvironmentLexer.g:96:23: ( '0' .. '5' '0' .. '9' )
            // InternalTargetEnvironmentLexer.g:96:25: '0' .. '5' '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:98:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalTargetEnvironmentLexer.g:98:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalTargetEnvironmentLexer.g:100:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalTargetEnvironmentLexer.g:100:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalTargetEnvironmentLexer.g:100:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTargetEnvironmentLexer.g:100:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalTargetEnvironmentLexer.g:102:22: ()
            // InternalTargetEnvironmentLexer.g:102:24: 
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
            // InternalTargetEnvironmentLexer.g:104:22: ()
            // InternalTargetEnvironmentLexer.g:104:24: 
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
            // InternalTargetEnvironmentLexer.g:106:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTargetEnvironmentLexer.g:106:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTargetEnvironmentLexer.g:106:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:106:11: '^'
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

            // InternalTargetEnvironmentLexer.g:106:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetEnvironmentLexer.g:
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
            // InternalTargetEnvironmentLexer.g:108:10: ( ( '0' .. '9' )+ )
            // InternalTargetEnvironmentLexer.g:108:12: ( '0' .. '9' )+
            {
            // InternalTargetEnvironmentLexer.g:108:12: ( '0' .. '9' )+
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
            	    // InternalTargetEnvironmentLexer.g:108:13: '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:110:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTargetEnvironmentLexer.g:110:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTargetEnvironmentLexer.g:110:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTargetEnvironmentLexer.g:110:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTargetEnvironmentLexer.g:110:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTargetEnvironmentLexer.g:110:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTargetEnvironmentLexer.g:110:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTargetEnvironmentLexer.g:110:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTargetEnvironmentLexer.g:110:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTargetEnvironmentLexer.g:110:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTargetEnvironmentLexer.g:110:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTargetEnvironmentLexer.g:112:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTargetEnvironmentLexer.g:112:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTargetEnvironmentLexer.g:112:24: ( options {greedy=false; } : . )*
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
            	    // InternalTargetEnvironmentLexer.g:112:52: .
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
            // InternalTargetEnvironmentLexer.g:114:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTargetEnvironmentLexer.g:114:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTargetEnvironmentLexer.g:114:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalTargetEnvironmentLexer.g:
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
            // InternalTargetEnvironmentLexer.g:116:16: ( . )
            // InternalTargetEnvironmentLexer.g:116:18: .
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
        // InternalTargetEnvironmentLexer.g:1:8: ( Arm64ProcessorArchitecture | X86ProcessorArchitecture | CommunicationConnection | TargetDeployEnviroment | ComputationDeviceType | RefConnectionProperty | ProcessorArchitecture | ConfigConnection | Configuration | ConnectDevice | IncludeDevice | RefConnection | RefDeviceType | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | RefDevice | Interface | Ethernet | Address | Value | Linux | MacOS | Kind | Name | Type | Wlan | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=44;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalTargetEnvironmentLexer.g:1:10: Arm64ProcessorArchitecture
                {
                mArm64ProcessorArchitecture(); 

                }
                break;
            case 2 :
                // InternalTargetEnvironmentLexer.g:1:37: X86ProcessorArchitecture
                {
                mX86ProcessorArchitecture(); 

                }
                break;
            case 3 :
                // InternalTargetEnvironmentLexer.g:1:62: CommunicationConnection
                {
                mCommunicationConnection(); 

                }
                break;
            case 4 :
                // InternalTargetEnvironmentLexer.g:1:86: TargetDeployEnviroment
                {
                mTargetDeployEnviroment(); 

                }
                break;
            case 5 :
                // InternalTargetEnvironmentLexer.g:1:109: ComputationDeviceType
                {
                mComputationDeviceType(); 

                }
                break;
            case 6 :
                // InternalTargetEnvironmentLexer.g:1:131: RefConnectionProperty
                {
                mRefConnectionProperty(); 

                }
                break;
            case 7 :
                // InternalTargetEnvironmentLexer.g:1:153: ProcessorArchitecture
                {
                mProcessorArchitecture(); 

                }
                break;
            case 8 :
                // InternalTargetEnvironmentLexer.g:1:175: ConfigConnection
                {
                mConfigConnection(); 

                }
                break;
            case 9 :
                // InternalTargetEnvironmentLexer.g:1:192: Configuration
                {
                mConfiguration(); 

                }
                break;
            case 10 :
                // InternalTargetEnvironmentLexer.g:1:206: ConnectDevice
                {
                mConnectDevice(); 

                }
                break;
            case 11 :
                // InternalTargetEnvironmentLexer.g:1:220: IncludeDevice
                {
                mIncludeDevice(); 

                }
                break;
            case 12 :
                // InternalTargetEnvironmentLexer.g:1:234: RefConnection
                {
                mRefConnection(); 

                }
                break;
            case 13 :
                // InternalTargetEnvironmentLexer.g:1:248: RefDeviceType
                {
                mRefDeviceType(); 

                }
                break;
            case 14 :
                // InternalTargetEnvironmentLexer.g:1:262: AttributeKind
                {
                mAttributeKind(); 

                }
                break;
            case 15 :
                // InternalTargetEnvironmentLexer.g:1:276: SelectionKind
                {
                mSelectionKind(); 

                }
                break;
            case 16 :
                // InternalTargetEnvironmentLexer.g:1:290: DeviceType
                {
                mDeviceType(); 

                }
                break;
            case 17 :
                // InternalTargetEnvironmentLexer.g:1:301: MaximumKind
                {
                mMaximumKind(); 

                }
                break;
            case 18 :
                // InternalTargetEnvironmentLexer.g:1:313: MinimumKind
                {
                mMinimumKind(); 

                }
                break;
            case 19 :
                // InternalTargetEnvironmentLexer.g:1:325: Capability
                {
                mCapability(); 

                }
                break;
            case 20 :
                // InternalTargetEnvironmentLexer.g:1:336: Properties
                {
                mProperties(); 

                }
                break;
            case 21 :
                // InternalTargetEnvironmentLexer.g:1:347: RefDevice
                {
                mRefDevice(); 

                }
                break;
            case 22 :
                // InternalTargetEnvironmentLexer.g:1:357: Interface
                {
                mInterface(); 

                }
                break;
            case 23 :
                // InternalTargetEnvironmentLexer.g:1:367: Ethernet
                {
                mEthernet(); 

                }
                break;
            case 24 :
                // InternalTargetEnvironmentLexer.g:1:376: Address
                {
                mAddress(); 

                }
                break;
            case 25 :
                // InternalTargetEnvironmentLexer.g:1:384: Value
                {
                mValue(); 

                }
                break;
            case 26 :
                // InternalTargetEnvironmentLexer.g:1:390: Linux
                {
                mLinux(); 

                }
                break;
            case 27 :
                // InternalTargetEnvironmentLexer.g:1:396: MacOS
                {
                mMacOS(); 

                }
                break;
            case 28 :
                // InternalTargetEnvironmentLexer.g:1:402: Kind
                {
                mKind(); 

                }
                break;
            case 29 :
                // InternalTargetEnvironmentLexer.g:1:407: Name
                {
                mName(); 

                }
                break;
            case 30 :
                // InternalTargetEnvironmentLexer.g:1:412: Type
                {
                mType(); 

                }
                break;
            case 31 :
                // InternalTargetEnvironmentLexer.g:1:417: Wlan
                {
                mWlan(); 

                }
                break;
            case 32 :
                // InternalTargetEnvironmentLexer.g:1:422: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 33 :
                // InternalTargetEnvironmentLexer.g:1:434: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 34 :
                // InternalTargetEnvironmentLexer.g:1:446: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 35 :
                // InternalTargetEnvironmentLexer.g:1:459: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 36 :
                // InternalTargetEnvironmentLexer.g:1:471: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 37 :
                // InternalTargetEnvironmentLexer.g:1:483: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 38 :
                // InternalTargetEnvironmentLexer.g:1:498: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalTargetEnvironmentLexer.g:1:514: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // InternalTargetEnvironmentLexer.g:1:522: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalTargetEnvironmentLexer.g:1:531: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalTargetEnvironmentLexer.g:1:543: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalTargetEnvironmentLexer.g:1:559: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalTargetEnvironmentLexer.g:1:567: RULE_ANY_OTHER
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
            return "84:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\24\44\1\74\1\73\1\44\2\73\1\uffff\1\41\1\uffff\3\41\2\uffff\2\44\1\uffff\26\44\3\uffff\1\143\1\uffff\1\44\2\73\4\uffff\33\44\1\143\1\uffff\1\44\1\73\33\44\1\u00a1\1\u00a2\1\143\1\44\1\73\21\44\1\u00b6\5\44\1\u00bc\6\uffff\1\u00a1\21\44\1\uffff\4\44\2\uffff\25\44\1\u00e8\24\44\1\u00fd\1\uffff\16\44\1\u010d\5\44\1\uffff\14\44\1\uffff\2\44\1\uffff\14\44\1\uffff\7\44\1\uffff\1\u0134\1\u0135\1\uffff\16\44\2\uffff\1\44\1\u0145\13\44\1\u0152\1\44\1\uffff\3\44\2\uffff\3\44\2\uffff\1\44\2\uffff\23\44\1\uffff\37\44\1\u018d\4\44\3\uffff\3\44\1\uffff\1\44\1\u0196\1\uffff\1\44\1\uffff\1\u0198\1\uffff";
    static final String DFA24_eofS =
        "\u0199\uffff";
    static final String DFA24_minS =
        "\1\0\1\162\1\70\2\141\1\157\1\145\1\162\1\156\2\145\1\141\1\162\1\164\1\144\1\141\2\151\1\141\1\162\1\154\1\60\1\56\1\141\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\164\1\uffff\1\66\1\155\1\160\1\162\1\155\1\146\1\157\1\143\1\154\1\166\1\143\1\156\1\157\1\150\1\144\1\154\2\156\1\155\1\160\1\165\1\141\3\uffff\1\60\1\uffff\1\154\2\60\4\uffff\1\66\1\162\1\120\1\155\1\146\1\141\1\147\1\160\1\103\1\143\1\154\2\145\2\151\1\117\1\151\1\160\1\145\1\162\2\165\1\144\3\145\1\156\1\60\1\uffff\1\163\1\60\1\64\1\151\1\162\1\165\1\151\1\145\1\142\1\145\1\165\1\157\2\145\1\165\1\162\2\143\1\155\1\123\1\155\1\145\1\162\2\145\1\170\3\72\2\60\1\55\1\145\1\55\1\120\1\142\1\157\1\156\1\147\1\143\1\151\2\164\1\156\1\166\1\163\1\144\1\146\1\164\1\145\1\165\1\60\1\165\1\162\1\156\1\163\1\72\1\60\6\uffff\1\60\1\162\1\165\1\143\1\151\1\103\1\164\1\154\1\104\1\141\1\156\1\151\1\163\1\145\1\141\1\151\1\124\1\155\1\uffff\1\155\1\164\1\145\1\163\2\uffff\1\157\1\164\1\145\1\143\1\157\1\162\1\104\1\151\1\145\1\164\1\145\1\143\1\157\1\104\1\143\1\157\1\171\2\113\1\151\1\164\1\60\1\143\1\145\1\163\1\141\1\156\1\141\1\145\1\164\1\160\1\151\1\143\1\145\1\162\2\145\1\156\1\160\2\151\1\145\1\60\1\uffff\1\145\1\113\1\163\1\164\1\156\1\164\1\166\1\171\1\154\1\157\1\164\1\72\1\101\1\166\1\60\1\113\1\145\2\156\1\163\1\uffff\1\163\1\151\1\157\1\151\1\145\2\151\1\72\1\157\1\156\1\151\1\171\1\uffff\1\162\1\151\1\uffff\1\151\1\72\2\144\1\72\1\163\1\156\1\162\1\157\1\143\1\157\1\143\1\uffff\1\171\1\104\1\157\1\160\2\143\1\156\1\uffff\2\60\1\uffff\1\157\1\144\1\101\1\156\1\164\1\156\1\145\1\105\1\145\1\156\1\145\1\150\1\145\1\144\2\uffff\1\162\1\60\1\162\1\103\1\151\2\72\1\156\1\166\2\72\1\151\1\72\1\60\1\101\1\uffff\1\143\2\157\2\uffff\1\166\1\151\1\162\2\uffff\1\164\2\uffff\1\162\1\150\2\156\1\151\1\143\1\157\1\145\1\143\1\151\1\156\1\72\1\162\1\145\1\160\1\143\1\150\1\164\1\145\1\uffff\1\157\1\124\1\145\1\164\1\151\1\145\1\143\1\155\1\171\1\162\1\165\1\164\1\143\1\164\1\145\1\160\1\164\1\162\1\145\1\164\1\151\1\156\1\145\1\171\1\145\1\143\1\165\1\157\1\164\2\72\1\60\1\164\1\162\1\156\1\72\3\uffff\1\165\1\145\1\72\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\164\1\70\1\157\1\141\1\157\1\145\1\162\1\156\2\145\1\151\1\162\1\164\1\144\1\141\2\151\1\141\1\171\1\154\1\71\1\145\1\141\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\155\1\164\1\uffff\1\66\1\156\1\160\1\162\1\155\1\146\1\157\1\164\1\154\1\166\1\170\1\156\1\157\1\150\1\144\1\154\2\156\1\155\1\160\1\165\1\141\3\uffff\1\71\1\uffff\1\154\2\71\4\uffff\1\66\1\162\1\120\1\155\1\156\1\141\1\147\1\160\1\104\1\143\1\154\2\145\2\151\1\117\1\151\1\160\1\145\1\162\2\165\1\144\3\145\1\156\1\71\1\uffff\1\163\1\71\1\64\1\151\1\162\1\165\1\151\1\145\1\142\1\145\1\165\1\157\2\145\1\165\1\162\2\143\1\155\1\123\1\155\1\145\1\162\2\145\1\170\3\72\2\172\1\55\1\145\1\71\1\120\1\142\1\157\1\156\1\147\1\143\1\151\2\164\1\156\1\166\1\163\1\144\1\146\1\164\1\145\1\165\1\172\1\165\1\162\1\156\1\163\1\72\1\172\6\uffff\1\172\1\162\1\165\1\143\1\151\1\165\1\164\1\154\1\104\1\141\1\156\1\151\1\163\1\145\1\141\1\151\1\124\1\155\1\uffff\1\155\1\164\1\145\1\163\2\uffff\1\157\1\164\1\145\1\143\1\157\1\162\1\104\1\151\1\145\1\164\1\145\1\143\1\157\1\104\1\143\1\157\1\171\2\113\1\151\1\164\1\172\1\143\1\145\1\163\1\141\1\156\1\141\1\145\1\164\1\160\1\151\1\143\1\145\1\162\2\145\1\156\1\160\2\151\1\145\1\172\1\uffff\1\145\1\113\1\163\1\164\1\156\1\164\1\166\1\171\1\154\1\157\1\164\1\124\1\101\1\166\1\172\1\113\1\145\2\156\1\163\1\uffff\1\163\1\151\1\157\1\151\1\145\2\151\1\72\1\157\1\156\1\151\1\171\1\uffff\1\162\1\151\1\uffff\1\151\1\72\2\144\1\72\1\163\1\156\1\162\1\157\1\143\1\157\1\143\1\uffff\1\171\1\104\1\157\1\160\2\143\1\156\1\uffff\2\172\1\uffff\1\157\1\144\1\101\1\156\1\164\1\156\1\145\1\105\1\145\1\156\1\145\1\150\1\145\1\144\2\uffff\1\162\1\172\1\162\1\103\1\151\2\72\1\156\1\166\1\120\1\72\1\151\1\72\1\172\1\101\1\uffff\1\143\2\157\2\uffff\1\166\1\151\1\162\2\uffff\1\164\2\uffff\1\162\1\150\2\156\1\151\1\143\1\157\1\145\1\143\1\151\1\156\1\72\1\162\1\145\1\160\1\143\1\150\1\164\1\145\1\uffff\1\157\1\124\1\145\1\164\1\151\1\145\1\143\1\155\1\171\1\162\1\165\1\164\1\143\1\164\1\145\1\160\1\164\1\162\1\145\1\164\1\151\1\156\1\145\1\171\1\145\1\143\1\165\1\157\1\164\2\72\1\172\1\164\1\162\1\156\1\72\3\uffff\1\165\1\145\1\72\1\uffff\1\162\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\32\uffff\1\46\1\uffff\1\47\3\uffff\1\53\1\54\2\uffff\1\47\26\uffff\1\44\1\40\1\41\1\uffff\1\43\3\uffff\1\46\1\51\1\52\1\53\34\uffff\1\50\72\uffff\1\34\1\35\1\36\1\42\1\37\1\45\22\uffff\1\33\4\uffff\1\31\1\32\53\uffff\1\30\24\uffff\1\27\14\uffff\1\25\2\uffff\1\26\14\uffff\1\23\7\uffff\1\20\2\uffff\1\24\16\uffff\1\21\1\22\17\uffff\1\16\3\uffff\1\11\1\12\3\uffff\1\14\1\15\1\uffff\1\13\1\17\23\uffff\1\10\44\uffff\1\5\1\6\1\7\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\uffff\1\1";
    static final String DFA24_specialS =
        "\1\0\34\uffff\1\1\1\2\u017a\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\1\32\3\41\1\36\5\41\1\25\1\41\1\37\1\26\2\30\7\31\7\41\1\1\1\34\1\5\1\12\1\15\6\34\1\20\1\13\2\34\1\7\2\34\1\11\1\4\2\34\1\24\1\2\2\34\3\41\1\33\1\34\1\41\1\16\1\34\1\3\2\34\1\27\2\34\1\10\1\34\1\21\2\34\1\22\1\34\1\14\1\34\1\6\1\34\1\23\1\34\1\17\4\34\uff85\41",
            "\1\42\1\uffff\1\43",
            "\1\45",
            "\1\47\15\uffff\1\46",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\7\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\6\uffff\1\70",
            "\1\72",
            "\12\73",
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
            "\1\112\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\20\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\126\24\uffff\1\125",
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
            "",
            "",
            "",
            "\12\142",
            "",
            "\1\144",
            "\12\145",
            "\12\102",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\7\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157\1\160",
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
            "\1\u0082",
            "\12\u0083",
            "",
            "\1\u0084",
            "\12\u0085",
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
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a3\2\uffff\12\102",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\61\uffff\1\u00c2",
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
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
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
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\1\u00fb",
            "\1\u00fc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
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
            "\1\u010a\31\uffff\1\u0109",
            "\1\u010b",
            "\1\u010c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
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
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "",
            "\1\u0144",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014e\25\uffff\1\u014d",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "",
            "\1\u015a",
            "",
            "",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
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
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0197",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( Arm64ProcessorArchitecture | X86ProcessorArchitecture | CommunicationConnection | TargetDeployEnviroment | ComputationDeviceType | RefConnectionProperty | ProcessorArchitecture | ConfigConnection | Configuration | ConnectDevice | IncludeDevice | RefConnection | RefDeviceType | AttributeKind | SelectionKind | DeviceType | MaximumKind | MinimumKind | Capability | Properties | RefDevice | Interface | Ethernet | Address | Value | Linux | MacOS | Kind | Name | Type | Wlan | HyphenMinus | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='A') ) {s = 1;}

                        else if ( (LA24_0=='X') ) {s = 2;}

                        else if ( (LA24_0=='c') ) {s = 3;}

                        else if ( (LA24_0=='T') ) {s = 4;}

                        else if ( (LA24_0=='C') ) {s = 5;}

                        else if ( (LA24_0=='r') ) {s = 6;}

                        else if ( (LA24_0=='P') ) {s = 7;}

                        else if ( (LA24_0=='i') ) {s = 8;}

                        else if ( (LA24_0=='S') ) {s = 9;}

                        else if ( (LA24_0=='D') ) {s = 10;}

                        else if ( (LA24_0=='M') ) {s = 11;}

                        else if ( (LA24_0=='p') ) {s = 12;}

                        else if ( (LA24_0=='E') ) {s = 13;}

                        else if ( (LA24_0=='a') ) {s = 14;}

                        else if ( (LA24_0=='v') ) {s = 15;}

                        else if ( (LA24_0=='L') ) {s = 16;}

                        else if ( (LA24_0=='k') ) {s = 17;}

                        else if ( (LA24_0=='n') ) {s = 18;}

                        else if ( (LA24_0=='t') ) {s = 19;}

                        else if ( (LA24_0=='W') ) {s = 20;}

                        else if ( (LA24_0=='-') ) {s = 21;}

                        else if ( (LA24_0=='0') ) {s = 22;}

                        else if ( (LA24_0=='f') ) {s = 23;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 24;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 25;}

                        else if ( (LA24_0=='#') ) {s = 26;}

                        else if ( (LA24_0=='^') ) {s = 27;}

                        else if ( (LA24_0=='B'||(LA24_0>='F' && LA24_0<='K')||(LA24_0>='N' && LA24_0<='O')||(LA24_0>='Q' && LA24_0<='R')||(LA24_0>='U' && LA24_0<='V')||(LA24_0>='Y' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||(LA24_0>='d' && LA24_0<='e')||(LA24_0>='g' && LA24_0<='h')||LA24_0=='j'||(LA24_0>='l' && LA24_0<='m')||LA24_0=='o'||LA24_0=='q'||LA24_0=='s'||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 28;}

                        else if ( (LA24_0=='\"') ) {s = 29;}

                        else if ( (LA24_0=='\'') ) {s = 30;}

                        else if ( (LA24_0=='/') ) {s = 31;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 32;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=',')||LA24_0=='.'||(LA24_0>=':' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_29 = input.LA(1);

                        s = -1;
                        if ( ((LA24_29>='\u0000' && LA24_29<='\uFFFF')) ) {s = 68;}

                        else s = 33;

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