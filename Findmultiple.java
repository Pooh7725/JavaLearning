public class Findmultiple {
    public static void main (String[] args){
        ArrayList<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(6);
        values.add(10);
        values.add(34);

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(4, 9, 0, 6, 4, 6, 2));

                ArrayList<Integer> Result= FindMultipleofThree(nums);
        System.out.println(Result);




    }
    public static ArrayList<Integer> FindMultipleofThree(ArrayList<Integer> Findmul){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =0;i<Findmul.size();i++){
            if(Findmul.get(i)%3==0){
                result.add(Findmul.get(i));
            }

        }
        return result;
    }
}
