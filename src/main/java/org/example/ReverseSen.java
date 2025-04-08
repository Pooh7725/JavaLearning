public class ReverseSen {
    public static void main(String[] args) {
        String str = "anubhav is handsome";
        String res = rev(str);
        System.out.println(res);
        String[] split = res.split(" ");
        ArrayList<String> revsent = revwords(split);
        System.out.println(revsent);
        System.out.println(String.join(" ", revsent));
    }
    public static String rev(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1 ;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static ArrayList<String> revwords (String[] words){
        ArrayList<String>res = new ArrayList<>();
        for(int i=0; i< words.length;i++){
            res.add(rev(words[i]));
        }
        return res;
    }
