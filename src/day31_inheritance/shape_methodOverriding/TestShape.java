package day31_inheritance.shape_methodOverriding;

public class TestShape {

    public static void main(String[] args) {

        Square square1 = new Square("square1", 10);

        System.out.println(square1);


        square1.draw();


        Circle circle = new Circle("Circle", 3.5);

        System.out.println(circle);

        circle.draw();





    }




}
