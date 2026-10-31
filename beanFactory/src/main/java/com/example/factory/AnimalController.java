package com.example.factory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final TestAnimal testAnimal;
    public AnimalController(TestAnimal testAnimal) {
        this.testAnimal = testAnimal;
    }

    @GetMapping
    public String getAge(){
        Integer dog = testAnimal.getAge("Dog");
        Integer cat = testAnimal.getAge("Cat");
        Integer Bird = testAnimal.getAge("Bird");
        System.out.println("Age Dog is : " + dog);
        System.out.println("Age Cat is : " + cat);
        System.out.println("Age Bird is : " + Bird);

        return "Age Dog is : " + dog + " and Age Cat is : " + cat + " and Age Bird is : " + Bird;
    }
}
