package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person{

    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public President(String name, int age, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, age, gender, DOB);
        setElectedDate(electedDate);
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName() + " is lying.");
    }


}
