package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextViewFrame extends JFrame implements ActionListener {

    private JButton button;
    private JTextField textField;

    MyTextViewFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);

        this.add(button);
        this.add(textField);
        this.pack();//size of the frame adjust to fit the components added.
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
                System.out.println("Welcome "+textField.getText());
                button.setEnabled(false);
                textField.setEditable(false);
        }
    }
}
