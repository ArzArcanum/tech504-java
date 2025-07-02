package t06Operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
	// write unit test(s) for myMethod here
    @ParameterizedTest
    @CsvSource ({
        "10, 5",
        "-7, 7",
        "10, -1",
        "0, 3",
    })
    @DisplayName("Given num1 is a multiple of num2 and isn't num2, return true")
    public void givenMultipleOfNum2_MyMethod_ReturnsTrue(int num1, int num2) {
        Assertions.assertTrue(Exercises.myMethod(num1, num2));
    }

    @ParameterizedTest
    @CsvSource ({
        "-2, 3",
        "2, 3",

    })
    @DisplayName("Given num1 is not a multiple of num2, return false")
    public void givenNotMultipleOfNum2_MyMethod_ReturnsFalse(int num1, int num2) {
        Assertions.assertFalse(Exercises.myMethod(num1, num2));
    }

    @Test
    @DisplayName("Given num1 is equal to num2, return false")
    public void givenEqualToNum2_MyMethod_ReturnsFalse() {
        Assertions.assertFalse(Exercises.myMethod(1, 1));
    }

    @Test
    @DisplayName("Given num1 is not 0 AND num2 is 0, throw error: ArithmeticException")
    public void givenNum2IsZero_MyMethod_ThrowsArithmeticException() {
        Assertions.assertThrows(ArithmeticException.class, () -> Exercises.myMethod(1, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 0, 2, 348})
    @DisplayName("Given an even number, evenOdd returns true")
    public void givenAnEvenNumber_EvenOdd_ReturnsTrue(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {-3, -1, 1, 347})
    @DisplayName("Given an odd number, evenOdd returns false")
    public void givenAnOddNumber_EvenOdd_ReturnsFalse(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertFalse(result);
    }

	@ParameterizedTest
    @CsvSource( {"3, 4, 13",
                  "-3, 5, -14",
                  "0, 5, 1"})
    @DisplayName("anotherMethod should return correct result")
    public void anotherMethodTest(int x, int y, int expResult){
        var result = Exercises.anotherMethod(x, y);
        Assertions.assertEquals(expResult, result);
    }


    @ParameterizedTest
    @CsvSource( {"I would like a pony, Doesn't start with H",
            "Help, Starts with H",
            "hello, Starts with H"})
    @DisplayName("StringMethod should return correct result")
    public void stringMethodTest(String phrase, String expResult){
        var result = Exercises.stringMethod(phrase);
        Assertions.assertEquals(expResult, result);
    }

    @Test
    @DisplayName("StringMethod should always return correct result")
    public void stringMethodTest(){
        var result = Exercises.stringMethod(null);
        Assertions.assertEquals("Doesn't start with H", result);
    }

//    @ParameterizedTest
//    @CsvSource( {
//            "4, 10",
//            "5, 15",
//            "6, 21",
//    })
//    @DisplayName()
}
