package org.example;

public class SecondMax {
    public static int secondmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                secondmax = max;
                max = arr[i];

            } else if (arr[i]>secondmax&&arr[i]<max) {
secondmax=arr[i];
            }

            }

        return secondmax;
    }

    public static void main(String[] args) {
        int[]arr= {1, 2, 4, 7, 2, 5};
        int res = secondmax(arr);
        System.out.println(res);
    }
}
