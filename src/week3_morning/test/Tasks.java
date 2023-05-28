package week3_morning.test;

public class Tasks {

    public static void main(String[] args) {


        /*
        Office Hours Topics:

    reviewing weeks 1 & 2:
    variables
    primitive datatypes
    concatenation
    operators
    single if & if else
        -> no multi branch today

* How to solve coding tasks?
    pseudo code: think about the steps to achieve the result/solve the task without writing any code. Once you have an idea of how you want to solve the problem then use the code statements to create that solution

    coding is a tool

----------------------------------------------------------------------------------------

T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables. Take the two numbers and perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
        ...

----------------------------------------------------------------------------------------

T2SumDigits [variables, arithmetic & shorthand operators]

    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

----------------------------------------------------------------------------------------

T3AnalyzeCode [unary operators, casting]

    - take a look at this given code and evaluate what the result is for each

    1)
        int a = 8;
        int b = a--;

        what is a?
        what is b?

    2) Take the given speed variable and think about which lines would need explicit casting(manually) and which ones are done implicitly(automatically)

        float speed = 20.5f;

        byte num1 = speed;
        short num2 = speed;
        int num3 = speed;
        long num4 = speed;
        float num5 = speed;
        double num6 = speed;

----------------------------------------------------------------------------------------

T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase

----------------------------------------------------------------------------------------

T5BuyHouse [variables, if statement, operators, logical & relational operators]

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



        double a = 5.9,
                b = 9.0;

       double multiply = a*b,
               add = a+b,
               extraction =a-b,
               divide = a/b,
               rem = a%b;


        System.out.println("multiply = " + multiply);
        System.out.println("add = " + add);
        System.out.println("extraction = " + extraction);
        System.out.println("divide = " + divide);
        System.out.println("rem = " + rem);


        System.out.println("-------------------------");


        System.out.println(a + " + " + b + " = " +  ( a + b));







    }


    public static class T2SumDigits {

        public static void main(String[] args) {

            /*
            T2SumDigits [variables, arithmetic & shorthand operators]

        Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

        Ex:
            input: 561
            output: 12
                -> 5 + 6 + 1 = 12

        Extra: Output the result in this format:
            The sum of the digits in $number is $sum
            ex: The sum of the digits in 561 is 12
             */


            int num = 562;

            if (num >= 100 && num <= 999){
                int firstDig = num % 10;
                int secondDig = ((num %100) - firstDig) / 10;
                int thirdDig = (num - (num % 100)) / 100;
                System.out.println(firstDig + secondDig + thirdDig);

            } else{
                System.out.println("Invalid Number");
            }







            /*
            T3AnalyzeCode [unary operators, casting]

    - take a look at this given code and evaluate what the result is for each

    1)
        int a = 8;
        int b = a--;

        what is a?
        what is b?

    2) Take the given speed variable and think about which lines would need explicit casting(manually) and which ones are done implicitly(automatically)

        float speed = 20.5f;

        byte num1 = speed;
        short num2 = speed;
        int num3 = speed;
        long num4 = speed;
        float num5 = speed;
        double num6 = speed;

             */




            int c = 10;
            System.out.println(c);
            int d = c-- + 5;

            System.out.println(c);

            System.out.println(d);







        }


    }
}
