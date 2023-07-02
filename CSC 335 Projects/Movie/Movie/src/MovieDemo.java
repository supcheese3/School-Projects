/**
 * Name: Nathan Williamson
 * Date: 10/31/2021
 * Assignment: MovieDemo.java
 * 
 * Purpose (Class Description): To make a program that displays info of a movie. 
 */
import java.util.Scanner;

public class MovieDemo { 
        public static void main(String[] args){
        Movie [] movieObjects = new Movie[3];
        //Fills the movie object with the information 
        for (int i = 0; i < movieObjects.length; i++){
            movieObjects[i] = new Movie(movieTitle(), movieDirector(), movieReleaseYear(), movieRunTimeInMinutes(), movieRating());
        }
        
        displayMovies(movieObjects);
    }
    //Movie title method
    static String movieTitle(){
        Scanner input = new Scanner(System.in);
        String title;
        System.out.println("Enter the Movie title: ");
        title = input.nextLine();
        input.close();
        return title;
        
    }
    //Movie Director method
    static String movieDirector(){
        Scanner input = new Scanner(System.in);
        String director;
        System.out.println("Enter the Movie director: ");
        director = input.nextLine();
        input.close();
        return director;
    }
    //Movie Release Year method
    static int movieReleaseYear(){
        Scanner input = new Scanner(System.in);
        int releaseYear;
        System.out.println("Enter the Movie release year: ");
        releaseYear = input.nextInt();
        input.close();
        return releaseYear;
    }
    //Movie Runtime method
    static int movieRunTimeInMinutes(){
        Scanner input = new Scanner(System.in);
        int runTime;
        System.out.println("Enter the Movie runtime in minutes: ");
        runTime = input.nextInt();
        //loops until runtime is above 0
        while(runTime <= 0){
                System.out.println("Is the movie less than 0 minutes? ");
                runTime = input.nextInt();
            }
            input.close();
            return runTime;
    }
    //Movie Rating method
    static int movieRating(){
        Scanner input = new Scanner(System.in);
        int rating;
        System.out.println("Enter the Movie rating:\n");
        System.out.println("(1) G\n(2) PG\n(3) PG-13\n(4) R\n(5) NC-17");
        rating = input.nextInt();
        //loops until rating is between 1-5
            while(rating < 1 || rating > 5){
                System.out.println("Enter the Movie rating:\n");
                System.out.println("(1) G\n(2) PG\n(3) PG-13\n(4) R\n(5) NC-17");
                rating = input.nextInt();
            }
        input.close();
        return rating;
    }
    //Movie display method
    static void displayMovies(Movie[] movieObjects){
        //displays all the movie details
        for(int i = 0; i < movieObjects.length; i++){
            System.out.println("\nMovie title: " + movieObjects[i].getMovieTitle());
            System.out.println("Movie director: " + movieObjects[i].getMovieDirector());
            System.out.println("Movie release year: " + movieObjects[i].getMovieReleaseYear());
            System.out.println("Movie runtime (minutes): " + movieObjects[i].getMovieRunTimeInMinutes());
            System.out.println("Movie rating: " + movieObjects[i].getRatingAsString());
            System.out.println("-------------------------\n");
        }
    }
}