package com.daydreamer.www.scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // 创建一个扫描器对象用于接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方法进行接收:");
        if (scanner.hasNext()){
            String str= scanner.next();
            System.out.println("输入的内容为:"+str);
        }
        // 凡是属于IO流的类如果不关闭会一直占用系统资源用完要关掉。
        scanner.close();
    }
}
