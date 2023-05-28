package day06_ifStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 97;
        double divisibilityBy2 = number % 2;
        boolean x = divisibilityBy2 == 0;

        double divisibilityBy3 = number % 3;
        boolean y = divisibilityBy3 == 0;

        double divisibilityBy5 = number % 5;
        boolean z = divisibilityBy5 == 0;


        System.out.println( number + " is divisible by 2: " + x +"\n" + number +" is divisible by 3: " + y + "\n" + number + " is divisible by 5: " + z);

        System.out.println("------------------------------");







    }




}
