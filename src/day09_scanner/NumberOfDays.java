package day09_scanner;

public class NumberOfDays {


    public static void main(String[] args) {


        /*

    2. Create a class named NumberOfDays. An integer variable named month is given
        Use switch statement to write a program that can find the number of days in the given number of month.

                EX:
                    month = 5

                output:
                    31 days

                (Assume that February has 28 days)

            Hints:
            	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
         */


        int month = 15;
        int days = 30;


        switch (month){
            case 1 :
                days =31;
                break;

            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days =31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;

            default:
                System.out.println("Error");
                break;




        }


        System.out.println(days);


        System.out.println("-----------------------------------");



        int month2 = 15;
        String result = "";


        switch (month2){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12:
                result ="31 days";
                break;

            case 2:
                result = "28 days";
                break;

            case 4: case 6: case 9: case 11:
                result = "30 days";
                break;

            default:
                result = "Error";
                break;




        }


        System.out.println(result);








    }


}
