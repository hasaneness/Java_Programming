package week5;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your target currency");

        String crncy = input.nextLine();

        System.out.println("Enter the amount that you want to convert");
        double amount = input.nextDouble();

        System.out.println(convertFromDollar(crncy, amount));



    }

    public static double convertFromDollar ( String currency , double dollars){

        double result = 0;

        switch (currency.toLowerCase().trim()){


            case "euro":
                result = dollars * 0.91;
                break;

            case "yen":
                result = dollars * 121.03 ;
                break;

            case "lira":
                result = dollars * 14.85;
                break;

            case "won":
                result = dollars * 1217.52;
                break;

            case "rupee":
                result = dollars * 181.45;
                break;

        }

        return result;


    }



}
