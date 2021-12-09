package com.adv.prac2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FirstFrame implements ActionListener{
    JButton button;
    JButton button2;
    
    FirstFrame(){
        JFrame f = new JFrame();
        f.setTitle("First JFrame");
        f.setSize(400, 300);
        f.setLayout(null);
        button = new JButton("Save");
        button2 = new JButton("Clear");
        button.setBounds(30, 30, 100, 30);
        button2.setBounds(135, 30, 100, 30);
        button.setFont(new Font("Arial", Font.ITALIC, 14));
        f.add(button);
        f.add(button2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        //f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
        }
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(f);
        } catch (Exception e) {
            System.err.println("Look and feel not set.");
        }
       
        
        button.addActionListener(this);
        button2.addActionListener(this);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //System.out.println("save");
            JOptionPane.showMessageDialog(null, "save");
        }
        if(e.getSource()==button2){
            System.out.println("clear");
        }
    }
}
