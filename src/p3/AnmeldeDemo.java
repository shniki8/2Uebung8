package p3;

import java.util.ArrayList;

public class AnmeldeDemo {
    public static void main(String[] args) {
        Anmeldeliste liste = new Anmeldeliste();
        liste.eintragen(new Anmeldung("12345", "Anna" ));
        liste.eintragen(new Anmeldung("12345", "Anna Schmidt"));
        liste.eintragen(new Anmeldung("67890", "Ben"));
        liste.eintragen(new Anmeldung("67890", "Benjamin Mueller"));
        liste.eintragen(new Anmeldung("67890", "Benjamin Mueller"));
        liste.eintragen(new Anmeldung("11111", "Clara Weber"));
        liste.eintragen(new Anmeldung("67890", "Benjamin Mueller"));
        liste.eintragen(new Anmeldung("11111", "Clara Weber"));
        liste.eintragen(new Anmeldung("12345", "Anna" ));
        System.out.println(liste.anzahl());
        printList(liste);
        liste.bereinigenTest();
        System.out.println(liste.anzahl());
        printList(liste);
    }
    public static void printList(Anmeldeliste l){
        for (int i = 0; i < l.anzahl(); i++) {
            System.out.println(l.eintraege.get(i));
        }
    }
    //d): 1): weil es die Aufgabe war? (2 Objekte sind equal, wenn Matr.-Nr. gleich ist
    //2): Dann haben zwei Objekte, die eigentlich gleich sind nicht denselben Hashcode, was sehr böse wäre und dann kommt die Java Polizei.
}
