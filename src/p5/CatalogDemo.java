package p5;

import java.util.Optional;

public class CatalogDemo {


    public static void main(String[] args) {
        MovieCatalog mc = new MovieCatalog();
        mc.add(new Movie("Creative and fun movie name", 8.0, 2012));
        mc.add(new Movie("Your Name.", 9.0, 2016));
        mc.add(new Movie("Hello World", 1.0, 1974)); //https://de.wikipedia.org/wiki/Hallo-Welt-Programm
        mc.add(new Movie("Test", 1.0, 2000));
        Optional<Movie> o = mc.findByTitle("Your Name");
       if (o.isPresent()){
           System.out.println(o.get());
       }
       System.out.println(mc.findByTitle("XYZ").orElse(new Movie("Movie not found", -1.0, 0)).getName());;
       System.out.println(mc.topRated().orElse(new Movie("Catalog is empty", -1.0, 0)).getName());
       // zur d): Man kann ggf. genau so etwas wie hierüber machen, es kann also direkt der null fall mit orElse "abgefangen" werden, da Optional dann Methoden etc.
       // auf dem other object ausführt, es zwingt einen ein bisschen es richtig zu implementieren (warum nicht direkt try-catch???) :(
       // Ich mag try-catch, ich hoffe es wird bald thematisiert.
       // zur d2): Welche Aufgabe 4 bitte? Dieses Blatt hat keine, das aktuelle hat eine ohne die gefragte Methode, das letzte hatte nur 3 Aufgaben. Bin ich dumm und zu müde oder gibt es diese nicht?
    }

}
