package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FuatPractice {

    public static void main(String[] args) {

        Scanner hasan= new Scanner(System.in);

        System.out.println("Your name: ");
        String name = hasan.next();



        Scanner fuat = new Scanner(System.in);

        System.out.println("Your age: ");
        int age = fuat.nextInt();
        System.out.println(age);


        Scanner tax = new Scanner(System.in);

        System.out.println("driver licence");
        boolean driver = tax.hasNextBoolean();


        Scanner gen = new Scanner(System.in);
        System.out.println("Gender: ");
        char gender = gen.next().charAt(0);


        Scanner ayak = new Scanner(System.in);
        System.out.println("Shoe size");

        double a = ayak.nextDouble();





        System.out.println(name);
        System.out.println(age);
        if( driver == true){
            System.out.println("he has a driver licence");
        }else{
            System.out.println("she washes the dishes");
        }
        System.out.println(gender);
        System.out.println(a);



    }



}
