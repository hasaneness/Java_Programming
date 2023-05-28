package week4_morning;

public class T5HouseMarket {

    public static void main(String[] args) {

        /*
        T5HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhoods.

	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes

         */


        String name = "Hills";
        int average_price= 0;
        double rating= 4.0;
        boolean gated= false;
        boolean allow_pets = true;


        switch (name){

            case "Hills":
                average_price = 89000;
                rating = 4.0;
                gated= true;
                allow_pets = true;
                break;

            case "Oaks":
                average_price = 75000;
                rating = 3.5;
                gated= false;
                allow_pets = true;
                break;

            case "Highland":
                average_price = 150000;
                rating = 4.5;
                gated= true;
                allow_pets = false;
                break;

            case "Canyon":
                average_price = 201000;
                rating = 4.8;
                gated= true;
                allow_pets = true;
                break;

            default:
                System.out.println("does not exist");
                break;

        }

        System.out.println("the houses in the " + name +" on average value at " +  average_price + " This neighborhood is " + (gated? "gated": " not gated") + "and the rating of the school distracts near by is " +  rating + "out of 5. For the pet owners you " + (allow_pets? "are" :"are not")  +   "in luck because pets are ");













    }



}
