import java.awt.*;
import java.applet.*;
public class Smiley extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawOval(100 , 100, 150, 150);
        g.drawOval(130, 130, 20, 25);
        g.drawOval(200, 130, 20, 25);
        g.drawOval(170, 169, 10, 12);
        g.drawOval(155, 210, 40, 20);
        

        g.setColor(Color.yellow);
        g.fillOval(100 , 100, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(130, 130, 20, 25);
        g.fillOval(200, 130, 20, 25);
        g.fillOval(170, 169, 10, 12);
        g.setColor(Color.blue);
        g.fillOval(155, 210, 40, 20);
        g.setColor(Color.BLACK);
        g.drawLine(155, 220,195, 220);
    }
}