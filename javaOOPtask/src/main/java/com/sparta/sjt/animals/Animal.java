package com.sparta.sjt.animals;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected boolean isAlive;
    protected String species;

    public Animal(String name, String species, LocalDate birthDate) {
        this.name = name;
        this.species = species;
        this.birthDate = birthDate;
        this.isAlive = true;
    }

    public Animal(String name, String species, int day, int month, int year) {
        this(name, species, LocalDate.of(year, month, day));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthDate.getYear();
    }

    public abstract String speak();

    public boolean isAlive() {
        return isAlive;
    }

    public void die() {
        if (!isAlive) {
            System.out.println(name + " is already dead.");
        }
        else  {
            System.out.println(speak());
            System.out.println(name + " keels over and dies.");
            isAlive = false;
        }
    }

    @Override
    public String toString() {
        String line1 = isAlive ? "This is " + name + ". " : "This is the corpse of " + name + ". ";
        String line2 = "It is a "  + species + ", ";
        String line3 = "and is " + getAge() + " years old.";

        return line1 + line2 + line3;
    }
}