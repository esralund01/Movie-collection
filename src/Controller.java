import java.util.ArrayList;

public class Controller {//controller constructor. opretter hvad en vi putter ind i den. så moviecollection.
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
        ArrayList<Movie> searchResult = myFirstCollection.searchMovies(title);
        if (searchResult.isEmpty()) {
            System.out.println("Ingen matchende film fundet.");
        } else {
            System.out.println("Følgende film passer til din søgning:");
            for (Movie movie : searchResult) {
                System.out.println(movie.toString());
            }
            myFirstCollection.searchMovies(title);
        }
    }
     //edit option
    public void editMovie (int index, int attribute, String newValue){
        String editedMovie= myFirstCollection.editMovie(index, attribute, newValue);
        System.out.println("Film redigeret.");
        System.out.println(editedMovie);
    }
    public void deleteMovie (int index){ //definer hvad der skal ændres i = index
      myFirstCollection.deleteMovie(index);
        System.out.println("Filmen er blevet slettet." +  "\n" + "Din liste ser nu således ud:");

    }

    }




