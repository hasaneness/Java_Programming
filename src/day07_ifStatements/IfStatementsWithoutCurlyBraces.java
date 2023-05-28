package day07_ifStatements;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if (age >= 21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }


        System.out.println("------------------");

        if (age >= 21) System.out.println("eligible");
        else System.out.println("not eligible");
        /*
        The only time that we can write without curly braces is if there is only one statement (code fragment)
         */


        int day = 5; //1 ~ 7

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if ( day == 5) System.out.println("friday");
        else if (day == 6) System.out.println("saturday");
        else System.out.println("sunday");


        // Always give the curly braces because that will be better for coding
        // IF STATEMENT WITHOUT CURLY BRACES IS NOT A GOOD PRACTICE






    }


}
