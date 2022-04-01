package io.codelex.TestAdvanced.Exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Exercise4 {

    private static final String PATH_TO_APP = "C:\\Users\\User\\IdeaProjects\\codelex-exercises\\src\\main\\java\\io\\codelex\\TestAdvanced\\Exercise4";

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(PATH_TO_APP + "4esicrexe");
        Files.createFile(path);
        Files.write(path, "First line of the string. ".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "Second line of the string. ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "Third line of the string. ".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
    }

}
