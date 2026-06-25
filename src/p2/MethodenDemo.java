package p2;

import java.util.Arrays;

public class MethodenDemo {
    public static void main(String[] args) {
        String[] strings = {"Banane", "Apfel", "Kirsche", "Mango", "Erdbeere"}; //Peak!!!
        System.out.println(Arrays.toString(strings));
        ArrayUtils.tausche(strings,0,strings.length-1);
        System.out.println(Arrays.toString(strings));
        System.out.println(ArrayUtils.maximum(3,4,1));
        ArrayUtils.analysiere(1);
        ArrayUtils.analysiere(1f);
        ArrayUtils.analysiere(1.0);
        //d: 2): Weil nur so sichergestellt wird das die Objekte vergleichbar sind bzw. compareTo implementieren.
        //1): Typparameter wird nur für einzelne Methoden gebraucht und sind im Endeffekt irrelevant für die gesamte Klasse und können in nichtgenerischen Klassen stehen (Gen. Methode), Typfestlegung beim Aufruf nicht Objekterstellung. Andersrum sollte die Klasse generisch sein wenn der Typparamter für im Allgemeinen für die Klasse an sich relevant ist.
    }
}
