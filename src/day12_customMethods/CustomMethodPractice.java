package day12_customMethods;

import java.util.Scanner;

public class CustomMethodPractice {

    public static void main(String[] args) {

        int numb = 3000;
        CustomMethodWithParameter.oddOrEven(numb);


        maxNum(24,89);
        maxNum(98.56,10936.8);

        initial("hasan","isler");
        initial("jorden","karianne");




    }

    public static void maxNum(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1 + " is the max number");
        } else if (num2 > num1) {
            System.out.println(num2 + "is the max number");
        }else{
            System.out.println(num1 + " and " + num2 + " is equal");
        }



    }

    public static void initial(String name1, String name2){
     String initial = name1.toUpperCase().charAt(0) +"." +  name2.toUpperCase().charAt(0);
        System.out.println("initial is " + initial);

    }





}
