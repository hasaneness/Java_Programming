package day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand, model, size, color;
    private double price;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        }else{
            System.out.println("Invalid color: " + color +"\n Color of the can only be: " +Arrays.toString(colors));
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price <= 0){
            System.out.println("Invalid price: " + price);
            System.exit(1);
        }

        this.price = price;
    }

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setColor(color);
        setModel(model);
        setPrice(price);
        setSize(size);
    }

    public void call (long phoneNumber){
        System.out.println( getModel()+ " is calling " + phoneNumber );
    }

    public void text (long phoneNumber){
        System.out.println( getModel()+ " is texting " + phoneNumber );
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
