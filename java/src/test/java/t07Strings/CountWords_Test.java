package t07Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

public class CountWords_Test {

    @ParameterizedTest
    @CsvSource({
            "'Apple;Kiwi;Banana', a, 1",
            "'Strawberry;Orange;Grapefruit', b, 0",
            "'Peach;Pear;Pineapple', p, 3",

            "'apple;kiwi;banana', a, 1",
            "'strawberry;orange;grapefruit', b, 0",
            "'peach;pear;pineapple', p, 3",

            "'Apple;kiwi;Banana', a, 1",
            "'strawberry;orange;Grapefruit', b, 0",
            "'Peach;Pear;pineapple', p, 3",
    })
    void mixedCaseWords_LowercaseChar(String joinedWords, char letter, int expected){
        ArrayList<String> words = new ArrayList<>(List.of(joinedWords.split(";")));

        int result = Exercises.countWords(words, letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "'Apple;Kiwi;Banana', A, 1",
            "'Strawberry;Orange;Grapefruit', B, 0",
            "'Peach;Pear;Pineapple', P, 3",

            "'apple;kiwi;banana', A, 1",
            "'strawberry;orange;grapefruit', B, 0",
            "'peach;pear;pineapple', P, 3",

            "'Apple;Kiwi;banana', A, 1",
            "'Strawberry;orange;Grapefruit', B, 0",
            "'peach;Pear;Pineapple', P, 3",
    })
    void mixedCaseWords_UppercaseChar(String joinedWords, char letter, int expected){
        ArrayList<String> words = new ArrayList<>(List.of(joinedWords.split(";")));

        int result = Exercises.countWords(words, letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource( {
            "A,0"
    })
    void noWords(char letter, int expected){
        ArrayList<String> emptyWords = new ArrayList<>();

        int result = Exercises.countWords(emptyWords, letter);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource( {
            "'Apple;Kiwi;Banana', %, 0",
            "'Apple;Kiwi;Banana', 9, 0",
            "'Apple;Kiwi;Banana', ' ', 0",
            "'Apple;Kiwi;Banana', _, 0",
    })
    void nonLetterChar(String joinedWords, char letter, int expected){
        ArrayList<String> words = new ArrayList<>(List.of(joinedWords.split(";")));

        int result = Exercises.countWords(words, letter);
        Assertions.assertEquals(expected, result);
    }
}
