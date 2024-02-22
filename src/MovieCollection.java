import java.util.ArrayList;
//ALT DER ER UDKOMMENTERET ER FRA USER STORY 1 OPGAVE.
public class MovieCollection {
     ArrayList<Movie> films = new ArrayList<>();

   /* public MovieCollection() {
        collection = new ArrayList<Movie>(); //kalder alle parametre fra movie.java classen
//    filmsamling = new Movie[5];
    }

    */
    public void addMovie(String title, String director, int yearCreated,
                           boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        films.add(movie);
        System.out.println(movie.toString());
      //films.add(new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre));
    }
   //user story 4 - lav liste
    public void filmList() {
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }
    }
    // user story 5 - lav search option
    public void searchMovie(String title) { //ny metode
        for (Movie searchingMovie : films) {
                if (searchingMovie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    System.out.println(searchingMovie.toString());
                }
            }
}
}
