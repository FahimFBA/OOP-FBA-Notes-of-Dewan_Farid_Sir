import java.awt.*;
import java.awt.event.*;

public class GridExample implements WindowListener{
    private Frame f;
    private Button b1, b2, b3, b4, b5, b6;

    public GridExample(){
        f = new Frame("FlowLayout");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        b6 = new Button("Button 6");
    }

    public void launchFrame(){
        f.setLayout(new GridLayout(3,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.addWindowListener(this);
        f.setSize(300,300);
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
        GridExample ge = new GridExample();
        ge.launchFrame();
    }
}