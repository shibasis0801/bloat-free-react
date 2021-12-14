const android = require('@react-native-community/cli-platform-android');

module.exports = {
    commands: require('@callstack/repack/commands'),
    project: {
        android: {
            sourceDir: "."
        }
    }
}
