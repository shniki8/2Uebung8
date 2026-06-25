package p1;

import java.util.ArrayList;

public class ZahlStapel<T extends Number> extends Stapel{

    double summe(){

        double summe = 0;
        for (int i = 0; i < elemente.size(); i++) {
            Number e = (Number)elemente.get(i);
            summe+= e.doubleValue();
        }
        return summe;
    }
    double durchschnitt(){ //Annahme: nicht leer
        return this.summe()/elemente.size();
    }
}
