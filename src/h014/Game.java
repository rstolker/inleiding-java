package h014;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by Rico on 9/15/2017.
 */

public class Game extends Applet {

    private Image afbeelding;
    private Image youwin;
    private Image Youlost;
    private URL pad;
    String s;
    TextField tekstvak;
    int invoer;
    int getal;
    int Sterren = 23;
    int Computergetal = 0;
    boolean bln = false, bln2 = false;


    public void init() {
        setSize(800, 800);
        pad = Meerderekaartendelen.class.getResource("/resources/");
        afbeelding = getImage(pad, "ster.jpg");

        pad = Meerderekaartendelen.class.getResource("/resources/");
        Youlost = getImage(pad, "Youlost.jpg");

        pad = Meerderekaartendelen.class.getResource("/resources/");
        youwin = getImage(pad, "youwin.jpg");

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new Game.TekstvakListener() );
        add(tekstvak);
    }



    public void paint(Graphics g) {
        int x = 50, y = 50;
        int startX = 0;
        int startY = 50;
        int width = 50;
        int height = 50;
        int spacing = 10;
        int teller = 0;
        g.drawString(" vul een getal tussen de 1 en 3 in", 150, 20);
        g.drawString(" De computer heet er " + Computergetal + " wegehaald", 250, 220);
        g.drawString(" Er zijn nog " + Sterren + "  Sterren", 500, 20);

        if (bln == true){
            g.drawImage(Youlost, 0 ,0,850, 900, this);
        }

        if (bln2 == true){
            g.drawImage(youwin, 0 ,0,650, 500, this);
        }

        if(getal < 23) {
            for (int i = 0; i < Sterren; i++) {
                g.drawImage(afbeelding, x ,y,50, 50, this);
                if (x > 600) {
                    x = 50;
                    y = 100;
                }else x += 50;
            }
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekstvak.setText("");
            invoer = Integer.parseInt(s);
            if (Sterren > 0) {
                if (invoer < 4 && invoer > 0) {
                    Sterren -= invoer;

                    if (Sterren < 1) {
                        bln = true;
                        repaint();
                    }

                    if (Sterren == 4 || Sterren == 8 || Sterren == 12 || Sterren == 12 || Sterren == 20) {
                        Sterren -= 3;
                        Computergetal = 3;
                        if (Sterren < 1) {
                            bln2 = true;
                            repaint();
                        }

                    } else if
                            (Sterren == 3 || Sterren == 7 || Sterren == 11 || Sterren == 15 || Sterren == 19) {
                        Sterren -= 2;
                        Computergetal = 2;
                        if (Sterren < 1) {
                            bln2 = true;
                            repaint();
                        }
                    } else if
                            (Sterren == 2 || Sterren == 6 || Sterren == 10 || Sterren == 18 || Sterren == 22) {
                        Sterren -= 1;
                        Computergetal = 1;
                        if (Sterren < 1) {
                            bln2 = true;
                            repaint();
                        }
                    } else if (Sterren == 1 || Sterren == 5 || Sterren == 9 || Sterren == 13 || Sterren == 17 || Sterren == 21) {
                        Sterren -= 1;
                        Computergetal = 1;
                        if (Sterren < 1) {
                            bln2 = true;
                            repaint();
                        }
                    }
                }
                repaint();
            }
        }
    }
}
