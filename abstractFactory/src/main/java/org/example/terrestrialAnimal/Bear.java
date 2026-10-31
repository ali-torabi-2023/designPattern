package org.example.terrestrialAnimal;

public class Bear implements TerrestrialAnimal {

    @Override
    public int age() {
        return 3;
    }

    @Override
    public String color() {
        return "brown";
    }

    @Override
    public String getType() {
        return "bear";
    }
}
