package week14;

public final class Movie {

    private String title ;
    private int rating;
    private int minutes;
    private int year;


    public Movie(String title, int rating, int minutes, int year) {
        this.title = title;
        this.rating = rating;
        this.minutes = minutes;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", minutes=" + minutes +
                ", year=" + year +
                '}';
    }
}
