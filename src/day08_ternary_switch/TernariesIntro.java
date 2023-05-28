package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;

        String result = "";

        if (score >= 60){
            result= "passed";
        }else{
            result = "failed";
        }

        System.out.println(result);

        System.out.println("--------------------------");


        int score2 = 78;

        String result2 = (score2 >= 60)?"passed":"failed";

        System.out.println(result2);

        System.out.println("-----------------------------");

      /*

        int age = 34;

        String r ;

        if ( age >= 21){
            r = "Eligible";
        }else{
            r = "Not Eligible";
        }

        */

        int age = 34;
        String result3 = (age >= 21)?"Eligible": "not eligible";

        System.out.println(result3);







    }



}
