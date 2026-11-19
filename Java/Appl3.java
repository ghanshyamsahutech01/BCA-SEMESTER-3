import java.awt.*;
import java.applet.*;
public class Appl3 extends Applet {
    
    public void paint(Graphics g)
    {
        g.drawLine(100, 100, 300, 100);
        g.setColor(Color.blue);
        g.drawRect(100, 160, 500, 300);
        g.fillRect(100, 160, 500, 300);

        g.drawOval(400, 100, 60, 40);
        g.fillOval(400, 100, 60, 40);
    }
}
