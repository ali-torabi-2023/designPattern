package org.landAnimal;

public class Fish implements MarineAnimal{
    @Override
    public String name() {
        return "Nemo";
    }

    @Override
    public String color() {
        return "Orange";
    }

    @Override
    public Integer age() {
        return 2;
    }

}
