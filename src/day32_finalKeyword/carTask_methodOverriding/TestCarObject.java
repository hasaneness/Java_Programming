package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObject {

    public static void main(String[] args) {


        Toyota toyota = new Toyota("Toyota", "Camry","Black",2023, 35000);

        Honda honda = new Honda("Honda", "Accord","White", 2006, 12000);

        Tesla tesla = new Tesla("Tesla", "Model X", "Red",2020, 56000);


        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(tesla);


        System.out.println("-----------------------------------");


        toyota.start();
        honda.start();
        tesla.start();

        System.out.println("-------------------------------------");


        tesla.setPrice(90000);

        System.out.println(tesla);








    }



}
