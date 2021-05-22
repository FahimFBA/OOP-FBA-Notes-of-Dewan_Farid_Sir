import java.awt.*;
import java.awt.event.*;

public class FlowExample implements WindowListener{
    private Frame f;
    private Button b1, b2, b3;

    public FlowExample(){
        f = new Frame("FlowLayout");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
    }

    public void launchFrame(){
        f.setLayout(new FlowLayout());
        // f.setLayout(new FlowLayout(FlowLayout.LEFT));
        // f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        // f.setLayout(new FlowLayout(FlowLayout.CENTER));
        // f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.addWindowListener(this);
        f.setSize(250,150);
        f.setBackground(Color.red);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String[] args){
        FlowExample fe = new FlowExample();
        fe.launchFrame();
    }
}