package com.arielcabib.plugin.gradle.rust

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by ariel on 17/05/15.
 */
class RustPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('rustBuild') << {
            println "Cargo building"
            project.exec {
                commandLine 'cargo', 'build'
            }
        }

        project.task('rustRun') << {
            println "Cargo running"
            project.exec {
                commandLine 'cargo', 'run'
            }
        }
    }
}
