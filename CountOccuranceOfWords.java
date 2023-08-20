package HashsetAndHashmap;

import java.util.HashMap;

public class CountOccuranceOfWords {
    public static void main(String[] args) {
        String str= "anu poo poo anu papa";
        HashMap<String,Integer> map = new HashMap<>();
        int count = 1;
        String[]arr = str.split(" ");
        for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }

    }
        System.out.println(map);
    }
}
