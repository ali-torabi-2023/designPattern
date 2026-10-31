package org.example.aerialAnimal;

public class Dolphin implements AquaticAnimal {
    @Override
    public int age() {
        return 20;
    }

    @Override
    public String color() {
        return "white";
    }

    @Override
    public String getType() {
        return "Dolphin";
    }
}
