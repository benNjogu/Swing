package com.keytech;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //JOptionPane - pop up a standard dialog box that prompts users for a value or
        //              informs them of something.

        JOptionPane.showMessageDialog(null, "Bros b4 Hoes", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bros b4 Hoes", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bros b4 Hoes", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bros b4 Hoes", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Bros b4 Hoes", "title", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Bros b4 Hoes", "title", JOptionPane.WARNING_MESSAGE);

        String name = JOptionPane.showInputDialog("what is your name?");
        System.out.println(name);

        String[] responses = {"No, u are awesome!", "Hi five", "*blush*"};
        ImageIcon imageIcon = new ImageIcon(Main.class.getResource("/images/bro1.jpg"));
        JOptionPane.showOptionDialog(null,
                "you are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                imageIcon,
                responses,
                0);
    }
}
