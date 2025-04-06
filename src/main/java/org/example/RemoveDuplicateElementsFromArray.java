package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementsFromArray {
    //arr[]int = {2,1,1,2,3,1,4,2,4}
    //res {2,1,3,4}
    public static ArrayList<Integer> removeDuplicate(int[] arr){
        HashSet<Integer> remDup = new HashSet<>();
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {

            if (!remDup.contains(arr[i])) {
                remDup.add(arr[i]);
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 1, 3, 4, 1,4,7,6 };
        ArrayList<Integer>res = removeDuplicate(arr);
        System.out.println(res);
    }
}
