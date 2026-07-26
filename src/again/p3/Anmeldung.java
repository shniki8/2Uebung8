package again.p3;

import java.util.Objects;

public class Anmeldung {
    private String martikelnummer, name;

    public Anmeldung(String martikelnummer, String name) {
        this.martikelnummer = martikelnummer;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        if (((Anmeldung) obj).getMartikelnummer().equals(this.getMartikelnummer())) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(martikelnummer);
    }

    @Override
    public String toString() {
        return "[" + martikelnummer + "] " + name;
    }

    public String getMartikelnummer() {
        return martikelnummer;
    }

    public void setMartikelnummer(String martikelnummer) {
        this.martikelnummer = martikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
