package com.daydreamer.www.array;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] numbsort = {1234,234,5,56,75,675234,123};
        Arrays.sort(numbsort);
        System.out.println(Arrays.toString(numbsort));
        Arrays.fill(numbsort,2,4,0);
        System.out.println(numbsort.length);
    }
}
