package h010;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Groter extends Applet {

    TextField tekstvak;
    int hoogstegetal;
    int laagstegetal;
    Button knop;
    int invoer;
    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        add(tekstvak);

        knop = new Button();
        knop.setLabel("Ok");
        tekstvak.addActionListener( new VakListener());
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString("Hoogstegetal =  "+ invoer, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Dit maakt de cijfers in het tekst vak een int
            invoer = Integer.parseInt(tekstvak.getText());
            if((invoer > hoogstegetal)) {
                hoogstegetal = invoer;
                repaint();
            }
        }
    }
}