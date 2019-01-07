package com.hnam.buildsrc

/**
 * Created by nampham on 1/7/19.
 */
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

@SuppressWarnings("GroovyUnusedDeclaration")
public class BumpVersion extends DefaultTask {

    def readMe
    def versionName
    def overrideContent

    File getReadMe() {
        project.file(readMe)
    }

    BumpVersion() {
        group = 'plugin intermediate'
    }

    @TaskAction
    def bump() {
        description = 'Updates ReadMe file with the latest version'

        File readMeFile = getReadMe()
        String contents = readMeFile.getText('UTF-8')
        contents = contents.replaceAll("${overrideContent}.*", "plugin:${overrideContent}${versionName}")
        readMeFile.write(contents, 'UTF-8')
    }

}