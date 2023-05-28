package day32_finalKeyword.carTask_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;
    public static int numberOfWheels;
    public static boolean hasBattery;

    public Car(String make, String model, String color, int year, double price) {
        setMake(make);
        setColor(color);
        setModel(model);
        setPrice(price);
        setYear(year);
    }

    static {
        numberOfWheels = 4;
        hasBattery = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0){
            System.out.println("Invalid Year: " +year+" Year can not be negative or zero");
            System.exit(1); // terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<= 0){
            System.out.println("Invalid price: " + price);
            System.exit(1); // terminates the program
        }
        this.price = price;
    }



    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start" + make + " "+ model);
    }


    @Override
    public String toString() {
        return  make+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
