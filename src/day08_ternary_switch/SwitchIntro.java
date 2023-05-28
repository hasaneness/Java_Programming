package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {




        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        char grade = 'Q';

        String result;

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;


            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

                // break is needed for exiting the switch

            default:
                System.out.println("Invalid");

                // we can place default block anywhere
                /*
                lets say we place it after first case block then we assign an invalid char , like "Q", default block gets executed but due to lack of break statement after default block the code will continue to get executed

                so if we  dont place the default block very end it will be better to add break statement after default


                 */

        }








    }



}
