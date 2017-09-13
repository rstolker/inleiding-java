package h012;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 5/29/2017.
 */
public class Opdracht2 extends Applet {
    Button array[];

    public void init() {
        array = new Button[25];

        for (int teller = 0; teller < array.length; teller++) {
            Button a = new Button("Knop");
            add(a);
        }
    }
}
