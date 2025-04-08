public class copyArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter the size of Array : ");
        Integer size = reader.nextInt();
        ArrayList<Integer> Input = new ArrayList<>();
        System.out.println("Please Enter the Elements of Array : ");
        for (int i=0;i<size;i++){
            Input.add(reader.nextInt());

        }
        System.out.println("Elements of original array");
        System.out.println(Input);
        ArrayList<Integer>copy = arraycopy(Input);
        System.out.println("Elements of reversed array");
        System.out.println(copy);
    }
    public static ArrayList<Integer> arraycopy(ArrayList<Integer>Array){
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=Array.size()-1 ; i>=0; i--){
            A.add(Array.get(i));
        }
        return A;
    }
}
