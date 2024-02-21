import java.util.ArrayList;
//ALT DER ER UDKOMMENTERET ER FRA USER STORY 1 OPGAVE.
public class MovieCollection {
private ArrayList<Movie> collection;
//int count = 0;
public MovieCollection() {
    collection = new ArrayList<Movie>(); //kalder alle parametre fra movie.java classen
//    filmsamling = new Movie[5];
}

public void tilføjFilm(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
    collection.add(new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre));
    }
//    public Movie[] getFilmsamling(){
//    return filmsamling;
//    }


}
