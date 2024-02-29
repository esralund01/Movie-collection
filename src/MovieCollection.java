import java.util.ArrayList;
public class MovieCollection {
    ArrayList<Movie> films = new ArrayList<>();

    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        films.add(movie);
        System.out.println(movie.toString());
    }

    //lav liste
    public void filmList() {
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }
    }

    //lav search option
    //lav arraylist til evt match
    //lav loop der kører igennem vores collection
    // inde i loopet tjekker vi om filmens titel matcher metodens input
    //if der er et match tilføjer vi til den lokale arraylist
    //returner arraylist til sidst
        public ArrayList<Movie> searchMovies(String title) {//LAV OM FRA STRING TIL ARRAYLISTE
        ArrayList<Movie> searchMatchList = new ArrayList<>();
           // System.out.println("Følgende film passer til din søgning:");
            for (Movie movie : films) {
                if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) { //matching checket
                    searchMatchList.add(movie);
                }
            }
            return searchMatchList;
        }
    }

//lav deletemovie metode - USER STORY 11

//lav arrayliste til edit
//først kalder vi search så vi får en arraylist
//spørg brugeren om hvilket nummer match man vil redigere
//man kalder get på arraylisten fra search (husk at trække 1 fra (-1))
//nu har vi movie objektet
//promopt brugeren for hvad der skal ændres (som i velkomstmenuen)

   /* USER STORY 8 - EDIT OPTION - brug set. //lav om til arrayliste(?)
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



