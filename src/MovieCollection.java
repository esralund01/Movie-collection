import java.util.ArrayList;
import java.util.Scanner;
public class MovieCollection {
    ArrayList<Movie> films = new ArrayList<>();

    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        films.add(movie);
        System.out.println(movie.toString());
    }
    public void filmList() {
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }
    }
    /*lav search option:
        -  lav arraylist til evt match
        - lav loop der kører igennem vores collection
        - inde i loopet tjekker vi om filmens titel matcher metodens input
        - hvis der er et match tilføjer vi til den lokale arraylist
        - returner arraylist til sidst
     */
    public ArrayList<Movie> searchMovies(String title) {//LAV OM FRA STRING TIL ARRAYLISTE
        ArrayList<Movie> searchMatchList = new ArrayList<>();
        for (Movie movie : films) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) { //matching checket
                searchMatchList.add(movie);
            }
        }
        return searchMatchList;
    }
    //User story #8 - edit option
    public String editMovie(int index, int attribute, String str) { //index, att, str = de variabler vi vil ændre
        Movie movie = films.get(index); //henter index værdierne fra arraylisten films
        if (attribute == 1) { //assigner en opgave til hver attribut
            movie.setTitle(str);
        } else if (attribute ==2){
            movie.setDirector(str);
        } else if (attribute == 3){
            movie.setYearCreated(Integer.parseInt(str)); //omdanner int værdi til en string
         //else if (attribute ==4){
            //movie.setIsInColor(isInColor);
        } else if(attribute==4){
            movie.setLengthInMinutes(Integer.parseInt(str));
        } else if(attribute==5){
             movie.setGenre(str);
        }
        return movie.toString(); //returner det hele tilbage som string
    }
//lav deletemovie metode - USER STORY 11

    public void deleteMovie(int index){
        films.remove(index);
    }
    }


