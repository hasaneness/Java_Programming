package day35_polymorphism.transportationProject;

import day34_abstraction.animal.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane " +getMake()+ " " + getMake() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake() +" "+ getModel() + " is flying");
    }
}
