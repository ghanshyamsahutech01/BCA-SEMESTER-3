import java.awt.*;
import java.awt.event.*;
public class FrButtText2 extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;
    FrButtText2()
    {
        setTitle("Java Calculator");
        setSize(500, 450);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mult");
        b4 = new Button("Div");
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;
        if(e.getSource()==b1)
            c=a+b;
        else if(e.getSource()==b2)
            c=a-b;
        else if(e.getSource()==b3)
            c=a*b;
        else
            c=a/b;
        t3.setText(String.valueOf(c));
    }
    public static void main(String[] args) {
        FrButtText2 f1 = new FrButtText2();
    }
}