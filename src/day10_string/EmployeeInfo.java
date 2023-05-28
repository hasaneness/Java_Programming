package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*

	2. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name
	        2.2 Enter your age
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name
	        2.5 Enter your job title
	        2.6 Enter your salary

	        Display:
	            Employee's name
	            Employee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary

         */



        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name:");
        String company = input.nextLine();

        System.out.println("Enter your job title:");
        String title = input.nextLine();

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();


        System.out.println(name + "\n" + age +"\n" + gender + "\n" +company + "\n" + title + "\n" + salary);


        input.close();








    }


}
