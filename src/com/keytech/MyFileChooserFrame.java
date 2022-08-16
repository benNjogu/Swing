package com.keytech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFileChooserFrame extends JFrame implements ActionListener {

    private JButton button;

    MyFileChooserFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();

            //fileChooser.setCurrentDirectory(new File("."));//to set to your current project folder.

            fileChooser.setCurrentDirectory(new File("C:\\Users\\User\\Desktop"));

            //int response = fileChooser.showOpenDialog(null);//Select file to open
            int response = fileChooser.showSaveDialog(null);//Select file to save

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
