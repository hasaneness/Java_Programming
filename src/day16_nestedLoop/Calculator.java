package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String answer = "yes";

        while(answer.equals("yes")) {

            System.out.println("Enter the first number");

            double first = input.nextDouble();

            System.out.println("Enter an math operator");
            char operator = input.next().charAt(0);

            System.out.println("Enter the second number");

            double second = input.nextDouble();

            double result= 0;


            while (!((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/'))) {
                System.err.println("Enter a valid math operator");
                operator = input.next().charAt(0);
            }

            switch (operator) {

                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;


            }


            System.out.println("Your result is " + result);

            System.out.println("Do you want to continue");

            answer = input.next().toLowerCase();

            while( ! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer! Would you like to continue? yes/no");
                answer= input.next().toLowerCase();
            }



        }




    }




}
