package com.github.dragonwzj.codegenplugin.services

import com.github.dragonwzj.codegenplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
