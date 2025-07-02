package com.sparta.sjt.animals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SecretPigTest {
    static Stream<SecretPig> secretPigProvider() {
        return Stream.of(
                new SecretPig("Cornelius", 1, 1, 2019),
                new SecretPig("Augustine", 5, 2, 2022),
                new SecretPig("Winfred", 10, 3, 2017)
        );
    }

    @ParameterizedTest
    @MethodSource("secretPigProvider")
    void givenSecretPigDies_CheckIsAlive_ReturnsFalse(SecretPig secretPig) {
        secretPig.die();
        Assertions.assertFalse(secretPig.isAlive());
    }

}
