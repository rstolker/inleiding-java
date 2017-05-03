package h011;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 4/11/2017.
 */
public class PraktijkOpdracht11 extends Applet {
    private int tafel;
    private TextField tekstvak;

    public void init() {
        tafel = 0;
        Label label = new Label("Typ hier uw tafel");
        tekstvak = new TextField(8);
        Listener l1 = new Listener();
        tekstvak.addActionListener(l1);
        add (label);
        add(tekstvak);
        Button knop = new Button();
        knop.setLabel("Toon tafel");
        knop.addActionListener (l1);
        add(knop);
    }




    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        if (tafel > 0) {
            int getal;
            for (getal = 0; getal < 10; ) {
                y = y + 20;
                getal++;
                g.drawString(getal + " x " + tafel + " = " + tafel * getal, x, y);
            }
        }

    }




    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel=(Integer.parseInt(tekstvak.getText()));
            repaint();
        }
    }



}