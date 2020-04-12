package org.garagesales.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowDateTask extends  DefaultTask {
    String dateMessage = "Current Date: "

    @TaskAction
    def showDate() {
        println "${dateMessage} ${new Date()}"
    }
}
