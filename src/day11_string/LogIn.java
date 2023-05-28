package day11_string;

import java.util.Scanner;

public class LogIn {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        /*System.out.println("Hello welcome to Cydeo. Please enter your user name:");
        String userName = input.nextLine();

        System.out.println("Now, Enter your password:");

        String password = input.nextLine();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are now logged in");
        }else{
            System.out.println("Incorrect Username or password");
        }



         */



        String correctUserName = "Cydeo",
                correctPassword = "WoodenSpoon";

        System.out.println("Enter your username:");
        String username = input.nextLine();

        System.out.println("Enter your password:");
        String password = input.nextLine();

        input.close();

        if (username.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect Username or password");
        }






    }




}
