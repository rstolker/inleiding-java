package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/13/2017.
 */
public class TijdBerekeningen extends Applet {
    int Sec;
    int Uur;
    int uitkomstSec;
    int uitkomstUur;
    int uitkomstJaar;

    public void init() {
        Sec = 60; //seconden
        Uur = 60; //uren
        uitkomstSec= Sec * Uur;
        uitkomstUur= 24 * 3600;//een dag heeft 24 uur en een uur heeft 3600 seconden dus 24 x
        uitkomstJaar= 365 * 86400;
    }

    public void paint(Graphics g) {
        g.drawString("Een uur heeft 60 minuten in een minuut zit 60 seconden 60 x 60=: " + uitkomstSec, 20, 30);
        g.drawString("Een uur heeft 3600 seconden en een dag heeft 24 uur dus 24 x 3600= " + uitkomstUur, 20, 50);
        g.drawString("Een dag heeft 86400 seconden en een jaar heeft 365 dagen dus 365 x 86400= " + uitkomstJaar, 20, 70);
    }



}





//in een uur zitten 60 minuten.
//in 1 minuut zitten 60 seconden dus 60 x 60 = 3600
// 3600 sec = 1 uur