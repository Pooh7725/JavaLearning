package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class InPlacereverse {
    //String = "pooja loves mau ;
    //ajoop sevol uam

    public static String reverse (String str){
       String rev = "" ;
       for (int i=str.length()-1;i>=0;i--){
           rev+=str.charAt(i);
       }
       return rev;
    }
    public static String InplaceReverse(String str){
        ArrayList<String>res = new ArrayList<>();
        String split[] = str.split(" ");
        System.out.println(Arrays.toString(split));
        for (int i=0;i<split.length;i++) {
            if (!split[i].isEmpty()){
                res.add(reverse(split[i]));
            }
        }
        return String.join(" ", res);
    }

    public static void main(String[] args) {
        String str = " pooja loves mau";
        String res = InplaceReverse(str);
        System.out.println(res);
    }

}
