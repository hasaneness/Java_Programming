package day35_polymorphism.transportationProject;

import day33_abstraction.employeeTask.*;

public class PolymorphismPractice3 {

    public static void main(String[] args) {


        Employee [] employees = {
                new Developer( "Hamza", 32, 'M', "A01", "QA", 110000,"java"),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Developer("George", 28,'M', "A03", "SDET", 120000,"java"),
                new Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Developer("Cihad", 30, 'M',"A05", "SDET", 105000,"java"),
                new Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Developer("Nora",  28, 'F', "A07", "QE", 120000,"java"),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Developer("Tatiana",  25, 'F',"A09", "SDET", 130000,"java"),
                new Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Developer("Timur",  29, 'M',"A11", "SDET", 115000,"java"),
                new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan",  26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Developer("Nataliia",  24, 'F', "A13", "QE", 125000,"java"),
                new Developer("Ermek",  26, 'M',"A14", "Full Stack Developer", 142000, "Java"),
                new Developer("Khashayar",  30, 'M',"A15", "SDET", 105000,"java"),

        };


        // 1.Print the name and job title of every employee
        for (Employee each:employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }


        System.out.println("-------------------------");


        int countDeveloper = 0,
                countDriver = 0,
                countTeacher = 0;


        for (Employee each: employees) {

            if( each instanceof Developer){// if the employee is Developer
                countDeveloper++;
            }else if (each instanceof Driver){
                countDriver++;
            }else {
                countTeacher++;
            }

        }

        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countDriver = " + countDriver);
        System.out.println("countTeacher = " + countTeacher);


        System.out.println("------------------------");


        for (Employee each: employees){

            if(!(each instanceof Developer)){
                System.out.println(each.getName());
            }
        }








    }




}
