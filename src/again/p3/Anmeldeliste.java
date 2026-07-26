package again.p3;

import java.util.ArrayList;
import java.util.List;

public class Anmeldeliste {
    ArrayList<Anmeldung> eintraege = new ArrayList<>();

    void eintragen(Anmeldung a){
        eintraege.add(a);
    }
    String nachschlagen(String matrikelnummer){
        for (Anmeldung a : eintraege){
            if (a.getMartikelnummer().equals(matrikelnummer)) return a.getName();
        }
        return "";
    }
    void bereinigen(){
        ArrayList<Anmeldung> bereinigt = new ArrayList<>();
        for (Anmeldung a : eintraege){
            if (!bereinigt.contains(a)){
                bereinigt.add(a);
            }else {
                int index = bereinigt.indexOf(a);
                if (bereinigt.get(index).getName().length() < a.getName().length()){
                    bereinigt.set(index, a);
                }
            }
        }
        eintraege = bereinigt;
    }
}
