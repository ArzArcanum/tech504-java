package t08Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MakeFiveSet_Test {

    @ParameterizedTest
    @CsvSource ( {
            "7, '5'",
            "10, '5;10'"
    })
    void givenDivisible_returnSet(int input, String rawExpectedSet) {
        Set<Integer> expectedSet = Arrays.stream(rawExpectedSet.split(";"))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        HashSet<Integer> result = Exercises.makeFiveSet(input);
        Assertions.assertEquals(expectedSet, result);
    }

    @ParameterizedTest
    @CsvSource ( {
            "0",
            "1",
            "6",
    })
    void givenNoneDivisible_returnEmptySet(int input) {
        HashSet<Integer> result = Exercises.makeFiveSet(input);
        if (result.isEmpty())
        {
            Assertions.assertTrue(result.isEmpty());
        }
    }

    @ParameterizedTest
    @CsvSource ( {
            "-10"
    })
    void givenNegativeInput_throwError(int input) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.makeFiveSet(input));
    }

}
