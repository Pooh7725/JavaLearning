package org.example;

public class SecondMin
{
    public static int secondMinimun(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            } else if (secondMin>arr[i]&&arr[i]>min) {
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int[]arr = {21, 10, 18, 12, 11};
        int res = secondMinimun(arr);
        System.out.println(res);
    }
}
