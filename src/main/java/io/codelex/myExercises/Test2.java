package io.codelex.myExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\codelex-exercises\\src\\main\\java\\io\\codelex\\fileToRead.txt"));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArr));

        
        String joining = String.join(" ", stringArr);
        String repl = joining.replace(".", "");
        String[] splitting = repl.split("");
        System.out.println(splitting.length);

    }
}










