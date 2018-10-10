import java.applet.Applet;
import java.awt.*;

public class Geld extends Applet {

    int a;
    int b;
    int sol;

    public void init(){

        a = 113;
        b = 4;
        sol = a/b;
    }

    public void paint(Graphics g){
        g.drawString("Jan: " + sol, 20, 20);
        g.drawString("Ali: " + sol, 20, 40);
        g.drawString("Jeannette: " + sol, 20, 60);
        g.drawString("me: " + sol, 20, 80);
    }
}
