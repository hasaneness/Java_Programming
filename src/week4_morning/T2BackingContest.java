package week4_morning;

public class T2BackingContest {

    public static void main(String[] args) {


        double judge1 = 0 , judge2 = 0, judge3 = 0;
        double myScore = ( judge1 + judge2 + judge3)/3;

        double person1 = 8.5, person2 = 7.6;
        String result ="";

        if (myScore > person1 && myScore> person2){
            result = "first";
        } else if (myScore< person1 && myScore< person2) {
            result = "third";
        } else {
            result = "second";
        }


        System.out.println("Congratulations you earned " + result + " place with a score of: " + myScore);





    }



}
