package io.codelex.TestAdvanced.Exercise3;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Joiner {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final <T> String join(T... value) {
        return Arrays.stream(value).map(Objects::toString).collect(Collectors.joining(separator));
    }
}


