package com.daydreamer.www.struct;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("huangyuyi")){
            System.out.println(str+"输入正确！！");
        }else {
            System.out.println("输入错误了哦");
        }

        scanner.close();
    }
}
