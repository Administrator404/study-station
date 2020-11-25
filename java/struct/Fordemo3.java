package com.daydreamer.www.struct;

public class Fordemo3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int m = 1; m <=i; m++) {
                System.out.print(m+"*"+i+"="+(i*m)+"\t");
                if (i==m){
                    System.out.println();
                }
            }
        }
    }
}
