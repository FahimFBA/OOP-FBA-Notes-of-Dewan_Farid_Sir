import java.awt.*;
import java.awt.event.*;

public class FrameWithPanel implements WindowListener {
    private Frame f;
    private Panel p;

    public FrameWithPanel(){
        f = new Frame ("Frame title");
        p = new Panel();
    }
    public void launchFrame(){
        f.addWindowListener(this);
        f.setSize(400,400);
        f.setBackground(Color.red);
        f.setLayout(null);
        
        p.setSize(150,150);
        p.setBackground(Color.green);
        
        f.add(p);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public void windowOpened(WindowEvent e){}
    public void WindowIconified(WindowEvent e){}
    public void WindowDeiconified(WindowEvent e){}
    public void WindowClosed(WindowEvent e){}
    public void WindowActivated(WindowEvent e){}
    public void WindowDeactivated(WindowEvent e){}

    public static void main(String[] args){
        FrameWithPanel fp = new FrameWithPanel();
        fp.launchFrame();
    }
}


/**   AWT is the basic GUI (Graphics User Interface) used for Java applications and applets. 
Every GUI component that appears on the screen is a subclass of the abstract class Component or MenuComponent. 
The class Container is an abstract subclass of Component class, which permits other components to be nested inside it. 
There are two types of containers: Window and Panel. 
A Window is a free-standing native window on the display that is independent of other containers. 
There are two important types of Window containers: Frame and Dialog. 
A Frame is a window with a title and corners that you can resize. 
A Dialog is a simple window and cannot have a menu bar, you cannot resize it, but you can move it. 
A Panel must be contained within another Container, or inside a web browser’s window.    */