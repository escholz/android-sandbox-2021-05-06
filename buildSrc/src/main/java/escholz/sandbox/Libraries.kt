package escholz.sandbox

object Libraries {
    object Kotlin {
        private const val Version = "1.4.32"
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:$Version"
        const val Gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Version"
    }
    object Android {
        const val Gradle = "com.android.tools.build:gradle:7.0.0-beta01"
    }
    object Jetpack {
        object Room {
            private const val Version = "2.3.0"
            const val Runtime = "androidx.room:room-runtime:$Version"
            const val Compiler = "androidx.room:room-compiler:$Version"
            const val KotlinExt = "androidx.room:room-ktx:$Version"
        }
        object Hilt {
            private const val Version = "2.35"
            const val Runtime = "com.google.dagger:hilt-android:$Version"
            const val Compiler = "androidx.hilt:hilt-compiler:1.0.0"
            const val AndroidCompiler = "com.google.dagger:hilt-android-compiler:$Version"
            const val Gradle = "com.google.dagger:hilt-android-gradle-plugin:$Version"
        }
        object Compose {
            private const val Version = "1.0.0-beta07"
            const val UI = "androidx.compose.ui:ui:$Version"
            const val Tooling = "androidx.compose.ui:ui-tooling:$Version"
            const val Foundation = "androidx.compose.foundation:foundation:$Version"
            const val LiveData = "androidx.compose.runtime:runtime-livedata:$Version"
            const val Activity = "androidx.activity:activity-compose:1.3.0-alpha08"
            const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha05"
            const val Material = "androidx.compose.material:material:$Version"
            const val MaterialIcons = "androidx.compose.material:material-icons-core:$Version"
            const val MaterialIconsExtended = "androidx.compose.material:material-icons-extended:$Version"
        }
        const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val AppCompat = "androidx.appcompat:appcompat:1.2.0"
        const val KotlinExt = "androidx.core:core-ktx:1.5.0-rc02"
    }
    object UI {
        const val Material = "com.google.android.material:material:1.3.0"
    }
    object Testing {
        object JUnit {
            const val Gradle = "de.mannodermaus.gradle.plugins:android-junit5:1.7.1.1"
        }
    }
}