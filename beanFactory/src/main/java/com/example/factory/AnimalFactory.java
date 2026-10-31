package com.example.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AnimalFactory {
    private final Map<String, AnimalService> animalServiceMap = new HashMap<>();

    @Autowired
    public AnimalFactory(List<AnimalService> animalServiceList) {
        for (AnimalService animalService : animalServiceList) {
            animalServiceMap.put(animalService.getType(), animalService);
        }
    }

    public AnimalService getAnimalService(String type) {
        AnimalService animalService = animalServiceMap.get(type);
        if (animalService == null) {
            throw new IllegalArgumentException("Unknown animalService type: " + type);
        }
        return animalService;
    }
}
