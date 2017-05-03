package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen2 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller > 9) {
            y += 20;
            g.drawString("" + teller, 50, y );
            teller--;
        }
    }

}
