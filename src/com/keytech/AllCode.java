package com.keytech;


import javax.swing.*;
import java.awt.*;

public class AllCode {
    /*
    CHAPTER ONE and TWO

    //JLabel is a GUI display area for a string of text, an image or both

    ImageIcon image = new ImageIcon(Main.class.getResource("/images/bro1.jpg"));
    Border border = BorderFactory.createLineBorder(new Color(13, 7, 99), 3);

    JLabel label = new JLabel();//Create a label
        label.setText("Dude, do you write code?");//set text of Label.
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT, CENTER or RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP, CENTER or BOTTOM of imageIcon
        label.setForeground(new Color(13, 7, 99));//set font color of text
        label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 48));//set font of text
        label.setIconTextGap(-4);//set gap of text to image
        label.setBackground(Color.darkGray);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
    //label.setBounds(100,100,240, 240);//set x,y position within frame as well as dimensions


    JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
    //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.setBackground(new Color(0x1371999));
        frame.setIconImage(image.getImage());
    //NB: Add all your components before using pack
        frame.pack();//resize the frame to accommodate all the components that you have

        CHAPTER 3.
         //JPanel - a GUI components that functions as a container to hold other components

        ImageIcon image = new ImageIcon(Main.class.getResource("/images/one.PNG"));

        JLabel label = new JLabel();
        label.setText("Dah!");
        label.setIcon(image);
        /**@the below line only apply when using border layouts
         *
    //label.setVerticalAlignment(JLabel.BOTTOM);
    //label.setHorizontalAlignment(JLabel.RIGHT);
       /* label.setBounds(100, 100, 75, 75);//if not using boarder layout

    JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

    JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

    JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, redPanel.getHeight(), 500, 250);
        greenPanel.setLayout(null);

    JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);*/

    /*
        BORDER LAYOUT:-
    JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));//sets margins of the panels
        frame.setVisible(true);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();


        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

    //------------------sub-panels------------------------------
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();


        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.blue);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

    //-----------------------------------------------------

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        */
    /*
            FLOW LAYOUT;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));

        frame.add(panel);
        frame.setVisible(true);

    * */
}
