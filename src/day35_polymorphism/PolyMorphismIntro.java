package day35_polymorphism;


import day34_abstraction.animal.*;

public class PolyMorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("max", "Husky",'M', 2,"Large","White", 'M');

        Cat cat = new Cat("max", "Husky",'M', 2,"Large","White", 'M');

        Eagle eagle = null;

        Parrot parrot = null;
        Dolphin dolphin = null;



        Animal [] animals = {dog, cat, eagle, parrot, dolphin};




    }


}
