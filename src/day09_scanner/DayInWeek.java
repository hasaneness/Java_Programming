package day09_scanner;

import java.util.Scanner;

public class DayInWeek {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //it is for if we will use this variables for several times.if we need to use it only for one time we can write "new Scanner(System.in)"

        System.out.println("Enter the day number: ");
        //int num = new Scanner(System.in).nextInt();

        int num = input.nextInt();

        String day = "invalid";

        if (num >= 1 && num <=7){
            day =( num ==1 )?"Monday":(num == 2)?"Tuesday":(num == 3)?"thursday":(num ==4)?"wednesday":(num == 5)?"friday":(num == 6)?"saturday":"sunday";

        }else{
            day =" invalid";
        }


        System.out.println(day);


        input.close();













    }




}
