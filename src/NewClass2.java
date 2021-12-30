
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;



public class NewClass2 extends JFrame implements MouseListener{

    public NewClass2() {
        setSize(500,500);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }
    public static void main(String[] args) {
        new NewClass2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.err.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.err.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.err.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.err.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.err.println("mouseExited");
    }

    
}
