package org.example;

public class CheckSpecialCharacter {
    public static boolean specialCharacter(String str){
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0'&& ch<='9') ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "pooja???^^123";
        boolean res = specialCharacter(str);
        System.out.println(res);
    }
}
