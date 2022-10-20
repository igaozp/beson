package com.github.igaozp.beson.configuration

import com.intellij.openapi.options.Configurable
import com.intellij.ui.JBColor
import java.awt.GridLayout
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

class SettingConfiguration : Configurable {
    private val component: JComponent
    private val firstConfig: JTextField
    private val secondConfig: JTextField
    private val firstConfigHint = "Please input first config"
    private val secondConfigHint = "Please input second config"

    constructor() {
        component = JPanel()
        component.setLayout(GridLayout(15, 1))

        firstConfig = JTextField()
        secondConfig = JTextField()

        firstConfig.text = firstConfigHint
        firstConfig.foreground = JBColor.GRAY
        firstConfig.addFocusListener(TextFieldListener(firstConfig, firstConfigHint))

        secondConfig.text = secondConfigHint
        secondConfig.foreground = JBColor.GRAY
        secondConfig.addFocusListener(TextFieldListener(secondConfig, secondConfigHint))

        component.add(firstConfig)
        component.add(secondConfig)
    }

    override fun createComponent(): JComponent {
        return component
    }

    override fun isModified(): Boolean {
        return true
    }

    override fun apply() {
        println(firstConfig)
        println(secondConfig)
    }

    override fun getDisplayName(): String {
        return "Beson"
    }

    inner class TextFieldListener : FocusListener {
        private val defaultHint: String
        private val textField: JTextField

        constructor(textField: JTextField, defaultHint: String) {
            this.defaultHint = defaultHint
            this.textField = textField
        }

        override fun focusGained(e: FocusEvent?) {
            if (textField.text.equals(defaultHint)) {
                textField.text = ""
                textField.foreground = JBColor.BLACK
            }
        }

        override fun focusLost(e: FocusEvent?) {
            if (textField.text.equals("")) {
                textField.text = defaultHint
                textField.foreground = JBColor.GRAY
            }
        }
    }

}