package day17_customClass;

public class Dog {

    public String name; // instance method
    public String color;
    public String breed;
    public char gender;
    public String size;
    public int age;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public void setInfo ( String name, String breed, char gender, int age, String size, String color){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this. size = size;
        this.color = color;

    }



}
