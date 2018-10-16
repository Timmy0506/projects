import java.applet.Applet;
import java.awt.*;

public class Show7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.drawRoundRect(600, 300, 400, 400, 100, 100);
        g.setColor(Color.black);
        g.drawOval(650, 350, 100, 100);
        g.fillOval(650, 350, 100, 100);
        g.drawOval(850, 350, 100, 100);
        g.fillOval(850, 350, 100, 100);
        g.drawOval(650, 550, 100, 100);
        g.drawOval(650, 550, 100, 100);
        g.drawOval(850, 550, 100, 100);
        g.fillOval(850, 550, 100, 100);

    }
}
