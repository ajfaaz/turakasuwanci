// Top-level build.gradle.kts (Project-level)
// module-level build.gradle
plugins {
    id("com.android.application") version "8.7.0" // AGP 8.7.0
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // This is where you declare the Google Services plugin
       // Use the latest version
    }
}

// All projects should use these repositories
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}