package day06_ifStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 1;

        String day = "";

        if (number == 1 || number == 3 || number ==5 || number == 7 ||number == 8 || number == 10 || number == 12){
            day = "31";
        }

        if (number ==4 || number == 6 || number == 9 || number ==11){
            day = "30";
        }

        if (number == 2){
            day ="28";
        }

        System.out.println(day);


    }


}
