package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCheckBoxFrame extends JFrame implements ActionListener {

    private JButton button;
    private JCheckBox checkBox;

    MyCheckBoxFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Am a good bro!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.TRUETYPE_FONT, 35));

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            boolean check = checkBox.isSelected();
            System.out.println(check);
        }
    }
}
