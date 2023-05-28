package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person = new Person("Daniel", 'M', LocalDate.of(1996,12,04));

        System.out.println(person);


        System.out.println("----------------------");


        Employee employee = new Employee("Emily", 'F', LocalDate.of(2000,3,23), "Tester",90000);







    }


}
