package io.codelex.myExercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AuthorTest {

    @Test
    void testToString() {
        // GIVEN
        Author author = new Author("John", "Petrov", LocalDate.now());
        String expectedToStringResult = "Author{firstName='John', lastName='Petrov', dateOfBirth=2022-03-23, book='[]'}";


        //WHEN
        String actualResult = author.toString();

        //THEN
        Assertions.assertEquals(expectedToStringResult, actualResult);

    }


}
