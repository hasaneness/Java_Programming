package day12_customMethods;

import java.util.Scanner;

public class EmailTask {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        System.out.println("Enter your email:");
        String email = input.nextLine();

        String firstName = email.substring(0, email.indexOf("_"));
        String lastNAme = email.substring(email.indexOf("_") +1,
                email.indexOf("@"));
        String url = email.substring(email.indexOf("@"));

        System.out.println(lastNAme + "_" +firstName  + url);





    }


}
