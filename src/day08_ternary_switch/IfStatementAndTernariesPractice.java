package day08_ternary_switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {


        int score = 67;
        String result = "";


        if (score >= 0 && score <= 100){

            result = (score >= 90)? "A" :(score >= 80)? "B":(score >= 70)? "C": (score >= 60)? "D" : "F";


        }else{
            result ="Invalid Score";
        }

        System.out.println(result);

        // It is a mix of ternary and if statement, so it is much more readable







    }




}
