package t07Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TransString_Test {

    @ParameterizedTest
    @CsvSource ({
            "'  Cathy', 10, 'CATHY0123456789'",
            "'', 4, 0123",
            "' Piano  ', 12, 'PIANO01234567891011'",
    })
    void providedInputTest(String sInput, int iInput, String expected){
        String result = Exercises.transString(sInput, iInput);
        Assertions.assertEquals(expected, result);
    }
}
