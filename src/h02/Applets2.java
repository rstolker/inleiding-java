package h02;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
    public class Applets2 extends Applet {

        public void init() {
            setBackground(Color.blue);
        }

        public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Rico !!", 50, 60 );
        g.drawString("Stolker!!", 50, 70 );
    }
    }

