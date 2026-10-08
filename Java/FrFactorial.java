import java.awt.*;
import java.awt.event.*;
public class FrFactorial extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1;
    FrFactorial()
    {
        setTitle("Java Factorial");
        setSize(500, 450);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        b1 = new Button("Factorial");
        add(t1);
        add(t2);
        add(b1);
        setVisible(true);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int n = Integer.parseInt(t1.getText());
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        t2.setText(String.valueOf(fact));
    }
    public static void main(String[] args) {
        FrFactorial f1 = new FrFactorial();
    }
}