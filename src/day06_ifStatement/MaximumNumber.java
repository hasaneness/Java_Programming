package day06_ifStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1= 67;
        int num2= 89;

        boolean x = num1 > num2;
        boolean y = !x;
        boolean z = num1 == num2;

        if (z){
            System.out.println("Equal");
        }



        if (!z){

            if (x){
            System.out.println(num1 + " is the maximum number.");
        }


            if (y){
                System.out.println(num2 + " is the maximum number.");
            }


        }


        System.out.println("-------------------------------");

        if (num1 > num2 ){
            System.out.println(num1 +" is the maximum number.");
        }
        if (num2 > num1 ){
            System.out.println(num2 + " is the maximum number.");
        }

        if (num1 == num2 ) {
            System.out.println("Equal");
        }





    }


}
