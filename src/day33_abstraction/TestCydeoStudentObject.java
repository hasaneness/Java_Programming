package day33_abstraction;

import day27_accessModifiers.CydeoStudent;

import java.time.LocalDate;

public class TestCydeoStudentObject {


    public static void main(String[] args) {

       CydeoDevStudent student1 = new CydeoDevStudent("Daniella", 'F', LocalDate.of(1986, 11,12),"A12", "zero to hero",28);


        System.out.println(student1);


        student1.eat();
        student1.sleep();
        student1.breath();




    }





}
