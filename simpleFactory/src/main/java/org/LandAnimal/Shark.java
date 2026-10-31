package org.LandAnimal;

public class Shark implements MarineAnimal {
    @Override
    public String name() {
        return "Shadow";
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public Integer age() {
        return 7;
    }

    @Override
    public String getClassName() {
        return "org.simpleFactory.LandAnimal.Shark";
    }
}
