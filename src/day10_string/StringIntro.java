package day10_string;

import java.util.Scanner;
import java.lang.String;
public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String a1 = "cat";
        String a2 = "dog";
        String a3 = "cat";
        String a4 = "cat";
        String a5 = new String("cat");
        String a6 = new String("cat");


        System.out.println( a1 == a2);//false
        System.out.println( a1 == a3);//true
        System.out.println( a3 == a4);//true
        System.out.println( a4 == a5);// false because they are different objects
        System.out.println( a5 == a6);//false they are independent strings in the heap (inside the heap, out of string pool)


    }


}
