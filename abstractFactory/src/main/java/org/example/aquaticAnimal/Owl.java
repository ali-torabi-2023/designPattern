package org.example.aquaticAnimal;

public class Owl implements AerialAnimal {

    @Override
    public int age() {
        return 11;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String getType() {
        return "owl";
    }
}
