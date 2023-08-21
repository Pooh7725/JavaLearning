public class ArrayCube_Square {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter size of array");
        ArrayList<Integer> number = new ArrayList<>();
        Integer size = reader.nextInt();
        for (int i=0; i<size;i++){
            number.add(reader.nextInt());
        }

            }

    public static ArrayList<Integer>  Cube(ArrayList<Integer> CubeArray) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i =0; i<CubeArray.size();i++) {
            int result = CubeArray.get(i) * CubeArray.get(i) * CubeArray.get(i);
            array.add(result);
        }
       return array;


}

    public static class SquareArray {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            ArrayList<Integer> Input = new ArrayList<>();
            System.out.println("please Enter size of arraylist : ");
            Integer size = reader.nextInt();
            System.out.println("please Enter elements of array : ");
            for(int i=0;i<size;i++){

                Input.add(reader.nextInt());
            }
            ArrayList<Integer>Result = ArraySquare(Input);
            System.out.println(Result);
        }
        public static ArrayList<Integer> ArraySquare (ArrayList<Integer>Array){
           ArrayList<Integer> A = new ArrayList<>();
           for (int i = 0; i < Array.size(); i++) {
               A.add(Array.get(i)*Array.get(i));
           }
           return A;

        }
    }
}
