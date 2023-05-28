package day21_multiDimentionalArray1;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "     Hello world         I        love   java   ";

        str = str.trim();

        String [] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for ( String each : words){
            if (!each.isEmpty()){
                str += each + " ";
            }
        }

        System.out.println(str);







    }


}
