public class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> Input = new ArrayList<>(Arrays.asList(40, 98, 45, 23));
        int maxNum = Max(Input);
        System.out.println(maxNum);
        System.out.println(" second Function result");
        ArrayList<Integer>input =new ArrayList<Integer>(Arrays.asList(2, 5, 1, 7 , 9, 0, -1));
        int min = Min(input);
        System.out.println(min);

    }

    public static int Max(ArrayList<Integer> Array) {
        int max = -1000;
        for (int i = 0; i < Array.size(); i++) {
            if (Array.get(i) > max) {
                max = Array.get(i);
            }

        }
        return max;

    }
    public static int Min(ArrayList<Integer>Array){
        int min = 100000;
        for(int i=0;i<Array.size();i++){
            if(Array.get(i)<min){
                min= Array.get(i);
            }
        }
        return min;
    }
}
