import java.applet.Applet;
import java.awt.*;

public class Show2 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(400, 500, 800, 500);
        g.drawLine(400, 500, 600, 250);
        g.drawLine(800, 500, 600, 250);
        g.drawRect(400, 500, 400, 350);
        g.drawRect(500, 650, 100, 200);
        g.drawRect(650, 600, 100, 100);
    }

}
