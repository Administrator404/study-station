package com.daydreamer.www.scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m=0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            sum = sum+x;
            m = m+1;

        }
        System.out.println("输入的数字一共有"+m+"个"+"，和为"+sum+"平均值是："+(sum/m));
        scanner.close();
    }
}
