package day34_abstraction.animal;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, String size, String color, char gender1) {
        super(name, breed, gender, age, size, color, gender1);
    }


    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }


    @Override
    public void play() {
        System.out.println("Dog "+ getName() + " is playing fetch");
    }
}
