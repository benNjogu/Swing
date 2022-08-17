package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListenerFrame extends JFrame implements MouseListener {

    private JLabel label;
    private ImageIcon brocon;
    private ImageIcon brosforever;
    private ImageIcon point;
    private ImageIcon suitup;

    MyMouseListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when a mouse enters a component
        System.out.println("You entered the mouse zone");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        System.out.println("You exited the mouse zone");
        label.setBackground(Color.red);
    }
}
