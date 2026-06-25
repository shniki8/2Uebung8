package p1;

public class StapelDemo {
    public static void main(String[] args) {
        Stapel<String> straenge = new Stapel<>();
        straenge.ablegen("Hallo Welt");
        straenge.ablegen("69696969");
        straenge.ablegen("Kreativer Satz hier");
        System.out.println(straenge.entnehmen());
        System.out.println(straenge.entnehmen());
        System.out.println(straenge.entnehmen());
        ZahlStapel<Integer> zahlen = new ZahlStapel<>();
        zahlen.ablegen(4);
        zahlen.ablegen(7);
        zahlen.ablegen(9);
        System.out.println(zahlen.summe());
        System.out.println(zahlen.durchschnitt());
        //d: String ist kein Subtyp von Number, int jedoch schon.
        //Man kann so sicher T zu Number casten und die Methoden verwenden, sonst könnte man ja alles übergeben und müsste vorher prüfen ob T Subtyp von Number ist
    }
}
