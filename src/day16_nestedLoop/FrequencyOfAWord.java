package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfAWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text: ");

        String text = input.nextLine().toLowerCase();

        System.out.println("What do you want to look for: ");

        String word = input.nextLine();
        word = word.toLowerCase();



        int count = 0;

        while (text.contains(word)){
            count++;
            text.replace(word,"");

        }

        System.out.println(count);




    }


}
