package h12;

import java.applet.*;
import java.awt.*;

public class Opdracht1 extends Applet {

    //Declaratie
    double Gemiddelde;
    double Uitkomst;
    double A;
    double B;
    double C;
    double D;
    double E;
    double F;
    double G;
    double H;
    double I;
    double J;


    public void init() {

        //Initalisatie
        A = 6.5;
        B = 6;
        C = 3;
        D = 4.3;
        E = 8.1;
        F = 10;
        G = 2.5;
        H = 6.8;
        I = 6.8;
        J = 8;

        Gemiddelde =double(11);
        Uitkomst = (A + B + C + D + E + F + G + H + I + J) / 10;

        //Initalisatie berekening gemiddelde
        Gemiddelde[0] = A;
        Gemiddelde[1] = B;
        Gemiddelde[2] = C;
        Gemiddelde[3] = D;
        Gemiddelde[4] = E;
        Gemiddelde[5] = F;
        Gemiddelde[6] = G;
        Gemiddelde[7] = H;
        Gemiddelde[8] = I;
        Gemiddelde[9] = J;
        Gemiddelde[10] = Uitkomst;

        (int teller = 2; teller < Gemiddelde:length; teller++) {
        }
    }


