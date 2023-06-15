package week14;

import java.util.ArrayList;

public class Cinema implements PlayMovie{



    String location;
    int numberOfTheaters;
    ArrayList<Movie> movies;


    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);
    }

    @Override
    public void playMovie(Movie movie) {

        System.out.println(movie.getTitle() + " starting, please grab your popcorn and turn your phones off");
    }


    public void buyTicket(Movie movie){
        int cost = 0;
        switch (movie.getRating()){
            case 5:
                cost = 25;
                break;
            case 3:
            case 4:
                cost = 20;
                break;
            default:
                cost = 15;
        }
        System.out.println(movie.getTitle() + " costs $" + cost);
    }


    @Override
    public String toString() {
        return "Location: " + location + " has " + numberOfTheaters + " theaters\nMovies available: " + movies;
    }
}
