import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieCollectionTest {
MovieCollection movieCollection = new MovieCollection();
    @Test
    void addMovie() {
        Movie movie1 = new Movie ("Harry Potter og de vise sten", "JK Rowling", 1998,
                true,120,"Comedy");
        Movie movie2 = new Movie ("Harry Potter og dødsregalierne", "JK Rowling", 2003,
                true, 135, "Thriller" );
movieCollection.addMovie("Harry Potter og de vise sten", "JK Rowling", 1998,
        true,120,"Comedy");
    }

    @Test
    void filmList() {
    }

    @Test
    void searchMovie() {
    }
}