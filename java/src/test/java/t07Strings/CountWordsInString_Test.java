package t07Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

public class CountWordsInString_Test {

    @ParameterizedTest
    @CsvSource({
            "'Apple Kiwi Banana', a, 1", // Capitalised words
            "'strawberry orange grapefruit', b, 0", // Lowercase words
            "'Peach Pear pineapple', p, 3", // Mixed-case words
            "'Peach  orange   pineapple', p, 2", // Multiple spaces
    })
    void validWordsStrings_lowercaseChar(String words, char letter, int expected) {
        int result = Exercises.countWordsInString(words, letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "'Apple Kiwi Banana', A, 1", // Capitalised words
            "'strawberry orange grapefruit', B, 0", // Lowercase words
            "'Peach Pear pineapple', P, 3", // Mixed-case words
            "'Peach  orange   pineapple', P, 2", // Multiple spaces
    })
    void validWordsStrings_uppercaseChar(String words, char letter, int expected) {
        int result = Exercises.countWordsInString(words, letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource( {
            "'', a, 0",
            "'', A, 0",
    })
    void emptyWordsStrings(String words, char letter, int expected) {
        int result = Exercises.countWordsInString(words, letter);
        Assertions.assertEquals(expected, result);
    }
}
