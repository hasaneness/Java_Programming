package day13_customMethods;

import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {

        calculate(34,78,'*');
        calculate(678 , 8990, '-');


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your two number and a math operator:");

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        char operator = input.next().charAt(0);

        calculate(n1 , n2, operator);



    }


    public static void calculate(double num1 , double num2 , char mathOperator ){

        double result = 0;

        switch(mathOperator){
            case '+':
               result= num1 + num2 ;
               break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;


            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println(" Invalid operator");

        }

        System.out.println( num1 + " " + mathOperator + " " + num2 + " = " +result);




    }




}
