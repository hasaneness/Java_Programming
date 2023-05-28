package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number:");
        int month =input.nextInt();


     if (month < 1 || month > 12){
         System.out.println("Invalid month");
         return;
     }

     String result ="";

     switch (month){
         case 1:
             result ="january";
             break;
         case 2:
             result ="february";
             break;
         case 3:
             result ="march";
             break;
         case 4:
             result ="april";
             break;
         case 5:
             result ="may";
             break;
         case 6:
             result ="june";
             break;
         case 7:
             result ="july";
             break;
         case 8:
             result ="august";
             break;
         case 9:
             result ="september";
             break;
         case 10:
             result ="october";
             break;
         case 11:
             result ="november";
             break;
         case 12:
             result ="december";
             break;

     }


        System.out.println(result);


    }

}
