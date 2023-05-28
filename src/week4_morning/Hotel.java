package week4_morning;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {



        /*
    Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:
		number of people: 1
		assigned to a single room
		price is: number of days staying * 100

		number of people: 2
		assigned to a double room
		price is: number of days staying * 125

		number of people: 3 or 4
		assigned to a large room
		price is: number of days staying * number of people * 50

		number of people: 5 or 6
		assigned to a suite
		price is: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size

     */

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome to the Java Hotel\nHow many days will you stay");
        int num_of_day = keyboard.nextInt();
        System.out.println("How many people are in your party");
        int num_of_people = keyboard.nextInt();

        double price= 0;
        String roomType ="";
        boolean is_valid = true;

        switch (num_of_people){
            case 1:
                roomType = "single room";
                price = num_of_day * 100;
                break;
            case 2:
                roomType = "double room";
                price = num_of_day * 125;
                break;
            case 3:
            case 4:
                roomType = "large room";
                price = num_of_day *num_of_people* 50;
                break;
            case 5:
                roomType = "suite";
                price = num_of_day * 1000;
                break;
            default:
                System.out.println("Sorry, " + num_of_people + " is not a valid group size");
                is_valid = false;
                break;



        }

        if (is_valid){
            System.out.println("Hello, for the " +num_of_people + " you have assigned to " + roomType + " for " + num_of_day + " days." + "so your total comes to $ " + price);
        }









    }





}
