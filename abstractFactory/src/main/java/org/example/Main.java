package org.example;
public class Main {
    public static void main(String[] args) {
        Animal lion = AnimalFactory.createClassWithFactory("terrestrial", "lion");
        System.out.println("animal: " + lion.getType());
        System.out.println("age:"+lion.age());
        System.out.println("color:"+lion.color());

        Animal bear = AnimalFactory.getAnimal("bear");
        System.out.println();
        System.out.println("animal: " + bear.getType());
        System.out.println("age:"+bear.age());
        System.out.println("color:"+bear.color());
    }
}