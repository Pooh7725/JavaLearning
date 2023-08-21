public class StringArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter size of an array : ");
        Integer size = reader.nextInt();
        System.out.println("Please Enter Elements of an array : ");
        ArrayList<String>Names = new ArrayList<>();
        for(int i=0;i<size;i++){
            Names.add(reader.next());
        }
        ArrayList<String > ArrayResult = StringArray(Names);
        System.out.println(ArrayResult);
    }
    public static ArrayList<String>StringArray(ArrayList<String>names){
        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i< names.size();i++){
            result.add(names.get(i));
        }
        return result;
    }
}
