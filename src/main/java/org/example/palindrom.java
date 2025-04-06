package org.example;

public class palindrom {
    public static boolean IsPalindrom(String str) {
        for(int i=0 ,j=str.length()-1 ;i<(str.length()-1)/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "naman";
        boolean res = IsPalindrom(str);
        System.out.println(res);
    }
}
