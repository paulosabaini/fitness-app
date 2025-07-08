package com.example.fitnessapp.build_logic

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            setupAndroidModule(isApplication = true)
            setupBaseDependencies()
        }
    }
}