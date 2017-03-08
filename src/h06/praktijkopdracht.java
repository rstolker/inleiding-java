package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/14/2017.
 */
public class praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double d;
    double uitkomst;
    double gemiddelde;
    double keer10;
    double delen;
    double terug;

public void init() {
    a = 5.9;
    b = 6.3;
    c = 6.9;
    d = 3;
    gemiddelde = (a+b+c)/3;
    keer10 = gemiddelde*10;
    delen = (int) keer10;
    terug = delen/10;



    }
    public void paint (Graphics g){
        g.drawString("het gemidelde is " + terug, 20, 30);







        }
}
