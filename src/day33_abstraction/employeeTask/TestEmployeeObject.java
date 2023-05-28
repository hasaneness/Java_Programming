package day33_abstraction.employeeTask;

public class TestEmployeeObject {


    public static void main(String[] args) {

        //Employee employee1 = new Employee(....)
        // We can not create objects from abstract class, Object MUST be created from concrete class


        Teacher teacher = new Teacher("James",34,'M', "B56", "Math Teacher", 75000 );

        Developer developer = new Developer("Juanna", 30, 'M', "A35","Java Developer", 98000, "Java");

        Driver driver = new Driver("Aaron", 24, 'M',"A76","Uber Driver", 74000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);


        System.out.println("-------------------");

        teacher.work();
        developer.work();
        driver.work();



    }
}
