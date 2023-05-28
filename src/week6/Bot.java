package week6;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean run = true;
        System.out.println("Hello, I am the Cydeo chat bot");

        while(run){

            System.out.println("> ");
            String userInput = input.nextLine().toLowerCase().trim();

            switch(userInput){
                case "holla":
                case "hello":
                    System.out.println("World");
                    break;

                case "what is your age":
                    System.out.println("I was programmed in March");
                    break;

                case "what can we talk about":
                    System.out.println("I will respond to these: \n\twhat is your age? \n\twho created you\n\toff");
                    break;

                case "who created you":
                    System.out.println(" I was created by Enes");
                    break;

                case "off":
                    System.out.println("hahaha you cannot turn me off. I am invincible");
                    break;

                case "shutdown":
                    System.out.println("SHUTTING DOWN");
                    run = false;
                    break;

                default:
                    System.out.println("Sorry, I cannot compute that");


            }





        }










    }




}
