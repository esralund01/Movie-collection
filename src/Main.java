import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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


}
