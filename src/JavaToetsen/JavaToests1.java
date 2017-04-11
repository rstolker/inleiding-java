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
        knop.addActionListener(new KnopListener());
        add(knop);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new KnopListener());
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

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            if (invoer < 25) {
                if (!click) {
                    click = true;
                }
                verkeerd = "";
                Londen = invoer - 1;
                if (Londen < 0)
                    Londen = 24;

                Tokyo = invoer + 7;
                if (Tokyo > 24)
                    Tokyo -= 23;

                NewYork = invoer - 5;
                if (NewYork < 0)
                    NewYork += 24;

                Sydney = invoer + 10;
                if (Sydney > 24) {
                    Sydney -= 24;
                }

            } else {
                verkeerd = "U heeft verkeerd getal ingevoerd";
            }
            repaint();
        }
    }
}