package com.sparta.sjt;

import com.sparta.sjt.animals.Animal;
import com.sparta.sjt.animals.Phoenix;
import com.sparta.sjt.animals.SecretPig;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Phoenix fawkes = new Phoenix("Fawkes", 1, 1, 1800, "red");
        Phoenix azure = new Phoenix("Azure", 1, 1, 1822, "azure");
        Phoenix gozer = new Phoenix("Gozer", 1, 1, 1920, "gold");
        SecretPig cornelius = new SecretPig("Cornelius", 1, 1, 2019);
        SecretPig augustine = new SecretPig("Augustine", 5, 2, 2022);
        SecretPig winfred = new SecretPig("Winfred", 10, 3, 2017);

        animals.add(fawkes);
        animals.add(azure);
        animals.add(gozer);
        animals.add(cornelius);
        animals.add(augustine);
        animals.add(winfred);

        for (Animal animal : animals) {
            System.out.println(animal.speak());
            animal.die();
            System.out.println(animal.toString());
        }
    }
}