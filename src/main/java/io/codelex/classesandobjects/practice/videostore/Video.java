package io.codelex.classesandobjects.practice.videostore;

public class Video {
    protected String title;
    protected boolean flag = true;
    protected double rating;

    public Video(String title, boolean flag, double rating) {
        this.title = title;
        this.flag = flag;
        this.rating = rating;
    }

    public Video(String title){
        this.title = title;
    }

    public void checkedOut(){
        this.flag = true;
    }

    public void returned() {
        this.flag = false;
    }

    public void receivingRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", flag=" + flag +
                ", rating=" + rating +
                '}';
    }
}
