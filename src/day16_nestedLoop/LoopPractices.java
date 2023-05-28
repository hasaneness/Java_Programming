package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + i);// outside of this block int i is not reachable
        }

        System.out.println("---------------");

        int j = 0;
        while(j < 5){
            System.out.println("Hello World" + j);
            j++;
        }


        System.out.println("------------------");


        int k = 0;

        do {
            System.out.println("Hello World" + k);
            k++;
        }while ( k <5);


        // Those gives us the same result

        System.out.println("------------------------");

        Scanner input = new Scanner( System.in);

        System.out.println("Enter your grade: ");
        int score = input.nextInt();

        while( score > 100 || score < 0){
            System.out.println("Invalid Score. Please re-enter your score");
            score = input.nextInt();
        }

        if ( score >= 60 ){
            System.out.println("Success");
        }else {
            System.out.println("Failed");
        }



    }




}
