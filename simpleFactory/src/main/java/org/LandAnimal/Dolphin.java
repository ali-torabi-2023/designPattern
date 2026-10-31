package org.landAnimal;


public class Dolphin implements MarineAnimal {
    @Override
    public String name() {
        return "Flipper";
    }

    @Override
    public String color() {
        return "Gray";
    }

    @Override
    public Integer age() {
        return 5;
    }

}
