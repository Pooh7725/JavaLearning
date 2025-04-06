package org.example;

public class ReverseString {
    public static String revString (String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
       return rev;
    }

    public static void main(String[] args) {
        String str = "pooja lovessss mau";
        String res = revString(str);
        System.out.println(res);
    }

}
