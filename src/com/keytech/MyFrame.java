package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("High five"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
    }

}
