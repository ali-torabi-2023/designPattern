package com.example.factory;

import org.springframework.stereotype.Service;

@Service
public class BirdService implements AnimalService{
    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public Integer getAge() {
        return 6;
    }
}
