package day28_encapsulation.encapsulation;

public class Employee {



    private String name;
    private double salary;
    private int age;
    private String jobTitle;


    public Employee(String name, double salary, int age, String jobTitle) {
        setAge(age);
        setName(name);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 0 ){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }


    public String getName() {

        if(name == null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 16){
            System.out.println("Invalid age: " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }




}
