package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int num = new Scanner (System.in).nextInt();

        if (num < 1 || num >7){
            System.err.println("Invalid number: " + num);
            return;
        }

        System.out.println( (num ==1 )? "monday" :(num==2)?"tuesday" :(num ==3)?"wednesday" :(num==4)?"thursday" :(num==5)? "friday":(num ==6)?"saturday":"sunday");




    }



}
