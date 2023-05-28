package week3_morning.test;

public class T5BuyHouse {

    public static void main(String[] args) {

        /*
        5BuyHouse [variables, if statement, operators, logical & relational operators]

    Create a program that will define two variables: credit score and salary
    Use the given information to determine if you are eligible for a loan to buy a new house
    here are the criteria for eligibility:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above

    Output:
        if you are eligible because you meet one of the above conditions:
            Start packing because you are eligible for this loan!
        if you are not eligible:
            Sorry we cannot offer a loan to you at this given time
         */

        int creditScore = 720;
        int salary = 300_000;

        if ((creditScore >= 720 && salary >= 100_000) || (creditScore >= 740 && salary >= 80_000) ) {
            System.out.println(" Start packing because you are eligible for this loan!");
        } else {
            System.err.println("Sorry we cannot offer a loan to you at this given time");
        }



}

    }

