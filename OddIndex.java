public class OddIndex {
    public static void main(String[] args) {
        ArrayList<Integer>input = new ArrayList<>(Arrays.asList(1, 4, 6, 9, 3, 23, 56, 78));
        ArrayList<Integer>res = IndexOdd(input);
        System.out.println(res);

    }
    public static ArrayList<Integer>IndexOdd(ArrayList<Integer>Array){
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=1; i<Array.size();i=i+2){
            res.add(Array.get(i));
        }
        return res;
    }
}
