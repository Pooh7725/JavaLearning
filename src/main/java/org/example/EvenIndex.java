public class EvenIndex {
    public static void main(String[] args) {
        ArrayList<Integer> Input = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 8, 7));
        
    }
    public static ArrayList<Integer> Evenindex (ArrayList<Integer>Input){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<Input.size();i++ ){
            result.add(Input.get(i+2));
        }
        return result;
    }
}
