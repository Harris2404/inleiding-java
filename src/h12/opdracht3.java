package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {

    int getallen = {10, 15, 20, 25, 30, 35, 40, 45 50, 55, 60,};
    OK enter = new Button("OK");
    TextField input = new TextField("",10);
    Label tekst = new Label("Voer een getal 1 tot 100, geen komma getallen!");

    public void init() {

    }


    class EnterListener implements ActionListener
        public void actionPerformed(ActionEvent e)
            controle = false;
            nummer = Integer.parseInt(input.getText());

            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    controle = true;
                    break;
                }
            }

