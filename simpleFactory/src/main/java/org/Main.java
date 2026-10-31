package org;


import org.landAnimal.FactoryAnimal;
import org.landAnimal.MarineAnimal;
import org.marineAnimal.LandAnimal;
import org.marineAnimal.SimpleFactoryAnimal;

public class Main {
    static void main() {

        LandAnimal cat = SimpleFactoryAnimal.createAnimal("cat");
        System.out.println("name: " + cat.name());
        System.out.println("color: " + cat.color());
        System.out.println("age: " + cat.age());
        System.out.println();

        LandAnimal dog = SimpleFactoryAnimal.createAnimal("dog");
        System.out.println("name: " + dog.name());
        System.out.println("color: " + dog.color());
        System.out.println("age: " + dog.age());
        System.out.println();

        LandAnimal horse = SimpleFactoryAnimal.createAnimal("horse");
        System.out.println("name: " + horse.name());
        System.out.println("color: " + horse.color());
        System.out.println("age: " + horse.age());
        System.out.println();


        MarineAnimal dolphin = FactoryAnimal.createAnimal("dolphin");
        System.out.println("name: " + dolphin.name());
        System.out.println("color: " + dolphin.color());
        System.out.println("age: " + dolphin.age());
        System.out.println();

        MarineAnimal fish = FactoryAnimal.createAnimal("fish");
        System.out.println("name: " + fish.name());
        System.out.println("color: " + fish.color());
        System.out.println("age: " + fish.age());
        System.out.println();

        MarineAnimal shark = FactoryAnimal.createAnimal("shark");
        System.out.println("name: " + shark.name());
        System.out.println("color: " + shark.color());
        System.out.println("age: " + shark.age());

    }
}
