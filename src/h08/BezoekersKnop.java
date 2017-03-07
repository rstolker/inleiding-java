package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class BezoekersKnop extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;
    Button knopTest;


    public void init() {
        setBackground(Color.red);
        {

            knop = new Button();
            knop.setLabel("Mannen");
            add(knop);

            knop = new Button();
            knop.setLabel("Vrouwen");
            add(knop);

            knop = new Button();
            knop.setLabel("Potentele Mannen");
            add(knop);

            knop = new Button();
            knop.setLabel("Bereken aantal mensen");
            add(knop);
        }
    }
    public void paint(Graphics g) {


        g.drawString("vrouwen", 100, 45 );
        g.drawString("mannen", 100, 60 );
        g.drawString("potentiële vrouwen", 100, 75 );
        g.drawString("potentiële mannen", 100, 90);
        g.drawString("Totaal", 100, 110 );
        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                repaint();
            }
        }
    }
}




