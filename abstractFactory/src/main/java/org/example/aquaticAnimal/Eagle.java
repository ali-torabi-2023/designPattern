package org.example.aquaticAnimal;

public class Eagle implements AerialAnimal {

    @Override
    public int age() {
        return 8;
    }

    @Override
    public String color() {
        return "white";
    }

    @Override
    public String getType() {
        return "eagle";
    }
}
