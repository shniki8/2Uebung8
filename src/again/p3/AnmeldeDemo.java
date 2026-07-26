package again.p3;

public class AnmeldeDemo {

    public static void main(String[] args) {
        Anmeldeliste al = new Anmeldeliste();
        al.eintragen(new Anmeldung( "12345", "Anna"));
        al.eintragen(new Anmeldung( "12345", "Anna Schmidt"));
        al.eintragen(new Anmeldung( "67890", "Ben"));
        al.eintragen(new Anmeldung( "67890", "Benjamin Mueller"));
        al.eintragen(new Anmeldung( "11111", "Clara Weber"));
        al.eintragen(new Anmeldung( "69696", "Ada Lovelace"));
        al.bereinigen();
        System.out.println(al.eintraege);
    }
}
