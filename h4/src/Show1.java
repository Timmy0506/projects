import java.applet.Applet;
import java.awt.*;

public class Show1 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(400, 500, 800, 500);
        g.drawLine(400, 500, 600, 250);
        g.drawLine(800, 500, 600, 250);
    }
}
