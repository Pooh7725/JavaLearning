package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCharacters
{
    public static ArrayList<Character>DupChar(String str){
        HashSet<Character> res = new HashSet<>();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(map.containsKey(ch)){
               res.add(ch);
            } else {
                map.put(ch, 1);
            }
        }
        ArrayList<Character> res2 = new ArrayList<>();

        map.forEach((key, value) -> {
            if (value > 1) {
                res2.add(key);
            }
        });

        return new ArrayList<>(res);



    }

    public static void main(String[] args) {
        String str = "manoramaa";
        ArrayList<Character>res=DupChar(str);
        System.out.println(res);
    }
}
