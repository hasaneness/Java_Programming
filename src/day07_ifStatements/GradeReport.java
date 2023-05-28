package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
        1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
         */

        int score = 78;
        String result = "Your grade is ";

        if (score >= 90){
            result += "A";
        } else if (score >= 80 ) { // && score <90 => no need, it is default
            result += "B";
        } else if (score >= 70 ) { // && score <80 => no need, it is default
            result += "C";
        } else if (score >= 60 ) { // there is no need to add "&& score <70" because in multibranch if statements to be executed this line upper lines should not work
            result +="D";
        } else {
            result += "F";
        }


        System.out.println(result);


        System.out.println("-------------------");












    }


}
