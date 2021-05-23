import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestJComt extends JFrame {
    private static final long serialVersionUID = 0;

    private JCheckBox bold, italic;
    private JRadioButton male, female;
    private ButtonGroup radioGroup;
    private JComboBox cBox;
    private String[] str1 = {"spring" , "summer" , "fall"};
    private JList colorList;
    private String[] str2 = {"Red" , "Green" , "Blue" , "Black" , "White" , "Orange" ,"Pink" , "Magenta" , "Sky" , "Cyan" , "Gray"};
    private JTextArea ta1;

    public TestJComt() {
        super("Test JComponents");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        bold = new JCheckBox("Bold");
        c.add(bold);
        italic = new JCheckBox("Italic");
        c.add(italic);

        male = new JRadioButton("Male");
        c.add(male);

        female = new JRadioButton("Female");
        c.add(female);
        radioGroup = new ButtonGroup();
        radioGroup.add(male);
        radioGroup.add(female);

        cBox = new JComboBox(str1);
        c.add(cBox);

        colorList = new JList(str2);
        colorList.setVisibleRowCount(5);
        c.add(new JScrollPane(colorList));

        String s = "Java is a object oriented programming language";
        ta1 = new JTextArea(s, 10, 15);
        c.add(new JScrollPane(ta1));

        setSize(200, 350);
        show();

    }

    public static void main(String[] args){
        TestJComt jc = new TestJComt();
        jc.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}