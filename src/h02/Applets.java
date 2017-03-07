package h02;

import java.applet.Applet;

import java.applet.Applet;
import java.awt.*;
        import java.applet.*;

public class Applets extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Rico Stolker!!", 50, 60 );
    }
}