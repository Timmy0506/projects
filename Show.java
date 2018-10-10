import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {

    int a;
    int b;
    int c;
    int sol;

    public void init(){

        a = 7;
        b = 8;
        c = 3;
        sol = (a + b) / c;
    }

    public void paint(Graphics g){
        g.drawString("solution is: " + sol, 20, 20);
    }


}
