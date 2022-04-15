package com.class04;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(u, student.u);
    }

}
