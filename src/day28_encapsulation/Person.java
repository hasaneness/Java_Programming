package day28_encapsulation;

public class Person {

    public String name, language;
    public int age;
    public char gender;
    public static boolean isHuman, hasNose;
    public static String planet;
    public static int numberOfWings, numberOfHead;


    public Person(String name) {// Allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    // Constructor must have the same name as the class name

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, String language, int age, char gender) {
        this(name, age, gender);
        this.language = language;
    }



    static{
        planet= "Earth";
        isHuman = true;
        hasNose= true;
        numberOfHead = 1;
        numberOfWings = 2;

    }


    public  static void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println( name + " is eating " + food);
    }

    public void drink ( String drink ){
        System.out.println( name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
