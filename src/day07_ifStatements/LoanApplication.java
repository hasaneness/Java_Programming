package day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {


/*
Warmup Tasks:
    1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */



        int salary = 100_000,
                creditScore = 650;
        String result = ""; // we have assigned an empty string value that will be used in the next code blocks "" is a temporary value



        if (salary >= 45000 && creditScore >= 700){
           // System.out.println("Eligible for a loan."); //instead of using print statement we can assign a new value to the string (String result)

            result = "Eligible for a loan.";

        } else {
           result = "Not eligible for a loan";
        }


        System.out.println(result);





    }


}
