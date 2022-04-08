package com.class04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo01 {
    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<>();
//
//        array.forEach(e -> {
//            System.out.println(e);
//        });
//
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        for (int i=0; i<3; i++){
//            addStudent(studentArrayList);
//        }
//
//        studentArrayList.forEach(student -> {
//            System.out.println(student.getAge());
//        });
        TestExtend2 test = new TestExtend2();
        test.test2();
        test.test1();
        test.test();
    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        Student s = new Student();
        s.setAge(age);
        s.setName(name);

        array.add(s);
    }
}
