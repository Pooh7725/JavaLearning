package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static int[]TwoSum(int []arr, int tagret){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tagret) {
                    return new int[] {i,j};
                }
            }

        }
        return new int[] {};

    }
    public static int[]TwoSumAnotherApproach(int[]arr,int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complimentNum = target - arr[i];
            if(map.containsKey(complimentNum)){
                return new int[]{map.get(complimentNum),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int target = 20;
        int[]arr = {1, 2, 30, 21, 0, 12, 19};
        int[]res = TwoSum(arr,target);
        int[]res1= TwoSumAnotherApproach(arr,target);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));

    }
}
