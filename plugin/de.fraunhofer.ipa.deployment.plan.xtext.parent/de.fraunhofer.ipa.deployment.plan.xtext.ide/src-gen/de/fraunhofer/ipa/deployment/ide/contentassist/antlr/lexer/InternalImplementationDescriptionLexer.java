package de.fraunhofer.ipa.deployment.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalImplementationDescriptionLexer extends Lexer {
    public static final int AttributeKind=12;
    public static final int SoftwareConfigurationParameter=4;
    public static final int Name=31;
    public static final int Container=21;
    public static final int Debian=24;
    public static final int Version=23;
    public static final int Kind=30;
    public static final int Ubuntu=25;
    public static final int RULE_DEDENT=43;
    public static final int LinuxOpertingSystem=8;
    public static final int RULE_ID=44;
    public static final int RULE_DIGIT=38;
    public static final int ExecutionRequirement=7;
    public static final int HWSWParemeter=11;
    public static final int SelectionKind=13;
    public static final int Arm64=27;
    public static final int Git=35;
    public static final int IncludeSoftwareComponent=6;
    public static final int RULE_INT=45;
    public static final int Ethernet=22;
    public static final int Value=26;
    public static final int RULE_ML_COMMENT=47;
    public static final int Description=14;
    public static final int Processor=19;
    public static final int RULE_STRING=46;
    public static final int Focal=28;
    public static final int Wlan=33;
    public static final int Properties=17;
    public static final int Url=34;
    public static final int RULE_SL_COMMENT=41;
    public static final int ImplementationDescription=5;
    public static final int HyphenMinus=37;
    public static final int RULE_DOUBLE=40;
    public static final int X86=36;
    public static final int RULE_DECINT=39;
    public static final int MinimumKind=16;
    public static final int EOF=-1;
    public static final int RULE_INDENT=42;
    public static final int Jammy=29;
    public static final int RULE_WS=48;
    public static final int MaximumKind=15;
    public static final int RULE_ANY_OTHER=49;
    public static final int RangeKind=20;
    public static final int Repository=18;
    public static final int Type=32;
    public static final int MacOSOpertingSystem=9;
    public static final int DeviceRequirement=10;

    // delegates
    // delegators

    public InternalImplementationDescriptionLexer() {;}
    public InternalImplementationDescriptionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalImplementationDescriptionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalImplementationDescriptionLexer.g"; }

    // $ANTLR start "SoftwareConfigurationParameter"
    public final void mSoftwareConfigurationParameter() throws RecognitionException {
        try {
            int _type = SoftwareConfigurationParameter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:14:32: ( 'softwareConfigurationParameter:' )
            // InternalImplementationDescriptionLexer.g:14:34: 'softwareConfigurationParameter:'
            {
            match("softwareConfigurationParameter:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SoftwareConfigurationParameter"

    // $ANTLR start "ImplementationDescription"
    public final void mImplementationDescription() throws RecognitionException {
        try {
            int _type = ImplementationDescription;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:16:27: ( 'ImplementationDescription:' )
            // InternalImplementationDescriptionLexer.g:16:29: 'ImplementationDescription:'
            {
            match("ImplementationDescription:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ImplementationDescription"

    // $ANTLR start "IncludeSoftwareComponent"
    public final void mIncludeSoftwareComponent() throws RecognitionException {
        try {
            int _type = IncludeSoftwareComponent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:18:26: ( 'includeSoftwareComponent:' )
            // InternalImplementationDescriptionLexer.g:18:28: 'includeSoftwareComponent:'
            {
            match("includeSoftwareComponent:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IncludeSoftwareComponent"

    // $ANTLR start "ExecutionRequirement"
    public final void mExecutionRequirement() throws RecognitionException {
        try {
            int _type = ExecutionRequirement;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:20:22: ( 'executionRequirement:' )
            // InternalImplementationDescriptionLexer.g:20:24: 'executionRequirement:'
            {
            match("executionRequirement:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExecutionRequirement"

    // $ANTLR start "LinuxOpertingSystem"
    public final void mLinuxOpertingSystem() throws RecognitionException {
        try {
            int _type = LinuxOpertingSystem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:22:21: ( 'LinuxOpertingSystem' )
            // InternalImplementationDescriptionLexer.g:22:23: 'LinuxOpertingSystem'
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
            // InternalImplementationDescriptionLexer.g:24:21: ( 'MacOSOpertingSystem' )
            // InternalImplementationDescriptionLexer.g:24:23: 'MacOSOpertingSystem'
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

    // $ANTLR start "DeviceRequirement"
    public final void mDeviceRequirement() throws RecognitionException {
        try {
            int _type = DeviceRequirement;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:26:19: ( 'deviceRequirement:' )
            // InternalImplementationDescriptionLexer.g:26:21: 'deviceRequirement:'
            {
            match("deviceRequirement:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DeviceRequirement"

    // $ANTLR start "HWSWParemeter"
    public final void mHWSWParemeter() throws RecognitionException {
        try {
            int _type = HWSWParemeter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:28:15: ( 'HWSWParemeter:' )
            // InternalImplementationDescriptionLexer.g:28:17: 'HWSWParemeter:'
            {
            match("HWSWParemeter:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HWSWParemeter"

    // $ANTLR start "AttributeKind"
    public final void mAttributeKind() throws RecognitionException {
        try {
            int _type = AttributeKind;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:30:15: ( 'AttributeKind' )
            // InternalImplementationDescriptionLexer.g:30:17: 'AttributeKind'
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
            // InternalImplementationDescriptionLexer.g:32:15: ( 'SelectionKind' )
            // InternalImplementationDescriptionLexer.g:32:17: 'SelectionKind'
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
            // InternalImplementationDescriptionLexer.g:34:13: ( 'description:' )
            // InternalImplementationDescriptionLexer.g:34:15: 'description:'
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
            // InternalImplementationDescriptionLexer.g:36:13: ( 'MaximumKind' )
            // InternalImplementationDescriptionLexer.g:36:15: 'MaximumKind'
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
            // InternalImplementationDescriptionLexer.g:38:13: ( 'MinimumKind' )
            // InternalImplementationDescriptionLexer.g:38:15: 'MinimumKind'
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
            // InternalImplementationDescriptionLexer.g:40:12: ( 'properties:' )
            // InternalImplementationDescriptionLexer.g:40:14: 'properties:'
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

    // $ANTLR start "Repository"
    public final void mRepository() throws RecognitionException {
        try {
            int _type = Repository;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:42:12: ( 'repository:' )
            // InternalImplementationDescriptionLexer.g:42:14: 'repository:'
            {
            match("repository:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Repository"

    // $ANTLR start "Processor"
    public final void mProcessor() throws RecognitionException {
        try {
            int _type = Processor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:44:11: ( 'Processor' )
            // InternalImplementationDescriptionLexer.g:44:13: 'Processor'
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
            // InternalImplementationDescriptionLexer.g:46:11: ( 'RangeKind' )
            // InternalImplementationDescriptionLexer.g:46:13: 'RangeKind'
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
            // InternalImplementationDescriptionLexer.g:48:11: ( 'container' )
            // InternalImplementationDescriptionLexer.g:48:13: 'container'
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
            // InternalImplementationDescriptionLexer.g:50:10: ( 'Ethernet' )
            // InternalImplementationDescriptionLexer.g:50:12: 'Ethernet'
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
            // InternalImplementationDescriptionLexer.g:52:9: ( 'version:' )
            // InternalImplementationDescriptionLexer.g:52:11: 'version:'
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

    // $ANTLR start "Debian"
    public final void mDebian() throws RecognitionException {
        try {
            int _type = Debian;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:54:8: ( 'debian' )
            // InternalImplementationDescriptionLexer.g:54:10: 'debian'
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
            // InternalImplementationDescriptionLexer.g:56:8: ( 'ubuntu' )
            // InternalImplementationDescriptionLexer.g:56:10: 'ubuntu'
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
            // InternalImplementationDescriptionLexer.g:58:7: ( 'value:' )
            // InternalImplementationDescriptionLexer.g:58:9: 'value:'
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
            // InternalImplementationDescriptionLexer.g:60:7: ( 'arm64' )
            // InternalImplementationDescriptionLexer.g:60:9: 'arm64'
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
            // InternalImplementationDescriptionLexer.g:62:7: ( 'focal' )
            // InternalImplementationDescriptionLexer.g:62:9: 'focal'
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
            // InternalImplementationDescriptionLexer.g:64:7: ( 'jammy' )
            // InternalImplementationDescriptionLexer.g:64:9: 'jammy'
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
            // InternalImplementationDescriptionLexer.g:66:6: ( 'kind:' )
            // InternalImplementationDescriptionLexer.g:66:8: 'kind:'
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
            // InternalImplementationDescriptionLexer.g:68:6: ( 'name:' )
            // InternalImplementationDescriptionLexer.g:68:8: 'name:'
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
            // InternalImplementationDescriptionLexer.g:70:6: ( 'type:' )
            // InternalImplementationDescriptionLexer.g:70:8: 'type:'
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
            // InternalImplementationDescriptionLexer.g:72:6: ( 'Wlan' )
            // InternalImplementationDescriptionLexer.g:72:8: 'Wlan'
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

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:74:5: ( 'url:' )
            // InternalImplementationDescriptionLexer.g:74:7: 'url:'
            {
            match("url:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "Git"
    public final void mGit() throws RecognitionException {
        try {
            int _type = Git;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:76:5: ( 'git' )
            // InternalImplementationDescriptionLexer.g:76:7: 'git'
            {
            match("git");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Git"

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalImplementationDescriptionLexer.g:78:5: ( 'x86' )
            // InternalImplementationDescriptionLexer.g:78:7: 'x86'
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
            // InternalImplementationDescriptionLexer.g:80:13: ( '-' )
            // InternalImplementationDescriptionLexer.g:80:15: '-'
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
            // InternalImplementationDescriptionLexer.g:82:21: ( '0' .. '9' )
            // InternalImplementationDescriptionLexer.g:82:23: '0' .. '9'
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
            // InternalImplementationDescriptionLexer.g:84:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalImplementationDescriptionLexer.g:84:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalImplementationDescriptionLexer.g:84:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalImplementationDescriptionLexer.g:84:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalImplementationDescriptionLexer.g:84:31: ( RULE_DECINT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                        case 1 :
                            // InternalImplementationDescriptionLexer.g:84:31: RULE_DECINT
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
                    // InternalImplementationDescriptionLexer.g:84:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalImplementationDescriptionLexer.g:84:44: ( '.' ( RULE_DIGIT )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalImplementationDescriptionLexer.g:84:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalImplementationDescriptionLexer.g:84:49: ( RULE_DIGIT )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                                case 1 :
                                    // InternalImplementationDescriptionLexer.g:84:49: RULE_DIGIT
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

                    // InternalImplementationDescriptionLexer.g:84:73: ( '-' | '+' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalImplementationDescriptionLexer.g:
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
            // InternalImplementationDescriptionLexer.g:86:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalImplementationDescriptionLexer.g:86:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalImplementationDescriptionLexer.g:86:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalImplementationDescriptionLexer.g:86:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalImplementationDescriptionLexer.g:86:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalImplementationDescriptionLexer.g:86:29: ( RULE_DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalImplementationDescriptionLexer.g:86:29: RULE_DIGIT
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
                    // InternalImplementationDescriptionLexer.g:86:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalImplementationDescriptionLexer.g:86:54: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                        case 1 :
                            // InternalImplementationDescriptionLexer.g:86:54: RULE_DIGIT
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
            // InternalImplementationDescriptionLexer.g:88:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalImplementationDescriptionLexer.g:88:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalImplementationDescriptionLexer.g:88:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalImplementationDescriptionLexer.g:88:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalImplementationDescriptionLexer.g:90:22: ()
            // InternalImplementationDescriptionLexer.g:90:24:
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
            // InternalImplementationDescriptionLexer.g:92:22: ()
            // InternalImplementationDescriptionLexer.g:92:24:
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
            // InternalImplementationDescriptionLexer.g:94:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalImplementationDescriptionLexer.g:94:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalImplementationDescriptionLexer.g:94:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalImplementationDescriptionLexer.g:94:11: '^'
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

            // InternalImplementationDescriptionLexer.g:94:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalImplementationDescriptionLexer.g:
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
            // InternalImplementationDescriptionLexer.g:96:10: ( ( '0' .. '9' )+ )
            // InternalImplementationDescriptionLexer.g:96:12: ( '0' .. '9' )+
            {
            // InternalImplementationDescriptionLexer.g:96:12: ( '0' .. '9' )+
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
                    // InternalImplementationDescriptionLexer.g:96:13: '0' .. '9'
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
            // InternalImplementationDescriptionLexer.g:98:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalImplementationDescriptionLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalImplementationDescriptionLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalImplementationDescriptionLexer.g:98:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalImplementationDescriptionLexer.g:98:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalImplementationDescriptionLexer.g:98:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalImplementationDescriptionLexer.g:98:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalImplementationDescriptionLexer.g:98:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalImplementationDescriptionLexer.g:98:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalImplementationDescriptionLexer.g:98:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalImplementationDescriptionLexer.g:98:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalImplementationDescriptionLexer.g:100:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalImplementationDescriptionLexer.g:100:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalImplementationDescriptionLexer.g:100:24: ( options {greedy=false; } : . )*
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
                    // InternalImplementationDescriptionLexer.g:100:52: .
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
            // InternalImplementationDescriptionLexer.g:102:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalImplementationDescriptionLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalImplementationDescriptionLexer.g:102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
                    // InternalImplementationDescriptionLexer.g:
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
            // InternalImplementationDescriptionLexer.g:104:16: ( . )
            // InternalImplementationDescriptionLexer.g:104:18: .
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
        // InternalImplementationDescriptionLexer.g:1:8: ( SoftwareConfigurationParameter | ImplementationDescription | IncludeSoftwareComponent | ExecutionRequirement | LinuxOpertingSystem | MacOSOpertingSystem | DeviceRequirement | HWSWParemeter | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Repository | Processor | RangeKind | Container | Ethernet | Version | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | Url | Git | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=43;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalImplementationDescriptionLexer.g:1:10: SoftwareConfigurationParameter
                {
                mSoftwareConfigurationParameter();

                }
                break;
            case 2 :
                // InternalImplementationDescriptionLexer.g:1:41: ImplementationDescription
                {
                mImplementationDescription();

                }
                break;
            case 3 :
                // InternalImplementationDescriptionLexer.g:1:67: IncludeSoftwareComponent
                {
                mIncludeSoftwareComponent();

                }
                break;
            case 4 :
                // InternalImplementationDescriptionLexer.g:1:92: ExecutionRequirement
                {
                mExecutionRequirement();

                }
                break;
            case 5 :
                // InternalImplementationDescriptionLexer.g:1:113: LinuxOpertingSystem
                {
                mLinuxOpertingSystem();

                }
                break;
            case 6 :
                // InternalImplementationDescriptionLexer.g:1:133: MacOSOpertingSystem
                {
                mMacOSOpertingSystem();

                }
                break;
            case 7 :
                // InternalImplementationDescriptionLexer.g:1:153: DeviceRequirement
                {
                mDeviceRequirement();

                }
                break;
            case 8 :
                // InternalImplementationDescriptionLexer.g:1:171: HWSWParemeter
                {
                mHWSWParemeter();

                }
                break;
            case 9 :
                // InternalImplementationDescriptionLexer.g:1:185: AttributeKind
                {
                mAttributeKind();

                }
                break;
            case 10 :
                // InternalImplementationDescriptionLexer.g:1:199: SelectionKind
                {
                mSelectionKind();

                }
                break;
            case 11 :
                // InternalImplementationDescriptionLexer.g:1:213: Description
                {
                mDescription();

                }
                break;
            case 12 :
                // InternalImplementationDescriptionLexer.g:1:225: MaximumKind
                {
                mMaximumKind();

                }
                break;
            case 13 :
                // InternalImplementationDescriptionLexer.g:1:237: MinimumKind
                {
                mMinimumKind();

                }
                break;
            case 14 :
                // InternalImplementationDescriptionLexer.g:1:249: Properties
                {
                mProperties();

                }
                break;
            case 15 :
                // InternalImplementationDescriptionLexer.g:1:260: Repository
                {
                mRepository();

                }
                break;
            case 16 :
                // InternalImplementationDescriptionLexer.g:1:271: Processor
                {
                mProcessor();

                }
                break;
            case 17 :
                // InternalImplementationDescriptionLexer.g:1:281: RangeKind
                {
                mRangeKind();

                }
                break;
            case 18 :
                // InternalImplementationDescriptionLexer.g:1:291: Container
                {
                mContainer();

                }
                break;
            case 19 :
                // InternalImplementationDescriptionLexer.g:1:301: Ethernet
                {
                mEthernet();

                }
                break;
            case 20 :
                // InternalImplementationDescriptionLexer.g:1:310: Version
                {
                mVersion();

                }
                break;
            case 21 :
                // InternalImplementationDescriptionLexer.g:1:318: Debian
                {
                mDebian();

                }
                break;
            case 22 :
                // InternalImplementationDescriptionLexer.g:1:325: Ubuntu
                {
                mUbuntu();

                }
                break;
            case 23 :
                // InternalImplementationDescriptionLexer.g:1:332: Value
                {
                mValue();

                }
                break;
            case 24 :
                // InternalImplementationDescriptionLexer.g:1:338: Arm64
                {
                mArm64();

                }
                break;
            case 25 :
                // InternalImplementationDescriptionLexer.g:1:344: Focal
                {
                mFocal();

                }
                break;
            case 26 :
                // InternalImplementationDescriptionLexer.g:1:350: Jammy
                {
                mJammy();

                }
                break;
            case 27 :
                // InternalImplementationDescriptionLexer.g:1:356: Kind
                {
                mKind();

                }
                break;
            case 28 :
                // InternalImplementationDescriptionLexer.g:1:361: Name
                {
                mName();

                }
                break;
            case 29 :
                // InternalImplementationDescriptionLexer.g:1:366: Type
                {
                mType();

                }
                break;
            case 30 :
                // InternalImplementationDescriptionLexer.g:1:371: Wlan
                {
                mWlan();

                }
                break;
            case 31 :
                // InternalImplementationDescriptionLexer.g:1:376: Url
                {
                mUrl();

                }
                break;
            case 32 :
                // InternalImplementationDescriptionLexer.g:1:380: Git
                {
                mGit();

                }
                break;
            case 33 :
                // InternalImplementationDescriptionLexer.g:1:384: X86
                {
                mX86();

                }
                break;
            case 34 :
                // InternalImplementationDescriptionLexer.g:1:388: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 35 :
                // InternalImplementationDescriptionLexer.g:1:400: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 36 :
                // InternalImplementationDescriptionLexer.g:1:412: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 37 :
                // InternalImplementationDescriptionLexer.g:1:424: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 38 :
                // InternalImplementationDescriptionLexer.g:1:440: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 39 :
                // InternalImplementationDescriptionLexer.g:1:448: RULE_INT
                {
                mRULE_INT();

                }
                break;
            case 40 :
                // InternalImplementationDescriptionLexer.g:1:457: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 41 :
                // InternalImplementationDescriptionLexer.g:1:469: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 42 :
                // InternalImplementationDescriptionLexer.g:1:485: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 43 :
                // InternalImplementationDescriptionLexer.g:1:493: RULE_ANY_OTHER
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
            return "84:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\33\50\1\107\2\106\1\uffff\1\46\1\uffff\3\46\2\uffff\1\50\1\uffff\35\50\4\uffff\1\106\4\uffff\37\50\1\u008f\1\u0090\27\50\1\uffff\6\50\1\u00ae\2\uffff\27\50\1\u00c6\1\u00c7\1\u00c8\4\uffff\12\50\1\u00d3\12\50\1\uffff\1\u00de\3\uffff\12\50\1\uffff\12\50\1\uffff\22\50\1\u0105\1\uffff\17\50\1\u0115\1\u0116\1\u0117\1\uffff\17\50\3\uffff\6\50\1\u012d\1\u012e\5\50\2\uffff\6\50\2\uffff\1\50\1\uffff\13\50\1\u0146\1\u0147\7\50\3\uffff\33\50\1\uffff\4\50\1\u016e\1\u016f\4\50\2\uffff\3\50\1\uffff\13\50\1\uffff\1\50\1\uffff\4\50\1\uffff";
    static final String DFA18_eofS =
        "\u0187\uffff";
    static final String DFA18_minS =
        "\1\0\1\157\1\155\1\156\1\170\1\151\1\141\1\145\1\127\1\164\1\145\1\162\1\145\1\162\1\141\1\157\1\164\1\141\1\142\1\162\1\157\1\141\1\151\1\141\1\171\1\154\1\151\1\70\1\60\2\56\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\146\1\uffff\1\160\1\143\1\145\1\156\1\143\1\156\1\142\1\123\1\164\1\154\1\157\1\160\1\157\2\156\1\150\1\162\1\154\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\164\1\66\4\uffff\1\60\4\uffff\1\164\2\154\1\143\1\165\1\117\3\151\1\143\1\151\1\127\1\162\1\145\1\160\1\157\1\143\1\147\1\164\1\145\1\163\1\165\1\156\1\72\1\66\1\141\1\155\1\144\2\145\1\156\2\60\1\167\1\145\2\165\1\170\1\123\2\155\1\143\1\162\1\141\1\120\1\151\1\143\1\145\1\163\2\145\1\141\1\162\1\151\1\145\1\164\1\uffff\1\64\1\154\1\171\3\72\1\60\2\uffff\1\141\1\155\1\144\1\164\2\117\2\165\1\145\1\151\1\156\1\141\1\142\1\164\1\162\1\151\1\163\1\113\1\151\1\156\1\157\1\72\1\165\3\60\4\uffff\1\162\2\145\1\151\2\160\2\155\1\122\1\160\1\60\1\162\1\165\1\151\2\164\1\163\1\151\1\156\1\145\1\156\1\uffff\1\60\3\uffff\1\145\1\156\1\123\1\157\2\145\2\113\1\145\1\164\1\uffff\1\145\1\164\1\157\1\151\2\157\1\156\1\145\1\164\1\72\1\uffff\1\103\1\164\1\157\1\156\2\162\2\151\1\161\1\151\1\155\1\145\1\156\1\145\2\162\1\144\1\162\1\60\1\uffff\1\157\1\141\1\146\1\122\2\164\2\156\1\165\1\157\1\145\2\113\1\163\1\171\3\60\1\uffff\1\156\2\164\1\145\2\151\2\144\1\151\1\156\1\164\2\151\2\72\3\uffff\1\146\1\151\1\167\1\161\2\156\2\60\1\162\1\72\1\145\2\156\2\uffff\1\151\1\157\1\141\1\165\2\147\2\uffff\1\145\1\uffff\1\162\2\144\1\147\1\156\1\162\1\151\2\123\1\155\1\72\2\60\1\165\1\104\1\145\1\162\2\171\1\145\3\uffff\1\162\1\145\1\103\1\145\2\163\1\156\1\141\1\163\1\157\1\155\4\164\1\143\1\155\3\145\1\72\1\151\1\162\1\160\1\156\2\155\1\uffff\1\157\1\151\1\157\1\164\2\60\1\156\1\160\1\156\1\72\2\uffff\1\120\1\164\1\145\1\uffff\1\141\1\151\1\156\1\162\1\157\1\164\1\141\1\156\1\72\1\155\1\72\1\uffff\1\145\1\uffff\1\164\1\145\1\162\1\72\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\157\1\155\1\156\1\170\2\151\1\145\1\127\1\164\1\145\1\162\1\145\1\162\1\141\1\157\1\164\1\145\2\162\1\157\1\141\1\151\1\141\1\171\1\154\1\151\1\70\1\71\2\145\1\uffff\1\172\1\uffff\2\uffff\1\52\2\uffff\1\146\1\uffff\1\160\1\143\1\145\1\156\1\170\1\156\1\166\1\123\1\164\1\154\1\157\1\160\1\157\2\156\1\150\1\162\1\154\1\165\1\154\1\155\1\143\1\155\1\156\1\155\1\160\1\141\1\164\1\66\4\uffff\1\71\4\uffff\1\164\2\154\1\143\1\165\1\117\3\151\1\143\1\151\1\127\1\162\1\145\1\160\1\157\1\143\1\147\1\164\1\145\1\163\1\165\1\156\1\72\1\66\1\141\1\155\1\144\2\145\1\156\2\172\1\167\1\145\2\165\1\170\1\123\2\155\1\143\1\162\1\141\1\120\1\151\1\143\1\145\1\163\2\145\1\141\1\162\1\151\1\145\1\164\1\uffff\1\64\1\154\1\171\3\72\1\172\2\uffff\1\141\1\155\1\144\1\164\2\117\2\165\1\145\1\151\1\156\1\141\1\142\1\164\1\162\1\151\1\163\1\113\1\151\1\156\1\157\1\72\1\165\3\172\4\uffff\1\162\2\145\1\151\2\160\2\155\1\122\1\160\1\172\1\162\1\165\1\151\2\164\1\163\1\151\1\156\1\145\1\156\1\uffff\1\172\3\uffff\1\145\1\156\1\123\1\157\2\145\2\113\1\145\1\164\1\uffff\1\145\1\164\1\157\1\151\2\157\1\156\1\145\1\164\1\72\1\uffff\1\103\1\164\1\157\1\156\2\162\2\151\1\161\1\151\1\155\1\145\1\156\1\145\2\162\1\144\1\162\1\172\1\uffff\1\157\1\141\1\146\1\122\2\164\2\156\1\165\1\157\1\145\2\113\1\163\1\171\3\172\1\uffff\1\156\2\164\1\145\2\151\2\144\1\151\1\156\1\164\2\151\2\72\3\uffff\1\146\1\151\1\167\1\161\2\156\2\172\1\162\1\72\1\145\2\156\2\uffff\1\151\1\157\1\141\1\165\2\147\2\uffff\1\145\1\uffff\1\162\2\144\1\147\1\156\1\162\1\151\2\123\1\155\1\72\2\172\1\165\1\104\1\145\1\162\2\171\1\145\3\uffff\1\162\1\145\1\103\1\145\2\163\1\156\1\141\1\163\1\157\1\155\4\164\1\143\1\155\3\145\1\72\1\151\1\162\1\160\1\156\2\155\1\uffff\1\157\1\151\1\157\1\164\2\172\1\156\1\160\1\156\1\72\2\uffff\1\120\1\164\1\145\1\uffff\1\141\1\151\1\156\1\162\1\157\1\164\1\141\1\156\1\72\1\155\1\72\1\uffff\1\145\1\uffff\1\164\1\145\1\162\1\72\1\uffff";
    static final String DFA18_acceptS =
        "\37\uffff\1\45\1\uffff\1\46\3\uffff\1\52\1\53\1\uffff\1\46\35\uffff\1\44\1\42\1\47\1\43\1\uffff\1\45\1\50\1\51\1\52\70\uffff\1\37\7\uffff\1\40\1\41\32\uffff\1\33\1\34\1\35\1\36\25\uffff\1\27\1\uffff\1\30\1\31\1\32\12\uffff\1\25\12\uffff\1\26\23\uffff\1\24\22\uffff\1\23\17\uffff\1\20\1\21\1\22\15\uffff\1\16\1\17\6\uffff\1\14\1\15\1\uffff\1\13\24\uffff\1\10\1\11\1\12\33\uffff\1\7\12\uffff\1\5\1\6\3\uffff\1\4\13\uffff\1\3\1\uffff\1\2\4\uffff\1\1";
    static final String DFA18_specialS =
        "\1\1\41\uffff\1\2\1\0\u0163\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\1\37\3\46\1\43\5\46\1\34\1\46\1\44\1\35\11\36\7\46\1\11\3\41\1\20\2\41\1\10\1\2\2\41\1\5\1\6\2\41\1\15\1\41\1\16\1\12\3\41\1\31\3\41\3\46\1\40\1\41\1\46\1\23\1\41\1\17\1\7\1\4\1\24\1\32\1\41\1\3\1\25\1\26\2\41\1\27\1\41\1\13\1\41\1\14\1\1\1\30\1\22\1\21\1\41\1\33\2\41\uff85\46",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\7\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\3\uffff\1\71",
            "\1\73\17\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\106",
            "\1\111\1\uffff\12\110\13\uffff\1\111\37\uffff\1\111",
            "\1\111\1\uffff\12\112\13\uffff\1\111\37\uffff\1\111",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\114",
            "\0\114",
            "\1\115",
            "",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\24\uffff\1\125",
            "\1\126",
            "\1\131\20\uffff\1\130\2\uffff\1\127",
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
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "",
            "\12\112",
            "",
            "",
            "",
            "",
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
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
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
            "",
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
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
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
            "\1\u0126",
            "",
            "",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "",
            "\1\u013a",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
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
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
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
            "",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
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
            return "1:1: Tokens : ( SoftwareConfigurationParameter | ImplementationDescription | IncludeSoftwareComponent | ExecutionRequirement | LinuxOpertingSystem | MacOSOpertingSystem | DeviceRequirement | HWSWParemeter | AttributeKind | SelectionKind | Description | MaximumKind | MinimumKind | Properties | Repository | Processor | RangeKind | Container | Ethernet | Version | Debian | Ubuntu | Value | Arm64 | Focal | Jammy | Kind | Name | Type | Wlan | Url | Git | X86 | HyphenMinus | RULE_DOUBLE | RULE_DECINT | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA18_35 = input.LA(1);

                        s = -1;
                        if ( ((LA18_35>='\u0000' && LA18_35<='\uFFFF')) ) {s = 76;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='s') ) {s = 1;}

                        else if ( (LA18_0=='I') ) {s = 2;}

                        else if ( (LA18_0=='i') ) {s = 3;}

                        else if ( (LA18_0=='e') ) {s = 4;}

                        else if ( (LA18_0=='L') ) {s = 5;}

                        else if ( (LA18_0=='M') ) {s = 6;}

                        else if ( (LA18_0=='d') ) {s = 7;}

                        else if ( (LA18_0=='H') ) {s = 8;}

                        else if ( (LA18_0=='A') ) {s = 9;}

                        else if ( (LA18_0=='S') ) {s = 10;}

                        else if ( (LA18_0=='p') ) {s = 11;}

                        else if ( (LA18_0=='r') ) {s = 12;}

                        else if ( (LA18_0=='P') ) {s = 13;}

                        else if ( (LA18_0=='R') ) {s = 14;}

                        else if ( (LA18_0=='c') ) {s = 15;}

                        else if ( (LA18_0=='E') ) {s = 16;}

                        else if ( (LA18_0=='v') ) {s = 17;}

                        else if ( (LA18_0=='u') ) {s = 18;}

                        else if ( (LA18_0=='a') ) {s = 19;}

                        else if ( (LA18_0=='f') ) {s = 20;}

                        else if ( (LA18_0=='j') ) {s = 21;}

                        else if ( (LA18_0=='k') ) {s = 22;}

                        else if ( (LA18_0=='n') ) {s = 23;}

                        else if ( (LA18_0=='t') ) {s = 24;}

                        else if ( (LA18_0=='W') ) {s = 25;}

                        else if ( (LA18_0=='g') ) {s = 26;}

                        else if ( (LA18_0=='x') ) {s = 27;}

                        else if ( (LA18_0=='-') ) {s = 28;}

                        else if ( (LA18_0=='0') ) {s = 29;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 30;}

                        else if ( (LA18_0=='#') ) {s = 31;}

                        else if ( (LA18_0=='^') ) {s = 32;}

                        else if ( ((LA18_0>='B' && LA18_0<='D')||(LA18_0>='F' && LA18_0<='G')||(LA18_0>='J' && LA18_0<='K')||(LA18_0>='N' && LA18_0<='O')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='b'||LA18_0=='h'||(LA18_0>='l' && LA18_0<='m')||LA18_0=='o'||LA18_0=='q'||LA18_0=='w'||(LA18_0>='y' && LA18_0<='z')) ) {s = 33;}

                        else if ( (LA18_0=='\"') ) {s = 34;}

                        else if ( (LA18_0=='\'') ) {s = 35;}

                        else if ( (LA18_0=='/') ) {s = 36;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 37;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<=',')||LA18_0=='.'||(LA18_0>=':' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA18_34 = input.LA(1);

                        s = -1;
                        if ( ((LA18_34>='\u0000' && LA18_34<='\uFFFF')) ) {s = 76;}

                        else s = 38;

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
