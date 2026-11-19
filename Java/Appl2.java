
import java.awt.*;
import java.applet.*;
public class Appl2 extends Applet {
    String s, s1;
    public void init()
    {
        s = getParameter("names");
        s1 = getParameter("address");
    }
    
    public void paint(Graphics g)
    {
        g.drawString(s, 100, 100);
        g.drawString(s1, 100, 200);
    }
}
