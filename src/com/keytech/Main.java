package com.keytech;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //A JFrame is a GUI window to add components to
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("Mens Conference");//sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//prevent frame from being resized

        frame.setSize(420, 420);//sets the x-dimension and the y-dimension of the frame
        frame.setVisible(true);//make frame visible

        //below we use getResource since our image is located in a package
        ImageIcon image = new ImageIcon(Main.class.getResource("/images/TDD.PNG"));//create image icon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(Color.green);//will change colour of background
        frame.getContentPane().setBackground(new Color(0x1371999));//will change colour of background

    }
}
