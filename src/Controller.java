import java.util.ArrayList;
public class Controller { //controller constructor. opretter hvad en vi putter ind i den. så moviecollection.
    //controlleren uddelelere videre til moviecollection. den er mellemmand mellem main og resten

    MovieCollection myFirstCollection;

    public Controller() {
        myFirstCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor,
                         int lenghtInMinutes, String genre) {
        myFirstCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

    //user story 4 create list of all movies
    public void filmList() { //så den kan hentes over i main
        myFirstCollection.filmList();
    }

    public void searchMovie(String title) {
        myFirstCollection.searchMovie(title);
    }
    /*user story 8
    public void editMovie (String title, String director, int yearCreated, int lengthInMinutes, String genre){
        myFirstCollection.editMovie(title);
    }

     */

}

