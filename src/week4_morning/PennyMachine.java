package week4_morning;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PennyMachine {

    public static void main(String[] args) {

        /*
     PennyMachine [scanner, if, operators]

    Create a program that will ask the user to enter the number of pennies they have. Use the number of cents they give and convert them to dollars, quarters, dimes, nickles, and left over pennies. This machine can only handle from 1-1200 cents at a type

    -> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

    -> if the cents are valid print the result in the following format:
        $initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

    Extra challenge: If there is 0 of a specific type do not include it in the final output

     */


        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your cents");
        int cents = input.nextInt();
        System.out.println(cents);
        int dollars, quarters, nickles, dimes, pennies;

        String msg = cents + " was converted to ";

        dollars = cents / 100; //245 /100 cent---> 2 dollars
        cents %= 100;   // rest is 45 cent
        quarters = cents / 25; // 45/25 cent -------> 1 quarters
        cents %= 25;           // 20 cent rest
        dimes = cents / 10;    // 20/10 cent -------> 2 dimes
        cents %= 10;           // 20 %10 cent 0 cent rest
        nickles = cents /5 ;
        cents %= 5; // it will be equal to the rest of the pennies
        pennies = cents /1;


        msg += dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, " + pennies + " pennies";

        System.out.println(msg);

    }







}
