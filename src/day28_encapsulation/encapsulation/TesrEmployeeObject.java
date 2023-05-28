package day28_encapsulation.encapsulation;

public class TesrEmployeeObject {

    public static void main(String[] args) {

        /*Employee employee1 = new Employee();
        //employee1.salary = -100000;

        employee1.setSalary(200000);

        System.out.println(employee1.getSalary());

         */

        Employee employee1 = new Employee("Jonas", 79000, 27,"Tester");

        System.out.println(employee1);



    }



}
