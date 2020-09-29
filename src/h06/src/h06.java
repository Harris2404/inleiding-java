
package HO6;

        import java.awt.*;
        import java.applet.*;


public class H06 extends Applet {

    //rekening
    double Jan;
    double Ali;
    double Jeannette;
    double Harris;
    double personen;
    double bedrag;


    public void init() {

        //splitsing
        bedrag = 113;
        personen = 4;
        Jan = bedrag / personen;
        Ali = bedrag / personen;
        Jeannette = bedrag / personen;
        Harris = bedrag / personen;


    }

    public void paint(Graphics g) {
        g.drawString("eindbedrag voor Jan: " + Jan,20,20);
        g.drawString("eindbedrag voor Ali: " + Ali,20,40);
        g.drawString("eindbedrag voor Jeannette: " + Jeannette,20,60);
        g.drawString("eindbedrag voor Harris: " + Harris,20,80);
    }