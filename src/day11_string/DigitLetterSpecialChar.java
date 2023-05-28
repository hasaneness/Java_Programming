package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {


    public static void main(String[] args) {

        /*
        3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();//Scanner input

        char x = word.charAt(0); // we will see the first character that was entered
        String msg = "";
   /*
        if (x >= 32 && x <=47){
            msg = "special character";
        } else if (x>=48 && x<=54) {
            msg = "digit";
        } else if (x>=65 && x<= 90) {
            msg = "Upper case letter";
        } else if (x>=97 && x<=122) {
            msg = "Lower case letter";
        }else {
            msg = "out of scope";
        }

        System.out.println(msg);


        */

        if (x>=1){


            if (x >= '1' && x<='9'){
                msg = "the first character is a number";
            } else if (x>= 'A' && x<='Z') {
                msg = "the first character is Uppercase";
            } else if (x>='a' && x<='z') {
                msg ="the first character is lowercase";
            }else{
                msg = "the first character is a special character";
            }


        }else{
            msg = "out of scope";
        }


        System.out.println(msg);






    }






}
