package week7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class T1ColorPicker {

    public static void main(String[] args) {

        pickColor();




    }

    public static void pickColor() {

        Scanner scan = new Scanner(System.in);
        boolean flag= true;
        String answers = "";
        int times = 1;

        while (flag){  // we created an infinite loop
            System.out.println("Enter color "+ times);
            String answer = scan.nextLine(); // scanner
            if (!answers.contains(answer)){ // we are checking if the new entry is same with previous one if not we are adding the new one to the list
                answers+= answer + ", ";
                System.out.println(answer + " added");
                times ++; // upgrading the scanner counter
            } else {
                System.out.println(answer + " is already selected. Please chose a different color");


            }


            if( times == 4){
                flag = false;
            }


            System.out.println("Here is the colors that you chose :" + answers);


        }



    }


}
