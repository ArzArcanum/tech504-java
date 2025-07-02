package com.sparta.sjt.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member {
    private String firstName;
    private String lastName;
    private LocalDate joinDate;

    public Member(String firstName, String lastName, LocalDate joinDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
    }

    public Member(String firstName, String lastName, int day, int month, int year) {
        this(firstName, lastName, LocalDate.of(day, month, year));
    }
    public LocalDate getJoinDate() {
        return joinDate;
    }



    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public long getMemberDays() {
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }
}
