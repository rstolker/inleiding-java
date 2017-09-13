package h013;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 9/8/2017.
 */
public class Muurbouwenknop extends Applet {
    int startX = 0;
    int startY = 50;
    int width = 50;
    int height = 20;
    int spacing = 2;
    Button knop, knop2;
    boolean bln;
    boolean bln2;


    public void paint(Graphics g) {

        if (bln2 == true) {
            for (int row2 = 0; row2 < 8; row2++) {
                int y2 = startY + (row2 * (height + spacing));
                for (int col2 = 0; col2 < 8; col2++) {
                    int x2 = startX + (col2 * (width + spacing));
                    g.setColor(Color.gray);
                    g.fillRect(x2, y2, width, height);

                }
            }
        }

        if (bln == true) {
            for (int row = 0; row < 8; row++) {
                int y = startY + (row * (height + spacing));
                for (int col = 0; col < 8; col++) {
                    int x = startX + (col * (width + spacing));
                    g.setColor(Color.RED);
                    g.fillRect(x, y, width, height);
                }
            }
        }
    }

    public void init() {
        knop = new Button("Klik meee");
        knop.addActionListener(new KnopListener1());
        add(knop);

        knop2 = new Button("Klik meee");
        knop2.addActionListener(new KnopListener2());
        add(knop2);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bln = true;
            repaint();
            if (bln2 = true){
                bln2 = false;
            }
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bln2 = true;
            repaint();
            if (bln = true){
                bln = false;
            }
        }
    }
}