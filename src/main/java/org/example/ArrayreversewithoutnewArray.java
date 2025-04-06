package org.example;

import java.util.Arrays;

public class ArrayreversewithoutnewArray {
    public static int[]ReverseArray(int[]arr){
        for(int i=0 ,j=arr.length-1;i <= (arr.length-1)/2;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr={1,4, 3, 6, 7};
        int[]rev = ReverseArray(arr);
        System.out.println(Arrays.toString(rev));
    }
}
