package io.codelex.polymorphism.practice.exercise2;


import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();

        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        Firework firework1 = new Firework();
        Firework firework2 = new Firework();

        List<Sound> soundList = new ArrayList<>();
        soundList.add(parrot1);
        soundList.add(parrot2);
        soundList.add(radio1);
        soundList.add(radio2);
        soundList.add(firework1);
        soundList.add(firework2);

        for (Sound s : soundList) {
            s.playSound();
        }

    }
}
