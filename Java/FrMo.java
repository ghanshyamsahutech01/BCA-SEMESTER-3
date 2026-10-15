import java.awt.*;
import java.awt.event.*;
public class FrMo extends Frame implements MouseListener {
    Label l;
    FrMo(){
        setTitle("Java Implement MouseListener");
        setSize(600,500);
        setLayout(new FlowLayout());

        l = new Label("Welcome to Java Awt Frame");
        add(l);

        setVisible(true);

        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Press");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exit");
    }
    public static void main(String[] args) {
        FrMo f = new FrMo();
    }
}
