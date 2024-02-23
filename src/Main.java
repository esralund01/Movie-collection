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

        int userInput = 0;
        final int SENTINEL = 2;
        String title; //added string title så den overwriter andre title-værdier og kan søge i searchmovie
        System.out.println("Velkommen til min filmsamling. Du har nu 4 muligheder:");
        while (!(userInput == SENTINEL)) {
            System.out.println("Tryk 1 for 'Opret en film'");
            System.out.println("Tryk 2 for 'Afslut'");
            System.out.println("Tryk 3 for 'Vis filmliste'");
            System.out.println("Tryk 4 for 'Search for movie'");
            userInput = input.nextInt();
            input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"

            if (userInput == 1) {
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
                erIFarve = erIFarve.toLowerCase(); //uanset hvad og hvordan man inputter, bliver det ouputtet til lower case
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

            }
            if (userInput == 2) {
                System.out.println("THE END");
            }
            if (userInput == 3) { //user story 4 - lav liste
                myFirstCollection.filmList();
            }
            if (userInput == 4) { //user story 5 - søg
                System.out.println("Search for movie title: ");
                title = input.nextLine();
                myFirstCollection.searchMovie(title);

            }
            }
        }
    }
