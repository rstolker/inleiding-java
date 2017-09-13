package h013;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rico on 9/13/2017.
 */
public class Bomen extends Applet{
Color bruin = new Color(139,69,19);
boolean bln = false;
Button knop;
int BoomStruikX = 8;
int BoomStruikY = 10;
int BoomStamX = 22;
int BoomstamY = 50;
int i = 0;




    public void init() {
        knop = new Button("Klik meee");
        knop.addActionListener(new Bomen.KnopListener1());
        add(knop);
    }

    public void boom (Graphics g) {
        for (int i = 0; i < 10; i++) {
            BoomStamX += 55;
            BoomStruikX += 55;
            g.setColor(bruin);
            g.fillRect(BoomStamX, BoomstamY, 25, 100);
            g.setColor(Color.GREEN);
            g.fillOval(BoomStruikX, BoomStruikY, 50, 50);
            if (i == 9) {
                BoomstamY += 155;
                BoomStruikY += 155;
                BoomStamX = 22;
                BoomStruikX = 10;

                for (int j = 0; j < 10; j++) {
                    BoomStamX += 55;
                    BoomStruikX += 55;
                    g.setColor(bruin);
                    g.fillRect(BoomStamX, BoomstamY, 25, 100);
                    g.setColor(Color.GREEN);
                    g.fillOval(BoomStruikX, BoomStruikY, 50, 50);
                }
            }
        }
    }

    public void paint (Graphics g){
        if (bln == true) {
            boom(g);
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bln = true;

            repaint();
        }
    }

}

