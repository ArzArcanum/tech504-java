package tech504Sam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    @Test
    @DisplayName("My first test")
    void firstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("getGreeting, when given 6, returns 'Good morning!")
        void getGreeting_6_good_morning() {
            int time = 6;
            String expected = "Good morning!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

    @Test
    @DisplayName("getGreeting, when given 13, returns 'Good afternoon!")
    void getGreeting_13_good_afternoon() {
        int time = 13;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting, when given 21, returns good evening")
    void getGreeting_21_good_evening() {
        int time = 21;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 18})
    @DisplayName("getGreeting, when given a time of 12 or 18, returns 'Good afternoon!'")
    public void getGreeting_GivenTimeOf13or18_ReturnsGoodAfternoon(int timeOfDay) {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(timeOfDay));
    }
}
