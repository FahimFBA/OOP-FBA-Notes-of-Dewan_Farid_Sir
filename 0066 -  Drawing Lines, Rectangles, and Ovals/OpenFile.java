import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpenFile extends JFrame {
    private static final long serialVersionUID = 0;
    private JButton b1;
    private JFileChooser jfc;

    public OpenFile() {
        super("File Opener");
        b1 = new JButton("Open File Chooser");
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                abc();
            }
        }

        );
        getContentPane().add(b1, BorderLayout.NORTH);
        setSize(300, 200);
        show();
    }

    private void abc() {
        jfc = new JFileChooser();
        jfc.showOpenDialog(this);
    }

    public static void main(String[] args){
        OpenFile of = new OpenFile();
        of.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}