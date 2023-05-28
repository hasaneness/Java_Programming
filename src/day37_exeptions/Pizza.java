package day37_exeptions;

public class Pizza {


    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + numberOfCheeseTopping +
                ", peperoni=" + numberOfPepperoniTopping +
                ", total price=" + calCost() +
                '}';
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calCost(){
        double totalPrice = 0;

        switch(size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 *(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 *(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 *(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.out.println("Invalid size: " + size);
        }


        return totalPrice;
    }
}
