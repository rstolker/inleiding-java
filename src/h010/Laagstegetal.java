package h010;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Laagstegetal extends Applet {

    TextField tekstvak;
    int hoogstegetal = Integer.MIN_VALUE;
    int laagstegetal = Integer.MAX_VALUE;
    Button knop;
    int invoer;
    int invoer2;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        add(tekstvak);

        knop = new Button();
        knop.setLabel("Ok");
        tekstvak.addActionListener(new VakListener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Hoogstegetal =  " + invoer, 50, 45);
        g.drawString("laagsteegetal =  " + invoer2, 50, 60);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer = Integer.parseInt(tekstvak.getText());

            if (invoer > hoogstegetal) {
                hoogstegetal = invoer;}
            repaint();

            if (invoer < laagstegetal); {
                invoer2 = invoer;}
                repaint();
        }
    }
}