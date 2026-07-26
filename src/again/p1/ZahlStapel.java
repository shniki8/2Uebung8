package again.p1;

public class ZahlStapel<T extends Number> extends Stapel<T>{
    double summe(){
        double sum = 0;
        for (T t : elemente){
            sum += t.doubleValue();
        }
        return sum;
    }

    double durchschnitt(){
        return summe()/elemente.size();
    }
}
