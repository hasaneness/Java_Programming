package day19_array;

import java.util.Arrays;

public class ArrayLiterals {


    public static void main(String[] args) {


        int [] number = new int[5];

        int [] num ={10, 20, 30, 40, 50};

        System.out.println(number.length);
        System.out.println(num.length);

        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));


        System.out.println("-----------------------");

        String [] month = {"jan", "feb","march","apr","may","may","jun","jul","aug","sep","oct","nov","dec"};
        System.out.println("moth = " + Arrays.toString(month));

        System.out.println("-------------------------");

        for (int i = month.length -1; i >= 0 ; i--) {
            System.out.println(month[i]);
        }






    }




}
