package io.codelex.myExercises.MyAdvancedFunction;

public class Song {

    private String title;
    private Integer duration;
    private String author;

    public Song(String title, Integer duration, String author) {
        this.title = title;
        this.duration = duration;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", author='" + author + '\'' +
                '}';
    }
}
