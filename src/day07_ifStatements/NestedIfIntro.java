package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score = 678;


        if ( score >= 0 && score <= 100){




            if (score >= 60){
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }




        }else{
            System.out.println("Invalid Score");
        }


        System.out.println("-----------------------");


        int age = 45;

        if (age >0 && age <100){


            if (age >= 21 ){
                System.out.println("Eligible ");
            } else{
                System.out.println("Not Eligible");
            }

        }else{
            System.out.println("Error");
        }


        System.out.println("------------------------");


        int day = 9;
        String result = "";

        if (day >=1 && day <= 7){

            if (day == 1){
                result = "monday";
            } else if (day == 2) {
                result = "tuesday";
            }else if (day == 3) {
                result = "wednesday";
            }else if (day == 4) {
                result = "thursday";
            }else if (day == 5) {
                result = "friday";
            }else if (day == 6) {
                result = "saturday";
            }else {
                result= "sunday";
            }







        }else{
            result = "Invalid Day";
        }


        System.out.println(result);





    }

}
