package day24_dataAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person()};
        people[0].setInfo("Maria", 'M', LocalDate.of(1998,11,7),25);


        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll( Arrays.asList(people) );




    }



}
