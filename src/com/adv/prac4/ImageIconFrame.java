
package com.adv.prac4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ImageIconFrame extends JFrame implements ActionListener{
JLabel lbl;
JButton btn;
    public ImageIconFrame() {
        // get screen dimensions
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
// set frame width, height and let platform pick screen location
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);
// set frame icon and title
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("branch.png"));
        setIconImage(img);
        setTitle("Hello");
        lbl = new JLabel("Welcome");
        btn = new JButton("Save");
        setLayout(new FlowLayout());
        add(lbl);
        add(btn);
        btn.addActionListener(this);
    }
    public static void main(String[] args) {
        ImageIconFrame frame = new ImageIconFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
        JOptionPane.showMessageDialog(rootPane, "You Clicked me");
        }
    }
}
