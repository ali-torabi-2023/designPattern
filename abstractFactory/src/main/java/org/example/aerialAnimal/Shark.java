package org.example.aerialAnimal;

public class Shark implements AquaticAnimal {
    @Override
    public int age() {
        return 60;
    }

    @Override
    public String color() {
        return "white";
    }

    @Override
    public String getType() {
        return "Shark";
    }
}
