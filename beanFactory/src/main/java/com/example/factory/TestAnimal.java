package com.example.factory;

import org.springframework.stereotype.Component;

@Component
public class TestAnimal {
    private final AnimalFactory animalFactory;

    public TestAnimal(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }



    public Integer getAge(String serviceType){
        AnimalService animalService = animalFactory.getAnimalService(serviceType);
        return animalService.getAge();
    }

}
