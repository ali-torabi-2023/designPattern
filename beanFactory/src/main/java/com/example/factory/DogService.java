package com.example.factory;

import org.springframework.stereotype.Service;

@Service
public class DogService implements AnimalService{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public Integer getAge() {
        return 10;
    }
}
