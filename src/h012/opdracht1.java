package h012;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 5/23/2017.
 */
public class opdracht1 extends Applet {
    int MyArray[];

    public void init() {
        MyArray = new int [11];

        for (int teller = 0; teller < MyArray.length; teller ++) {
            MyArray[teller] = 100 * teller + 100;
            MyArray [10] = MyArray[10] / MyArray.length;

        }
    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < MyArray.length; teller ++) {
            g.drawString("Salaris " + MyArray[teller], 50, 20 * teller + 20);

        }
    }
}
