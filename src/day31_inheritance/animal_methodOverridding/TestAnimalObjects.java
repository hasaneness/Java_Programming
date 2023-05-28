package day31_inheritance.animal_methodOverridding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat =new Cat("Boncuk", "Street", 'F',2,"Medium", "White and Brown");


        Dog dog = new Dog("Rugh","Syberian",'M',4,"Large","White");


        Lion lion = new Lion("Ars", "African", 'F', 9,"Huge","Yellow", true);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);

        System.out.println("-----------------------------");


        cat.eat();
        dog.eat();
        lion.eat();


        System.out.println("-----------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();




    }




}
