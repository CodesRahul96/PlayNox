# PlayNox Player

![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-100%25-B125EA?logo=kotlin&logoColor=white)
![Min SDK](https://img.shields.io/badge/Min%20SDK-26%20%28Android%208.0%2B%29-blue)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Latest Release](https://img.shields.io/github/v/release/CodesRahul96/PlayNox?logo=github)](https://github.com/CodesRahul96/PlayNox/releases)

**PlayNox Player** is a high-performance, native Android video player application built with Kotlin, Jetpack Compose, and the MPV Media Engine. Designed for absolute playback smoothness, clean Material Design 3 aesthetics, deep customization, and broad media format compatibility.

---

## 🌟 Key Features

### 🎬 Advanced Playback Engine (MPV)
- **Desktop-Class Decoding:** Powered by `libmpv` (v0.37.0+) with native `mediacodec` hardware acceleration (HW / HW+ / SW decoding).
- **Smart Audio Boost:** Amplify low-volume media safely up to 200%.
- **Rich Subtitle Control:** Cycle tracks, adjust subtitle delay, scaling, offsets, and custom fonts.
- **Smart Video Enhancement:** Real-time hardware adjustments for Brightness, Contrast, Saturation, Gamma, and Hue.

### 🎨 Clean Material Design 3 & Theme Customization
- **Material You Dynamic Colors:** Full integration with Android 12+ dynamic system palettes.
- **Dark & AMOLED Themes:** True black modes for battery efficiency on OLED displays.
- **Multilingual Support:** Native **English** and **Marathi (मराठी)** language localization support across all screens.

### ⚡ Deep Gestures & Customization
- **Edge Controls:** Vertical swipe gestures for fast brightness and volume adjustments.
- **Multi-Touch Gestures:** Customizable multi-finger tap actions (Play/Pause, Seek, Fast Forward).
- **Layout Editor:** Customize player overlay panels and floating control buttons.
- **mpv.conf Editor:** Built-in in-app editor to tweak MPV engine parameters directly.

---

## 🛠️ Technology Stack

- **UI Framework:** 100% Jetpack Compose with Material 3 components
- **Media Engine:** MPV Player Engine (`is.xyz.mpv`) + FFmpeg 6.1
- **Async & Reactive:** Kotlin Coroutines & StateFlow
- **Image & Thumbnail Loading:** Coil 3
- **Metadata Extraction:** MediaInfo Native Library

---

## 🚀 Building from Source

### Prerequisites
- **Android Studio:** Ladybug or newer
- **JDK:** 17+
- **Android SDK:** API 34+ (compileSdk 36)

### Steps

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/CodesRahul96/PlayNox.git
   cd PlayNox
   ```

2. **Download `mpvlib.aar`:**
   Download `mpvlib.aar` from [mpvlibAndroid Releases](https://github.com/SunnyVishnu3/mpvlibAndroid/releases/latest) and place it inside `app/libs/`:
   ```bash
   curl -L -o "app/libs/mpvlib.aar" "https://github.com/SunnyVishnu3/mpvlibAndroid/releases/download/2026-6-1/mpvlib.aar"
   ```

3. **Build APK:**
   ```bash
   ./gradlew assembleRelease
   ```

---

## 👤 Developer & Credits

- **Developer:** [CodesRahul96 (Rahul)](https://github.com/CodesRahul96)
- **Repository:** [PlayNox on GitHub](https://github.com/CodesRahul96/PlayNox)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
