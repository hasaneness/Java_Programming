package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("sumeyye",27,'F', "Java Developer", 97000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("jonas",26, 'M', "Software Tester",104000, "A12");

        System.out.println(employee1);

        System.out.println(employee2);

        employee1.work();








    }


}
