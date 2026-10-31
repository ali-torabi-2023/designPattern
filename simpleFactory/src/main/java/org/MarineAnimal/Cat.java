package org.marineAnimal;

public class Cat implements LandAnimal {

    @Override
    public String name() {
        return "Luna";
    }

    @Override
    public String color() {
        return "Brown";
    }

    @Override
    public Integer age() {
        return 3;
    }
}
