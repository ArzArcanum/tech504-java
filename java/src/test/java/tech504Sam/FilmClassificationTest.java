package tech504Sam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 6, 11})
    @DisplayName("getClassesByAge, when given an age of 1, 6, or 11, returns 'U and PG films are available.'")
    public void getClassesByAge_GivenAgeOf1or6or11_ReturnsUAndPG(int age) {
        String expected = "U and PG films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("getClassesByAge, when given an age of 12, 13, or 14, returns 'U, PG, 12, and 12A films are available.'")
    public void getClassesByAge_GivenAgeOf12or13or14_ReturnsUAndPGAnd12And12A(int age) {
        String expected = "U, PG, 12, and 12A films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("getClassesByAge, when given an age of 15, 16, or 17, returns 'U, PG, 12, 12A, and 15 films are available.'")
    public void getClassesByAge_GivenAgeOf15or16or17_ReturnsUAndPGAnd12And12AAnd15(int age) {
        String expected = "U, PG, 12, 12A, and 15 films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 45, 999})
    @DisplayName("getClassesByAge, when given an age of 18, 45, or 999, returns 'All films are available.'")
    public void getClassesByAge_GivenAgeOf15or16or17_ReturnsAll(int age) {
        String expected = "All films are available.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-9999, -1, 0, 1000, 9999})
    @DisplayName("getClassesByAge, when given an age of -9999, -1, 0, 1000, or 9999, returns 'Error: Please enter a valid age.'")
    public void getClassesByAge_GivenAgeOfMinus9999orMinus1or0or1000or9999_ReturnsError(int age) {
        String expected = "Error: Please enter a valid age.";
        String actual = FilmClassification.getClassificationsByAge(age);
        Assertions.assertEquals(expected, actual);
    }
}
