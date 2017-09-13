package h013;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 9/5/2017.
 */

public class Tekendriehoek extends Applet{



    public void paint(Graphics g) {
        tekenDriehoek(g);
    }

    void tekenDriehoek(Graphics g) {
        g.drawPolygon(new int[] {100, 200, 300}, new int[] {180, 20, 180}, 3);
    }
}
