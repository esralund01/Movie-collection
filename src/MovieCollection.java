import java.util.ArrayList;
//ALT DER ER UDKOMMENTERET ER FRA USER STORY 1 OPGAVE.
public class MovieCollection {
    ArrayList<Movie> films = new ArrayList<>();{}

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
    }
    //user story 4 - lav liste
    public void filmList() {
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }
    }
    // user story 5 + 6 - lav search option
    public void searchMovie(String title) { //ny metode
        System.out.println("Følgende film passer til din søgning:");
        for (Movie searchingMovie : films) {
            if (searchingMovie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(searchingMovie.toString()); //printer kun titlen på de film der passer.
                // getTitle() så den kun printer titlen - kan bruges senere
            } else if (films.isEmpty()) { //tilføjet så sout kun printes hvis filmen ikke er der, og ikke ved hver itieration
                System.out.println("Ingen film i din liste matchede din søgning.");
            }
        }

    }
}