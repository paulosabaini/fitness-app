import org.gradle.initialization.DependenciesAccessors
import org.gradle.kotlin.dsl.support.serviceOf

plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)

    gradle.serviceOf<DependenciesAccessors>().classes.asFiles.forEach {
        compileOnly(files(it.absolutePath))
    }
}

group = "com.example.fitnessapp.build-logic"

gradlePlugin {
    plugins {
        register("moduleAndroidApplication") {
            id = "com.example.fitnessapp.module.android.application"
            implementationClass = "com.example.fitnessapp.build_logic.AndroidApplicationModulePlugin"
        }
        register("moduleAndroidLibrary") {
            id = "com.example.fitnessapp.module.android.library"
            implementationClass = "com.example.fitnessapp.build_logic.AndroidLibraryModulePlugin"
        }
        register("moduleAndroidFeature") {
            id = "com.example.fitnessapp.module.android.feature"
            implementationClass = "com.example.fitnessapp.build_logic.AndroidFeatureModulePlugin"
        }
    }
}