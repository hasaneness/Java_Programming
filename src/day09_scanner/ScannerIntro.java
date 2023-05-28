package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //for reading user input

        System.out.println("Enter a number: ");
        byte num1 = input.nextByte();

        System.out.println("you entered: " + num1);

        System.out.println("Enter the second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter the third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your forth number: ");

        long num4 = input.nextLong();

        input.close();//scanner is closed, can not read user inputs again

        System.out.println("First number: " + num1);
        System.out.println("second number: " + num2);
        System.out.println("third number: " + num3);
        System.out.println("forth number: " + num4);







    }




}
