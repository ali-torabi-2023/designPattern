package com.example.factory;

import org.springframework.stereotype.Service;

@Service
public class CatService implements AnimalService{
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public Integer getAge() {
        return 5;
    }
}
