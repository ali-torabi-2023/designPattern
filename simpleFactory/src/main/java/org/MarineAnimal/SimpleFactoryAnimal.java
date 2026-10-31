package org.MarineAnimal;

public class SimpleFactoryAnimal {


    public static LandAnimal createAnimal(String type) {
        if (type == null) throw new NullPointerException("type is null");


        if (type.equals("cat"))
            return new Cat();
        else if (type.equals("dog"))
            return new Dog();
        else if (type.equals("horse"))
            return new Horse();
        else throw new IllegalArgumentException("type is wrong");
    }
}
