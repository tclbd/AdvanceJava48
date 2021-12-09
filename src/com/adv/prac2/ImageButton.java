package com.adv.prac2;

import java.awt.Button;
import javax.swing.*;

public class ImageButton {

    ImageButton() {
        JFrame f = new JFrame();
        //System.out.println(getClass().getResource(""));
        ImageIcon ic = new ImageIcon(getClass().getResource("window_close.png"));
        JButton b = new JButton("Close");
        b.setIcon(ic);
        
        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButton();
    }
}
