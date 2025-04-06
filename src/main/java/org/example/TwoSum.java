package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static boolean veifyIfTwoSum(int target , int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int compliment_num = target-num;
            if(map.containsKey(compliment_num)){
                return true;
            }

                map.put(num,1);

        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr = {7, 12, 13, 14, 0, 15, 1, 2, 11};
        int target= 20;
        boolean res = veifyIfTwoSum(target,arr);
        System.out.println(res);
    }

}
