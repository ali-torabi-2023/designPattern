package org.marineAnimal;

public class Dog implements LandAnimal {

    @Override
    public String name() {
        return "Rex";
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public Integer age() {
        return 5;
    }
}