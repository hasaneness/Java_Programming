package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        /*
         3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

Single if: for one condition
         */


        int income = 100_000;
        double taxRate = 0;
        boolean married = true;





        if (income < 80_000){
             taxRate = 0.2;
        }

        if (income >= 80_000 && income < 100_000){
             taxRate = 0.25;
        }

        if (income >= 100_000 && income <130_000){
            taxRate = 0.3;
        }

        if (income >= 130_000){
            taxRate = 0.35;
        }


        if (married){
            taxRate -= 0.05;
        }

        double totalTax = income * taxRate;

        double incomeAfterTax = income - totalTax;

        System.out.println(incomeAfterTax);





    }


}
