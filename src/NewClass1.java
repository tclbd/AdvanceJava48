
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewClass1 extends JFrame implements ActionListener {

    JButton btn1, btn2;

    public NewClass1() {
        btn1 = new JButton("Button1");
        btn2 = new JButton("Button2");
        setSize(500, 500);
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NewClass1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            System.out.println("hello");
        }
        if (e.getSource() == btn2) {
            System.out.println("hello2");
        }

    }

}
