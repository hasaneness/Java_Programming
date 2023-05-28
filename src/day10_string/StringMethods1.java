package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);



        System.out.println("--------------------------");

        String s1 = "wooden spoon";

        char first = s1.charAt(0);

        int lastIndexNumber = s1.length() -1;

       // char last = s1.charAt(s1.length() -1);
        char last = s1.charAt(lastIndexNumber);
        System.out.println(last);

        // minimum number for index is 0


        System.out.println("----------------------------");

        String name1 = "umran";
        String name2 = new String("umran");

        System.out.println( name1 == name2 ); // it will give us a false because they were sored in different places ( name1 in String pool, name2 is out of string pool

        System.out.println(name1.equals(name2));// name1 and name2 has the same literals so when we use the equals operator we will get the TRUE output


        System.out.println("------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = input.nextInt();

        System.out.println("Are you a US citizen?yes/no");
        String answer = input.next();
        String x = "yes";

        if (age>=21 && answer.equals(x)){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("you are not eligible to vote");
        }








    }




}
