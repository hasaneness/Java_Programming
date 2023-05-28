package week6;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String add = "";
        String list = "";

        do {
            System.out.println("What item do you want to add to the list: ");
       //     String item = input.nextLine();
       //     list += item;

            list += "\n\t*" + input.nextLine();

            System.out.println("Do you want to add more items?  yes/no");
            add = input.nextLine();


            while ( !add.equalsIgnoreCase("yes") &&  !add.equalsIgnoreCase("no")){

                System.out.println("Sorry, did you want to add more items to the list");
                add = input.nextLine();
            }


        }while(add.equalsIgnoreCase("yes"));

        System.out.println(list);





    }


}
