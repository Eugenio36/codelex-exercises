package io.codelex.classesandobjects.exercise4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13" );
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13" );
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG" );

        Movie[] movies = {movie1, movie2,movie3};

        System.out.println("PG rated movie list: ");
        System.out.println(Arrays.toString(Movie.getPG(movies)));

    }
}
