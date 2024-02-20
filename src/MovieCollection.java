public class MovieCollection {
private Movie [] filmsamling;
int count = 0;


public MovieCollection() {
    this.filmsamling = new Movie[5];
}

public void tilføjMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
    filmsamling [count++] = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }
    public Movie[] getFilmsamling(){
    return filmsamling;
    }
}

