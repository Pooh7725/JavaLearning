package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class InPlacereverse {
    public static String InplaceRev(String str){
        ArrayList<String>list = new ArrayList<>();
        String[]split = str.split(" ");
        for(int i=0;i<split.length;i++){
            list.add(reverse(split[i]));
        }
        return String.join(" ",list);
    }
    public static String reverse(String str){
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "gili mili foo";
        String res = InplaceRev(str);
        System.out.println(res);
    }
}
