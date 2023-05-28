package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = input.nextLine();

        str = text;

        char ch ='c';

        int count = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch){
                count ++;
            }


        }

        if (count >0){
            System.out.println("The number of " +ch + " is " + count);
        }else {
            System.out.println(" Character is not available ");
        }





    }



}
