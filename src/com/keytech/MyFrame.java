package com.keytech;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Mens Conference");//sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent this from being resized

        this.setSize(420, 420);//sets the x-dimension and the y-dimension of the this
        this.setVisible(true);//make this visible

        //below we use getResource since our image is located in a package
        ImageIcon image = new ImageIcon(Main.class.getResource("/images/TDD.PNG"));//create image icon
        this.setIconImage(image.getImage());//change icon of this
        this.getContentPane().setBackground(Color.green);//will change colour of background
        this.getContentPane().setBackground(new Color(0x1371999));//will change colour of background

    }
}
