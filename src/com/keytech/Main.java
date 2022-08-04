package com.keytech;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //JPanel - a GUI components that functions as a container to hold other components

        ImageIcon image = new ImageIcon(Main.class.getResource("/images/one.PNG"));

        JLabel label = new JLabel();
        label.setText("Dah!");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, redPanel.getHeight(), 500, 250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
