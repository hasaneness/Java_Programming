package day20_forEach;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char [] ch =str.replaceAll(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));


        System.out.println("----------------------------");


        String sentence = "I love java";

        String [] arr = sentence.split(" ");

        String reverse ="";

        for (int i =  arr.length; i <= 0; i++) {
            reverse += i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(reverse);







    }



}
