package week2;

public class CellPhone {
    public static void main(String[] args) {


         /*
    CellPhone [variables, concatenation]

    Declare and assign the following variables:
        brand, model, color, price, storage, has camera, sim type (A, B, or C)

    Print out an advertisement post about the phone in this format:
        -> For extra practice also create this advertisement in a reusable way

        ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A
        the output would be:

        We have an brand new IPhone X from Apple
        It comes in the color Black and has 128GB memory
        It has a camera and operates with the "A" type sim
        Get your very own IPhone X for only $1200.99

         */


        String brand = "Apple",
                model = "IPhone X",
                color = "Black";
        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        char a = 'A',
                b = 'B',
                c = 'C';


        System.out.println("We have a brand new " + model + " from " + brand + "\n" + "It comes in the color" + color + " and has " + storage + "memory\n" + "It " + hasCamera + " and operates with the " + c + " type sim\n" + "Get your very own " + model + " for only $" + price);


        System.out.println("-------------------------------");

        brand = "Samsung";
        model = "x";
        color = "Blue";
        price = 999.50;
        storage = 64;
        hasCamera = false;
        b = 'B';




        System.out.println("We have a brand new " + model + " from " + brand + "\n" + "It comes in the color" + color + " and has " + storage + "memory\n" + "It " + hasCamera + " and operates with the " + c + " type sim\n" + "Get your very own " + model + " for only $" + price);







    }



}
