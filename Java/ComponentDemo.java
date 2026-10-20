import java.awt.*;
public class ComponentDemo {
    public static void main(String args[]){
        Frame f = new Frame("Awt Example");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        Label l = new Label("Enter name : ");
        TextField tf = new TextField(20);
        Button b = new Button("Submit");
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setVisible(true);
    }
}
