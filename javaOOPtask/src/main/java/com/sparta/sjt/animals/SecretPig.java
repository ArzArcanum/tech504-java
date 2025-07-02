package com.sparta.sjt.animals;

public class SecretPig extends Animal {
    public SecretPig(String name, int day, int month, int year){
        super(name, "suspicious looking cow", day, month, year);
    }

    @Override
    public String speak() {
        return "Oink- I mean- Moo!";
    }
}
