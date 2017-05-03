package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen5  extends Applet{

    public void init(){

    }

    public void paint (Graphics g){
        int teller;
        int y = 0;
        int x = 0;

        for (teller = 0; teller < 5; teller++){
            y += 50;
            x += 50;
            g.drawRect(x, y, 50, 50);
        }
    }

}
