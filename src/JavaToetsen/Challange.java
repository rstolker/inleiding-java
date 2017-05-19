package JavaToetsen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 5/19/2017.
 */
public class Challange extends Applet {


    public void paint (Graphics g){
        int teller;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            y += 20;
            if (teller == 5) {
                g.drawString("We zijn op de helft", 50, 100);
            }
            else {
                g.drawString("Dit is regel " + teller, 50, y);
            }
        }

    }
}
