import java.awt.*;
public class FrLa extends Frame {
    Label l;
    FrLa()
    {
        setTitle("Java Awt Frame");
        setSize(500, 450);
        setLayout(new FlowLayout());
        l = new Label("Welcome to Java Awt Frame");
        add(l);
        setVisible(true);
    }
    public static void main(String[] args) {
        FrLa f1 = new FrLa();
    }
}