package day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two words:");
        String w1 = input.nextLine();
        String w2 = input.nextLine();

        input.close();

        int w1Length = w1.length();
        int w2Length = w2.length();

        if (w1Length > w2Length){
            System.out.println("The longest one is " + w1);
        } else if (w1Length < w2Length) {
            System.out.println("The longest one is " + w2);
        }else {
            System.out.println(w1 +" and " +w2 + "Equal");
        }


    }



}
