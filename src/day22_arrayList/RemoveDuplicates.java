package day22_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("seummeye");
        names.add("seummeye");
        names.add("ali");
        names.add("seummeye");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each: names){

            if (nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);



        }

        System.out.println(nonDup);







    }




}
