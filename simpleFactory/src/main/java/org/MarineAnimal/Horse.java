package org.marineAnimal;

public class Horse implements LandAnimal {

    @Override
    public String name() {
        return "Spirit";
    }

    @Override
    public String color() {
        return "Gray";
    }

    @Override
    public Integer age() {
        return 7;
    }
}