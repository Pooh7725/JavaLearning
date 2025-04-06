package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckUniqueCharacterUsinghashmap
{
    public static ArrayList<Character> checkunique(String str1, String str2){
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> Ulist=new ArrayList<>();

        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                int value = map.get(str1.charAt(i));
                map.put(str1.charAt(i),value+1);
            }
            else{
                map.put(str1.charAt(i),1);
            }
        }

        for(int i = 0; i < str2.length(); i++) {
            if (!map.containsKey(str2.charAt(i))) {
                Ulist.add(str2.charAt(i));
            }
        }
        return Ulist;
    }

    public static void main(String[] args) {
        String str1 = "harry";
        String str2 = "pooja";
        System.out.println(checkunique(str1, str2));
    }
}
