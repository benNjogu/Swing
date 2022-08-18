package com.keytech.animations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image bro;
    Image broGround;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        bro = new ImageIcon(MyPanel.class.getResource("/images/brocon.png")).getImage();
        broGround = new ImageIcon(MyPanel.class.getResource("/images/suiteup.png")).getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);//This will paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(broGround, 0, 0, null);
        g2D.drawImage(bro, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x+bro.getWidth(null) >= PANEL_WIDTH || x < 0)
            xVelocity *= -1;

        x += xVelocity;

        if (y+bro.getHeight(null) >= PANEL_HEIGHT || y < 0)
            yVelocity *= -1;

        y += yVelocity;
        repaint();
    }
}
