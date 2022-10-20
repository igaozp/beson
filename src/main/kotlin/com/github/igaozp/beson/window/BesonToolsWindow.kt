package com.github.igaozp.beson.window

import com.github.igaozp.beson.ui.BesonWindow
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory

class BesonToolsWindow : ToolWindowFactory {

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val besonWindow = BesonWindow()
        val content = contentFactory.createContent(besonWindow.mainPanel, "", false)
        toolWindow.contentManager.addContent(content)
    }

}