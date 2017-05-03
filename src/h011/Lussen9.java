package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen9 extends Applet {

    public void paint(Graphics g) {
        int rij;
        int kolom;
        int x, y;

        for (rij = 0; rij < 8; rij++) {
            for (kolom = 0; kolom < 8; kolom++) {
                x = kolom * 20;
                y = rij * 20;
                if ((rij % 2) == (kolom % 2))
                    g.setColor(Color.white);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
