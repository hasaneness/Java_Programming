package utilities;

public class StringUtility {


    public static String reverse (String str){
        String reverse= "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    }



    public static int frequency (String sentence, String word){
        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count ++;
        }
        return count;
    }









}
