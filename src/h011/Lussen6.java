package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen6 extends Applet {

    public void paint (Graphics g){
        int teller;
        int W = 0;
        int H = 0;
        int x = 50;
        int y = 50;

        for (teller = 0; teller < 5; teller++){
            W += 10;
            H += 10;
            x -= 5;
            y -= 5;

            g.drawRoundRect(x, y, W, H, W , H );
        }
    }

}
