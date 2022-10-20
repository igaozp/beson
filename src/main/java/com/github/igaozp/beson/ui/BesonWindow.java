package com.github.igaozp.beson.ui;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class BesonWindow {

    private JTextArea jsonContent;
    private JPanel mainPanel;
    private JButton confirm;

    public BesonWindow() {

    }

    public JTextArea getJsonContent() {
        return jsonContent;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton getConfirm() {
        return confirm;
    }
}
