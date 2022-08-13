package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonFrame extends JFrame implements ActionListener {

    private JRadioButton pizzaButton;
    private JRadioButton burgerButton;
    private JRadioButton hotDogButton;
    private ButtonGroup group;
    MyRadioButtonFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        burgerButton = new JRadioButton("Hamburger");
        hotDogButton = new JRadioButton("Hotdog");

        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotDogButton);

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotDogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton)
            System.out.println("Have some Pizza");
        else if (e.getSource() == burgerButton)
            System.out.println("You ordered a Burger");
        else if (e.getSource() == hotDogButton)
            System.out.println("You ordered Hotdog");
    }
}
