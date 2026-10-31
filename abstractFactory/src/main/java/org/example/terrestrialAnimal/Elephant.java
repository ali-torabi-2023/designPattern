package org.example.terrestrialAnimal;

public class Elephant implements TerrestrialAnimal{

    @Override
    public int age() {
        return 25;
    }


    @Override
    public String color() {
        return "black";
    }

    @Override
    public String getType() {
        return "elephant";
    }
}
