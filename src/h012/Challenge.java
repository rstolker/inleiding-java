package h012;

import com.sun.org.apache.xpath.internal.operations.String;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 6/13/2017.
 */
public class Challenge extends Applet implements ActionListener {
    TextField tekstvak;
    Button knop;
    java.lang.String invoerworden;
    boolean geklikt;
    String result[];


    public void init() {
        add(tekstvak);
        setSize(500, 500);


        tekstvak = new TextField("", 50);
        knop = new Button("Sorteer!");
        add(knop);
        knop.addActionListener(this);
    }

    public void paint(Graphics graphics) {
        if (geklikt) {
            int x = 100;
            int y = 100;
            for (int i = 0; i < 10; i++) {
                graphics.drawString("asd", x, y);
                java.lang.String[] result = invoerworden.split(" ");
                for (int b = 0; i < invoerworden.length(); b++) {
                    repaint();
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        invoerworden = tekstvak.getText();
        geklikt = true;


        repaint();
    }
}
