package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        Employee e1 = new Employee("jonas", 26, 'M', "Tester", 98000, LocalDate.of(2020,3,23));

        Employee e2 = new Employee("Ali", 34, 'M', "Software Developer", 12000, LocalDate.of(2019,5,12));

        System.out.println(e1);
        System.out.println(e2);





    }




}
