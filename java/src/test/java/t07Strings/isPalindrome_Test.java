package t07Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class isPalindrome_Test {

    @ParameterizedTest
    @CsvSource({
        "oroboro",
        "Abba",
        "rAcecar",
        "tooT",
        "f",
    })
    void mixedCase_validPalindrome_returnTrue(String input) {
        Assertions.assertTrue(Exercises.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({
            "oroboo",
            "Abbaa",
            "rrAcecar",
            "tatooT",
    })
    void mixedCase_invalidPalindrome_returnFalse(String input) {
        Assertions.assertFalse(Exercises.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({
            "''",
    })
    void no_input_invalidPalindrome_returnFalse(String input) {
        Assertions.assertFalse(Exercises.isPalindrome(input));
    }

}
