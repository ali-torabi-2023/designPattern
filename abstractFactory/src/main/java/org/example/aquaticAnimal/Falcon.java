package org.example.aquaticAnimal;

public class Falcon implements AerialAnimal {

    @Override
    public int age() {
        return 1;
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public String getType() {
        return "falcon";
    }
}