plugins {
    alias(libs.plugins.module.android.application)
    alias(libs.plugins.module.android.feature)
}

android {
    namespace = "com.example.fitnessapp"

    defaultConfig {
        applicationId = "com.example.fitnessapp"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.navigation)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(project(":core:network"))
}