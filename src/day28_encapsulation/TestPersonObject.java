package day28_encapsulation;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Ahmed");

        Person person2 = new Person( "Hasan", 'M');

        Person person3 = new Person( "Joanna", 30);

        Person person4 = new Person("Jonas","English");


        person3.name = "Kim"; // name was an INSTANCE variable so when I change the name for person3 it effected only for this object

        person2.planet = "Mars"; // planet was STATIC variable so even if we change it for person2 it has changed all objects
        // HOWEVER correct way of changing planet variable is Person.planet ="Mars";



        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Person.printPlanetName();





    }


}
