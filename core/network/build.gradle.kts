plugins {
    alias(libs.plugins.module.android.library)
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "com.example.fitnessapp.core.network"
}

dependencies {
    implementation(libs.kotlinx.serialization)
    implementation(libs.bundles.ktor)
}