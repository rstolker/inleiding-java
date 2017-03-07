package h06;
import java.awt.*;
import java.applet.*;


public class Karwei extends Applet {
   double a;
   double b;
   double c;
   double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        c = 0;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst, 20, 20);
        g.drawString("Ali krijgt: " + uitkomst, 20, 35);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 50);
        g.drawString("Rico krijgt: " + uitkomst, 20, 65);

    }
}
