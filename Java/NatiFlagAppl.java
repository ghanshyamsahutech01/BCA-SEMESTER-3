import java.awt.*;
import java.applet.*;
public class NatiFlagAppl extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(100, 100, 15, 300);
        g.setColor(Color.black);
        g.fillRect(100, 100, 15, 300);
        g.drawRect(115, 100, 150, 35);
        g.setColor(Color.ORANGE);
        g.fillRect(115, 100, 150, 35);
        g.drawRect(115, 135, 150, 35);
        g.drawRect(115, 170, 150, 35);
        g.setColor(Color.green);
        g.fillRect(115, 170, 150, 35);
        g.setColor(Color.black);
        g.drawOval(165, 135, 35, 35);
        g.setColor(Color.blue);
        g.fillOval(165, 135, 35, 35);
        g.drawOval(96, 81, 23, 19);
        g.setColor(Color.red);
        g.fillOval(96, 81, 23, 19);
    }
}
