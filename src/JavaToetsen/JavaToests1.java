package JavaToetsen;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JavaToests1 extends Applet {
    private TextField tekstvak;
    private int londen, tokyo, newYork, sydney;
    private String verkeerd;
    private boolean click;

    public void init() {
        Button knop = new Button();
        knop.setLabel("Toon tijden");
        knop.addActionListener(new KnopListener());
        add(knop);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new KnopListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (click) {
            g.drawString("Tijd in Londen   =  " + londen + ":00  Uur", 50, 55);
            g.drawString("Tijd in Tokyo    =  " + tokyo + ":00  Uur", 50, 70);
            g.drawString("Tijd in New York =  " + newYork + ":00  Uur", 50, 85);
            g.drawString("Tijd in Sydney   =  " + sydney + ":00  Uur", 50, 100);
        }
        g.drawString(verkeerd, 50, 120);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            if (invoer < 25) {
                if (!click) {
                    click = true;
                }
                verkeerd = "";
                londen = invoer - 1;
                if (londen < 0)
                    londen = 24;

                tokyo = invoer + 7;
                if (tokyo > 24)
                    tokyo -= 23;

                newYork = invoer - 5;
                if (newYork < 0)
                    newYork += 24;

                sydney = invoer + 10;
                if (sydney > 24) {
                    sydney -= 24;
                }

            } else {
                verkeerd = "U heeft verkeerd getal ingevoerd";
            }
            repaint();
        }
    }
}