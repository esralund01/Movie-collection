import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner input = new Scanner(System.in);
        Controller collection = new Controller();

        int tilføjFilm = 0;
        final int SENTINEL = 2;
        while (!(tilføjFilm == SENTINEL)) {
            System.out.println("Velkommen til min filmsamling. Du har nu 2 muligheder:");
            System.out.println("Tryk 1 for 'Opret en film'");
            System.out.println("Tryk 2 for 'Afslut'");
            tilføjFilm = input.nextInt();
            if (tilføjFilm == 1) {
                Controller firstCollection = new Controller(); //ændret navn fra movieCollection til controller for at få input derfra istedet
                //tilføj film
                System.out.println("Enter movie title and press Enter");
                String title = input.nextLine();
                //dummy bug
                input.nextLine();

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

                collection.tilføjFilm(title, director, yearCreated, isInColor, lengthInMinutes, genre);
              //  movieList.get(0)
                //Movie[] movieList = firstCollection.getFilmsamling();
                //System.out.println(movieList[0].getTitle() + " filmen er blevet tilføjet til listen");

            } else {
                System.out.println("SLUT");
            }
        }
    }
}