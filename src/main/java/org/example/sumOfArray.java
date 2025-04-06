package org.example;

public class sumOfArray {
    public static int ArraysSum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={2, 4, 6, 10};
        int res = ArraysSum(arr);
        System.out.println(res);
    }
}
