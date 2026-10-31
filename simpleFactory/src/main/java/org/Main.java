package org;

import org.LandAnimal.FactoryAnimal;
import org.LandAnimal.MarineAnimal;
import org.MarineAnimal.LandAnimal;
import org.MarineAnimal.SimpleFactoryAnimal;


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


        MarineAnimal dolphin = FactoryAnimal.createAnimal("org.simpleFactory.LandAnimal.Dolphin");
        System.out.println("name: " + dolphin.name());
        System.out.println("color: " + dolphin.color());
        System.out.println("age: " + dolphin.age());
        System.out.println();

        MarineAnimal fish = FactoryAnimal.createAnimal("org.simpleFactory.LandAnimal.Fish");
        System.out.println("name: " + fish.name());
        System.out.println("color: " + fish.color());
        System.out.println("age: " + fish.age());
        System.out.println();

        MarineAnimal shark = FactoryAnimal.createAnimal("org.simpleFactory.LandAnimal.Shark");
        System.out.println("name: " + shark.name());
        System.out.println("color: " + shark.color());
        System.out.println("age: " + shark.age());

    }
}
