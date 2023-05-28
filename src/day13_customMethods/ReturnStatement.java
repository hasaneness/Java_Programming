package day13_customMethods;

public class ReturnStatement {


    public static void main(String[] args) {


        eligible(21);

        multiplication(4,7);
        System.out.println("test1 started");

        boolean exit = false;

        if (exit){
            return; //main method get terminated
        }

        System.out.println("Test1 completed");

        System.out.println("Test2 started");
    }

    public static void eligible( int age){

    if (age < 0 || age > 150){
        System.out.println("Invalid age: " + age);
        return;//exits the method
    }

    if (age >= 21 ){
        System.out.println("You are eligible to buy alcohol");
    }else{
        System.out.println("You are not eligible to buy alcohol");
    }

    }

    public static int multiplication ( int n1, int n2){

        int result = n1 * n2;

        return result; // returns the value when exiting the method
    }



}
