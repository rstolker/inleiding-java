package h014;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 9/14/2017.
 */
public class Kaartendelen extends Applet {
    String[] Kaartsoorten = new String[4];
    String[] Kaartgroote = new String[13];
    Button knop;
    boolean bln = false;

    int kaarttekens;
    int kaartnummers;


    public void init() {
        Kaartsoorten[0] = "schoppen";
        Kaartsoorten[1] = "Ruiten";
        Kaartsoorten[2] = "Klaver";
        Kaartsoorten[3] = "Harten";


        Kaartgroote[0] = "aas";
        Kaartgroote[1] = "twee";
        Kaartgroote[2] = "drie";
        Kaartgroote[3] = "vier";
        Kaartgroote[4] = "vijf";
        Kaartgroote[5] = "zes";
        Kaartgroote[6] = "zeven";
        Kaartgroote[7] = "acht";
        Kaartgroote[8] = "negen";
        Kaartgroote[9] = "tien";
        Kaartgroote[10] = "boer";
        Kaartgroote[11] = "vrouw";
        Kaartgroote[12] = "koning";


        button();
    }

    public void Randomkaart() {
        kaarttekens = (int) (Math.random() * Kaartsoorten.length);
        kaartnummers = (int) (Math.random() * Kaartgroote.length);

    }

    public void button() {
        knop = new Button("Klik hier");
        knop.addActionListener(new Kaartendelen.KnopListener1());
        add(knop);
    }

    public void paint(Graphics g) {
        if (bln == true) {
            g.drawString(Kaartsoorten[kaarttekens] + " " + Kaartgroote[kaartnummers], 165, 60);
        }

    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bln = true;
            Randomkaart();
            repaint();

        }

    }
}

