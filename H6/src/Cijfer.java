import java.applet.Applet;
import java.awt.*;

public class Cijfer extends Applet {

    double a;
    double b;
    double c;
    double d;
    double s;
    int o;
    int z;
    double i;
    double sol;





    public void init(){

        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        s = (a + b + c) / d;
        z = 10;
        o = (int) (s * z);
        i = 10;
        sol = o/i;


    }

    public void paint(Graphics g){
        g.drawString("solution: " + sol, 20, 20);
    }




}
