package org.example;

import java.util.ArrayList;

public class SentenceReverse {
    public static String RevSen(String str){
        ArrayList<String>res= new ArrayList<>();
        String[] split = str.split(" ");
        for(int i = split.length-1;i>=0;i--){
           res.add(split[i]) ;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "I love mau";
        String res = RevSen(str);
        System.out.println(res);
    }
}
