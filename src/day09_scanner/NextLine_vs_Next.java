package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // it will take out the Enter that was left at the scanner

        System.out.println("Enter your full name:");

        String full_name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);

        input.close();








    }




}
