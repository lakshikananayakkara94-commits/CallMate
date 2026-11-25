# CallMate

CallMate is an Android application project for managing call recordings on supported Android devices.

## Project setup
- Native Android app using Kotlin and Jetpack Compose
- Minimum Android version: Android 8.0 (API 26)
- Initial release target: 1.0.0
- APK builds are intended to run through GitHub Actions.

## Planned features
- Recording compatibility check and clear status information
- Recording library with date, time, and available caller information
- Playback, rename, delete, and share controls
- Automatic recording preferences where supported by the device and Android version
- Local recording storage management

## Important compatibility note
Android call recording is restricted by Android versions, device manufacturers, dialer apps, regional rules, and applicable laws. CallMate cannot guarantee two-way call recording on every phone. The app will use only supported and permitted recording methods and will clearly indicate limitations. Users are responsible for obtaining any consent required by local law.

## Build
The project is configured to build a debug APK with the repository's GitHub Actions workflow.