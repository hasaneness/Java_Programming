package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourly_rate = 55 ,
                weeklyHours = 45,
                stateTaxRate = 7, // implicit casting
                federalTaxRate = 24.5;
        //-----------------------------------

        double salaryBeforeTax = hourly_rate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * 7 /100;

        double federalTax = salaryBeforeTax * 24.5 / 100;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;



        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        System.out.println("-------------------------------");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\n" + "Federal tax is: $" + federalTax +
                "\n" + "State tax is: $" + stateTax +
                "\n" + "Total Tax is: $" + totalTax +
                "\n" + "Net income is: $" + salaryAfterTax);







    }





}
