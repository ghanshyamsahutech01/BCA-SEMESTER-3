import java.awt.*;
import java.awt.event.*;
public class FrKey extends Frame implements KeyListener {
    Label l;
    FrKey(){
        setTitle("Java Implement KeyListener");
        setSize(600,500);
        setLayout(new FlowLayout());

        l = new Label("Welcome to Java Awt Frame");
        add(l);

        addKeyListener(this);

        setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Press");
    }
    public void keyReleased(KeyEvent e)
    {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Typed");
    }
    public static void main(String[] args) {
        FrKey f = new FrKey();
    }
}
