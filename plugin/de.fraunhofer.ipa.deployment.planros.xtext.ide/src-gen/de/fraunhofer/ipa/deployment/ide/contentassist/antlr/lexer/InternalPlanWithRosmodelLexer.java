package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanWithRosmodelLexer extends Lexer {
    public static final int SoftwareComponents=8;
    public static final int DeployTo=28;
    public static final int AttributeKind=11;
    public static final int Noetic=36;
    public static final int Name=44;
    public static final int Assignment=20;
    public static final int Container=27;
    public static final int Debian=34;
    public static final int Version=31;
    public static final int Kind=43;
    public static final int To=48;
    public static final int ExecutedBy=21;
    public static final int Ubuntu=37;
    public static final int RULE_DEDENT=57;
    public static final int DeploymentPlanWithRos=5;
    public static final int LinuxOpertingSystem=6;
    public static final int RULE_ID=58;
    public static final int TargetRossystem=9;
    public static final int Resource=29;
    public static final int RULE_DIGIT=52;
    public static final int Middleware=22;
    public static final int SelectionKind=12;
    public static final int Arm64=39;
    public static final int RULE_INT=59;
    public static final int Ethernet=30;
    public static final int Value=38;
    public static final int RULE_ML_COMMENT=61;
    public static final int Description=15;
    public static final int Processor=25;
    public static final int StartCommand=14;
    public static final int RefNodeParam=13;
    public static final int RULE_STRING=60;
    public static final int Focal=40;
    public static final int Wlan=46;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=55;
    public static final int Os_name=32;
    public static final int HyphenMinus=50;
    public static final int RULE_DOUBLE=54;
    public static final int X86=49;
    public static final int Colon=51;
    public static final int RULE_DECINT=53;
    public static final int DeploymentPlan=10;
    public static final int MinimumKind=19;
    public static final int EOF=-1;
    public static final int RULE_INDENT=56;
    public static final int Jammy=42;
    public static final int Usb=47;
    public static final int RULE_WS=62;
    public static final int Rolling=33;
    public static final int ExecutionConfiguration=4;
    public static final int MaximumKind=18;
    public static final int From=41;
    public static final int RULE_ANY_OTHER=63;
    public static final int RangeKind=26;
    public static final int Os_version=24;
    public static final int Type=45;
    public static final int MacOSOpertingSystem=7;
    public static final int RuntimeType=17;
    public static final int RefSysParam=16;
    public static final int Humble=35;

    // delegates
    // delegators

    public InternalPlanWithRosmodelLexer() {;}
    public InternalPlanWithRosmodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPlanWithRosmodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPlanWithRosmodelLexer.g"; }

    // $ANTLR start "ExecutionConfiguration"
    public final void mExecutionConfiguration() throws RecognitionException {
        try {
            int _type = ExecutionConfiguration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:14:24: ( 'executionConfiguration:' )
            // InternalPlanWithRosmodelLexer.g:14:26: 'executionConfiguration:'
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

    // $ANTLR start "DeploymentPlanWithRos"
    public final void mDeploymentPlanWithRos() throws RecognitionException {
        try {
            int _type = DeploymentPlanWithRos;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:16:23: ( 'DeploymentPlanWithRos:' )
            // InternalPlanWithRosmodelLexer.g:16:25: 'DeploymentPlanWithRos:'
            {
            match("DeploymentPlanWithRos:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeploymentPlanWithRos"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:18:21: ( 'LinuxOpertingSystem' )
            // InternalPlanWithRosmodelLexer.g:18:23: 'LinuxOpertingSystem'
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
            // InternalPlanWithRosmodelLexer.g:20:21: ( 'MacOSOpertingSystem' )
            // InternalPlanWithRosmodelLexer.g:20:23: 'MacOSOpertingSystem'
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
            // InternalPlanWithRosmodelLexer.g:22:20: ( 'softwareComponents:' )
            // InternalPlanWithRosmodelLexer.g:22:22: 'softwareComponents:'
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

    // $ANTLR start "TargetRossystem"
    public final void mTargetRossystem() throws RecognitionException {
        try {
            int _type = TargetRossystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:24:17: ( 'targetRossystem:' )
            // InternalPlanWithRosmodelLexer.g:24:19: 'targetRossystem:'
            {
            match("targetRossystem:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TargetRossystem"

    // $ANTLR start "DeploymentPlan"
    public final void mDeploymentPlan() throws RecognitionException {
        try {
            int _type = DeploymentPlan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:26:16: ( 'DeploymentPlan:' )
            // InternalPlanWithRosmodelLexer.g:26:18: 'DeploymentPlan:'
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
            // InternalPlanWithRosmodelLexer.g:28:15: ( 'AttributeKind' )
            // InternalPlanWithRosmodelLexer.g:28:17: 'AttributeKind'
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
            // InternalPlanWithRosmodelLexer.g:30:15: ( 'SelectionKind' )
            // InternalPlanWithRosmodelLexer.g:30:17: 'SelectionKind'
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

    // $ANTLR start "RefNodeParam"
    public final void mRefNodeParam() throws RecognitionException {
        try {
            int _type = RefNodeParam;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:32:14: ( 'refNodeParam:' )
            // InternalPlanWithRosmodelLexer.g:32:16: 'refNodeParam:'
            {
            match("refNodeParam:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefNodeParam"

    // $ANTLR start "StartCommand"
    public final void mStartCommand() throws RecognitionException {
        try {
            int _type = StartCommand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:34:14: ( 'startCommand:' )
            // InternalPlanWithRosmodelLexer.g:34:16: 'startCommand:'
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
            // InternalPlanWithRosmodelLexer.g:36:13: ( 'description:' )
            // InternalPlanWithRosmodelLexer.g:36:15: 'description:'
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

    // $ANTLR start "RefSysParam"
    public final void mRefSysParam() throws RecognitionException {
        try {
            int _type = RefSysParam;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:38:13: ( 'refSysParam:' )
            // InternalPlanWithRosmodelLexer.g:38:15: 'refSysParam:'
            {
            match("refSysParam:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RefSysParam"

    // $ANTLR start "RuntimeType"
    public final void mRuntimeType() throws RecognitionException {
        try {
            int _type = RuntimeType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:40:13: ( 'runtimeType:' )
            // InternalPlanWithRosmodelLexer.g:40:15: 'runtimeType:'
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
            // InternalPlanWithRosmodelLexer.g:42:13: ( 'MaximumKind' )
            // InternalPlanWithRosmodelLexer.g:42:15: 'MaximumKind'
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
            // InternalPlanWithRosmodelLexer.g:44:13: ( 'MinimumKind' )
            // InternalPlanWithRosmodelLexer.g:44:15: 'MinimumKind'
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
            // InternalPlanWithRosmodelLexer.g:46:12: ( 'assignment:' )
            // InternalPlanWithRosmodelLexer.g:46:14: 'assignment:'
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
            // InternalPlanWithRosmodelLexer.g:48:12: ( 'executedBy:' )
            // InternalPlanWithRosmodelLexer.g:48:14: 'executedBy:'
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
            // InternalPlanWithRosmodelLexer.g:50:12: ( 'middleware:' )
            // InternalPlanWithRosmodelLexer.g:50:14: 'middleware:'
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
            // InternalPlanWithRosmodelLexer.g:52:12: ( 'properties:' )
            // InternalPlanWithRosmodelLexer.g:52:14: 'properties:'
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
            // InternalPlanWithRosmodelLexer.g:54:12: ( 'os_version' )
            // InternalPlanWithRosmodelLexer.g:54:14: 'os_version'
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
            // InternalPlanWithRosmodelLexer.g:56:11: ( 'Processor' )
            // InternalPlanWithRosmodelLexer.g:56:13: 'Processor'
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
            // InternalPlanWithRosmodelLexer.g:58:11: ( 'RangeKind' )
            // InternalPlanWithRosmodelLexer.g:58:13: 'RangeKind'
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
            // InternalPlanWithRosmodelLexer.g:60:11: ( 'container' )
            // InternalPlanWithRosmodelLexer.g:60:13: 'container'
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
            // InternalPlanWithRosmodelLexer.g:62:10: ( 'deployTo:' )
            // InternalPlanWithRosmodelLexer.g:62:12: 'deployTo:'
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
            // InternalPlanWithRosmodelLexer.g:64:10: ( 'resource:' )
            // InternalPlanWithRosmodelLexer.g:64:12: 'resource:'
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
            // InternalPlanWithRosmodelLexer.g:66:10: ( 'Ethernet' )
            // InternalPlanWithRosmodelLexer.g:66:12: 'Ethernet'
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
            // InternalPlanWithRosmodelLexer.g:68:9: ( 'version:' )
            // InternalPlanWithRosmodelLexer.g:68:11: 'version:'
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
            // InternalPlanWithRosmodelLexer.g:70:9: ( 'os_name' )
            // InternalPlanWithRosmodelLexer.g:70:11: 'os_name'
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
            // InternalPlanWithRosmodelLexer.g:72:9: ( 'rolling' )
            // InternalPlanWithRosmodelLexer.g:72:11: 'rolling'
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
            // InternalPlanWithRosmodelLexer.g:74:8: ( 'debian' )
            // InternalPlanWithRosmodelLexer.g:74:10: 'debian'
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
            // InternalPlanWithRosmodelLexer.g:76:8: ( 'humble' )
            // InternalPlanWithRosmodelLexer.g:76:10: 'humble'
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
            // InternalPlanWithRosmodelLexer.g:78:8: ( 'noetic' )
            // InternalPlanWithRosmodelLexer.g:78:10: 'noetic'
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
            // InternalPlanWithRosmodelLexer.g:80:8: ( 'ubuntu' )
            // InternalPlanWithRosmodelLexer.g:80:10: 'ubuntu'
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
            // InternalPlanWithRosmodelLexer.g:82:7: ( 'value:' )
            // InternalPlanWithRosmodelLexer.g:82:9: 'value:'
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
            // InternalPlanWithRosmodelLexer.g:84:7: ( 'arm64' )
            // InternalPlanWithRosmodelLexer.g:84:9: 'arm64'
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
            // InternalPlanWithRosmodelLexer.g:86:7: ( 'focal' )
            // InternalPlanWithRosmodelLexer.g:86:9: 'focal'
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
            // InternalPlanWithRosmodelLexer.g:88:6: ( 'from:' )
            // InternalPlanWithRosmodelLexer.g:88:8: 'from:'
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
            // InternalPlanWithRosmodelLexer.g:90:7: ( 'jammy' )
            // InternalPlanWithRosmodelLexer.g:90:9: 'jammy'
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
            // InternalPlanWithRosmodelLexer.g:92:6: ( 'kind:' )
            // InternalPlanWithRosmodelLexer.g:92:8: 'kind:'
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
            // InternalPlanWithRosmodelLexer.g:94:6: ( 'name:' )
            // InternalPlanWithRosmodelLexer.g:94:8: 'name:'
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
            // InternalPlanWithRosmodelLexer.g:96:6: ( 'type:' )
            // InternalPlanWithRosmodelLexer.g:96:8: 'type:'
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
            // InternalPlanWithRosmodelLexer.g:98:6: ( 'Wlan' )
            // InternalPlanWithRosmodelLexer.g:98:8: 'Wlan'
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
            // InternalPlanWithRosmodelLexer.g:100:5: ( 'Usb' )
            // InternalPlanWithRosmodelLexer.g:100:7: 'Usb'
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
            // InternalPlanWithRosmodelLexer.g:102:4: ( 'to:' )
            // InternalPlanWithRosmodelLexer.g:102:6: 'to:'
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
            // InternalPlanWithRosmodelLexer.g:104:5: ( 'x86' )
            // InternalPlanWithRosmodelLexer.g:104:7: 'x86'
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
            // InternalPlanWithRosmodelLexer.g:106:13: ( '-' )
            // InternalPlanWithRosmodelLexer.g:106:15: '-'
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
            // InternalPlanWithRosmodelLexer.g:108:7: ( ':' )
            // InternalPlanWithRosmodelLexer.g:108:9: ':'
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
            // InternalPlanWithRosmodelLexer.g:110:21: ( '0' .. '9' )
            // InternalPlanWithRosmodelLexer.g:110:23: '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:112:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalPlanWithRosmodelLexer.g:112:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalPlanWithRosmodelLexer.g:112:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
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
                    // InternalPlanWithRosmodelLexer.g:112:16: ( RULE_DIGIT )*
                    {
                    // InternalPlanWithRosmodelLexer.g:112:16: ( RULE_DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:112:16: RULE_DIGIT
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
                    // InternalPlanWithRosmodelLexer.g:112:28: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalPlanWithRosmodelLexer.g:112:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:112:32: RULE_DIGIT
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

            // InternalPlanWithRosmodelLexer.g:112:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalPlanWithRosmodelLexer.g:112:46: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalPlanWithRosmodelLexer.g:112:50: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:112:50: RULE_DECINT
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
                    // InternalPlanWithRosmodelLexer.g:112:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalPlanWithRosmodelLexer.g:112:63: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:112:64: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalPlanWithRosmodelLexer.g:112:68: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                              case 1 :
                                  // InternalPlanWithRosmodelLexer.g:112:68: RULE_DIGIT
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

                    // InternalPlanWithRosmodelLexer.g:112:92: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:
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

                    // InternalPlanWithRosmodelLexer.g:112:103: ( RULE_DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:112:103: RULE_DIGIT
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
            // InternalPlanWithRosmodelLexer.g:114:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalPlanWithRosmodelLexer.g:114:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalPlanWithRosmodelLexer.g:114:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalPlanWithRosmodelLexer.g:114:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:114:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalPlanWithRosmodelLexer.g:114:29: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:114:29: RULE_DIGIT
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
                    // InternalPlanWithRosmodelLexer.g:114:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalPlanWithRosmodelLexer.g:114:54: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                      case 1 :
                          // InternalPlanWithRosmodelLexer.g:114:54: RULE_DIGIT
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
            // InternalPlanWithRosmodelLexer.g:116:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalPlanWithRosmodelLexer.g:116:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalPlanWithRosmodelLexer.g:116:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
              case 1 :
                  // InternalPlanWithRosmodelLexer.g:116:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalPlanWithRosmodelLexer.g:118:22: ()
            // InternalPlanWithRosmodelLexer.g:118:24:
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
            // InternalPlanWithRosmodelLexer.g:120:22: ()
            // InternalPlanWithRosmodelLexer.g:120:24:
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
            // InternalPlanWithRosmodelLexer.g:122:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPlanWithRosmodelLexer.g:122:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPlanWithRosmodelLexer.g:122:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPlanWithRosmodelLexer.g:122:11: '^'
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

            // InternalPlanWithRosmodelLexer.g:122:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
              case 1 :
                  // InternalPlanWithRosmodelLexer.g:
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
            // InternalPlanWithRosmodelLexer.g:124:10: ( ( '0' .. '9' )+ )
            // InternalPlanWithRosmodelLexer.g:124:12: ( '0' .. '9' )+
            {
            // InternalPlanWithRosmodelLexer.g:124:12: ( '0' .. '9' )+
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
                  // InternalPlanWithRosmodelLexer.g:124:13: '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:126:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPlanWithRosmodelLexer.g:126:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPlanWithRosmodelLexer.g:126:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPlanWithRosmodelLexer.g:126:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalPlanWithRosmodelLexer.g:126:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                          // InternalPlanWithRosmodelLexer.g:126:21: '\\\\' .
                          {
                          match('\\');
                          matchAny();

                          }
                          break;
                      case 2 :
                          // InternalPlanWithRosmodelLexer.g:126:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPlanWithRosmodelLexer.g:126:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalPlanWithRosmodelLexer.g:126:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                          // InternalPlanWithRosmodelLexer.g:126:54: '\\\\' .
                          {
                          match('\\');
                          matchAny();

                          }
                          break;
                      case 2 :
                          // InternalPlanWithRosmodelLexer.g:126:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPlanWithRosmodelLexer.g:128:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPlanWithRosmodelLexer.g:128:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalPlanWithRosmodelLexer.g:128:24: ( options {greedy=false; } : . )*
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
                  // InternalPlanWithRosmodelLexer.g:128:52: .
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
            // InternalPlanWithRosmodelLexer.g:130:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPlanWithRosmodelLexer.g:130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPlanWithRosmodelLexer.g:130:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
                  // InternalPlanWithRosmodelLexer.g:
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
            // InternalPlanWithRosmodelLexer.g:132:16: ( . )
            // InternalPlanWithRosmodelLexer.g:132:18: .
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
        // InternalPlanWithRosmodelLexer.g:1:8: ( ExecutionConfiguration | DeploymentPlanWithRos | LinuxOpertingSystem | MacOSOpertingSystem | SoftwareComponents | TargetRossystem | DeploymentPlan | AttributeKind | SelectionKind | RefNodeParam | StartCommand | Description | RefSysParam | RuntimeType | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | Properties | Os_version | Processor | RangeKind | Container | DeployTo | Resource | Ethernet | Version | Os_name | Rolling | Debian | Humble | Noetic | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | To | X86 | HyphenMinus | Colon | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=57;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalPlanWithRosmodelLexer.g:1:10: ExecutionConfiguration
                {
                mExecutionConfiguration();

                }
                break;
            case 2 :
                // InternalPlanWithRosmodelLexer.g:1:33: DeploymentPlanWithRos
                {
                mDeploymentPlanWithRos();

                }
                break;
            case 3 :
                // InternalPlanWithRosmodelLexer.g:1:55: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 4 :
                // InternalPlanWithRosmodelLexer.g:1:75: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 5 :
                // InternalPlanWithRosmodelLexer.g:1:95: SoftwareComponents
                {
                mSoftwareComponents();

                }
                break;
            case 6 :
                // InternalPlanWithRosmodelLexer.g:1:114: TargetRossystem
                {
                mTargetRossystem();

                }
                break;
            case 7 :
                // InternalPlanWithRosmodelLexer.g:1:130: DeploymentPlan
                {
                mDeploymentPlan();

                }
                break;
            case 8 :
                // InternalPlanWithRosmodelLexer.g:1:145: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 9 :
                // InternalPlanWithRosmodelLexer.g:1:159: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 10 :
                // InternalPlanWithRosmodelLexer.g:1:173: RefNodeParam
                {
                mRefNodeParam();

                }
                break;
            case 11 :
                // InternalPlanWithRosmodelLexer.g:1:186: StartCommand
                {
                mStartCommand();

                }
                break;
            case 12 :
                // InternalPlanWithRosmodelLexer.g:1:199: Description
                {
                mDescription();

                }
                break;
            case 13 :
                // InternalPlanWithRosmodelLexer.g:1:211: RefSysParam
                {
                mRefSysParam();

                }
                break;
            case 14 :
                // InternalPlanWithRosmodelLexer.g:1:223: RuntimeType
                {
                mRuntimeType();

                }
                break;
            case 15 :
                // InternalPlanWithRosmodelLexer.g:1:235: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 16 :
                // InternalPlanWithRosmodelLexer.g:1:247: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 17 :
                // InternalPlanWithRosmodelLexer.g:1:259: Assignment
                {
                mAssignment();

                }
                break;
            case 18 :
                // InternalPlanWithRosmodelLexer.g:1:270: ExecutedBy
                {
                mExecutedBy();

                }
                break;
            case 19 :
                // InternalPlanWithRosmodelLexer.g:1:281: Middleware
                {
                mMiddleware();

                }
                break;
            case 20 :
                // InternalPlanWithRosmodelLexer.g:1:292: Properties
                {
                mProperties();

                }
                break;
            case 21 :
                // InternalPlanWithRosmodelLexer.g:1:303: Os_version
                {
                mOs_version();

                }
                break;
            case 22 :
                // InternalPlanWithRosmodelLexer.g:1:314: Processor
                {
                mProcessor();

                }
                break;
            case 23 :
                // InternalPlanWithRosmodelLexer.g:1:324: RangeKind
                {
                mRangeKind();

                }
                break;
            case 24 :
                // InternalPlanWithRosmodelLexer.g:1:334: Container
                {
                mContainer();

                }
                break;
            case 25 :
                // InternalPlanWithRosmodelLexer.g:1:344: DeployTo
                {
                mDeployTo();

                }
                break;
            case 26 :
                // InternalPlanWithRosmodelLexer.g:1:353: Resource
                {
                mResource();

                }
                break;
            case 27 :
                // InternalPlanWithRosmodelLexer.g:1:362: Ethernet
                {
                mEthernet();

                }
                break;
            case 28 :
                // InternalPlanWithRosmodelLexer.g:1:371: Version
                {
                mVersion();

                }
                break;
            case 29 :
                // InternalPlanWithRosmodelLexer.g:1:379: Os_name
                {
                mOs_name();

                }
                break;
            case 30 :
                // InternalPlanWithRosmodelLexer.g:1:387: Rolling
                {
                mRolling();

                }
                break;
            case 31 :
                // InternalPlanWithRosmodelLexer.g:1:395: Debian
                {
                mDebian();

                }
                break;
            case 32 :
                // InternalPlanWithRosmodelLexer.g:1:402: Humble
                {
                mHumble();

                }
                break;
            case 33 :
                // InternalPlanWithRosmodelLexer.g:1:409: Noetic
                {
                mNoetic();

                }
                break;
            case 34 :
                // InternalPlanWithRosmodelLexer.g:1:416: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 35 :
                // InternalPlanWithRosmodelLexer.g:1:423: Value
                {
                mValue();

                }
                break;
            case 36 :
                // InternalPlanWithRosmodelLexer.g:1:429: Arm64
                {
                mArm64();

                }
                break;
            case 37 :
                // InternalPlanWithRosmodelLexer.g:1:435: Focal
                {
                mFocal();

                }
                break;
            case 38 :
                // InternalPlanWithRosmodelLexer.g:1:441: From
                {
                mFrom();

                }
                break;
            case 39 :
                // InternalPlanWithRosmodelLexer.g:1:446: Jammy
                {
                mJammy();

                }
                break;
            case 40 :
                // InternalPlanWithRosmodelLexer.g:1:452: Kind
                {
                mKind();

                }
                break;
            case 41 :
                // InternalPlanWithRosmodelLexer.g:1:457: Name
                {
                mName();

                }
                break;
            case 42 :
                // InternalPlanWithRosmodelLexer.g:1:462: Type
                {
                mType();

                }
                break;
            case 43 :
                // InternalPlanWithRosmodelLexer.g:1:467: Wlan
                {
                mWlan();

                }
                break;
            case 44 :
                // InternalPlanWithRosmodelLexer.g:1:472: Usb
                {
                mUsb();

                }
                break;
            case 45 :
                // InternalPlanWithRosmodelLexer.g:1:476: To
                {
                mTo();

                }
                break;
            case 46 :
                // InternalPlanWithRosmodelLexer.g:1:479: X86
                {
                mX86();

                }
                break;
            case 47 :
                // InternalPlanWithRosmodelLexer.g:1:483: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 48 :
                // InternalPlanWithRosmodelLexer.g:1:495: Colon
                {
                mColon();

                }
                break;
            case 49 :
                // InternalPlanWithRosmodelLexer.g:1:501: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 50 :
                // InternalPlanWithRosmodelLexer.g:1:513: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 51 :
                // InternalPlanWithRosmodelLexer.g:1:525: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 52 :
                // InternalPlanWithRosmodelLexer.g:1:541: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 53 :
                // InternalPlanWithRosmodelLexer.g:1:549: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 54 :
                // InternalPlanWithRosmodelLexer.g:1:558: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 55 :
                // InternalPlanWithRosmodelLexer.g:1:570: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 56 :
                // InternalPlanWithRosmodelLexer.g:1:586: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 57 :
                // InternalPlanWithRosmodelLexer.g:1:594: RULE_ANY_OTHER
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
            return "112:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\53\20\55\1\53\12\55\1\124\1\uffff\1\126\1\uffff\1\126\1\uffff\1\51\1\uffff\3\51\2\uffff\1\55\1\uffff\1\53\1\uffff\45\55\1\126\3\uffff\1\u0088\1\126\4\uffff\12\55\1\uffff\35\55\1\u00b2\1\u00b3\1\126\1\uffff\50\55\1\u00dc\2\uffff\11\55\1\uffff\13\55\1\u00f1\14\55\1\uffff\1\55\1\u00ff\1\uffff\1\u0100\2\uffff\22\55\1\u0114\1\55\1\uffff\11\55\1\uffff\1\u011f\1\u0120\1\u0121\2\uffff\20\55\1\u0132\2\55\1\uffff\4\55\1\u0139\5\55\3\uffff\20\55\1\uffff\6\55\1\uffff\3\55\1\u0158\1\uffff\16\55\1\uffff\2\55\1\uffff\4\55\1\u016d\1\u016e\1\u016f\1\uffff\23\55\1\u0183\3\uffff\1\55\1\uffff\3\55\1\u0188\1\u0189\11\55\4\uffff\4\55\2\uffff\6\55\3\uffff\5\55\1\uffff\1\55\1\u01a3\1\u01a4\1\uffff\6\55\2\uffff\2\55\1\uffff\11\55\1\uffff\14\55\1\u01c3\1\u01c4\1\uffff\2\55\2\uffff\3\55\2\uffff";
    static final String DFA22_eofS =
        "\u01ca\uffff";
    static final String DFA22_minS =
        "\1\0\1\60\1\145\1\151\1\141\1\157\1\141\1\164\3\145\1\162\1\151\1\162\1\163\1\162\1\141\1\157\1\60\1\141\1\165\1\141\1\142\1\157\1\141\1\151\1\154\1\163\1\70\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\60\1\uffff\1\160\1\156\1\143\1\156\1\146\1\141\1\162\1\160\1\72\1\164\1\154\1\146\1\156\1\154\1\142\1\163\1\155\1\144\1\157\1\137\1\157\2\156\1\150\1\162\1\154\1\155\1\145\1\155\1\165\1\143\1\157\1\155\1\156\1\141\1\142\1\66\1\56\3\uffff\2\56\4\uffff\1\143\1\154\1\165\1\117\2\151\1\164\1\162\1\147\1\145\1\uffff\1\162\1\145\1\116\1\157\1\164\1\154\1\143\1\154\2\151\1\66\1\144\1\160\1\156\1\143\1\147\1\164\1\145\1\163\1\165\1\142\1\164\1\145\1\156\1\141\2\155\1\144\1\156\2\60\1\56\1\uffff\1\165\1\157\1\170\1\123\2\155\1\167\1\164\1\145\1\72\1\151\1\143\1\157\1\171\1\165\2\151\1\162\1\157\1\141\1\147\1\64\1\154\2\145\1\141\2\145\1\141\1\162\1\151\1\145\1\154\1\151\1\72\1\164\1\154\1\72\1\171\1\72\1\60\2\uffff\1\164\1\171\2\117\2\165\1\141\1\103\1\164\1\uffff\1\142\1\164\1\144\1\163\1\162\1\155\1\156\1\151\1\171\2\156\1\60\1\145\2\162\1\155\1\163\1\113\1\151\1\156\1\157\1\72\1\145\1\143\1\uffff\1\165\1\60\1\uffff\1\60\2\uffff\1\145\1\155\2\160\2\155\1\162\1\157\1\122\1\165\1\151\1\145\1\120\1\143\1\145\1\147\1\160\1\124\1\60\1\155\1\uffff\1\167\1\164\1\163\1\145\1\163\1\151\1\156\1\145\1\156\1\uffff\3\60\2\uffff\1\157\1\144\3\145\2\113\1\145\1\155\1\157\1\164\1\157\1\120\1\141\1\145\1\124\1\60\1\164\1\157\1\uffff\1\145\1\141\2\151\1\60\1\157\1\156\1\145\1\164\1\72\3\uffff\1\156\1\102\1\156\2\162\2\151\1\103\1\155\1\163\1\145\1\156\1\141\1\162\1\72\1\171\1\uffff\1\151\1\72\1\156\1\162\1\145\1\157\1\uffff\1\162\1\144\1\162\1\60\1\uffff\1\103\1\171\3\164\2\156\1\157\1\141\1\163\2\113\1\162\1\141\1\uffff\1\160\1\157\1\uffff\1\164\1\145\1\163\1\156\3\60\1\uffff\1\157\1\72\1\120\2\151\2\144\1\155\1\156\1\171\2\151\1\141\1\155\1\145\1\156\3\72\1\60\3\uffff\1\156\1\uffff\1\154\2\156\2\60\1\160\1\144\1\163\2\156\1\155\3\72\4\uffff\1\146\1\141\2\147\2\uffff\1\157\1\72\1\164\2\144\1\72\3\uffff\1\151\1\156\2\123\1\156\1\uffff\1\145\2\60\1\uffff\1\147\1\72\2\171\1\145\1\155\2\uffff\1\165\1\151\1\uffff\2\163\1\156\1\72\1\162\4\164\1\uffff\1\141\1\150\2\145\1\163\1\164\1\122\2\155\1\72\1\151\1\157\2\60\1\uffff\1\157\1\163\2\uffff\1\156\2\72\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\172\1\145\2\151\1\164\1\171\1\164\1\145\1\165\1\145\1\163\1\151\1\162\1\163\1\162\1\141\1\157\1\172\1\145\1\165\1\157\1\142\1\162\1\141\1\151\1\154\1\163\1\70\1\145\1\uffff\1\145\1\uffff\1\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\145\1\uffff\1\172\1\uffff\1\160\1\156\1\170\1\156\1\146\1\141\1\162\1\160\1\72\1\164\1\154\1\163\1\156\1\154\2\163\1\155\1\144\1\157\1\137\1\157\2\156\1\150\1\162\1\154\1\155\1\145\1\155\1\165\1\143\1\157\1\155\1\156\1\141\1\142\1\66\1\145\3\uffff\2\145\4\uffff\1\143\1\154\1\165\1\117\2\151\1\164\1\162\1\147\1\145\1\uffff\1\162\1\145\1\123\1\157\1\164\1\154\1\143\1\154\2\151\1\66\1\144\1\160\1\166\1\143\1\147\1\164\1\145\1\163\1\165\1\142\1\164\1\145\1\156\1\141\2\155\1\144\1\156\2\172\1\145\1\uffff\1\165\1\157\1\170\1\123\2\155\1\167\1\164\1\145\1\72\1\151\1\143\1\157\1\171\1\165\2\151\1\162\1\157\1\141\1\147\1\64\1\154\2\145\1\141\2\145\1\141\1\162\1\151\1\145\1\154\1\151\1\72\1\164\1\154\1\72\1\171\1\72\1\172\2\uffff\1\164\1\171\2\117\2\165\1\141\1\103\1\164\1\uffff\1\142\1\164\1\144\1\163\1\162\1\155\1\156\1\151\1\171\2\156\1\172\1\145\2\162\1\155\1\163\1\113\1\151\1\156\1\157\1\72\1\145\1\143\1\uffff\1\165\1\172\1\uffff\1\172\2\uffff\1\151\1\155\2\160\2\155\1\162\1\157\1\122\1\165\1\151\1\145\1\120\1\143\1\145\1\147\1\160\1\124\1\172\1\155\1\uffff\1\167\1\164\1\163\1\145\1\163\1\151\1\156\1\145\1\156\1\uffff\3\172\2\uffff\1\157\1\144\3\145\2\113\1\145\1\155\1\157\1\164\1\157\1\120\1\141\1\145\1\124\1\172\1\164\1\157\1\uffff\1\145\1\141\2\151\1\172\1\157\1\156\1\145\1\164\1\72\3\uffff\1\156\1\102\1\156\2\162\2\151\1\103\1\155\1\163\1\145\1\156\1\141\1\162\1\72\1\171\1\uffff\1\151\1\72\1\156\1\162\1\145\1\157\1\uffff\1\162\1\144\1\162\1\172\1\uffff\1\103\1\171\3\164\2\156\1\157\1\141\1\163\2\113\1\162\1\141\1\uffff\1\160\1\157\1\uffff\1\164\1\145\1\163\1\156\3\172\1\uffff\1\157\1\72\1\120\2\151\2\144\1\155\1\156\1\171\2\151\1\141\1\155\1\145\1\156\3\72\1\172\3\uffff\1\156\1\uffff\1\154\2\156\2\172\1\160\1\144\1\163\2\156\1\155\3\72\4\uffff\1\146\1\141\2\147\2\uffff\1\157\1\72\1\164\2\144\1\72\3\uffff\1\151\1\156\2\123\1\156\1\uffff\1\145\2\172\1\uffff\1\147\1\127\2\171\1\145\1\155\2\uffff\1\165\1\151\1\uffff\2\163\1\156\1\72\1\162\4\164\1\uffff\1\141\1\150\2\145\1\163\1\164\1\122\2\155\1\72\1\151\1\157\2\172\1\uffff\1\157\1\163\2\uffff\1\156\2\72\2\uffff";
    static final String DFA22_acceptS =
        "\36\uffff\1\60\1\uffff\1\61\1\uffff\1\63\1\uffff\1\64\3\uffff\1\70\1\71\1\uffff\1\61\1\uffff\1\64\46\uffff\1\57\1\60\1\62\2\uffff\1\63\1\66\1\67\1\70\12\uffff\1\55\40\uffff\1\65\51\uffff\1\54\1\56\11\uffff\1\52\30\uffff\1\51\2\uffff\1\46\1\uffff\1\50\1\53\24\uffff\1\44\11\uffff\1\43\3\uffff\1\45\1\47\23\uffff\1\37\12\uffff\1\40\1\41\1\42\20\uffff\1\36\6\uffff\1\35\4\uffff\1\34\16\uffff\1\32\2\uffff\1\31\7\uffff\1\33\24\uffff\1\26\1\27\1\30\1\uffff\1\22\16\uffff\1\21\1\23\1\24\1\25\4\uffff\1\17\1\20\6\uffff\1\15\1\16\1\14\5\uffff\1\13\3\uffff\1\12\6\uffff\1\10\1\11\2\uffff\1\7\11\uffff\1\6\16\uffff\1\5\2\uffff\1\3\1\4\3\uffff\1\2\1\1";
    static final String DFA22_specialS =
        "\1\1\44\uffff\1\2\1\0\u01a3\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\1\42\3\51\1\46\5\51\1\35\1\40\1\47\1\37\11\41\1\36\6\51\1\7\2\44\1\2\1\22\6\44\1\3\1\4\2\44\1\17\1\44\1\20\1\10\1\44\1\33\1\44\1\32\3\44\3\51\1\43\1\44\1\51\1\13\1\44\1\21\1\12\1\1\1\27\1\44\1\24\1\44\1\30\1\31\1\44\1\14\1\25\1\16\1\15\1\44\1\11\1\5\1\6\1\26\1\23\1\44\1\34\2\44\uff85\51",
            "\12\54\7\uffff\32\55\4\uffff\1\55\1\uffff\27\55\1\52\2\55",
            "\1\56",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62\4\uffff\1\63",
            "\1\64\15\uffff\1\66\11\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\71\11\uffff\1\73\5\uffff\1\72",
            "\1\74",
            "\1\76\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\54\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\105\6\55",
            "\1\107\3\uffff\1\106",
            "\1\110",
            "\1\112\15\uffff\1\111",
            "\1\113",
            "\1\114\2\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\53\1\uffff\12\123\13\uffff\1\53\37\uffff\1\53",
            "",
            "\1\53\1\uffff\12\127\13\uffff\1\53\37\uffff\1\53",
            "",
            "\1\53\1\uffff\12\130\13\uffff\1\53\37\uffff\1\53",
            "",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\0\132",
            "\0\132",
            "\1\133",
            "",
            "",
            "\1\135",
            "",
            "\12\54\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\136",
            "\1\137",
            "\1\140\24\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\14\uffff\1\153",
            "\1\154",
            "\1\155",
            "\1\160\15\uffff\1\157\2\uffff\1\156",
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
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\53\1\uffff\12\u0087\13\uffff\1\53\37\uffff\1\53",
            "",
            "",
            "",
            "\1\53\1\uffff\12\127\13\uffff\1\53\37\uffff\1\53",
            "\1\53\1\uffff\12\130\13\uffff\1\53\37\uffff\1\53",
            "",
            "",
            "",
            "",
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
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\4\uffff\1\u0096",
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
            "\1\u00a2\7\uffff\1\u00a1",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\53\1\uffff\12\u0087\13\uffff\1\53\37\uffff\1\53",
            "",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u0102\3\uffff\1\u0101",
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
            "\1\u0113",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0115",
            "",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
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
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "",
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
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
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
            "",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\1\u0181",
            "\1\u0182",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "",
            "",
            "",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u01a5",
            "\1\u01a7\34\uffff\1\u01a6",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "",
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
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
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
            return "1:1: Tokens : ( ExecutionConfiguration | DeploymentPlanWithRos | LinuxOpertingSystem | MacOSOpertingSystem | SoftwareComponents | TargetRossystem | DeploymentPlan | AttributeKind | SelectionKind | RefNodeParam | StartCommand | Description | RefSysParam | RuntimeType | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | Properties | Os_version | Processor | RangeKind | Container | DeployTo | Resource | Ethernet | Version | Os_name | Rolling | Debian | Humble | Noetic | Ubuntu | Value | Arm64 | Focal | From | Jammy | Kind | Name | Type | Wlan | Usb | To | X86 | HyphenMinus | Colon | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
          int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='\u0000' && LA22_38<='\uFFFF')) ) {s = 90;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='e') ) {s = 1;}

                        else if ( (LA22_0=='D') ) {s = 2;}

                        else if ( (LA22_0=='L') ) {s = 3;}

                        else if ( (LA22_0=='M') ) {s = 4;}

                        else if ( (LA22_0=='s') ) {s = 5;}

                        else if ( (LA22_0=='t') ) {s = 6;}

                        else if ( (LA22_0=='A') ) {s = 7;}

                        else if ( (LA22_0=='S') ) {s = 8;}

                        else if ( (LA22_0=='r') ) {s = 9;}

                        else if ( (LA22_0=='d') ) {s = 10;}

                        else if ( (LA22_0=='a') ) {s = 11;}

                        else if ( (LA22_0=='m') ) {s = 12;}

                        else if ( (LA22_0=='p') ) {s = 13;}

                        else if ( (LA22_0=='o') ) {s = 14;}

                        else if ( (LA22_0=='P') ) {s = 15;}

                        else if ( (LA22_0=='R') ) {s = 16;}

                        else if ( (LA22_0=='c') ) {s = 17;}

                        else if ( (LA22_0=='E') ) {s = 18;}

                        else if ( (LA22_0=='v') ) {s = 19;}

                        else if ( (LA22_0=='h') ) {s = 20;}

                        else if ( (LA22_0=='n') ) {s = 21;}

                        else if ( (LA22_0=='u') ) {s = 22;}

                        else if ( (LA22_0=='f') ) {s = 23;}

                        else if ( (LA22_0=='j') ) {s = 24;}

                        else if ( (LA22_0=='k') ) {s = 25;}

                        else if ( (LA22_0=='W') ) {s = 26;}

                        else if ( (LA22_0=='U') ) {s = 27;}

                        else if ( (LA22_0=='x') ) {s = 28;}

                        else if ( (LA22_0=='-') ) {s = 29;}

                        else if ( (LA22_0==':') ) {s = 30;}

                        else if ( (LA22_0=='0') ) {s = 31;}

                        else if ( (LA22_0=='.') ) {s = 32;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 33;}

                        else if ( (LA22_0=='#') ) {s = 34;}

                        else if ( (LA22_0=='^') ) {s = 35;}

                        else if ( ((LA22_0>='B' && LA22_0<='C')||(LA22_0>='F' && LA22_0<='K')||(LA22_0>='N' && LA22_0<='O')||LA22_0=='Q'||LA22_0=='T'||LA22_0=='V'||(LA22_0>='X' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='b'||LA22_0=='g'||LA22_0=='i'||LA22_0=='l'||LA22_0=='q'||LA22_0=='w'||(LA22_0>='y' && LA22_0<='z')) ) {s = 36;}

                        else if ( (LA22_0=='\"') ) {s = 37;}

                        else if ( (LA22_0=='\'') ) {s = 38;}

                        else if ( (LA22_0=='/') ) {s = 39;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 40;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='$' && LA22_0<='&')||(LA22_0>='(' && LA22_0<=',')||(LA22_0>=';' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA22_37 = input.LA(1);

                        s = -1;
                        if ( ((LA22_37>='\u0000' && LA22_37<='\uFFFF')) ) {s = 90;}

                        else s = 41;

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
