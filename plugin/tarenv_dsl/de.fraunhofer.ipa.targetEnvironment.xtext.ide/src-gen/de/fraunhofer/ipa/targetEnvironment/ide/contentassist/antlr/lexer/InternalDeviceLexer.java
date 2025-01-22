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
    public static final int Core_number=20;
    public static final int Port=43;
    public static final int ComputationResouce=9;
    public static final int AttributeKind=12;
    public static final int Name=40;
    public static final int Container=29;
    public static final int Debian=33;
    public static final int Kind=39;
    public static final int Ubuntu=34;
    public static final int RULE_DEDENT=53;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=54;
    public static final int RULE_DIGIT=48;
    public static final int HyphenMinusHyphenMinusHyphenMinus=44;
    public static final int Interface_name=11;
    public static final int SelectionKind=13;
    public static final int DeviceType=17;
    public static final int Subnet_mask=23;
    public static final int Arm64=36;
    public static final int RULE_INT=55;
    public static final int Ethernet=30;
    public static final int Value=35;
    public static final int RULE_ML_COMMENT=57;
    public static final int Dns_server=24;
    public static final int Description=16;
    public static final int Processor=27;
    public static final int RULE_STRING=56;
    public static final int Focal=37;
    public static final int Wlan=42;
    public static final int Properties=22;
    public static final int DeviceResouce=10;
    public static final int RULE_SL_COMMENT=51;
    public static final int CommunicationConnection=4;
    public static final int Os_name=32;
    public static final int HyphenMinus=47;
    public static final int RULE_DOUBLE=50;
    public static final int Device_volume=14;
    public static final int Gateway=31;
    public static final int X86=46;
    public static final int RULE_DECINT=49;
    public static final int MinimumKind=19;
    public static final int EOF=-1;
    public static final int RULE_INDENT=52;
    public static final int Mac_address=21;
    public static final int Jammy=38;
    public static final int Usb=45;
    public static final int RULE_WS=58;
    public static final int MaximumKind=18;
    public static final int RULE_ANY_OTHER=59;
    public static final int ComputationDeviceType=5;
    public static final int Processor_architecture=6;
    public static final int Identity_name=15;
    public static final int RangeKind=28;
    public static final int Os_version=26;
    public static final int Type=41;
    public static final int MacOSOpertingSystem=8;
    public static final int Ip_address=25;

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

    // $ANTLR start "ComputationDeviceType"
    public final void mComputationDeviceType() throws RecognitionException {
        try {
            int _type = ComputationDeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:16:23: ( 'ComputationDeviceType:' )
            // InternalDeviceLexer.g:16:25: 'ComputationDeviceType:'
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

    // $ANTLR start "Processor_architecture"
    public final void mProcessor_architecture() throws RecognitionException {
        try {
            int _type = Processor_architecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:18:24: ( 'processor_architecture' )
            // InternalDeviceLexer.g:18:26: 'processor_architecture'
            {
            match("processor_architecture");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Processor_architecture"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:20:21: ( 'LinuxOpertingSystem' )
            // InternalDeviceLexer.g:20:23: 'LinuxOpertingSystem'
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
            // InternalDeviceLexer.g:22:21: ( 'MacOSOpertingSystem' )
            // InternalDeviceLexer.g:22:23: 'MacOSOpertingSystem'
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

    // $ANTLR start "ComputationResouce"
    public final void mComputationResouce() throws RecognitionException {
        try {
            int _type = ComputationResouce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:24:20: ( 'computationResouce:' )
            // InternalDeviceLexer.g:24:22: 'computationResouce:'
            {
            match("computationResouce:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComputationResouce"

    // $ANTLR start "DeviceResouce"
    public final void mDeviceResouce() throws RecognitionException {
        try {
            int _type = DeviceResouce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:26:15: ( 'deviceResouce:' )
            // InternalDeviceLexer.g:26:17: 'deviceResouce:'
            {
            match("deviceResouce:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeviceResouce"

    // $ANTLR start "Interface_name"
    public final void mInterface_name() throws RecognitionException {
        try {
            int _type = Interface_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:28:16: ( 'interface_name' )
            // InternalDeviceLexer.g:28:18: 'interface_name'
            {
            match("interface_name");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interface_name"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:30:15: ( 'AttributeKind' )
            // InternalDeviceLexer.g:30:17: 'AttributeKind'
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
            // InternalDeviceLexer.g:32:15: ( 'SelectionKind' )
            // InternalDeviceLexer.g:32:17: 'SelectionKind'
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

    // $ANTLR start "Device_volume"
    public final void mDevice_volume() throws RecognitionException {
        try {
            int _type = Device_volume;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:34:15: ( 'device_volume' )
            // InternalDeviceLexer.g:34:17: 'device_volume'
            {
            match("device_volume");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Device_volume"

    // $ANTLR start "Identity_name"
    public final void mIdentity_name() throws RecognitionException {
        try {
            int _type = Identity_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:36:15: ( 'identity_name' )
            // InternalDeviceLexer.g:36:17: 'identity_name'
            {
            match("identity_name");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identity_name"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:38:13: ( 'description:' )
            // InternalDeviceLexer.g:38:15: 'description:'
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

    // $ANTLR start "DeviceType"
    public final void mDeviceType() throws RecognitionException {
        try {
            int _type = DeviceType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:40:12: ( 'DeviceType:' )
            // InternalDeviceLexer.g:40:14: 'DeviceType:'
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
            // InternalDeviceLexer.g:42:13: ( 'MaximumKind' )
            // InternalDeviceLexer.g:42:15: 'MaximumKind'
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
            // InternalDeviceLexer.g:44:13: ( 'MinimumKind' )
            // InternalDeviceLexer.g:44:15: 'MinimumKind'
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

    // $ANTLR start "Core_number"
    public final void mCore_number() throws RecognitionException {
        try {
            int _type = Core_number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:46:13: ( 'core_number' )
            // InternalDeviceLexer.g:46:15: 'core_number'
            {
            match("core_number");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Core_number"

    // $ANTLR start "Mac_address"
    public final void mMac_address() throws RecognitionException {
        try {
            int _type = Mac_address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:48:13: ( 'mac_address' )
            // InternalDeviceLexer.g:48:15: 'mac_address'
            {
            match("mac_address");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mac_address"

    // $ANTLR start "Properties"
    public final void mProperties() throws RecognitionException {
        try {
            int _type = Properties;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:50:12: ( 'properties:' )
            // InternalDeviceLexer.g:50:14: 'properties:'
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

    // $ANTLR start "Subnet_mask"
    public final void mSubnet_mask() throws RecognitionException {
        try {
            int _type = Subnet_mask;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:52:13: ( 'subnet_mask' )
            // InternalDeviceLexer.g:52:15: 'subnet_mask'
            {
            match("subnet_mask");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subnet_mask"

    // $ANTLR start "Dns_server"
    public final void mDns_server() throws RecognitionException {
        try {
            int _type = Dns_server;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:54:12: ( 'dns_server' )
            // InternalDeviceLexer.g:54:14: 'dns_server'
            {
            match("dns_server");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dns_server"

    // $ANTLR start "Ip_address"
    public final void mIp_address() throws RecognitionException {
        try {
            int _type = Ip_address;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:56:12: ( 'ip_address' )
            // InternalDeviceLexer.g:56:14: 'ip_address'
            {
            match("ip_address");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ip_address"

    // $ANTLR start "Os_version"
    public final void mOs_version() throws RecognitionException {
        try {
            int _type = Os_version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:58:12: ( 'os_version' )
            // InternalDeviceLexer.g:58:14: 'os_version'
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

    // $ANTLR start "Processor"
    public final void mProcessor() throws RecognitionException {
        try {
            int _type = Processor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:60:11: ( 'Processor' )
            // InternalDeviceLexer.g:60:13: 'Processor'
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
            // InternalDeviceLexer.g:62:11: ( 'RangeKind' )
            // InternalDeviceLexer.g:62:13: 'RangeKind'
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
            // InternalDeviceLexer.g:64:11: ( 'container' )
            // InternalDeviceLexer.g:64:13: 'container'
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
            // InternalDeviceLexer.g:66:10: ( 'Ethernet' )
            // InternalDeviceLexer.g:66:12: 'Ethernet'
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

    // $ANTLR start "Gateway"
    public final void mGateway() throws RecognitionException {
        try {
            int _type = Gateway;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:68:9: ( 'gateway' )
            // InternalDeviceLexer.g:68:11: 'gateway'
            {
            match("gateway");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gateway"

    // $ANTLR start "Os_name"
    public final void mOs_name() throws RecognitionException {
        try {
            int _type = Os_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:70:9: ( 'os_name' )
            // InternalDeviceLexer.g:70:11: 'os_name'
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
            // InternalDeviceLexer.g:72:8: ( 'debian' )
            // InternalDeviceLexer.g:72:10: 'debian'
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
            // InternalDeviceLexer.g:74:8: ( 'ubuntu' )
            // InternalDeviceLexer.g:74:10: 'ubuntu'
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
            // InternalDeviceLexer.g:76:7: ( 'value:' )
            // InternalDeviceLexer.g:76:9: 'value:'
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
            // InternalDeviceLexer.g:78:7: ( 'arm64' )
            // InternalDeviceLexer.g:78:9: 'arm64'
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
            // InternalDeviceLexer.g:80:7: ( 'focal' )
            // InternalDeviceLexer.g:80:9: 'focal'
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
            // InternalDeviceLexer.g:82:7: ( 'jammy' )
            // InternalDeviceLexer.g:82:9: 'jammy'
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
            // InternalDeviceLexer.g:84:6: ( 'kind:' )
            // InternalDeviceLexer.g:84:8: 'kind:'
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
            // InternalDeviceLexer.g:86:6: ( 'name:' )
            // InternalDeviceLexer.g:86:8: 'name:'
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
            // InternalDeviceLexer.g:88:6: ( 'type:' )
            // InternalDeviceLexer.g:88:8: 'type:'
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
            // InternalDeviceLexer.g:90:6: ( 'Wlan' )
            // InternalDeviceLexer.g:90:8: 'Wlan'
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

    // $ANTLR start "Port"
    public final void mPort() throws RecognitionException {
        try {
            int _type = Port;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:92:6: ( 'port' )
            // InternalDeviceLexer.g:92:8: 'port'
            {
            match("port");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Port"

    // $ANTLR start "HyphenMinusHyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:94:35: ( '---' )
            // InternalDeviceLexer.g:94:37: '---'
            {
            match("---");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinusHyphenMinus"

    // $ANTLR start "Usb"
    public final void mUsb() throws RecognitionException {
        try {
            int _type = Usb;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:96:5: ( 'Usb' )
            // InternalDeviceLexer.g:96:7: 'Usb'
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
            // InternalDeviceLexer.g:98:5: ( 'x86' )
            // InternalDeviceLexer.g:98:7: 'x86'
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
            // InternalDeviceLexer.g:100:13: ( '-' )
            // InternalDeviceLexer.g:100:15: '-'
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
            // InternalDeviceLexer.g:102:21: ( '0' .. '9' )
            // InternalDeviceLexer.g:102:23: '0' .. '9'
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
            // InternalDeviceLexer.g:104:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:104:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:104:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
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
                    // InternalDeviceLexer.g:104:16: ( RULE_DIGIT )*
                    {
                    // InternalDeviceLexer.g:104:16: ( RULE_DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                      case 1 :
                          // InternalDeviceLexer.g:104:16: RULE_DIGIT
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
                    // InternalDeviceLexer.g:104:28: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalDeviceLexer.g:104:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                      case 1 :
                          // InternalDeviceLexer.g:104:32: RULE_DIGIT
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

            // InternalDeviceLexer.g:104:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalDeviceLexer.g:104:46: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalDeviceLexer.g:104:50: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                      case 1 :
                          // InternalDeviceLexer.g:104:50: RULE_DECINT
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
                    // InternalDeviceLexer.g:104:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalDeviceLexer.g:104:63: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDeviceLexer.g:104:64: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalDeviceLexer.g:104:68: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                              case 1 :
                                  // InternalDeviceLexer.g:104:68: RULE_DIGIT
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

                    // InternalDeviceLexer.g:104:92: ( '-' | '+' )?
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

                    // InternalDeviceLexer.g:104:103: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                      case 1 :
                          // InternalDeviceLexer.g:104:103: RULE_DIGIT
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
            // InternalDeviceLexer.g:106:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:106:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:106:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalDeviceLexer.g:106:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:106:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalDeviceLexer.g:106:29: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                      case 1 :
                          // InternalDeviceLexer.g:106:29: RULE_DIGIT
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
                    // InternalDeviceLexer.g:106:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalDeviceLexer.g:106:54: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                      case 1 :
                          // InternalDeviceLexer.g:106:54: RULE_DIGIT
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
            // InternalDeviceLexer.g:108:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDeviceLexer.g:108:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalDeviceLexer.g:108:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
              case 1 :
                  // InternalDeviceLexer.g:108:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalDeviceLexer.g:110:22: ()
            // InternalDeviceLexer.g:110:24:
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
            // InternalDeviceLexer.g:112:22: ()
            // InternalDeviceLexer.g:112:24:
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
            // InternalDeviceLexer.g:114:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceLexer.g:114:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceLexer.g:114:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDeviceLexer.g:114:11: '^'
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

            // InternalDeviceLexer.g:114:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            // InternalDeviceLexer.g:116:10: ( ( '0' .. '9' )+ )
            // InternalDeviceLexer.g:116:12: ( '0' .. '9' )+
            {
            // InternalDeviceLexer.g:116:12: ( '0' .. '9' )+
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
                  // InternalDeviceLexer.g:116:13: '0' .. '9'
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
            // InternalDeviceLexer.g:118:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDeviceLexer.g:118:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalDeviceLexer.g:118:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                          // InternalDeviceLexer.g:118:21: '\\\\' .
                          {
                          match('\\');
                          matchAny();

                          }
                          break;
                      case 2 :
                          // InternalDeviceLexer.g:118:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDeviceLexer.g:118:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalDeviceLexer.g:118:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                          // InternalDeviceLexer.g:118:54: '\\\\' .
                          {
                          match('\\');
                          matchAny();

                          }
                          break;
                      case 2 :
                          // InternalDeviceLexer.g:118:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDeviceLexer.g:120:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceLexer.g:120:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalDeviceLexer.g:120:24: ( options {greedy=false; } : . )*
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
                  // InternalDeviceLexer.g:120:52: .
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
            // InternalDeviceLexer.g:122:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalDeviceLexer.g:124:16: ( . )
            // InternalDeviceLexer.g:124:18: .
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
        // InternalDeviceLexer.g:1:8: ( CommunicationConnection | ComputationDeviceType | Processor_architecture | LinuxOpertingSystem | MacOSOpertingSystem | ComputationResouce | DeviceResouce | Interface_name | AttributeKind | SelectionKind | Device_volume | Identity_name | Description | DeviceType | MaximumKind | MinimumKind | Core_number | Mac_address | Properties | Subnet_mask | Dns_server | Ip_address | Os_version | Processor | RangeKind | Container | Ethernet | Gateway | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | Port | HyphenMinusHyphenMinusHyphenMinus | Usb | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=53;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalDeviceLexer.g:1:10: CommunicationConnection
                {
                mCommunicationConnection();

                }
                break;
            case 2 :
                // InternalDeviceLexer.g:1:34: ComputationDeviceType
                {
                mComputationDeviceType();

                }
                break;
            case 3 :
                // InternalDeviceLexer.g:1:56: Processor_architecture
                {
                mProcessor_architecture();

                }
                break;
            case 4 :
                // InternalDeviceLexer.g:1:79: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 5 :
                // InternalDeviceLexer.g:1:99: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 6 :
                // InternalDeviceLexer.g:1:119: ComputationResouce
                {
                mComputationResouce();

                }
                break;
            case 7 :
                // InternalDeviceLexer.g:1:138: DeviceResouce
                {
                mDeviceResouce();

                }
                break;
            case 8 :
                // InternalDeviceLexer.g:1:152: Interface_name
                {
                mInterface_name();

                }
                break;
            case 9 :
                // InternalDeviceLexer.g:1:167: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 10 :
                // InternalDeviceLexer.g:1:181: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 11 :
                // InternalDeviceLexer.g:1:195: Device_volume
                {
                mDevice_volume();

                }
                break;
            case 12 :
                // InternalDeviceLexer.g:1:209: Identity_name
                {
                mIdentity_name();

                }
                break;
            case 13 :
                // InternalDeviceLexer.g:1:223: Description
                {
                mDescription();

                }
                break;
            case 14 :
                // InternalDeviceLexer.g:1:235: DeviceType
                {
                mDeviceType();

                }
                break;
            case 15 :
                // InternalDeviceLexer.g:1:246: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 16 :
                // InternalDeviceLexer.g:1:258: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 17 :
                // InternalDeviceLexer.g:1:270: Core_number
                {
                mCore_number();

                }
                break;
            case 18 :
                // InternalDeviceLexer.g:1:282: Mac_address
                {
                mMac_address();

                }
                break;
            case 19 :
                // InternalDeviceLexer.g:1:294: Properties
                {
                mProperties();

                }
                break;
            case 20 :
                // InternalDeviceLexer.g:1:305: Subnet_mask
                {
                mSubnet_mask();

                }
                break;
            case 21 :
                // InternalDeviceLexer.g:1:317: Dns_server
                {
                mDns_server();

                }
                break;
            case 22 :
                // InternalDeviceLexer.g:1:328: Ip_address
                {
                mIp_address();

                }
                break;
            case 23 :
                // InternalDeviceLexer.g:1:339: Os_version
                {
                mOs_version();

                }
                break;
            case 24 :
                // InternalDeviceLexer.g:1:350: Processor
                {
                mProcessor();

                }
                break;
            case 25 :
                // InternalDeviceLexer.g:1:360: RangeKind
                {
                mRangeKind();

                }
                break;
            case 26 :
                // InternalDeviceLexer.g:1:370: Container
                {
                mContainer();

                }
                break;
            case 27 :
                // InternalDeviceLexer.g:1:380: Ethernet
                {
                mEthernet();

                }
                break;
            case 28 :
                // InternalDeviceLexer.g:1:389: Gateway
                {
                mGateway();

                }
                break;
            case 29 :
                // InternalDeviceLexer.g:1:397: Os_name
                {
                mOs_name();

                }
                break;
            case 30 :
                // InternalDeviceLexer.g:1:405: Debian
                {
                mDebian();

                }
                break;
            case 31 :
                // InternalDeviceLexer.g:1:412: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 32 :
                // InternalDeviceLexer.g:1:419: Value
                {
                mValue();

                }
                break;
            case 33 :
                // InternalDeviceLexer.g:1:425: Arm64
                {
                mArm64();

                }
                break;
            case 34 :
                // InternalDeviceLexer.g:1:431: Focal
                {
                mFocal();

                }
                break;
            case 35 :
                // InternalDeviceLexer.g:1:437: Jammy
                {
                mJammy();

                }
                break;
            case 36 :
                // InternalDeviceLexer.g:1:443: Kind
                {
                mKind();

                }
                break;
            case 37 :
                // InternalDeviceLexer.g:1:448: Name
                {
                mName();

                }
                break;
            case 38 :
                // InternalDeviceLexer.g:1:453: Type
                {
                mType();

                }
                break;
            case 39 :
                // InternalDeviceLexer.g:1:458: Wlan
                {
                mWlan();

                }
                break;
            case 40 :
                // InternalDeviceLexer.g:1:463: Port
                {
                mPort();

                }
                break;
            case 41 :
                // InternalDeviceLexer.g:1:468: HyphenMinusHyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinusHyphenMinus();

                }
                break;
            case 42 :
                // InternalDeviceLexer.g:1:502: Usb
                {
                mUsb();

                }
                break;
            case 43 :
                // InternalDeviceLexer.g:1:506: X86
                {
                mX86();

                }
                break;
            case 44 :
                // InternalDeviceLexer.g:1:510: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 45 :
                // InternalDeviceLexer.g:1:522: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 46 :
                // InternalDeviceLexer.g:1:534: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 47 :
                // InternalDeviceLexer.g:1:546: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 48 :
                // InternalDeviceLexer.g:1:562: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 49 :
                // InternalDeviceLexer.g:1:570: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 50 :
                // InternalDeviceLexer.g:1:579: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 51 :
                // InternalDeviceLexer.g:1:591: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 52 :
                // InternalDeviceLexer.g:1:607: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 53 :
                // InternalDeviceLexer.g:1:615: RULE_ANY_OTHER
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
            return "104:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\17\53\1\100\12\53\1\116\2\53\1\121\1\uffff\1\100\1\121\1\uffff\1\51\1\uffff\3\51\2\uffff\1\53\1\uffff\24\53\1\uffff\1\100\12\53\1\uffff\1\121\1\uffff\2\53\1\uffff\1\177\1\121\4\uffff\44\53\1\121\1\u00a7\1\u00a8\1\uffff\7\53\1\u00b0\36\53\1\u00cf\2\uffff\7\53\1\uffff\30\53\1\u00ef\1\u00f0\1\u00f1\4\uffff\15\53\1\u0100\17\53\1\u0110\4\uffff\16\53\1\uffff\12\53\1\u0129\3\53\1\u012d\1\uffff\30\53\1\uffff\2\53\1\u0148\1\uffff\3\53\1\u014c\24\53\1\u0161\1\u0162\1\uffff\3\53\1\uffff\12\53\1\u0170\2\53\1\u0173\5\53\1\u0179\2\uffff\2\53\1\u017c\2\53\1\uffff\2\53\1\u0181\1\u0182\3\53\1\uffff\2\53\1\uffff\2\53\1\uffff\1\u018a\1\u018b\1\uffff\2\53\1\uffff\4\53\2\uffff\2\53\1\uffff\4\53\2\uffff\7\53\1\u019f\1\53\1\u01a1\1\u01a2\1\u01a3\6\53\2\uffff\1\u01aa\3\uffff\6\53\1\uffff\23\53\1\uffff\2\53\1\u01c6\1\u01c7\3\53\2\uffff\4\53\1\uffff\1\u01cf\1\53\2\uffff";
    static final String DFA22_eofS =
        "\u01d1\uffff";
    static final String DFA22_minS =
        "\1\0\3\157\1\151\1\141\1\145\1\144\1\164\2\145\1\141\1\165\1\163\1\162\1\141\1\60\1\141\1\142\1\141\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\55\1\163\1\70\1\56\1\uffff\1\60\1\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\uffff\1\155\1\157\1\162\1\156\1\143\1\156\1\142\1\163\1\164\1\145\1\137\1\164\1\154\1\166\1\143\1\142\1\137\1\157\1\156\1\150\1\uffff\1\60\1\164\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\uffff\1\56\1\uffff\1\142\1\66\1\uffff\2\56\4\uffff\1\155\1\145\1\164\1\160\1\143\1\164\1\165\1\117\3\151\1\143\1\151\1\137\1\145\1\156\1\141\1\162\1\145\1\151\1\137\2\156\1\143\1\147\2\145\1\156\1\165\1\66\1\141\1\155\1\144\2\145\1\156\1\56\2\60\1\uffff\2\165\1\137\1\141\1\165\2\145\1\60\1\170\1\123\2\155\1\143\1\162\1\141\1\163\1\162\1\164\1\144\1\151\2\143\1\141\2\145\1\141\2\145\1\162\1\167\1\164\1\145\1\64\1\154\1\171\3\72\1\60\2\uffff\1\156\1\164\1\156\1\151\1\164\1\163\1\162\1\uffff\2\117\2\165\1\145\1\151\1\156\1\145\1\146\1\151\1\144\1\142\1\164\1\145\1\144\1\164\1\162\1\155\1\163\1\113\1\156\1\141\1\165\1\72\3\60\4\uffff\1\151\1\141\1\165\1\156\1\141\1\163\1\164\2\160\2\155\1\122\1\160\1\60\1\162\1\141\1\164\1\162\1\165\1\151\1\124\1\144\1\137\1\163\1\145\1\163\1\151\1\145\1\171\1\60\4\uffff\1\143\1\164\1\155\1\145\1\164\1\157\1\151\2\145\2\113\1\145\1\166\1\164\1\uffff\1\166\1\143\1\171\1\145\1\164\1\157\1\171\1\162\1\155\1\151\1\60\1\157\1\156\1\164\1\60\1\uffff\1\141\1\151\1\142\1\162\1\151\1\162\1\145\2\162\2\151\1\163\1\157\1\151\2\145\1\137\1\163\1\145\1\156\1\160\1\145\1\141\1\157\1\uffff\1\162\1\144\1\60\1\uffff\1\164\1\157\1\145\1\60\1\157\1\137\1\163\2\164\2\156\1\157\1\154\1\157\1\162\1\137\1\156\1\163\2\113\1\145\2\163\1\156\2\60\1\uffff\1\151\1\156\1\162\1\uffff\1\156\1\141\1\72\2\151\2\144\2\165\1\156\1\60\1\156\1\141\1\60\2\151\1\72\1\163\1\153\1\60\2\uffff\1\157\1\122\1\60\1\104\1\162\1\uffff\2\156\2\60\1\143\1\155\1\72\1\uffff\1\141\1\155\1\uffff\2\156\1\uffff\2\60\1\uffff\1\156\1\145\1\uffff\1\145\1\143\2\147\2\uffff\2\145\1\uffff\1\155\1\145\2\144\2\uffff\1\103\1\163\1\166\1\150\2\123\1\72\1\60\1\145\3\60\2\157\2\151\2\171\2\uffff\1\60\3\uffff\1\156\1\165\1\143\1\164\2\163\1\uffff\1\156\1\143\2\145\2\164\2\145\1\124\1\143\2\145\1\143\1\72\1\171\1\164\2\155\1\164\1\uffff\1\160\1\165\2\60\1\151\1\145\1\162\2\uffff\1\157\1\72\1\145\1\156\1\uffff\1\60\1\72\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\2\157\1\162\2\151\1\156\1\160\1\164\2\145\1\141\1\165\1\163\1\162\1\141\1\172\1\141\1\142\1\141\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\145\1\163\1\70\1\145\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\162\1\uffff\1\155\1\157\1\162\1\156\1\170\1\156\1\166\1\163\1\164\1\145\1\137\1\164\1\154\1\166\1\143\1\142\1\137\1\157\1\156\1\150\1\uffff\1\172\1\164\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\uffff\1\145\1\uffff\1\142\1\66\1\uffff\2\145\4\uffff\1\160\1\145\1\164\2\160\1\164\1\165\1\117\3\151\1\143\1\151\1\137\1\145\1\156\1\141\1\162\1\145\1\151\1\137\1\156\1\166\1\143\1\147\2\145\1\156\1\165\1\66\1\141\1\155\1\144\2\145\1\156\1\145\2\172\1\uffff\2\165\1\137\1\141\1\165\2\145\1\172\1\170\1\123\2\155\1\143\1\162\1\141\1\163\1\162\1\164\1\144\1\151\2\143\1\141\2\145\1\141\2\145\1\162\1\167\1\164\1\145\1\64\1\154\1\171\3\72\1\172\2\uffff\1\156\1\164\1\156\1\151\1\164\1\163\1\162\1\uffff\2\117\2\165\1\145\1\151\1\156\1\145\1\146\1\151\1\144\1\142\1\164\1\145\1\144\1\164\1\162\1\155\1\163\1\113\1\156\1\141\1\165\1\72\3\172\4\uffff\1\151\1\141\1\165\1\156\1\141\1\163\1\164\2\160\2\155\1\137\1\160\1\172\1\162\1\141\1\164\1\162\1\165\1\151\1\124\1\144\1\137\1\163\1\145\1\163\1\151\1\145\1\171\1\172\4\uffff\1\143\1\164\1\155\1\145\1\164\1\157\1\151\2\145\2\113\1\145\1\166\1\164\1\uffff\1\166\1\143\1\171\1\145\1\164\1\157\1\171\1\162\1\155\1\151\1\172\1\157\1\156\1\164\1\172\1\uffff\1\141\1\151\1\142\1\162\1\151\1\162\1\145\2\162\2\151\1\163\1\157\1\151\2\145\1\137\1\163\1\145\1\156\1\160\1\145\1\141\1\157\1\uffff\1\162\1\144\1\172\1\uffff\1\164\1\157\1\145\1\172\1\157\1\137\1\163\2\164\2\156\1\157\1\154\1\157\1\162\1\137\1\156\1\163\2\113\1\145\2\163\1\156\2\172\1\uffff\1\151\1\156\1\162\1\uffff\1\156\1\141\1\72\2\151\2\144\2\165\1\156\1\172\1\156\1\141\1\172\2\151\1\72\1\163\1\153\1\172\2\uffff\1\157\1\122\1\172\1\104\1\162\1\uffff\2\156\2\172\1\143\1\155\1\72\1\uffff\1\141\1\155\1\uffff\2\156\1\uffff\2\172\1\uffff\1\156\1\145\1\uffff\1\145\1\143\2\147\2\uffff\2\145\1\uffff\1\155\1\145\2\144\2\uffff\1\103\1\163\1\166\1\150\2\123\1\72\1\172\1\145\3\172\2\157\2\151\2\171\2\uffff\1\172\3\uffff\1\156\1\165\1\143\1\164\2\163\1\uffff\1\156\1\143\2\145\2\164\2\145\1\124\1\143\2\145\1\143\1\72\1\171\1\164\2\155\1\164\1\uffff\1\160\1\165\2\172\1\151\1\145\1\162\2\uffff\1\157\1\72\1\145\1\156\1\uffff\1\172\1\72\2\uffff";
    static final String DFA22_acceptS =
        "\37\uffff\1\55\2\uffff\1\57\1\uffff\1\60\3\uffff\1\64\1\65\1\uffff\1\60\24\uffff\1\55\13\uffff\1\51\1\uffff\1\54\2\uffff\1\56\2\uffff\1\57\1\62\1\63\1\64\47\uffff\1\61\47\uffff\1\52\1\53\7\uffff\1\50\33\uffff\1\44\1\45\1\46\1\47\36\uffff\1\40\1\41\1\42\1\43\16\uffff\1\36\17\uffff\1\37\30\uffff\1\35\3\uffff\1\34\32\uffff\1\33\3\uffff\1\32\24\uffff\1\30\1\31\5\uffff\1\23\7\uffff\1\25\2\uffff\1\26\2\uffff\1\16\2\uffff\1\27\2\uffff\1\21\4\uffff\1\17\1\20\2\uffff\1\15\4\uffff\1\22\1\24\22\uffff\1\7\1\13\1\uffff\1\14\1\11\1\12\6\uffff\1\10\23\uffff\1\6\7\uffff\1\4\1\5\4\uffff\1\2\2\uffff\1\3\1\1";
    static final String DFA22_specialS =
        "\1\2\44\uffff\1\0\1\1\u01aa\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\1\42\3\51\1\46\5\51\1\33\1\37\1\47\1\36\11\41\7\51\1\10\1\44\1\2\1\12\1\20\6\44\1\4\1\5\2\44\1\16\1\44\1\17\1\11\1\44\1\34\1\44\1\32\3\44\3\51\1\43\1\44\1\51\1\24\1\44\1\1\1\6\1\40\1\25\1\21\1\44\1\7\1\26\1\27\1\44\1\13\1\30\1\15\1\3\2\44\1\14\1\31\1\22\1\23\1\44\1\35\2\44\uff85\51",
            "\1\52",
            "\1\54",
            "\1\56\2\uffff\1\55",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62\10\uffff\1\63",
            "\1\65\11\uffff\1\64\1\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\101\7\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\77\6\53",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114\1\100\1\uffff\12\115\13\uffff\1\100\37\uffff\1\100",
            "\1\117",
            "\1\120",
            "\1\100\1\uffff\12\122\13\uffff\1\100\37\uffff\1\100",
            "",
            "\12\101\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\100\1\uffff\12\123\13\uffff\1\100\37\uffff\1\100",
            "",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\125",
            "\0\125",
            "\1\126",
            "",
            "",
            "\1\130\1\132\3\uffff\1\131",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137\24\uffff\1\140",
            "\1\141",
            "\1\144\20\uffff\1\143\2\uffff\1\142",
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
            "",
            "\12\101\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "",
            "\1\100\1\uffff\12\174\13\uffff\1\100\37\uffff\1\100",
            "",
            "\1\175",
            "\1\176",
            "",
            "\1\100\1\uffff\12\122\13\uffff\1\100\37\uffff\1\100",
            "\1\100\1\uffff\12\123\13\uffff\1\100\37\uffff\1\100",
            "",
            "",
            "",
            "",
            "\1\u0080\2\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\14\uffff\1\u0086",
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
            "\1\u0099\7\uffff\1\u0098",
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
            "\1\100\1\uffff\12\174\13\uffff\1\100\37\uffff\1\100",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
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
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
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
            "\1\u00fd\14\uffff\1\u00fe",
            "\1\u00ff",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
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
            "",
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
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
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
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u014d",
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
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0171",
            "\1\u0172",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u017d",
            "\1\u017e",
            "",
            "\1\u017f",
            "\1\u0180",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u01d0",
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
            return "1:1: Tokens : ( CommunicationConnection | ComputationDeviceType | Processor_architecture | LinuxOpertingSystem | MacOSOpertingSystem | ComputationResouce | DeviceResouce | Interface_name | AttributeKind | SelectionKind | Device_volume | Identity_name | Description | DeviceType | MaximumKind | MinimumKind | Core_number | Mac_address | Properties | Subnet_mask | Dns_server | Ip_address | Os_version | Processor | RangeKind | Container | Ethernet | Gateway | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | Port | HyphenMinusHyphenMinusHyphenMinus | Usb | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
          int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA22_37 = input.LA(1);

                        s = -1;
                        if ( ((LA22_37>='\u0000' && LA22_37<='\uFFFF')) ) {s = 85;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='\u0000' && LA22_38<='\uFFFF')) ) {s = 85;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='c') ) {s = 1;}

                        else if ( (LA22_0=='C') ) {s = 2;}

                        else if ( (LA22_0=='p') ) {s = 3;}

                        else if ( (LA22_0=='L') ) {s = 4;}

                        else if ( (LA22_0=='M') ) {s = 5;}

                        else if ( (LA22_0=='d') ) {s = 6;}

                        else if ( (LA22_0=='i') ) {s = 7;}

                        else if ( (LA22_0=='A') ) {s = 8;}

                        else if ( (LA22_0=='S') ) {s = 9;}

                        else if ( (LA22_0=='D') ) {s = 10;}

                        else if ( (LA22_0=='m') ) {s = 11;}

                        else if ( (LA22_0=='s') ) {s = 12;}

                        else if ( (LA22_0=='o') ) {s = 13;}

                        else if ( (LA22_0=='P') ) {s = 14;}

                        else if ( (LA22_0=='R') ) {s = 15;}

                        else if ( (LA22_0=='E') ) {s = 16;}

                        else if ( (LA22_0=='g') ) {s = 17;}

                        else if ( (LA22_0=='u') ) {s = 18;}

                        else if ( (LA22_0=='v') ) {s = 19;}

                        else if ( (LA22_0=='a') ) {s = 20;}

                        else if ( (LA22_0=='f') ) {s = 21;}

                        else if ( (LA22_0=='j') ) {s = 22;}

                        else if ( (LA22_0=='k') ) {s = 23;}

                        else if ( (LA22_0=='n') ) {s = 24;}

                        else if ( (LA22_0=='t') ) {s = 25;}

                        else if ( (LA22_0=='W') ) {s = 26;}

                        else if ( (LA22_0=='-') ) {s = 27;}

                        else if ( (LA22_0=='U') ) {s = 28;}

                        else if ( (LA22_0=='x') ) {s = 29;}

                        else if ( (LA22_0=='0') ) {s = 30;}

                        else if ( (LA22_0=='.') ) {s = 31;}

                        else if ( (LA22_0=='e') ) {s = 32;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 33;}

                        else if ( (LA22_0=='#') ) {s = 34;}

                        else if ( (LA22_0=='^') ) {s = 35;}

                        else if ( (LA22_0=='B'||(LA22_0>='F' && LA22_0<='K')||(LA22_0>='N' && LA22_0<='O')||LA22_0=='Q'||LA22_0=='T'||LA22_0=='V'||(LA22_0>='X' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='b'||LA22_0=='h'||LA22_0=='l'||(LA22_0>='q' && LA22_0<='r')||LA22_0=='w'||(LA22_0>='y' && LA22_0<='z')) ) {s = 36;}

                        else if ( (LA22_0=='\"') ) {s = 37;}

                        else if ( (LA22_0=='\'') ) {s = 38;}

                        else if ( (LA22_0=='/') ) {s = 39;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 40;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='$' && LA22_0<='&')||(LA22_0>='(' && LA22_0<=',')||(LA22_0>=':' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 41;}

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
