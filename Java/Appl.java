
import java.awt.*;
import java.applet.*;
public class Appl extends Applet {
    String s = "";
    public void init()
    {
        s = "Welcome to Java Applet Class";
    }
    public void start()
    {
        s+= "Start";
    }
    public void stop(){}
    public void destroy(){}
    public void paint(Graphics g)
    {
        g.drawString(s, 100, 100);
    }
}
