package org.example.terrestrialAnimal;

public class Rabbit implements TerrestrialAnimal{

    @Override
    public int age() {
        return 5;
    }



    @Override
    public String color() {
        return "white";
    }

    @Override
    public String getType() {
        return "rabbit";
    }
}
