package t03ControlFlow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource (ints = {-1, 1000})
    @DisplayName( "Testing ticket types with invalid ages")
    public void TicketTypeInvalidTest(int age) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.ticketType(age));
    }

    // write unit tests for the 'Grade' method here
    @ParameterizedTest
    @CsvSource( {
            "100, Pass with Distinction",
            "80, Pass with Distinction",
            "75, Pass with Distinction",
            "74, Pass with Merit",
            "70, Pass with Merit",
            "60, Pass with Merit",
            "59, Pass",
            "50, Pass",
            "40, Pass",
            "39, Fail",
            "20, Fail",
            "0, Fail",
    })
    @DisplayName("Testing grade type by score")
    public void gradeTest(int score, String expected)
    {
        var result = Exercises.grade(score);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 101})
    @DisplayName("Testing grade type with invalid scores")
    public void gradeInvalidTest(int score) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Exercises.grade(score));
    }

    // write unit tests for the Scottish wedding example here
    @ParameterizedTest
    @CsvSource ( {
            "4, 20",
            "3, 50",
            "2, 50",
            "1, 100",
            "0, 200",
    } )
    @DisplayName("Testing Scottish wedding max attendee number by COVID level")
    public void getScottishMaxWeddingNumberTest(int covidLevel, int expected) {
        var result = Exercises.getScottishMaxWeddingNumber(covidLevel);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 5})
    @DisplayName("Testing Scottish wedding max attendee number with invalid input")
    public void getScottishMaxWeddingNumberInvalidTest(int covidLevel) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Exercises.getScottishMaxWeddingNumber(covidLevel);
        });
    }
}
