import java.awt.*;
import java.awt.event.*;
public class FrCh extends Frame implements ItemListener {
    Choice ch, ch1;
    Label l;
    FrCh(){
        setTitle("Java Awt Frame");
        setSize(800,500);
        setLayout(new FlowLayout());

        l = new Label("Select State");
        add(l);
        
        ch = new Choice();
        ch.addItem("Select State");
        ch.addItem("Rajasthan");
        ch.addItem("Guj");
        ch1 = new Choice();
        ch1.addItem("Select City");
        add(ch);
        add(ch1);
        setVisible(true);
        ch.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        ch1.removeAll();
        ch1.addItem("Select City");
        String s = ch.getSelectedItem().toString();
        if(s.equals("Rajasthan")){
            ch1.addItem("Jaipur");
            ch1.addItem("Udaipur");
        }
        else if(s.equals("Guj"))
        {
            ch1.addItem("Ahm");
            ch1.addItem("Surat");
        }
    }
    public static void main(String[] args) {
        FrCh f = new FrCh();
    }
}
