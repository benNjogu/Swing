package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon image = new ImageIcon(MyFrame.class.getResource("/images/one.PNG"));
        ImageIcon image2 = new ImageIcon(MyFrame.class.getResource("/images/one.PNG"));

        label = new JLabel();
        label.setIcon(image2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("I'm a button!");
        button.setFocusable(false);
        //button.setIcon(image);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.ROMAN_BASELINE, 25));
       // button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("High five");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
