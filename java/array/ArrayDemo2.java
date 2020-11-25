package com.daydreamer.www.array;
import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
    int[] testarray = {2,1,11,4,5,7,6,8,9,10,11,12,13,14,15};
        int[] sort = sort(testarray);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡sort
    public static int[]  sort(int[] array){
        int temp;
        boolean flag;
        for (int i = 0; i < array.length-1; i++) {
            flag = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array [j+1];
                    array [j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                System.out.println("i="+i+'\t'+"不用排序了");
                break;
            }
        }
        return array;
    }
}
