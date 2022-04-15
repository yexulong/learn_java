package com.class04;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        /*Student s = new Student();
        System.out.println(s.getAge());

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");
//        String line = sc.nextLine();
        String line = sc.nextLine();
        // 输出结果
        System.out.println("你输入的数据是：" + line);*/
//        byte[] bys = {97, 98};
//        String s1 = new String(bys);
//        System.out.println("s1:" + s1);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.u);
        System.out.println(s1);
        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getName());
        System.out.println(s1.hashCode());
    }
}
