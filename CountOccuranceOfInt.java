import java.util.HashMap;

public class CountOccuranceOfInt {
    public static void main(String[] args) {


    int[] A = {1, 9, 1, 8, 99, 1, 99};
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i< A.length;i++){
        if(!map.containsKey(A[i])) {
            map.put(A[i], 1);
        }
        else{
            map.put(A[i] , map.get(A[i])+1);
        }
    }
        System.out.println(map);
}
    }
