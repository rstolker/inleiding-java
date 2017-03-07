package h04;



import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 100, 100, 110);     //huis//
        g.setColor(Color.CYAN);
        g.fillRect(109, 165, 50, 35);       //Raam//
        g.setColor(Color.ORANGE);
        g.fillRect(170, 160, 20, 50);       //deur//
        g.setColor(Color.BLACK);
        g.fillPolygon(new int[] {95, 150, 210}, new int[] {100, 10, 100}, 3);
    }
}