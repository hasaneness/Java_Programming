package day09_scanner;

import java.util.Scanner;
public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("You entered: " + ch);

        System.out.println("Would you like to continue?");
       // String answer = input.next();// this input only print the first  word before the space

        String answer = input.nextLine(); // for the full line string

        System.out.println("Your answer is = " + answer);


        input.close();






    }





}
