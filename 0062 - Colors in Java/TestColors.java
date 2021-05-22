import java.awt.*;
import java.awt.event.*;

public class TestColors implements WindowListener, ActionListener {
    private Frame f;
    private Button b;

    public TestColors(){
        f = new Frame("Frame Title");
        b = new Button("Change Color");
        b.setActionCommand("button press");
    }

    public void launchFrame(){
        b.addActionListener(this);
        b.setForeground(Color.red);
        b.setBackground(Color.yellow);
        f.add(b);
        f.addWindowListener(this);
        f.setSize(300,300);
        f.setBackground(Color.green);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    // Abstract method of ActionListener
    public void actionPerformed(ActionEvent e){ 
        int r, g, b;
        int x, y, z;
        String str1, str2;
            if(e.getActionCommand()=="button press"){
            r = (int) (Math.random()*255);
            g = (int) (Math.random()*255);
            b = (int) (Math.random()*255);
            Color c = new Color(r,g,b);
            f.setBackground(c);
        }
    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    // ABstract method of WindowListener
    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String[] args){
        TestColors tc = new TestColors();
        tc.launchFrame();
    }
}