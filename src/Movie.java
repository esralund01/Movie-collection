public class Movie {
    //attributter
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    //constructotr med parametre
    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getyearCreated() {
        return yearCreated;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setYearCreated(int yearCreated){
        this.yearCreated = yearCreated;
    }
    public void setLengthInMinutes (int lengthInMinutes){
        this.lengthInMinutes = yearCreated;
    }
    public void setGenre (String genre){
        this.genre = genre;
    }

   //returnerer et film-objekt som en streng
    //\n betyder at det skal printes på en ny linje
    @Override
    public String toString(){
       String  result = "";
        result += "Titel: " + title + "\n" + "Længde: " + lengthInMinutes + " Minutter: " +
                "\n" + "Director: " + director + "\n" + "Genre: "+ genre + "\n" + "Farvefilm: ";
        if(isInColor){
            result += "Yes";
        } else {
            result += "No";
        }
        return result;
    }
}
