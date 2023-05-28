package week4_morning;

import java.util.Scanner;

public class ModifyWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length() -1); // last index: str.length() -1


        String middle =word.substring(1, word.length() -1);


        if(first == last){ // we use  == because we are comparing the char types
            System.out.println(middle);
        } else {
            System.out.println("#" + middle +"*");
        }






    }




}
