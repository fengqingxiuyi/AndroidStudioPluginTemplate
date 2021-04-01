package com.github.fengqingxiuyi.androidstudioplugintemplate.services

import com.github.fengqingxiuyi.androidstudioplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
