import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrSwAdd extends JFrame implements ActionListener{
    JTextField t1, t2, t3;
    JButton b1;
    FrSwAdd()
    {
        setTitle("Java Awt Frame");
        setSize(280, 300);
        setLayout(new FlowLayout());
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b1 = new JButton("Add");
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        t3.setText(String.valueOf(c));
    }
    public static void main(String[] args) {
        FrSwAdd f1 = new FrSwAdd();
    }
}
