package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Rico on 2/7/2017.
 */
public class Staafdiagram extends Applet {

    int hoogtevalerie;
    int hoogtejeroen;
    int hoogtehans;
    int nulpunt, yas_valerie, yas_jeroen, yas_hans;
public void init() {
        hoogtevalerie = 100;    //dit is KG van Valerie
        hoogtejeroen = 100;      //dit is KG van Jeroen
        hoogtehans = 100;        //dit is de KG van hans
        nulpunt=200;            //hier begint de tabbel
        yas_valerie=nulpunt - hoogtevalerie;
        yas_jeroen=nulpunt - hoogtejeroen;
        yas_hans=nulpunt - hoogtehans;
}
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillRect(100, yas_valerie, 40, hoogtevalerie);
        g.drawString("Valerie", 100, 210 );
        g.setColor(Color.GREEN);
        g.fillRect(150, yas_jeroen, 40, hoogtejeroen);
        g.drawString("Jeroen", 148, 210 );
        g.setColor(Color.red);
        g.fillRect(200, yas_hans, 40, hoogtehans);
        g.drawString("Hans", 200, 210 );
        g.setColor(Color.black);
        g.fillRect(240, 40, 2, 160);
        g.fillRect(81, 200, 160, 2);
        g.drawString("0 Kg", 250, 210);
        g.drawString("20 Kg", 250, 180 );
        g.drawString("40 Kg", 250, 150 );
        g.drawString("60 Kg", 250, 120 );
        g.drawString("80 Kg", 250, 90 );
        g.drawString("100 Kg", 250, 60 );
    }
}

