package day18_garbageCollection;


class Car {
    public String brand;
    public String model;
    public String color;


}



public class MemoryAllocation {

    public static void main(String[] args) {


        int a = 100; // stack


    }


    public static void method1(){

        int b = 100; // stack

    }


    public static void method2(){

        String c = "Hello World";
        // stack        heap(String pool)

        String d = new String( "Hello World");
        // stack         heap(outside of string pool)



    }






}
