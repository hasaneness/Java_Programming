package day09_scanner;

import java.util.Scanner;
public class EvenAndOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num = input.nextDouble();

        String result = "";
        double x = num %2;

        if (x == 0){
            result = "even";
        } else{
            result= "odd";
        }

        System.out.println(result);

        input.close(); // it is the closing statement







    }





}
