
package com.adv.prac3;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JToggleButtonEvents {

    public static void main(String[] args) {
        JToggleButton jtb = new JToggleButton("Press Me");
//        jtb.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent ev) {
//                System.out.println("ActionEvent!");
//            }
//        });
        jtb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ev) {
                if (ev.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("button is selected");
                } else if (ev.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("button is not selected");
                }
            }
        });
//        jtb.addChangeListener(new ChangeListener() {
//
//            @Override
//            public void stateChanged(ChangeEvent ev) {
//                System.out.println("ChangeEvent!");
//            }
//        });
        JFrame f = new JFrame();
        //f.addWindowListener(this);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jtb);
        f.pack();
        f.setVisible(true);
    }
}