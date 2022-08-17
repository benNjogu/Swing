package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListenerFrame extends JFrame implements MouseListener {

    private JLabel label;
    //icons
    private ImageIcon brocon;
    private ImageIcon brosforever;
    private ImageIcon point;
    private ImageIcon suitup;

    MyMouseListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        //init variables
        label = new JLabel();
        this.addMouseListener(this);

        brocon = new ImageIcon(MyMouseListenerFrame.class.getResource("/images/brocon.png"));
        brosforever = new ImageIcon(MyMouseListenerFrame.class.getResource("/images/brosforever.png"));
        suitup = new ImageIcon(MyMouseListenerFrame.class.getResource("/images/suitup.png"));
        point = new ImageIcon(MyMouseListenerFrame.class.getResource("/images/point.png"));

        label.setIcon(brocon);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        label.setIcon(suitup);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        label.setIcon(brosforever);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when a mouse enters a component
        label.setIcon(point);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        label.setIcon(brocon);
    }
}
