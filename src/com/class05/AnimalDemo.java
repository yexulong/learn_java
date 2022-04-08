package com.class05;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        AnimalOperator animalOperator = new AnimalOperator();
        animalOperator.useAnimal(c);
        animalOperator.echoAnimal(c);
    }
}
