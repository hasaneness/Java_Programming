package day24_dataAndTime;

import java.time.LocalDate;

public class LocalDateInfo {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1999,2,28);

        System.out.println(birthday);

        System.out.println("-----------------------");

        System.out.println( today.getYear());

        System.out.println( today.getMonth());

        System.out.println( today.getMonthValue());

        System.out.println( today.getDayOfWeek());

        System.out.println( today.getDayOfYear());

        System.out.println( today.getDayOfMonth());

        System.out.println("----------------------------");

        today.plusYears(1);

        System.out.println(today);

        today = today.plusYears(1); // to use this method we have to reassign the LocalDate object again

        System.out.println(today);


        System.out.println("---------------------------");

        LocalDate graduationDate = LocalDate.of(2023,8 ,25);

        graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("-------------------------");


        LocalDate yourBirthDay = LocalDate.of(2005, 06, 04);

        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(9).minusMonths(6).minusDays(1);


        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);


        System.out.println("--------------------------");

        LocalDate birthDay1 = LocalDate.of(2001, 3,17);
        LocalDate birthDay2 = LocalDate.of(2001, 3,17);

        boolean r1 = birthDay1.isEqual(birthDay2);

        System.out.println(r1);


        System.out.println("-------------------------");

        System.out.println( LocalDate.of(2022,6,4));








    }





}
