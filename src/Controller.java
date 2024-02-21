public class Controller { //controller constructor. opretter hvad en vi putter ind i den. så moviecollection.

    private MovieCollection collection;
    public Controller() {
        collection = new MovieCollection();
    }
        public void tilføjFilm (String title, String director,int yearCreated, boolean isInColor,
        int lenghtInMinutes, String genre){
            collection.tilføjFilm(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        }
    }

