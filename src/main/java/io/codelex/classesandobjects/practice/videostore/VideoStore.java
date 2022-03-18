package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    protected ArrayList<Video> list;

    //list the whole inventory of videos in the store.
    public VideoStore() {
        list = new ArrayList<>();
    }

    // add a new video (by title) to the inventory;
    public void addVideo(String name) {
        list.add(new Video(name));
    }

    //check out a video (by title);
    public void checkOut(String name) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i).getTitle().equals(name)) {
                list.get(i).isCheckedOut();
            }
        }
    }

    //return a video to the store;
    public void returnVideo(String name) {
        for (int j = 0; j < list.toArray().length; j++) {
            if (list.get(j).getTitle().equals(name)) {
                list.get(j).isReturned();
            }
        }
    }

    //take a user's rating for a video;
    public void userRating(String name, int rating) {
        for (int k = 0; k < list.toArray().length; k++) {
            if (list.get(k).getTitle().equals(name)) {
                list.get(k).getUserRating(rating);
            }
        }
    }

    @Override
    public String toString() {
        return "VideoStore Movie List: " + list;
    }
}
