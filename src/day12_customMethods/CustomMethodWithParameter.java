package day12_customMethods;

import java.sql.SQLOutput;

public class CustomMethodWithParameter {

    public static void main(String[] args) {


        oddOrEven(7);
        eligibleToBuyAlcohol(26);

    }

    public static void oddOrEven(int num){


        if (num %2 == 0) {
            System.out.println(num + " even number");
        }else {
            System.out.println(num + " odd number");
        }



    }

    public static void eligibleToBuyAlcohol(int age){
        if (age >=21){
            System.out.println("You are eligible to buy");
        }else{
            System.out.println("You are not eligible to buy");
        }


    }



}
