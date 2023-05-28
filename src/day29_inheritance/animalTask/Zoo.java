package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", "stray", 'F', 3,"Medium", "Black and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("shah", "Bengal", 'M', 6,"Large", "Yellow");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-------------------------");

        dog.eat();
        dog.drink();
        dog.sleep();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        dog.bark();
        cat.meow();
        cat.scratch();
        tiger.hunt();




    }



}
