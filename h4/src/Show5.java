import java.applet.Applet;
import java.awt.*;

public class Show5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawOval(600, 300, 700, 400);
        g.fillOval(600, 300, 700, 400);
        g.setColor(Color.white);
        g.fillArc(600, 300, 700, 400, 0, 45);



    }
}
