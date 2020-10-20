package h08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applet {
}

    //Declaratie
    Button OkayKnop;
    Button ResetKnop;
    Label Label;
    TextField Tekstvak;
    String S;

    public void init() {

        //Initalisatie
        Tekstvak = new TextField("Klik hier");
        OkayKnop = new Button("Okay");
        Label = new Label("Type hier iets!");
        ResetKnop = new Button("Reset");
        OkayKnop.addActionListener(new HO8.Opdracht1.KnoplistenerOkay() );
        ResetKnop.addActionListener(new HO8.Opdracht1.KnoplistenerReset() );
        add(Label);
        add(Tekstvak);
        add(OkayKnop);
        add(ResetKnop);
        S = "";
    }

    public void paint(Graphics g) {
        g.drawString(S,60,80);
    }

    class KnoplistenerOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            repaint();
        }

    }

    class KnoplistenerReset implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Tekstvak.setText("");
            repaint();
        }

        private void repaint() {
        }
    }
