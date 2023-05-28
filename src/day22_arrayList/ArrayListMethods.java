package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        System.out.println("--------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("ali");
        studentList.add("john");
        studentList.add("jack");
        studentList.add("tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);


        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get(studentList.size()-1);

        System.out.println(firstStudent);

        System.out.println(lastStudent);


        System.out.println("-------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4
        numbers.add(60); //5

        numbers.remove(5);

        numbers.remove(Integer.valueOf(20));


        System.out.println(numbers);


        numbers.clear();

        System.out.println(numbers);

        System.out.println("----------------------------");


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("seummeye");
        names.add("seummeye");
        names.add("ali");
        names.add("seummeye");


        System.out.println( names.indexOf("Vasyl"));

        System.out.println( names.lastIndexOf("Vasyl"));

        System.out.println( names.lastIndexOf("seummeye"));










    }



}
