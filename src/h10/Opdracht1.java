package h10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends JApplet {
}

    TextField Tekstvak;
    double Tekst;
    double Getal;
    Label Label;
    String S;

    public void init() {
        //Initialisation
        Getal = 7;
        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvak());
        Label = new Label("Voer  getal in en press op enter!");

        add(Label);
        add(Tekstvak);
    }
}

public void paint(Graphics g) {
        g.drawString("Het getal dat u heeft ingevoerd is: " + Getal,20,50);

private class Tekstvak implements ActionListener {
    public void actionPerformed(ActionEvent e) {

