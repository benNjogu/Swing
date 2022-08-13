package com.keytech;

import javax.swing.*;
import java.awt.*;

public class MyProgressBarFrame {

    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(0, 100);

    MyProgressBarFrame(){

        progressBar.setBounds(0, 0, 420, 40);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.BOLD, 25));
        progressBar.setBackground(Color.black);
        progressBar.setForeground(Color.red);

        frame.add(progressBar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    private void fill() {
        int counter = 100;
        while(counter >= 0){
            progressBar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter --;
        }

        progressBar.setString("START!");
    }

}
