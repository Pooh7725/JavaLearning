package org.example;

public class maxNum {
    public static int maxNum(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr={12, 78, 120,2,1, 5};
        int res= maxNum(arr);
        System.out.println(res);
    }

}
