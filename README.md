# Xazab DAPI Client for JVM

# Building
This depends on the `android-dpp` library
```
git clone https://github.com/xazab/android-dpp.git
cd android-dpp
./gradlew assemble
```
Build this library:
```
git clone https://github.com/xazab/dapi-client-android.git
cd dapi-client-android
./gradlew assemble
```
- After building it will be available on the local Maven repository.
- To use it with gradle, add `mavenLocal()` to the `repositories` list in your `build.gradle` file and add `org.xazab:dapi-client:0.16-SNAPSHOT` as dependency. 

# Tests
Run tests with `gradle build test`

# Updating DPP
The .proto files are located here: https://github.com/xazab/dapi-grpc.git (`/protos` directory)

In this project, they are in the `/src/main/proto` directory

# TODO
- Publish to jcenter/maven central
