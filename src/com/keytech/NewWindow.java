package com.keytech;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    private JFrame frame = new JFrame();
    private JLabel label = new JLabel("high five!");

    public NewWindow() {
        label.setBounds(0, 0, 420, 50);
        label.setFont(new Font(null, Font.ROMAN_BASELINE, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
