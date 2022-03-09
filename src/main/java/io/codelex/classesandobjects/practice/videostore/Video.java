package io.codelex.classesandobjects.practice.videostore;

public class Video {
    protected String title;
    protected boolean flag;
    protected double userRating;


    public Video(String title, boolean flag, int userRating) {
        this.title = title;
        this.flag = flag;
        this.userRating = userRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void getUserRating(int rating) {
        this.userRating = rating;
    }

    public void isCheckedOut() {
        this.flag = true;
    }

    public void isReturned() {
        this.flag = false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title = '" + title + '\'' +
                ", rented = " + flag +
                ", userRating = " + userRating +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


}