package com.daydreamer.www.base;
import com.daydreamer.www.base.Demo;
public class Operating {
    public static void main(String[] args) {
        int a = 11;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = a%2;
        int f = a++;
        int g = a;
        int h = ++a;
        String i = a<60 ? "及格":"不及格";
        System.out.println();
        System.out.println(2<<3);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(Demo.PI);
    }
}
