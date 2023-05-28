package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaabbbbbccccccc";

        String result = "";


        for (int j = 0; j < str.charAt(j); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if ( str.charAt(i) == ch){
                    count++;
                }

        }

            if (count == 2){
                result += ch;
            }


            System.out.println(result);




        }




    }



}
