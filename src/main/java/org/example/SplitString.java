package org.example;

import java.util.ArrayList;

public class SplitString {
    public static ArrayList<String> Split(String str){
        String temp = "";
        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(ch!=' '){
                temp = temp + ch;

            }
            else{
                if(temp!=""){
                result.add(temp);
                temp="";
            }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = " mau  loves jigli ";
        ArrayList<String> result = Split(str);
        System.out.println(result);
    }
}
