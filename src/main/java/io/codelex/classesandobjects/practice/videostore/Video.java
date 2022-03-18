package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean isInStock;
    private double userRating;


    public Video(String title, boolean flag, int userRating) {
        this.title = title;
        this.isInStock = flag;
        this.userRating = userRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void getUserRating(int rating) {
        this.userRating = rating;
    }

    public void isCheckedOut() {
        this.isInStock = true;
    }

    public void isReturned() {
        this.isInStock = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title = '" + title + '\'' +
                ", rented = " + isInStock +
                ", userRating = " + userRating +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }

    public void setInStock(boolean inStock) {
        this.isInStock = inStock;
    }


}