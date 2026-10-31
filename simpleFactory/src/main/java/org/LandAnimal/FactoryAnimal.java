package org.landAnimal;

import java.util.HashMap;
import java.util.Map;

public class FactoryAnimal {

    private static final Map<String, MarineAnimal> marineAnimals = new HashMap<>();

    static {
        marineAnimals.put("dolphin", new Dolphin());
        marineAnimals.put("fish", new Fish());
        marineAnimals.put("shark", new Shark());
    }

    public static MarineAnimal createAnimal(String animalName) {
        if (animalName == null || animalName.isEmpty()) {
            throw new IllegalArgumentException("animalName cannot be null or empty");
        }
        MarineAnimal marineAnimal = marineAnimals.get(animalName);
        if (marineAnimal == null) {
            throw new IllegalArgumentException("animalName " + animalName + " does not exist");
        }
        return marineAnimal;
    }
}
