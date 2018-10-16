import java.applet.Applet;
import java.awt.*;

public class Show extends Applet{

    Color F;
    Color L;
    int W;
    int H;

    public void init(){

        F = Color.MAGENTA;
        L = Color.BLACK;
        W = 200;
        H = 100;
    }

    public void paint(Graphics g){
        g.drawLine(100, 50, 300, 50);
        g.drawRect(100, 100, W, H);
        g.drawRoundRect(100, 250, W, H, 30, 30);
        g.setColor(F);
        g.drawRect(350, 100, W, H);
        g.fillRect(350, 100, W, H);
        g.setColor(L);
        g.drawOval(350, 100, W, H);
        g.setColor(F);
        g.drawOval(350, 250, W, H);
        g.fillOval(350, 250, W, H);
        g.setColor(L);
        g.drawOval(600, 100, W, H);
        g.setColor(F);
        g.drawArc(600, 100, W, H, 0, 45);
        g.fillArc(600, 100, W, H, 0, 45);
        g.setColor(L);
        g.drawOval(650, 250, 100, H);

        g.drawString("lijn", 190, 70);
        g.drawString("rechthoek", 175, 220);
        g.drawString("afgeronde rechthoek", 145, 370);
        g.drawString("gevulde rechthoek met ovaal", 375, 220);
        g.drawString("gevulde ovaal", 415, 370);
        g.drawString("taartpunt met ovaal eromheen", 620, 220);
        g.drawString("cirkel", 685, 370);
    }
}
