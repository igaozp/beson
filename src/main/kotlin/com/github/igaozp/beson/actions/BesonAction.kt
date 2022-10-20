package com.github.igaozp.beson.actions

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class BesonAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Notifications.Bus.notify(
            Notification(
                "Print", "Beson", "Hello Beson",
                NotificationType.INFORMATION
            ), e.project
        )
    }

    override fun update(e: AnActionEvent) {
        super.update(e)
    }
}