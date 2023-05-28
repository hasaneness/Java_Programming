package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {



        int a1 = 2000;
        int b1 = 50;

        // System.out.println( a1 > b1);

        boolean aIsGreater = a1 > b1;

        System.out.println(aIsGreater);

        System.out.println("------------------");

        int score = 75;
        boolean passed = score >= 60;

        System.out.println(passed);

        System.out.println("----------------------");

        int age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        System.out.println("-----------------------");

        System.out.println( 100 >= 160 );

        System.out.println("-------------------------");

        score = 48;
        /*
         we have already declared the score under int variable so when we want to use the score one more time for a different number we have to update it just using "="
         */

        boolean failed = score < 60;

        System.out.println(failed);


        System.out.println("-----------------------");

        /*
        <,>,<=,>= can only be applicable for numbers. if a singer char is under ' this sign it will be consider as number ascii
         */

        System.out.println('a' > 'b');
        //                  65 > 66
        //                  false







    }



}
