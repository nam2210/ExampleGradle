package com.hnam.buildsrc

/**
 * Created by nampham on 1/7/19.
 */
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

@SuppressWarnings("GroovyUnusedDeclaration")
public class DisplayVersion extends DefaultTask {

    def versionName

    DisplayVersion() {
        group = 'plugin intermediate'
    }

    @TaskAction
    def display() {
        description = 'Prints out the current version number'

        println "**** My Version: ${project.android.defaultConfig.versionName} ****"
    }

}
