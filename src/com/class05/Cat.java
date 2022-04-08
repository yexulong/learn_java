package com.class05;

public class Cat extends Animal{

    public Cat(){
        this.age = 40;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

//    @Override
//    public int getAge() {
//        return this.age;
//    }
}
