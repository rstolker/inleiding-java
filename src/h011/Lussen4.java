package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen4 extends Applet{


    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        int tafel = 3;

        while(teller < 31) {
            y += 20;
            g.drawString("" + teller, 50, y );
            teller += tafel;
        }
    }
}
