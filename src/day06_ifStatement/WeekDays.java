package day06_ifStatement;

public class WeekDays {
    public static void main(String[] args) {

        /*
        1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
Ex:
Given:
number = 1
output:
Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
         */



        int number = 6;

        String x= "";


        if (number ==1 ){
             x = "Monday";
        }

        if (number == 2){
            x = "tuesday";
        }

        if (number ==3){
            x = "Wednesday";
        }

        if (number == 4){
            x = "thursday";
        }


        if (number== 5){
            x = "friday";
        }

        if (number ==6){
            x = "saturday";
        }

        if (number == 7){
            x = "Sunday";
        }



        System.out.println(x);



    }


}
