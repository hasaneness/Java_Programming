package day08_ternary_switch;

public class Elevator {

    public static void main(String[] args) {

        /*
        1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
         */



        int floorNumber = 2;
        String result= "Floor " +  floorNumber + " selected. Companies";

        String companyNames = "";

        if (floorNumber >= 1 && floorNumber<=3){


            if (floorNumber == 1){
                companyNames = "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2){
                companyNames =" Cydeo, NASA, Intelsat";
            } else {
                companyNames = "Lyft, BofA, Stake house";
            }


        }else{
            result = "Floor does not exist";
        }


        System.out.println(result + companyNames);






    }



}
