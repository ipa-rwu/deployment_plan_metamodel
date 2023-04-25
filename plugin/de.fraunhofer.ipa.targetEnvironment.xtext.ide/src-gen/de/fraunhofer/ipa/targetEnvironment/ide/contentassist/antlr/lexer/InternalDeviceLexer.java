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
    public static final int Core_number=17;
    public static final int Address=25;
    public static final int ComputationResouce=9;
    public static final int AttributeKind=11;
    public static final int Name=34;
    public static final int Container=22;
    public static final int Debian=27;
    public static final int Kind=33;
    public static final int Ubuntu=28;
    public static final int RULE_DEDENT=45;
    public static final int LinuxOpertingSystem=7;
    public static final int RULE_ID=46;
    public static final int RULE_DIGIT=40;
    public static final int HyphenMinusHyphenMinusHyphenMinus=37;
    public static final int SelectionKind=12;
    public static final int DeviceType=14;
    public static final int Arm64=30;
    public static final int RULE_INT=47;
    public static final int Ethernet=24;
    public static final int Value=29;
    public static final int RULE_ML_COMMENT=49;
    public static final int Description=13;
    public static final int Processor=20;
    public static final int RULE_STRING=48;
    public static final int Focal=31;
    public static final int Wlan=36;
    public static final int Properties=18;
    public static final int DeviceResouce=10;
    public static final int RULE_SL_COMMENT=43;
    public static final int CommunicationConnection=4;
    public static final int Os_name=26;
    public static final int HyphenMinus=39;
    public static final int RULE_DOUBLE=42;
    public static final int X86=38;
    public static final int RULE_DECINT=41;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=44;
    public static final int Jammy=32;
    public static final int RULE_WS=50;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=51;
    public static final int ComputationDeviceType=5;
    public static final int Processor_architecture=6;
    public static final int RangeKind=21;
    public static final int Os_version=19;
    public static final int Type=35;
    public static final int MacOSOpertingSystem=8;
    public static final int Interface=23;

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

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:28:15: ( 'AttributeKind' )
            // InternalDeviceLexer.g:28:17: 'AttributeKind'
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
            // InternalDeviceLexer.g:30:15: ( 'SelectionKind' )
            // InternalDeviceLexer.g:30:17: 'SelectionKind'
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
            // InternalDeviceLexer.g:32:13: ( 'description:' )
            // InternalDeviceLexer.g:32:15: 'description:'
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
            // InternalDeviceLexer.g:34:12: ( 'DeviceType:' )
            // InternalDeviceLexer.g:34:14: 'DeviceType:'
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
            // InternalDeviceLexer.g:36:13: ( 'MaximumKind' )
            // InternalDeviceLexer.g:36:15: 'MaximumKind'
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
            // InternalDeviceLexer.g:38:13: ( 'MinimumKind' )
            // InternalDeviceLexer.g:38:15: 'MinimumKind'
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
            // InternalDeviceLexer.g:40:13: ( 'core_number' )
            // InternalDeviceLexer.g:40:15: 'core_number'
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

    // $ANTLR start "Properties"
    public final void mProperties() throws RecognitionException {
        try {
            int _type = Properties;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:42:12: ( 'properties:' )
            // InternalDeviceLexer.g:42:14: 'properties:'
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
            // InternalDeviceLexer.g:44:12: ( 'os_version' )
            // InternalDeviceLexer.g:44:14: 'os_version'
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
            // InternalDeviceLexer.g:46:11: ( 'Processor' )
            // InternalDeviceLexer.g:46:13: 'Processor'
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
            // InternalDeviceLexer.g:48:11: ( 'RangeKind' )
            // InternalDeviceLexer.g:48:13: 'RangeKind'
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
            // InternalDeviceLexer.g:50:11: ( 'container' )
            // InternalDeviceLexer.g:50:13: 'container'
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

    // $ANTLR start "Interface"
    public final void mInterface() throws RecognitionException {
        try {
            int _type = Interface;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:52:11: ( 'interface' )
            // InternalDeviceLexer.g:52:13: 'interface'
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
            // InternalDeviceLexer.g:54:10: ( 'Ethernet' )
            // InternalDeviceLexer.g:54:12: 'Ethernet'
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
            // InternalDeviceLexer.g:56:9: ( 'address' )
            // InternalDeviceLexer.g:56:11: 'address'
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

    // $ANTLR start "Os_name"
    public final void mOs_name() throws RecognitionException {
        try {
            int _type = Os_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:58:9: ( 'os_name' )
            // InternalDeviceLexer.g:58:11: 'os_name'
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
            // InternalDeviceLexer.g:60:8: ( 'debian' )
            // InternalDeviceLexer.g:60:10: 'debian'
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
            // InternalDeviceLexer.g:62:8: ( 'ubuntu' )
            // InternalDeviceLexer.g:62:10: 'ubuntu'
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
            // InternalDeviceLexer.g:64:7: ( 'value:' )
            // InternalDeviceLexer.g:64:9: 'value:'
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
            // InternalDeviceLexer.g:66:7: ( 'arm64' )
            // InternalDeviceLexer.g:66:9: 'arm64'
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
            // InternalDeviceLexer.g:68:7: ( 'focal' )
            // InternalDeviceLexer.g:68:9: 'focal'
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
            // InternalDeviceLexer.g:70:7: ( 'jammy' )
            // InternalDeviceLexer.g:70:9: 'jammy'
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
            // InternalDeviceLexer.g:72:6: ( 'kind:' )
            // InternalDeviceLexer.g:72:8: 'kind:'
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
            // InternalDeviceLexer.g:74:6: ( 'name:' )
            // InternalDeviceLexer.g:74:8: 'name:'
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
            // InternalDeviceLexer.g:76:6: ( 'type:' )
            // InternalDeviceLexer.g:76:8: 'type:'
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
            // InternalDeviceLexer.g:78:6: ( 'Wlan' )
            // InternalDeviceLexer.g:78:8: 'Wlan'
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

    // $ANTLR start "HyphenMinusHyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:80:35: ( '---' )
            // InternalDeviceLexer.g:80:37: '---'
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

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDeviceLexer.g:82:5: ( 'x86' )
            // InternalDeviceLexer.g:82:7: 'x86'
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
            // InternalDeviceLexer.g:84:13: ( '-' )
            // InternalDeviceLexer.g:84:15: '-'
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
            // InternalDeviceLexer.g:86:21: ( '0' .. '9' )
            // InternalDeviceLexer.g:86:23: '0' .. '9'
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
            // InternalDeviceLexer.g:88:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalDeviceLexer.g:88:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalDeviceLexer.g:88:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalDeviceLexer.g:88:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalDeviceLexer.g:88:31: ( RULE_DECINT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalDeviceLexer.g:88:31: RULE_DECINT
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
                    // InternalDeviceLexer.g:88:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalDeviceLexer.g:88:44: ( '.' ( RULE_DIGIT )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDeviceLexer.g:88:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalDeviceLexer.g:88:49: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                                case 1 :
                                    // InternalDeviceLexer.g:88:49: RULE_DIGIT
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

                    // InternalDeviceLexer.g:88:73: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
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
            // InternalDeviceLexer.g:90:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalDeviceLexer.g:90:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalDeviceLexer.g:90:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalDeviceLexer.g:90:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalDeviceLexer.g:90:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalDeviceLexer.g:90:29: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalDeviceLexer.g:90:29: RULE_DIGIT
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
                    // InternalDeviceLexer.g:90:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalDeviceLexer.g:90:54: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalDeviceLexer.g:90:54: RULE_DIGIT
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
            // InternalDeviceLexer.g:92:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDeviceLexer.g:92:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalDeviceLexer.g:92:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalDeviceLexer.g:92:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalDeviceLexer.g:94:22: ()
            // InternalDeviceLexer.g:94:24:
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
            // InternalDeviceLexer.g:96:22: ()
            // InternalDeviceLexer.g:96:24:
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
            // InternalDeviceLexer.g:98:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDeviceLexer.g:98:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDeviceLexer.g:98:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDeviceLexer.g:98:11: '^'
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

            // InternalDeviceLexer.g:98:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            // InternalDeviceLexer.g:100:10: ( ( '0' .. '9' )+ )
            // InternalDeviceLexer.g:100:12: ( '0' .. '9' )+
            {
            // InternalDeviceLexer.g:100:12: ( '0' .. '9' )+
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
                    // InternalDeviceLexer.g:100:13: '0' .. '9'
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
            // InternalDeviceLexer.g:102:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDeviceLexer.g:102:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDeviceLexer.g:102:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDeviceLexer.g:102:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalDeviceLexer.g:102:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalDeviceLexer.g:102:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalDeviceLexer.g:102:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDeviceLexer.g:102:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalDeviceLexer.g:102:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalDeviceLexer.g:102:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalDeviceLexer.g:102:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDeviceLexer.g:104:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDeviceLexer.g:104:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalDeviceLexer.g:104:24: ( options {greedy=false; } : . )*
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
                    // InternalDeviceLexer.g:104:52: .
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
            // InternalDeviceLexer.g:106:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDeviceLexer.g:106:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDeviceLexer.g:106:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalDeviceLexer.g:108:16: ( . )
            // InternalDeviceLexer.g:108:18: .
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
        // InternalDeviceLexer.g:1:8: ( CommunicationConnection | ComputationDeviceType | Processor_architecture | LinuxOpertingSystem | MacOSOpertingSystem | ComputationResouce | DeviceResouce | AttributeKind | SelectionKind | Description | DeviceType | MaximumKind | MinimumKind | Core_number | Properties | Os_version | Processor | RangeKind | Container | Interface | Ethernet | Address | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | HyphenMinusHyphenMinusHyphenMinus | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=45;
        alt18 = dfa18.predict(input);
        switch (alt18) {
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
                // InternalDeviceLexer.g:1:152: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 9 :
                // InternalDeviceLexer.g:1:166: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 10 :
                // InternalDeviceLexer.g:1:180: Description
                {
                mDescription();

                }
                break;
            case 11 :
                // InternalDeviceLexer.g:1:192: DeviceType
                {
                mDeviceType();

                }
                break;
            case 12 :
                // InternalDeviceLexer.g:1:203: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 13 :
                // InternalDeviceLexer.g:1:215: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 14 :
                // InternalDeviceLexer.g:1:227: Core_number
                {
                mCore_number();

                }
                break;
            case 15 :
                // InternalDeviceLexer.g:1:239: Properties
                {
                mProperties();

                }
                break;
            case 16 :
                // InternalDeviceLexer.g:1:250: Os_version
                {
                mOs_version();

                }
                break;
            case 17 :
                // InternalDeviceLexer.g:1:261: Processor
                {
                mProcessor();

                }
                break;
            case 18 :
                // InternalDeviceLexer.g:1:271: RangeKind
                {
                mRangeKind();

                }
                break;
            case 19 :
                // InternalDeviceLexer.g:1:281: Container
                {
                mContainer();

                }
                break;
            case 20 :
                // InternalDeviceLexer.g:1:291: Interface
                {
                mInterface();

                }
                break;
            case 21 :
                // InternalDeviceLexer.g:1:301: Ethernet
                {
                mEthernet();

                }
                break;
            case 22 :
                // InternalDeviceLexer.g:1:310: Address
                {
                mAddress();

                }
                break;
            case 23 :
                // InternalDeviceLexer.g:1:318: Os_name
                {
                mOs_name();

                }
                break;
            case 24 :
                // InternalDeviceLexer.g:1:326: Debian
                {
                mDebian();

                }
                break;
            case 25 :
                // InternalDeviceLexer.g:1:333: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 26 :
                // InternalDeviceLexer.g:1:340: Value
                {
                mValue();

                }
                break;
            case 27 :
                // InternalDeviceLexer.g:1:346: Arm64
                {
                mArm64();

                }
                break;
            case 28 :
                // InternalDeviceLexer.g:1:352: Focal
                {
                mFocal();

                }
                break;
            case 29 :
                // InternalDeviceLexer.g:1:358: Jammy
                {
                mJammy();

                }
                break;
            case 30 :
                // InternalDeviceLexer.g:1:364: Kind
                {
                mKind();

                }
                break;
            case 31 :
                // InternalDeviceLexer.g:1:369: Name
                {
                mName();

                }
                break;
            case 32 :
                // InternalDeviceLexer.g:1:374: Type
                {
                mType();

                }
                break;
            case 33 :
                // InternalDeviceLexer.g:1:379: Wlan
                {
                mWlan();

                }
                break;
            case 34 :
                // InternalDeviceLexer.g:1:384: HyphenMinusHyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinusHyphenMinus();

                }
                break;
            case 35 :
                // InternalDeviceLexer.g:1:418: X86
                {
                mX86();

                }
                break;
            case 36 :
                // InternalDeviceLexer.g:1:422: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 37 :
                // InternalDeviceLexer.g:1:434: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 38 :
                // InternalDeviceLexer.g:1:446: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 39 :
                // InternalDeviceLexer.g:1:458: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 40 :
                // InternalDeviceLexer.g:1:474: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 41 :
                // InternalDeviceLexer.g:1:482: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 42 :
                // InternalDeviceLexer.g:1:491: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 43 :
                // InternalDeviceLexer.g:1:503: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 44 :
                // InternalDeviceLexer.g:1:519: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 45 :
                // InternalDeviceLexer.g:1:527: RULE_ANY_OTHER
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
            return "88:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\27\45\1\100\1\45\2\77\1\uffff\1\43\1\uffff\3\43\2\uffff\1\45\1\uffff\30\45\3\uffff\1\45\2\uffff\1\77\4\uffff\36\45\1\u0089\40\45\1\u00aa\1\uffff\30\45\1\u00c3\2\45\1\u00c6\1\u00c7\4\uffff\15\45\1\u00d5\12\45\1\uffff\1\u00e0\3\uffff\15\45\1\uffff\4\45\1\u00f2\4\45\1\u00f7\1\uffff\21\45\1\uffff\3\45\1\u010c\1\uffff\3\45\1\u0110\15\45\1\u011e\1\u011f\1\u0120\1\uffff\3\45\1\uffff\14\45\1\u0130\3\uffff\2\45\1\u0133\2\45\1\uffff\2\45\1\u0138\1\u0139\4\45\2\uffff\2\45\1\uffff\4\45\2\uffff\1\45\1\uffff\11\45\1\u014e\1\u014f\6\45\3\uffff\31\45\1\uffff\2\45\1\u0171\1\u0172\3\45\2\uffff\4\45\1\uffff\1\u017a\1\45\2\uffff";
    static final String DFA18_eofS =
        "\u017c\uffff";
    static final String DFA18_minS =
        "\1\0\2\157\1\162\1\151\1\141\1\145\1\164\2\145\1\163\1\162\1\141\1\156\1\164\1\144\1\142\1\141\1\157\1\141\1\151\1\141\1\171\1\154\1\55\1\70\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\uffff\1\155\1\157\1\156\1\143\1\156\1\142\1\164\1\154\1\166\1\137\1\157\1\156\1\164\1\150\1\144\1\155\1\165\1\154\1\143\1\155\1\156\1\155\1\160\1\141\3\uffff\1\66\2\uffff\1\60\4\uffff\1\155\1\145\1\164\1\160\1\143\1\165\1\117\3\151\1\143\1\151\1\162\1\145\1\151\1\156\1\143\1\147\2\145\1\162\1\66\1\156\1\165\1\141\1\155\1\144\2\145\1\156\1\60\2\165\1\137\1\141\1\165\2\145\1\170\1\123\2\155\1\143\1\162\1\141\1\151\2\143\1\145\1\141\2\145\2\162\1\145\1\64\1\164\1\145\1\154\1\171\3\72\1\60\1\uffff\1\156\1\164\1\156\1\151\1\164\1\163\1\162\2\117\2\165\1\145\1\151\1\156\1\142\1\164\1\145\1\162\1\155\1\163\1\113\1\146\1\156\1\163\1\60\1\165\1\72\2\60\4\uffff\1\151\1\141\1\165\1\156\1\141\1\163\1\164\2\160\2\155\1\122\1\160\1\60\1\165\1\151\1\124\1\163\1\145\1\163\1\151\1\141\1\145\1\163\1\uffff\1\60\3\uffff\1\143\1\164\1\155\1\145\1\164\1\157\1\151\2\145\2\113\1\145\1\164\1\uffff\1\164\1\157\1\171\1\151\1\60\1\157\1\156\1\143\1\164\1\60\1\uffff\1\141\1\151\1\142\1\162\1\151\1\162\1\145\2\162\2\151\1\163\1\151\1\145\1\156\1\160\1\157\1\uffff\1\162\1\144\1\145\1\60\1\uffff\1\164\1\157\1\145\1\60\1\157\1\137\1\163\2\164\2\156\2\157\2\113\1\145\1\156\3\60\1\uffff\1\151\1\156\1\162\1\uffff\1\156\1\141\1\72\2\151\2\144\1\165\1\156\2\151\1\72\1\60\3\uffff\1\157\1\122\1\60\1\104\1\162\1\uffff\2\156\2\60\1\143\1\72\2\156\2\uffff\1\156\1\145\1\uffff\1\145\1\143\2\147\2\uffff\1\145\1\uffff\2\144\1\103\1\163\1\166\1\150\2\123\1\72\2\60\2\157\2\151\2\171\3\uffff\1\156\1\165\1\143\1\164\2\163\1\156\1\143\2\145\2\164\2\145\1\124\1\143\2\145\1\143\1\72\1\171\1\164\2\155\1\164\1\uffff\1\160\1\165\2\60\1\151\1\145\1\162\2\uffff\1\157\1\72\1\145\1\156\1\uffff\1\60\1\72\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\2\157\1\162\2\151\1\145\1\164\2\145\1\163\1\162\1\141\1\156\1\164\1\162\1\142\1\141\1\157\1\141\1\151\1\141\1\171\1\154\1\71\1\70\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\162\1\uffff\1\155\1\157\1\156\1\170\1\156\1\166\1\164\1\154\1\166\1\137\1\157\1\156\1\164\1\150\1\144\1\155\1\165\1\154\1\143\1\155\1\156\1\155\1\160\1\141\3\uffff\1\66\2\uffff\1\71\4\uffff\1\160\1\145\1\164\2\160\1\165\1\117\3\151\1\143\1\151\1\162\1\145\1\151\1\166\1\143\1\147\2\145\1\162\1\66\1\156\1\165\1\141\1\155\1\144\2\145\1\156\1\172\2\165\1\137\1\141\1\165\2\145\1\170\1\123\2\155\1\143\1\162\1\141\1\151\2\143\1\145\1\141\2\145\2\162\1\145\1\64\1\164\1\145\1\154\1\171\3\72\1\172\1\uffff\1\156\1\164\1\156\1\151\1\164\1\163\1\162\2\117\2\165\1\145\1\151\1\156\1\142\1\164\1\145\1\162\1\155\1\163\1\113\1\146\1\156\1\163\1\172\1\165\1\72\2\172\4\uffff\1\151\1\141\1\165\1\156\1\141\1\163\1\164\2\160\2\155\1\122\1\160\1\172\1\165\1\151\1\124\1\163\1\145\1\163\1\151\1\141\1\145\1\163\1\uffff\1\172\3\uffff\1\143\1\164\1\155\1\145\1\164\1\157\1\151\2\145\2\113\1\145\1\164\1\uffff\1\164\1\157\1\171\1\151\1\172\1\157\1\156\1\143\1\164\1\172\1\uffff\1\141\1\151\1\142\1\162\1\151\1\162\1\145\2\162\2\151\1\163\1\151\1\145\1\156\1\160\1\157\1\uffff\1\162\1\144\1\145\1\172\1\uffff\1\164\1\157\1\145\1\172\1\157\1\137\1\163\2\164\2\156\2\157\2\113\1\145\1\156\3\172\1\uffff\1\151\1\156\1\162\1\uffff\1\156\1\141\1\72\2\151\2\144\1\165\1\156\2\151\1\72\1\172\3\uffff\1\157\1\122\1\172\1\104\1\162\1\uffff\2\156\2\172\1\143\1\72\2\156\2\uffff\1\156\1\145\1\uffff\1\145\1\143\2\147\2\uffff\1\145\1\uffff\2\144\1\103\1\163\1\166\1\150\2\123\1\72\2\172\2\157\2\151\2\171\3\uffff\1\156\1\165\1\143\1\164\2\163\1\156\1\143\2\145\2\164\2\145\1\124\1\143\2\145\1\143\1\72\1\171\1\164\2\155\1\164\1\uffff\1\160\1\165\2\172\1\151\1\145\1\162\2\uffff\1\157\1\72\1\145\1\156\1\uffff\1\172\1\72\2\uffff";
    static final String DFA18_acceptS =
        "\34\uffff\1\47\1\uffff\1\50\3\uffff\1\54\1\55\1\uffff\1\50\30\uffff\1\42\1\46\1\44\1\uffff\1\51\1\45\1\uffff\1\47\1\52\1\53\1\54\100\uffff\1\43\35\uffff\1\36\1\37\1\40\1\41\30\uffff\1\33\1\uffff\1\32\1\34\1\35\15\uffff\1\30\12\uffff\1\31\21\uffff\1\27\4\uffff\1\26\24\uffff\1\25\3\uffff\1\23\15\uffff\1\21\1\22\1\24\5\uffff\1\17\10\uffff\1\13\1\20\2\uffff\1\16\4\uffff\1\14\1\15\1\uffff\1\12\21\uffff\1\7\1\10\1\11\31\uffff\1\6\7\uffff\1\4\1\5\4\uffff\1\2\2\uffff\1\3\1\1";
    static final String DFA18_specialS =
        "\1\0\36\uffff\1\2\1\1\u015b\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\1\34\3\43\1\40\5\43\1\30\1\43\1\41\1\32\11\33\7\43\1\7\1\36\1\2\1\11\1\16\6\36\1\4\1\5\2\36\1\13\1\36\1\14\1\10\3\36\1\27\3\36\3\43\1\35\1\36\1\43\1\17\1\36\1\1\1\6\1\36\1\22\2\36\1\15\1\23\1\24\2\36\1\25\1\12\1\3\3\36\1\26\1\20\1\21\1\36\1\31\2\36\uff85\43",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\7\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\15\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\2\uffff\12\77",
            "\1\101",
            "\1\103\1\uffff\12\102\13\uffff\1\103\37\uffff\1\103",
            "\1\103\1\uffff\12\104\13\uffff\1\103\37\uffff\1\103",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\106",
            "\0\106",
            "\1\107",
            "",
            "",
            "\1\111\1\113\3\uffff\1\112",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\24\uffff\1\120",
            "\1\121",
            "\1\124\20\uffff\1\123\2\uffff\1\122",
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
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "\1\147",
            "",
            "",
            "\12\104",
            "",
            "",
            "",
            "",
            "\1\150\2\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155\14\uffff\1\156",
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
            "\1\172\7\uffff\1\171",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c4",
            "\1\u00c5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
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
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
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
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\u0131",
            "\1\u0132",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "",
            "",
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
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u017b",
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
            return "1:1: Tokens : ( CommunicationConnection | ComputationDeviceType | Processor_architecture | LinuxOpertingSystem | MacOSOpertingSystem | ComputationResouce | DeviceResouce | AttributeKind | SelectionKind | Description | DeviceType | MaximumKind | MinimumKind | Core_number | Properties | Os_version | Processor | RangeKind | Container | Interface | Ethernet | Address | Os_name | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | HyphenMinusHyphenMinusHyphenMinus | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='c') ) {s = 1;}

                        else if ( (LA18_0=='C') ) {s = 2;}

                        else if ( (LA18_0=='p') ) {s = 3;}

                        else if ( (LA18_0=='L') ) {s = 4;}

                        else if ( (LA18_0=='M') ) {s = 5;}

                        else if ( (LA18_0=='d') ) {s = 6;}

                        else if ( (LA18_0=='A') ) {s = 7;}

                        else if ( (LA18_0=='S') ) {s = 8;}

                        else if ( (LA18_0=='D') ) {s = 9;}

                        else if ( (LA18_0=='o') ) {s = 10;}

                        else if ( (LA18_0=='P') ) {s = 11;}

                        else if ( (LA18_0=='R') ) {s = 12;}

                        else if ( (LA18_0=='i') ) {s = 13;}

                        else if ( (LA18_0=='E') ) {s = 14;}

                        else if ( (LA18_0=='a') ) {s = 15;}

                        else if ( (LA18_0=='u') ) {s = 16;}

                        else if ( (LA18_0=='v') ) {s = 17;}

                        else if ( (LA18_0=='f') ) {s = 18;}

                        else if ( (LA18_0=='j') ) {s = 19;}

                        else if ( (LA18_0=='k') ) {s = 20;}

                        else if ( (LA18_0=='n') ) {s = 21;}

                        else if ( (LA18_0=='t') ) {s = 22;}

                        else if ( (LA18_0=='W') ) {s = 23;}

                        else if ( (LA18_0=='-') ) {s = 24;}

                        else if ( (LA18_0=='x') ) {s = 25;}

                        else if ( (LA18_0=='0') ) {s = 26;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 27;}

                        else if ( (LA18_0=='#') ) {s = 28;}

                        else if ( (LA18_0=='^') ) {s = 29;}

                        else if ( (LA18_0=='B'||(LA18_0>='F' && LA18_0<='K')||(LA18_0>='N' && LA18_0<='O')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='b'||LA18_0=='e'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='l' && LA18_0<='m')||(LA18_0>='q' && LA18_0<='s')||LA18_0=='w'||(LA18_0>='y' && LA18_0<='z')) ) {s = 30;}

                        else if ( (LA18_0=='\"') ) {s = 31;}

                        else if ( (LA18_0=='\'') ) {s = 32;}

                        else if ( (LA18_0=='/') ) {s = 33;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 34;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=',')||LA18_0=='.'||(LA18_0>=':' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA18_32 = input.LA(1);

                        s = -1;
                        if ( ((LA18_32>='\u0000' && LA18_32<='\uFFFF')) ) {s = 70;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA18_31 = input.LA(1);

                        s = -1;
                        if ( ((LA18_31>='\u0000' && LA18_31<='\uFFFF')) ) {s = 70;}

                        else s = 35;

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
