package org.example;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class notDuplicate {
    public static ArrayList<Character>NotDup(String str){
        ArrayList<Character>list =new ArrayList<>();
        HashMap<Character, Integer>map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch,value+1);
            }
            else{
                map.put(ch,1);
            }
        }
        map.forEach((key, value) -> {
            if(value>1){
                list.add(key);
            }
        });
        return list;
    }

    public static void main(String[] args) {
        String str = "pooja saini is cute";
        ArrayList<Character> res = NotDup(str);
        System.out.println(res);
    }
}
