package week5;

import java.util.Scanner;

public class T5Angles {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first angle: ");

        int firstNum = input.nextInt();

        System.out.println("Please enter your second angle: ");

        int secondNum = input.nextInt();

        System.out.println("Please enter your third angle: ");

        int thirdNum = input.nextInt();


        int sum = firstNum + secondNum + thirdNum;

        if (sum == 180){
            System.out.println("Triangle");
        } else if (sum == 360) {
            System.out.println("Square");
        } else {
            System.out.println("Can not determine");
        }


    }

}
