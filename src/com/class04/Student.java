package com.class04;

public class Student {
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {

    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private String name;
    public final String u = "1123";

    public void setName(String name) {
        this.name = name;
    }
}
