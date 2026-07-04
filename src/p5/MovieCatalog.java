package p5;

import java.util.ArrayList;
import java.util.Optional;

public class MovieCatalog {
    ArrayList<Movie> movies = new ArrayList<>();
    public void add(Movie m){
        movies.add(m);
    }
    Optional<Movie> findByTitle(String title){
        for (Movie m : movies){
            if (m.getName().equalsIgnoreCase(title)){
                return Optional.of(m);
            }
        }
        System.out.println("Movie not found"); //Alternative zur implementierung in demo, eigentlich schöner
        return Optional.empty();
    }
    Optional<Movie> topRated(){
        if (movies.isEmpty()){
            System.out.println("Catalog is empty"); //Alternative zur implementierung in demo, eigentlich schöner
            return Optional.empty();
        }
        else{
            Movie max = new Movie("",0.0,0);
            for(Movie m : movies){
                if(m.getRating() > max.getRating()){
                    max = m;
                }
            }
            return Optional.of(max);
        }
    }
}
