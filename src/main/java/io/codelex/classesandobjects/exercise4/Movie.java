package io.codelex.classesandobjects.exercise4;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movie) {
        Movie[] pgMovie = new Movie[movie.length];

        int index = 0;

        for (int i = 0; i < movie.length; i ++) {
            if (movie[i].rating.equals("PG")) {
                pgMovie[index] = movie[i];
                index++;
            }
        }
                return pgMovie;
    }

    @Override
    public String toString() {
        return "title: " + title + ", studio: " + studio + ", rating: " + rating;
    }
}
