package io.codelex.myExercises;

public class Date {
    public static void main(String[] args) {
        String duration = "13:05";
        int hours = Integer.parseInt(duration.substring(0, 2));
        int minutes = Integer.parseInt(duration.substring(3, 5));

        System.out.println(hours * 60 + minutes);


    }
}
