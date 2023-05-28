package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {


        double salary = 60000;
        int creditScore = 650,
                age = 25;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);

        System.out.println("--------------------");

        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("---------------------");


        String answer ="maybe";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);

        /*
        || on this or operator false || false ------> false
                                true || false ------> true
                                false || true ------> true
                                true  || true ------> true

         */


        System.out.println("--------------------------------");


        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade =='B' || grade =='C' || grade =='D';

        System.out.println(passedTheExam);
        System.out.println(!true);

        System.out.println("-----------------------------------");

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);


        System.out.println("----------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("-------------------------------");










    }



}
