package day27_accessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public Circle( double radius){
        this.radius = radius;
        diameter = radius *2;
    }

    /*  // there must have been static variables inside the static method
    public static double calcArea (){
        return radius * radius * pi;
    }

     */

    public double calcArea (){ // this is an instance method
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }


    public static void printPiValue(){
        System.out.println("PI value is : " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
