package day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4,5};
        int [] arr2 = arr1;
        int [] arr3 = arr2;

        arr1[0]= 9;
        arr2[3]= 700;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println("---------------------");

        String [] a1 = {"umran", "mehmet"};
        a1 = new String[]{"james", "jonas"};
        a1[0]= "adam";



        System.out.println(Arrays.toString(a1));




    }




}
