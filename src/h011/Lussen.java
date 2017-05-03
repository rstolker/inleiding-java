package h011;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 4/11/2017.
 */
public class Lussen extends Applet {


    public void paint (Graphics g){
        int teller;
        int y = 0;

        for (teller = 0; teller < 10; teller++){
            y += 20;
            g.drawLine(50 , y, 300, y );
        }

}




}
