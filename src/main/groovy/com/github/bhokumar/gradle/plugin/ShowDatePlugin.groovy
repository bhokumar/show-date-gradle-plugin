package com.github.bhokumar.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ShowDatePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showDate', type: ShowDateTask)
    }
}