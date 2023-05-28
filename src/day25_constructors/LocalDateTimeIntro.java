package day25_constructors;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime end = LocalDateTime.of(2017,5,24,11,56,43);

        System.out.println(end);

        System.out.println(LocalDateTime.of(2017,5,24,11,56,43));






    }






}
