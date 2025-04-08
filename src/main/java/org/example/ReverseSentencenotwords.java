public class ReverseSentencenotwords {
    public static void main(String[] args) {
        String Sentence = "today mau is very very cute qk mai galtiyan ni kr raha hai";
        String resultofSentence = ReverseSen(Sentence);
        System.out.println(resultofSentence);
        String[] splitString = resultofSentence.split(" ");
        ArrayList<String>finalString = ReverseWords(splitString);
        System.out.println(finalString);
        System.out.println(String.join(" ", finalString));

    }
    public static String ReverseSen(String Sen){
        StringBuilder sb = new StringBuilder();
        for(int i=Sen.length()-1; i>=0;i--){
            sb.append(Sen.charAt(i));
        }
        return sb.toString();
    }
    public static ArrayList<String>ReverseWords(String[] words){
        ArrayList<String>res = new ArrayList<>();
        for(int i=0; i<words.length;i++){
            res.add(ReverseSen(words[i]));
        }
        return res;
    }
}
