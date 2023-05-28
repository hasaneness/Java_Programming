package day25_constructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {


    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y EEE");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7, 26);

        System.out.println(date1.format(df));



        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(15,4);

        System.out.println(time1.format(tf));

        LocalTime time2 = LocalTime.now();

        System.out.println(time2.format(tf));

        System.out.println(time2);












    }



}
