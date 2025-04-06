package org.example;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CharsCommonInBothString {
    public static HashSet<Character> ComonChars(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            Character ch1 = str1.charAt(i);
            if (map.containsKey(ch1)) {
                int value1 = map.get(ch1);
                map.put(ch1, value1 + 1);
            } else {
                map.put(ch1, 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                set.add(str2.charAt(i));
            }
        }
        return set;
    }

    public static void main(String[] args) {
        String str1= "pooja";
        String str2= "naman";
        HashSet<Character>res = ComonChars(str1,str2);
        System.out.println(res);
    }

}
