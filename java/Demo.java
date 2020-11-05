package com.daydreamer.www.base;

public class Demo {
    static short salary;
    static final double PI = 3.14;
    String name = "daydreamer";
    int age = 10;
    char grade = 10;
    String sex = "male";
    public static void main(String[] args) {
        Demo demo01 = new Demo();
        System.out.println(demo01.name);
        System.out.println(demo01.age);
        System.out.println(demo01.sex);
        System.out.println(demo01.grade);
        System.out.println(salary);
        System.out.println(PI);
    }
}
