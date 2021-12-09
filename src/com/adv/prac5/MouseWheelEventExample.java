package com.adv.prac5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseWheelEventExample {

    public static void main(String[] args) {

        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MouseWheelEvent Example");
        frame.setSize(300, 150);

        final JLabel label = new JLabel();
        frame.add(label);

        frame.addMouseWheelListener(new MouseWheelListener() {

            int count = 0;

            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {
                count = count + mwe.getWheelRotation();
                label.setText("Moved: " + count);
            }
        });

        frame.setVisible(true);
    }
}
