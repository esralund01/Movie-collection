import java.util.ArrayList;
public class Controller { //controller constructor. opretter hvad en vi putter ind i den. så moviecollection.
    //controlleren uddelelere videre til moviecollection. den er mellemmand mellem main og resten

    private MovieCollection myFirstCollection;

    public Controller() {
        myFirstCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor,
                         int lenghtInMinutes, String genre) {
        myFirstCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

    //user story 4 create list of all movies
    public void filmList() { //så den kan hentes over i main
        //for (Movie movie : collection.seFilmListe() {
        //  System.out.println(movie.toString());
        myFirstCollection.filmList();
    }

    public void searchMovie(String title) {
        myFirstCollection.searchMovie(title);
    }
}


        /* public boolean searchMovie(String title) { //string title fordi vi vil søge efter titlens navn = string
       for (Movie movie : collection.collection){
            if (title.toLowerCase().equals(movie.getTitle()))
            System.out.println("Movie found" + movie.getTitle());
            return true;
        } System.out.println("No movie found");
        return false;
       // collection.searchMovie(title);

    */


