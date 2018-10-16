import java.applet.Applet;
import java.awt.*;

public class Show3 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(300, 300, 10, 1000);
        g.setColor(Color.red);
        g.drawRect(310, 300, 200,40);
        g.fillRect(310, 300, 200, 40);
        g.setColor(Color. white);
        g.drawRect(310, 340, 200, 40);
        g.fillRect(310, 340, 200, 40);
        g.setColor(Color.blue);
        g.drawRect(310,380, 200, 40 );
        g.fillRect(310, 380, 200, 40);


    }
}
