package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanLexer extends Lexer {
    public static final int SoftwareComponents=7;
    public static final int DeployTo=24;
    public static final int AttributeKind=9;
    public static final int Noetic=32;
    public static final int Name=40;
    public static final int Assignment=16;
    public static final int Container=23;
    public static final int Debian=30;
    public static final int Version=27;
    public static final int Kind=39;
    public static final int To=44;
    public static final int ExecutedBy=17;
    public static final int Ubuntu=33;
    public static final int RULE_DEDENT=53;
    public static final int LinuxOpertingSystem=5;
    public static final int RULE_ID=54;
    public static final int Resource=25;
    public static final int RULE_DIGIT=48;
    public static final int Middleware=18;
    public static final int SelectionKind=10;
    public static final int Arm64=35;
    public static final int RULE_INT=55;
    public static final int Ethernet=26;
    public static final int Value=34;
    public static final int RULE_ML_COMMENT=57;
    public static final int Description=12;
    public static final int Processor=21;
    public static final int StartCommand=11;
    public static final int RULE_STRING=56;
    public static final int Focal=36;
    public static final int Wlan=42;
    public static final int Properties=19;
    public static final int RULE_SL_COMMENT=51;
    public static final int Os_name=28;
    public static final int HyphenMinus=46;
    public static final int RULE_DOUBLE=50;
    public static final int X86=45;
    public static final int Colon=47;
    public static final int RULE_DECINT=49;
    public static final int DeploymentPlan=8;
    public static final int MinimumKind=15;
    public static final int EOF=-1;
    public static final int RULE_INDENT=52;
    public static final int Jammy=38;
    public static final int Usb=43;
    public static final int RULE_WS=58;
    public static final int Rolling=29;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=14;
    public static final int From=37;
    public static final int RULE_ANY_OTHER=59;
    public static final int RangeKind=22;
    public static final int Os_version=20;
    public static final int Type=41;
    public static final int MacOSOpertingSystem=6;
    public static final int RuntimeType=13;
    public static final int Humble=31;

    // delegates
    // delegators

    public InternalPlanLexer() {;}
    public InternalPlanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPlanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPlanLexer.g"; }

    // $ANTLR start "ExecutionConfiguration"
    public final void mExecutionConfiguration() throws RecognitionException {
        try {
            int _type = ExecutionConfiguration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:14:24: ( 'executionConfiguration:' )
            // InternalPlanLexer.g:14:26: 'executionConfiguration:'
            {
            match("executionConfiguration:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExecutionConfiguration"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:16:21: ( 'LinuxOpertingSystem' )
            // InternalPlanLexer.g:16:23: 'LinuxOpertingSystem'
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
            // InternalPlanLexer.g:18:21: ( 'MacOSOpertingSystem' )
            // InternalPlanLexer.g:18:23: 'MacOSOpertingSystem'
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

    // $ANTLR start "SoftwareComponents"
    public final void mSoftwareComponents() throws RecognitionException {
        try {
            int _type = SoftwareComponents;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:20:20: ( 'softwareComponents:' )
            // InternalPlanLexer.g:20:22: 'softwareComponents:'
            {
            match("softwareComponents:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SoftwareComponents"

    // $ANTLR start "DeploymentPlan"
    public final void mDeploymentPlan() throws RecognitionException {
        try {
            int _type = DeploymentPlan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:22:16: ( 'DeploymentPlan:' )
            // InternalPlanLexer.g:22:18: 'DeploymentPlan:'
            {
            match("DeploymentPlan:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeploymentPlan"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:24:15: ( 'AttributeKind' )
            // InternalPlanLexer.g:24:17: 'AttributeKind'
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
            // InternalPlanLexer.g:26:15: ( 'SelectionKind' )
            // InternalPlanLexer.g:26:17: 'SelectionKind'
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

    // $ANTLR start "StartCommand"
    public final void mStartCommand() throws RecognitionException {
        try {
            int _type = StartCommand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:28:14: ( 'startCommand:' )
            // InternalPlanLexer.g:28:16: 'startCommand:'
            {
            match("startCommand:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StartCommand"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:30:13: ( 'description:' )
            // InternalPlanLexer.g:30:15: 'description:'
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

    // $ANTLR start "RuntimeType"
    public final void mRuntimeType() throws RecognitionException {
        try {
            int _type = RuntimeType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:32:13: ( 'runtimeType:' )
            // InternalPlanLexer.g:32:15: 'runtimeType:'
            {
            match("runtimeType:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RuntimeType"

    // $ANTLR start "MaximumKind"
    public final void mMaximumKind() throws RecognitionException {
        try {
            int _type = MaximumKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:34:13: ( 'MaximumKind' )
            // InternalPlanLexer.g:34:15: 'MaximumKind'
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
            // InternalPlanLexer.g:36:13: ( 'MinimumKind' )
            // InternalPlanLexer.g:36:15: 'MinimumKind'
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

    // $ANTLR start "Assignment"
    public final void mAssignment() throws RecognitionException {
        try {
            int _type = Assignment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:38:12: ( 'assignment:' )
            // InternalPlanLexer.g:38:14: 'assignment:'
            {
            match("assignment:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assignment"

    // $ANTLR start "ExecutedBy"
    public final void mExecutedBy() throws RecognitionException {
        try {
            int _type = ExecutedBy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:40:12: ( 'executedBy:' )
            // InternalPlanLexer.g:40:14: 'executedBy:'
            {
            match("executedBy:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExecutedBy"

    // $ANTLR start "Middleware"
    public final void mMiddleware() throws RecognitionException {
        try {
            int _type = Middleware;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:42:12: ( 'middleware:' )
            // InternalPlanLexer.g:42:14: 'middleware:'
            {
            match("middleware:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Middleware"

    // $ANTLR start "Properties"
    public final void mProperties() throws RecognitionException {
        try {
            int _type = Properties;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:44:12: ( 'properties:' )
            // InternalPlanLexer.g:44:14: 'properties:'
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
            // InternalPlanLexer.g:46:12: ( 'os_version' )
            // InternalPlanLexer.g:46:14: 'os_version'
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
            // InternalPlanLexer.g:48:11: ( 'Processor' )
            // InternalPlanLexer.g:48:13: 'Processor'
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
            // InternalPlanLexer.g:50:11: ( 'RangeKind' )
            // InternalPlanLexer.g:50:13: 'RangeKind'
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
            // InternalPlanLexer.g:52:11: ( 'container' )
            // InternalPlanLexer.g:52:13: 'container'
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

    // $ANTLR start "DeployTo"
    public final void mDeployTo() throws RecognitionException {
        try {
            int _type = DeployTo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:54:10: ( 'deployTo:' )
            // InternalPlanLexer.g:54:12: 'deployTo:'
            {
            match("deployTo:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeployTo"

    // $ANTLR start "Resource"
    public final void mResource() throws RecognitionException {
        try {
            int _type = Resource;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:56:10: ( 'resource:' )
            // InternalPlanLexer.g:56:12: 'resource:'
            {
            match("resource:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Resource"

    // $ANTLR start "Ethernet"
    public final void mEthernet() throws RecognitionException {
        try {
            int _type = Ethernet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:58:10: ( 'Ethernet' )
            // InternalPlanLexer.g:58:12: 'Ethernet'
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

    // $ANTLR start "Version"
    public final void mVersion() throws RecognitionException {
        try {
            int _type = Version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:60:9: ( 'version:' )
            // InternalPlanLexer.g:60:11: 'version:'
            {
            match("version:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Version"

    // $ANTLR start "Os_name"
    public final void mOs_name() throws RecognitionException {
        try {
            int _type = Os_name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:62:9: ( 'os_name' )
            // InternalPlanLexer.g:62:11: 'os_name'
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

    // $ANTLR start "Rolling"
    public final void mRolling() throws RecognitionException {
        try {
            int _type = Rolling;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:64:9: ( 'rolling' )
            // InternalPlanLexer.g:64:11: 'rolling'
            {
            match("rolling");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rolling"

    // $ANTLR start "Debian"
    public final void mDebian() throws RecognitionException {
        try {
            int _type = Debian;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:66:8: ( 'debian' )
            // InternalPlanLexer.g:66:10: 'debian'
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

    // $ANTLR start "Humble"
    public final void mHumble() throws RecognitionException {
        try {
            int _type = Humble;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:68:8: ( 'humble' )
            // InternalPlanLexer.g:68:10: 'humble'
            {
            match("humble");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Humble"

    // $ANTLR start "Noetic"
    public final void mNoetic() throws RecognitionException {
        try {
            int _type = Noetic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:70:8: ( 'noetic' )
            // InternalPlanLexer.g:70:10: 'noetic'
            {
            match("noetic");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Noetic"

    // $ANTLR start "Ubuntu"
    public final void mUbuntu() throws RecognitionException {
        try {
            int _type = Ubuntu;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:72:8: ( 'ubuntu' )
            // InternalPlanLexer.g:72:10: 'ubuntu'
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
            // InternalPlanLexer.g:74:7: ( 'value:' )
            // InternalPlanLexer.g:74:9: 'value:'
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
            // InternalPlanLexer.g:76:7: ( 'arm64' )
            // InternalPlanLexer.g:76:9: 'arm64'
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
            // InternalPlanLexer.g:78:7: ( 'focal' )
            // InternalPlanLexer.g:78:9: 'focal'
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
            // InternalPlanLexer.g:80:6: ( 'from:' )
            // InternalPlanLexer.g:80:8: 'from:'
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
            // InternalPlanLexer.g:82:7: ( 'jammy' )
            // InternalPlanLexer.g:82:9: 'jammy'
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
            // InternalPlanLexer.g:84:6: ( 'kind:' )
            // InternalPlanLexer.g:84:8: 'kind:'
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
            // InternalPlanLexer.g:86:6: ( 'name:' )
            // InternalPlanLexer.g:86:8: 'name:'
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
            // InternalPlanLexer.g:88:6: ( 'type:' )
            // InternalPlanLexer.g:88:8: 'type:'
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
            // InternalPlanLexer.g:90:6: ( 'Wlan' )
            // InternalPlanLexer.g:90:8: 'Wlan'
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
            // InternalPlanLexer.g:92:5: ( 'Usb' )
            // InternalPlanLexer.g:92:7: 'Usb'
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

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:94:4: ( 'to:' )
            // InternalPlanLexer.g:94:6: 'to:'
            {
            match("to:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:96:5: ( 'x86' )
            // InternalPlanLexer.g:96:7: 'x86'
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
            // InternalPlanLexer.g:98:13: ( '-' )
            // InternalPlanLexer.g:98:15: '-'
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanLexer.g:100:7: ( ':' )
            // InternalPlanLexer.g:100:9: ':'
            {
            match(':');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalPlanLexer.g:102:21: ( '0' .. '9' )
            // InternalPlanLexer.g:102:23: '0' .. '9'
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
            // InternalPlanLexer.g:104:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalPlanLexer.g:104:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalPlanLexer.g:104:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalPlanLexer.g:104:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalPlanLexer.g:104:31: ( RULE_DECINT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalPlanLexer.g:104:31: RULE_DECINT
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
                    // InternalPlanLexer.g:104:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalPlanLexer.g:104:44: ( '.' ( RULE_DIGIT )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalPlanLexer.g:104:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalPlanLexer.g:104:49: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                                case 1 :
                                    // InternalPlanLexer.g:104:49: RULE_DIGIT
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

                    // InternalPlanLexer.g:104:73: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalPlanLexer.g:
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
            // InternalPlanLexer.g:106:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalPlanLexer.g:106:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalPlanLexer.g:106:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalPlanLexer.g:106:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalPlanLexer.g:106:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalPlanLexer.g:106:29: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalPlanLexer.g:106:29: RULE_DIGIT
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
                    // InternalPlanLexer.g:106:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalPlanLexer.g:106:54: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalPlanLexer.g:106:54: RULE_DIGIT
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
            // InternalPlanLexer.g:108:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalPlanLexer.g:108:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalPlanLexer.g:108:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalPlanLexer.g:108:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalPlanLexer.g:110:22: ()
            // InternalPlanLexer.g:110:24:
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
            // InternalPlanLexer.g:112:22: ()
            // InternalPlanLexer.g:112:24:
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
            // InternalPlanLexer.g:114:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPlanLexer.g:114:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPlanLexer.g:114:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPlanLexer.g:114:11: '^'
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

            // InternalPlanLexer.g:114:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalPlanLexer.g:
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
            // InternalPlanLexer.g:116:10: ( ( '0' .. '9' )+ )
            // InternalPlanLexer.g:116:12: ( '0' .. '9' )+
            {
            // InternalPlanLexer.g:116:12: ( '0' .. '9' )+
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
                    // InternalPlanLexer.g:116:13: '0' .. '9'
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
            // InternalPlanLexer.g:118:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPlanLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPlanLexer.g:118:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPlanLexer.g:118:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalPlanLexer.g:118:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalPlanLexer.g:118:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalPlanLexer.g:118:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPlanLexer.g:118:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalPlanLexer.g:118:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalPlanLexer.g:118:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalPlanLexer.g:118:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPlanLexer.g:120:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPlanLexer.g:120:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalPlanLexer.g:120:24: ( options {greedy=false; } : . )*
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
                    // InternalPlanLexer.g:120:52: .
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
            // InternalPlanLexer.g:122:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPlanLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPlanLexer.g:122:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
                    // InternalPlanLexer.g:
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
            // InternalPlanLexer.g:124:16: ( . )
            // InternalPlanLexer.g:124:18: .
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
        // InternalPlanLexer.g:1:8: ( ExecutionConfiguration | LinuxOpertingSystem | MacOSOpertingSystem | SoftwareComponents | DeploymentPlan | AttributeKind | SelectionKind | StartCommand | Description | RuntimeType | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | Properties | Os_version | Processor | RangeKind | Container | DeployTo | Resource | Ethernet | Version | Os_name | Rolling | Debian | Humble | Noetic | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | To | X86 | HyphenMinus | Colon | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=53;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalPlanLexer.g:1:10: ExecutionConfiguration
                {
                mExecutionConfiguration();

                }
                break;
            case 2 :
                // InternalPlanLexer.g:1:33: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 3 :
                // InternalPlanLexer.g:1:53: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 4 :
                // InternalPlanLexer.g:1:73: SoftwareComponents
                {
                mSoftwareComponents();

                }
                break;
            case 5 :
                // InternalPlanLexer.g:1:92: DeploymentPlan
                {
                mDeploymentPlan();

                }
                break;
            case 6 :
                // InternalPlanLexer.g:1:107: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 7 :
                // InternalPlanLexer.g:1:121: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 8 :
                // InternalPlanLexer.g:1:135: StartCommand
                {
                mStartCommand();

                }
                break;
            case 9 :
                // InternalPlanLexer.g:1:148: Description
                {
                mDescription();

                }
                break;
            case 10 :
                // InternalPlanLexer.g:1:160: RuntimeType
                {
                mRuntimeType();

                }
                break;
            case 11 :
                // InternalPlanLexer.g:1:172: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 12 :
                // InternalPlanLexer.g:1:184: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 13 :
                // InternalPlanLexer.g:1:196: Assignment
                {
                mAssignment();

                }
                break;
            case 14 :
                // InternalPlanLexer.g:1:207: ExecutedBy
                {
                mExecutedBy();

                }
                break;
            case 15 :
                // InternalPlanLexer.g:1:218: Middleware
                {
                mMiddleware();

                }
                break;
            case 16 :
                // InternalPlanLexer.g:1:229: Properties
                {
                mProperties();

                }
                break;
            case 17 :
                // InternalPlanLexer.g:1:240: Os_version
                {
                mOs_version();

                }
                break;
            case 18 :
                // InternalPlanLexer.g:1:251: Processor
                {
                mProcessor();

                }
                break;
            case 19 :
                // InternalPlanLexer.g:1:261: RangeKind
                {
                mRangeKind();

                }
                break;
            case 20 :
                // InternalPlanLexer.g:1:271: Container
                {
                mContainer();

                }
                break;
            case 21 :
                // InternalPlanLexer.g:1:281: DeployTo
                {
                mDeployTo();

                }
                break;
            case 22 :
                // InternalPlanLexer.g:1:290: Resource
                {
                mResource();

                }
                break;
            case 23 :
                // InternalPlanLexer.g:1:299: Ethernet
                {
                mEthernet();

                }
                break;
            case 24 :
                // InternalPlanLexer.g:1:308: Version
                {
                mVersion();

                }
                break;
            case 25 :
                // InternalPlanLexer.g:1:316: Os_name
                {
                mOs_name();

                }
                break;
            case 26 :
                // InternalPlanLexer.g:1:324: Rolling
                {
                mRolling();

                }
                break;
            case 27 :
                // InternalPlanLexer.g:1:332: Debian
                {
                mDebian();

                }
                break;
            case 28 :
                // InternalPlanLexer.g:1:339: Humble
                {
                mHumble();

                }
                break;
            case 29 :
                // InternalPlanLexer.g:1:346: Noetic
                {
                mNoetic();

                }
                break;
            case 30 :
                // InternalPlanLexer.g:1:353: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 31 :
                // InternalPlanLexer.g:1:360: Value
                {
                mValue();

                }
                break;
            case 32 :
                // InternalPlanLexer.g:1:366: Arm64
                {
                mArm64();

                }
                break;
            case 33 :
                // InternalPlanLexer.g:1:372: Focal
                {
                mFocal();

                }
                break;
            case 34 :
                // InternalPlanLexer.g:1:378: From
                {
                mFrom();

                }
                break;
            case 35 :
                // InternalPlanLexer.g:1:383: Jammy
                {
                mJammy();

                }
                break;
            case 36 :
                // InternalPlanLexer.g:1:389: Kind
                {
                mKind();

                }
                break;
            case 37 :
                // InternalPlanLexer.g:1:394: Name
                {
                mName();

                }
                break;
            case 38 :
                // InternalPlanLexer.g:1:399: Type
                {
                mType();

                }
                break;
            case 39 :
                // InternalPlanLexer.g:1:404: Wlan
                {
                mWlan();

                }
                break;
            case 40 :
                // InternalPlanLexer.g:1:409: Usb
                {
                mUsb();

                }
                break;
            case 41 :
                // InternalPlanLexer.g:1:413: To
                {
                mTo();

                }
                break;
            case 42 :
                // InternalPlanLexer.g:1:416: X86
                {
                mX86();

                }
                break;
            case 43 :
                // InternalPlanLexer.g:1:420: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 44 :
                // InternalPlanLexer.g:1:432: Colon
                {
                mColon();

                }
                break;
            case 45 :
                // InternalPlanLexer.g:1:438: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 46 :
                // InternalPlanLexer.g:1:450: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 47 :
                // InternalPlanLexer.g:1:462: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 48 :
                // InternalPlanLexer.g:1:478: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 49 :
                // InternalPlanLexer.g:1:486: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 50 :
                // InternalPlanLexer.g:1:495: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 51 :
                // InternalPlanLexer.g:1:507: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 52 :
                // InternalPlanLexer.g:1:523: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 53 :
                // InternalPlanLexer.g:1:531: RULE_ANY_OTHER
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
            return "104:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\34\52\1\120\1\uffff\2\117\1\uffff\1\50\1\uffff\3\50\2\uffff\1\52\1\uffff\44\52\5\uffff\1\117\4\uffff\44\52\1\uffff\1\52\1\u00a7\1\u00a8\45\52\1\u00ce\2\uffff\21\52\1\u00e0\14\52\1\uffff\1\52\1\u00ee\1\uffff\1\u00ef\3\uffff\14\52\1\u00fd\4\52\1\uffff\11\52\1\uffff\1\u010b\1\u010c\1\u010d\2\uffff\15\52\1\uffff\2\52\1\u011d\4\52\1\u0122\5\52\3\uffff\17\52\1\uffff\4\52\1\uffff\3\52\1\u013e\1\uffff\14\52\1\uffff\1\52\1\uffff\4\52\1\u0150\1\u0151\1\u0152\1\uffff\20\52\1\u0163\3\uffff\1\52\1\uffff\2\52\1\u0167\1\u0168\7\52\4\uffff\3\52\2\uffff\5\52\2\uffff\4\52\1\uffff\1\52\1\u017d\1\u017e\5\52\2\uffff\4\52\1\uffff\15\52\1\u0195\1\u0196\1\uffff\1\52\2\uffff\2\52\1\uffff";
    static final String DFA18_eofS =
        "\u019a\uffff";
    static final String DFA18_minS =
        "\1\0\1\170\1\151\1\141\1\157\1\145\1\164\3\145\1\162\1\151\1\162\1\163\1\162\1\141\1\157\1\164\1\141\1\165\1\141\1\142\1\157\1\141\1\151\1\157\1\154\1\163\1\70\1\60\1\uffff\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\156\1\143\1\156\1\146\1\141\1\160\1\164\1\154\1\142\1\156\1\163\1\154\1\163\1\155\1\144\1\157\1\137\1\157\2\156\1\150\1\162\1\154\1\155\1\145\1\155\1\165\1\143\1\157\1\155\1\156\1\160\1\72\1\141\1\142\1\66\5\uffff\1\60\4\uffff\1\143\1\165\1\117\2\151\1\164\1\162\1\154\1\162\1\145\1\143\1\154\1\151\1\164\1\157\1\154\1\151\1\66\1\144\1\160\1\156\1\143\1\147\1\164\1\145\1\163\1\165\1\142\1\164\1\145\1\156\1\141\2\155\1\144\1\145\1\uffff\1\156\2\60\1\165\1\170\1\123\2\155\1\167\1\164\1\157\1\151\1\143\1\162\1\157\1\141\1\151\1\165\1\151\1\147\1\64\1\154\2\145\1\141\2\145\1\141\1\162\1\151\1\145\1\154\1\151\1\72\1\164\1\154\1\72\1\171\2\72\1\60\2\uffff\1\164\2\117\2\165\1\141\1\103\1\171\1\142\1\164\1\151\1\171\1\156\1\155\1\162\2\156\1\60\1\145\2\162\1\155\1\163\1\113\1\151\1\156\1\157\1\72\1\145\1\143\1\uffff\1\165\1\60\1\uffff\1\60\3\uffff\1\145\2\160\2\155\1\162\1\157\1\155\1\165\1\151\1\160\1\124\1\60\1\145\1\143\1\147\1\155\1\uffff\1\167\1\164\1\163\1\145\1\163\1\151\1\156\1\145\1\156\1\uffff\3\60\2\uffff\1\157\1\144\2\145\2\113\1\145\1\155\1\145\1\164\1\157\1\164\1\157\1\uffff\1\124\1\145\1\60\1\145\1\141\2\151\1\60\1\157\1\156\1\145\1\164\1\72\3\uffff\1\156\1\102\2\162\2\151\1\103\1\155\1\156\1\145\1\156\1\151\1\72\1\171\1\72\1\uffff\1\156\1\162\1\145\1\157\1\uffff\1\162\1\144\1\162\1\60\1\uffff\1\103\1\171\2\164\2\156\1\157\1\141\1\164\2\113\1\157\1\uffff\1\160\1\uffff\1\164\1\145\1\163\1\156\3\60\1\uffff\1\157\1\72\2\151\2\144\1\155\1\156\1\120\2\151\1\156\1\145\3\72\1\60\3\uffff\1\156\1\uffff\2\156\2\60\1\160\1\144\1\154\2\156\2\72\4\uffff\1\146\2\147\2\uffff\1\157\1\72\1\141\2\144\2\uffff\1\151\2\123\1\156\1\uffff\1\156\2\60\1\147\2\171\1\145\1\72\2\uffff\1\165\2\163\1\156\1\uffff\1\162\3\164\1\141\2\145\1\163\1\164\2\155\1\72\1\151\2\60\1\uffff\1\157\2\uffff\1\156\1\72\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\170\2\151\1\164\1\145\1\164\2\145\1\165\1\163\1\151\1\162\1\163\1\162\1\141\1\157\1\164\1\145\1\165\1\157\1\142\1\162\1\141\1\151\1\171\1\154\1\163\1\70\1\71\1\uffff\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\145\1\uffff\1\156\1\170\1\156\1\146\1\141\1\160\1\164\1\154\1\163\1\156\1\163\1\154\1\163\1\155\1\144\1\157\1\137\1\157\2\156\1\150\1\162\1\154\1\155\1\145\1\155\1\165\1\143\1\157\1\155\1\156\1\160\1\72\1\141\1\142\1\66\5\uffff\1\71\4\uffff\1\143\1\165\1\117\2\151\1\164\1\162\1\154\1\162\1\145\1\143\1\154\1\151\1\164\1\157\1\154\1\151\1\66\1\144\1\160\1\166\1\143\1\147\1\164\1\145\1\163\1\165\1\142\1\164\1\145\1\156\1\141\2\155\1\144\1\145\1\uffff\1\156\2\172\1\165\1\170\1\123\2\155\1\167\1\164\1\157\1\151\1\143\1\162\1\157\1\141\1\151\1\165\1\151\1\147\1\64\1\154\2\145\1\141\2\145\1\141\1\162\1\151\1\145\1\154\1\151\1\72\1\164\1\154\1\72\1\171\2\72\1\172\2\uffff\1\164\2\117\2\165\1\141\1\103\1\171\1\142\1\164\1\151\1\171\1\156\1\155\1\162\2\156\1\172\1\145\2\162\1\155\1\163\1\113\1\151\1\156\1\157\1\72\1\145\1\143\1\uffff\1\165\1\172\1\uffff\1\172\3\uffff\1\151\2\160\2\155\1\162\1\157\1\155\1\165\1\151\1\160\1\124\1\172\1\145\1\143\1\147\1\155\1\uffff\1\167\1\164\1\163\1\145\1\163\1\151\1\156\1\145\1\156\1\uffff\3\172\2\uffff\1\157\1\144\2\145\2\113\1\145\1\155\1\145\1\164\1\157\1\164\1\157\1\uffff\1\124\1\145\1\172\1\145\1\141\2\151\1\172\1\157\1\156\1\145\1\164\1\72\3\uffff\1\156\1\102\2\162\2\151\1\103\1\155\1\156\1\145\1\156\1\151\1\72\1\171\1\72\1\uffff\1\156\1\162\1\145\1\157\1\uffff\1\162\1\144\1\162\1\172\1\uffff\1\103\1\171\2\164\2\156\1\157\1\141\1\164\2\113\1\157\1\uffff\1\160\1\uffff\1\164\1\145\1\163\1\156\3\172\1\uffff\1\157\1\72\2\151\2\144\1\155\1\156\1\120\2\151\1\156\1\145\3\72\1\172\3\uffff\1\156\1\uffff\2\156\2\172\1\160\1\144\1\154\2\156\2\72\4\uffff\1\146\2\147\2\uffff\1\157\1\72\1\141\2\144\2\uffff\1\151\2\123\1\156\1\uffff\1\156\2\172\1\147\2\171\1\145\1\72\2\uffff\1\165\2\163\1\156\1\uffff\1\162\3\164\1\141\2\145\1\163\1\164\2\155\1\72\1\151\2\172\1\uffff\1\157\2\uffff\1\156\1\72\1\uffff";
    static final String DFA18_acceptS =
        "\36\uffff\1\54\2\uffff\1\57\1\uffff\1\60\3\uffff\1\64\1\65\1\uffff\1\60\44\uffff\1\56\1\53\1\54\1\61\1\55\1\uffff\1\57\1\62\1\63\1\64\44\uffff\1\51\51\uffff\1\50\1\52\36\uffff\1\45\2\uffff\1\42\1\uffff\1\44\1\46\1\47\21\uffff\1\40\11\uffff\1\37\3\uffff\1\41\1\43\15\uffff\1\33\15\uffff\1\34\1\35\1\36\17\uffff\1\32\4\uffff\1\31\4\uffff\1\30\14\uffff\1\25\1\uffff\1\26\7\uffff\1\27\21\uffff\1\22\1\23\1\24\1\uffff\1\16\13\uffff\1\15\1\17\1\20\1\21\3\uffff\1\13\1\14\5\uffff\1\11\1\12\4\uffff\1\10\10\uffff\1\6\1\7\4\uffff\1\5\17\uffff\1\4\1\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA18_specialS =
        "\1\1\43\uffff\1\0\1\2\u0174\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\44\1\41\3\50\1\45\5\50\1\35\1\50\1\46\1\37\11\40\1\36\6\50\1\6\2\43\1\5\1\21\6\43\1\2\1\3\2\43\1\16\1\43\1\17\1\7\1\43\1\33\1\43\1\32\3\43\3\50\1\42\1\43\1\50\1\12\1\43\1\20\1\10\1\1\1\26\1\43\1\23\1\43\1\27\1\30\1\43\1\13\1\24\1\15\1\14\1\43\1\11\1\4\1\31\1\25\1\22\1\43\1\34\2\43\uff85\50",
            "\1\51",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56\4\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\11\uffff\1\66\5\uffff\1\64",
            "\1\70\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\3\uffff\1\100",
            "\1\102",
            "\1\104\15\uffff\1\103",
            "\1\105",
            "\1\106\2\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\113\11\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\117",
            "",
            "\1\123\1\uffff\12\122\13\uffff\1\123\37\uffff\1\123",
            "\1\123\1\uffff\12\124\13\uffff\1\123\37\uffff\1\123",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\126",
            "\0\126",
            "\1\127",
            "",
            "",
            "\1\131",
            "",
            "\1\132",
            "\1\133\24\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\145\15\uffff\1\144\2\uffff\1\143",
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
            "",
            "",
            "",
            "",
            "",
            "\12\124",
            "",
            "",
            "",
            "",
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
            "\1\u0096\7\uffff\1\u0095",
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
            "",
            "\1\u00a6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
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
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "",
            "\1\u00ed",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u00f1\3\uffff\1\u00f0",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
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
            "",
            "\1\u011b",
            "\1\u011c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
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
            "\1\u0161",
            "\1\u0162",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0197",
            "",
            "",
            "\1\u0198",
            "\1\u0199",
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
            return "1:1: Tokens : ( ExecutionConfiguration | LinuxOpertingSystem | MacOSOpertingSystem | SoftwareComponents | DeploymentPlan | AttributeKind | SelectionKind | StartCommand | Description | RuntimeType | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | Properties | Os_version | Processor | RangeKind | Container | DeployTo | Resource | Ethernet | Version | Os_name | Rolling | Debian | Humble | Noetic | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | To | X86 | HyphenMinus | Colon | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA18_36 = input.LA(1);

                        s = -1;
                        if ( ((LA18_36>='\u0000' && LA18_36<='\uFFFF')) ) {s = 86;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='e') ) {s = 1;}

                        else if ( (LA18_0=='L') ) {s = 2;}

                        else if ( (LA18_0=='M') ) {s = 3;}

                        else if ( (LA18_0=='s') ) {s = 4;}

                        else if ( (LA18_0=='D') ) {s = 5;}

                        else if ( (LA18_0=='A') ) {s = 6;}

                        else if ( (LA18_0=='S') ) {s = 7;}

                        else if ( (LA18_0=='d') ) {s = 8;}

                        else if ( (LA18_0=='r') ) {s = 9;}

                        else if ( (LA18_0=='a') ) {s = 10;}

                        else if ( (LA18_0=='m') ) {s = 11;}

                        else if ( (LA18_0=='p') ) {s = 12;}

                        else if ( (LA18_0=='o') ) {s = 13;}

                        else if ( (LA18_0=='P') ) {s = 14;}

                        else if ( (LA18_0=='R') ) {s = 15;}

                        else if ( (LA18_0=='c') ) {s = 16;}

                        else if ( (LA18_0=='E') ) {s = 17;}

                        else if ( (LA18_0=='v') ) {s = 18;}

                        else if ( (LA18_0=='h') ) {s = 19;}

                        else if ( (LA18_0=='n') ) {s = 20;}

                        else if ( (LA18_0=='u') ) {s = 21;}

                        else if ( (LA18_0=='f') ) {s = 22;}

                        else if ( (LA18_0=='j') ) {s = 23;}

                        else if ( (LA18_0=='k') ) {s = 24;}

                        else if ( (LA18_0=='t') ) {s = 25;}

                        else if ( (LA18_0=='W') ) {s = 26;}

                        else if ( (LA18_0=='U') ) {s = 27;}

                        else if ( (LA18_0=='x') ) {s = 28;}

                        else if ( (LA18_0=='-') ) {s = 29;}

                        else if ( (LA18_0==':') ) {s = 30;}

                        else if ( (LA18_0=='0') ) {s = 31;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 32;}

                        else if ( (LA18_0=='#') ) {s = 33;}

                        else if ( (LA18_0=='^') ) {s = 34;}

                        else if ( ((LA18_0>='B' && LA18_0<='C')||(LA18_0>='F' && LA18_0<='K')||(LA18_0>='N' && LA18_0<='O')||LA18_0=='Q'||LA18_0=='T'||LA18_0=='V'||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='b'||LA18_0=='g'||LA18_0=='i'||LA18_0=='l'||LA18_0=='q'||LA18_0=='w'||(LA18_0>='y' && LA18_0<='z')) ) {s = 35;}

                        else if ( (LA18_0=='\"') ) {s = 36;}

                        else if ( (LA18_0=='\'') ) {s = 37;}

                        else if ( (LA18_0=='/') ) {s = 38;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 39;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=',')||LA18_0=='.'||(LA18_0>=';' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA18_37 = input.LA(1);

                        s = -1;
                        if ( ((LA18_37>='\u0000' && LA18_37<='\uFFFF')) ) {s = 86;}

                        else s = 40;

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
