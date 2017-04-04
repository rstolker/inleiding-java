package JavaToetsen;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaToests1 extends Applet {
    private TextField tekstvak;
    private int Londen, Tokyo, NewYork, Sydney;
    private String verkeerd;
    private boolean click;

    public void init() {
        Button knop = new Button();
        knop.setLabel("Toon tijden");
        knop.addActionListener(new TekstvakListener());
        knop.addActionListener(new KnopListener());
        add(knop);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }
    public void paint(Graphics g) {
        if (click) {
            g.drawString("Tijd in Londen   =  " + Londen + ":00  Uur", 50, 55);
            g.drawString("Tijd in Tokyo    =  " + Tokyo + ":00  Uur", 50, 70);
            g.drawString("Tijd in New York =  " + NewYork + ":00  Uur", 50, 85);
            g.drawString("Tijd in Sydney   =  " + Sydney + ":00  Uur", 50, 100);
        }
            g.drawString(verkeerd, 50, 120);

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            if (invoer < 25) {
                verkeerd = "";
                Londen = invoer - 1;
                if (Londen < 0)
                    Londen = 24;
                Tokyo = invoer + 7;
                if (invoer == 24) Tokyo = 7;
                if (invoer == 23) Tokyo = 6;
                if (invoer == 22) Tokyo = 5;
                if (invoer == 21) Tokyo = 4;
                if (invoer == 20) Tokyo = 3;
                if (invoer == 19) Tokyo = 2;
                if (invoer == 18) Tokyo = 1;
                NewYork = invoer - 5;
                if (invoer == 5) NewYork = 24;
                if (invoer == 4) NewYork = 23;
                if (invoer == 3) NewYork = 22;
                if (invoer == 2) NewYork = 21;
                if (invoer == 1) NewYork = 20;
                if (invoer == 0) NewYork = 19;
                Sydney = invoer + 10;
                if (invoer == 24) Sydney = 10;
                if (invoer == 23) Sydney = 9;
                if (invoer == 22) Sydney = 8;
                if (invoer == 21) Sydney = 7;
                if (invoer == 20) Sydney = 6;
                if (invoer == 19) Sydney = 5;
                if (invoer == 18) Sydney = 4;
                if (invoer == 17) Sydney = 3;
                if (invoer == 16) Sydney = 2;
                if (invoer == 15) Sydney = 1;
            } else {
                verkeerd = "U heeft verkeerd getal ingevoerd";
            }
            repaint();
        }
    }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (!click) {
                    click = true;
            }
        }
    }
}
