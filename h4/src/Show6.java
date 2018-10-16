import java.applet.Applet;
import java.awt.*;

public class Show6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.drawRoundRect(30, 30,140, 300, 100, 100);
        g.setColor(Color.red);
        g.drawOval(65, 45, 70, 70);
        g.fillOval(65, 45, 70, 70);
        g.setColor(Color.orange);
        g.drawOval(65, 145, 70, 70);
        g.fillOval(65, 145, 70, 70);
        g.setColor(Color.green);
        g.drawOval(65, 245, 70, 70);
        g.fillOval(65, 245, 70, 70);



    }
}
