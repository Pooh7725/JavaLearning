public class Takeinput {
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         ArrayList<Integer> takeNum = new ArrayList<Integer>();
         System.out.println("Please enter the size of array");
         Integer arraySize = reader.nextInt();
         System.out.println("Please enter the " + arraySize + " elements of array");
         for(int i=0;i<arraySize;i++){
             takeNum.add(reader.nextInt());
         }

         ArrayList<Integer>result = FindevenNum(takeNum);
         System.out.println(result);

            }
public static ArrayList<Integer>FindevenNum(ArrayList<Integer>FindEven){
         ArrayList<Integer>num = new ArrayList<>();
         for(int i=0;i<FindEven.size();i++){
             if(FindEven.get(i)%2==0){
                 num.add(FindEven.get(i));
             }
         }
         return num;
}
