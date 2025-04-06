package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {
    public static int[]sortArray(int[] arr){
        int temp=0;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }}
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={9,8,1,9,5,2};
        int res[] = sortArray(arr);
        System.out.println(Arrays.toString(Arrays.stream(res).toArray()));
    }
}
