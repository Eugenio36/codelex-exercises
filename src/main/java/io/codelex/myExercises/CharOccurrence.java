package io.codelex.myExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
    public static void main(String[] args) throws IOException {


        Path fileName = Path.of("C:\\Users\\User\\IdeaProjects\\codelex-exercises\\src\\main\\java\\io\\codelex\\fileToRead.txt");

        String str = Files.readString(fileName);

        System.out.println(str);

        System.out.println("=====================");

        Map<Character, Integer> charMap = new HashMap<>();
        char[] strArray = str.toCharArray();

        for (char c : strArray) {

            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        System.out.println(charMap);

    }


}
