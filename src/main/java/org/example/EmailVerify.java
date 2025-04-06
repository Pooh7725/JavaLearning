package org.example;

import java.util.Arrays;

public class EmailVerify {
    public static boolean isAlphanumeric(Character ch){
        return ((ch>='a'&& ch<='z')|| (ch>='A' && ch<='Z')|| (ch>='0' && ch<='9'));
    }

    public static boolean verifyEmail(String email){
        String[] seperateByAt = email.split("@");
        System.out.println(Arrays.toString(seperateByAt));
        if(seperateByAt.length!=2){
            return false;
        }
        String username = seperateByAt[0];
        String domain = seperateByAt[1];

        String[] seperateByDot = domain.split("\\.")  ;
        System.out.println(Arrays.toString(seperateByDot));
        if(seperateByDot.length!=2){
            return false;
        }

        String domainName = seperateByDot[0];


        for(int i=0 ;i<username.length();i++){
            if(!isAlphanumeric(username.charAt(i))){
                return false;
            }
        }
        for(int i=0 ;i<domainName.length();i++){
            if(!isAlphanumeric(domainName.charAt(i))){
                return false;
            }
        }
        System.out.println("till here correct");
        if(!seperateByDot[1].equals("com")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String Email = "pooja7725saini@gmail.com";
        boolean res = verifyEmail(Email);
        System.out.println(res);
    }

}
