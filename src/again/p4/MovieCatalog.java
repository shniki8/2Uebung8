package again.p4;

import java.util.ArrayList;
import java.util.Optional;

public class MovieCatalog {
    ArrayList<Movie> movies = new ArrayList<>();

    void add(Movie m){
        movies.add(m);
    }
    Optional<Movie> findByTitle(String title){
        for (Movie m : movies){
            if (m.getTitle().equalsIgnoreCase(title)){
                return Optional.of(m);
            }
        }
        return  Optional.empty();
    }
    Optional<Movie> topRated(){
        if (movies.isEmpty()) return Optional.empty();
        Movie max = new Movie("", -1,1);
        for (Movie m : movies){
            if (m.getRating() > max.getRating()){
                max = m;
            }
        }
        return Optional.of(max);
    }
}
