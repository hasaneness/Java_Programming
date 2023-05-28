package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.nextLine();

        System.out.println("Enter your password:");
        String pass = input.nextLine();

        if (username.equals("Cydeo") && pass.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter username");

                username = input.nextLine();

                System.out.println("Enter your password");
                pass = input.nextLine();


                if (username.equals("Cydeo") && pass.equals("WoodenSpoon")) {
                    System.out.println("Logged in");

                }
            }


            if (!(username.equals("Cydeo") && pass.equals("WoodenSpoon"))) {
                System.err.println("Your account locked.");
            }


        }


    }
}
