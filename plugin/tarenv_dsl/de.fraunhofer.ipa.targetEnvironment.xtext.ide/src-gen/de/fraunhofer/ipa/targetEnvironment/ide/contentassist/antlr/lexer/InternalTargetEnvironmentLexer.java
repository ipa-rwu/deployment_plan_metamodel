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
    public static final int Configuration=11;
    public static final int AttributeKind=16;
    public static final int RefDeviceType=15;
    public static final int Name=38;
    public static final int Container=26;
    public static final int Debian=30;
    public static final int Kind=37;
    public static final int ConnectDevice=12;
    public static final int Ubuntu=31;
    public static final int RULE_DEDENT=49;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=50;
    public static final int Device=28;
    public static final int ConfigConnection=10;
    public static final int RULE_DIGIT=44;
    public static final int SelectionKind=17;
    public static final int TargetDeployEnviroment=4;
    public static final int Arm64=33;
    public static final int RULE_INT=51;
    public static final int ComputationDevice=9;
    public static final int Ethernet=27;
    public static final int Value=32;
    public static final int RULE_ML_COMMENT=53;
    public static final int RefConnectionProperty=5;
    public static final int ConfigDeviceProperty=6;
    public static final int Description=18;
    public static final int Processor=24;
    public static final int RULE_STRING=52;
    public static final int Focal=34;
    public static final int Wlan=40;
    public static final int Properties=21;
    public static final int RULE_SL_COMMENT=47;
    public static final int Os_name=29;
    public static final int HyphenMinus=43;
    public static final int RULE_DOUBLE=46;
    public static final int X86=42;
    public static final int RULE_DECINT=45;
    public static final int MinimumKind=20;
    public static final int EOF=-1;
    public static final int RULE_INDENT=48;
    public static final int Jammy=36;
    public static final int RefDevice=23;
    public static final int Usb=41;
    public static final int RULE_WS=54;
    public static final int MaximumKind=19;
    public static final int From=35;
    public static final int RULE_ANY_OTHER=55;
    public static final int RangeKind=25;
    public static final int Os_version=22;
    public static final int RefConnection=14;
    public static final int Type=39;
    public static final int MacOSOpertingSystem=8;
    public static final int IncludeDevice=13;

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

    // $ANTLR start "TargetDeployEnviroment"
    public final void mTargetDeployEnviroment() throws RecognitionException {
        try {
            int _type = TargetDeployEnviroment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:14:24: ( 'TargetDeployEnviroment:' )
            // InternalTargetEnvironmentLexer.g:14:26: 'TargetDeployEnviroment:'
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

    // $ANTLR start "RefConnectionProperty"
    public final void mRefConnectionProperty() throws RecognitionException {
        try {
            int _type = RefConnectionProperty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:16:23: ( 'refConnectionProperty:' )
            // InternalTargetEnvironmentLexer.g:16:25: 'refConnectionProperty:'
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

    // $ANTLR start "ConfigDeviceProperty"
    public final void mConfigDeviceProperty() throws RecognitionException {
        try {
            int _type = ConfigDeviceProperty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:18:22: ( 'configDeviceProperty:' )
            // InternalTargetEnvironmentLexer.g:18:24: 'configDeviceProperty:'
            {
            match("configDeviceProperty:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ConfigDeviceProperty"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:20:21: ( 'LinuxOpertingSystem' )
            // InternalTargetEnvironmentLexer.g:20:23: 'LinuxOpertingSystem'
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
            // InternalTargetEnvironmentLexer.g:22:21: ( 'MacOSOpertingSystem' )
            // InternalTargetEnvironmentLexer.g:22:23: 'MacOSOpertingSystem'
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

    // $ANTLR start "ComputationDevice"
    public final void mComputationDevice() throws RecognitionException {
        try {
            int _type = ComputationDevice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:24:19: ( 'computationDevice:' )
            // InternalTargetEnvironmentLexer.g:24:21: 'computationDevice:'
            {
            match("computationDevice:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComputationDevice"

    // $ANTLR start "ConfigConnection"
    public final void mConfigConnection() throws RecognitionException {
        try {
            int _type = ConfigConnection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:26:18: ( 'configConnection:' )
            // InternalTargetEnvironmentLexer.g:26:20: 'configConnection:'
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
            // InternalTargetEnvironmentLexer.g:28:15: ( 'configuration:' )
            // InternalTargetEnvironmentLexer.g:28:17: 'configuration:'
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
            // InternalTargetEnvironmentLexer.g:30:15: ( 'connectDevice:' )
            // InternalTargetEnvironmentLexer.g:30:17: 'connectDevice:'
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
            // InternalTargetEnvironmentLexer.g:32:15: ( 'includeDevice:' )
            // InternalTargetEnvironmentLexer.g:32:17: 'includeDevice:'
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
            // InternalTargetEnvironmentLexer.g:34:15: ( 'refConnection:' )
            // InternalTargetEnvironmentLexer.g:34:17: 'refConnection:'
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
            // InternalTargetEnvironmentLexer.g:36:15: ( 'refDeviceType:' )
            // InternalTargetEnvironmentLexer.g:36:17: 'refDeviceType:'
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
            // InternalTargetEnvironmentLexer.g:38:15: ( 'AttributeKind' )
            // InternalTargetEnvironmentLexer.g:38:17: 'AttributeKind'
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
            // InternalTargetEnvironmentLexer.g:40:15: ( 'SelectionKind' )
            // InternalTargetEnvironmentLexer.g:40:17: 'SelectionKind'
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
            // InternalTargetEnvironmentLexer.g:42:13: ( 'description:' )
            // InternalTargetEnvironmentLexer.g:42:15: 'description:'
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
            // InternalTargetEnvironmentLexer.g:44:13: ( 'MaximumKind' )
            // InternalTargetEnvironmentLexer.g:44:15: 'MaximumKind'
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
            // InternalTargetEnvironmentLexer.g:46:13: ( 'MinimumKind' )
            // InternalTargetEnvironmentLexer.g:46:15: 'MinimumKind'
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
            // InternalTargetEnvironmentLexer.g:48:12: ( 'properties:' )
            // InternalTargetEnvironmentLexer.g:48:14: 'properties:'
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

    // $ANTLR start "Os_version"
    public final void mOs_version() throws RecognitionException {
        try {
            int _type = Os_version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:50:12: ( 'os_version' )
            // InternalTargetEnvironmentLexer.g:50:14: 'os_version'
            {
            match("os_version");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Os_version"

    // $ANTLR start "RefDevice"
    public final void mRefDevice() throws RecognitionException {
        try {
            int _type = RefDevice;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:52:11: ( 'refDevice:' )
            // InternalTargetEnvironmentLexer.g:52:13: 'refDevice:'
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

    // $ANTLR start "Processor"
    public final void mProcessor() throws RecognitionException {
        try {
            int _type = Processor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:54:11: ( 'Processor' )
            // InternalTargetEnvironmentLexer.g:54:13: 'Processor'
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
            // InternalTargetEnvironmentLexer.g:56:11: ( 'RangeKind' )
            // InternalTargetEnvironmentLexer.g:56:13: 'RangeKind'
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
            // InternalTargetEnvironmentLexer.g:58:11: ( 'container' )
            // InternalTargetEnvironmentLexer.g:58:13: 'container'
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
            // InternalTargetEnvironmentLexer.g:60:10: ( 'Ethernet' )
            // InternalTargetEnvironmentLexer.g:60:12: 'Ethernet'
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

    // $ANTLR start "Device"
    public final void mDevice() throws RecognitionException {
        try {
            int _type = Device;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:62:8: ( 'device:' )
            // InternalTargetEnvironmentLexer.g:62:10: 'device:'
            {
            match("device:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Device"

    // $ANTLR start "Os_name"
    public final void mOs_name() throws RecognitionException {
        try {
            int _type = Os_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:64:9: ( 'os_name' )
            // InternalTargetEnvironmentLexer.g:64:11: 'os_name'
            {
            match("os_name");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Os_name"

    // $ANTLR start "Debian"
    public final void mDebian() throws RecognitionException {
        try {
            int _type = Debian;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:66:8: ( 'debian' )
            // InternalTargetEnvironmentLexer.g:66:10: 'debian'
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
            // InternalTargetEnvironmentLexer.g:68:8: ( 'ubuntu' )
            // InternalTargetEnvironmentLexer.g:68:10: 'ubuntu'
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
            // InternalTargetEnvironmentLexer.g:70:7: ( 'value:' )
            // InternalTargetEnvironmentLexer.g:70:9: 'value:'
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
            // InternalTargetEnvironmentLexer.g:72:7: ( 'arm64' )
            // InternalTargetEnvironmentLexer.g:72:9: 'arm64'
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
            // InternalTargetEnvironmentLexer.g:74:7: ( 'focal' )
            // InternalTargetEnvironmentLexer.g:74:9: 'focal'
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

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:76:6: ( 'from:' )
            // InternalTargetEnvironmentLexer.g:76:8: 'from:'
            {
            match("from:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Jammy"
    public final void mJammy() throws RecognitionException {
        try {
            int _type = Jammy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:78:7: ( 'jammy' )
            // InternalTargetEnvironmentLexer.g:78:9: 'jammy'
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
            // InternalTargetEnvironmentLexer.g:80:6: ( 'kind:' )
            // InternalTargetEnvironmentLexer.g:80:8: 'kind:'
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
            // InternalTargetEnvironmentLexer.g:82:6: ( 'name:' )
            // InternalTargetEnvironmentLexer.g:82:8: 'name:'
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
            // InternalTargetEnvironmentLexer.g:84:6: ( 'type:' )
            // InternalTargetEnvironmentLexer.g:84:8: 'type:'
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
            // InternalTargetEnvironmentLexer.g:86:6: ( 'Wlan' )
            // InternalTargetEnvironmentLexer.g:86:8: 'Wlan'
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

    // $ANTLR start "Usb"
    public final void mUsb() throws RecognitionException {
        try {
            int _type = Usb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:88:5: ( 'Usb' )
            // InternalTargetEnvironmentLexer.g:88:7: 'Usb'
            {
            match("Usb");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Usb"

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:90:5: ( 'x86' )
            // InternalTargetEnvironmentLexer.g:90:7: 'x86'
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
            // InternalTargetEnvironmentLexer.g:92:13: ( '-' )
            // InternalTargetEnvironmentLexer.g:92:15: '-'
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
            // InternalTargetEnvironmentLexer.g:94:21: ( '0' .. '9' )
            // InternalTargetEnvironmentLexer.g:94:23: '0' .. '9'
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
            // InternalTargetEnvironmentLexer.g:96:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalTargetEnvironmentLexer.g:96:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalTargetEnvironmentLexer.g:96:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')||LA3_0=='E'||LA3_0=='e') ) {
                alt3=1;
            }
            else if ( (LA3_0=='-') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:96:16: ( RULE_DIGIT )*
                    {
                    // InternalTargetEnvironmentLexer.g:96:16: ( RULE_DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:96:16: RULE_DIGIT
                          {
                          mRULE_DIGIT();

                          }
                          break;

                      default :
                          break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:96:28: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalTargetEnvironmentLexer.g:96:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:96:32: RULE_DIGIT
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

            // InternalTargetEnvironmentLexer.g:96:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:96:46: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalTargetEnvironmentLexer.g:96:50: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:96:50: RULE_DECINT
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
                    // InternalTargetEnvironmentLexer.g:96:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalTargetEnvironmentLexer.g:96:63: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTargetEnvironmentLexer.g:96:64: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalTargetEnvironmentLexer.g:96:68: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                              case 1 :
                                  // InternalTargetEnvironmentLexer.g:96:68: RULE_DIGIT
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

                    // InternalTargetEnvironmentLexer.g:96:92: ( '-' | '+' )?
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

                    // InternalTargetEnvironmentLexer.g:96:103: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:96:103: RULE_DIGIT
                          {
                          mRULE_DIGIT();

                          }
                          break;

                      default :
                          break loop8;
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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetEnvironmentLexer.g:98:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalTargetEnvironmentLexer.g:98:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalTargetEnvironmentLexer.g:98:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt12=1;
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
                alt12=2;
                }
                break;
            case '-':
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:98:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalTargetEnvironmentLexer.g:98:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalTargetEnvironmentLexer.g:98:29: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:98:29: RULE_DIGIT
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
                case 3 :
                    // InternalTargetEnvironmentLexer.g:98:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalTargetEnvironmentLexer.g:98:54: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                      case 1 :
                          // InternalTargetEnvironmentLexer.g:98:54: RULE_DIGIT
                          {
                          mRULE_DIGIT();

                          }
                          break;

                      default :
                          break loop11;
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
            // InternalTargetEnvironmentLexer.g:100:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalTargetEnvironmentLexer.g:100:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalTargetEnvironmentLexer.g:100:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
                  break loop13;
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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
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
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
              case 1 :
                  // InternalTargetEnvironmentLexer.g:108:13: '0' .. '9'
                  {
                  matchRange('0','9');

                  }
                  break;

              default :
                  if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetEnvironmentLexer.g:110:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalTargetEnvironmentLexer.g:110:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
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
                          break loop17;
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
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
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
                          break loop18;
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
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
              case 1 :
                  // InternalTargetEnvironmentLexer.g:112:52: .
                  {
                  matchAny();

                  }
                  break;

              default :
                  break loop20;
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
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
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
                  if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
        // InternalTargetEnvironmentLexer.g:1:8: ( TargetDeployEnviroment | RefConnectionProperty | ConfigDeviceProperty | LinuxOpertingSystem | MacOSOpertingSystem | ComputationDevice | ConfigConnection | Configuration | ConnectDevice | IncludeDevice | RefConnection | RefDeviceType | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Os_version | RefDevice | Processor | RangeKind | Container | Ethernet | Device | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=49;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalTargetEnvironmentLexer.g:1:10: TargetDeployEnviroment
                {
                mTargetDeployEnviroment();

                }
                break;
            case 2 :
                // InternalTargetEnvironmentLexer.g:1:33: RefConnectionProperty
                {
                mRefConnectionProperty();

                }
                break;
            case 3 :
                // InternalTargetEnvironmentLexer.g:1:55: ConfigDeviceProperty
                {
                mConfigDeviceProperty();

                }
                break;
            case 4 :
                // InternalTargetEnvironmentLexer.g:1:76: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 5 :
                // InternalTargetEnvironmentLexer.g:1:96: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 6 :
                // InternalTargetEnvironmentLexer.g:1:116: ComputationDevice
                {
                mComputationDevice();

                }
                break;
            case 7 :
                // InternalTargetEnvironmentLexer.g:1:134: ConfigConnection
                {
                mConfigConnection();

                }
                break;
            case 8 :
                // InternalTargetEnvironmentLexer.g:1:151: Configuration
                {
                mConfiguration();

                }
                break;
            case 9 :
                // InternalTargetEnvironmentLexer.g:1:165: ConnectDevice
                {
                mConnectDevice();

                }
                break;
            case 10 :
                // InternalTargetEnvironmentLexer.g:1:179: IncludeDevice
                {
                mIncludeDevice();

                }
                break;
            case 11 :
                // InternalTargetEnvironmentLexer.g:1:193: RefConnection
                {
                mRefConnection();

                }
                break;
            case 12 :
                // InternalTargetEnvironmentLexer.g:1:207: RefDeviceType
                {
                mRefDeviceType();

                }
                break;
            case 13 :
                // InternalTargetEnvironmentLexer.g:1:221: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 14 :
                // InternalTargetEnvironmentLexer.g:1:235: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 15 :
                // InternalTargetEnvironmentLexer.g:1:249: Description
                {
                mDescription();

                }
                break;
            case 16 :
                // InternalTargetEnvironmentLexer.g:1:261: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 17 :
                // InternalTargetEnvironmentLexer.g:1:273: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 18 :
                // InternalTargetEnvironmentLexer.g:1:285: Properties
                {
                mProperties();

                }
                break;
            case 19 :
                // InternalTargetEnvironmentLexer.g:1:296: Os_version
                {
                mOs_version();

                }
                break;
            case 20 :
                // InternalTargetEnvironmentLexer.g:1:307: RefDevice
                {
                mRefDevice();

                }
                break;
            case 21 :
                // InternalTargetEnvironmentLexer.g:1:317: Processor
                {
                mProcessor();

                }
                break;
            case 22 :
                // InternalTargetEnvironmentLexer.g:1:327: RangeKind
                {
                mRangeKind();

                }
                break;
            case 23 :
                // InternalTargetEnvironmentLexer.g:1:337: Container
                {
                mContainer();

                }
                break;
            case 24 :
                // InternalTargetEnvironmentLexer.g:1:347: Ethernet
                {
                mEthernet();

                }
                break;
            case 25 :
                // InternalTargetEnvironmentLexer.g:1:356: Device
                {
                mDevice();

                }
                break;
            case 26 :
                // InternalTargetEnvironmentLexer.g:1:363: Os_name
                {
                mOs_name();

                }
                break;
            case 27 :
                // InternalTargetEnvironmentLexer.g:1:371: Debian
                {
                mDebian();

                }
                break;
            case 28 :
                // InternalTargetEnvironmentLexer.g:1:378: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 29 :
                // InternalTargetEnvironmentLexer.g:1:385: Value
                {
                mValue();

                }
                break;
            case 30 :
                // InternalTargetEnvironmentLexer.g:1:391: Arm64
                {
                mArm64();

                }
                break;
            case 31 :
                // InternalTargetEnvironmentLexer.g:1:397: Focal
                {
                mFocal();

                }
                break;
            case 32 :
                // InternalTargetEnvironmentLexer.g:1:403: From
                {
                mFrom();

                }
                break;
            case 33 :
                // InternalTargetEnvironmentLexer.g:1:408: Jammy
                {
                mJammy();

                }
                break;
            case 34 :
                // InternalTargetEnvironmentLexer.g:1:414: Kind
                {
                mKind();

                }
                break;
            case 35 :
                // InternalTargetEnvironmentLexer.g:1:419: Name
                {
                mName();

                }
                break;
            case 36 :
                // InternalTargetEnvironmentLexer.g:1:424: Type
                {
                mType();

                }
                break;
            case 37 :
                // InternalTargetEnvironmentLexer.g:1:429: Wlan
                {
                mWlan();

                }
                break;
            case 38 :
                // InternalTargetEnvironmentLexer.g:1:434: Usb
                {
                mUsb();

                }
                break;
            case 39 :
                // InternalTargetEnvironmentLexer.g:1:438: X86
                {
                mX86();

                }
                break;
            case 40 :
                // InternalTargetEnvironmentLexer.g:1:442: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 41 :
                // InternalTargetEnvironmentLexer.g:1:454: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 42 :
                // InternalTargetEnvironmentLexer.g:1:466: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 43 :
                // InternalTargetEnvironmentLexer.g:1:478: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 44 :
                // InternalTargetEnvironmentLexer.g:1:494: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 45 :
                // InternalTargetEnvironmentLexer.g:1:502: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 46 :
                // InternalTargetEnvironmentLexer.g:1:511: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 47 :
                // InternalTargetEnvironmentLexer.g:1:523: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 48 :
                // InternalTargetEnvironmentLexer.g:1:539: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 49 :
                // InternalTargetEnvironmentLexer.g:1:547: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER();

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA9_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA9_eofS =
        "\10\uffff";
    static final String DFA9_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA9_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA9_specialS =
        "\10\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
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
            return "96:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\15\50\1\67\13\50\1\106\1\107\1\uffff\1\67\1\107\1\uffff\1\46\1\uffff\3\46\2\uffff\1\50\1\uffff\16\50\1\uffff\1\67\14\50\1\107\2\uffff\1\156\1\107\4\uffff\35\50\1\u0090\1\u0091\1\107\1\uffff\40\50\1\u00b2\2\uffff\31\50\1\u00cc\1\u00cd\1\uffff\1\u00ce\4\uffff\20\50\1\u00e1\6\50\1\u00e8\4\uffff\21\50\2\uffff\2\50\1\u00fc\3\50\1\uffff\23\50\1\uffff\2\50\1\u0115\7\50\1\u011e\13\50\1\u012a\1\u012b\1\uffff\3\50\1\uffff\4\50\1\uffff\12\50\1\u013d\2\uffff\12\50\1\u0148\1\u0149\4\50\2\uffff\12\50\2\uffff\3\50\1\uffff\13\50\1\u0167\1\u0168\2\50\2\uffff\2\50\2\uffff\3\50\3\uffff\21\50\1\uffff\6\50\1\uffff\5\50\1\u018c\1\u018d\3\50\2\uffff\2\50\1\uffff\1\50\2\uffff";
    static final String DFA22_eofS =
        "\u0194\uffff";
    static final String DFA22_minS =
        "\1\0\1\141\1\145\1\157\1\151\1\141\1\156\1\164\2\145\1\162\1\163\1\162\1\141\1\60\1\142\1\141\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\163\1\70\2\56\1\uffff\1\60\1\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\162\1\uffff\1\146\1\155\1\156\1\143\1\156\1\143\1\164\1\154\1\142\1\157\1\137\1\157\1\156\1\150\1\uffff\1\60\1\165\1\154\1\155\1\143\1\157\1\155\1\156\1\155\1\160\1\141\1\142\1\66\1\56\2\uffff\2\56\4\uffff\1\147\1\103\1\146\1\160\1\165\1\117\2\151\1\154\1\162\1\145\1\143\2\151\1\160\1\156\1\143\1\147\1\145\1\156\1\165\1\66\1\141\2\155\1\144\2\145\1\156\2\60\1\56\1\uffff\1\145\1\157\1\145\1\151\1\145\1\141\1\165\1\170\1\123\2\155\1\165\1\151\1\143\1\162\1\143\1\141\2\145\1\141\2\145\1\162\1\164\1\145\1\64\1\154\1\72\1\171\3\72\1\60\2\uffff\1\164\1\156\1\166\1\147\1\143\1\151\1\164\2\117\2\165\1\144\1\142\1\164\1\151\1\145\1\156\2\162\1\155\1\163\1\113\1\156\1\165\1\72\2\60\1\uffff\1\60\4\uffff\1\104\1\156\1\151\1\103\1\164\1\156\1\141\2\160\2\155\1\145\1\165\1\151\1\160\1\72\1\60\1\164\1\163\1\145\1\163\1\151\1\145\1\60\4\uffff\2\145\1\143\1\145\1\157\1\162\1\104\1\145\1\164\2\145\2\113\1\104\1\164\1\157\1\164\2\uffff\2\151\1\60\1\157\1\156\1\164\1\uffff\1\160\1\143\1\145\1\166\1\156\1\141\1\145\1\162\1\151\2\162\2\151\2\145\1\156\1\151\1\145\1\157\1\uffff\1\162\1\144\1\60\1\154\1\164\1\72\1\151\1\156\1\164\1\166\1\60\1\157\2\164\2\156\1\166\2\113\1\157\1\163\1\156\2\60\1\uffff\1\157\1\151\1\171\1\uffff\1\143\1\145\2\151\1\uffff\1\156\2\151\2\144\3\151\1\156\1\72\1\60\2\uffff\1\171\1\157\1\160\1\145\1\143\1\157\1\143\1\104\2\156\2\60\1\143\2\156\1\72\2\uffff\1\105\1\156\1\145\1\120\1\164\1\156\2\145\2\147\2\uffff\1\145\2\144\1\uffff\1\156\2\72\1\162\1\151\2\72\1\166\2\123\1\72\2\60\1\166\1\162\2\uffff\2\157\2\uffff\1\151\2\171\3\uffff\1\151\1\157\1\160\1\156\1\143\2\163\1\162\1\160\1\145\1\72\1\145\2\164\1\157\1\145\1\162\1\uffff\1\72\2\145\1\155\1\162\1\164\1\uffff\2\155\1\145\1\164\1\171\2\60\1\156\1\171\1\72\2\uffff\1\164\1\72\1\uffff\1\72\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\141\1\145\1\157\2\151\1\156\1\164\2\145\1\162\1\163\1\162\1\141\1\172\1\142\1\141\2\162\1\141\1\151\1\141\1\171\1\154\1\163\1\70\2\145\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\162\1\uffff\1\146\2\156\1\170\1\156\1\143\1\164\1\154\1\166\1\157\1\137\1\157\1\156\1\150\1\uffff\1\172\1\165\1\154\1\155\1\143\1\157\1\155\1\156\1\155\1\160\1\141\1\142\1\66\1\145\2\uffff\2\145\4\uffff\1\147\1\104\1\164\1\160\1\165\1\117\2\151\1\154\1\162\1\145\1\143\2\151\1\160\1\166\1\143\1\147\1\145\1\156\1\165\1\66\1\141\2\155\1\144\2\145\1\156\2\172\1\145\1\uffff\1\145\1\157\1\145\1\151\1\145\1\141\1\165\1\170\1\123\2\155\1\165\1\151\1\143\1\162\1\143\1\141\2\145\1\141\2\145\1\162\1\164\1\145\1\64\1\154\1\72\1\171\3\72\1\172\2\uffff\1\164\1\156\1\166\1\147\1\143\1\151\1\164\2\117\2\165\1\144\1\142\1\164\1\151\1\145\1\156\2\162\1\155\1\163\1\113\1\156\1\165\1\72\2\172\1\uffff\1\172\4\uffff\1\104\1\156\1\151\1\165\1\164\1\156\1\141\2\160\2\155\1\145\1\165\1\151\1\160\1\72\1\172\1\164\1\163\1\145\1\163\1\151\1\145\1\172\4\uffff\2\145\1\143\1\145\1\157\1\162\1\104\1\145\1\164\2\145\2\113\1\104\1\164\1\157\1\164\2\uffff\2\151\1\172\1\157\1\156\1\164\1\uffff\1\160\1\143\1\145\1\166\1\156\1\141\1\145\1\162\1\151\2\162\2\151\2\145\1\156\1\151\1\145\1\157\1\uffff\1\162\1\144\1\172\1\154\1\164\1\124\1\151\1\156\1\164\1\166\1\172\1\157\2\164\2\156\1\166\2\113\1\157\1\163\1\156\2\172\1\uffff\1\157\1\151\1\171\1\uffff\1\143\1\145\2\151\1\uffff\1\156\2\151\2\144\3\151\1\156\1\72\1\172\2\uffff\1\171\1\157\1\160\1\145\1\143\1\157\1\143\1\104\2\156\2\172\1\143\2\156\1\72\2\uffff\1\105\1\156\1\145\1\120\1\164\1\156\2\145\2\147\2\uffff\1\145\2\144\1\uffff\1\156\1\120\1\72\1\162\1\151\2\72\1\166\2\123\1\72\2\172\1\166\1\162\2\uffff\2\157\2\uffff\1\151\2\171\3\uffff\1\151\1\157\1\160\1\156\1\143\2\163\1\162\1\160\1\145\1\72\1\145\2\164\1\157\1\145\1\162\1\uffff\1\72\2\145\1\155\1\162\1\164\1\uffff\2\155\1\145\1\164\1\171\2\172\1\156\1\171\1\72\2\uffff\1\164\1\72\1\uffff\1\72\2\uffff";
    static final String DFA22_acceptS =
        "\34\uffff\1\51\2\uffff\1\53\1\uffff\1\54\3\uffff\1\60\1\61\1\uffff\1\54\16\uffff\1\51\16\uffff\1\50\1\52\2\uffff\1\53\1\56\1\57\1\60\40\uffff\1\55\41\uffff\1\46\1\47\33\uffff\1\40\1\uffff\1\42\1\43\1\44\1\45\30\uffff\1\35\1\36\1\37\1\41\21\uffff\1\31\1\33\6\uffff\1\34\23\uffff\1\32\30\uffff\1\30\3\uffff\1\24\4\uffff\1\27\13\uffff\1\25\1\26\20\uffff\1\22\1\23\12\uffff\1\20\1\21\3\uffff\1\17\17\uffff\1\13\1\14\2\uffff\1\10\1\11\3\uffff\1\12\1\15\1\16\21\uffff\1\7\6\uffff\1\6\12\uffff\1\4\1\5\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA22_specialS =
        "\1\1\41\uffff\1\2\1\0\u0170\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\1\37\3\46\1\43\5\46\1\32\1\34\1\44\1\33\11\36\7\46\1\7\3\41\1\16\6\41\1\4\1\5\2\41\1\14\1\41\1\15\1\10\1\1\1\30\1\41\1\27\3\41\3\46\1\40\1\41\1\46\1\21\1\41\1\3\1\11\1\35\1\22\2\41\1\6\1\23\1\24\2\41\1\25\1\13\1\12\1\41\1\2\1\41\1\26\1\17\1\20\1\41\1\31\2\41\uff85\46",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\70\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\66\6\50",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74\2\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\67\1\uffff\12\105\13\uffff\1\67\37\uffff\1\67",
            "\1\67\1\uffff\12\110\13\uffff\1\67\37\uffff\1\67",
            "",
            "\12\70\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\67\1\uffff\12\111\13\uffff\1\67\37\uffff\1\67",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\113",
            "\0\113",
            "\1\114",
            "",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\121\1\120",
            "\1\122",
            "\1\123\24\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\133\20\uffff\1\131\2\uffff\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\12\70\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "\1\67\1\uffff\12\155\13\uffff\1\67\37\uffff\1\67",
            "",
            "",
            "\1\67\1\uffff\12\110\13\uffff\1\67\37\uffff\1\67",
            "\1\67\1\uffff\12\111\13\uffff\1\67\37\uffff\1\67",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160\1\161",
            "\1\162\7\uffff\1\163\5\uffff\1\164",
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
            "\1\u0082\7\uffff\1\u0081",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\67\1\uffff\12\155\13\uffff\1\67\37\uffff\1\67",
            "",
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
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d3\1\u00d2\60\uffff\1\u00d4",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
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
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
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
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0116",
            "\1\u0117",
            "\1\u0119\31\uffff\1\u0118",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "\1\u0129",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b",
            "\1\u015d\25\uffff\1\u015c",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0169",
            "\1\u016a",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "",
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
            "",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TargetDeployEnviroment | RefConnectionProperty | ConfigDeviceProperty | LinuxOpertingSystem | MacOSOpertingSystem | ComputationDevice | ConfigConnection | Configuration | ConnectDevice | IncludeDevice | RefConnection | RefDeviceType | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Os_version | RefDevice | Processor | RangeKind | Container | Ethernet | Device | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
          int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA22_35 = input.LA(1);

                        s = -1;
                        if ( ((LA22_35>='\u0000' && LA22_35<='\uFFFF')) ) {s = 75;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='T') ) {s = 1;}

                        else if ( (LA22_0=='r') ) {s = 2;}

                        else if ( (LA22_0=='c') ) {s = 3;}

                        else if ( (LA22_0=='L') ) {s = 4;}

                        else if ( (LA22_0=='M') ) {s = 5;}

                        else if ( (LA22_0=='i') ) {s = 6;}

                        else if ( (LA22_0=='A') ) {s = 7;}

                        else if ( (LA22_0=='S') ) {s = 8;}

                        else if ( (LA22_0=='d') ) {s = 9;}

                        else if ( (LA22_0=='p') ) {s = 10;}

                        else if ( (LA22_0=='o') ) {s = 11;}

                        else if ( (LA22_0=='P') ) {s = 12;}

                        else if ( (LA22_0=='R') ) {s = 13;}

                        else if ( (LA22_0=='E') ) {s = 14;}

                        else if ( (LA22_0=='u') ) {s = 15;}

                        else if ( (LA22_0=='v') ) {s = 16;}

                        else if ( (LA22_0=='a') ) {s = 17;}

                        else if ( (LA22_0=='f') ) {s = 18;}

                        else if ( (LA22_0=='j') ) {s = 19;}

                        else if ( (LA22_0=='k') ) {s = 20;}

                        else if ( (LA22_0=='n') ) {s = 21;}

                        else if ( (LA22_0=='t') ) {s = 22;}

                        else if ( (LA22_0=='W') ) {s = 23;}

                        else if ( (LA22_0=='U') ) {s = 24;}

                        else if ( (LA22_0=='x') ) {s = 25;}

                        else if ( (LA22_0=='-') ) {s = 26;}

                        else if ( (LA22_0=='0') ) {s = 27;}

                        else if ( (LA22_0=='.') ) {s = 28;}

                        else if ( (LA22_0=='e') ) {s = 29;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 30;}

                        else if ( (LA22_0=='#') ) {s = 31;}

                        else if ( (LA22_0=='^') ) {s = 32;}

                        else if ( ((LA22_0>='B' && LA22_0<='D')||(LA22_0>='F' && LA22_0<='K')||(LA22_0>='N' && LA22_0<='O')||LA22_0=='Q'||LA22_0=='V'||(LA22_0>='X' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='b'||(LA22_0>='g' && LA22_0<='h')||(LA22_0>='l' && LA22_0<='m')||LA22_0=='q'||LA22_0=='s'||LA22_0=='w'||(LA22_0>='y' && LA22_0<='z')) ) {s = 33;}

                        else if ( (LA22_0=='\"') ) {s = 34;}

                        else if ( (LA22_0=='\'') ) {s = 35;}

                        else if ( (LA22_0=='/') ) {s = 36;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 37;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='$' && LA22_0<='&')||(LA22_0>='(' && LA22_0<=',')||(LA22_0>=':' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA22_34 = input.LA(1);

                        s = -1;
                        if ( ((LA22_34>='\u0000' && LA22_34<='\uFFFF')) ) {s = 75;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}
