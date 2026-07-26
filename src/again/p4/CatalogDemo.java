package again.p4;

import javax.swing.text.html.Option;
import java.util.Optional;

public class CatalogDemo {
    public static void main(String[] args) {
        MovieCatalog mc = new MovieCatalog();
        mc.add(new Movie("HelloWorld - The Movie", 10, 2027));
        mc.add(new Movie("Test", 0, 0));
        mc.add(new Movie("MorgenKlausur", 2.3, 2026));
        System.out.println(mc.findByTitle(" ").orElse(new Movie("Film nicht gefunden", 0, 0)).getTitle());
        System.out.println(mc.topRated().orElse(new Movie("Liste leer.",0,0)).getTitle());
    }
}
