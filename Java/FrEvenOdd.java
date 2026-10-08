import java.awt.*;
import java.awt.event.*;
public class FrEvenOdd extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1;
    FrEvenOdd()
    {
        setTitle("Java Even Or Odd");
        setSize(500, 450);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        b1 = new Button("Check");
        add(t1);
        add(t2);
        add(b1);
        setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int n = Integer.parseInt(t1.getText());
        if(n%2==0)
            t2.setText("Even");
        else
            t2.setText("Odd");
    }
    public static void main(String[] args) {
        FrEvenOdd f1 = new FrEvenOdd();
    }
}