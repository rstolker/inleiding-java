package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillRect(100, 150, 40, 50);
        g.drawString("Valerie", 100, 210 );
        g.setColor(Color.GREEN);
        g.fillRect(150, 50, 40, 150);
        g.drawString("Jeroen", 148, 210 );
        g.setColor(Color.red);
        g.fillRect(200, 80, 40, 120);
        g.drawString("Hans", 200, 210 );
        g.setColor(Color.black);
        g.fillRect(240, 40, 2, 160);
        g.fillRect(81, 200, 160, 2);
        g.drawString("0 Kg", 250, 210 );
        g.drawString("20 Kg", 250, 180 );
        g.drawString("40 Kg", 250, 150 );
        g.drawString("60 Kg", 250, 120 );
        g.drawString("80 Kg", 250, 90 );
        g.drawString("100 Kg", 250, 60 );
    }
}

