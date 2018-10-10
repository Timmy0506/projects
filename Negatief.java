import java.applet.Applet;
import java.awt.*;

public class Negatief extends Applet {

    int a;
    int b;
    int sol;

    public void init(){

        a = 2147483647;
        b = 2;
        sol = a + b;

    }

    public void paint(Graphics g){
        g.drawString("solution: " + sol,20, 20);
    }
}
