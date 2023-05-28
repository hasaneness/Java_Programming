package day34_abstraction.carTask;

public class TestCarObject {

    public static void main(String[] args) {

        Audi  audi = new Audi("Audi", "A5","White",2008,26000);

        Honda honda = new Honda("Honda", "Civic", "Blue",2009,3000);

        Tesla tesla = new Tesla("Tesla", "Model x", "Black", 2020, 49000);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        System.out.println("---------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();




    }


}
