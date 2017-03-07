package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
    public class NederlandseFlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.RED);
        g.fillRect(60, 80, 100, 35);
        g.setColor(Color.white);
        g.fillRect(60, 110, 100, 35);
        g.setColor(Color.BLUE);
        g.fillRect(60, 140, 100, 35);
        g.setColor(Color.black);
        g.fillRect(60, 80, 4, 200);
        g.setColor(Color.ORANGE);
        g.fillOval(55, 75, 10, 10);
    }

}

