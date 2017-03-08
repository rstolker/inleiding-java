package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTW extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    double totaal;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Prijs zonder BTW =");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);

        knop = new Button();
        knop.setLabel( "Ok" );
        TekstvakListener aa = new TekstvakListener();
        knop.addActionListener( aa);
        add(knop);
        add(label);


    }


    public void paint(Graphics g) {
        totaal = getal/100*121;
        g.drawString("De prijs met BTW = " + totaal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}