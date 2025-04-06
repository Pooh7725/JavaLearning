package org.example;

import java.util.Arrays;

public class ReverseArray {
    public static void revArray (int[] arr){

//        int [] Arr = {1, 6, 8, 0, 6};
        for(int i=0 ,j=arr.length-1 ;i<arr.length/2;i++,j--){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

    public static void main(String[] args) {
        int[]arr ={12, 16, 9, 0, 6 ,4};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    }


