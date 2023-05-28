package day08_ternary_switch;

import java.sql.SQLOutput;

public class TernaryIntro3 {

    public static void main(String[] args) {

       /* int score = 57;
        String result = "";


        if (score >= 0 && score <= 100){

            if (score >= 60){
                result = "passed";
            }else{
                result = "failed";
            }


        }else{
            result ="invalid";
        }


        System.out.println(result);


        System.out.println("----------------------");

        */

        //NESTED TERNARY
        int score = 74;

        String result = ( score >= 0 && score <= 100)?
                (score >= 60)?"Passed":"failed"
                : "Invalid";

        System.out.println(result);


        System.out.println("------------------------");

        int n = 4;


        String day = ( n > 0 && n <= 7)?
                (n ==1)? "monday" :(n == 2)? "tuesday" :( n == 3)? "wednesday" :(n == 4)? "thursday" :( n == 5)? "friday" :(n == 6)? "saturday" : "sunday"

                : "Invalid";

        System.out.println(day);




    }


}
