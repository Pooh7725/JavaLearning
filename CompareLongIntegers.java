public class CompareLongIntegers {
    public static void main(String[] args) {
        String str1 = "1234692872776262";
        String str2 = "000000000000000012346928727762200";
        boolean res = isEqual(removeLeadingZeros(str1),removeLeadingZeros(str2));
        System.out.println(res);
    }
    public static boolean isEqual(String str1 , String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static String removeLeadingZeros(String str){
        int i=0;
//        for( ;str.charAt(i)=='0';i++){
//
//        }
        while (str.charAt(i)=='0' ){
            i++;
        }
        return str.substring(i);
    }
}
