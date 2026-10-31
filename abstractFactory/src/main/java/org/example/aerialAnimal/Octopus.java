package org.example.aerialAnimal;

public class Octopus implements AquaticAnimal {
    @Override
    public int age() {
        return 3;
    }

    @Override
    public String color() {
        return "purple";
    }

    @Override
    public String getType() {
        return "Octopus";
    }
}
