package com.daydreamer.www.struct;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的分数是多少喔？");
        int str = scanner.nextInt();
        if (str<60){
            System.out.println(str+"快去补考！");
        }else if (str==60){
            System.out.println(str+"危险边缘了喔");
        }else if (60<str&&str<80){
            System.out.println(str+"安全过关");
        }
        else if (str>=80){
            System.out.println(str+"你是真的牛批");
        }
        scanner.close();
    }
}
