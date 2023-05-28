package day29_inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("joseph","Cydeo", 29,'M','A');

        System.out.println(student1);

        student1.setSchoolName("Harvard");

        System.out.println(student1);


    }




}
