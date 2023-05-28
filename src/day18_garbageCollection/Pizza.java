package day18_garbageCollection;

public class Pizza {

    public char size;
    public int cheese, peperoni;

    // calculates the total cost of the pizza and returns as double
    public double calCost(){
        double totalPrice = 0;

        switch(size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 *(cheese + peperoni);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 *(cheese + peperoni);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 *(cheese + peperoni);
                break;

            default:
                System.out.println("Invalid size: " + size);
        }


        return totalPrice;
    }


    public void setInfo(char size, int cheese, int peperoni){
        this.size = size;
        this.cheese = cheese;
        this.peperoni = peperoni;
    }



    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", peperoni=" + peperoni +
                ", total price=" + calCost() +
                '}';
    }






}
