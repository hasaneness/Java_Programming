package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, LocalDate DOB, String jobTitle, String employeeID, double salary) {
        super(name, age, gender, DOB, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching.");
    }


}
