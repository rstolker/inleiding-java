package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/14/2017.
 */
public class Negatief extends Applet {
    int uitkomst;
    int a;
    int b;
    public void init(){
    uitkomst= 2147483647 + 2147483647;
    a= 2147483647;
    b= 2147483647;
}
    public void paint(Graphics g) {
        g.drawString("Int a + Int B =  " + uitkomst, 20, 30);




    }






}
