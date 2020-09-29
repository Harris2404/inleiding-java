package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    @Override
    public void init() {
        super.init();
        setBackground(Color.white);
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawString("Harris", 50, 60);
        super.paint(g);
        g.setColor(Color.red);
        g.drawString("Doeve", 70, 60);
    }
}