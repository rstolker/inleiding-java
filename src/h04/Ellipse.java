package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
public class Ellipse extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 100, 100, 90, 45);
    }
}
