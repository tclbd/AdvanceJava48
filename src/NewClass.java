
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class NewClass extends JFrame{

    JButton btn1, btn2;
    public NewClass() {
        btn1 = new JButton("Button1");
        btn2 = new JButton("Button2");
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(btn1);
        add(btn2);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello 2");
            }
        });
        
    }
    public static void main(String[] args) {
        new NewClass();
    }
    
}
