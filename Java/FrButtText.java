import java.awt.*;
import java.awt.event.*;
public class FrButtText extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b1;
    FrButtText()
    {
        setTitle("Java Awt Frame");
        setSize(500, 450);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b1 = new Button("Add");
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
        FrButtText f1 = new FrButtText();
    }
}