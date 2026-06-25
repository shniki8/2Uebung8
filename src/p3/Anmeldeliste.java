package p3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Anmeldeliste {
    ArrayList<Anmeldung> eintraege = new ArrayList<>();
    void eintragen(Anmeldung a){
        eintraege.add(a);
    }
    String nachschlagen(String matrikelnummer){
        for(Anmeldung a : eintraege){
            if (a.getMatrikelnummer() == matrikelnummer){
                return a.getName();
            }
        }
        return null;
    }
    //Nichts hier ist null safe (vielleicht unterbewusst aber denke nicht), weil immer gesagt wird, man solle davon ausgehen, dass was Richtiges übergeben wird.
    //Ich entschuldige mich hiermit für diese Methode. Sie ist schlecht, sie ist unter meinem üblichen Niveau. Es ist 30C in meinem Zimmer,
    //ich will diese Aufgabe nur schnell erledigen, die Laufzeit dieser Methode ist katastrophal. Es gibt eine schönere Möglichkeit das zu überprüfen, da bin ich mir sehr sicher
    //Ich denke es würde einfach gehen, wenn ich eine Menge (set) erstelle und alles hinzufüge, zumindest in Mathe hat ja jede Menge jedes Element nur einmal.
    //Allerdings wird dann die Bedingung nicht erfüllt, dass der längste Name behalten werden soll schätze ich, sondern halt der erste.
    //Irgendwie wird es trotzdem mit einer Menge einfacher funktionieren, eigentlich müsste man die Elemente der ArrayList nur nach länge des Namens absteigend sortieren und dann in die Menge einfügen.
    void bereinigenTest(){ //so nicht (s. 2 Zeilen hierüber)
        Set<Anmeldung> menge = new HashSet<>(eintraege);
        ArrayList<Anmeldung> keep = new ArrayList<>();
        for (Anmeldung a : menge){
            keep.add(a);
        }
        eintraege = keep;
    }
    //Vermutung von oben bestätigt, ich lasse es jetzt einfach so, auch wenn mich der Anblick etwas traurig macht ...
    //Vielleicht so?:
    void bereinigenTest2(){
        eintraege.sort(Comparator.comparing(Anmeldung::nameLength).reversed());
        Set<Anmeldung> menge = new HashSet<>(eintraege);
        ArrayList<Anmeldung> keep = new ArrayList<>();
        for (Anmeldung a : menge){
            keep.add(a);
        }
        eintraege = keep;
    }
    //So!!!!
    //Ich behalte die alten Kommentare, mein Leid war nicht umsonst :')
    void bereinigen(){
        ArrayList<Anmeldung> keep = new ArrayList<>();
        ArrayList<Integer> skipIndex = new ArrayList<>();
        boolean inserted = false;
        Anmeldung laengstes;
        outer:
        for (int i = 0; i < eintraege.size(); i++) {
            inserted = false;
            for (int j = 0; j < skipIndex.size(); j++) {
                if (skipIndex.get(j) == i){
                    continue outer;
                }
            }
            laengstes = eintraege.get(i);
            for (int j = i; j < eintraege.size(); j++) {
                if (i == j) continue;
                if (eintraege.get(i).equals(eintraege.get(j))){
                    if (laengstes.toString().length() >= eintraege.get(j).toString().length()){
                        //keep.add(eintraege.get(i));
                        inserted = true;
                        skipIndex.add(j);
                    }
                    else {
                        skipIndex.add(j);
                        laengstes = eintraege.get(j);
                        inserted = true;

                    }
                }
            }
            if (inserted){
                keep.add(laengstes);
            }
            for (int j = 0; j < keep.size(); j++) {
                if (eintraege.get(i).equals(eintraege.get(j))){
                    inserted = true;
                    break;
                }
            }
            if (!inserted){
                keep.add(eintraege.get(i));
            }
        }
        eintraege = keep;
        //Mein Informatiklehrer wäre enttäuscht :(
    }
    int anzahl(){
        return eintraege.size();
    }
}
