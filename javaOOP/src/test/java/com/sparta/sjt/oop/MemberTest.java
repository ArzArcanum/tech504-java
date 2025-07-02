package com.sparta.sjt.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    @DisplayName("Given valid details,")
    public void checkGetFullName(){
        Member test = new Member("John", "Smith", 1920, 2, 5);
        Assertions.assertTrue(test.getFullName().equals("John Smith"));
    }
}
