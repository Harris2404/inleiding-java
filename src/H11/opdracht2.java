package H11;

public class Opdracht2 {

import java.applet.*;
import java.awt.*;

    public class Opdracht2 extends Applet {
        public void init() {}

        public void paint(Graphics g) {
            for(int I=5; I<=15; I++) {
                g.drawString("" + I,25,I*15);
            }
        }
    }