package day34_abstraction.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color, char gender1) {
        super(name, breed, gender, age, size, color, gender1);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eating cat food");
    }
}
