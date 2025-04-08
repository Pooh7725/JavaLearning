public class FindIndex {
    public static void main(String[] args) {
        ArrayList<Integer>Input = new ArrayList<>(Arrays.asList(1, 78, 34, 90));
        int res = index(Input,48);
        System.out.println(res);

    }

    public static int index(ArrayList<Integer>input, int num){
        for(int i=0; i<input.size();i++){
            if((input.get(i))==num){
              return i ;
            }

        }
       return -1;
    }

}
