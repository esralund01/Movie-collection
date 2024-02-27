import java.util.Scanner;

public class UserInterface {

    void startProgram() { //ny metode til at starte programmet USER STORY 7
        Scanner input = new Scanner(System.in);
        Controller myFirstCollection = new Controller();

        int userInput = 0;
        final int SENTINEL = 2;

       // Hardcode til debug
        myFirstCollection.addMovie("Harry Potter vise sten", "JK Rowling", 1998, true, 120, "Comedy");
        myFirstCollection.addMovie("Harry Potter azkaban", "JK Rowling", 2002, true, 130, "Comedy");


        String title; //added string title så den overwriter andre title-værdier og kan søge i searchmovie
        System.out.println("Velkommen til min filmsamling. Du har nu 5 muligheder:");

        while (!(userInput == SENTINEL)) {
            System.out.println("Tryk 1 for 'Opret en film'");
            System.out.println("Tryk 2 for 'Afslut'");
            System.out.println("Tryk 3 for 'Vis filmliste'");
            System.out.println("Tryk 4 for 'Search for movie'");

            //USER STORY 8 - NY EDIT METHOD
            //System.out.println("Tryk 5 for 'Edit movie'");

            userInput = input.nextInt();
            input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"

            if (userInput == 1) {
                addMovieMethod(); //metodekald til at oprette film
            }
            if (userInput == 2) {
                System.out.println("THE END");
            }
            //UDSKRIVER
            if (userInput == 3) { //user story 4 - lav liste
                myFirstCollection.filmList();
            }
            //SØGER
            if (userInput == 4) { //user story 5 - søg
                System.out.println("\nSearch for movie title: ");
                title = input.nextLine();
                myFirstCollection.searchMovie(title);
            }

            //USER STORY 8 - EDIT OPTION
            /*if(userInput == 5){
                System.out.println(("Enter movie title to edit"));
                title = input.nextLine();
                myFirstCollection.editMovie(title);
            }
             */
            userInput = input.nextInt(); //tilføjet ellers printer den ikke korrekt ud
            input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"
        }
    }
    //OPRETTER
    public void addMovieMethod() { //ny metode til at tilføje alt
        Scanner input = new Scanner(System.in);
        Controller myFirstCollection = new Controller();

        //tilføj film
        System.out.println("Enter movie title and press Enter");
        String title = input.nextLine();

        System.out.println("Enter movie director and press Enter");
        String director = input.nextLine();

        System.out.println("Enter year created and press Enter");
        int yearCreated = input.nextInt();
        input.nextLine();

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
}


