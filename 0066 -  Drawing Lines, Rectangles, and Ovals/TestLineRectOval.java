import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestLineRectOval extends JFrame {
    private static final long serialVersionUID = 0;

    public TestLineRectOval() {
        super("Lines Rectangles Ovals");
        setSize(360, 450);
        show();
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(50,40,  300, 40);

        g.setColor(Color.blue);
        g.drawRect(50,60,  100, 60);
        g.fillRect(200,60,  100, 60);

        g.setColor(Color.cyan);
        g.drawRoundRect(50,150,  100, 60, 50, 50);
        g.fillRoundRect(200,150,  100, 60, 50, 50);

        g.setColor(Color.yellow);
        // g.draw3DRect(x, y, width, height, raised);
        g.draw3DRect(200,250,  100, 60, true);
        g.fill3DRect(200,250,  100, 60, true);

        g.setColor(Color.magenta);
        g.drawOval(50, 350, 100, 60);
        g.fillOval(200, 350, 100, 60);
    }

    public static void main(String[] args){
        TestLineRectOval tlro = new TestLineRectOval();
        tlro.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}