package week5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number that you want to multiply: ");

        int num = input.nextInt();

        System.out.println("Enter the limit");
        int lim = input.nextInt();

        multiplication(num);

        System.out.println("--------------------");
        
        multiplication(num,lim);

    }


    public static void multiplication (int number){

        for (int i = 1; i <= 10 ; i++) {
            System.out.println( number + "*" + i + "=" + number * i);

        }

    }

    public static void multiplication (int number, int limit){

        for (int i = 1; i <= limit ; i++) {
            System.out.println( number + "*" + i + "=" + number * i);

        }

    }











}
