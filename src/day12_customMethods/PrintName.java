package day12_customMethods;

import java.util.Scanner;

public class PrintName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = input.nextLine().trim().replace(" ", "");

        System.out.println("Enter your last name");

        String lastName = input.nextLine().trim().replace(" ", "");

        input.close();

        String lowerFirstName = firstName.toLowerCase();
        String lowerLastName = lastName.toLowerCase();

        System.out.println(  lowerFirstName.substring(0,1).toUpperCase() + lowerFirstName.substring(1)
        + " " + lowerLastName.substring(0,1).toUpperCase() +
                lowerLastName.substring(1) );







    }



}
