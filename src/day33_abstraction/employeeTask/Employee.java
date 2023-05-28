package day33_abstraction.employeeTask;

public abstract class Employee {// it is only for providing reusable variables and methods

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setAge(age);
        setGender(gender);
        setId(id);
        setName(name);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public abstract void work();// abstract method (uncompleted method)


    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
