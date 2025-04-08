public class FindMultipleOf5 {
    public static void main (String[] args){
        ArrayList<Integer>Values = new ArrayList<>(
                Arrays.asList(2, 5, 9, 59, 15, 35, 40, 27, 25)
        );
        ArrayList<Integer>Result = FindMultipleOf5(Values);
        System.out.println(Result);

    }

    public static ArrayList<Integer> FindMultipleOf5(ArrayList<Integer>Multipleof5){
        ArrayList<Integer> findMul = new ArrayList<Integer>();
        for (int i=0;i<Multipleof5.size();i++){
            if(Multipleof5.get(i)%5==0){
                findMul.add(Multipleof5.get(i));
            }
        }
        return findMul;
    }
}
