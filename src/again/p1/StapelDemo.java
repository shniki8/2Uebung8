package again.p1;

public class StapelDemo {
    public static void main(String[] args) {
        ZahlStapel<Integer> zS = new ZahlStapel<>();
        zS.ablegen(4);
        zS.ablegen(7);
        zS.ablegen(9);
        System.out.println(zS.summe());
        System.out.println(zS.durchschnitt());
    }
}
