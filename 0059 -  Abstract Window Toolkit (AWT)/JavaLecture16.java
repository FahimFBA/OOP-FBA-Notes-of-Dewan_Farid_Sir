import java.awt.*;
import java.awt.event.*;

public class JavaLecture16 implements WindowListener {
    private Frame f;

    public JavaLecture16() {
        f = new Frame();
    }

    public void display() {
        f.addWindowListener(this);
        f.setSize(500, 500);
        f.setBackground(Color.red);
        f.setLayout(null);
        f.setVisible(true);
    }

    // Abstract methods of WindowListener interface
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){System.exit(0);}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    // main method

    public static void main(String[] args){
        JavaLecture16 x = new JavaLecture16();
        x.display();
    }
}