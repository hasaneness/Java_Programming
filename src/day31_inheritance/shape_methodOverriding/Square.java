package day31_inheritance.shape_methodOverriding;

public class Square  extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");
        for (int i = 0; i <4 ; i++) {
            System.out.println("\t*         *");
        }
        System.out.println("\t* * * * * *");
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
