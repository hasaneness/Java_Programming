package day34_abstraction.animal;

public class Parrot extends Animal implements Flyable, Playable{

    public Parrot(String name, String breed, char gender, int age, String size, String color, char gender1) {
        super(name, breed, gender, age, size, color, gender1);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eating bird food");
    }


    @Override
    public void fly() {
        System.out.println("Parrot " + getName() + " can fly");
    }

    @Override
    public void play() {
        System.out.println("Parrot " + getName() + " is playing mocking game");
    }
}
