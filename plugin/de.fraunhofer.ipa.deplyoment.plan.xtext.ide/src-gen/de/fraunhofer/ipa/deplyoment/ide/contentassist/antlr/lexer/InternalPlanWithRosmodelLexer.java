package de.fraunhofer.ipa.deplyoment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanWithRosmodelLexer extends Lexer {
    public static final int RULE_DAY=40;
    public static final int DeployTo=21;
    public static final int RULE_DATE_TIME=45;
    public static final int RULE_BOOLEAN=37;
    public static final int AttributeKind=11;
    public static final int RULE_YEAR=42;
    public static final int Name=30;
    public static final int RULE_MIN_SEC=44;
    public static final int Assignment=17;
    public static final int Kind=29;
    public static final int To=32;
    public static final int ExecutedBy=18;
    public static final int X86_64=23;
    public static final int RULE_DEDENT=48;
    public static final int RULE_ID=49;
    public static final int RULE_DIGIT=35;
    public static final int Middleware=19;
    public static final int SelectionKind=12;
    public static final int Arm64=25;
    public static final int Linux=26;
    public static final int RULE_INT=50;
    public static final int Ethernet=22;
    public static final int Value=24;
    public static final int RULE_ML_COMMENT=52;
    public static final int MacOS=27;
    public static final int SoftwareComponent=7;
    public static final int Description=14;
    public static final int StartCommand=13;
    public static final int ProcessorArchitecture=6;
    public static final int RULE_STRING=51;
    public static final int Wlan=31;
    public static final int RULE_SL_COMMENT=46;
    public static final int HyphenMinus=33;
    public static final int RULE_DOUBLE=39;
    public static final int Colon=34;
    public static final int RULE_DECINT=38;
    public static final int DeploymentPlan=8;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=47;
    public static final int RULE_HOUR=43;
    public static final int RULE_WS=53;
    public static final int ExecutionConfiguration=5;
    public static final int MaximumKind=15;
    public static final int From=28;
    public static final int RULE_ANY_OTHER=54;
    public static final int RangeKind=20;
    public static final int NoeticROSDistro=10;
    public static final int DeploymentPlanWithRosModel=4;
    public static final int HumbleROSDistro=9;
    public static final int RULE_MONTH=41;
    public static final int RULE_BINARY=36;

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

    // $ANTLR start "DeploymentPlanWithRosModel"
    public final void mDeploymentPlanWithRosModel() throws RecognitionException {
        try {
            int _type = DeploymentPlanWithRosModel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:14:28: ( 'DeploymentPlanWithRosModel:' )
            // InternalPlanWithRosmodelLexer.g:14:30: 'DeploymentPlanWithRosModel:'
            {
            match("DeploymentPlanWithRosModel:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeploymentPlanWithRosModel"

    // $ANTLR start "ExecutionConfiguration"
    public final void mExecutionConfiguration() throws RecognitionException {
        try {
            int _type = ExecutionConfiguration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:16:24: ( 'executionConfiguration:' )
            // InternalPlanWithRosmodelLexer.g:16:26: 'executionConfiguration:'
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

    // $ANTLR start "ProcessorArchitecture"
    public final void mProcessorArchitecture() throws RecognitionException {
        try {
            int _type = ProcessorArchitecture;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:18:23: ( 'ProcessorArchitecture' )
            // InternalPlanWithRosmodelLexer.g:18:25: 'ProcessorArchitecture'
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

    // $ANTLR start "SoftwareComponent"
    public final void mSoftwareComponent() throws RecognitionException {
        try {
            int _type = SoftwareComponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:20:19: ( 'softwareComponent:' )
            // InternalPlanWithRosmodelLexer.g:20:21: 'softwareComponent:'
            {
            match("softwareComponent:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SoftwareComponent"

    // $ANTLR start "DeploymentPlan"
    public final void mDeploymentPlan() throws RecognitionException {
        try {
            int _type = DeploymentPlan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:22:16: ( 'DeploymentPlan:' )
            // InternalPlanWithRosmodelLexer.g:22:18: 'DeploymentPlan:'
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

    // $ANTLR start "HumbleROSDistro"
    public final void mHumbleROSDistro() throws RecognitionException {
        try {
            int _type = HumbleROSDistro;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:24:17: ( 'HumbleROSDistro' )
            // InternalPlanWithRosmodelLexer.g:24:19: 'HumbleROSDistro'
            {
            match("HumbleROSDistro");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HumbleROSDistro"

    // $ANTLR start "NoeticROSDistro"
    public final void mNoeticROSDistro() throws RecognitionException {
        try {
            int _type = NoeticROSDistro;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:26:17: ( 'NoeticROSDistro' )
            // InternalPlanWithRosmodelLexer.g:26:19: 'NoeticROSDistro'
            {
            match("NoeticROSDistro");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NoeticROSDistro"

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

    // $ANTLR start "StartCommand"
    public final void mStartCommand() throws RecognitionException {
        try {
            int _type = StartCommand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:32:14: ( 'startCommand:' )
            // InternalPlanWithRosmodelLexer.g:32:16: 'startCommand:'
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
            // InternalPlanWithRosmodelLexer.g:34:13: ( 'description:' )
            // InternalPlanWithRosmodelLexer.g:34:15: 'description:'
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
            // InternalPlanWithRosmodelLexer.g:36:13: ( 'MaximumKind' )
            // InternalPlanWithRosmodelLexer.g:36:15: 'MaximumKind'
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
            // InternalPlanWithRosmodelLexer.g:38:13: ( 'MinimumKind' )
            // InternalPlanWithRosmodelLexer.g:38:15: 'MinimumKind'
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
            // InternalPlanWithRosmodelLexer.g:40:12: ( 'assignment:' )
            // InternalPlanWithRosmodelLexer.g:40:14: 'assignment:'
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
            // InternalPlanWithRosmodelLexer.g:42:12: ( 'executedBy:' )
            // InternalPlanWithRosmodelLexer.g:42:14: 'executedBy:'
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
            // InternalPlanWithRosmodelLexer.g:44:12: ( 'middleware:' )
            // InternalPlanWithRosmodelLexer.g:44:14: 'middleware:'
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

    // $ANTLR start "RangeKind"
    public final void mRangeKind() throws RecognitionException {
        try {
            int _type = RangeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:46:11: ( 'RangeKind' )
            // InternalPlanWithRosmodelLexer.g:46:13: 'RangeKind'
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

    // $ANTLR start "DeployTo"
    public final void mDeployTo() throws RecognitionException {
        try {
            int _type = DeployTo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:48:10: ( 'deployTo:' )
            // InternalPlanWithRosmodelLexer.g:48:12: 'deployTo:'
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

    // $ANTLR start "Ethernet"
    public final void mEthernet() throws RecognitionException {
        try {
            int _type = Ethernet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:50:10: ( 'Ethernet' )
            // InternalPlanWithRosmodelLexer.g:50:12: 'Ethernet'
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

    // $ANTLR start "X86_64"
    public final void mX86_64() throws RecognitionException {
        try {
            int _type = X86_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:52:8: ( 'X86_64' )
            // InternalPlanWithRosmodelLexer.g:52:10: 'X86_64'
            {
            match("X86_64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X86_64"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:54:7: ( 'value:' )
            // InternalPlanWithRosmodelLexer.g:54:9: 'value:'
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
            // InternalPlanWithRosmodelLexer.g:56:7: ( 'Arm64' )
            // InternalPlanWithRosmodelLexer.g:56:9: 'Arm64'
            {
            match("Arm64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Arm64"

    // $ANTLR start "Linux"
    public final void mLinux() throws RecognitionException {
        try {
            int _type = Linux;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:58:7: ( 'Linux' )
            // InternalPlanWithRosmodelLexer.g:58:9: 'Linux'
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
            // InternalPlanWithRosmodelLexer.g:60:7: ( 'MacOS' )
            // InternalPlanWithRosmodelLexer.g:60:9: 'MacOS'
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

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:62:6: ( 'from:' )
            // InternalPlanWithRosmodelLexer.g:62:8: 'from:'
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

    // $ANTLR start "Kind"
    public final void mKind() throws RecognitionException {
        try {
            int _type = Kind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:64:6: ( 'kind:' )
            // InternalPlanWithRosmodelLexer.g:64:8: 'kind:'
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
            // InternalPlanWithRosmodelLexer.g:66:6: ( 'name:' )
            // InternalPlanWithRosmodelLexer.g:66:8: 'name:'
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

    // $ANTLR start "Wlan"
    public final void mWlan() throws RecognitionException {
        try {
            int _type = Wlan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:68:6: ( 'Wlan' )
            // InternalPlanWithRosmodelLexer.g:68:8: 'Wlan'
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

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:70:4: ( 'to:' )
            // InternalPlanWithRosmodelLexer.g:70:6: 'to:'
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

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPlanWithRosmodelLexer.g:72:13: ( '-' )
            // InternalPlanWithRosmodelLexer.g:72:15: '-'
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
            // InternalPlanWithRosmodelLexer.g:74:7: ( ':' )
            // InternalPlanWithRosmodelLexer.g:74:9: ':'
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
            // InternalPlanWithRosmodelLexer.g:76:21: ( '0' .. '9' )
            // InternalPlanWithRosmodelLexer.g:76:23: '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:78:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalPlanWithRosmodelLexer.g:78:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalPlanWithRosmodelLexer.g:78:15: ( '0b' | '0B' )
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
                    // InternalPlanWithRosmodelLexer.g:78:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:78:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalPlanWithRosmodelLexer.g:78:27: ( '0' | '1' )+
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
                    // InternalPlanWithRosmodelLexer.g:
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
            // InternalPlanWithRosmodelLexer.g:80:14: ( ( 'true' | 'false' ) )
            // InternalPlanWithRosmodelLexer.g:80:16: ( 'true' | 'false' )
            {
            // InternalPlanWithRosmodelLexer.g:80:16: ( 'true' | 'false' )
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
                    // InternalPlanWithRosmodelLexer.g:80:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:80:24: 'false'
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
            // InternalPlanWithRosmodelLexer.g:82:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalPlanWithRosmodelLexer.g:82:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalPlanWithRosmodelLexer.g:82:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalPlanWithRosmodelLexer.g:82:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalPlanWithRosmodelLexer.g:82:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:82:31: RULE_DECINT
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
                    // InternalPlanWithRosmodelLexer.g:82:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalPlanWithRosmodelLexer.g:82:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:82:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalPlanWithRosmodelLexer.g:82:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                                case 1 :
                                    // InternalPlanWithRosmodelLexer.g:82:49: RULE_DIGIT
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

                    // InternalPlanWithRosmodelLexer.g:82:73: ( '-' | '+' )?
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
            // InternalPlanWithRosmodelLexer.g:84:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalPlanWithRosmodelLexer.g:84:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalPlanWithRosmodelLexer.g:84:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalPlanWithRosmodelLexer.g:84:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:84:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalPlanWithRosmodelLexer.g:84:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:84:29: RULE_DIGIT
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
                    // InternalPlanWithRosmodelLexer.g:84:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalPlanWithRosmodelLexer.g:84:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // InternalPlanWithRosmodelLexer.g:84:54: RULE_DIGIT
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
            // InternalPlanWithRosmodelLexer.g:86:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalPlanWithRosmodelLexer.g:86:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalPlanWithRosmodelLexer.g:86:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalPlanWithRosmodelLexer.g:86:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:86:31: '1' .. '3' '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:88:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalPlanWithRosmodelLexer.g:88:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalPlanWithRosmodelLexer.g:88:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalPlanWithRosmodelLexer.g:88:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:88:33: '1' '0' .. '2'
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
            // InternalPlanWithRosmodelLexer.g:90:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalPlanWithRosmodelLexer.g:90:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:92:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalPlanWithRosmodelLexer.g:92:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalPlanWithRosmodelLexer.g:92:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalPlanWithRosmodelLexer.g:92:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalPlanWithRosmodelLexer.g:92:41: '2' '0' .. '3'
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
            // InternalPlanWithRosmodelLexer.g:94:23: ( '0' .. '5' '0' .. '9' )
            // InternalPlanWithRosmodelLexer.g:94:25: '0' .. '5' '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:96:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalPlanWithRosmodelLexer.g:96:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalPlanWithRosmodelLexer.g:98:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalPlanWithRosmodelLexer.g:98:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalPlanWithRosmodelLexer.g:98:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // InternalPlanWithRosmodelLexer.g:98:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalPlanWithRosmodelLexer.g:100:22: ()
            // InternalPlanWithRosmodelLexer.g:100:24:
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
            // InternalPlanWithRosmodelLexer.g:102:22: ()
            // InternalPlanWithRosmodelLexer.g:102:24:
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
            // InternalPlanWithRosmodelLexer.g:104:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPlanWithRosmodelLexer.g:104:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPlanWithRosmodelLexer.g:104:11: ( '^' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='^') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPlanWithRosmodelLexer.g:104:11: '^'
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

            // InternalPlanWithRosmodelLexer.g:104:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
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
            // InternalPlanWithRosmodelLexer.g:106:10: ( ( '0' .. '9' )+ )
            // InternalPlanWithRosmodelLexer.g:106:12: ( '0' .. '9' )+
            {
            // InternalPlanWithRosmodelLexer.g:106:12: ( '0' .. '9' )+
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
                    // InternalPlanWithRosmodelLexer.g:106:13: '0' .. '9'
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
            // InternalPlanWithRosmodelLexer.g:108:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPlanWithRosmodelLexer.g:108:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPlanWithRosmodelLexer.g:108:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPlanWithRosmodelLexer.g:108:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalPlanWithRosmodelLexer.g:108:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalPlanWithRosmodelLexer.g:108:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalPlanWithRosmodelLexer.g:108:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPlanWithRosmodelLexer.g:108:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalPlanWithRosmodelLexer.g:108:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalPlanWithRosmodelLexer.g:108:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalPlanWithRosmodelLexer.g:108:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPlanWithRosmodelLexer.g:110:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPlanWithRosmodelLexer.g:110:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalPlanWithRosmodelLexer.g:110:24: ( options {greedy=false; } : . )*
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
                    // InternalPlanWithRosmodelLexer.g:110:52: .
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
            // InternalPlanWithRosmodelLexer.g:112:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPlanWithRosmodelLexer.g:112:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPlanWithRosmodelLexer.g:112:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPlanWithRosmodelLexer.g:114:16: ( . )
            // InternalPlanWithRosmodelLexer.g:114:18: .
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
        // InternalPlanWithRosmodelLexer.g:1:8: ( DeploymentPlanWithRosModel | ExecutionConfiguration | ProcessorArchitecture | SoftwareComponent | DeploymentPlan | HumbleROSDistro | NoeticROSDistro | AttributeKind | SelectionKind | StartCommand | Description | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | RangeKind | DeployTo | Ethernet | X86_64 | Value | Arm64 | Linux | MacOS | From | Kind | Name | Wlan | To | HyphenMinus | Colon | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=43;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalPlanWithRosmodelLexer.g:1:10: DeploymentPlanWithRosModel
                {
                mDeploymentPlanWithRosModel();

                }
                break;
            case 2 :
                // InternalPlanWithRosmodelLexer.g:1:37: ExecutionConfiguration
                {
                mExecutionConfiguration();

                }
                break;
            case 3 :
                // InternalPlanWithRosmodelLexer.g:1:60: ProcessorArchitecture
                {
                mProcessorArchitecture();

                }
                break;
            case 4 :
                // InternalPlanWithRosmodelLexer.g:1:82: SoftwareComponent
                {
                mSoftwareComponent();

                }
                break;
            case 5 :
                // InternalPlanWithRosmodelLexer.g:1:100: DeploymentPlan
                {
                mDeploymentPlan();

                }
                break;
            case 6 :
                // InternalPlanWithRosmodelLexer.g:1:115: HumbleROSDistro
                {
                mHumbleROSDistro();

                }
                break;
            case 7 :
                // InternalPlanWithRosmodelLexer.g:1:131: NoeticROSDistro
                {
                mNoeticROSDistro();

                }
                break;
            case 8 :
                // InternalPlanWithRosmodelLexer.g:1:147: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 9 :
                // InternalPlanWithRosmodelLexer.g:1:161: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 10 :
                // InternalPlanWithRosmodelLexer.g:1:175: StartCommand
                {
                mStartCommand();

                }
                break;
            case 11 :
                // InternalPlanWithRosmodelLexer.g:1:188: Description
                {
                mDescription();

                }
                break;
            case 12 :
                // InternalPlanWithRosmodelLexer.g:1:200: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 13 :
                // InternalPlanWithRosmodelLexer.g:1:212: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 14 :
                // InternalPlanWithRosmodelLexer.g:1:224: Assignment
                {
                mAssignment();

                }
                break;
            case 15 :
                // InternalPlanWithRosmodelLexer.g:1:235: ExecutedBy
                {
                mExecutedBy();

                }
                break;
            case 16 :
                // InternalPlanWithRosmodelLexer.g:1:246: Middleware
                {
                mMiddleware();

                }
                break;
            case 17 :
                // InternalPlanWithRosmodelLexer.g:1:257: RangeKind
                {
                mRangeKind();

                }
                break;
            case 18 :
                // InternalPlanWithRosmodelLexer.g:1:267: DeployTo
                {
                mDeployTo();

                }
                break;
            case 19 :
                // InternalPlanWithRosmodelLexer.g:1:276: Ethernet
                {
                mEthernet();

                }
                break;
            case 20 :
                // InternalPlanWithRosmodelLexer.g:1:285: X86_64
                {
                mX86_64();

                }
                break;
            case 21 :
                // InternalPlanWithRosmodelLexer.g:1:292: Value
                {
                mValue();

                }
                break;
            case 22 :
                // InternalPlanWithRosmodelLexer.g:1:298: Arm64
                {
                mArm64();

                }
                break;
            case 23 :
                // InternalPlanWithRosmodelLexer.g:1:304: Linux
                {
                mLinux();

                }
                break;
            case 24 :
                // InternalPlanWithRosmodelLexer.g:1:310: MacOS
                {
                mMacOS();

                }
                break;
            case 25 :
                // InternalPlanWithRosmodelLexer.g:1:316: From
                {
                mFrom();

                }
                break;
            case 26 :
                // InternalPlanWithRosmodelLexer.g:1:321: Kind
                {
                mKind();

                }
                break;
            case 27 :
                // InternalPlanWithRosmodelLexer.g:1:326: Name
                {
                mName();

                }
                break;
            case 28 :
                // InternalPlanWithRosmodelLexer.g:1:331: Wlan
                {
                mWlan();

                }
                break;
            case 29 :
                // InternalPlanWithRosmodelLexer.g:1:336: To
                {
                mTo();

                }
                break;
            case 30 :
                // InternalPlanWithRosmodelLexer.g:1:339: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 31 :
                // InternalPlanWithRosmodelLexer.g:1:351: Colon
                {
                mColon();

                }
                break;
            case 32 :
                // InternalPlanWithRosmodelLexer.g:1:357: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 33 :
                // InternalPlanWithRosmodelLexer.g:1:369: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 34 :
                // InternalPlanWithRosmodelLexer.g:1:382: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 35 :
                // InternalPlanWithRosmodelLexer.g:1:394: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 36 :
                // InternalPlanWithRosmodelLexer.g:1:406: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 37 :
                // InternalPlanWithRosmodelLexer.g:1:421: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 38 :
                // InternalPlanWithRosmodelLexer.g:1:437: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 39 :
                // InternalPlanWithRosmodelLexer.g:1:445: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 40 :
                // InternalPlanWithRosmodelLexer.g:1:454: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 41 :
                // InternalPlanWithRosmodelLexer.g:1:466: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 42 :
                // InternalPlanWithRosmodelLexer.g:1:482: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 43 :
                // InternalPlanWithRosmodelLexer.g:1:490: RULE_ANY_OTHER
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
            return "82:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\26\45\1\101\1\uffff\3\100\1\uffff\1\43\1\uffff\3\43\2\uffff\1\45\1\uffff\32\45\4\uffff\1\152\1\uffff\2\100\4\uffff\33\45\1\uffff\1\45\1\152\1\uffff\1\100\32\45\1\u00a4\1\u00a5\1\152\1\100\10\45\1\u00af\4\45\1\u00b4\7\45\1\u00bc\1\uffff\1\u00a5\5\uffff\10\45\1\uffff\4\45\1\uffff\5\45\1\u00cf\2\uffff\22\45\1\uffff\21\45\1\u00f3\13\45\1\uffff\4\45\1\u0103\1\uffff\17\45\1\uffff\2\45\1\uffff\10\45\1\u011d\1\u011e\2\uffff\11\45\3\uffff\4\45\1\uffff\2\45\1\u012e\1\u012f\6\45\2\uffff\1\45\1\uffff\3\45\1\u013b\1\u013c\4\45\2\uffff\7\45\1\uffff\10\45\1\u0150\2\45\1\uffff\1\45\1\uffff\3\45\1\uffff";
    static final String DFA24_eofS =
        "\u0157\uffff";
    static final String DFA24_minS =
        "\1\0\1\145\1\170\1\162\1\157\1\165\1\157\1\162\2\145\1\141\1\163\1\151\1\141\1\164\1\70\1\141\1\151\1\141\1\151\1\141\1\154\1\157\1\60\1\uffff\3\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\160\1\uffff\1\145\1\157\1\146\1\141\1\155\1\145\1\164\1\155\1\154\1\160\1\143\1\156\1\163\1\144\1\156\1\150\1\66\1\154\1\156\1\157\1\154\1\156\1\155\1\141\1\72\1\165\4\uffff\1\60\1\uffff\2\60\4\uffff\1\154\2\143\1\164\1\162\1\142\1\164\1\162\1\66\1\145\1\143\1\154\1\151\1\117\2\151\1\144\1\147\1\145\1\137\2\165\1\155\1\163\1\144\1\145\1\156\1\uffff\1\145\1\60\1\uffff\1\60\1\157\1\165\1\145\1\167\1\164\1\154\2\151\1\64\1\143\1\162\1\157\1\155\1\123\1\155\1\147\1\154\1\145\1\162\1\66\1\145\1\170\1\72\1\145\2\72\2\60\2\55\1\171\1\164\1\163\1\141\1\103\1\145\1\143\1\142\1\60\1\164\1\151\1\171\1\165\1\60\1\165\1\156\1\145\1\113\1\156\1\64\1\72\1\60\1\uffff\1\60\5\uffff\1\155\1\145\1\163\1\162\1\157\2\122\1\165\1\uffff\1\151\1\160\1\124\1\155\1\uffff\2\155\1\167\1\151\1\145\1\60\2\uffff\1\145\1\157\1\144\1\157\1\145\1\155\2\117\1\164\1\157\1\164\1\157\2\113\1\145\1\141\1\156\1\164\1\uffff\2\156\1\102\1\162\1\103\1\155\2\123\1\145\1\156\1\151\1\72\2\151\1\156\1\162\1\144\1\60\1\164\1\103\1\171\1\101\1\157\1\141\2\104\2\113\1\157\1\uffff\2\156\1\164\1\145\1\60\1\uffff\1\120\1\157\1\72\1\162\1\155\1\156\4\151\1\156\2\144\2\72\1\uffff\1\154\1\156\1\uffff\1\143\1\160\1\144\2\163\2\156\1\72\2\60\2\uffff\1\141\1\146\1\150\1\157\1\72\2\164\2\144\3\uffff\1\156\2\151\1\156\1\uffff\2\162\2\60\1\72\1\147\1\164\1\145\2\157\2\uffff\1\151\1\uffff\1\165\1\145\1\156\2\60\1\164\1\162\1\143\1\164\2\uffff\1\150\1\141\1\164\1\72\1\122\1\164\1\165\1\uffff\1\157\1\151\1\162\1\163\1\157\1\145\1\115\1\156\1\60\1\157\1\72\1\uffff\1\144\1\uffff\1\145\1\154\1\72\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\145\1\170\1\162\1\164\1\165\1\157\1\164\2\145\1\151\1\163\1\151\1\141\1\164\1\70\1\141\1\151\1\162\1\151\1\141\1\154\1\162\1\71\1\uffff\3\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\160\1\uffff\1\145\1\157\1\146\1\141\1\155\1\145\1\164\1\155\1\154\1\163\1\170\1\156\1\163\1\144\1\156\1\150\1\66\1\154\1\156\1\157\1\154\1\156\1\155\1\141\1\72\1\165\4\uffff\1\71\1\uffff\2\71\4\uffff\1\154\2\143\1\164\1\162\1\142\1\164\1\162\1\66\1\145\1\143\1\154\1\151\1\117\2\151\1\144\1\147\1\145\1\137\2\165\1\155\1\163\1\144\1\145\1\156\1\uffff\1\145\1\71\1\uffff\1\71\1\157\1\165\1\145\1\167\1\164\1\154\2\151\1\64\1\143\1\162\1\157\1\155\1\123\1\155\1\147\1\154\1\145\1\162\1\66\1\145\1\170\1\72\1\145\2\72\2\172\1\55\1\71\1\171\1\164\1\163\1\141\1\103\1\145\1\143\1\142\1\172\1\164\1\151\1\171\1\165\1\172\1\165\1\156\1\145\1\113\1\156\1\64\1\72\1\172\1\uffff\1\172\5\uffff\1\155\1\151\1\163\1\162\1\157\2\122\1\165\1\uffff\1\151\1\160\1\124\1\155\1\uffff\2\155\1\167\1\151\1\145\1\172\2\uffff\1\145\1\157\1\144\1\157\1\145\1\155\2\117\1\164\1\157\1\164\1\157\2\113\1\145\1\141\1\156\1\164\1\uffff\2\156\1\102\1\162\1\103\1\155\2\123\1\145\1\156\1\151\1\72\2\151\1\156\1\162\1\144\1\172\1\164\1\103\1\171\1\101\1\157\1\141\2\104\2\113\1\157\1\uffff\2\156\1\164\1\145\1\172\1\uffff\1\120\1\157\1\72\1\162\1\155\1\156\4\151\1\156\2\144\2\72\1\uffff\1\154\1\156\1\uffff\1\143\1\160\1\144\2\163\2\156\1\72\2\172\2\uffff\1\141\1\146\1\150\1\157\1\72\2\164\2\144\3\uffff\1\156\2\151\1\156\1\uffff\2\162\2\172\1\127\1\147\1\164\1\145\2\157\2\uffff\1\151\1\uffff\1\165\1\145\1\156\2\172\1\164\1\162\1\143\1\164\2\uffff\1\150\1\141\1\164\1\72\1\122\1\164\1\165\1\uffff\1\157\1\151\1\162\1\163\1\157\1\145\1\115\1\156\1\172\1\157\1\72\1\uffff\1\144\1\uffff\1\145\1\154\1\72\1\uffff";
    static final String DFA24_acceptS =
        "\30\uffff\1\37\3\uffff\1\45\1\uffff\1\46\3\uffff\1\52\1\53\1\uffff\1\46\32\uffff\1\43\1\36\1\37\1\40\1\uffff\1\42\2\uffff\1\45\1\50\1\51\1\52\33\uffff\1\35\2\uffff\1\47\65\uffff\1\31\1\uffff\1\32\1\33\1\34\1\41\1\44\10\uffff\1\26\4\uffff\1\30\6\uffff\1\25\1\27\22\uffff\1\24\35\uffff\1\22\5\uffff\1\23\17\uffff\1\21\2\uffff\1\17\12\uffff\1\16\1\20\11\uffff\1\13\1\14\1\15\4\uffff\1\12\12\uffff\1\10\1\11\1\uffff\1\5\11\uffff\1\6\1\7\7\uffff\1\4\13\uffff\1\3\1\uffff\1\2\3\uffff\1\1";
    static final String DFA24_specialS =
        "\1\2\36\uffff\1\0\1\1\u0136\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\1\34\3\43\1\40\5\43\1\27\1\43\1\41\1\31\2\32\7\33\1\30\6\43\1\7\2\36\1\1\1\16\2\36\1\5\3\36\1\21\1\12\1\6\1\36\1\3\1\36\1\15\1\10\3\36\1\25\1\17\2\36\3\43\1\35\1\36\1\43\1\13\2\36\1\11\1\2\1\22\4\36\1\23\1\36\1\14\1\24\4\36\1\4\1\26\1\36\1\20\4\36\uff85\43",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\50\4\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\55\1\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\20\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\2\uffff\1\77",
            "\12\100",
            "",
            "\1\105\1\uffff\12\104\10\uffff\1\103\2\uffff\1\105\34\uffff\1\103\2\uffff\1\105",
            "\1\105\1\uffff\12\106\13\uffff\1\105\37\uffff\1\105",
            "\1\105\1\uffff\12\107\13\uffff\1\105\37\uffff\1\105",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\111",
            "\0\111",
            "\1\112",
            "",
            "",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\2\uffff\1\126",
            "\1\131\24\uffff\1\130",
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
            "",
            "",
            "",
            "",
            "\12\151",
            "",
            "\12\153",
            "\12\107",
            "",
            "",
            "",
            "",
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
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\u0088",
            "",
            "\12\u0089",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a6",
            "\1\u00a6\2\uffff\12\107",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bd",
            "\1\u00bf\3\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
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
            "\1\u00e0",
            "\1\u00e1",
            "",
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
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
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
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
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
            "",
            "",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0131\34\uffff\1\u0130",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
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
            return "1:1: Tokens : ( DeploymentPlanWithRosModel | ExecutionConfiguration | ProcessorArchitecture | SoftwareComponent | DeploymentPlan | HumbleROSDistro | NoeticROSDistro | AttributeKind | SelectionKind | StartCommand | Description | MaximumKind | MinimumKind | Assignment | ExecutedBy | Middleware | RangeKind | DeployTo | Ethernet | X86_64 | Value | Arm64 | Linux | MacOS | From | Kind | Name | Wlan | To | HyphenMinus | Colon | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA24_31 = input.LA(1);

                        s = -1;
                        if ( ((LA24_31>='\u0000' && LA24_31<='\uFFFF')) ) {s = 73;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA24_32 = input.LA(1);

                        s = -1;
                        if ( ((LA24_32>='\u0000' && LA24_32<='\uFFFF')) ) {s = 73;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='D') ) {s = 1;}

                        else if ( (LA24_0=='e') ) {s = 2;}

                        else if ( (LA24_0=='P') ) {s = 3;}

                        else if ( (LA24_0=='s') ) {s = 4;}

                        else if ( (LA24_0=='H') ) {s = 5;}

                        else if ( (LA24_0=='N') ) {s = 6;}

                        else if ( (LA24_0=='A') ) {s = 7;}

                        else if ( (LA24_0=='S') ) {s = 8;}

                        else if ( (LA24_0=='d') ) {s = 9;}

                        else if ( (LA24_0=='M') ) {s = 10;}

                        else if ( (LA24_0=='a') ) {s = 11;}

                        else if ( (LA24_0=='m') ) {s = 12;}

                        else if ( (LA24_0=='R') ) {s = 13;}

                        else if ( (LA24_0=='E') ) {s = 14;}

                        else if ( (LA24_0=='X') ) {s = 15;}

                        else if ( (LA24_0=='v') ) {s = 16;}

                        else if ( (LA24_0=='L') ) {s = 17;}

                        else if ( (LA24_0=='f') ) {s = 18;}

                        else if ( (LA24_0=='k') ) {s = 19;}

                        else if ( (LA24_0=='n') ) {s = 20;}

                        else if ( (LA24_0=='W') ) {s = 21;}

                        else if ( (LA24_0=='t') ) {s = 22;}

                        else if ( (LA24_0=='-') ) {s = 23;}

                        else if ( (LA24_0==':') ) {s = 24;}

                        else if ( (LA24_0=='0') ) {s = 25;}

                        else if ( ((LA24_0>='1' && LA24_0<='2')) ) {s = 26;}

                        else if ( ((LA24_0>='3' && LA24_0<='9')) ) {s = 27;}

                        else if ( (LA24_0=='#') ) {s = 28;}

                        else if ( (LA24_0=='^') ) {s = 29;}

                        else if ( ((LA24_0>='B' && LA24_0<='C')||(LA24_0>='F' && LA24_0<='G')||(LA24_0>='I' && LA24_0<='K')||LA24_0=='O'||LA24_0=='Q'||(LA24_0>='T' && LA24_0<='V')||(LA24_0>='Y' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='b' && LA24_0<='c')||(LA24_0>='g' && LA24_0<='j')||LA24_0=='l'||(LA24_0>='o' && LA24_0<='r')||LA24_0=='u'||(LA24_0>='w' && LA24_0<='z')) ) {s = 30;}

                        else if ( (LA24_0=='\"') ) {s = 31;}

                        else if ( (LA24_0=='\'') ) {s = 32;}

                        else if ( (LA24_0=='/') ) {s = 33;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 34;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||(LA24_0>='$' && LA24_0<='&')||(LA24_0>='(' && LA24_0<=',')||LA24_0=='.'||(LA24_0>=';' && LA24_0<='@')||(LA24_0>='[' && LA24_0<=']')||LA24_0=='`'||(LA24_0>='{' && LA24_0<='\uFFFF')) ) {s = 35;}

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
