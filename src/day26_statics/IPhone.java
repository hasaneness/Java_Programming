package day26_statics;

public class IPhone {

    public static String brand = "apple";
    public String model, color;
    public double price;

    public static String OS = "iOS";

    public static String madeIn = "China";

    public IPhone(String model, String large, String black, int i) {
        this.model = model;
    }


    public IPhone(String model, String color) {
        this(model, "Large", "Black", 900);
        this.color = color;
    }

    public IPhone(String model, String color, double price) {
        this(model, color);
        this.price = price;
    }


    /*
    public static void printPhoneInfo(){ // static only accepts static
        System.out.println("Model" + model);
    }

*/


    // if we have instance variables we have to create instance method


    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", Made in=" + madeIn + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
