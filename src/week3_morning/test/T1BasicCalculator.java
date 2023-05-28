package week3_morning.test;

import java.sql.SQLOutput;

public class T1BasicCalculator {
    public static void main(String[] args) {


        /*

T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables. Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
         */

        double num1 = 5;
        double num2 = 82;

        double addition = num1 + num2 ;

        System.out.println( num1 + " + " + num2 + " = " + addition);

        System.out.println( num1 + " + " + num2 + " = " + ( num1 + num2)); // if we use parentesis here java will calculate inside the brackets fist and then the rest.
        // if there is a text in the print statement then rest of the code will be seen as text as well

        // solution should be like this

        System.out.println( num1 + " + " + num2 + " = " + ( num1 + num2));
        System.out.println( num1 + " * " + num2 + " = " + ( num1 * num2));
        System.out.println( num1 + " - " + num2 + " = " + ( num1 - num2));
        System.out.println( num1 + " / " + num2 + " = " + ( num1 / num2));
        System.out.println( num1 + " % " + num2 + " = " + ( num1 % num2));


        System.out.println("-----------------------");
        System.out.println( 3 + 6);
        System.out.println(" 3 + 6 ");








    }


}
