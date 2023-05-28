package day08_ternary_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {


        int number = -100;

        String result = (number > 0)?"positive":(number  < 0) ?"negative": "zero";

        System.out.println(result);


        System.out.println("-----------------------");

        int n = 5;

        String day = ( n == 1)? "monday":( n == 2)? "tuesday":( n == 3)?"wednesday":( n == 4 )?"thursday":( n == 5)? "friday":( n == 6)? "saturday":"sunday";
        System.out.println(day);


        System.out.println("--------------------------");

        int num = 6;

        String month = (num ==1)?"january":(num == 2)?"february":(num == 3)?"march":(num ==4)?"april":(num == 5)?"may":(num ==6)?"june":(num ==7 )?"july":(num == 8)?"august":(num == 9)?"september":( num ==10)?"october":(num == 11)?"november":"december";

        System.out.println(month);





    }



}
