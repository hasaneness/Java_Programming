package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {


    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);

        if(getAge() < 18){
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }

        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }
    // After the constructor gets executed - means after object created - we can not can not change the final variable

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }


    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        }else{ // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \n No such a batch in Cydeo");
        }
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<= 0){
            System.err.println("Invalid batch number");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }





}
