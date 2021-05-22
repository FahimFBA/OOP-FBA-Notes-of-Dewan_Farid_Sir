

import java.awt.*;
import java.awt.event.*; 

public class JavaLecture18 implements WindowListener, ActionListener {
    
    private Frame f; 
    private MenuBar mb;
    private Menu m1, m2, m3;
    private MenuItem mi1_1 , mi1_2 , mi1_3, mi1_4, mi2_1, mi2_2;
    private TextField tf1,tf2,tf3;
    private Button b1, b2, b3; 
    
    public JavaLecture18(){
        f = new Frame("Welcome to Java GUI");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        mi1_1 = new MenuItem("Open File");
        mi1_2 = new MenuItem("Save");
        mi1_3 = new MenuItem("Save As");
        mi1_4 = new MenuItem("Exit");
        mi1_4.setActionCommand("exit");
        mi2_1 = new MenuItem("Change Background Colour of Frame");
        mi2_1.setActionCommand("change_colour_of_frame");
        
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        
        b1 = new Button("Add");
        b1.setActionCommand("b1");
        
        b2 = new Button("2");
        b2.setActionCommand("b2");
        
        b3 = new Button("3");
        b3.setActionCommand("b3");
        
    }
    
    public void display(){
        m1.add(mi1_1);
        m1.add(mi1_2);
        m1.add(mi1_3);
        m1.addSeparator( );
        m1.add(mi1_4);
        mi1_4.addActionListener(this);
        m2.add(mi2_1);
        mi2_1.addActionListener(this);
        mb.add(m1);
        mb.add(m2);
        mb.setHelpMenu(m3);
        f.setMenuBar(mb);
        
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.RED);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        tf1.setForeground(Color.white);
        tf1.setBackground(Color.BLUE);
        tf2.setForeground(Color.white);
        tf2.setBackground(Color.BLUE);
        tf3.setForeground(Color.white);
        tf3.setBackground(Color.BLUE);
        
        f.setLayout(new FlowLayout());
        f.add(tf1);
        f.add(tf2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(tf3);
        
        f.addWindowListener(this);
        f.setSize(500, 600);
        f.setBackground(Color.green);
        f.setVisible(true);
    }
    
    // Abstract methods of WindowListener interface; 
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e){System.exit(0);}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    
    // Abstract method for ActionListener
    public void actionPerformed(ActionEvent e){ 
        int r, g, b;
        int x, y, z;
        String str1, str2;
        if(e.getActionCommand()=="exit")
            System.exit(0);
        if(e.getActionCommand()=="change_colour_of_frame"){
            r = (int) (Math.random()*255);
            g = (int) (Math.random()*255);
            b = (int) (Math.random()*255);
            Color c = new Color(r,g,b);
            f.setBackground(c);
        }
        else if(e.getActionCommand()=="b1") {
            str1 = tf1.getText();
            str2 = tf2.getText();
            x = Integer.parseInt(str1);
            y = Integer.parseInt(str2);
            z = x+y;
            str1 = String.valueOf(z);
            tf3.setText(str1);
        }
        else if(e.getActionCommand()=="b2"){
            str1 = String.valueOf(2);
            tf1.setText(str1);
        }
        else if(e.getActionCommand()=="b3"){
            str1 = String.valueOf(3);
            tf2.setText(str1);
        }
        else {
            
        }
    }

    public static void main(String[] args) {
        JavaLecture18 x = new JavaLecture18();
        x.display();
    }
    
}