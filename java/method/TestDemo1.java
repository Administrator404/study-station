package com.daydreamer.www.method;

public class TestDemo1 {
    public static void main(String[] args) {
    int max = max(3,2);
        System.out.println(max);
    }
    public static int max(int num1,int num2){
        int result = 0;
        if(num1>num2){
            result = num1;
        }
        return result;
    }
}
