package day31_inheritance.vehicleTask;

public class Vehicle {

    private String brand, model, color;
    private int year;
    private double price;


    // Child class' constructor should be different from parent class' because constructor name and class name should be same , however constructor that belong to the parent class has the same name with parent class
    public Vehicle(String brand, String model, String color, int year, double price) {
        setBrand(brand);
        setColor(color);
        setModel(model);
        setPrice(price);
        setYear(year);
        setPrice(price);
    }

    // if there is any restrictions for the constructor objects it will be better to use set methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
