package week4_morning;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String name =input.nextLine();
        name = name.toLowerCase();
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex +1);

        System.out.println(firstName);

        System.out.println(lastName);

        String initial = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();
        System.out.println(initial);





    }


}
