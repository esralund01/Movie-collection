import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    Controller myFirstCollection = new Controller();

    public void startProgram() { //ny metode til at starte programmet USER STORY 7

        Scanner input = new Scanner(System.in);
        int userInput = 0;
        final int SENTINEL = 2;

        // Hardcode til debug
        myFirstCollection.addMovie("Harry Potter vise sten", "JK Rowling", 1998, true, 120, "Comedy");
        myFirstCollection.addMovie("Harry Potter azkaban", "JK Rowling", 2002, true, 130, "Comedy");


        String title; //added string title så den overwriter andre title-værdier og kan søge i searchmovie

        while (!(userInput == SENTINEL)) {
            System.out.println("\nTryk 1 for 'Opret en film'");
            System.out.println("Tryk 2 for 'Afslut'");
            System.out.println("Tryk 3 for 'Vis filmliste'");
            System.out.println("Tryk 4 for 'Search for movie'");

            //USER STORY 8 - NY EDIT METHOD
            System.out.println("Tryk 5 for 'Edit movie'");

            //USER STORY 11 - SLET FILM
            System.out.println("Tryk 6 for 'Slet Film'");

            userInput = input.nextInt();
            input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"

            if (userInput == 1) {
                addMovieMethod(); //metodekald til at oprette film
                userInput = 0; // Nulstil brugerinput for at vende tilbage til hovedmenuen

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
            }  //EDIT OPTION
            if(userInput == 5) {
                editMovieMethod();
            } if (userInput==6) {
                deleteMovieMethod();
            }
            else if (userInput == 2) {
                System.out.println("THE END");
            }

        }
        userInput = input.nextInt(); //tilføjet ellers printer den ikke korrekt ud
        input.nextLine(); // flere af de her er blevet tilføjet for at kunne få den til at printe titlen ud ved "" er blevet tilføjet til listen"

    }
    public void addMovieMethod() { //ny metode til at tilføje alt
        Scanner input = new Scanner(System.in);
        //Controller myFirstCollection = new Controller(); - FJERNET Dette sikrer, at du bruger den samme Controller-instans, som du har oprettet uden for metoden, i stedet for at oprette en ny instans inde i addMovieMethod

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
        System.out.println("\nFilm er tilføjet.");

    }
    //opret ny metode til at redigere film
    public void editMovieMethod() {
        Scanner input = new Scanner(System.in); //fordi brugeren laver input

        try {
            System.out.println("Indtast indeksnummer på film du vil ændre");

            int index = input.nextInt(); //brugerinput
            input.nextLine();


            System.out.println("Vælg hvad du vil ændre:");
            System.out.println("1. Titel");
            System.out.println("2. Instruktør");
            System.out.println("3. År for oprettelse");
            //System.out.println("4. Er i farve (yes/no)");
            System.out.println("4. Længde i minutter");
            System.out.println("5. Genre");
            int attribute = input.nextInt();
            input.nextLine(); // Clearing the buffer
            System.out.println("Fejl. Indtast venligst et gyldigt heltal");


            System.out.println("Indtast den nye værdi:");
            String newValue = input.nextLine(); //den nye ændring kommer ind

            myFirstCollection.editMovie(index, attribute, newValue);
        } catch (InputMismatchException ime) {
            System.out.println("Fejl. ndtast venligst et gyldigt heltal");
        }

    }
    public void deleteMovieMethod(){
        Scanner input = new Scanner(System.in);

        try {// i dette punkt  ville der kunne opstå en fejl, så derfor er det i en try.
            System.out.println("Indtast indeksnummer på den film du vil slette");
            int index = input.nextInt();
            input.nextLine();
            myFirstCollection.deleteMovie(index);
            myFirstCollection.filmList();
        } catch (InputMismatchException ime)
        //så man griber fejlen og returner en besked til brugeren, istedet for at koden går i stå
        {
            System.out.println("Fejl. Indtast venligst et gyldigt heltal"); }

    }

    }



