import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestFonts extends JFrame {
    private static final long serialVersionUID = 0;

    public TestFonts(){
        super("Font Examples");
        setSize(300,150);
        show();
    }

    public void paint(Graphics g){
        g.drawString("Welcome to Java." , 20, 50);
        g.setColor(Color.red);
        g.setFont(new Font("Monospaced" , Font.BOLD, 14));
        g.drawString("Welcome to Java." , 20, 70);
        g.setColor(Color.blue);
        g.setFont(new Font("SansSerif" , Font.BOLD + Font.ITALIC , 16));
        g.drawString("Welcome to Java." , 20, 90);
    }

    public static void main(String[] args){
        TestFonts tf = new TestFonts();
        tf.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}