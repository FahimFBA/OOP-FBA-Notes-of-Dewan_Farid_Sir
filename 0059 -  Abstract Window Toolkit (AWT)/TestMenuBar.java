import java.awt.*;
import java.awt.event.*;

public class TestMenuBar implements WindowListener, ActionListener{
    private Frame f;
    private MenuBar mb;
    private Menu m1, m2, m3;
    private MenuItem mi1, mi2, mi3, mi4;

    public TestMenuBar(){
        f = new Frame("MenuBar Example");
        mb = new MenuBar();
        // Menu Bar
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        // Menu List
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("Load");
        mi4 = new MenuItem("Quit");
    }

    public void launchFrame(){
        mi4.addActionListener(this);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);

        mb.add(m1);
        mb.add(m2);
        mb.setHelpMenu(m3);
        f.setMenuBar(mb);

        f.addWindowListener(this);
        f.setSize(400,400);
        f.setBackground(Color.red);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.exit(0);
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
        TestMenuBar tmb = new TestMenuBar();
        tmb.launchFrame();
    }

}