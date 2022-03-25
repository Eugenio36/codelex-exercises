package io.codelex.myExercises.MyAdvancedFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SongMain {
    public static void main(String[] args) {
        Song firstSong = new Song("Heyyy", 120, "Mike");
        Song secondSong = new Song("Oljalja", 120, "John");
        Song thirdSong = new Song("MyiHa", 130, "Boris");

        List<Song> songList = new ArrayList<>();
        songList.add(firstSong);
        songList.add(secondSong);
        songList.add(thirdSong);

        List<String> songTitles = songList.stream()
                .map(Song::getTitle)
                .map(String::toUpperCase)
                .map((String title) -> "===" + title + "===")
                .toList();
        System.out.println(songTitles);

        songTitles.forEach(System.out::println);

        Map<Integer, List<Song>> songsByDuration = songList.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(songsByDuration);


    }


}
