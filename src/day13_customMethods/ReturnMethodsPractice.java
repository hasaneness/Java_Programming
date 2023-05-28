package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {


        int num1 = 287;
        if (isOdd(num1)){
            System.out.println(num1 + " is even");
        }else{
            System.out.println(num1 + " is odd");
        }


        max(4,7);





    }


    public static boolean isOdd(int num1){

        //return ( num1 % 2 != 0)? true : false;

        if (num1 % 2 != 0){
            return true;
        }else{
            return false;
        }

    }


    public static int max ( int num1, int num2){
        if ( num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }


}
