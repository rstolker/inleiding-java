package h012;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by Rico on 6/7/2017.
 */
    public class Opdracht3 extends Applet {
    TextField tekstvak[];
    Button knop;
    int getallen[];

    public void init() {
        tekstvak = new TextField[5];
        getallen = new int[5];


        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak [teller] = new TextField("");
            add(tekstvak[teller]);
        }
        knop = new Button();
        knop.setLabel( "Ok" );
        knopListener k = new knopListener();
        knop.addActionListener(k);
        add(knop);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length ; i++) {
            getallen[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length ; i++) {
                tekstvak[i].setText(String.valueOf(getallen[i]));
            }
            repaint();
        }
    }
}