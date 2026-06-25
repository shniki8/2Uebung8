package p3;

import java.util.Objects;

public class Anmeldung {
    private String matrikelnummer,name;
    public Anmeldung(String matrikelnummer, String name){
        this.matrikelnummer = matrikelnummer;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Anmeldung){
            return Objects.equals(((Anmeldung) obj).matrikelnummer, this.matrikelnummer);
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrikelnummer);
    }

    @Override
    public String toString() {
        return "["+matrikelnummer+"] " + name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int nameLength(){ //Ich bin mal so frei
            String s = "["+matrikelnummer+"] " + name;
            return s.length();
    }
}
