public class ReverseSentenceWordByWord {
    public static void main(String[] args) {
        String str = "I Lob u too";
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        for(int i=split.length-1; i>0 ;i--){
            sb.append(split[i]);
            sb.append(" ");
        }
        sb.append(split[0]);
        System.out.println(sb.toString());
    }
}
