package day24_dataAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("java", "java", "java", "C#","rubby", "C#","rubby"));

        System.out.println(names);

      /*
       for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("java"))
                names.set(i, "python");
        }

        System.out.println(names);

        */

        Collections.replaceAll(names, "java", "Python");



        System.out.println( Collections.frequency(names,"C#"));

        System.out.println(names);

        System.out.println("----------------------");


        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,50,30,50,6,70,70,90,90,90));

        for (Integer each :num) {
            if (Collections.frequency(num, each) == 1){
                System.out.println(each);
        }

        }


        System.out.println("----------------------------");






    }



}
