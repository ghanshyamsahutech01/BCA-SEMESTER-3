import java.awt.*;
import java.awt.event.*;
public class FrSubMrksTotPre extends Frame implements ActionListener {
    TextField t1, t2, t3, t4;
    Label l1, l2;
    Button b1, b2;
    FrSubMrksTotPre()
    {
        setTitle("Java Subject Marks Entries");
        setSize(500, 450);
        setLayout(new FlowLayout());
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        
        l1 = new Label("Marks: ---");
        l2 = new Label("Percentage: ---");
                
        b1 = new Button("Ok");
        b2 = new Button("Reset");
        
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        add(b2);
        add(l1);
        add(l2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());
            int n4 = Integer.parseInt(t4.getText());
            int n5 = n1+n2+n3+n4;
            float n6 = n5/4.0f;
            l1.setText("Marks: " + n5);
            l2.setText("Percentage: " + n6 + "%");
        }
        else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            l1.setText("Marks: ---");
            l2.setText("Percentage: ---");
        }
    }
    public static void main(String[] args) {
        FrSubMrksTotPre f1 = new FrSubMrksTotPre();
    }
}