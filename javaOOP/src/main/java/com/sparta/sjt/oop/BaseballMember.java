package com.sparta.sjt.oop;

public class BaseballMember extends Member{
    private String position;
    public BaseballMember(String firstName, String lastName, int day, int month, int year, String position){
        super(firstName, lastName, day, month, year);
    }

    public String getPosition() {
        return position;
    }
}
