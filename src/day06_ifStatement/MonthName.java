package day06_ifStatement;

public class MonthName {

    public static void main(String[] args) {

        /*
        1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents
Ex:
Given:
number = 10
output:
October
         */

        int number = 2;

        String month = "";

        if (number == 1){
            month = "January";
        }

        if (number == 2){
            month = "February";
        }

        if (number == 3){
            month = "march";
        }

        if (number == 4){
            month = "april";
        }

        if (number == 5){
            month = "may";
        }


        System.out.println(month);







    }



}
