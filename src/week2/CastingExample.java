package week2;

public class CastingExample {
    public static void main(String[] args) {

        int i = 30;
        long l = i;


        long l2 = 100; //100 is int, int is smaller than long, so no problems, it will automatically go to long for variable
/*
        byte d3 = 15.99;
        int i3 = (int)d3;

        System.out.println(i3);
 */


        int i4 = 1_000_000;
        byte b4 = (byte)i4;// the byte can not hold this big number, there is a data loss
        System.out.println(b4); // the result is based on some calculation

        //float f5 = 10.23; // trying to store a double into a float

        float f5 = 10.23f;
        int i5 = (int)f5; //when we convert float to an int number we will loose the fraction part // meaning that it will be "10"
        System.out.println((double)i5); // when printing an into number in the form of double we will see "10.0"


        char letter = 66; // char is only able to print single character but even if when we write a number instead we still get a resul because it transfers it into ASCII equivalent
        System.out.println(letter);

        System.out.println("-----------------------");

        System.out.println(3 % 5 ); // 3 can not be divisible evenly by 5, so the leftover is just 3


        int a = 5;
        a = a +2; // shorthand : a +=2; instead of reassign a number ve can use this shorthand


        /*
        Q: What is the difference between == and =?
        = is the assignment operator
        == is to  compare the values and return boolean

        4 == 4 ->true
        4 != 5 ->true
         */


    }



}
