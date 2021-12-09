
package com.adv.prac3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author User
 */
public class JavaCheckBoxAndRadioMenuItem implements ActionListener {

    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem newMenuItem;
    JCheckBoxMenuItem menuitem1 ;
    JRadioButtonMenuItem menuitem2;
    JLabel label;
    
    public JavaCheckBoxAndRadioMenuItem() {
        frame = new JFrame("MenuSample Example");
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        menuitem1 = new JCheckBoxMenuItem("Check Box");
        menuitem2 = new JRadioButtonMenuItem("Radio");
        label = new JLabel("Hello");
        menuBar.add(fileMenu);
        fileMenu.add(newMenuItem);
        fileMenu.add(menuitem1);
        fileMenu.add(menuitem2);
        menuitem1.addActionListener(this);        
        menuitem2.addActionListener(this);
        frame.setJMenuBar(menuBar);        
        frame.add(label);
        frame.setSize(350, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(final String args[]) {
        new JavaCheckBoxAndRadioMenuItem();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuitem1) {
            boolean selected = menuitem1.getModel().isSelected();
            String newLabel;
            if (selected) {
                newLabel = "Selected first";
            } else {
                newLabel = "Not Selected first";
            }
            label.setText(newLabel);
        }
        if (e.getSource() == menuitem2) {
            boolean selected = menuitem2.getModel().isSelected();
            String newLabel;
            if (selected) {
                newLabel = "Selected second";
            } else {
                newLabel = "Not Selected second";
            }
            label.setText(newLabel);
        }
    }
}
