package com.sparta.sjt.animals;

import java.time.LocalDate;

public class Phoenix extends Animal {
    private final String colour;
    public Phoenix(String name, int day, int month, int year, String colour) {
        super(name, "phoenix", day, month, year);
        this.colour = colour;
    }

    @Override
    public String speak() {
        return "*Ca-Caww*";
    }

    @Override
    public final void die() {
        System.out.println(name + " bursts into a ball of flames. As quickly as it started, the flames burns out and ashes fall to the floor.");
        System.out.println("...");
        System.out.println("From the ashes, a tiny head pokes out, " + name + " is reborn.");
        this.birthDate = LocalDate.now();
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        String line1 = super.toString();
        String line2 = " It has " + colour + " feathers.";
        return line1 + line2;
    }
}
