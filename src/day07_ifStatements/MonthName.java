package day07_ifStatements;

public class MonthName {

    public static void main(String[] args) {

        /*
        1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)
Ex:
Given:
number = 10
output:
October
         */


        int number = 189;
        String result = "";

        if (number >=1 && number <=12){

            if (number == 1){
                result = "january";
            }else if (number == 2){
                result = "february";
            }else if (number == 3){
                result = "march";
            }else if (number == 4){
                result = "april";
            }else if (number == 5){
                result = "may";
            }else if (number == 6){
                result = "june";
            }else if (number == 7){
                result = "july";
            }else if (number == 8){
                result = "august";
            }else if (number == 9){
                result = "september";
            }else if (number == 10){
                result = "october";
            }else if (number == 11){
                result = "november";
            }else{
                result = "december";
            }


        }else{
            result = "Invalid";
        }


        System.out.println(result);






    }


}
