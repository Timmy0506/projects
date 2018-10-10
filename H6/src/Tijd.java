import java.applet.Applet;
import java.awt.*;

public class Tijd extends Applet {

    int m;
    int u;
    int d;
    int j;
    int solU;
    int solD;
    int solJ;

    public void init(){

        m = 60;
        u = 60;
        d = 24;
        j = 365;
        solU = m * u;
        solD = (m * u) * d;
        solJ = solD * j;
    }

    public void paint(Graphics g){
        g.drawString("uur: " + solU, 20, 20);
        g.drawString("dag: " + solD, 20, 40);
        g.drawString("jaar: " + solJ, 20, 60 );
    }

}
