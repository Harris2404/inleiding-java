package h08;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("HET WERKT!!!", 50, 50);
    }
}
