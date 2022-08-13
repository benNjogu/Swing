package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBoxFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyComboBoxFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);

        /**
         * @NB
         * To store a primitive datatype within an array use wrapper classes.
         * e.g Integer instead of int
         *      Double instead fo double
         * */

        String[] animals = {"--Select animal--", "Dog", "Cat", "Goat"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        comboBox.addItem("Horse");
        comboBox.insertItemAt("Pig", 1);
        comboBox.removeItem("Cat");

        this.add(comboBox);
        //this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox)
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
    }
}
