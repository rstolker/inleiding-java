package h014;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Rico on 9/14/2017.
 */
public class Meerderekaartendelen extends Applet {
    //Arrays
    String[] deck = new String[52];
    String[] speler1 = new String[13];
    String[] speler2 = new String[13];
    String[] speler3 = new String[13];
    String[] speler4 = new String[13];
    String[] Kaartsoorten = new String[4];
    String[] Kaartgroote = new String[13];
    int player1Y = 20;
    int player2x = 200, player2Y = 20;
    int player3x = 420, player3Y = 20;
    int player4x = 640, player4Y = 20;


    Button knop;
    boolean bln;


    public void init(){
        setSize(800, 400);
        button();

        Kaartsoorten[0] = "schoppen";
        Kaartsoorten[1] = "Ruiten";
        Kaartsoorten[2] = "Klaver";
        Kaartsoorten[3] = "Harten";

        Kaartgroote[0] = "aas";
        Kaartgroote[1] = "twee";
        Kaartgroote[2] = "drie";
        Kaartgroote[3] = "vier";
        Kaartgroote[4] = "vijf";
        Kaartgroote[5] = "zes";
        Kaartgroote[6] = "zeven";
        Kaartgroote[7] = "acht";
        Kaartgroote[8] = "negen";
        Kaartgroote[9] = "tien";
        Kaartgroote[10] = "boer";
        Kaartgroote[11] = "vrouw";
        Kaartgroote[12] = "koning";
    }

    public void button() {
        knop = new Button("Share Cards");
        knop.addActionListener(new KnopListener1());
        add(knop);
    }

    private String deelKaarten() {
        int random = new Random().nextInt(Kaartgroote.length);
        String kaart = Kaartgroote[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[Kaartgroote.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < Kaartgroote.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = Kaartgroote[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    private String deelKleuren() {
        int random = new Random().nextInt(Kaartsoorten.length);
        String kaart = Kaartsoorten[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[Kaartsoorten.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < Kaartsoorten.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = Kaartsoorten[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {
        if (bln == true) {
            //player1
            for (int i = 0; i < 13; i++) {
                player1Y += 30;
                g.drawString(deelKleuren() + " " + deelKaarten(), 50, player1Y);
            }
            //player2
            for (int i = 0; i < 13; i++) {
                player2Y += 30;
                g.drawString(deelKleuren() + " " + deelKaarten(), player2x, player2Y);
            }
            //player2
            for (int i = 0; i < 13; i++) {
                player3Y += 30;
                g.drawString(deelKleuren() + " " + deelKaarten(), player3x, player3Y);
            }
            //player4
            for (int i = 0; i < 13; i++) {
                player4Y += 30;
                g.drawString(deelKleuren() + " " + deelKaarten(), player4x, player4Y);
            }
            player1Y = 20;
            player2Y = 20;
            player3Y = 20;
            player4Y = 20;
        }

    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            deelKaarten();
            deelKleuren();

            repaint();
            bln = true;
        }
    }
}
