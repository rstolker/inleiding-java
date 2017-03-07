package h04;

/**
 * Created by Rico on 2/7/2017.
 */
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(100, 40, 20, 200);
        g.setColor(Color.black);
        g.fillRect(85, 40, 50, 120);
        g.setColor(Color.red);
        g.fillOval(95, 50, 30, 30);
        g.setColor(Color. ORANGE);
        g.fillOval(95, 85, 30, 30);
        g.setColor(Color.GREEN);
        g.fillOval(95, 120, 30, 30);
    }
}