package day09_scanner;

public class CrewAndPassenger {


    public static void main(String[] args) {



/*
1. Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.

                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid

                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */


        int  crew =20,
                passenger =50,
                total = crew + passenger;
        String result = "";

        if (total == 50 || total == 75 || total == 100){
            if (total == 50){
                result ="20 crew, 30 passenger";
            } else if (total == 75) {
                result = "25 crew, 50 passenger";
            } else{
                result = "30 crew, 70 passenger";
            }

        }else{
           result = "Not Valid";
        }

        System.out.println(result);

        System.out.println("---------------------------------");


        String result1 = (total == 50 || total == 75 || total == 100)?
                (total == 50) ? "20 crew, 30 passenger"
                        :( total == 75)? "25 crew, 50 passenger"
                        : "30 crew, 70 passenger"

                :"Not valid";

        System.out.println(result1);


        System.out.println("----------------------------------");


        String result2 = "";

        int total2 = 100;

        switch(total2){
            case 50:
                result2 = "20 crew, 30 passenger";
                break;

            case 75:
                result2 = "25 crew, 50 passenger";
                break;

            case 100:
                result2 = "30 crew, 70 passenger";

            default:
                result2 = "Not valid";
                break;


        }


        System.out.println(result2);






    }



}
