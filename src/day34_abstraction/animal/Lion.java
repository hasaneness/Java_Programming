package day34_abstraction.animal;

public class Lion extends Animal{
    public Lion(String name, String breed, char gender, int age, String size, String color, char gender1) {
        super(name, breed, gender, age, size, color, gender1);
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() +" is eating deer");
    }
}
