import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller myFirstCollection = new Controller();
        //USER STORY 1
      /*  Scanner input = new Scanner(System.in);
        //Lav movie objekt

        MovieCollection firstCollection = new MovieCollection();
        //tilføj film
        System.out.println("Enter movie title and press Enter");
        String title = input.nextLine();

        System.out.println("Enter movie director and press Enter");
        String director = input.nextLine();

        System.out.println("Enter year created and press Enter");
        int yearCreated = input.nextInt();

        System.out.println("Enter if movie is in color (True/false) and press Enter");
        boolean isInColor = input.nextBoolean();

        System.out.println("Enter length in minutes and press Enter");
        int lengthInMinutes = input.nextInt();
        //dummy bug
        input.nextLine();

        System.out.println("Enter movie genre and press Enter");
        String genre = input.nextLine();

        firstCollection.tilføjMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        Movie[] movieList = firstCollection.getFilmsamling();
        System.out.println(movieList[0].getTitle() + " er blevet tilføjet til listen");
        }

*/

//USER STORY 2+3:

        int tilføjFilm = 0;
        final int SENTINEL = 2;
        String title; //added string title så den overwriter andre title-værdier og kan søge i searchmovie

        while (!(tilføjFilm == SENTINEL)) {
            System.out.println("Velkommen til min filmsamling. Du har nu 4 muligheder:");
            System.out.println("Tryk 1 for 'Opret en film'");
            System.out.println("Tryk 2 for 'Afslut'");
            System.out.println("Tryk 3 for 'Vis filmliste'");
            System.out.println("Tryk 4 for 'Search for movie'");
            tilføjFilm = input.nextInt();
            input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"

            if (tilføjFilm == 1) {
                //tilføj film
                System.out.println("Enter movie title and press Enter");
                title = input.nextLine();

                System.out.println("Enter movie director and press Enter");
                String director = input.nextLine();

                System.out.println("Enter year created and press Enter");
                int yearCreated = input.nextInt();
                input.nextLine();

                //ændret fra boolean true/false til yes/no ved hjælp af @Override public String toString(){
                boolean isInColor = false;
                System.out.println("Is the movie in color? Write yes/no");
                String erIFarve = input.next();
                erIFarve = erIFarve.toLowerCase();
                if (erIFarve.equals("yes")) {
                    isInColor = true;
                }

                System.out.println("Enter length in minutes and press Enter");
                int lengthInMinutes = input.nextInt();
                //dummy bug
                input.nextLine();

                System.out.println("Enter movie genre and press Enter");
                String genre = input.nextLine();

                myFirstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
                //  movieList.get(0)
                // Movie[] movieList = firstCollection.getmovieCollection();
                //System.out.println(title + " er blevet tilføjet til listen.");

            }
            if (tilføjFilm == 3) { //user story 4 - lav liste
                myFirstCollection.filmList();
            }
            if (tilføjFilm == 4) { //user story 5 - søg
                System.out.println("Search for movie title: ");
                title = input.nextLine();
               // input.nextLine();
                myFirstCollection.searchMovie(title);
                /*if (title!= collection.searchMovie(title))
                    System.out.println("No movie found");

                 */
            } else {
                System.out.println("The program has ended.");
            }
            /* ikke længere brug for dette, da vi istedet bare lave en "else"
            if(tilføjFilm==2){
                System.out.println("THE END");
             */
        }
    }
}