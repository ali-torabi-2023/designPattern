package org.LandAnimal;

public class FactoryAnimal {


    public static MarineAnimal createAnimal(String animalName){

        try {
            return (MarineAnimal) Class.forName(animalName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
