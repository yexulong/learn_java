package com.class04;

public class TestExtend {
    TestExtend(){

    }
    public final void test(){
        System.out.println("test");
    }
}

class TestExtend1 extends TestExtend{
    TestExtend1(){

    }

    public void test1() {
        System.out.println("test1");
    }
}

class TestExtend2 extends TestExtend1{
    TestExtend2(){

    }

    public void test2() {
        System.out.println("test2");
    }
}
