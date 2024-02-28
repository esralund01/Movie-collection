import java.util.Scanner;
import java.util.ArrayList;
public class MovieCollection {
    ArrayList<Movie> films = new ArrayList<>();

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
        boolean found = false;
        for (Movie searchingMovie : films) {
            if (searchingMovie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(searchingMovie.toString()); //printer kun titlen på de film der passer.
                found = true;}
            }
        if (!found) { //tilføjet så sout kun printes hvis filmen ikke er der, og ikke ved hver itieration
            System.out.println("\nIngen film i din liste matchede din søgning.");
        }

    }
}

   /* USER STORY 8 - EDIT OPTION - brug set.
    public void editMovie(String title) {
        Scanner scanner = new Scanner(System.in);
        int editOption = 0;
        // Iterate through each movie in the list
        for (Movie editMovie : films) {
            // Check if the current movie's title matches the provided title
            if (editMovie.getTitle().equalsIgnoreCase(title))
                // Prompt the user to choose an edit option
                System.out.println("1. Title");
                System.out.println("2. Director");
                System.out.println("3. Year Created");
                System.out.println("4. Length in Minutes");
                System.out.println("5. Genre");
                System.out.print("Enter your choice: ");

                editOption = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                // Perform edit based on user's choice
                if (editOption==1) {
                    System.out.println("Enter new title:");
                    String newTitle = scanner.nextLine();
                    editMovie.setTitle(newTitle);

                } if(editOption==2) {
                    System.out.println("Enter new director:");
                    String newDirector = scanner.nextLine();
                    editMovie.setDirector(newDirector);

                } if(editOption==3) {
                    System.out.println("Enter new year created:");
                    int newYearCreated = scanner.nextInt();
                    editMovie.setYearCreated(newYearCreated);

                } if (editOption==4) {
                    System.out.println("Enter new length in minutes:");
                    int newLengthInMinutes = scanner.nextInt();
                    editMovie.setLengthInMinutes(newLengthInMinutes);

                } if(editOption==5) {
                    System.out.println("Enter new genre:");
                    String newGenre = scanner.nextLine();
                    editMovie.setGenre(newGenre);
                }
            // Display the updated movie details
                System.out.println("Updated movie details:");
            System.out.println(editMovie);
                }

            }


/*
        for (Movie editMovie : films) {
            System.out.println("Hvad vil du ændre? ");
            if (editOption == 1) {
                (editMovie.getTitle().toLowerCase(String title))
                System.out.println("Enter new title:");
                String newTitle = scanner.nextLine();
                System.out.println(editMovie.toString());
            } if (editOption == 2) {
                (editMovie.getDirector().toLowerCase(String director))
                System.out.println("Enter new director:");
                String newDirector = scanner.nextLine();
                System.out.println(editMovie.toString());
            } if (editOption==3){
                (editMovie.getyearCreated()(int yearCreated))
                System.out.println("Enter new year created");
                int newYearCreated = scanner.nextInt();
                System.out.println(editMovie.toString());
            } if (editOption==4){
                (editMovie.getLengthInMinutes()(int lengthInMinutes))
                System.out.println("Enter new length in minutes:");
                int newLengthInMinutes = scanner.nextInt();
                System.out.println(editMovie.toString());
            } if (editOption ==5) {
                (editMovie.getGenre().toLowerCase(String genre))
                System.out.println("Enter new genre:");
                String newGenre = scanner.nextLine();
                System.out.println(editMovie.toString());
            }
            System.out.println(editMovie);

 */



