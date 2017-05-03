package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen8 extends Applet {

    public void paint (Graphics g){
        int teller;
        int W = 0;
        int H = 0;

        for (teller = 0; teller < 100; teller++){
            W += 10;
            H += 10;

            g.drawRoundRect(50, 50, W, H, W, H );
        }
    }
}
