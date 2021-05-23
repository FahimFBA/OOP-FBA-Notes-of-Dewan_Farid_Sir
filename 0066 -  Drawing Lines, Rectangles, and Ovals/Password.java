import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Password extends JFrame {
    private static final long serialVersionUID = 0;

    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField pw;
    private JButton b1, b2;

    public Password() {
        super("Password Example");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l1 = new JLabel("Enter User Name  ");
        c.add(l1);

        t1 = new JTextField(15);
        c.add(t1);

        l2 = new JLabel("Enter Password    ");
        c.add(l2);

        pw = new JPasswordField(10);
        c.add(pw);

        b1 = new JButton("Enter");
        b1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(t1.getText().equals("farid") && pw.getText().equals("1234")){
                        JOptionPane.showMessageDialog(null, "Welcome to Java");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect user name of password");
                    }
                    
                }
            }
        );
        c.add(b1);

        b2 = new JButton("Cancel");
        b2. addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String s = "";
                    t1.setText(s);
                    pw.setText(s);
                }
            }
        );
        c.add(b2);

        setSize(300, 125);
        show();

    }

    public static void main(String[] args){
        Password PW = new Password();
        PW.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}
