package com.daydreamer.www.method;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
    userin();
    }

    public static void userin(){
        System.out.println("请输入计算方式");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            switch (str){
                case "乘法":
                    System.out.println("请输入两个数");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    multiply(x,y);
                    System.out.println();
                    break;
                case "除法":
                    System.out.println("请输入两个数");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    subtract(x,y);
                    break;
                case "加法":
                    System.out.println("请输入两个数");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    add(x,y);
                    break;
                case "减法":
                    System.out.println("请输入两个数");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    divided(x,y);
                break;
                default:
                    System.out.println("请重新选择需要进行的计算方式");
            }
        }
            scanner.close();
        }

    public static void add(int x,int y){
        int num = 0;
        num = x + y;
        System.out.println(num);
    }
    public static void multiply(int x,int y){
        int num = 0;
        num = y * x;
        System.out.println(num);
    }
    public static void divided(int x,int y){
        int num = 0;
        num = x - y;
        System.out.println(num);
    }
    public static void subtract(int x,int y){
        int num = 0;
        num = x / y;
        System.out.println(num);
    }

}
