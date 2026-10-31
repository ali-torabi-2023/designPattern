package org.example.terrestrialAnimal;

public class Lion implements TerrestrialAnimal {

    @Override
    public int age() {
        return 4;
    }


    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public String getType() {
        return "lion";
    }
}
