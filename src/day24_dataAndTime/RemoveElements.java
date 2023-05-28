package day24_dataAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


        // WRONG SOLUTION
        for (int i = 0; i < num.size(); i++) {
            if ( num.get(i) < 4 ){
                num.remove(i);
            }
        }
        System.out.println(num);

        System.out.println("-------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf( p -> p < 4);
        System.out.println(list2);





/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */


        System.out.println("--------------------------");


        ArrayList<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("john", "jack", "michael", "ionna"));


        names.removeIf( each -> each.startsWith("j"));

        System.out.println(names);






    }




}
