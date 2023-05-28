package day34_abstraction.animal;

public class Dolphin extends Animal{
    public Dolphin(String name, String breed, char gender, int age, String size, String color, char gender1) {
        super(name, breed, gender, age, size, color, gender1);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+ getName()+ " is eating fish");
    }
}
