/**
 * Name: Nathan Williamson
 * Date: 10/29/2021
 * Assignment: Movie.java
 * 
 * Purpose (Class Description): Its to get and set the Movie information 
 */

public class Movie { 

    private static final String[] MOVIE_RATING = {
        "G", "PG", "PG-13", "R", "NC-17"};
    
    private String movieTitle;
    private String movieDirector;
    private int movieReleaseYear;
    private int movieRunTimeInMinutes;
    private int movieRating;
    //Default constructor
    public Movie(){
        movieTitle = "";
        movieDirector = "";
        movieReleaseYear = 0;
        movieRunTimeInMinutes = 0;
        movieRating = 0;
    }
    //Constructor with the instance variables
    public Movie(String movieTitle,String movieDirector,int movieReleaseYear,int movieRunTimeInMinutes, int movieRating){
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
        this.movieReleaseYear = movieReleaseYear;
        this.movieRunTimeInMinutes = movieRunTimeInMinutes;
        this.movieRating = movieRating;
    }
    //Setter methods
    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }

    public void setMovieDirector(String movieDirector){
        this.movieDirector = movieDirector;
    }

    public void setMovieReleaseYear(int movieReleaseYear){
        this.movieReleaseYear = movieReleaseYear;
    }

    public void setMovieRunTimeInMinutes(int movieRunTimeInMinutes){
        this.movieRunTimeInMinutes = movieRunTimeInMinutes;
    }
   
    public void setMovieRating(int movieRating){
        this.movieRating = movieRating;
    }
    //Getter methods
    public String getMovieTitle(){
        return movieTitle;
    }

    public String getMovieDirector(){
        return movieDirector;
    }

    public int getMovieReleaseYear(){
        return movieReleaseYear;
    }

    public int getMovieRunTimeInMinutes(){
        return movieRunTimeInMinutes;
    }
    //Sets rating
    public void setRating(int movieRating){
        if(movieRating < MOVIE_RATING.length
           || movieRating > MOVIE_RATING.length){
            movieRating = -1;
        } else {
            this.movieRating = movieRating;
        }
    }
    //gets Rating as a string
    public String getRatingAsString(){
        if(movieRating == -1){
            return "Not yet rated";
        } else {
            return MOVIE_RATING[movieRating-1];
        } 
    }
        
}