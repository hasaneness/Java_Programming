package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
         Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
         */

        System.out.println("Split or not?(Yes or No");

        String yesNo = input.next().toLowerCase().trim().replace(" ", "");

        System.out.println("Enter the number of people");

        int people = input.nextInt();

        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");

        String rate = input.next().trim().toLowerCase().replace(" ", "");

        double tip = 0;

        if (yesNo.equals("yes")) {

            switch (rate) {
                case "excellent":
                    tip = 0.25;
                    break;

                case "great":
                    tip = 0.2;
                    break;

                case "good":
                    tip = 0.15;
                    break;

                case "fair":
                    tip = 0.10;
                    break;

                case "poor":
                    tip = 0.05;
                    break;

            }

        }


        double total = amount + amount*tip;

        System.out.println("Number of people that entered: " + people );
        System.out.println("Total to pay: " + total);
        System.out.println("Total tip: " + amount * tip);
        System.out.println("Total per person: " +total/people);
        System.out.println("Tip per person: " + (amount*tip)/people);








    }


}
