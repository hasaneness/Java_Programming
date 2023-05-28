package day27_accessModifiers;

public class Car { // outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels =4;

    public class CarEngine{
        // this CarEngine class is correlated with Car class, so we create this class inside the car class --- Inner Class----Nested Class----

        // this class is not static so it is an instance of Car class. To access this inner class we need to access outer class first

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }

    public static class StaticInnerClass{

        public void method (){
            System.out.println(wheels);
        }
    }



}
