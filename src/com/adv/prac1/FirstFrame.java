package com.adv.prac1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("First JFrame");
        f.setSize(400, 300);
        f.setLayout(null);
        JButton button = new JButton("Save");
        JButton button2 = new JButton("Clear");
        button.setBounds(30, 30, 100, 30);
        button2.setBounds(135, 30, 100, 30);
        f.add(button);
        f.add(button2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
        
    }
}
