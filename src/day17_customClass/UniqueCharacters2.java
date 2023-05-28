package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {


        String str ="aaaaaabcccccccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }


            if (frequency == 1) { // if the frequency is one, then it's unique
                unique += ch;
            }

            System.out.println(unique);


        }



    }


}
