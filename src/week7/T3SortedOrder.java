package week7;

import java.util.Scanner;

public class T3SortedOrder {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String entry1 =scan.nextLine();


        boolean finalResult= isSort(entry1);

        System.out.println("Result: " + finalResult);

    }


    public static boolean isSort (String input){

        boolean result= true;
        input = input.toLowerCase();

        for (int i = 0; i < input.length()-1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);

            if (current>next){
                result = false;
                break;
            }

        }




        return result;

    }









}
