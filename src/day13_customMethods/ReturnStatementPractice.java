package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {


    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid){
            System.out.println("Invalid grade");
            return;
        }

        String result ="";

        if (grade == 'A'){
            result ="Excellent";
        }else{
            result ="Great job";
        }



    }


}
