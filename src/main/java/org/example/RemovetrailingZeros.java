public class RemovetrailingZeros {
    public static void main(String[] args) {
        String str= "12340000";
        String res = trailingnzero(str);
        System.out.println(res);

    }
    public static String trailingnzero(String str){
        int i=str.length()-1;
        while(str.charAt(i)=='0'){
            i--;
        }
        return str.substring(0,i+1);
    }
}
