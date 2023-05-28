package day14_forLoop;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        String str3 = combine("enes", "sueda");

        System.out.println(str3);



    }


    public static String combine(  String str1, String str2) {

        String result = " ";
/*
        if (str1.endsWith("" + str2.charAt(0))) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

*/

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }
        System.out.println(result);

        return result;

    }

}
