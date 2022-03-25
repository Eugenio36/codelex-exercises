package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        List<String> lines = Files.readAllLines(path, charset);
        String correctResult = String.join("", lines);

        System.out.println("Lines: " + lines.size());

        String words = String.valueOf(Files.readAllLines(path, charset))
                .replaceAll("'", " ")
                .replaceAll("\\s{2,}", " ");
        String[] str = words.split(" ");
        System.out.println("Words: " + str.length);

        System.out.println("Chars: " + correctResult.length());

    }
}