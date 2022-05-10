package io.codelex.TestAdvanced.Exercise4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/io/codelex/TestAdvanced/Exercise4/text.txt");

        FileInputStream inputStream = new FileInputStream(file);

        Scanner sc = new Scanner(inputStream);

        StringBuffer string = new StringBuffer();

        while (sc.hasNext()) {
            string.append(sc.nextLine() + "\n");
        }
        System.out.println(string);

        File dest = new File("src/main/java/io/codelex/TestAdvanced/Exercise4/txet.txt");

        FileWriter fileWriter = new FileWriter(dest);

        StringBuffer reversedString = string.reverse();

        fileWriter.write(String.valueOf(reversedString));

        fileWriter.flush();

    }
}


