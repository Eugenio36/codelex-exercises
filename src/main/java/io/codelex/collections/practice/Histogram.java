package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        String[] scoreList = scores.split(" ");

        StringBuilder score00to09 = new StringBuilder();
        StringBuilder score10to19 = new StringBuilder();
        StringBuilder score20to29 = new StringBuilder();
        StringBuilder score30to39 = new StringBuilder();
        StringBuilder score40to49 = new StringBuilder();
        StringBuilder score50to59 = new StringBuilder();
        StringBuilder score60to69 = new StringBuilder();
        StringBuilder score70to79 = new StringBuilder();
        StringBuilder score80to89 = new StringBuilder();
        StringBuilder score90to99 = new StringBuilder();
        StringBuilder score100 = new StringBuilder();

        for (String score : scoreList) {
            int scoreAsNumber = Integer.parseInt(score);

            if (scoreAsNumber >= 0 && scoreAsNumber <= 9) {
                score00to09.append("*");
            } else if (scoreAsNumber >= 10 && scoreAsNumber <= 19) {
                score10to19.append("*");
            } else if (scoreAsNumber >= 20 && scoreAsNumber <= 29) {
                score20to29.append("*");
            } else if (scoreAsNumber >= 30 && scoreAsNumber <= 39) {
                score30to39.append("*");
            } else if (scoreAsNumber >= 40 && scoreAsNumber <= 49) {
                score40to49.append("*");
            } else if (scoreAsNumber >= 50 && scoreAsNumber <= 59) {
                score50to59.append("*");
            } else if (scoreAsNumber >= 60 && scoreAsNumber <= 69) {
                score60to69.append("*");
            } else if (scoreAsNumber >= 70 && scoreAsNumber <= 79) {
                score70to79.append("*");
            } else if (scoreAsNumber >= 80 && scoreAsNumber <= 89) {
                score80to89.append("*");
            } else if (scoreAsNumber >= 90 && scoreAsNumber <= 99) {
                score90to99.append("*");
            } else if (scoreAsNumber >= 100) {
                score100.append("*");
            }
        }

        System.out.println("00-09: " + score00to09);
        System.out.println("10-19: " + score10to19);
        System.out.println("20-29: " + score20to29);
        System.out.println("30-39: " + score30to39);
        System.out.println("40-49: " + score40to49);
        System.out.println("50-59: " + score50to59);
        System.out.println("60-69: " + score60to69);
        System.out.println("70-79: " + score70to79);
        System.out.println("80-89: " + score80to89);
        System.out.println("90-99: " + score90to99);
        System.out.println("  100: " + score100);

    }

}