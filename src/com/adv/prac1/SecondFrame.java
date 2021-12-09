package com.adv.prac1;

import java.awt.FlowLayout;
import javax.swing.*;


public class SecondFrame extends JFrame{

    public SecondFrame(){
        setTitle("First JFrame");
        setSize(400, 300);
        setLayout(new FlowLayout());
        JButton button = new JButton("Save");
        JButton button2 = new JButton("Clear");
        add(button);
        add(button2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new SecondFrame();
    }
}
