package week6;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text");
        String str = input.nextLine().toLowerCase();




        String cat = "cat";
        String dog = "dog";
        int catCount = 0;
        int dogCount = 0;


        while (str.contains("cat")) {
            if(str.contains("cat")){
            catCount++;
            str.replaceFirst("dog", "");
            break;}


        }

        while (str.contains("dog")) {
            if (str.contains("dog")){
            dogCount++;
            str.replaceFirst("dog", "");
            break;}
        }

        System.out.println("cat: " + catCount);
        System.out.println("dog: " + dogCount);

    }

}