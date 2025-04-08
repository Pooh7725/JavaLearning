public class SubstractArray {
    public static void main(String[] args) {
        ArrayList<Integer>Arr = new ArrayList<>(Arrays.asList());
        System.out.println("before substracting Array");
        System.out.println(Arr);
        ArrayList<Integer>Res = Substract(Arr);
        System.out.println("After substracting Array");
        System.out.println(Res);

    }
    public static ArrayList<Integer>Substract(ArrayList<Integer>Array){
        ArrayList<Integer>res = new ArrayList<>();
        for (int i=0;i<Array.size();i++){
            res.add(Array.get(i)-1);

        }
        return res;
    }
}
