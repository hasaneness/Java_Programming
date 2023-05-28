package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("jonas", 28, 'M', LocalDate.of(1996,12,04),'A',"A101");

        President president = new President("Michael", 56, 'M',LocalDate.of(1980,9,13),LocalDate.of(2008,9,14));

        Teacher teacher = new Teacher("Kim", 45,'F',LocalDate.of(1994,6,9),"Math teacher","C049", 79000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();





    }



}
