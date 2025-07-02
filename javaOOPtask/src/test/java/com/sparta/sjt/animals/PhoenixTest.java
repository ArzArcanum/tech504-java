package com.sparta.sjt.animals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PhoenixTest {
    static Stream<Phoenix> phoenixProvider() {
        return Stream.of(
                new Phoenix("Fawkes", 1, 1, 1800, "red"),
                new Phoenix("Azure", 1, 1, 1822, "azure"),
                new Phoenix("Gozer", 1, 1, 1920, "gold")
        );
    }

    @ParameterizedTest
    @MethodSource("phoenixProvider")
    void givenPhoenixDies_CheckIsAlive_ReturnsTrue(Phoenix phoenix) {
        phoenix.die();
        Assertions.assertTrue(phoenix.isAlive());
    }

    @ParameterizedTest
    @MethodSource("phoenixProvider")
    void givenPhoenixDies_CheckAge_ReturnsZero(Phoenix phoenix) {
        phoenix.die();
        Assertions.assertEquals(0, phoenix.getAge());
    }
}
