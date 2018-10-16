import java.applet.Applet;
import java.awt.*;

public class Show2 extends Applet {

    int W1;

    public void init() {







    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawLine(30, 150, 30, 20);
        g.drawLine(30, 150, 180, 150);
        g.drawString("0", 20, 150);
        g.drawLine(30, 130, 180, 130 );
        g.drawString("20", 15, 130);
        g.drawLine(30, 110, 180, 110);
        g.drawString("40", 15, 110);
        g.drawLine(30, 90, 180, 90);
        g.drawString("60", 15, 90);
        g.drawLine(30, 70, 180, 70);
        g.drawString("80", 15, 70);
        g.drawLine(30, 50, 180, 50);
        g.drawString("100", 10, 50);
        g.drawLine(30, 30, 180, 30);
        g.drawString("120", 10, 30);



        g.setColor(Color.blue);
        g.drawRect(50, 110, 20, 40);
        g.fillRect(50, 110,20, 40);
        g.setColor(Color.red);
        g.drawRect(90, 50, 20, 100);
        g.fillRect(90, 50, 20, 100);
        g.setColor(Color.yellow);
        g.drawRect(130, 70, 20, 80);
        g.fillRect(130, 70, 20, 80);

        g.setColor(Color.black);
        g.drawString("Valerie", 40, 170);
        g.drawString("Jeroen", 85, 170);
        g.drawString("Hans", 130, 170);



    }
}