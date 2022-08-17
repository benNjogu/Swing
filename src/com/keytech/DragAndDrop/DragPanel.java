package com.keytech.DragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    private ImageIcon icon = new ImageIcon(DragPanel.class.getResource("/images/brocn.png"));
    private final int WIDTH = icon.getIconWidth();
    private final int HEIGHT = icon.getIconHeight();
    private Point imageCorner;
    private Point prevPoint;

    DragPanel(){
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        icon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            imageCorner.translate(
                    (int)(currentPoint.getX() - prevPoint.getX()),
                    (int)(currentPoint.getY() - prevPoint.getY())
            );

            prevPoint = currentPoint;
            repaint();
        }
    }
}
