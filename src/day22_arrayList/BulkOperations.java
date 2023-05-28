package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {


    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers); // to the list1 after element 3 numbers arraylist will be added

        System.out.println(list1);

        System.out.println("---------------------");


        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,457, 69, 80));


        System.out.println(scores);

        System.out.println("------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("jonas", "jack", "hasan", "mehmet"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("abdullah", "mustafa", "faruk"));

        System.out.println(students);


        System.out.println("-----------------------");

        Integer [] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        //l1.addAll( Arrays.asList(nums) );

        System.out.println(l1);


        System.out.println("---------------------");


        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll( Arrays.asList("Aleyna", "Ahmet", "asli", "asuman"));


        System.out.println(employeeList);


        boolean hasAleyna = employeeList.contains("Aleyna");

        boolean hasAleynaAhmet = employeeList.containsAll(Arrays.asList("Aleyna","Ahmet"));


        System.out.println("hasAleyna = " + hasAleyna);

        System.out.println("hasAleynaAhmet = " + hasAleynaAhmet);

        System.out.println("----------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 10, 20, 30, 40, 40, 50, 60, 60, 70 ));

        list.removeAll(Arrays.asList(10,20));


        System.out.println(list);

        System.out.println("-----------------------");


        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Aleyna", "Ahmet", "asli", "asuman"));

        System.out.println(developers);

        developers.retainAll(Arrays.asList("Aleyna", "asli"));

        System.out.println(developers);

        System.out.println("------------------------");


        ArrayList<String > groceriesList = new ArrayList<>();

        groceriesList.addAll( Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry"));

        groceriesList.retainAll(Arrays.asList("Milk", "Eggs"));

        System.out.println(groceriesList);

        System.out.println("---------------------");



    }



}
