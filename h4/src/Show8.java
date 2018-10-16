import java.applet.Applet;
import java.awt.*;

public class Show8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 600, 20);
        g.drawRect(20, 80, 580, 300);
        g.drawRoundRect(20, 440, 580, 300,100, 100);
        g.setColor(Color.magenta);
        g.drawRect(680, 80, 580, 300);
        g.fillRect(680, 80, 580, 300);
        g.setColor(Color.black);
        g.drawOval(680, 80, 580, 300);
        g.setColor(Color.magenta);
        g.drawOval(680, 440, 580, 300);
        g.fillOval(680, 440, 580, 300);
        g.setColor(Color.black);
        g.drawOval(1320, 80, 580, 300);
        g.setColor(Color.magenta);
        g.drawArc(1320, 80, 580, 300, 0, 45);
        g.fillArc(1320, 80, 580, 300, 0, 45);
        g.setColor(Color.black);
        g.drawOval(1475, 440, 300, 300);

        g.setColor(Color.black);
        g.drawString("lijn", 300, 40);
        g.drawString("rechthoek", 280, 400);
        g.drawString("Afgeronde rechthoek", 260, 755);
        g.drawString("gevulde rechthoek met ovaal", 900, 400);
        g.drawString("gevulde ovaal", 940, 755);
        g.drawString("taartpunt met ovaal eromheen", 1540, 400);
        g.drawString("cirkel", 1610, 755);





    }
}
