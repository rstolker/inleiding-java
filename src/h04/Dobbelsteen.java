package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.white);
        g.fillRoundRect(20, 20, 100, 100, 10, 10);
        g.setColor(Color.black);
        g.fillOval(80, 35, 30, 30);
        g.fillOval(30, 35, 30, 30);
        g.fillOval(30, 80, 30, 30);
        g.fillOval(80, 80, 30, 30);
    }
}
