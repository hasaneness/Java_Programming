package day13_customMethods;

public class ageGroup {

    public static void main(String[] args) {

       ageLimit(3);

       vote(27, false);

    }

    public static void ageLimit( int age){

        if (age < 21){
            System.out.println("Teenager");
        }else if ( age >=21 && age <=55){
            System.out.println("Adult");
        }else if (age> 55 && age<=100) {
            System.out.println("Senior");
        }else {
            System.out.println("Out of scope");
        }



    }


    public static void vote( int age1 , boolean isAmerican){

        if (age1 >= 21 && isAmerican == true){
            System.out.println("Eligible to vote");
        }else {
            System.err.println(" Not eligible to vote");
        }

    }



}

