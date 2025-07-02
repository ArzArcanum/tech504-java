package com.sparta.sjt.animals;

public class Dodo extends Phoenix {
    public Dodo(String name, int day, int month, int year, String colour) {
        super(name, day, month, year, colour);
    }

    @Override
    public final void die() {
        System.out.println(name + " is as dead as a dodo.");
    }
}
