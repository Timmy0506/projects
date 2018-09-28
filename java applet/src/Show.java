import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {

        public void init() {
            setBackground(Color.white);

    }
    public void paint(Graphics g) {
            g.setColor(Color.green);
            g.drawString("Tim!!", 50, 60 );
    }

}

